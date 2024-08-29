package com.misha.securitymicroservice.exception;

public class BusinessUpdateException extends RuntimeException {
    public BusinessUpdateException(String msg) {
        super(msg);
    }
}
