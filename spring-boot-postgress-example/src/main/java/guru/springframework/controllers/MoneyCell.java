package guru.springframework.controllers;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MoneyCell  {

	@JsonIgnore
	public String rowKey;

	@JsonIgnore
	public String columnKey;

	public BigDecimal value = BigDecimal.ZERO;
	

	public String getRowKey() {
		return rowKey;
	}

	public void setRowKey(String rowKey) {
		this.rowKey = rowKey;
	}

	public String getColumnKey() {
		return columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
	

}
