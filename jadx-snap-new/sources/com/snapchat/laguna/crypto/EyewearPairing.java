package com.snapchat.laguna.crypto;

import com.snapchat.laguna.crypto.internal.e;

public class EyewearPairing {
    private e instance = new e();

    public boolean checkEyewearVerificationMessage(byte[] bArr) {
        return this.instance.f(bArr);
    }

    public void cleanup() {
        this.instance.a();
    }

    public byte[] getAppVerificationMessage(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return this.instance.d(bArr, bArr2, bArr3, bArr4);
    }

    public void setSharedSecret(byte[] bArr) {
        this.instance.c(bArr);
    }

    public void setVerificationCode(byte[] bArr) {
        this.instance.b(bArr);
    }
}
