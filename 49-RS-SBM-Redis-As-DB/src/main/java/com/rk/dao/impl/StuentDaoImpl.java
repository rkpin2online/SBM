package com.rk.dao.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;

import com.rk.dao.IStudentDao;
import com.rk.model.Student;

public class StuentDaoImpl implements IStudentDao {
	
	private final String KEY = "STUDENT";
	
	@Resource(name = "rt") 
	private HashOperations<String, Integer, Student> ho;
	
	@Override
	public void addStudent(Student s) {
		ho.putIfAbsent(KEY, s.getStdId(), s);
	}

	@Override
	public void modifyStudent(Student s) {
		ho.put(KEY, s.getStdId(), s);
	}

	@Override
	public Student getOneStudent(Integer id) {
		return ho.get(KEY, id);
		
	}

	@Override
	public Map<Integer, Student> getAllStuent() {
		return ho.entries(KEY);
	}

	@Override
	public void removeStudent(Integer id) {
		ho.delete(KEY, id);
	}

}
