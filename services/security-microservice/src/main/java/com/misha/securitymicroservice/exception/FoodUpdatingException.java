package com.misha.securitymicroservice.exception;

public class FoodUpdatingException extends RuntimeException {
    public FoodUpdatingException(String msg) {
        super(msg);
    }
}
