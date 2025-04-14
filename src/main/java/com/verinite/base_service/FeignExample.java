package com.verinite.base_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service")
public interface FeignExample {

	@GetMapping("/check")
    String checkInventory();
	
	@GetMapping("/check-2")
    String checkInvent();
	
}
