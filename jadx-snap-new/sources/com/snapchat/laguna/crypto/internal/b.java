package com.snapchat.laguna.crypto.internal;

import com.snapchat.laguna.crypto.Leb128;

public class b {
    private long a;
    private byte[] b;

    public b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Leb128.serialize(bArr, bArr2, bArr3);
        e();
    }

    private native void e();

    private native void f();

    private native void g();

    private native void h();

    public void a() {
        f();
        this.a = 0;
    }

    public byte[] c(byte[] bArr) {
        this.b = bArr;
        g();
        return this.b;
    }

    public byte[] d(byte[] bArr) {
        this.b = bArr;
        h();
        return this.b;
    }
}
