package com.misha.securitymicroservice.exception;

public class FindAllBusinessesWithoutDeliveryException extends RuntimeException {
    public FindAllBusinessesWithoutDeliveryException(String msg) {
        super(msg);
    }
}
