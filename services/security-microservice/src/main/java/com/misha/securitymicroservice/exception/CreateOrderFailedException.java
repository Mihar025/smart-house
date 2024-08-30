package com.misha.securitymicroservice.exception;

public class CreateOrderFailedException extends RuntimeException {
    public CreateOrderFailedException(String msg) {
        super(msg);
    }
}
