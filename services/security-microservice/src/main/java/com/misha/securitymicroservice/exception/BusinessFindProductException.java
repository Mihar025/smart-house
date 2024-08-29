package com.misha.securitymicroservice.exception;

public class BusinessFindProductException extends RuntimeException {
    public BusinessFindProductException(String msg) {
        super(msg);
    }
}
