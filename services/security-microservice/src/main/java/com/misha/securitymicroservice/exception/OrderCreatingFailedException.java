package com.misha.securitymicroservice.exception;

public class OrderCreatingFailedException extends RuntimeException {
    public OrderCreatingFailedException(String msg) {
        super(msg);
    }
}
