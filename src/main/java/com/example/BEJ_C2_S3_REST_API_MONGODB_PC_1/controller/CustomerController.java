package com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.controller;

import com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Customer;
import com.example.BEJ_C2_S3_REST_API_MONGODB_PC_1.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private final CustomerServiceInterface customerServiceInterface;

    @Autowired
    public CustomerController(CustomerServiceInterface customerServiceInterface) {
        this.customerServiceInterface = customerServiceInterface;
    }


    @PostMapping("/saveCustomer")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerServiceInterface.saveCustomer(customer), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getAllCustomers")
    public ResponseEntity<?> getAllCustomers() {
        return new ResponseEntity<>(customerServiceInterface.getAllEmployees(), HttpStatus.OK);
    }
}
