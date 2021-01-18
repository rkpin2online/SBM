package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.model.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer>{
	
}
