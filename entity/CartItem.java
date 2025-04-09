package com.example.msa.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name="cartitem_tbl")
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartItemId;
	private int mobileId;
	private int qty;
	private double itemTotal;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;		
}
