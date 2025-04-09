package com.example.msa.service;

import com.example.msa.entity.Order;

public interface OrderServiceI {
	
	Order placeOrder(int customerId);
	
	Order getOrderDetails(int orderId);

}
