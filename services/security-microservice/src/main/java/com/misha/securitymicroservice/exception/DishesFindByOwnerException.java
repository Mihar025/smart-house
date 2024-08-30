package com.misha.securitymicroservice.exception;

public class DishesFindByOwnerException extends RuntimeException {
    public DishesFindByOwnerException(String msg) {
        super(msg);
    }
}
