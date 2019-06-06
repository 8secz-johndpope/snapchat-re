package com.snapchat.laguna.crypto;

import com.snapchat.laguna.crypto.internal.a;

public class ECDH {
    private a instance = new a();

    public void cleanup() {
        this.instance.b();
    }

    public byte[] computeEncryptionKey(byte[] bArr) {
        return this.instance.e(bArr);
    }

    public byte[] computeSharedSecret(byte[] bArr) {
        return this.instance.d(bArr);
    }

    public byte[] generatePublicKey() {
        return this.instance.c();
    }
}
