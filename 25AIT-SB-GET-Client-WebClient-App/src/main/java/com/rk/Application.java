package com.rk;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.rk.bindings.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);

		String endPointURL = "http://localhost:9090/user";

		WebClient webClient = WebClient.create();

		//		String response = webClient.get()
		//				 .uri(new URI(endPointURL))
		//				 .retrieve()
		//				 .bodyToMono(String.class)
		//				 .block();
		//		System.out.println("Response :: "+response );


		//		webClient.get()
		//			.uri(new URI(endPointURL))
		//			.retrieve()
		//			.bodyToMono(String.class)
		//			.subscribe(Application::handelResponse);
		//		
		//		System.out.println("************After Sending Request*******");

		User userResponse = webClient.get()
				.uri(new URI(endPointURL))
				.retrieve()
				.bodyToMono(User.class)
				.block();
		System.out.println(userResponse);

	}

	public static void handelResponse(String msg) {
		System.out.println("Response :: " + msg);
	}

}
