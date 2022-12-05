package com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.repository;

import com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Customer;
import com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataMongoTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;
    private Customer customer;
    private Product product;


    @BeforeEach
    void setUp() {
        product = new Product(1, "car", "sedan");
        customer = new Customer(1, "Shubham", 87854684, product);
    }

    @AfterEach
    void tearDown() {
        product = null;
        customer = null;
    }

    @Test
    void saveAndReturnCustomer() {
        customerRepository.save(customer);
        Assertions.assertEquals(4, customerRepository.count());

    }

    @Test
    void findByCustomerPhoneNo() {
        Customer actual = customerRepository.findByCustomerPhoneNo(647744793);
        Assertions.assertNotEquals(customer, actual);

    }
}