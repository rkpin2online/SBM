package com.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rk.service.IBookService;

@Controller
public class BookController {
	
	@Autowired
	private IBookService service;
	
	@GetMapping("/find")
	public String getPriceById(@RequestParam("bookId") String bookId,Model model) {
		Double price = service.findPriceById(bookId);
		model.addAttribute("price","Book Price Is :: "+price);
		
		return "display";
		
	}
}
