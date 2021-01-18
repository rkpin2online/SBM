package com.rk;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rk.binding.Product;

public class JavaToJsonConvortor {
	public static void main(String[] args) throws Exception {
		
		Product p = new Product();
		p.setProductId(101);
		p.setProductName("Kurkure");
		p.setProductPrice(10.00);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("product.json"),p);
	}
}
