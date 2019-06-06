package defpackage;

import java.util.Arrays;

/* renamed from: akkt */
final class akkt extends akkg {
    private transient byte[][] c;
    private transient int[] d;

    akkt(akkd akkd, int i) {
        super(null);
        akkx.a(akkd.b, 0, (long) i);
        int i2 = 0;
        akkr akkr = akkd.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (akkr.c != akkr.b) {
                i3 += akkr.c - akkr.b;
                i4++;
                akkr = akkr.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.c = new byte[i4][];
        this.d = new int[(i4 << 1)];
        akkr akkr2 = akkd.a;
        int i5 = 0;
        while (i2 < i) {
            this.c[i5] = akkr2.a;
            i2 += akkr2.c - akkr2.b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.d;
            iArr[i5] = i2;
            iArr[this.c.length + i5] = akkr2.b;
            akkr2.d = true;
            i5++;
            akkr2 = akkr2.f;
        }
    }

    private int b(int i) {
        i = Arrays.binarySearch(this.d, 0, this.c.length, i + 1);
        return i >= 0 ? i : i ^ -1;
    }

    private akkg i() {
        return new akkg(h());
    }

    public final byte a(int i) {
        akkx.a((long) this.d[this.c.length - 1], (long) i, 1);
        int b = b(i);
        int i2 = b == 0 ? 0 : this.d[b - 1];
        int[] iArr = this.d;
        byte[][] bArr = this.c;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    public final akkg a(int i, int i2) {
        return i().a(i, i2);
    }

    public final String a() {
        return i().a();
    }

    /* Access modifiers changed, original: final */
    public final void a(akkd akkd) {
        int length = this.c.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.d;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            akkr akkr = new akkr(this.c[i], i3, (i3 + i4) - i2);
            if (akkd.a == null) {
                akkr.g = akkr;
                akkr.f = akkr;
                akkd.a = akkr;
            } else {
                akkd.a.g.a(akkr);
            }
            i++;
            i2 = i4;
        }
        akkd.b += (long) i2;
    }

    public final boolean a(int i, akkg akkg, int i2, int i3) {
        if (g() - i3 < 0) {
            return false;
        }
        int b = b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.d[b - 1];
            int min = Math.min(i3, ((this.d[b] - i4) + i4) - i);
            int[] iArr = this.d;
            byte[][] bArr = this.c;
            if (!akkg.a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.d[b - 1];
            int min = Math.min(i3, ((this.d[b] - i4) + i4) - i);
            int[] iArr = this.d;
            byte[][] bArr2 = this.c;
            if (!akkx.a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public final String b() {
        return i().b();
    }

    public final akkg c() {
        return i().c();
    }

    public final akkg d() {
        return i().d();
    }

    public final String e() {
        return i().e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akkg) {
            akkg akkg = (akkg) obj;
            return akkg.g() == g() && a(0, akkg, 0, g());
        }
    }

    public final akkg f() {
        return i().f();
    }

    public final int g() {
        return this.d[this.c.length - 1];
    }

    public final byte[] h() {
        int[] iArr = this.d;
        byte[][] bArr = this.c;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.d;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.c[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        i = this.c.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < i) {
            byte[] bArr = this.c[i2];
            int[] iArr = this.d;
            int i5 = iArr[i + i2];
            int i6 = iArr[i2];
            i4 = (i6 - i4) + i5;
            while (i5 < i4) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    public final String toString() {
        return i().toString();
    }
}
