package com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.service;

import com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Customer;
import com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceInterface {
    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllEmployees() {
        return customerRepository.findAll();
    }
}
