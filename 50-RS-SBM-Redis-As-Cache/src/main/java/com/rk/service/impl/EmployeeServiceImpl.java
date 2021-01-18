package com.rk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.rk.exception.ResourceNotFoundExcepiton;
import com.rk.model.Employee;
import com.rk.repo.EmployeRepository;
import com.rk.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeRepository empRepo;
	
	@Override
	public Employee saveEmployee(Employee e) {
		return empRepo.save(e);
	}

	@Override
	@CachePut(value = "employees",key = "#empId")
	public Employee updateEmployee(Integer empId, Employee e) {
		Employee emp = empRepo.findById(empId)
				.orElseThrow(()->new ResourceNotFoundExcepiton("Employee Not Exit"));
			emp.setEmpName(e.getEmpName());
			emp.setEmpSal(e.getEmpSal());

			return empRepo.save(emp);
	}

	@Override
	@CacheEvict(value = "employees",allEntries = true)
	public void deleteEmployee(Integer empId) {
		empRepo.findById(empId)
				.orElseThrow(()->new ResourceNotFoundExcepiton("Employee Not Exit"));
		
		 empRepo.deleteById(empId);
	}

	@Override
	@Cacheable(value = "employees",key = "#empId")
	public Employee getOneEmployee(Integer empId) {
		Employee emp = empRepo.findById(empId)
				.orElseThrow(()->new ResourceNotFoundExcepiton("Employee Not Exit"));
		
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployess() {
		
		return empRepo.findAll();
	}

}
