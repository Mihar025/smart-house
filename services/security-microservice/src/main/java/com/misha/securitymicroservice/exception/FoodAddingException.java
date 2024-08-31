package com.misha.securitymicroservice.exception;

public class FoodAddingException extends RuntimeException {
    public FoodAddingException(String msg) {
        super(msg);
    }
}
