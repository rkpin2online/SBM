package com.rk.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handelNullPointerException(Model model) {
			model.addAttribute("errMsg","Some Problem Occured.Plese Try Again Letter On...!!!");
			return "error";
	}
	
	@ExceptionHandler(value = NoBookFoundException.class)
	public String handelNoBookFoundException() {
			return "customError";
	}
}
