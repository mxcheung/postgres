package guru.springframework.controllers;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Table;


public class MoneyTable  {

	Table<String, String, MoneyCell> table;

	Map<String, MoneyCell> rowTotals;
	
	Map<String, MoneyCell> columnTotals;
	
	MoneyCell grandTotal;

	public Table<String, String, MoneyCell> getTable() {
		return table;
	}

	public void setTable(Table<String, String, MoneyCell> table) {
		this.table = table;
	}

	public Map<String, MoneyCell> getRowTotals() {
		return rowTotals;
	}

	public void setRowTotals(Map<String, MoneyCell> rowTotals) {
		this.rowTotals = rowTotals;
	}

	public Map<String, MoneyCell> getColumnTotals() {
		return columnTotals;
	}

	public void setColumnTotals(Map<String, MoneyCell> columnTotals) {
		this.columnTotals = columnTotals;
	}
	
	
	public Set<String> getRowHeaders() {		
		return table.rowKeySet();
	}

	public Set<String> getColumnHeaders() {		
		return table.columnKeySet();
	}

	public MoneyCell getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(MoneyCell grandTotal) {
		this.grandTotal = grandTotal;
	}
	
}
