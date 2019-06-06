package com.google.common.util.concurrent;

public class UncheckedExecutionException extends RuntimeException {
    protected UncheckedExecutionException() {
    }

    public UncheckedExecutionException(Throwable th) {
        super(th);
    }
}
