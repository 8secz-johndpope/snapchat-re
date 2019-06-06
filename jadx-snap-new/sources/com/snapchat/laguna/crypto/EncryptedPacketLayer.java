package com.snapchat.laguna.crypto;

import com.snapchat.laguna.crypto.internal.b;

public class EncryptedPacketLayer {
    private b instance;

    public EncryptedPacketLayer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.instance = new b(bArr, bArr2, bArr3);
    }

    public void cleanup() {
        this.instance.a();
    }

    public byte[] decryptMessage(byte[] bArr) {
        return this.instance.c(bArr);
    }

    public byte[] encryptMessage(byte[] bArr) {
        return this.instance.d(bArr);
    }
}
