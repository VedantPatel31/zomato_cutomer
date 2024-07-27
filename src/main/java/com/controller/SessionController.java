package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.repository.UserRepository;

@RestController
public class SessionController {
	@Autowired
	UserRepository userRepository;
	
	public User signup(@RequestBody User user) {

		System.out.println(user.getGender());
		userRepository.save(user);
		return user;
	}

}
