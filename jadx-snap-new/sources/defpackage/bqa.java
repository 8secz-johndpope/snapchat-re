package defpackage;

import android.util.SparseArray;
import defpackage.bns.b;

/* renamed from: bqa */
public final class bqa implements bnk {
    private final bzl a;
    private final SparseArray<a> b;
    private final bzc c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private bnm h;

    /* renamed from: bqa$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bqa()};
        }
    }

    /* renamed from: bqa$a */
    static final class a {
        final bpr a;
        final bzl b;
        final bzb c = new bzb(new byte[64]);
        boolean d;
        boolean e;
        boolean f;
        int g;
        long h;

        public a(bpr bpr, bzl bzl) {
            this.a = bpr;
            this.b = bzl;
        }
    }

    static {
        1 1 = new 1();
    }

    public bqa() {
        this(new bzl(0));
    }

    private bqa(bzl bzl) {
        this.a = bzl;
        this.c = new bzc(4096);
        this.b = new SparseArray();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    public final int a(defpackage.bnl r14, defpackage.bnr r15) {
        /*
        r13 = this;
        r15 = r13.c;
        r15 = r15.a;
        r0 = 4;
        r1 = 1;
        r2 = 0;
        r15 = r14.b(r15, r2, r0, r1);
        r3 = -1;
        if (r15 != 0) goto L_0x000f;
    L_0x000e:
        return r3;
    L_0x000f:
        r15 = r13.c;
        r15.c(r2);
        r15 = r13.c;
        r15 = r15.j();
        r4 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        if (r15 != r4) goto L_0x001f;
    L_0x001e:
        return r3;
    L_0x001f:
        r3 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        if (r15 != r3) goto L_0x0041;
    L_0x0023:
        r15 = r13.c;
        r15 = r15.a;
        r0 = 10;
        r14.c(r15, r2, r0);
        r15 = r13.c;
        r0 = 9;
        r15.c(r0);
        r15 = r13.c;
        r15 = r15.d();
        r15 = r15 & 7;
        r15 = r15 + 14;
    L_0x003d:
        r14.b(r15);
        return r2;
    L_0x0041:
        r3 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r4 = 2;
        r5 = 6;
        if (r15 != r3) goto L_0x005b;
    L_0x0047:
        r15 = r13.c;
        r15 = r15.a;
        r14.c(r15, r2, r4);
        r15 = r13.c;
        r15.c(r2);
        r15 = r13.c;
        r15 = r15.e();
        r15 = r15 + r5;
        goto L_0x003d;
    L_0x005b:
        r3 = r15 & -256;
        r6 = 8;
        r3 = r3 >> r6;
        if (r3 == r1) goto L_0x0066;
    L_0x0062:
        r14.b(r1);
        return r2;
    L_0x0066:
        r15 = r15 & 255;
        r3 = r13.b;
        r3 = r3.get(r15);
        r3 = (defpackage.bqa.a) r3;
        r7 = r13.d;
        if (r7 != 0) goto L_0x00dd;
    L_0x0074:
        if (r3 != 0) goto L_0x00bd;
    L_0x0076:
        r7 = 0;
        r8 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        if (r15 != r8) goto L_0x0089;
    L_0x007b:
        r7 = new bpl;
        r7.<init>();
    L_0x0080:
        r13.e = r1;
    L_0x0082:
        r8 = r14.c();
        r13.g = r8;
        goto L_0x00a3;
    L_0x0089:
        r8 = r15 & 224;
        r9 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        if (r8 != r9) goto L_0x0095;
    L_0x008f:
        r7 = new bpx;
        r7.<init>();
        goto L_0x0080;
    L_0x0095:
        r8 = r15 & 240;
        r9 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        if (r8 != r9) goto L_0x00a3;
    L_0x009b:
        r7 = new bps;
        r7.<init>();
        r13.f = r1;
        goto L_0x0082;
    L_0x00a3:
        if (r7 == 0) goto L_0x00bd;
    L_0x00a5:
        r3 = new bqg$d;
        r8 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r3.<init>(r15, r8);
        r8 = r13.h;
        r7.a(r8, r3);
        r3 = new bqa$a;
        r8 = r13.a;
        r3.<init>(r7, r8);
        r7 = r13.b;
        r7.put(r15, r3);
    L_0x00bd:
        r15 = r13.e;
        if (r15 == 0) goto L_0x00cb;
    L_0x00c1:
        r15 = r13.f;
        if (r15 == 0) goto L_0x00cb;
    L_0x00c5:
        r7 = r13.g;
        r9 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r7 = r7 + r9;
        goto L_0x00ce;
    L_0x00cb:
        r7 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
    L_0x00ce:
        r9 = r14.c();
        r15 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r15 <= 0) goto L_0x00dd;
    L_0x00d6:
        r13.d = r1;
        r15 = r13.h;
        r15.a();
    L_0x00dd:
        r15 = r13.c;
        r15 = r15.a;
        r14.c(r15, r2, r4);
        r15 = r13.c;
        r15.c(r2);
        r15 = r13.c;
        r15 = r15.e();
        r15 = r15 + r5;
        if (r3 != 0) goto L_0x00f7;
    L_0x00f2:
        r14.b(r15);
        goto L_0x01de;
    L_0x00f7:
        r4 = r13.c;
        r4.a(r15);
        r4 = r13.c;
        r4 = r4.a;
        r14.b(r4, r2, r15);
        r14 = r13.c;
        r14.c(r5);
        r14 = r13.c;
        r15 = r3.c;
        r15 = r15.a;
        r4 = 3;
        r14.a(r15, r2, r4);
        r15 = r3.c;
        r15.a(r2);
        r15 = r3.c;
        r15.b(r6);
        r15 = r3.c;
        r15 = r15.e();
        r3.d = r15;
        r15 = r3.c;
        r15 = r15.e();
        r3.e = r15;
        r15 = r3.c;
        r15.b(r5);
        r15 = r3.c;
        r15 = r15.c(r6);
        r3.g = r15;
        r15 = r3.c;
        r15 = r15.a;
        r5 = r3.g;
        r14.a(r15, r2, r5);
        r15 = r3.c;
        r15.a(r2);
        r5 = 0;
        r3.h = r5;
        r15 = r3.d;
        if (r15 == 0) goto L_0x01c4;
    L_0x014f:
        r15 = r3.c;
        r15.b(r0);
        r15 = r3.c;
        r15 = r15.c(r4);
        r5 = (long) r15;
        r15 = 30;
        r5 = r5 << r15;
        r7 = r3.c;
        r7.b(r1);
        r7 = r3.c;
        r8 = 15;
        r7 = r7.c(r8);
        r7 = r7 << r8;
        r9 = (long) r7;
        r5 = r5 | r9;
        r7 = r3.c;
        r7.b(r1);
        r7 = r3.c;
        r7 = r7.c(r8);
        r9 = (long) r7;
        r5 = r5 | r9;
        r7 = r3.c;
        r7.b(r1);
        r7 = r3.f;
        if (r7 != 0) goto L_0x01bc;
    L_0x0184:
        r7 = r3.e;
        if (r7 == 0) goto L_0x01bc;
    L_0x0188:
        r7 = r3.c;
        r7.b(r0);
        r0 = r3.c;
        r0 = r0.c(r4);
        r9 = (long) r0;
        r9 = r9 << r15;
        r15 = r3.c;
        r15.b(r1);
        r15 = r3.c;
        r15 = r15.c(r8);
        r15 = r15 << r8;
        r11 = (long) r15;
        r9 = r9 | r11;
        r15 = r3.c;
        r15.b(r1);
        r15 = r3.c;
        r15 = r15.c(r8);
        r7 = (long) r15;
        r7 = r7 | r9;
        r15 = r3.c;
        r15.b(r1);
        r15 = r3.b;
        r15.b(r7);
        r3.f = r1;
    L_0x01bc:
        r15 = r3.b;
        r4 = r15.b(r5);
        r3.h = r4;
    L_0x01c4:
        r15 = r3.a;
        r4 = r3.h;
        r15.a(r4, r1);
        r15 = r3.a;
        r15.a(r14);
        r14 = r3.a;
        r14.b();
        r14 = r13.c;
        r15 = r14.c();
        r14.b(r15);
    L_0x01de:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqa.a(bnl, bnr):int");
    }

    public final void a(long j, long j2) {
        this.a.c = -9223372036854775807L;
        for (int i = 0; i < this.b.size(); i++) {
            a aVar = (a) this.b.valueAt(i);
            aVar.f = false;
            aVar.a.a();
        }
    }

    public final void a(bnm bnm) {
        this.h = bnm;
        bnm.a(new b(-9223372036854775807L));
    }

    public final boolean a(bnl bnl) {
        byte[] bArr = new byte[14];
        bnl.c(bArr, 0, 14);
        if (442 != (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bnl.c(bArr[13] & 7);
        bnl.c(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
