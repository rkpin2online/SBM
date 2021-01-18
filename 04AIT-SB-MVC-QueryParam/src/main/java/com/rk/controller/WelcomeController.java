package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/wc")
public class WelcomeController {
	
	@GetMapping("/wm")
	public String displayWlcMsg(@RequestParam(value = "name")String name,Model model) {
		
		String msgText=name.concat(",Welcome to Rk-Industry");
		model.addAttribute("msg", msgText);
		
		return "index";
	}
}
