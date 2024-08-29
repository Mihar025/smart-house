package com.misha.securitymicroservice.exception;

public class BusinessDeleteException extends RuntimeException {
    public BusinessDeleteException(String message) {
        super(message);
    }
}
