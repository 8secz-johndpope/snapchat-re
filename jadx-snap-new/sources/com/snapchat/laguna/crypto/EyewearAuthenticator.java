package com.snapchat.laguna.crypto;

import com.snapchat.laguna.crypto.internal.d;

public class EyewearAuthenticator {
    private d instance = new d();

    public void cleanup() {
        this.instance.a();
    }

    public byte[] generateMFIChallenge() {
        return this.instance.b();
    }

    public boolean setMFICert(byte[] bArr) {
        return this.instance.f(bArr);
    }

    public boolean verifyMFIResponse(byte[] bArr) {
        return this.instance.c(bArr);
    }

    public boolean verifySCCert(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.instance.e(bArr, bArr2, bArr3);
    }
}
