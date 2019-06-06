package defpackage;

import defpackage.bqg.d;

/* renamed from: bqc */
public final class bqc implements bqg {
    private final bqb a;
    private final bzc b = new bzc(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public bqc(bqb bqb) {
        this.a = bqb;
    }

    public final void a() {
        this.f = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    public final void a(defpackage.bzc r11, boolean r12) {
        /*
        r10 = this;
        r0 = -1;
        if (r12 == 0) goto L_0x000b;
    L_0x0003:
        r1 = r11.d();
        r2 = r11.b;
        r1 = r1 + r2;
        goto L_0x000c;
    L_0x000b:
        r1 = -1;
    L_0x000c:
        r2 = r10.f;
        r3 = 0;
        if (r2 == 0) goto L_0x001b;
    L_0x0011:
        if (r12 != 0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r10.f = r3;
        r11.c(r1);
    L_0x0019:
        r10.d = r3;
    L_0x001b:
        r12 = r11.b();
        if (r12 <= 0) goto L_0x0107;
    L_0x0021:
        r12 = r10.d;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2 = 3;
        r4 = 1;
        if (r12 >= r2) goto L_0x00aa;
    L_0x0029:
        if (r12 != 0) goto L_0x003a;
    L_0x002b:
        r12 = r11.d();
        r5 = r11.b;
        r5 = r5 - r4;
        r11.c(r5);
        if (r12 != r1) goto L_0x003a;
    L_0x0037:
        r10.f = r4;
        return;
    L_0x003a:
        r12 = r11.b();
        r1 = r10.d;
        r1 = 3 - r1;
        r12 = java.lang.Math.min(r12, r1);
        r1 = r10.b;
        r1 = r1.a;
        r5 = r10.d;
        r11.a(r1, r5, r12);
        r1 = r10.d;
        r1 = r1 + r12;
        r10.d = r1;
        r12 = r10.d;
        if (r12 != r2) goto L_0x001b;
    L_0x0058:
        r12 = r10.b;
        r12.a(r2);
        r12 = r10.b;
        r12.d(r4);
        r12 = r10.b;
        r12 = r12.d();
        r1 = r10.b;
        r1 = r1.d();
        r5 = r12 & 128;
        if (r5 == 0) goto L_0x0074;
    L_0x0072:
        r5 = 1;
        goto L_0x0075;
    L_0x0074:
        r5 = 0;
    L_0x0075:
        r10.e = r5;
        r12 = r12 & 15;
        r12 = r12 << 8;
        r12 = r12 | r1;
        r12 = r12 + r2;
        r10.c = r12;
        r12 = r10.b;
        r12 = r12.c();
        r1 = r10.c;
        if (r12 >= r1) goto L_0x001b;
    L_0x0089:
        r12 = r10.b;
        r12 = r12.a;
        r1 = r10.b;
        r5 = 4098; // 0x1002 float:5.743E-42 double:2.0247E-320;
        r6 = r10.c;
        r7 = r12.length;
        r4 = r7 << 1;
        r4 = java.lang.Math.max(r6, r4);
        r4 = java.lang.Math.min(r5, r4);
        r1.a(r4);
        r1 = r10.b;
        r1 = r1.a;
        java.lang.System.arraycopy(r12, r3, r1, r3, r2);
        goto L_0x001b;
    L_0x00aa:
        r12 = r11.b();
        r2 = r10.c;
        r5 = r10.d;
        r2 = r2 - r5;
        r12 = java.lang.Math.min(r12, r2);
        r2 = r10.b;
        r2 = r2.a;
        r5 = r10.d;
        r11.a(r2, r5, r12);
        r2 = r10.d;
        r2 = r2 + r12;
        r10.d = r2;
        r12 = r10.d;
        r2 = r10.c;
        if (r12 != r2) goto L_0x001b;
    L_0x00cb:
        r12 = r10.e;
        if (r12 == 0) goto L_0x00f9;
    L_0x00cf:
        r12 = r10.b;
        r12 = r12.a;
        r2 = r10.c;
        r5 = 0;
        r6 = -1;
    L_0x00d7:
        if (r5 >= r2) goto L_0x00ea;
    L_0x00d9:
        r7 = r6 << 8;
        r8 = defpackage.bzo.f;
        r6 = r6 >>> 24;
        r9 = r12[r5];
        r9 = r9 & r1;
        r6 = r6 ^ r9;
        r6 = r6 & r1;
        r6 = r8[r6];
        r6 = r6 ^ r7;
        r5 = r5 + 1;
        goto L_0x00d7;
    L_0x00ea:
        if (r6 == 0) goto L_0x00ef;
    L_0x00ec:
        r10.f = r4;
        return;
    L_0x00ef:
        r12 = r10.b;
        r1 = r10.c;
        r1 = r1 + -4;
        r12.a(r1);
        goto L_0x00fe;
    L_0x00f9:
        r12 = r10.b;
        r12.a(r2);
    L_0x00fe:
        r12 = r10.a;
        r1 = r10.b;
        r12.a(r1);
        goto L_0x0019;
    L_0x0107:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqc.a(bzc, boolean):void");
    }

    public final void a(bzl bzl, bnm bnm, d dVar) {
        this.a.a(bzl, bnm, dVar);
        this.f = true;
    }
}
