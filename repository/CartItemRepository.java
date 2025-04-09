package com.example.msa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msa.entity.CartItem;


public interface CartItemRepository extends JpaRepository<CartItem,Integer>{

}
