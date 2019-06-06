package defpackage;

import defpackage.bns.b;
import java.util.Arrays;

/* renamed from: bnv */
public final class bnv implements bnk {
    private static final int[] a = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = bzo.b("#!AMR\n");
    private static final byte[] d = bzo.b("#!AMR-WB\n");
    private static final int e = b[8];
    private final byte[] f = new byte[1];
    private boolean g;
    private long h;
    private int i;
    private int j;
    private bnu k;
    private boolean l;

    /* renamed from: bnv$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bnv()};
        }
    }

    static {
        1 1 = new 1();
    }

    private static boolean a(bnl bnl, byte[] bArr) {
        bnl.a();
        byte[] bArr2 = new byte[bArr.length];
        bnl.c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private boolean b(bnl bnl) {
        int length;
        if (bnv.a(bnl, c)) {
            this.g = false;
            length = c.length;
        } else if (!bnv.a(bnl, d)) {
            return false;
        } else {
            this.g = true;
            length = d.length;
        }
        bnl.b(length);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A:{Catch:{ EOFException -> 0x0090 }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A:{Catch:{ EOFException -> 0x0090 }} */
    /* JADX WARNING: Missing block: B:25:0x0040, code skipped:
            if (r4 != null) goto L_0x0042;
     */
    private int c(defpackage.bnl r12) {
        /*
        r11 = this;
        r0 = r11.j;
        r1 = -1;
        r2 = 1;
        r3 = 0;
        if (r0 != 0) goto L_0x0091;
    L_0x0007:
        r12.a();	 Catch:{ EOFException -> 0x0090 }
        r0 = r11.f;	 Catch:{ EOFException -> 0x0090 }
        r12.c(r0, r3, r2);	 Catch:{ EOFException -> 0x0090 }
        r0 = r11.f;	 Catch:{ EOFException -> 0x0090 }
        r0 = r0[r3];	 Catch:{ EOFException -> 0x0090 }
        r4 = r0 & 131;
        if (r4 > 0) goto L_0x0080;
    L_0x0017:
        r0 = r0 >> 3;
        r4 = 15;
        r0 = r0 & r4;
        if (r0 < 0) goto L_0x0044;
    L_0x001e:
        if (r0 > r4) goto L_0x0044;
    L_0x0020:
        r4 = r11.g;	 Catch:{ EOFException -> 0x0090 }
        if (r4 == 0) goto L_0x002e;
    L_0x0024:
        r4 = 10;
        if (r0 < r4) goto L_0x002c;
    L_0x0028:
        r4 = 13;
        if (r0 <= r4) goto L_0x002e;
    L_0x002c:
        r4 = 1;
        goto L_0x002f;
    L_0x002e:
        r4 = 0;
    L_0x002f:
        if (r4 != 0) goto L_0x0042;
    L_0x0031:
        r4 = r11.g;	 Catch:{ EOFException -> 0x0090 }
        if (r4 != 0) goto L_0x003f;
    L_0x0035:
        r4 = 12;
        if (r0 < r4) goto L_0x003d;
    L_0x0039:
        r4 = 14;
        if (r0 <= r4) goto L_0x003f;
    L_0x003d:
        r4 = 1;
        goto L_0x0040;
    L_0x003f:
        r4 = 0;
    L_0x0040:
        if (r4 == 0) goto L_0x0044;
    L_0x0042:
        r4 = 1;
        goto L_0x0045;
    L_0x0044:
        r4 = 0;
    L_0x0045:
        if (r4 != 0) goto L_0x006c;
    L_0x0047:
        r12 = new bln;	 Catch:{ EOFException -> 0x0090 }
        r2 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x0090 }
        r3 = "Illegal AMR ";
        r2.<init>(r3);	 Catch:{ EOFException -> 0x0090 }
        r3 = r11.g;	 Catch:{ EOFException -> 0x0090 }
        if (r3 == 0) goto L_0x0057;
    L_0x0054:
        r3 = "WB";
        goto L_0x0059;
    L_0x0057:
        r3 = "NB";
    L_0x0059:
        r2.append(r3);	 Catch:{ EOFException -> 0x0090 }
        r3 = " frame type ";
        r2.append(r3);	 Catch:{ EOFException -> 0x0090 }
        r2.append(r0);	 Catch:{ EOFException -> 0x0090 }
        r0 = r2.toString();	 Catch:{ EOFException -> 0x0090 }
        r12.<init>(r0);	 Catch:{ EOFException -> 0x0090 }
        throw r12;	 Catch:{ EOFException -> 0x0090 }
    L_0x006c:
        r4 = r11.g;	 Catch:{ EOFException -> 0x0090 }
        if (r4 == 0) goto L_0x0075;
    L_0x0070:
        r4 = b;	 Catch:{ EOFException -> 0x0090 }
        r0 = r4[r0];	 Catch:{ EOFException -> 0x0090 }
        goto L_0x0079;
    L_0x0075:
        r4 = a;	 Catch:{ EOFException -> 0x0090 }
        r0 = r4[r0];	 Catch:{ EOFException -> 0x0090 }
    L_0x0079:
        r11.i = r0;	 Catch:{ EOFException -> 0x0090 }
        r0 = r11.i;
        r11.j = r0;
        goto L_0x0091;
    L_0x0080:
        r12 = new bln;	 Catch:{ EOFException -> 0x0090 }
        r2 = "Invalid padding bits for frame header ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ EOFException -> 0x0090 }
        r0 = r2.concat(r0);	 Catch:{ EOFException -> 0x0090 }
        r12.<init>(r0);	 Catch:{ EOFException -> 0x0090 }
        throw r12;	 Catch:{ EOFException -> 0x0090 }
    L_0x0090:
        return r1;
    L_0x0091:
        r0 = r11.k;
        r4 = r11.j;
        r12 = r0.a(r12, r4, r2);
        if (r12 != r1) goto L_0x009c;
    L_0x009b:
        return r1;
    L_0x009c:
        r0 = r11.j;
        r0 = r0 - r12;
        r11.j = r0;
        r12 = r11.j;
        if (r12 <= 0) goto L_0x00a6;
    L_0x00a5:
        return r3;
    L_0x00a6:
        r4 = r11.k;
        r5 = r11.h;
        r7 = 1;
        r8 = r11.i;
        r9 = 0;
        r10 = 0;
        r4.a(r5, r7, r8, r9, r10);
        r0 = r11.h;
        r4 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0 = r0 + r4;
        r11.h = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnv.c(bnl):int");
    }

    public final int a(bnl bnl, bnr bnr) {
        if (bnl.c() != 0 || b(bnl)) {
            if (!this.l) {
                this.l = true;
                this.k.a(blg.a(null, this.g ? "audio/amr-wb" : "audio/3gpp", null, -1, e, 1, this.g ? 16000 : 8000, -1, null, null, 0, null));
            }
            return c(bnl);
        }
        throw new bln("Could not find AMR header.");
    }

    public final void a(long j, long j2) {
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }

    public final void a(bnm bnm) {
        bnm.a(new b(-9223372036854775807L));
        this.k = bnm.a(0, 1);
        bnm.a();
    }

    public final boolean a(bnl bnl) {
        return b(bnl);
    }
}
