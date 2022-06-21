package com.example.springbootpostgresql.service;

import com.example.springbootpostgresql.entity.CustomerEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerEntity> findAllCustomers();
    Optional<CustomerEntity> findById(Long id);
    CustomerEntity saveCustomer(CustomerEntity employeeEntity);
    CustomerEntity updateCustomer(CustomerEntity employeeEntity);
    void deleteCustomer(Long id);
}
