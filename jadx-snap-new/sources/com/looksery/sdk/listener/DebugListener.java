package com.looksery.sdk.listener;

public interface DebugListener {
    boolean isActive();

    boolean isEnabled();

    void onDataAvailable(byte[] bArr);
}
