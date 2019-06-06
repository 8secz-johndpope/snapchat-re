package defpackage;

/* renamed from: akkr */
final class akkr {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    akkr f;
    akkr g;

    akkr() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    akkr(akkr akkr) {
        this(akkr.a, akkr.b, akkr.c);
        akkr.d = true;
    }

    akkr(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public final akkr a() {
        akkr akkr = this.f;
        if (akkr == this) {
            akkr = null;
        }
        akkr akkr2 = this.g;
        akkr2.f = this.f;
        this.f.g = akkr2;
        this.f = null;
        this.g = null;
        return akkr;
    }

    public final akkr a(akkr akkr) {
        akkr.g = this;
        akkr.f = this.f;
        this.f.g = akkr;
        this.f = akkr;
        return akkr;
    }

    public final void a(akkr akkr, int i) {
        if (akkr.e) {
            int i2 = akkr.c;
            if (i2 + i > 8192) {
                if (akkr.d) {
                    throw new IllegalArgumentException();
                }
                int i3 = i2 + i;
                int i4 = akkr.b;
                if (i3 - i4 <= 8192) {
                    byte[] bArr = akkr.a;
                    System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                    akkr.c -= akkr.b;
                    akkr.b = 0;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, akkr.a, akkr.c, i);
            akkr.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
