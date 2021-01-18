package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/get")
	public String getProduct(Model model) {
		
		model.addAttribute("pid", "101");
		model.addAttribute("pname","Moniter");
		model.addAttribute("price","30,000");
		
		return "product";
	}
}
