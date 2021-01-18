package com.rk.excepiton;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapper {
	
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<String> handelNoDataFoundException(Exception e){
			String msg = e.getMessage();
		return new ResponseEntity<>( msg ,HttpStatus.NOT_FOUND);
	}
}
