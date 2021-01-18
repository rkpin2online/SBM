package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/wmsg")
	public ResponseEntity<String> welcomeMsg() {
		
		String msg = "Welcome to Microservices";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
}
