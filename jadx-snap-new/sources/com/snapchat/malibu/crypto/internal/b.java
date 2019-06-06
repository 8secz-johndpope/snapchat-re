package com.snapchat.malibu.crypto.internal;

import com.snapchat.laguna.crypto.Leb128;

public class b {
    private long a;
    private byte[] b;

    public b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte b) {
        byte[] bArr4 = new byte[]{b};
        this.b = Leb128.serialize(bArr, bArr2, bArr3, bArr4);
        g();
    }

    private native void g();

    private native void h();

    private native void i();

    private native void j();

    private native void k();

    private native void l();

    private native void m();

    private native void n();

    public void a() {
        h();
    }

    public byte[] c() {
        i();
        return this.b;
    }

    public boolean d(byte[] bArr, byte[] bArr2) {
        this.b = Leb128.serialize(bArr, bArr2);
        j();
        return this.b[0] == (byte) 1;
    }

    public int e() {
        k();
        return this.b[0];
    }

    public byte[] f(byte[] bArr) {
        this.b = bArr;
        i();
        return this.b;
    }

    public byte[] o() {
        m();
        return this.b;
    }

    public boolean p(byte[] bArr, byte[] bArr2) {
        this.b = Leb128.serialize(bArr, bArr2);
        n();
        return this.b[0] == (byte) 1;
    }
}
