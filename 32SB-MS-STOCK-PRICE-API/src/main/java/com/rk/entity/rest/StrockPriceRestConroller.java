package com.rk.entity.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rk.entity.StockPrice;
import com.rk.entity.repository.StrockPriceRepository;

@RestController
public class StrockPriceRestConroller {
		
	@Autowired
	private Environment env;
	
	@Autowired
	private StrockPriceRepository stockRepo;
	
	@GetMapping(value = "/getcost/{companyName}")
	public ResponseEntity<String> getCostByCompanyName(
			@PathVariable("companyName")String companyName){
		
		String portNo = env.getProperty("local.server.port");
		
		StockPrice getCompanyName = stockRepo.findByCompanyName(companyName);
		Double stockCost = getCompanyName.getStockCost();
		String respBody = stockCost+"@"+portNo;
		
		return new ResponseEntity<String>(respBody, HttpStatus.OK);
	}
}
