package com.rk.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceClient {
	
	@GetMapping(value = "/getcost/{companyName}")
	public ResponseEntity<String> getStockPrice(
			@PathVariable("companyName") String companyName);
}
