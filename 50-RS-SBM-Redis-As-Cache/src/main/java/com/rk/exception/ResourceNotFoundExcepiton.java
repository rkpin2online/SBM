package com.rk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcepiton extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 248273754553145633L;

	public ResourceNotFoundExcepiton(String msg) {
		super(msg);
	}
}
