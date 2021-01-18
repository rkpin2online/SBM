package com.rk.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.entity.Student;
import com.rk.entity.Students;
import com.rk.excepiton.NoDataFoundException;
import com.rk.repo.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@PostMapping(value = "/add", produces = {"application/json"},consumes = {"application/json"})
	public ResponseEntity<String> addStuent(@RequestBody Student student){
			Student savedEntity = studentRepo.save(student);
			String msg = "Sudent saved Successfully with Id :: " + savedEntity.getSid();
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") Integer sid){
			Student student = null;
		Optional<Student> findById = studentRepo.findById(sid);
			if(findById.isPresent()) {
				student = findById.get();
			}else {
				throw new NoDataFoundException("Invalid Student ID");
			}
			
			return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getall")
	public ResponseEntity<Students> getAllStudent(){
			List<Student> findAll = studentRepo.findAll();
			 
			Students students = new Students();
			students.setStudents(findAll);
			
			return new ResponseEntity<Students>(students, HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
				Student save = studentRepo.save(student);
				String msg = save.getSid()+ " Record Updated Successfully..!!";
				
			return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") Integer sid){
				studentRepo.deleteById(sid);
				String msg = sid + " Recode Deleted Successfully..!!";
				
			return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}













