package com.example.exception;

public class UserAlreadyExitsException extends RuntimeException {
    public UserAlreadyExitsException(String message) {
        super(message);
    }
}
