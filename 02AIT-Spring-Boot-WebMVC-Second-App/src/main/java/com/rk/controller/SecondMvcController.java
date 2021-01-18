package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("second")
public class SecondMvcController {
	
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public ModelAndView welcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome To RK-Industry....");
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/greet")
	public String greetMsg(Model model) {
		model.addAttribute("msg", "Hello Mr.RK!!");
		return "index";
	}
}
