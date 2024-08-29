package com.misha.securitymicroservice.exception;

public class BusinessCreatingFailedException extends RuntimeException {
    public BusinessCreatingFailedException(String msg) {
        super(msg);
    }
}
