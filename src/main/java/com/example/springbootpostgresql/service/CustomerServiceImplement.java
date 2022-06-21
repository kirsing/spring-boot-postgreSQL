package com.example.springbootpostgresql.service;


import com.example.springbootpostgresql.entity.CustomerEntity;
import com.example.springbootpostgresql.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplement implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImplement(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerEntity> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<CustomerEntity> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public CustomerEntity saveCustomer(CustomerEntity employeeEntity) {
        return customerRepository.save(employeeEntity);
    }

    @Override
    public CustomerEntity updateCustomer(CustomerEntity employeeEntity) {
        return customerRepository.save(employeeEntity);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
