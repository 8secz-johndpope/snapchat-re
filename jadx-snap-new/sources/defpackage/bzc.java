package defpackage;

import java.nio.charset.Charset;

/* renamed from: bzc */
public final class bzc {
    public byte[] a;
    public int b;
    public int c;

    public bzc(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public bzc(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public bzc(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final void a(int i) {
        a(c() < i ? new byte[i] : this.a, i);
    }

    public final void a(bzb bzb, int i) {
        a(bzb.a, 0, i);
        bzb.a(0);
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final void b(int i) {
        boolean z = i >= 0 && i <= this.a.length;
        byo.a(z);
        this.c = i;
    }

    public final int c() {
        byte[] bArr = this.a;
        return bArr == null ? 0 : bArr.length;
    }

    public final void c(int i) {
        boolean z = i >= 0 && i <= this.c;
        byo.a(z);
        this.b = i;
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final void d(int i) {
        c(this.b + i);
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        i = (bArr[i] & 255) << 8;
        int i2 = this.b;
        this.b = i2 + 1;
        return (bArr[i2] & 255) | i;
    }

    public final String e(int i) {
        return a(i, Charset.forName("UTF-8"));
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        i = bArr[i] & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i;
    }

    public final String f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.b + i) - 1;
        i2 = (i2 >= this.c || this.a[i2] != (byte) 0) ? i : i - 1;
        String a = bzo.a(this.a, this.b, i2);
        this.b += i;
        return a;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        i = (bArr[i] & 255) << 16;
        int i2 = this.b;
        this.b = i2 + 1;
        i |= (bArr[i2] & 255) << 8;
        i2 = this.b;
        this.b = i2 + 1;
        return (bArr[i2] & 255) | i;
    }

    public final long h() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        int i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 16;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 8;
        i2 = this.b;
        this.b = i2 + 1;
        return j | (255 & ((long) bArr[i2]));
    }

    public final long i() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 8;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 16;
        i2 = this.b;
        this.b = i2 + 1;
        return j | ((255 & ((long) bArr[i2])) << 24);
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        i = (bArr[i] & 255) << 24;
        int i2 = this.b;
        this.b = i2 + 1;
        i |= (bArr[i2] & 255) << 16;
        i2 = this.b;
        this.b = i2 + 1;
        i |= (bArr[i2] & 255) << 8;
        i2 = this.b;
        this.b = i2 + 1;
        return (bArr[i2] & 255) | i;
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        i = bArr[i] & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        i |= (bArr[i2] & 255) << 8;
        i2 = this.b;
        this.b = i2 + 1;
        i |= (bArr[i2] & 255) << 16;
        i2 = this.b;
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 24) | i;
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 48;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 40;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 32;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 24;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 16;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 8;
        i2 = this.b;
        this.b = i2 + 1;
        return j | (255 & ((long) bArr[i2]));
    }

    public final long m() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 8;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 16;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 24;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 32;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 40;
        i2 = this.b;
        this.b = i2 + 1;
        j |= (((long) bArr[i2]) & 255) << 48;
        i2 = this.b;
        this.b = i2 + 1;
        return j | ((255 & ((long) bArr[i2])) << 56);
    }

    public final int n() {
        return (((d() << 21) | (d() << 14)) | (d() << 7)) | d();
    }

    public final int o() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(j)));
    }

    public final int p() {
        int k = k();
        if (k >= 0) {
            return k;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(k)));
    }

    public final long q() {
        long l = l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(l)));
    }

    public final String r() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != (byte) 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String a = bzo.a(bArr, i2, i - i2);
        this.b = i;
        i = this.b;
        if (i < this.c) {
            this.b = i + 1;
        }
        return a;
    }

    public final String s() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !bzo.a(this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == (byte) -17 && bArr[i2 + 1] == (byte) -69 && bArr[i2 + 2] == (byte) -65) {
                this.b = i2 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.b;
        String a = bzo.a(bArr2, i3, i - i3);
        this.b = i;
        i = this.b;
        i3 = this.c;
        if (i == i3) {
            return a;
        }
        if (this.a[i] == (byte) 13) {
            this.b = i + 1;
            if (this.b == i3) {
                return a;
            }
        }
        byte[] bArr3 = this.a;
        i3 = this.b;
        if (bArr3[i3] == (byte) 10) {
            this.b = i3 + 1;
        }
        return a;
    }
}
