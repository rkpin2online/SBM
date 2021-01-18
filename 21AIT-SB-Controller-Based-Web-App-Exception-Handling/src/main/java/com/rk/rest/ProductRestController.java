package com.rk.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rk.model.Product;
import com.rk.service.IProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	private IProductService service;
	
	@GetMapping("/get")
	public ResponseEntity<Product> getProductById(@RequestParam("pid") Integer pid) {
			Product findProductById = service.findProductById(pid);
			
		return new ResponseEntity<Product>(findProductById, HttpStatus.OK);
	}
}
