package com.example.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobileStoreApplication {
   
	public static void main(String[] args) {
		
		System.out.println("Mobile App Started");
		
		SpringApplication.run(MobileStoreApplication.class, args);
		
		System.out.println("Mobile App running sucessfully...!");
	}

}
