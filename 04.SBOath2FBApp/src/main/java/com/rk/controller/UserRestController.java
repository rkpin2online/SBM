package com.rk.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping({"/","/home"})
	public String showHome() {
		
		return "Home Data";
	}
	
	@GetMapping("/show")
	public String getInfo() {
		return "Get Info";
	}
	
	@GetMapping("/user")
	public Principal showUserData(Principal p) {
		System.out.println(p.getClass().getName());
		return p;

	}
}
