package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rk.response.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<User> responseEntity = rt.getForEntity("http://localhost:9090/user", User.class);
		
		int statusCodeValue = responseEntity.getStatusCodeValue();
		if(statusCodeValue==200) {
			User body = responseEntity.getBody();
			System.out.println(body);
		}
	}

}
