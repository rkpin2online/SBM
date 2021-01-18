package com.rk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		
		boolean isNewRecord= false;
		
		if(book.getBookId()==null) {
			isNewRecord=true;
		}
		
		BookEntity saveEntity = bookRepo.save(book);
		if(isNewRecord && saveEntity.getBookId() != null) {
			model.addAttribute("succMsg","Book Stored Successfully!");
		}else if(!isNewRecord){
			model.addAttribute("succMsg","Book Updeted  Successfully!!");
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

	@GetMapping(value = "/editBook")
	public String editBook(@RequestParam("bid")Integer bookId,
			Model model)
	{
		Optional<BookEntity> findById = bookRepo.findById(bookId);
		if(findById.isPresent()) {
			BookEntity bookObj = findById.get();
			model.addAttribute("book", bookObj);
		}
		return "addBook";
	}

	
	  @GetMapping(value = "/deleteBook") 
	  public String deleteBook(@RequestParam("bid")Integer bookId,RedirectAttributes attribute) { 
		  boolean isDeleted=false;
				  try {
					  bookRepo.deleteById(bookId);
					  isDeleted=true;
				} catch (Exception e) {
					e.printStackTrace();
				}
				  
				  if(isDeleted) {
		 attribute.addFlashAttribute("succMsg","Record No :" + bookId + " Deleted Successfully!");
				  }
		 return "redirect:/viewBooks"; }
	 
}
