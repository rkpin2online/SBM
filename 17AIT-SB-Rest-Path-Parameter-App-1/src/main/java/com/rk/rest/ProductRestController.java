package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
		
	@GetMapping("/price/{pid}")
	public ResponseEntity<String> getPrice(@PathVariable("pid") Integer productId){
			
		String msg ="The Price of " + productId + " is :: 450 $";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/check/{model}/{color}")
	public ResponseEntity<String> getDetails(
			@PathVariable("color")String color,
			@PathVariable("model")String model)
	{
		
		String msg = model + " " + color + " Cars are Avalible.";
		
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
}
