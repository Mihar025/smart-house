package com.misha.securitymicroservice.exception;

public class CartItemRemoveFailedException extends RuntimeException {
    public CartItemRemoveFailedException(String msg) {
        super(msg);
    }
}
