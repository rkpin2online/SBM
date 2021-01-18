package com.rk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.rk.model.Student;

@Configuration
public class AppConfig {
		
	//1.Connect  To Redis
	@Bean
	public RedisConnectionFactory cf() {
		return new LettuceConnectionFactory();
	}
	
	//2.Redis Template
	@Bean
	public RedisTemplate<String, Student> rt(){
		RedisTemplate<String, Student> template = new RedisTemplate<>();
		template.setConnectionFactory(cf());
		return template;
	}
}
