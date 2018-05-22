package guru.springframework.controllers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.domain.ReferenceValue;

@Service
public class ReportCashBalanceServiceImpl implements ReportCashBalanceService {

	private static final String CASH_REPORT_ACCT_GROUP_PARENT = "CASH_REPORT_ACCT_GROUP_PARENT";
	private static final String CASH_REPORT_CURRENCY = "CASH_REPORT_CURRENCY";
	private static final String CURRENCY_REF_TYPE_KEY = "CURRENCY";

	private static final String CASH_REPORT_ACCT_GROUP_MAP = "CASH_REPORT_ACCT_GROUP_MAP";



	@Autowired
	private MoneyTableService tableService;

	@Autowired
	private ReferenceDataService referenceDataService;

	@Override
	public AccountCashBalanceSummary getAccountCashBalanceSummary() {
		Set<String> accounts = new LinkedHashSet<String>();
		accounts.add("APAC");
		accounts.add("AACB");
		accounts.add("AABSG");
		accounts.add("AABNL");
		
		LocalDate startDate = LocalDate.of(2018, 2, 28);
		LocalDate endDate = LocalDate.of(2018, 3, 1);
		Map<String, String> accountGroupMap = getAccountGroupMap();

		Map<String, Set<String>> parentMap = getParentGroupFromDB();

		LocalDate exchangeRateDate = LocalDate.of(2018, 5, 10);

	
		List<ReferenceValue> allCurrencies = referenceDataService
				.getReferenceDataByReferenceType(CURRENCY_REF_TYPE_KEY);


		Double rate = Double.valueOf("0.75");
		BigDecimal dollar = BigDecimal.TEN;
		BigDecimal newdollar = dollar.multiply(BigDecimal.valueOf(rate));


		AccountCashBalanceSummary accountCashBalanceSummary = new AccountCashBalanceSummary();


		return accountCashBalanceSummary;
	}

	private Map<String, MoneyTable> getMoneyBag(List<MoneyCell> allMonies, Set<String> accounts, LocalDate endDate,
			Optional<String> exchangeCCY) {
		Map<String, MoneyTable> cashBalanceMap = new HashMap<>();
		String suffix = exchangeCCY.isPresent() ? exchangeCCY.get() : "";
		for (String account : accounts) {

			cashBalanceMap.put(account + suffix, getMoneyTable(account, allMonies));
		}

		return cashBalanceMap;
	}

	private MoneyTable getMoneyTable(String groupName, List<MoneyCell> allMonies) {
		Set<String> accounts = getParentGroup(groupName);
		List<MoneyCell> groupMonies = tableService.createDefaults(accounts, "AUD", BigDecimal.ZERO);
		List<MoneyCell> filteredMonies = tableService.filterMoneyCellsByRowIds(allMonies, accounts);
		groupMonies.addAll(filteredMonies);
		MoneyTable moneyTable = tableService.createMoneyTableFromList(groupMonies);
		return moneyTable;
	}

	private Set<String> getCcyFromDB() {
		List<ReferenceValue> refValues = referenceDataService.getReferenceDataByReferenceType(CASH_REPORT_CURRENCY);

		Set<String> values = new LinkedHashSet<String>();
		for (ReferenceValue refValue : refValues) {
			values = new LinkedHashSet<String>();
			String accountValues = refValue.getValue();
			List<String> accountValuesList = new ArrayList<String>(Arrays.asList(accountValues.split(",")));
			for (String item : accountValuesList) {
				values.add(item.replace("\"", "").trim());
			}

		}
		return values;

	}

	private Map<String, String> getAccountMapFromDB() {
		List<ReferenceValue> refValues = referenceDataService.getReferenceDataByReferenceType(CASH_REPORT_ACCT_GROUP_MAP);
		Map<String, String> parentMap = new HashMap<String, String>();
		for (ReferenceValue refValue : refValues) {
			parentMap.put(refValue.getKey(), refValue.getValue());
		}

		return parentMap;
	}

	private Map<String, Set<String>> getParentGroupFromDB() {
		List<ReferenceValue> refValues = referenceDataService.getReferenceDataByReferenceType(CASH_REPORT_ACCT_GROUP_PARENT);
		Map<String, Set<String>> parentMap = new HashMap<String, Set<String>>();
		for (ReferenceValue refValue : refValues) {
			String accountValues = refValue.getValue();
			List<String> accountValuesList = new ArrayList<String>(Arrays.asList(accountValues.split(",")));
			Set<String> values = new LinkedHashSet<String>();
			for (String item : accountValuesList) {
				values.add(item.replace("\"", "").trim());
			}

			parentMap.put(refValue.getKey(), values);

		}

		return parentMap;
	}

	private Set<String> getParentGroup(String groupName) {
		Map<String, Set<String>> parentMap = new HashMap<String, Set<String>>();
		parentMap = getParentGroupFromDB();
		Set<String> val = parentMap.get(groupName);
		if (val == null) {
			val = parentMap.get(groupName);
		}
		return parentMap.get(groupName);
	}

	private Map<String, String> getAccountGroupMap() {

		Map<String, String> accountGroupMap = getAccountMapFromDB();

		return accountGroupMap;
	}

	private Set<String> getParentGroupStatic(String groupName) {
		Map<String, Set<String>> parentMap = new HashMap<String, Set<String>>();
		parentMap.put("APAC",
				Stream.of("ANZ House ac", "Citi Client ac", "Citi House ac", "HSBC Client ac", "HSBC House ac",
						"Mizuho House ac", "BAML House ac", "NAB Money Market", "HSBK HK Money Market",
						"HSBK SG Money Market", "AACS", "AACHK", "ANZ AU HOUSE")
						.collect(Collectors.toCollection(LinkedHashSet::new)));
		parentMap.put("AACB", Stream.of("AAB CB Other O/N", "AAB CB Other Time Deposit")
				.collect(Collectors.toCollection(LinkedHashSet::new)));
		parentMap.put("AABSG", Stream.of("AAB SG Other O/N", "AAB SG Other Time Deposit")
				.collect(Collectors.toCollection(LinkedHashSet::new)));
		parentMap.put("AABNL", Stream.of("AAB NL Other O/N", "AAB NL Other Time Deposit")
				.collect(Collectors.toCollection(LinkedHashSet::new)));

		Set<String> val = parentMap.get(groupName);
		if (val == null) {
			val = parentMap.get(groupName);
		}
		return parentMap.get(groupName);
	}

	private Map<String, String> getAccountGroupStaticMap() {
		Map<String, String> accountGroupMap = new HashMap<String, String>();
		accountGroupMap.put("ANZ AU House", "ANZ House ac");
		accountGroupMap.put("Citi AU House", "Citi House ac");
		accountGroupMap.put("Citi JP House", "Citi House ac");
		accountGroupMap.put("Citi SG House", "Citi House ac");
		accountGroupMap.put("Citi HK House", "Citi House ac");
		accountGroupMap.put("Citi SG Client", "Citi Client ac");
		accountGroupMap.put("BAML SG House", "BAML House ac");
		accountGroupMap.put("HSBC HK House", "HSBC House ac");
		accountGroupMap.put("HSBC SG House", "HSBC House ac");
		accountGroupMap.put("HSBC SG Client", "HSBC Client ac");
		accountGroupMap.put("Mizuho JP House", "Mizuho House ac");
		accountGroupMap.put("AACB Amsterdam", "AAB CB Other O/N");
		accountGroupMap.put("AACHK", "AAB SG Other O/N");
		accountGroupMap.put("AACS", "AAB NL Other O/N");
		return accountGroupMap;
	}


}