package com.snapchat.laguna.crypto.internal;

import java.util.Arrays;

public class a {
    private static final int c = 16;
    private static final int d = 32;
    private long a;
    private byte[] b;

    public a() {
        f();
    }

    private native void f();

    private native void g();

    private native void h();

    private native void i();

    public void b() {
        g();
        this.a = 0;
    }

    public byte[] c() {
        h();
        return this.b;
    }

    public byte[] d(byte[] bArr) {
        this.b = bArr;
        i();
        return this.b;
    }

    public byte[] e(byte[] bArr) {
        return (this.a == 0 || bArr == null || bArr.length < 32) ? null : Arrays.copyOf(bArr, 16);
    }
}
