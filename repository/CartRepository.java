package com.example.msa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msa.entity.Cart;

public interface CartRepository extends JpaRepository<Cart ,Integer>{

}
