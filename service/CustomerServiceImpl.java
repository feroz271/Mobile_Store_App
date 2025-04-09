package com.example.msa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msa.entity.Cart;
import com.example.msa.entity.Customer;
import com.example.msa.exception.ResourceNotFoundException;
import com.example.msa.repository.CartRepository;
import com.example.msa.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Customer saveCustomer(Customer customer) {

        customer = customerRepository.save(customer);

        Cart cart = new Cart();
        cart.setCartTotal(0);
        cart.setCustomer(customer);

        cartRepository.save(cart);

        return customer;
    }

    @Override
    public Customer getCustomerById(int customerId) {

        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isEmpty()) {
            throw new ResourceNotFoundException("Customer not found with id: " + customerId);
        }
        return optionalCustomer.get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {

        Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCustomerId());
        if (optionalCustomer.isEmpty()) {
            throw new ResourceNotFoundException("Customer not found with id: " + customer.getCustomerId());
        }
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int customerId) {

        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isEmpty()) {
            throw new ResourceNotFoundException("Customer not found with id: " + customerId);
        }
        customerRepository.delete(optionalCustomer.get());
    }
}
