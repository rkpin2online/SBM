package com.rk.exception;

public class ProductNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7671350000966084534L;

	public ProductNotFoundException(String msg) {
			super(msg);
	}
}
