package com.snap.composer.logger;

public interface Logger {
    void log(int i, String str);

    void log(int i, Throwable th, String str);
}
