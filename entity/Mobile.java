package com.example.msa.entity;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name="mobile_tbl")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobileId;
	private String mobileName;
	private double price;
	private LocalDate mfd;
	private String companyName;
	
}


