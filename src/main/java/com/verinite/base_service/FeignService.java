package com.verinite.base_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {
	@Autowired
	private FeignExample feignExample;

	public String placeOrder() {
		return "Order Status: " + feignExample.checkInventory();
	}
}
