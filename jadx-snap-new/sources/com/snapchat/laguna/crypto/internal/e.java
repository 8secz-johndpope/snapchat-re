package com.snapchat.laguna.crypto.internal;

import com.snapchat.laguna.crypto.Leb128;

public class e {
    private long a;
    private byte[] b;

    public e() {
        g();
    }

    private native void g();

    private native void h();

    private native void i();

    private native void j();

    private native void k();

    private native void l();

    public void a() {
        h();
        this.a = 0;
    }

    public void b(byte[] bArr) {
        this.b = bArr;
        i();
    }

    public void c(byte[] bArr) {
        this.b = bArr;
        j();
    }

    public byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = Leb128.serialize(bArr, bArr2, bArr3, bArr4);
        k();
        return this.b;
    }

    public boolean f(byte[] bArr) {
        this.b = bArr;
        l();
        return this.b[0] == (byte) 1;
    }
}
