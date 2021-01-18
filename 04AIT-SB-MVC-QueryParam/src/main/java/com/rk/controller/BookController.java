package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/price")
	public String getBookPrice(
			@RequestParam("book")String bookName,
			@RequestParam("author")String authorName,
			Model model) {
		
		String messag="Price of " + bookName + " writen by " + authorName +" is : 300.00$";
		model.addAttribute("msg", messag);
		
		return "index";
	}
}
