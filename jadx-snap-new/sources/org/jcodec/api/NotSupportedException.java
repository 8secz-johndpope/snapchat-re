package org.jcodec.api;

public class NotSupportedException extends RuntimeException {
    public NotSupportedException(String... strArr) {
        super(String.valueOf(strArr));
    }
}
