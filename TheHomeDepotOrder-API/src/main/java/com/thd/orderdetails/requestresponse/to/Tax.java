package com.thd.orderdetails.requestresponse.to;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tax {
	
	@JsonProperty("TaxType")
	private String taxType;
	
	@JsonProperty("TaxAmount")
	private float taxAmount;
	
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public float getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(float taxAmount) {
		this.taxAmount = taxAmount;
	}
	
}
