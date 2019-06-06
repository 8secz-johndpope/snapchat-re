package com.snapchat.laguna.crypto;

import com.snapchat.laguna.crypto.internal.f;

public class LagunaRSA {
    private f instance = new f();

    public byte[] appAuthResponseFromChallenge(byte[] bArr, boolean z) {
        return this.instance.a(bArr, z);
    }
}
