package com.rk.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rk.binding.Book;

@RestController
public class BookRestController {
	
	@GetMapping(value = "/book/{isbn}",produces = {"application/json"})
	public ResponseEntity<Book> getBookInfo(@PathVariable("isbn") String isbn){
		
		//Logic
		Book book = new Book(isbn,"Java","300 $","Rod Jhonson");
		
		Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks()).withRel("All-Books");
		book.add(withRel);
		
		return new ResponseEntity<Book>(book, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/books",produces = {"application/json"})
	public ResponseEntity<List<Book>> getAllBooks(){
		
		Book b1 = new Book("ISBN001","Spring","400 $","Rod Jhonson");
		Book b2 = new Book("ISBN001","Spring Boot","400 $","Rod Jhonson");
		Book b3 = new Book("ISBN001","Microservices","400 $","Rod Jhonson");
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
	}
	
}
