package com.example.springbootpostgresql.controller;


import com.example.springbootpostgresql.entity.CustomerEntity;
import com.example.springbootpostgresql.service.CustomerService;
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
    public Optional<CustomerEntity> findCustomerById(@PathVariable("id") Long id) {
        return customerService.findById(id);
    }
    @PostMapping
    public CustomerEntity saveCustomer(@RequestBody CustomerEntity customerEntity) {
        return customerService.saveCustomer(customerEntity);
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
