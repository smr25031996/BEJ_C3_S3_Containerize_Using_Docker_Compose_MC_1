package com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.service;

import com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    Customer saveCustomer(Customer customer);

    List<Customer> getAllEmployees();

}
