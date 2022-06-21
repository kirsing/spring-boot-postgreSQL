package com.example.springbootpostgresql.repository;

import com.example.springbootpostgresql.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
