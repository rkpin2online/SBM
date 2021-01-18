package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
	
		String msg="Welcome mr.Rk";
		model.addAttribute("msg", msg);
		
		String name = null;
		name.length();
		
		return "welcome";
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handelNullPointerException(Model model) {
		model.addAttribute("errMsg","Some Problem Occured. Plese Try After Some Time..!!");
		return "error";
	}
}











