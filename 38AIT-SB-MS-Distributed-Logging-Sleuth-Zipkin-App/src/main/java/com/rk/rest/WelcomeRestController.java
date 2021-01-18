package com.rk.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);
	
	@GetMapping(value = "/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		logger.info("***********getWelcomeMsg() Execution Started************");
		String msg = "Welcome Mr.Rk...!!!";
		logger.info("***********getWelcomeMsg() Execution Ended************");
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
