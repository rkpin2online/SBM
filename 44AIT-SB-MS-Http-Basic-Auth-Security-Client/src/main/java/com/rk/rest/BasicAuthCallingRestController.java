package com.rk.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BasicAuthCallingRestController {
	
	@GetMapping("/invoke")
	public ResponseEntity<String> invokeWishApp(){
		
		String url = "http://localhost:9876/welcome";
		
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("admin","admin@123");
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<String> exchange = rt.exchange(url, HttpMethod.GET, entity, String.class);
		
		String body = exchange.getBody();
		
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
