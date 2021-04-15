package com.thd.orderdetails.service;

import org.springframework.stereotype.Component;

import com.thd.orderdetails.requestresponse.to.LineCharge;
import com.thd.orderdetails.requestresponse.to.Order;
import com.thd.orderdetails.requestresponse.to.OrderLine;
import com.thd.orderdetails.requestresponse.to.Tax;

@Component
public class TotalCalculationService {
	
	public Order calculateTotal(Order order) {
		
		calculateLineTotal(order);
		
		float orderTotal = calculateOrderTotal(order);
		order.setOrderTotal(orderTotal);
		
		return order;
		
	}

	private void calculateLineTotal(Order order) {
		
		for(OrderLine orderLines: order.getOrderLines()) {
			float lineTotal = orderLines.getLineTotalWithoutTax() + getLineCharges(orderLines) + getTaxes(orderLines) ;
			orderLines.setLineTotal(lineTotal);
		}
		
	}
	
	private float getLineCharges(OrderLine orderLine) {
		
		float lineCharge = 0;
		for(LineCharge lineCharges: orderLine.getLineCharges()) {
			lineCharge = lineCharge + lineCharges.getChargeAmount() ;
		}
		
		return lineCharge;	
	}
	
	private float getTaxes(OrderLine orderLine) {
		float taxAmount = 0;
		for(Tax taxes: orderLine.getTaxes()) {
			taxAmount = taxAmount + taxes.getTaxAmount();
		}
		return taxAmount;
	}

	private float calculateOrderTotal(Order order) {
		
		float orderTotal = 0;
		for(OrderLine orderLines: order.getOrderLines()) {
			if(orderLines.getLineStatus().equals("CREATED")) {
				orderTotal = orderTotal + orderLines.getLineTotal();
			} else if (orderLines.getLineStatus().equals("CANCELLED") || orderLines.getLineStatus().equals("RETURNED")) {
				orderTotal =  orderTotal - orderLines.getLineTotal();
			}
		}
		
		return orderTotal;
	}

}
