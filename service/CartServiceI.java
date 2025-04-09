package com.example.msa.service;

import com.example.msa.entity.Cart;

public interface CartServiceI {

	Cart addMobileToCart(int cartId,int mobileId,int qty);
	
	//Cart removeMobileFromCart(int cartId,int mobileId);
	
	//Cart updateQtyInCart(int cartId,int mobileId,int qty);
	
}
