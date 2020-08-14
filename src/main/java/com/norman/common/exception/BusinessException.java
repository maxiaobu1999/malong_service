package com.norman.common.exception;


public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
