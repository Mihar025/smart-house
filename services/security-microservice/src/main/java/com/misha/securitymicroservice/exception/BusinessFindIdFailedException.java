package com.misha.securitymicroservice.exception;

public class BusinessFindIdFailedException extends RuntimeException {
    public BusinessFindIdFailedException(String msg) {
        super(msg);
    }
}
