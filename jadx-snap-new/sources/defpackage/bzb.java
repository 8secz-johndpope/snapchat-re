package defpackage;

/* renamed from: bzb */
public final class bzb {
    public byte[] a;
    public int b;
    public int c;
    private int d;

    public bzb(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public bzb(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final int a() {
        return ((this.d - this.b) << 3) - this.c;
    }

    public final void a(int i) {
        this.b = i / 8;
        this.c = i - (this.b << 3);
        g();
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final int b() {
        return (this.b << 3) + this.c;
    }

    public final void b(int i) {
        int i2 = i / 8;
        this.b += i2;
        this.c += i - (i2 << 3);
        i = this.c;
        if (i > 7) {
            this.b++;
            this.c = i - 8;
        }
        g();
    }

    public final void b(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = (i >> 3) + 0;
        for (i2 = 0; i2 < i4; i2++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            byte b = bArr2[i5];
            i3 = this.c;
            bArr[i2] = (byte) (b << i3);
            bArr[i2] = (byte) (((255 & bArr2[this.b]) >> (8 - i3)) | bArr[i2]);
        }
        i &= 7;
        if (i != 0) {
            bArr[i4] = (byte) (bArr[i4] & (255 >> i));
            i2 = this.c;
            if (i2 + i > 8) {
                byte b2 = bArr[i4];
                byte[] bArr3 = this.a;
                i3 = this.b;
                this.b = i3 + 1;
                bArr[i4] = (byte) (b2 | ((bArr3[i3] & 255) << i2));
                this.c = i2 - 8;
            }
            this.c += i;
            byte[] bArr4 = this.a;
            int i6 = this.b;
            i2 = bArr4[i6] & 255;
            int i7 = this.c;
            bArr[i4] = (byte) (((byte) ((i2 >> (8 - i7)) << (8 - i))) | bArr[i4]);
            if (i7 == 8) {
                this.c = 0;
                this.b = i6 + 1;
            }
            g();
        }
    }

    public final int c() {
        byo.b(this.c == 0);
        return this.b;
    }

    public final int c(int i) {
        if (i == 0) {
            return 0;
        }
        int i2;
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            this.c = i2 - 8;
            byte[] bArr = this.a;
            int i4 = this.b;
            this.b = i4 + 1;
            i3 |= (bArr[i4] & 255) << this.c;
        }
        byte[] bArr2 = this.a;
        int i5 = this.b;
        i = (-1 >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i5 + 1;
        }
        g();
        return i;
    }

    public final void c(byte[] bArr, int i) {
        byo.b(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, 0, i);
        this.b += i;
        g();
    }

    public final void d() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        g();
    }

    public final boolean e() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        d();
        return z;
    }

    public final void f() {
        if (this.c != 0) {
            this.c = 0;
            this.b++;
            g();
        }
    }

    public final void g() {
        boolean z;
        int i = this.b;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2 || (i == i2 && this.c == 0)) {
                z = true;
                byo.b(z);
            }
        }
        z = false;
        byo.b(z);
    }
}
