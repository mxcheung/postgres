package guru.springframework.controllers;

import java.util.Map;
import java.util.Set;


public class AccountCashBalanceSummary {

	private Set<String> allCurrencies;
	
	private Map<String, MoneyTable> cashBalanceMap;

	public Set<String> getAllCurrencies() {
		return allCurrencies;
	}

	public void setAllCurrencies(Set<String> allCurrencies) {
		this.allCurrencies = allCurrencies;
	}

	public Map<String, MoneyTable> getCashBalanceMap() {
		return cashBalanceMap;
	}

	public void setCashBalanceMap(Map<String, MoneyTable> cashBalanceMap) {
		this.cashBalanceMap = cashBalanceMap;
	}


	
    

}