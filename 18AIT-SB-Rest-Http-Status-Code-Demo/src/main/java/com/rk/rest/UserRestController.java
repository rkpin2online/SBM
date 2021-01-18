package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.binding.User;

@RestController
public class UserRestController {
		
	@GetMapping(value = "/get",produces = "application/json")
	public ResponseEntity<User> getUserData(){
		
		User user = new User();
		user.setUserId(2021);
		user.setUserName("Rudra");
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
		
	}
}
