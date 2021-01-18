package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoRestController {

	@GetMapping(value = "/m1")
	@HystrixCommand(fallbackMethod = "m2")
	public ResponseEntity<String> m1(){
		
		String msg="Response From m1() method";
		int i = 10/0;
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	public ResponseEntity<String> m2(){
		String msg="Response From m2() method(Fallback Method)";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
