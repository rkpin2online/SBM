package com.rk.service;

import java.util.List;

import com.rk.model.Employee;

public interface IEmployeeService {

	public Employee saveEmployee(Employee e);
	public Employee updateEmployee(Integer empId,Employee e);
	public void deleteEmployee(Integer empId);
	
	public Employee getOneEmployee(Integer id);
	public List<Employee> getAllEmployess();
}
