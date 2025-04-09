package com.example.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msa.entity.Cart;
import com.example.msa.model.CartItemRequest;
import com.example.msa.service.CartServiceI;



@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartServiceI cartService;
	
	@PostMapping("/addItem")
	public ResponseEntity<Cart> addToCart(@RequestBody CartItemRequest cartItemReq) {
		
		Cart cart = cartService.addMobileToCart(cartItemReq.getCartId(), cartItemReq.getMobileId(), cartItemReq.getQty());
		
		return new ResponseEntity<>(cart,HttpStatus.ACCEPTED);
	}
	
}
