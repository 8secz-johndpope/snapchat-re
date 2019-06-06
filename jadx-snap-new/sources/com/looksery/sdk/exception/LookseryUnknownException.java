package com.looksery.sdk.exception;

public class LookseryUnknownException extends LookserySdkException {
    LookseryUnknownException(Report report) {
        super(report);
    }
}
