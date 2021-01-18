package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rk.request.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		String endPointUrl="http://localhost:9090/addbook";
		Book book = new Book(102,"Spring","500$");
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.postForEntity(endPointUrl,book,String.class);
		
		int statusCodeValue = responseEntity.getStatusCodeValue();
		if(statusCodeValue==201) {
			String body = responseEntity.getBody();
			System.out.println(body);
		}
	}

}
