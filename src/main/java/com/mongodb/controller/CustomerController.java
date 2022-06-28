package com.mongodb.controller;

import com.mongodb.model.Customer;
import com.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository custRepo;

    @GetMapping("/getCustomersList")
    public ResponseEntity<List<Customer>> getCustomersList() {
        return new ResponseEntity<>(custRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add/customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(custRepo.save(customer), HttpStatus.CREATED);
    }

    @GetMapping("/getCustById")
    public ResponseEntity<Customer> getCustomerById(@RequestParam int custId) {
        return new ResponseEntity<>(custRepo.findById(custId).get(), HttpStatus.OK);
    }
}
