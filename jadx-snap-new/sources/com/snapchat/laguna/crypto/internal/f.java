package com.snapchat.laguna.crypto.internal;

import com.snapchat.laguna.crypto.Leb128;

public class f {
    private byte[] b;

    private native void b();

    public byte[] a(byte[] bArr, boolean z) {
        new byte[1][0] = z ? (byte) 1 : (byte) 0;
        this.b = Leb128.serialize(bArr, r1);
        b();
        return this.b;
    }
}
