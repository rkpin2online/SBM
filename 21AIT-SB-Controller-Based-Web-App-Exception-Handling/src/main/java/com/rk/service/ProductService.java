package com.rk.service;

import org.springframework.stereotype.Service;

import com.rk.exception.ProductNotFoundException;
import com.rk.model.Product;

@Service
public class ProductService implements IProductService {
		
	@Override
	public Product findProductById(Integer pid) {
		if(pid==101) {
			return new Product(101, "Rk", 300.00);
		}else {
			throw new ProductNotFoundException("Product Is Not Found In Given ID:: " +pid);
		}
	}
}
