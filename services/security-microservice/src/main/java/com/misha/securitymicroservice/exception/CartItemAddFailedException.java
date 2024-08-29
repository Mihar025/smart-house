package com.misha.securitymicroservice.exception;

public class CartItemAddFailedException extends RuntimeException {
    public CartItemAddFailedException(String msg) {
        super(msg);
    }
}
