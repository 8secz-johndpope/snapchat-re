package com.looksery.sdk.listener;

public interface PersistenceListener {
    void requestRestore(String str);

    void requestSave(String str, byte[] bArr);
}
