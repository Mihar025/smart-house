package com.misha.securitymicroservice.exception;

public class DrinkFindByOwnerException extends RuntimeException {
    public DrinkFindByOwnerException(String msg) {
        super(msg);
    }
}
