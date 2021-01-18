package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rk.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/get")
	public String getDetails(Model model) {
		
		User userObj = new User();
		userObj.setUserId(101);
		userObj.setUserName("Rk");
		userObj.setUserEmail("rk@gmail.com");
		userObj.setUserGender("M");
		userObj.setUserDob("30-09-1997");
	
		model.addAttribute("user", userObj);
		
		return "user";
	}
}
