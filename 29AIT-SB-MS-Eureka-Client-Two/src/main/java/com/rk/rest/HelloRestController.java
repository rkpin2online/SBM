package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hmsg")
	public ResponseEntity<String> helloMsg(){
			String msg = "Hello Mr.RK...!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
