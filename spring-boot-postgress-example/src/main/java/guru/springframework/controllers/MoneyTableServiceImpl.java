package guru.springframework.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.common.collect.TreeBasedTable;

@Service
public class MoneyTableServiceImpl implements MoneyTableService {

	@Override
	public List<MoneyCell> createDefaults(Set<String> rowKeys, String columnKey, BigDecimal value) {
		List<MoneyCell> monies = new ArrayList<MoneyCell>();
		for (String rowKey : rowKeys) {
			MoneyCell moneyCell = new MoneyCell();
			moneyCell.setRowKey(rowKey);
			moneyCell.setColumnKey(columnKey);
			moneyCell.setValue(value);
			monies.add(moneyCell);
		}
		return monies;
	}

	@Override
	public List<MoneyCell> filterMoneyCellsByRowIds(List<MoneyCell> moneys, Set<String> rowIds) {
		List<MoneyCell> filteredAccounts = moneys.stream().filter(x -> rowIds.contains(x.getRowKey()))
				.collect(Collectors.toList());
		return filteredAccounts;

	}

	@Override
	public List<MoneyCell> replaceRowKeys(List<MoneyCell> moneys, Map<String, String> rowIdMap) {
		for (MoneyCell money : moneys) {
			String mappedVal = rowIdMap.get(money.getRowKey());
			if (mappedVal != null) {
				money.setRowKey(mappedVal);
			}
		}
		return moneys;
	}

	@Override
	public MoneyTable createMoneyTableFromList(List<MoneyCell> moneyCells) {
		MoneyTable moneyTable = new MoneyTable();
		Table<String, String, MoneyCell> table = listToTree(moneyCells);
		moneyTable.setTable(table);
		moneyTable.setRowTotals(getRowTotal(table));
		moneyTable.setColumnTotals(getColumnTotal(table));
		moneyTable.setGrandTotal(getGrandTotal(moneyTable.getRowTotals()));

		return moneyTable;
	}

	public MoneyTable createMoneyTable(Table<String, String, MoneyCell> table) {
		MoneyTable moneyTable = new MoneyTable();
		moneyTable.setTable(table);
		moneyTable.setRowTotals(getRowTotal(table));
		moneyTable.setColumnTotals(getColumnTotal(table));
		return moneyTable;
	}

	public Table<String, String, MoneyCell> listToTree(List<MoneyCell> moneyCells) {
		Table<String, String, MoneyCell> table = Tables.newCustomTable(new LinkedHashMap<>(), LinkedHashMap::new);
		for (MoneyCell moneyCell : moneyCells) {
			MoneyCell existingMoneyCell = getNewBalance(table, moneyCell);
			table.put(moneyCell.getRowKey(), moneyCell.getColumnKey(), existingMoneyCell);
		}
		return table;
	}

	public Table<String, String, MoneyCell> initialise(List<String> rowKeys, String columnKey, MoneyCell value) {
		Table<String, String, MoneyCell> table = TreeBasedTable.create();
		for (String rowKey : rowKeys) {
			table.put(rowKey, columnKey, value);
		}
		return table;
	}

	public Map<String, MoneyCell> getRowTotal(Table<String, String, MoneyCell> table) {
		Set<String> rowKeys = table.rowKeySet();
		Map<String, MoneyCell> rowTotals = new HashMap<String, MoneyCell>();
		for (String rowKey : rowKeys) {
			MoneyCell total = new MoneyCell();
			Collection<MoneyCell> values = table.rowMap().get(rowKey).values();
			for (MoneyCell value : values) {
				total.setValue(total.getValue().add(value.getValue()));
			}

			rowTotals.put(rowKey, total);
		}
		return rowTotals;
	}

	public Map<String, MoneyCell> getColumnTotal(Table<String, String, MoneyCell> table) {
		Set<String> columnKeys = table.columnKeySet();
		Map<String, MoneyCell> columnTotals = new HashMap<String, MoneyCell>();
		for (String columnKey : columnKeys) {
			MoneyCell total = new MoneyCell();
			Collection<MoneyCell> values = table.columnMap().get(columnKey).values();
			for (MoneyCell value : values) {
				total.setValue(total.getValue().add(value.getValue()));
			}
			columnTotals.put(columnKey, total);
		}
		return columnTotals;
	}

	public MoneyCell getGrandTotal(Map<String, MoneyCell> totals) {
		MoneyCell moneyCell = new MoneyCell();
		moneyCell.setValue(totals.values().stream().map(x -> x.getValue()).reduce(BigDecimal.ZERO, BigDecimal::add));
		return moneyCell;
	}

	private MoneyCell getNewBalance(Table<String, String, MoneyCell> table, MoneyCell moneyCell) {
		MoneyCell existingMoneyCell = table.get(moneyCell.getRowKey(), moneyCell.getColumnKey());
		if (existingMoneyCell == null) {
			existingMoneyCell = new MoneyCell();
		}
		existingMoneyCell.setValue(existingMoneyCell.getValue());
		existingMoneyCell.setValue(existingMoneyCell.getValue().add(moneyCell.getValue()));
		return existingMoneyCell;
	}
}
