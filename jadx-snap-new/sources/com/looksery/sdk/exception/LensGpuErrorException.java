package com.looksery.sdk.exception;

public class LensGpuErrorException extends LookserySdkException {
    LensGpuErrorException(Report report) {
        super(report);
    }
}
