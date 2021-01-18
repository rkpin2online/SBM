package com.rk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.model.Employee;
import com.rk.service.IEmployeeService;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeRestController {
	
	@Autowired
	private IEmployeeService empService;
	
	@PostMapping(value = "/save")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee){
		 Employee saveEmployee = empService.saveEmployee(employee);
		 
		 return new ResponseEntity<Employee>(saveEmployee, HttpStatus.OK);
	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Employee>> getAllEmp(){
		List<Employee> allEmployess = empService.getAllEmployess();
		
		return new ResponseEntity<List<Employee>>(allEmployess, HttpStatus.OK);
	}
	
	@GetMapping(value = "/one/{empId}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable("empId") Integer empId){
		Employee oneEmployee = empService.getOneEmployee(empId);
		
		return new ResponseEntity<Employee>(oneEmployee, HttpStatus.OK);
	}
	
	@PutMapping(value = "/modify/{empId}")
	public ResponseEntity<Employee> updateEmp(@PathVariable("empId") Integer empId,
			@RequestBody Employee employee){
		Employee updateEmployee = empService.updateEmployee(empId, employee);
		
		return new ResponseEntity<Employee>(updateEmployee, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/remove/{empId}")
	public ResponseEntity<String> deleteEmp(@PathVariable("empId") Integer empId){
		empService.deleteEmployee(empId);
		String msg = "Employee Deleted -> "+empId;
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
