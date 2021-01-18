package com.rk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.rk.dao.IStudentDao;
import com.rk.model.Student;

public class RedisOperationTest implements CommandLineRunner {
	
	@Autowired
	private IStudentDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		dao.addStudent(new Student(101,"ABC",1000.00));
		dao.addStudent(new Student(102,"DEF",2000.00));
		dao.addStudent(new Student(103,"GHI",3000.00));
		dao.addStudent(new Student(104,"JKL",4000.00));
		dao.addStudent(new Student(105,"MNO",5000.00));
		
		dao.getAllStuent().forEach((k,v)->System.out.println(k+"-"+v));
		
		dao.removeStudent(101);
		
		dao.modifyStudent(new Student(103,"RNK",3000.00));
		System.out.println("***********After Removing Stuent****************");
		
		dao.getAllStuent().forEach((k,v)->System.out.println(k+"---"+v));
	}

}
