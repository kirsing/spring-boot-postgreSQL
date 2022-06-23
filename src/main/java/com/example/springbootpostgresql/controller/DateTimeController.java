package com.example.springbootpostgresql.controller;

import com.example.springbootpostgresql.entity.CustomerEntity;
import com.example.springbootpostgresql.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
@AllArgsConstructor
public class DateTimeController {
    CustomerRepository customerRepository;

    @PostMapping("/time")
    public List<CustomerEntity> datea(@RequestParam("time")
                                      @DateTimeFormat(pattern = "HH : mm") LocalTime date) {
        return customerRepository.findCustomerEntitiesByLocalTimeAfter(date);
    }

    @PostMapping("/timeb")
    public List<CustomerEntity> dateb(@RequestParam("time")
                                      @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime date) {
        return customerRepository.findCustomerEntitiesByLocalTimeBefore(date);
    }

    @PostMapping("/timebe")
    public List<CustomerEntity> datebeetwin(@RequestParam("time1")
                                            @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime date1,
                                            @RequestParam("time2") @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime date2) {
        return customerRepository.findCustomerEntitiesByLocalTimeBetween(date1, date2);
    }

    @PostMapping("/local-date")
    public void localDate(@RequestParam("localDate")
                          @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate) {
        // ...
    }

    @PostMapping("/local-date-time")
    public void dateTime(@RequestParam("localDateTime")
                         @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime localDateTime) {
        // ...
    }

    @PostMapping("/local-date-time-before")
    public List<CustomerEntity> dateTimeBefore(@RequestParam("time-before")
                                                  @DateTimeFormat(pattern = "yyyy-MM-dd, HH:mm") LocalDateTime dateTime) {
        return customerRepository.findCustomerEntitiesByLocalDateTimeBefore(dateTime);
    }
}

