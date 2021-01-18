package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wc")
public class WelcomeController {
	
	@GetMapping("/wm")
	public String welcomeMsg(Model model) {
		String wcMsg="Hello Mr.Rk , Welcome!!";
		model.addAttribute("msg", wcMsg);
		return "welcome";
	}
}
