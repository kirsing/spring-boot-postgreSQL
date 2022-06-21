package com.example.springbootpostgresql.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "mt_customers")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "customer_name", nullable = false, length = 15)
    private String name;
    @Column(name = "customer_number", nullable = false, length = 15)
    private String number;
}
