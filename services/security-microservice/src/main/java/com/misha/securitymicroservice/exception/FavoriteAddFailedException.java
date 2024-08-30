package com.misha.securitymicroservice.exception;

public class FavoriteAddFailedException extends RuntimeException {
    public FavoriteAddFailedException(String msg) {
        super(msg);
    }
}
