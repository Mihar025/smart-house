package com.misha.securitymicroservice.exception;

public class DishesFindFailedException extends RuntimeException {
    public DishesFindFailedException(String msg) {
    super(msg);
    }
}
