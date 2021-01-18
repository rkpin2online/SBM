package com.rk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rk.model.User;

@Controller
public class UserController {
		
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/create")
	public String loadUserForm(Model model) {
		
		model.addAttribute("userModel",new User()); 
		return "createuser";
	}
	
	@PostMapping("/save")
	public String createUserAcc(@ModelAttribute("userModel") User user,RedirectAttributes attributes) {
		logger.info("User Form Submited" + user);
		
		//model.addAttribute("msg", "Account Created Successfully");
		attributes.addFlashAttribute("msg", "Account Created Successfully");
		return "redirect:/success";
	}
	
	@GetMapping("/success")
	public String userAccCreationSucc(Model model) {
		logger.info("userAccCreationSucc() method called");
		model.addAttribute("userModel",new User());
		return "createuser";
	}

	
	
}
