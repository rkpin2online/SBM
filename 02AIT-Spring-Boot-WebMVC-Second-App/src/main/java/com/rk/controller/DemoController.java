package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoController {
	
	@GetMapping("/work")
	public String doWork(Model model) {
		model.addAttribute("text", "This Message is Coming from Demo controller");
		return "display";
	}
}
