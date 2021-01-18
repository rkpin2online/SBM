package com.rk.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.constant.AppConstant;
import com.rk.props.AppProperties;

@RestController
public class DemoRestController {

	@Autowired
	private AppProperties appProps;

	@GetMapping(value = "/welcome")
	private ResponseEntity<String> getMsg() {
		String wlcm = appProps.getProperties().get(AppConstant.WELCOME_MSG);
		return new ResponseEntity<String>(wlcm, HttpStatus.OK);
	}
	
	@GetMapping(value = "/greet")
	private ResponseEntity<String> greetMsg() {
		String wlcm = appProps.getProperties().get(AppConstant.GREET_MSG);
		return new ResponseEntity<String>(wlcm, HttpStatus.OK);
	}
}
