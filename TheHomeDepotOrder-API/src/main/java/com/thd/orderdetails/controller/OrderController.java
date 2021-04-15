package com.thd.orderdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thd.orderdetails.requestresponse.to.Order;
import com.thd.orderdetails.service.TotalCalculationService;

@RestController
@RequestMapping(value = "/OrderDetails", consumes = MediaType.APPLICATION_JSON_VALUE , produces =  MediaType.APPLICATION_JSON_VALUE )
public class OrderController {

	@Autowired
	private TotalCalculationService service;
	
	@PostMapping("/OrderTotal")
	public Order getOrderDetails(@RequestBody Order order) {
		return service.calculateTotal(order);
	}
	
}
