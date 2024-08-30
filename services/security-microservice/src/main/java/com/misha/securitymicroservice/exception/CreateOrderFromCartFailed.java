package com.misha.securitymicroservice.exception;

public class CreateOrderFromCartFailed extends RuntimeException {
    public CreateOrderFromCartFailed(String message) {
        super(message);
    }
}
