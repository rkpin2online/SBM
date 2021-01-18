package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(){
		
		String msg="Welcome Mr.Rk....!!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
