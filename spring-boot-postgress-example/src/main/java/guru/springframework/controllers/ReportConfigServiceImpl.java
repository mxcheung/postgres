package guru.springframework.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.domain.ReferenceValue;

@Service
public class ReportConfigServiceImpl implements ReportConfigService {

	private static final String CASH_REPORT_ACCT_GROUP_MAP = "CASH_REPORT_ACCT_GROUP_MAP";

	private static final String CASH_REPORT_ACCT_GROUP_PARENT = "CASH_REPORT_ACCT_GROUP_PARENT";
	private static final String CASH_REPORT_CURRENCY = "CASH_REPORT_CURRENCY";

	@Autowired
	private ReferenceDataService referenceDataService;

	private ReportConfig reportConfig;

	@Override
	public ReportConfig getReportConfig() {
		reportConfig = new ReportConfig();
		reportConfig.setCashBalanceAccounts(getReferenceOrderedSets(CASH_REPORT_ACCT_GROUP_PARENT));
		reportConfig.setCashBalanceAccountGroupMap(getReferenceMap(CASH_REPORT_ACCT_GROUP_MAP));
		reportConfig.setCashBalanceCurrencies(getReferenceOrderedSet(CASH_REPORT_CURRENCY));
		return reportConfig;
	}

	private Map<String, Set<String>> getReferenceOrderedSets(String refType) {
		List<ReferenceValue> refValues = referenceDataService.getReferenceDataByReferenceType(refType);
		Map<String, Set<String>> parentMap = new HashMap<String, Set<String>>();
		refValues.forEach(refValue -> {
			parentMap.put(refValue.getKey(), csvStringToSet(refValue.getValue()));
		});
		return parentMap;
	}

	private Set<String> getReferenceOrderedSet(String refType) {
		Set<String> orderSet = getReferenceOrderedSets(refType).values().stream().findFirst().get();
		return orderSet;
	}

	private Set<String> csvStringToSet(String input) {
		String cleansedString = input.replace("\"", "");
		Set<String> orderedSet = Stream.of(cleansedString).map(w -> w.split(",")).flatMap(Arrays::stream)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		return orderedSet;
	}

	private Map<String, String> getReferenceMap(String refType) {
		List<ReferenceValue> refValues = referenceDataService.getReferenceDataByReferenceType(refType);
		return refValues.stream().collect(Collectors.toMap(ReferenceValue::getKey, ReferenceValue::getValue));
	}

}
