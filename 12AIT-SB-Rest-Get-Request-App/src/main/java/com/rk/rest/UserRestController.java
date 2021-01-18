package com.rk.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.binding.User;
import com.rk.binding.Users;

@RestController
public class UserRestController {

	
	@GetMapping(value = "/user",produces = {"application/xml","application/json"})
	public ResponseEntity<User> getUser() {
		
		User user = new User();
		user.setUserId(101);
		user.setUserName("RK");
		user.setUserEmail("rk@gm.com");
		
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@GetMapping(value = "/users",produces = {"application/xml","application/json"})
	public  ResponseEntity<Users> getUsers() {
		
		User user1 = new User();
		user1.setUserId(101);
		user1.setUserName("RK");
		user1.setUserEmail("rk@gm.com");
		
		User user2 = new User();
		user2.setUserId(102);
		user2.setUserName("RkPintu");
		user2.setUserEmail("rkpintu@gm.com");
		
		User user3 = new User();
		user3.setUserId(103);
		user3.setUserName("Rkpin2online");
		user3.setUserEmail("rkpin2online@gm.com");
		
		List<User> user= new ArrayList<>();
			user.add(user1);
			user.add(user2);
			user.add(user3);
		Users users = new Users();
			users.setUser(user);
			
		return new ResponseEntity<Users>(users,HttpStatus.OK);
	}
}
