package com.looksery.sdk.exception;

public class LookseryOutOfMemoryException extends LookserySdkException {
    LookseryOutOfMemoryException(Report report) {
        super(report);
    }
}
