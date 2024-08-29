package com.misha.securitymicroservice.exception;

public class AllProductsByOwnerException extends RuntimeException {
    public AllProductsByOwnerException(String msg) {
        super(msg);
    }
}
