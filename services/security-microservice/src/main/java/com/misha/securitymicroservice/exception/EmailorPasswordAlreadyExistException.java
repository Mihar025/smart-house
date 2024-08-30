package com.misha.securitymicroservice.exception;

public class EmailorPasswordAlreadyExistException extends RuntimeException {
    public EmailorPasswordAlreadyExistException(String message){
        super(message);
    }
}
