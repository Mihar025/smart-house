package com.misha.securitymicroservice.exception;

public class CartUpdateForbidenException extends RuntimeException{
    public CartUpdateForbidenException(String msg) {
        super(msg);
    }
}
