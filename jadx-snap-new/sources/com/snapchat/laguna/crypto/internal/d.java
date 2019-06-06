package com.snapchat.laguna.crypto.internal;

import com.snapchat.laguna.crypto.Leb128;

public class d {
    private long a;
    private byte[] b;

    public d() {
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
    }

    public byte[] b() {
        i();
        return this.b;
    }

    public boolean c(byte[] bArr) {
        this.b = bArr;
        j();
        return this.b[0] == (byte) 1;
    }

    public boolean e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Leb128.serialize(bArr, bArr2, bArr3);
        k();
        return this.b[0] == (byte) 1;
    }

    public boolean f(byte[] bArr) {
        this.b = bArr;
        l();
        return this.b[0] == (byte) 1;
    }
}
