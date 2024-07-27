package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cartId;
	Integer userId;
	Integer restaurantId;
	Integer itemId;
	Integer qty;
	String cookingInstructions;
	Integer totalAmount;
	Integer discountAmount;
	Integer finalAmount;
}
