package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Cart;
import com.repository.CartRepo;

@RestController
public class CartController {
	@Autowired 
	CartRepo repo;
	
	@PostMapping("/cart")
	public Cart cart(@RequestBody Cart cart) {
		repo.save(cart);
		return cart;
	}
}
