package guru.springframework.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MoneyTableService {

	List<MoneyCell> createDefaults(Set<String> rowKeys, String columnKey, BigDecimal value);

	List<MoneyCell> filterMoneyCellsByRowIds(List<MoneyCell> moneys, Set<String> rowIds);

	MoneyTable createMoneyTableFromList(List<MoneyCell> moneyCells);

	List<MoneyCell> replaceRowKeys(List<MoneyCell> moneys, Map<String, String> rowIdMap);


}
