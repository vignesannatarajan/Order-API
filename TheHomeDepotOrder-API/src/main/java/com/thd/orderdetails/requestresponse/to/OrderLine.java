package com.thd.orderdetails.requestresponse.to;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLine {
	
	@JsonProperty("OrderLineNumber")
	private String orderLineNumber;
	
	@JsonProperty("LineStatus")
	private String lineStatus;
	
	@JsonProperty("LineTotalWithoutTax")
	private int lineTotalWithoutTax;
	
	@JsonProperty("LineCharges")
	private List<LineCharge> lineCharges;
	
	@JsonProperty("Taxes")
	private List<Tax> taxes;
	
	@JsonProperty("LineTotal")
	private float lineTotal;
	
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	public List<Tax> getTaxes() {
		return taxes;
	}
	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}
	public String getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(String orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	public String getLineStatus() {
		return lineStatus;
	}
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}
	public int getLineTotalWithoutTax() {
		return lineTotalWithoutTax;
	}
	public void setLineTotalWithoutTax(int lineTotalWithoutTax) {
		this.lineTotalWithoutTax = lineTotalWithoutTax;
	}
	public List<LineCharge> getLineCharges() {
		return lineCharges;
	}
	public void setLineCharges(List<LineCharge> lineCharges) {
		this.lineCharges = lineCharges;
	}

}
