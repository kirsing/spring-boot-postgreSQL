package com.example.springbootpostgresql.controller;

import com.example.springbootpostgresql.entity.CustomerEntity;
import com.example.springbootpostgresql.service.CriteriaService;
import com.example.springbootpostgresql.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/criteria")
public class CriteriaController {

    CriteriaService criteriaService;

    @GetMapping
    public List<CustomerEntity> getAllCustomers(@RequestParam(value = "name") String name, @RequestParam(value="value") String value ) {
        return criteriaService.showObjects(name, value);
    }
    @GetMapping("/a")
    public List<CustomerEntity> getCustomer1() {
        return criteriaService.showObjects1();
    }
}
