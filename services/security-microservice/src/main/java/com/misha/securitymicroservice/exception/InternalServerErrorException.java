package com.misha.securitymicroservice.exception;

public class InternalServerErrorException extends Throwable {
    public InternalServerErrorException(String message) {
        super(message);
    }
}
