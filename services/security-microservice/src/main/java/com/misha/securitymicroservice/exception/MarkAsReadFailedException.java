package com.misha.securitymicroservice.exception;

public class MarkAsReadFailedException extends RuntimeException {
    public MarkAsReadFailedException(String msg) {
        super(msg);
    }
}
