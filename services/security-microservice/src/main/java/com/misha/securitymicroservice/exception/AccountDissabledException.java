package com.misha.securitymicroservice.exception;

public class AccountDissabledException extends RuntimeException {
    public AccountDissabledException(String accountIsDisabled) {
        super(accountIsDisabled);
    }
}
