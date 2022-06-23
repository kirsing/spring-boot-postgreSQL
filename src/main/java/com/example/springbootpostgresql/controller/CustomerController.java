package com.example.springbootpostgresql.controller;


import com.example.springbootpostgresql.CustomEntityException;
import com.example.springbootpostgresql.entity.CustomerEntity;
import com.example.springbootpostgresql.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<CustomerEntity> findAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerEntity findCustomerById(@PathVariable("id") Long id) {
        return customerService.findById(id).orElseThrow(()->new CustomEntityException( "not "+id));
    }
    @PostMapping
    public ResponseEntity<CustomerEntity> saveCustomer(@RequestBody CustomerEntity customerEntity) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "foo");
        return new ResponseEntity<>(customerService.saveCustomer(customerEntity), headers, HttpStatus.CREATED);
    }
    @PutMapping
    public CustomerEntity updateCustomer(@RequestBody CustomerEntity customerEntity) {
        return customerService.updateCustomer(customerEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        customerService.deleteCustomer(id);
    }
}
