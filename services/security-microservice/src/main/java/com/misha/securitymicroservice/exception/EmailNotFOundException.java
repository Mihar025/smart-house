package com.misha.securitymicroservice.exception;

public class EmailNotFOundException extends RuntimeException {
    public EmailNotFOundException(String msg) {
        super(msg);
    }
}
