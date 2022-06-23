package com.example.springbootpostgresql;

public class CustomEntityException  extends RuntimeException{
    public CustomEntityException(String message) {
        super(message);
    }
}
