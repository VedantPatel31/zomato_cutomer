package com.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.repository.UserRepository;

@RestController
@RequestMapping("/admin")
public class UserController {
	@Autowired
	UserRepository userRepository;
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}
	
	@DeleteMapping("/user/{userId}")
	public User removeUserById(@PathVariable("userId") Integer userId) {
		User deleteuser = userRepository.findById(userId).get();
		userRepository.deleteById(userId);
		return deleteuser; 
	}
	
	@PutMapping("/user/update")
	public User updateUser(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
}
