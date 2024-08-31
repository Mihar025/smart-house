package com.misha.securitymicroservice.exception;

public class OrderFindFailedException extends RuntimeException {
    public OrderFindFailedException(String msg) {
        super(msg);
    }
}
