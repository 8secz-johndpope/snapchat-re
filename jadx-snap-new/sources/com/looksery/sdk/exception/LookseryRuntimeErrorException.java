package com.looksery.sdk.exception;

public class LookseryRuntimeErrorException extends LookserySdkException {
    LookseryRuntimeErrorException(Report report) {
        super(report);
    }
}
