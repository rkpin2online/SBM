package com.rk.exception;

public class NoBookFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6402059625023658815L;

	public NoBookFoundException(String msg) {
		super(msg);
	}
}
