package com.misha.securitymicroservice.security;


public class AccountDissabledException extends RuntimeException {
    public AccountDissabledException(String msg) {
        super(msg);
    }
}
