package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserAddress;
import com.repository.UserAddressRepo;

@RestController
public class UserAddressController {
	@Autowired
	UserAddressRepo repo;
	
	@PostMapping("/address")
	public UserAddress address(@RequestBody UserAddress address) {
		repo.save(address);
		return address;
	}
	
	@PutMapping("/address/update")
	public UserAddress updateAddress(@RequestBody UserAddress address) {
		repo.save(address);
		return address;
	}
	
	@DeleteMapping("/address/{userId}")
	public UserAddress updateAddress(@PathVariable("userId") Integer userId ) {
		UserAddress deleteAddress = repo.findById(userId).get();
		repo.deleteById(userId);
		return deleteAddress;
	}
	
	@GetMapping("/address/all")
	public List<UserAddress> fetchAddress() {
		List<UserAddress> users = repo.findAll();
		return users;
	}
}
