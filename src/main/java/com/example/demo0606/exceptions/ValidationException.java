package com.example.demo0606.exceptions;

public class ValidationException extends Exception {
    private String message;

    public ValidationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
