package com.example.springbootpostgresql.repository;

import com.example.springbootpostgresql.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    public List<CustomerEntity> findCustomerEntitiesByLocalTimeAfter(LocalTime localTime);
    public List<CustomerEntity> findCustomerEntitiesByLocalTimeBefore(LocalTime localTime);
    public List<CustomerEntity> findCustomerEntitiesByLocalTimeBetween(LocalTime localTime1,LocalTime localTime2);

    public List<CustomerEntity> findCustomerEntitiesByLocalDateTimeAfter(LocalDateTime localDateTime);
    public List<CustomerEntity> findCustomerEntitiesByLocalDateTimeBefore(LocalDateTime localDateTime);
}
