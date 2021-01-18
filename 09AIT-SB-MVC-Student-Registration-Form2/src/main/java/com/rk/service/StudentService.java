package com.rk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<String> getGenders(){
		List<String> genders = new ArrayList<>();
		genders.add("Male");
		genders.add("Female");
		genders.add("Others");
		
		return genders;
	}
	
	
	public List<String> getCourses(){
		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Python");
		courses.add(".Net");
		
		return courses;
	}
	
	public List<String> getTiming(){
		List<String> timing = new ArrayList<>();
		timing.add("Male");
		timing.add("Female");
		timing.add("Others");
		
		return timing;
	}
}
