package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/msg")
public class MessageRestController {
	
	@GetMapping(value = "/show")
	public ResponseEntity<String> showMsg(){
		String msg = "Hello Mr.Rk";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
