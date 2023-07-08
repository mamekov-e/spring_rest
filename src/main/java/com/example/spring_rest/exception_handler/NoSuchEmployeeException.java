package com.example.spring_rest.exception_handler;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(int id) {
        super(String.format("Employee with id %s not found",id));
    }
}
