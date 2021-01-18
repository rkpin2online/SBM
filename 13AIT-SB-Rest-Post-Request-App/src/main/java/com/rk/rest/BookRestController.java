 package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.model.Book;

@RestController
public class BookRestController {
	
	@PostMapping(value = ("/addbook"),consumes = {"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book book){
		
		System.out.println(book);
		//TODO : Logic to Store Book in DB
		
		String respMsg = "Book Stored Successfully..!!";
		
		return new ResponseEntity<String>(respMsg,HttpStatus.CREATED);
	}
}
