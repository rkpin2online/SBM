package com.rk.service;

import org.springframework.stereotype.Service;

import com.rk.exception.NoBookFoundException;

@Service
public class BookServiceImple implements IBookService {

	@Override
	public Double findPriceById(String bookId) {
		
		if(bookId.equals("B101")) {
			return 450.00;
		}else {
			throw new NoBookFoundException("No Book Found In Given Id..!");
		}
		
	}

	

}
