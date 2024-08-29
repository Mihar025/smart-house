package com.misha.securitymicroservice.exception;

public class CartClearException extends RuntimeException {
    public CartClearException(String msg) {
        super(msg);
    }
}
