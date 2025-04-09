package com.example.msa.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name="customer_tbl")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String city;
	
	@OneToOne(mappedBy="customer")
	private Cart cart;
	
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
	
}