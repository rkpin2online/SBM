package com.rk;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rk.binding.Product;

public class JsonToJavaConvertor {

	public static void main(String[] args) throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();
		Product product = mapper.readValue(new File("product.json"), Product.class);
		System.out.println(product);
	}

}
