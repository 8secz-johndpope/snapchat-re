package com.looksery.sdk.media;

public class VideoWriterException extends Exception {
    public VideoWriterException(String str) {
        super(str);
    }

    public VideoWriterException(String str, Throwable th) {
        super(str, th);
    }
}
