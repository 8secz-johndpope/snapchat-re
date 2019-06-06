package com.snapchat.laguna.crypto;

import com.snapchat.laguna.crypto.internal.c;

public class EncryptedSessionManager {
    private c instance = new c();

    public void cleanup() {
        this.instance.a();
    }

    public byte[] decryptMessage(byte[] bArr) {
        return this.instance.i(bArr);
    }

    public byte[] encryptMessage(byte[] bArr) {
        return this.instance.j(bArr);
    }

    public boolean isConnectionReady() {
        return this.instance.h();
    }

    public boolean setEncryptionKey(byte[] bArr) {
        return this.instance.b(bArr);
    }

    public boolean setRxNonce(byte[] bArr) {
        return this.instance.e(bArr);
    }

    public boolean setRxSalt(byte[] bArr) {
        return this.instance.g(bArr);
    }

    public boolean setTxNonce(byte[] bArr) {
        return this.instance.d(bArr);
    }

    public boolean setTxSalt(byte[] bArr) {
        return this.instance.f(bArr);
    }
}
