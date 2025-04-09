package com.example.msa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msa.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
