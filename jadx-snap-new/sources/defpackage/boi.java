package defpackage;

import org.opencv.imgproc.Imgproc;

/* renamed from: boi */
public final class boi implements bnk {
    private static final int a = bzo.f("Xing");
    private static final int b = bzo.f("Info");
    private static final int c = bzo.f("VBRI");
    private final int d;
    private final long e;
    private final bzc f;
    private final bnq g;
    private final bno h;
    private final bnp i;
    private bnm j;
    private bnu k;
    private int l;
    private bqp m;
    private a n;
    private long o;
    private long p;
    private int q;

    /* renamed from: boi$a */
    interface a extends bns {
        long a(long j);
    }

    /* renamed from: boi$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new boi()};
        }
    }

    static {
        1 1 = new 1();
    }

    public boi() {
        this((byte) 0);
    }

    public boi(byte b) {
        this(0, -9223372036854775807L);
    }

    public boi(int i, long j) {
        this.d = 0;
        this.e = j;
        this.f = new bzc(10);
        this.g = new bnq();
        this.h = new bno();
        this.o = -9223372036854775807L;
        this.i = new bnp();
    }

    private static boolean a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    private boolean a(bnl bnl, boolean z) {
        int b;
        int i;
        int i2;
        int i3;
        int i4 = z ? 16384 : Imgproc.FLOODFILL_MASK_ONLY;
        bnl.a();
        if (bnl.c() == 0) {
            this.m = this.i.a(bnl, ((this.d & 2) != 0 ? 1 : null) != null ? bno.a : null);
            bqp bqp = this.m;
            if (bqp != null) {
                this.h.a(bqp);
            }
            b = (int) bnl.b();
            if (!z) {
                bnl.b(b);
            }
            i = b;
            i2 = 0;
            b = 0;
            i3 = 0;
        } else {
            i2 = 0;
            b = 0;
            i3 = 0;
            i = 0;
        }
        while (true) {
            if (!bnl.b(this.f.a, 0, 4, i2 > 0)) {
                break;
            }
            this.f.c(0);
            int j = this.f.j();
            if (b == 0 || boi.a(j, (long) b)) {
                int a = bnq.a(j);
                if (a != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    }
                    bnq.a(j, this.g);
                    b = j;
                    bnl.c(a - 4);
                }
            }
            i2 = i3 + 1;
            if (i3 != i4) {
                if (z) {
                    bnl.a();
                    bnl.c(i + i2);
                } else {
                    bnl.b(1);
                }
                i3 = i2;
                i2 = 0;
                b = 0;
            } else if (z) {
                return false;
            } else {
                throw new bln("Searched too many bytes.");
            }
        }
        if (z) {
            bnl.b(i + i3);
        } else {
            bnl.a();
        }
        this.l = b;
        return true;
    }

    private a b(bnl bnl) {
        bnl.c(this.f.a, 0, 4);
        this.f.c(0);
        bnq.a(this.f.j(), this.g);
        return new boh(bnl.d(), bnl.c(), this.g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARNING: Missing block: B:21:0x005b, code skipped:
            if (r2 != b) goto L_0x005e;
     */
    public final int a(defpackage.bnl r42, defpackage.bnr r43) {
        /*
        r41 = this;
        r0 = r41;
        r1 = r42;
        r2 = r0.l;
        r3 = -1;
        r4 = 0;
        if (r2 != 0) goto L_0x000f;
    L_0x000a:
        r0.a(r1, r4);	 Catch:{ EOFException -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        return r3;
    L_0x000f:
        r2 = r0.n;
        r5 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = 1;
        if (r2 != 0) goto L_0x01e0;
    L_0x0017:
        r13 = new bzc;
        r2 = r0.g;
        r2 = r2.c;
        r13.<init>(r2);
        r2 = r13.a;
        r8 = r0.g;
        r8 = r8.c;
        r1.c(r2, r4, r8);
        r2 = r0.g;
        r2 = r2.a;
        r2 = r2 & r7;
        r8 = 36;
        r9 = 21;
        if (r2 == 0) goto L_0x003d;
    L_0x0034:
        r2 = r0.g;
        r2 = r2.e;
        if (r2 == r7) goto L_0x0048;
    L_0x003a:
        r9 = 36;
        goto L_0x0048;
    L_0x003d:
        r2 = r0.g;
        r2 = r2.e;
        if (r2 == r7) goto L_0x0044;
    L_0x0043:
        goto L_0x0048;
    L_0x0044:
        r2 = 13;
        r9 = 13;
    L_0x0048:
        r2 = r13.c;
        r10 = r9 + 4;
        if (r2 < r10) goto L_0x005e;
    L_0x004e:
        r13.c(r9);
        r2 = r13.j();
        r10 = a;
        if (r2 == r10) goto L_0x0072;
    L_0x0059:
        r10 = b;
        if (r2 != r10) goto L_0x005e;
    L_0x005d:
        goto L_0x0072;
    L_0x005e:
        r2 = r13.c;
        r10 = 40;
        if (r2 < r10) goto L_0x0071;
    L_0x0064:
        r13.c(r8);
        r2 = r13.j();
        r8 = c;
        if (r2 != r8) goto L_0x0071;
    L_0x006f:
        r2 = r8;
        goto L_0x0072;
    L_0x0071:
        r2 = 0;
    L_0x0072:
        r8 = a;
        if (r2 == r8) goto L_0x009c;
    L_0x0076:
        r8 = b;
        if (r2 != r8) goto L_0x007b;
    L_0x007a:
        goto L_0x009c;
    L_0x007b:
        r8 = c;
        if (r2 != r8) goto L_0x0096;
    L_0x007f:
        r8 = r42.d();
        r10 = r42.c();
        r12 = r0.g;
        r2 = defpackage.boj.a(r8, r10, r12, r13);
        r8 = r0.g;
        r8 = r8.c;
        r1.b(r8);
        goto L_0x017b;
    L_0x0096:
        r42.a();
        r2 = 0;
        goto L_0x017b;
    L_0x009c:
        r10 = r42.d();
        r16 = r42.c();
        r8 = r0.g;
        r12 = r8.g;
        r15 = r8.d;
        r18 = r13.j();
        r14 = r18 & 1;
        if (r14 != r7) goto L_0x012d;
    L_0x00b2:
        r14 = r13.o();
        if (r14 != 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x012d;
    L_0x00b9:
        r3 = (long) r14;
        r25 = r8;
        r7 = (long) r12;
        r21 = r7 * r5;
        r7 = (long) r15;
        r19 = r3;
        r23 = r7;
        r19 = defpackage.bzo.b(r19, r21, r23);
        r3 = 6;
        r4 = r18 & 6;
        if (r4 == r3) goto L_0x00da;
    L_0x00cd:
        r3 = new bok;
        r4 = r25;
        r4 = r4.c;
        r15 = r3;
        r18 = r4;
        r15.<init>(r16, r18, r19);
        goto L_0x012e;
    L_0x00da:
        r4 = r25;
        r3 = r13.o();
        r7 = (long) r3;
        r3 = 100;
        r12 = new long[r3];
        r15 = 0;
    L_0x00e6:
        if (r15 >= r3) goto L_0x00f7;
    L_0x00e8:
        r3 = r13.d();
        r5 = (long) r3;
        r12[r15] = r5;
        r15 = r15 + 1;
        r3 = 100;
        r5 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        goto L_0x00e6;
    L_0x00f7:
        r5 = -1;
        r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r3 == 0) goto L_0x011e;
    L_0x00fd:
        r5 = r16 + r7;
        r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r3 == 0) goto L_0x011e;
    L_0x0103:
        r3 = new java.lang.StringBuilder;
        r13 = "XING data size mismatch: ";
        r3.<init>(r13);
        r3.append(r10);
        r10 = ", ";
        r3.append(r10);
        r3.append(r5);
        r3 = r3.toString();
        r5 = "XingSeeker";
        android.util.Log.w(r5, r3);
    L_0x011e:
        r3 = new bok;
        r4 = r4.c;
        r15 = r3;
        r18 = r4;
        r21 = r7;
        r23 = r12;
        r15.<init>(r16, r18, r19, r21, r23);
        goto L_0x012e;
    L_0x012d:
        r3 = 0;
    L_0x012e:
        if (r3 == 0) goto L_0x0162;
    L_0x0130:
        r4 = r0.h;
        r4 = r4.a();
        if (r4 != 0) goto L_0x0162;
    L_0x0138:
        r42.a();
        r9 = r9 + 141;
        r1.c(r9);
        r4 = r0.f;
        r4 = r4.a;
        r5 = 3;
        r6 = 0;
        r1.c(r4, r6, r5);
        r4 = r0.f;
        r4.c(r6);
        r4 = r0.h;
        r5 = r0.f;
        r5 = r5.g();
        r6 = r5 >> 12;
        r5 = r5 & 4095;
        if (r6 > 0) goto L_0x015e;
    L_0x015c:
        if (r5 <= 0) goto L_0x0162;
    L_0x015e:
        r4.b = r6;
        r4.c = r5;
    L_0x0162:
        r4 = r0.g;
        r4 = r4.c;
        r1.b(r4);
        if (r3 == 0) goto L_0x017a;
    L_0x016b:
        r4 = r3.k_();
        if (r4 != 0) goto L_0x017a;
    L_0x0171:
        r4 = b;
        if (r2 != r4) goto L_0x017a;
    L_0x0175:
        r2 = r41.b(r42);
        goto L_0x017b;
    L_0x017a:
        r2 = r3;
    L_0x017b:
        r0.n = r2;
        r2 = r0.n;
        if (r2 == 0) goto L_0x018d;
    L_0x0181:
        r2 = r2.k_();
        if (r2 != 0) goto L_0x0193;
    L_0x0187:
        r2 = r0.d;
        r3 = 1;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x0193;
    L_0x018d:
        r2 = r41.b(r42);
        r0.n = r2;
    L_0x0193:
        r2 = r0.j;
        r3 = r0.n;
        r2.a(r3);
        r2 = r0.k;
        r26 = 0;
        r3 = r0.g;
        r3 = r3.b;
        r28 = 0;
        r29 = -1;
        r30 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r4 = r0.g;
        r4 = r4.e;
        r5 = r0.g;
        r5 = r5.d;
        r33 = -1;
        r6 = r0.h;
        r6 = r6.b;
        r7 = r0.h;
        r7 = r7.c;
        r36 = 0;
        r37 = 0;
        r38 = 0;
        r39 = 0;
        r8 = r0.d;
        r8 = r8 & 2;
        if (r8 == 0) goto L_0x01cb;
    L_0x01c8:
        r40 = 0;
        goto L_0x01cf;
    L_0x01cb:
        r8 = r0.m;
        r40 = r8;
    L_0x01cf:
        r27 = r3;
        r31 = r4;
        r32 = r5;
        r34 = r6;
        r35 = r7;
        r3 = defpackage.blg.a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40);
        r2.a(r3);
    L_0x01e0:
        r2 = r0.q;
        if (r2 != 0) goto L_0x0253;
    L_0x01e4:
        r42.a();
        r2 = r0.f;
        r2 = r2.a;
        r3 = 4;
        r4 = 1;
        r5 = 0;
        r2 = r1.b(r2, r5, r3, r4);
        if (r2 != 0) goto L_0x01f6;
    L_0x01f4:
        r2 = -1;
        return r2;
    L_0x01f6:
        r2 = -1;
        r3 = r0.f;
        r3.c(r5);
        r3 = r0.f;
        r3 = r3.j();
        r4 = r0.l;
        r4 = (long) r4;
        r4 = defpackage.boi.a(r3, r4);
        if (r4 == 0) goto L_0x024b;
    L_0x020b:
        r4 = defpackage.bnq.a(r3);
        if (r4 != r2) goto L_0x0212;
    L_0x0211:
        goto L_0x024b;
    L_0x0212:
        r2 = r0.g;
        defpackage.bnq.a(r3, r2);
        r2 = r0.o;
        r4 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0244;
    L_0x0222:
        r2 = r0.n;
        r6 = r42.c();
        r2 = r2.a(r6);
        r0.o = r2;
        r2 = r0.e;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0244;
    L_0x0234:
        r2 = r0.n;
        r3 = 0;
        r2 = r2.a(r3);
        r4 = r0.o;
        r6 = r0.e;
        r6 = r6 - r2;
        r4 = r4 + r6;
        r0.o = r4;
    L_0x0244:
        r2 = r0.g;
        r2 = r2.c;
        r0.q = r2;
        goto L_0x0253;
    L_0x024b:
        r2 = 1;
        r1.b(r2);
        r1 = 0;
        r0.l = r1;
        return r1;
    L_0x0253:
        r2 = 1;
        r3 = r0.k;
        r4 = r0.q;
        r1 = r3.a(r1, r4, r2);
        r2 = -1;
        if (r1 != r2) goto L_0x0260;
    L_0x025f:
        return r2;
    L_0x0260:
        r2 = r0.q;
        r2 = r2 - r1;
        r0.q = r2;
        r1 = r0.q;
        if (r1 <= 0) goto L_0x026b;
    L_0x0269:
        r1 = 0;
        return r1;
    L_0x026b:
        r1 = r0.o;
        r3 = r0.p;
        r5 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r3 = r3 * r5;
        r5 = r0.g;
        r5 = r5.d;
        r5 = (long) r5;
        r3 = r3 / r5;
        r6 = r1 + r3;
        r5 = r0.k;
        r8 = 1;
        r1 = r0.g;
        r9 = r1.c;
        r10 = 0;
        r11 = 0;
        r5.a(r6, r8, r9, r10, r11);
        r1 = r0.p;
        r3 = r0.g;
        r3 = r3.g;
        r3 = (long) r3;
        r1 = r1 + r3;
        r0.p = r1;
        r1 = 0;
        r0.q = r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boi.a(bnl, bnr):int");
    }

    public final void a(long j, long j2) {
        this.l = 0;
        this.o = -9223372036854775807L;
        this.p = 0;
        this.q = 0;
    }

    public final void a(bnm bnm) {
        this.j = bnm;
        this.k = this.j.a(0, 1);
        this.j.a();
    }

    public final boolean a(bnl bnl) {
        return a(bnl, true);
    }
}
