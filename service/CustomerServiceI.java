package com.example.msa.service;

import java.util.List;
import com.example.msa.entity.Customer;

public interface CustomerServiceI {

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Customer customer);

    void deleteCustomer(int customerId);
}
