package com.misha.securitymicroservice.exception;

public class DrinkSaveException extends RuntimeException {
    public DrinkSaveException(String msg) {
        super(msg);
    }
}
