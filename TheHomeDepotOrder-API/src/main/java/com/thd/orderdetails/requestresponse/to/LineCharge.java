package com.thd.orderdetails.requestresponse.to;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LineCharge {
	
	@JsonProperty("ChargeType")
	private String chargeType;
	
	@JsonProperty("ChargeAmount")
	private float chargeAmount;
	
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public float getChargeAmount() {
		return chargeAmount;
	}
	public void setChargeAmount(float chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

}
