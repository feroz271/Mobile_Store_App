package com.example.msa.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CartItemRequest {

	private int cartId;
	private int mobileId;
	private int qty;
}
