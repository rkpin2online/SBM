package com.rk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome Mr.RK...");
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/greet")
	public ModelAndView displayGreetMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning Mr.RK...");
		mav.setViewName("index");
		
		return mav;
	}
}
