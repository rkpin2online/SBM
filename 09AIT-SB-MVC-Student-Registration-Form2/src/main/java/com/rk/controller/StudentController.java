package com.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rk.model.Student;
import com.rk.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/registration")
	public String loadForm(Model model) {
		
		model.addAttribute("student", new Student());
		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("courses", studentService.getCourses());
		model.addAttribute("timings", studentService.getTiming());
		
		return "registration";
	}
	
	@PostMapping("/studentreg")
	public String stdRegistration(Student student,Model model) {
		
		model.addAttribute("name", student.getFname()+ " " + student.getLname());
		
		return "success";
	}
	
}
