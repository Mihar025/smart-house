package com.misha.securitymicroservice.exception;

public class BusinessNotFoundException extends RuntimeException {
    public BusinessNotFoundException(String msg) {
        super(msg);
    }
}
