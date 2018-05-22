package guru.springframework.controllers;

import java.util.Map;
import java.util.Set;

public class ReportConfig {

	// List of accounts by group
	private Map<String, Set<String>> cashBalanceAccounts;

	// account group mapping
	private  Map<String, String> cashBalanceAccountGroupMap;

	// currency list
	private  Set<String> cashBalanceCurrencies;

	public Map<String, Set<String>> getCashBalanceAccounts() {
		return cashBalanceAccounts;
	}

	public void setCashBalanceAccounts(Map<String, Set<String>> cashBalanceAccounts) {
		this.cashBalanceAccounts = cashBalanceAccounts;
	}

	public Map<String, String> getCashBalanceAccountGroupMap() {
		return cashBalanceAccountGroupMap;
	}

	public void setCashBalanceAccountGroupMap(Map<String, String> cashBalanceAccountGroupMap) {
		this.cashBalanceAccountGroupMap = cashBalanceAccountGroupMap;
	}

	public Set<String> getCashBalanceCurrencies() {
		return cashBalanceCurrencies;
	}

	public void setCashBalanceCurrencies(Set<String> cashBalanceCurrencies) {
		this.cashBalanceCurrencies = cashBalanceCurrencies;
	}
	
	



	
	
}
