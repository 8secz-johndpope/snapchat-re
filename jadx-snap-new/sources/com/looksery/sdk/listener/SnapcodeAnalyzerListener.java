package com.looksery.sdk.listener;

public interface SnapcodeAnalyzerListener {
    void onNewSnapcodeDetected(boolean z, int i, int i2, String str, byte[] bArr);

    void onSnapcodeLost();
}
