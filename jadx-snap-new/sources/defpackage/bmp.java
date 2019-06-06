package defpackage;

import defpackage.bmf.a;
import java.nio.ByteBuffer;

/* renamed from: bmp */
final class bmp implements bmf {
    private int b = -1;
    private int c = -1;
    private int d = 0;
    private ByteBuffer e = a;
    private ByteBuffer f = a;
    private boolean g;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A:{LOOP_START, PHI: r0 , LOOP:2: B:23:0x0081->B:24:0x0083} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    public final void a(java.nio.ByteBuffer r8) {
        /*
        r7 = this;
        r0 = r8.position();
        r1 = r8.limit();
        r2 = r1 - r0;
        r3 = r7.d;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 3;
        if (r3 == r5) goto L_0x0020;
    L_0x0013:
        if (r3 == r6) goto L_0x0021;
    L_0x0015:
        if (r3 != r4) goto L_0x001a;
    L_0x0017:
        r2 = r2 / 2;
        goto L_0x0023;
    L_0x001a:
        r8 = new java.lang.IllegalStateException;
        r8.<init>();
        throw r8;
    L_0x0020:
        r2 = r2 / r6;
    L_0x0021:
        r2 = r2 << 1;
    L_0x0023:
        r3 = r7.e;
        r3 = r3.capacity();
        if (r3 >= r2) goto L_0x003a;
    L_0x002b:
        r2 = java.nio.ByteBuffer.allocateDirect(r2);
        r3 = java.nio.ByteOrder.nativeOrder();
        r2 = r2.order(r3);
        r7.e = r2;
        goto L_0x003f;
    L_0x003a:
        r2 = r7.e;
        r2.clear();
    L_0x003f:
        r2 = r7.d;
        if (r2 == r5) goto L_0x0081;
    L_0x0043:
        if (r2 == r6) goto L_0x0068;
    L_0x0045:
        if (r2 != r4) goto L_0x0062;
    L_0x0047:
        if (r0 >= r1) goto L_0x009c;
    L_0x0049:
        r2 = r7.e;
        r3 = r0 + 2;
        r3 = r8.get(r3);
        r2.put(r3);
        r2 = r7.e;
        r3 = r0 + 3;
        r3 = r8.get(r3);
        r2.put(r3);
        r0 = r0 + 4;
        goto L_0x0047;
    L_0x0062:
        r8 = new java.lang.IllegalStateException;
        r8.<init>();
        throw r8;
    L_0x0068:
        if (r0 >= r1) goto L_0x009c;
    L_0x006a:
        r2 = r7.e;
        r3 = 0;
        r2.put(r3);
        r2 = r7.e;
        r3 = r8.get(r0);
        r3 = r3 & 255;
        r3 = r3 + -128;
        r3 = (byte) r3;
        r2.put(r3);
        r0 = r0 + 1;
        goto L_0x0068;
    L_0x0081:
        if (r0 >= r1) goto L_0x009c;
    L_0x0083:
        r2 = r7.e;
        r3 = r0 + 1;
        r3 = r8.get(r3);
        r2.put(r3);
        r2 = r7.e;
        r3 = r0 + 2;
        r3 = r8.get(r3);
        r2.put(r3);
        r0 = r0 + 3;
        goto L_0x0081;
    L_0x009c:
        r0 = r8.limit();
        r8.position(r0);
        r8 = r7.e;
        r8.flip();
        r8 = r7.e;
        r7.f = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmp.a(java.nio.ByteBuffer):void");
    }

    public final boolean a() {
        int i = this.d;
        return (i == 0 || i == 2) ? false : true;
    }

    public final boolean a(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != AudioPlayer.INFINITY_LOOP_COUNT) {
            throw new a(i, i2, i3);
        } else if (this.b == i && this.c == i2 && this.d == i3) {
            return false;
        } else {
            this.b = i;
            this.c = i2;
            this.d = i3;
            return true;
        }
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.b;
    }

    public final void e() {
        this.g = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f;
        this.f = a;
        return byteBuffer;
    }

    public final boolean g() {
        return this.g && this.f == a;
    }

    public final void h() {
        this.f = a;
        this.g = false;
    }

    public final void i() {
        h();
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = a;
    }
}
