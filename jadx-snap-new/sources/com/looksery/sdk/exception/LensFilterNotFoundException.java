package com.looksery.sdk.exception;

public class LensFilterNotFoundException extends LookserySdkException {
    LensFilterNotFoundException(Report report) {
        super(report);
    }
}
