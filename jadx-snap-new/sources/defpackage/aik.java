package defpackage;

import java.io.OutputStream;

/* renamed from: aik */
final class aik {
    int a;
    int b;
    int c;
    int d;
    int e;
    private byte[] f;
    private int g;
    private int h = 12;
    private int i;
    private int j = 4096;
    private int[] k = new int[5003];
    private int[] l = new int[5003];
    private int m = 5003;
    private int n = 0;
    private boolean o = false;
    private int p;
    private int q;
    private int r;
    private int s = 0;
    private int t = 0;
    private int[] u = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    private int v;
    private byte[] w = new byte[256];

    aik(int i, int i2, byte[] bArr, int i3) {
        this.a = i;
        this.b = i2;
        this.f = bArr;
        this.c = Math.max(2, i3);
    }

    private int a() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        this.d = i - 1;
        byte[] bArr = this.f;
        int i2 = this.e;
        this.e = i2 + 1;
        return bArr[i2] & 255;
    }

    private void a(byte b, OutputStream outputStream) {
        byte[] bArr = this.w;
        int i = this.v;
        this.v = i + 1;
        bArr[i] = b;
        if (this.v >= 254) {
            a(outputStream);
        }
    }

    private void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = -1;
        }
    }

    private void a(OutputStream outputStream) {
        int i = this.v;
        if (i > 0) {
            outputStream.write(i);
            outputStream.write(this.w, 0, this.v);
            this.v = 0;
        }
    }

    private void b(int i, OutputStream outputStream) {
        int i2 = this.s;
        int[] iArr = this.u;
        int i3 = this.t;
        this.s = i2 & iArr[i3];
        if (i3 > 0) {
            this.s |= i << i3;
        } else {
            this.s = i;
        }
        i2 = this.t + this.g;
        while (true) {
            this.t = i2;
            if (this.t < 8) {
                break;
            }
            a((byte) this.s, outputStream);
            this.s >>= 8;
            i2 = this.t - 8;
        }
        if (this.n > this.i || this.o) {
            if (this.o) {
                i2 = this.p;
                this.g = i2;
                this.i = (1 << i2) - 1;
                this.o = false;
            } else {
                this.g++;
                i2 = this.g;
                this.i = i2 == this.h ? this.j : (1 << i2) - 1;
            }
        }
        if (i == this.r) {
            while (this.t > 0) {
                a((byte) this.s, outputStream);
                this.s >>= 8;
                this.t -= 8;
            }
            a(outputStream);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    public final void a(int r10, java.io.OutputStream r11) {
        /*
        r9 = this;
        r9.p = r10;
        r0 = 0;
        r9.o = r0;
        r1 = r9.p;
        r9.g = r1;
        r1 = r9.g;
        r2 = 1;
        r1 = r2 << r1;
        r1 = r1 - r2;
        r9.i = r1;
        r10 = r10 - r2;
        r10 = r2 << r10;
        r9.q = r10;
        r10 = r9.q;
        r1 = r10 + 1;
        r9.r = r1;
        r10 = r10 + 2;
        r9.n = r10;
        r9.v = r0;
        r10 = r9.a();
        r1 = r9.m;
    L_0x0028:
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r1 >= r3) goto L_0x0031;
    L_0x002c:
        r0 = r0 + 1;
        r1 = r1 << 1;
        goto L_0x0028;
    L_0x0031:
        r0 = 8 - r0;
        r1 = r9.m;
        r9.a(r1);
        r3 = r9.q;
        r9.b(r3, r11);
    L_0x003d:
        r3 = r9.a();
        r4 = -1;
        if (r3 == r4) goto L_0x009b;
    L_0x0044:
        r4 = r9.h;
        r4 = r3 << r4;
        r4 = r4 + r10;
        r5 = r3 << r0;
        r5 = r5 ^ r10;
        r6 = r9.k;
        r7 = r6[r5];
        if (r7 != r4) goto L_0x0057;
    L_0x0052:
        r10 = r9.l;
        r10 = r10[r5];
        goto L_0x003d;
    L_0x0057:
        r6 = r6[r5];
        if (r6 < 0) goto L_0x0073;
    L_0x005b:
        r6 = r1 - r5;
        if (r5 != 0) goto L_0x0060;
    L_0x005f:
        r6 = 1;
    L_0x0060:
        r5 = r5 - r6;
        if (r5 >= 0) goto L_0x0064;
    L_0x0063:
        r5 = r5 + r1;
    L_0x0064:
        r7 = r9.k;
        r8 = r7[r5];
        if (r8 != r4) goto L_0x006f;
    L_0x006a:
        r10 = r9.l;
        r10 = r10[r5];
        goto L_0x003d;
    L_0x006f:
        r7 = r7[r5];
        if (r7 >= 0) goto L_0x0060;
    L_0x0073:
        r9.b(r10, r11);
        r10 = r9.n;
        r6 = r9.j;
        if (r10 >= r6) goto L_0x0089;
    L_0x007c:
        r6 = r9.l;
        r7 = r10 + 1;
        r9.n = r7;
        r6[r5] = r10;
        r10 = r9.k;
        r10[r5] = r4;
        goto L_0x0099;
    L_0x0089:
        r10 = r9.m;
        r9.a(r10);
        r10 = r9.q;
        r4 = r10 + 2;
        r9.n = r4;
        r9.o = r2;
        r9.b(r10, r11);
    L_0x0099:
        r10 = r3;
        goto L_0x003d;
    L_0x009b:
        r9.b(r10, r11);
        r10 = r9.r;
        r9.b(r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aik.a(int, java.io.OutputStream):void");
    }
}
