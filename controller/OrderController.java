package com.example.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.msa.entity.Order;
import com.example.msa.service.OrderServiceI;


@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderServiceI orderService;
	
	@GetMapping("/checkout")
	public ResponseEntity<Order> placeOrder(@RequestParam("customerId") int customerId) {
		
		Order order = orderService.placeOrder(customerId);
		
		return new ResponseEntity<>(order,HttpStatus.OK);
	}
	
	@GetMapping("/{orderId}")
	public ResponseEntity<Order> getOrderDetails(@PathVariable int orderId) {
		
		Order order = orderService.getOrderDetails(orderId);
		
		return new ResponseEntity<>(order,HttpStatus.OK);
	}
}
