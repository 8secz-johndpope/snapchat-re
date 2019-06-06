package com.looksery.sdk.exception;

public class LensNotInitializedException extends LookserySdkException {
    LensNotInitializedException(Report report) {
        super(report);
    }
}
