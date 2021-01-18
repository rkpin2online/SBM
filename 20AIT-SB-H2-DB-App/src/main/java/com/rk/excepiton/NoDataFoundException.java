package com.rk.excepiton;

public class NoDataFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8739736211184144771L;

	public NoDataFoundException(String msg) {
			super(msg);
	}
}
