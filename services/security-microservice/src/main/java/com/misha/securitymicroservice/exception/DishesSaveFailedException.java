package com.misha.securitymicroservice.exception;

public class DishesSaveFailedException extends RuntimeException {
    public DishesSaveFailedException(String message) {
        super(message);
    }
}
