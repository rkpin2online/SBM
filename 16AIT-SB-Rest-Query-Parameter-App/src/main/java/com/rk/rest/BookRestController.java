package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rk.binding.Book;

@RestController
public class BookRestController {
	
	@GetMapping(value = "/price")
	public ResponseEntity<String> getPrice(@RequestParam("isbn")String isbn){
		
		String msg = "Book Price For "	+	isbn +	":: 400$";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping(value = "/check")
	public ResponseEntity<String> checkAvalibility(
			@RequestParam("type") String type,
			@RequestParam("author") String author)
	{
		
		String msg = type + " Book by " + author + " :: Avalible";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping(value = "/get",produces = {"application/xml","application/json"})
	public ResponseEntity<Book> getBookDetails(@RequestParam("isbn") String isbn){
		// TODO
		Book book = new Book();
		book.setIsbn(isbn);
		book.setBookName("JAVA");
		book.setBookPrice("500 $");	
		
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
}
