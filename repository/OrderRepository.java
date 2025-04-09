package com.example.msa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msa.entity.Order;



public interface OrderRepository extends JpaRepository<Order,Integer>{

}
