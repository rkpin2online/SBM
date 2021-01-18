package com.rk.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rk.client.StockPriceClient;

@RestController
public class StockCalculationRestController {
	
	@Autowired
	private StockPriceClient priceClint;
	
	@GetMapping(value = "/calculate/{name}/{qty}")
	public ResponseEntity<String> calculate(
			@PathVariable("name") String companyName,
			@PathVariable("qty") Integer qty)
	{
		
//		String endPointURL = "http://localhost:2222/getcost/{companyName}";
//		
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Double> forEntity = rt.getForEntity(endPointURL, Double.class, companyName);
		
		ResponseEntity<String> stockPrice = priceClint.getStockPrice(companyName);
			
		
		if(stockPrice.getStatusCodeValue()==200) {
			String body = stockPrice.getBody();
			String[] split = body.split("@");
			String response = "Totla Cost :: "+Double.parseDouble(split[0])*qty;
			response = response.concat(" --> Process by Server Port :: "+split[1]);	
			
			return new ResponseEntity<String>(response, HttpStatus.OK);
		}
		
		return null;
		
		
	}
}












