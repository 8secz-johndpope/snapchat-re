package com.looksery.sdk.exception;

public class LensResourceNotFoundException extends LookserySdkException {
    LensResourceNotFoundException(Report report) {
        super(report);
    }
}
