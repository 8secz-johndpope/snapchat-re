package defpackage;

import defpackage.bly.a;

/* renamed from: bsq */
public final class bsq extends bly {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final Object k;

    public bsq(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = z;
        this.j = z2;
        this.k = obj;
    }

    private bsq(long j, long j2, boolean z, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, 0, 0, z, false, obj);
    }

    public bsq(long j, boolean z, Object obj) {
        this(j, j, z, obj);
    }

    public final int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
    }

    public final a a(int i, a aVar, boolean z) {
        byo.a(i, 1);
        return aVar.a(null, z ? b : null, this.e, -this.g);
    }

    /* JADX WARNING: Missing block: B:12:0x002c, code skipped:
            if (r1 > r7) goto L_0x0026;
     */
    public final defpackage.bly.b a(int r18, defpackage.bly.b r19, boolean r20, long r21) {
        /*
        r17 = this;
        r0 = r17;
        r1 = 1;
        r2 = r18;
        defpackage.byo.a(r2, r1);
        if (r20 == 0) goto L_0x000d;
    L_0x000a:
        r1 = r0.k;
        goto L_0x000e;
    L_0x000d:
        r1 = 0;
    L_0x000e:
        r3 = r1;
        r1 = r0.h;
        r4 = r0.j;
        r5 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r4 == 0) goto L_0x002f;
    L_0x001a:
        r7 = 0;
        r4 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x002f;
    L_0x0020:
        r7 = r0.f;
        r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r4 != 0) goto L_0x0028;
    L_0x0026:
        r10 = r5;
        goto L_0x0030;
    L_0x0028:
        r1 = r1 + r21;
        r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r4 <= 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0026;
    L_0x002f:
        r10 = r1;
    L_0x0030:
        r4 = r0.c;
        r6 = r0.d;
        r8 = r0.i;
        r9 = r0.j;
        r12 = r0.f;
        r14 = 0;
        r1 = r0.g;
        r15 = r1;
        r2 = r19;
        r1 = r2.a(r3, r4, r6, r8, r9, r10, r12, r14, r15);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsq.a(int, bly$b, boolean, long):bly$b");
    }

    public final int b() {
        return 1;
    }

    public final int c() {
        return 1;
    }
}
