package com.misha.securitymicroservice.exception;

public class ProductFindFailedException extends RuntimeException {
    public ProductFindFailedException(String msg) {
        super(msg);
    }
}
