package com.thd.orderdetails.requestresponse.to;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
	
	@JsonProperty("OrderNumber")
	private String orderNumber;
	
	@JsonProperty("OrderType")
	private String orderType;
	
	@JsonProperty("OrderDate")
	private String orderDate;
	
	@JsonProperty("OrderLines")
	private List<OrderLine> orderLines;
	
	@JsonProperty("OrderTotal")
	private float orderTotal;
	
	public float getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(float orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

}
