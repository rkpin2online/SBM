package com.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rk.entity.BookEntity;
import com.rk.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping(value = {"/","/add"})
	public String loadForm(Model model) {
		BookEntity bookObj = new BookEntity();
		model.addAttribute("book",bookObj);
		return "addBook";
	}
	
	@PostMapping(value = "/savebook")
	public String SaveBook(@ModelAttribute("book")BookEntity book,Model model) {
		
		BookEntity saveEntity = bookRepo.save(book);
			if(saveEntity != null && saveEntity.getBookId() != null) {
				model.addAttribute("succMsg","Book Stored Successfully!");
			}else {
				model.addAttribute("failMsg","Failed To Stored Book!!");
			}
		
		return "addBook";
	}
	
	@GetMapping(value = "/viewBooks")
	public String viewBooks(Model model) {
		List<BookEntity> bookList = bookRepo.findAll();
		model.addAttribute("books",bookList);
		return "viewBooks";
	}
}
