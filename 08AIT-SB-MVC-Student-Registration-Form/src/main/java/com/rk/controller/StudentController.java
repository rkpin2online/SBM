package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rk.model.Student;

@Controller
public class StudentController {
	
	
	@GetMapping("/registration")
	public String loadForm(Model model) {
		model.addAttribute("student", new Student());
		return "registration";
	}
	
	@PostMapping("/studentreg")
	public String stdRegistration(Student student,Model model) {
		
		model.addAttribute("name", student.getFname()+ " " + student.getLname());
		
		return "success";
	}
	
}
