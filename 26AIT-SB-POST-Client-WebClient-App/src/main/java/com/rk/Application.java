package com.rk;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.rk.request.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		
		Book book = new Book(101,"Spring-Boot","500$");
		
		String endPointURL="http://localhost:9090/addbook";
		
		WebClient webClient = WebClient.create();
		
			String response = webClient.post()
				.uri(new URI(endPointURL))
				.bodyValue(book)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println("Response :: "+response);
	}

}
