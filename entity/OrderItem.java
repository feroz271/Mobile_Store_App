package com.example.msa.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="orderitem_tbl")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderItemId;	
	private int mobileId;
	private int qty;
	private double itemTotal;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;	

}
