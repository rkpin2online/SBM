package com.rk.dao;

import java.util.Map;

import com.rk.model.Student;

public interface IStudentDao {
	
	void addStudent(Student s);
	void modifyStudent(Student s);
	Student getOneStudent(Integer id);
	Map<Integer,Student> getAllStuent();
	void removeStudent(Integer id);
	
}
