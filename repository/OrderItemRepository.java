package com.example.msa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msa.entity.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
