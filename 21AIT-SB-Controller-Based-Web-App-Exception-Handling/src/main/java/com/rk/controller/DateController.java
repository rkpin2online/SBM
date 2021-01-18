package com.rk.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateController {
	
	@GetMapping("/date")
	public String dateDisplay(Model model) {
		model.addAttribute("dateMsg", "Today's Date Is :: " +new Date());
		String name = null;
		name.length();
		return "date";
	}
}
