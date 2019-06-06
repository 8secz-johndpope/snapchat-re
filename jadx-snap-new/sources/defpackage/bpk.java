package defpackage;

import defpackage.bns.b;
import defpackage.bqg.d;

/* renamed from: bpk */
public final class bpk implements bnk {
    private static final int a = bzo.f("ID3");
    private final long b;
    private final bpl c;
    private final bzc d;
    private boolean e;

    /* renamed from: bpk$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bpk()};
        }
    }

    static {
        1 1 = new 1();
    }

    public bpk() {
        this((byte) 0);
    }

    private bpk(byte b) {
        this.b = 0;
        this.c = new bpl();
        this.d = new bzc(2786);
    }

    public final int a(bnl bnl, bnr bnr) {
        int a = bnl.a(this.d.a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.d.c(0);
        this.d.b(a);
        if (!this.e) {
            this.c.a = 0;
            this.e = true;
        }
        this.c.a(this.d);
        return 0;
    }

    public final void a(long j, long j2) {
        this.e = false;
        this.c.a();
    }

    public final void a(bnm bnm) {
        this.c.a(bnm, new d(0, 1));
        bnm.a();
        bnm.a(new b(-9223372036854775807L));
    }

    /* JADX WARNING: Missing block: B:8:0x0041, code skipped:
            r11.a();
            r4 = r4 + 1;
     */
    /* JADX WARNING: Missing block: B:9:0x004a, code skipped:
            if ((r4 - r3) < 8192) goto L_0x004d;
     */
    /* JADX WARNING: Missing block: B:10:0x004c, code skipped:
            return false;
     */
    public final boolean a(defpackage.bnl r11) {
        /*
        r10 = this;
        r0 = new bzc;
        r1 = 10;
        r0.<init>(r1);
        r2 = 0;
        r3 = 0;
    L_0x0009:
        r4 = r0.a;
        r11.c(r4, r2, r1);
        r0.c(r2);
        r4 = r0.g();
        r5 = a;
        if (r4 != r5) goto L_0x0028;
    L_0x0019:
        r4 = 3;
        r0.d(r4);
        r4 = r0.n();
        r5 = r4 + 10;
        r3 = r3 + r5;
        r11.c(r4);
        goto L_0x0009;
    L_0x0028:
        r11.a();
        r11.c(r3);
        r4 = r3;
    L_0x002f:
        r1 = 0;
    L_0x0030:
        r5 = r0.a;
        r6 = 5;
        r11.c(r5, r2, r6);
        r0.c(r2);
        r5 = r0.e();
        r7 = 2935; // 0xb77 float:4.113E-42 double:1.45E-320;
        if (r5 == r7) goto L_0x0051;
    L_0x0041:
        r11.a();
        r4 = r4 + 1;
        r1 = r4 - r3;
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r1 < r5) goto L_0x004d;
    L_0x004c:
        return r2;
    L_0x004d:
        r11.c(r4);
        goto L_0x002f;
    L_0x0051:
        r5 = 1;
        r1 = r1 + r5;
        r7 = 4;
        if (r1 < r7) goto L_0x0057;
    L_0x0056:
        return r5;
    L_0x0057:
        r5 = r0.a;
        r8 = r5.length;
        r9 = -1;
        if (r8 >= r6) goto L_0x005f;
    L_0x005d:
        r5 = -1;
        goto L_0x006d;
    L_0x005f:
        r6 = r5[r7];
        r6 = r6 & 192;
        r6 = r6 >> 6;
        r5 = r5[r7];
        r5 = r5 & 63;
        r5 = defpackage.bmc.a(r6, r5);
    L_0x006d:
        if (r5 != r9) goto L_0x0070;
    L_0x006f:
        return r2;
    L_0x0070:
        r5 = r5 + -5;
        r11.c(r5);
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpk.a(bnl):boolean");
    }
}
