package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate rt = new RestTemplate();
		String urlPoint = "http://localhost:9090/welcome";
		//ResponseEntity<String> forEntity = rt.getForEntity(urlPoint, String.class);
		HttpHeaders headers = new HttpHeaders();
		//headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("Accept", "application/json");
		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<String> exchange = rt.exchange(urlPoint, HttpMethod.GET, entity, String.class);
		Integer statusCode = exchange.getStatusCodeValue();
		
		if(statusCode==200) {
			String body = exchange.getBody();
			System.out.println(body);
		}
	}

}
