package com.misha.securitymicroservice.exception;

public class ProuctSavingFailedException extends RuntimeException {
    public ProuctSavingFailedException(String msg) {
        super(msg);
    }
}
