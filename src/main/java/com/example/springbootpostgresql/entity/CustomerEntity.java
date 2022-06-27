package com.example.springbootpostgresql.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.*;

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
    @Column(name = "customer_number", nullable = false, length = 20)
    private String number;

    @Column(name = "local_time", columnDefinition = "TIME")
    @JsonFormat(pattern = "HH : mm")
    private LocalTime localTime;

    @JsonFormat(pattern="yyyy    MM    dd")
    @Column(name = "local_date", columnDefinition = "DATE")
    private LocalDate localDate;

    @JsonFormat(pattern="yyyy-MM-dd, HH:mm")
    @Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;

    @Column(name = "offset_time", columnDefinition = "TIME WITH TIME ZONE")
    private OffsetTime offsetTime;

    @Column(name = "offset_date_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime offsetDateTime;


}
