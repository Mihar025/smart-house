package com.misha.securitymicroservice.exception;

public class DeleteUserException extends RuntimeException {
    public DeleteUserException(String msg) {
        super(msg);
    }
}
