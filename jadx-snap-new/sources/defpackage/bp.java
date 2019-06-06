package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.bn.a;
import java.util.Arrays;

/* renamed from: bp */
public final class bp extends by {
    int V = 0;
    bo[] W = new bo[4];
    bo[] X = new bo[4];
    public int Y = 3;
    public boolean Z = false;
    public boolean a = false;
    public boolean aa = false;
    private bi ac = new bi();
    private bx ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai = 0;
    int b = 0;

    private void c(bo boVar) {
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                i2++;
                bo[] boVarArr = this.X;
                if (i2 >= boVarArr.length) {
                    this.X = (bo[]) Arrays.copyOf(boVarArr, boVarArr.length << 1);
                }
                boVarArr = this.X;
                i2 = this.b;
                boVarArr[i2] = boVar;
                this.b = i2 + 1;
                return;
            } else if (this.X[i] != boVar) {
                i++;
            } else {
                return;
            }
        }
    }

    private void d(bo boVar) {
        int i = 0;
        while (true) {
            int i2 = this.V;
            if (i >= i2) {
                i2++;
                bo[] boVarArr = this.W;
                if (i2 >= boVarArr.length) {
                    this.W = (bo[]) Arrays.copyOf(boVarArr, boVarArr.length << 1);
                }
                boVarArr = this.W;
                i2 = this.V;
                boVarArr[i2] = boVar;
                this.V = i2 + 1;
                return;
            } else if (this.W[i] != boVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e4  */
    public final void B() {
        /*
        r27 = this;
        r1 = r27;
        r2 = r1.E;
        r3 = r1.F;
        r0 = r27.l();
        r4 = 0;
        r5 = java.lang.Math.max(r4, r0);
        r0 = r27.m();
        r6 = java.lang.Math.max(r4, r0);
        r1.Z = r4;
        r1.aa = r4;
        r0 = r1.A;
        r7 = 2;
        if (r0 == 0) goto L_0x009c;
    L_0x0020:
        r0 = r1.ad;
        if (r0 != 0) goto L_0x002b;
    L_0x0024:
        r0 = new bx;
        r0.<init>(r1);
        r1.ad = r0;
    L_0x002b:
        r0 = r1.ad;
        r8 = r27.j();
        r0.a = r8;
        r8 = r27.k();
        r0.b = r8;
        r8 = r27.l();
        r0.c = r8;
        r8 = r27.m();
        r0.d = r8;
        r8 = r0.e;
        r8 = r8.size();
        r9 = 0;
    L_0x004c:
        if (r9 >= r8) goto L_0x008b;
    L_0x004e:
        r10 = r0.e;
        r10 = r10.get(r9);
        r10 = (defpackage.bx.a) r10;
        r11 = r10.a;
        r11 = r11.c;
        r11 = r1.a(r11);
        r10.a = r11;
        r11 = r10.a;
        if (r11 == 0) goto L_0x007f;
    L_0x0064:
        r11 = r10.a;
        r11 = r11.d;
        r10.b = r11;
        r11 = r10.a;
        r11 = r11.b();
        r10.c = r11;
        r11 = r10.a;
        r11 = r11.f;
        r10.d = r11;
        r11 = r10.a;
        r11 = r11.g;
        r10.e = r11;
        goto L_0x0088;
    L_0x007f:
        r11 = 0;
        r10.b = r11;
        r10.c = r4;
        r10.d = r7;
        r10.e = r4;
    L_0x0088:
        r9 = r9 + 1;
        goto L_0x004c;
    L_0x008b:
        r1.b(r4);
        r1.c(r4);
        r27.x();
        r0 = r1.ac;
        r0 = r0.e;
        r1.a(r0);
        goto L_0x00a0;
    L_0x009c:
        r1.E = r4;
        r1.F = r4;
    L_0x00a0:
        r0 = r1.Y;
        r8 = 8;
        r9 = 1;
        if (r0 == 0) goto L_0x00c3;
    L_0x00a7:
        r0 = r1.j(r8);
        if (r0 != 0) goto L_0x00b0;
    L_0x00ad:
        r27.D();
    L_0x00b0:
        r0 = r1.j(r8);
        if (r0 != 0) goto L_0x00bb;
    L_0x00b6:
        r0 = r1.Y;
        r1.a(r0);
    L_0x00bb:
        r27.C();
        r0 = r1.ac;
        r0.c = r9;
        goto L_0x00c7;
    L_0x00c3:
        r0 = r1.ac;
        r0.c = r4;
    L_0x00c7:
        r0 = r1.z;
        r10 = r0[r9];
        r0 = r1.z;
        r11 = r0[r4];
        r1.b = r4;
        r1.V = r4;
        r0 = r1.ab;
        r12 = r0.size();
        r0 = 0;
    L_0x00da:
        if (r0 >= r12) goto L_0x00f0;
    L_0x00dc:
        r13 = r1.ab;
        r13 = r13.get(r0);
        r13 = (defpackage.bo) r13;
        r14 = r13 instanceof defpackage.by;
        if (r14 == 0) goto L_0x00ed;
    L_0x00e8:
        r13 = (defpackage.by) r13;
        r13.B();
    L_0x00ed:
        r0 = r0 + 1;
        goto L_0x00da;
    L_0x00f0:
        r0 = 0;
        r13 = 1;
        r14 = 0;
    L_0x00f3:
        if (r13 == 0) goto L_0x0325;
    L_0x00f5:
        r15 = r0 + 1;
        r0 = r1.ac;	 Catch:{ Exception -> 0x019c }
        r0.a();	 Catch:{ Exception -> 0x019c }
        r0 = r1.ac;	 Catch:{ Exception -> 0x019c }
        r1.a(r0);	 Catch:{ Exception -> 0x019c }
        r8 = r1.ab;	 Catch:{ Exception -> 0x019c }
        r8 = r8.size();	 Catch:{ Exception -> 0x019c }
        r7 = 0;
    L_0x0108:
        if (r7 >= r8) goto L_0x0159;
    L_0x010a:
        r9 = r1.ab;	 Catch:{ Exception -> 0x019c }
        r9 = r9.get(r7);	 Catch:{ Exception -> 0x019c }
        r9 = (defpackage.bo) r9;	 Catch:{ Exception -> 0x019c }
        r4 = r9 instanceof defpackage.bp;	 Catch:{ Exception -> 0x019c }
        if (r4 == 0) goto L_0x0142;
    L_0x0116:
        r4 = r9.z;	 Catch:{ Exception -> 0x019c }
        r16 = 0;
        r4 = r4[r16];	 Catch:{ Exception -> 0x019c }
        r17 = r8;
        r8 = r9.z;	 Catch:{ Exception -> 0x019c }
        r18 = r13;
        r13 = 1;
        r8 = r8[r13];	 Catch:{ Exception -> 0x0140 }
        r19 = r14;
        r14 = 2;
        if (r4 != r14) goto L_0x012d;
    L_0x012a:
        r9.h(r13);	 Catch:{ Exception -> 0x019a }
    L_0x012d:
        if (r8 != r14) goto L_0x0132;
    L_0x012f:
        r9.i(r13);	 Catch:{ Exception -> 0x019a }
    L_0x0132:
        r9.a(r0);	 Catch:{ Exception -> 0x019a }
        if (r4 != r14) goto L_0x013a;
    L_0x0137:
        r9.h(r4);	 Catch:{ Exception -> 0x019a }
    L_0x013a:
        if (r8 != r14) goto L_0x014e;
    L_0x013c:
        r9.i(r8);	 Catch:{ Exception -> 0x019a }
        goto L_0x014e;
    L_0x0140:
        r0 = move-exception;
        goto L_0x019f;
    L_0x0142:
        r17 = r8;
        r18 = r13;
        r19 = r14;
        defpackage.bs.a(r1, r0, r9);	 Catch:{ Exception -> 0x019a }
        r9.a(r0);	 Catch:{ Exception -> 0x019a }
    L_0x014e:
        r7 = r7 + 1;
        r8 = r17;
        r13 = r18;
        r14 = r19;
        r4 = 0;
        r9 = 1;
        goto L_0x0108;
    L_0x0159:
        r18 = r13;
        r19 = r14;
        r4 = r1.b;	 Catch:{ Exception -> 0x019a }
        if (r4 <= 0) goto L_0x0165;
    L_0x0161:
        r4 = 0;
        defpackage.bm.a(r1, r0, r4);	 Catch:{ Exception -> 0x019a }
    L_0x0165:
        r4 = r1.V;	 Catch:{ Exception -> 0x019a }
        if (r4 <= 0) goto L_0x016d;
    L_0x0169:
        r4 = 1;
        defpackage.bm.a(r1, r0, r4);	 Catch:{ Exception -> 0x019a }
    L_0x016d:
        r0 = r1.ac;	 Catch:{ Exception -> 0x0197 }
        r4 = r0.c;	 Catch:{ Exception -> 0x0197 }
        if (r4 == 0) goto L_0x0192;
    L_0x0173:
        r4 = 0;
    L_0x0174:
        r7 = r0.d;	 Catch:{ Exception -> 0x0197 }
        if (r4 >= r7) goto L_0x0185;
    L_0x0178:
        r7 = r0.b;	 Catch:{ Exception -> 0x0197 }
        r7 = r7[r4];	 Catch:{ Exception -> 0x0197 }
        r7 = r7.e;	 Catch:{ Exception -> 0x0197 }
        if (r7 != 0) goto L_0x0182;
    L_0x0180:
        r4 = 0;
        goto L_0x0186;
    L_0x0182:
        r4 = r4 + 1;
        goto L_0x0174;
    L_0x0185:
        r4 = 1;
    L_0x0186:
        if (r4 != 0) goto L_0x018e;
    L_0x0188:
        r4 = r0.a;	 Catch:{ Exception -> 0x0197 }
    L_0x018a:
        r0.a(r4);	 Catch:{ Exception -> 0x0197 }
        goto L_0x0195;
    L_0x018e:
        r0.d();	 Catch:{ Exception -> 0x0197 }
        goto L_0x0195;
    L_0x0192:
        r4 = r0.a;	 Catch:{ Exception -> 0x0197 }
        goto L_0x018a;
    L_0x0195:
        r9 = 1;
        goto L_0x01b5;
    L_0x0197:
        r0 = move-exception;
        r9 = 1;
        goto L_0x01a3;
    L_0x019a:
        r0 = move-exception;
        goto L_0x01a1;
    L_0x019c:
        r0 = move-exception;
        r18 = r13;
    L_0x019f:
        r19 = r14;
    L_0x01a1:
        r9 = r18;
    L_0x01a3:
        r0.printStackTrace();
        r4 = java.lang.System.out;
        r0 = java.lang.String.valueOf(r0);
        r7 = "EXCEPTION : ";
        r0 = r7.concat(r0);
        r4.println(r0);
    L_0x01b5:
        r0 = 3;
        if (r9 == 0) goto L_0x0204;
    L_0x01b8:
        r4 = defpackage.bs.a;
        r7 = 2;
        r16 = 0;
        r4[r7] = r16;
        r27.A();
        r7 = r1.ab;
        r7 = r7.size();
        r8 = 0;
    L_0x01c9:
        if (r8 >= r7) goto L_0x0200;
    L_0x01cb:
        r9 = r1.ab;
        r9 = r9.get(r8);
        r9 = (defpackage.bo) r9;
        r9.A();
        r13 = r9.z;
        r13 = r13[r16];
        if (r13 != r0) goto L_0x01e9;
    L_0x01dc:
        r13 = r9.l();
        r14 = r9.J;
        if (r13 >= r14) goto L_0x01e9;
    L_0x01e4:
        r13 = 2;
        r14 = 1;
        r4[r13] = r14;
        goto L_0x01ea;
    L_0x01e9:
        r14 = 1;
    L_0x01ea:
        r13 = r9.z;
        r13 = r13[r14];
        if (r13 != r0) goto L_0x01fb;
    L_0x01f0:
        r13 = r9.m();
        r9 = r9.K;
        if (r13 >= r9) goto L_0x01fb;
    L_0x01f8:
        r9 = 2;
        r4[r9] = r14;
    L_0x01fb:
        r8 = r8 + 1;
        r16 = 0;
        goto L_0x01c9;
    L_0x0200:
        r4 = 8;
        r8 = 2;
        goto L_0x0243;
    L_0x0204:
        r27.A();
        r4 = 0;
    L_0x0208:
        if (r4 >= r12) goto L_0x0240;
    L_0x020a:
        r7 = r1.ab;
        r7 = r7.get(r4);
        r7 = (defpackage.bo) r7;
        r8 = r7.z;
        r9 = 0;
        r8 = r8[r9];
        if (r8 != r0) goto L_0x0228;
    L_0x0219:
        r8 = r7.l();
        r9 = r7.J;
        if (r8 >= r9) goto L_0x0228;
    L_0x0221:
        r0 = defpackage.bs.a;
        r8 = 2;
        r9 = 1;
        r0[r8] = r9;
        goto L_0x0241;
    L_0x0228:
        r8 = 2;
        r9 = 1;
        r13 = r7.z;
        r13 = r13[r9];
        if (r13 != r0) goto L_0x023d;
    L_0x0230:
        r13 = r7.m();
        r7 = r7.K;
        if (r13 >= r7) goto L_0x023d;
    L_0x0238:
        r0 = defpackage.bs.a;
        r0[r8] = r9;
        goto L_0x0241;
    L_0x023d:
        r4 = r4 + 1;
        goto L_0x0208;
    L_0x0240:
        r8 = 2;
    L_0x0241:
        r4 = 8;
    L_0x0243:
        if (r15 >= r4) goto L_0x02a9;
    L_0x0245:
        r0 = defpackage.bs.a;
        r0 = r0[r8];
        if (r0 == 0) goto L_0x02a9;
    L_0x024b:
        r0 = 0;
        r7 = 0;
        r8 = 0;
    L_0x024e:
        if (r0 >= r12) goto L_0x0271;
    L_0x0250:
        r9 = r1.ab;
        r9 = r9.get(r0);
        r9 = (defpackage.bo) r9;
        r13 = r9.E;
        r14 = r9.l();
        r13 = r13 + r14;
        r7 = java.lang.Math.max(r7, r13);
        r13 = r9.F;
        r9 = r9.m();
        r13 = r13 + r9;
        r8 = java.lang.Math.max(r8, r13);
        r0 = r0 + 1;
        goto L_0x024e;
    L_0x0271:
        r0 = r1.H;
        r0 = java.lang.Math.max(r0, r7);
        r7 = r1.I;
        r7 = java.lang.Math.max(r7, r8);
        r8 = 2;
        if (r11 != r8) goto L_0x0292;
    L_0x0280:
        r9 = r27.l();
        if (r9 >= r0) goto L_0x0292;
    L_0x0286:
        r1.d(r0);
        r0 = r1.z;
        r9 = 0;
        r0[r9] = r8;
        r0 = 1;
        r19 = 1;
        goto L_0x0293;
    L_0x0292:
        r0 = 0;
    L_0x0293:
        if (r10 != r8) goto L_0x02a6;
    L_0x0295:
        r9 = r27.m();
        if (r9 >= r7) goto L_0x02a6;
    L_0x029b:
        r1.e(r7);
        r0 = r1.z;
        r7 = 1;
        r0[r7] = r8;
        r0 = 1;
        r9 = 1;
        goto L_0x02ac;
    L_0x02a6:
        r9 = r19;
        goto L_0x02ac;
    L_0x02a9:
        r9 = r19;
        r0 = 0;
    L_0x02ac:
        r7 = r1.H;
        r8 = r27.l();
        r7 = java.lang.Math.max(r7, r8);
        r8 = r27.l();
        if (r7 <= r8) goto L_0x02c8;
    L_0x02bc:
        r1.d(r7);
        r0 = r1.z;
        r7 = 0;
        r8 = 1;
        r0[r7] = r8;
        r0 = 1;
        r9 = 1;
        goto L_0x02c9;
    L_0x02c8:
        r8 = 1;
    L_0x02c9:
        r7 = r1.I;
        r13 = r27.m();
        r7 = java.lang.Math.max(r7, r13);
        r13 = r27.m();
        if (r7 <= r13) goto L_0x02e2;
    L_0x02d9:
        r1.e(r7);
        r0 = r1.z;
        r0[r8] = r8;
        r0 = 1;
        r9 = 1;
    L_0x02e2:
        if (r9 != 0) goto L_0x031a;
    L_0x02e4:
        r7 = r1.z;
        r13 = 0;
        r7 = r7[r13];
        r14 = 2;
        if (r7 != r14) goto L_0x02ff;
    L_0x02ec:
        if (r5 <= 0) goto L_0x02ff;
    L_0x02ee:
        r7 = r27.l();
        if (r7 <= r5) goto L_0x02ff;
    L_0x02f4:
        r1.Z = r8;
        r0 = r1.z;
        r0[r13] = r8;
        r1.d(r5);
        r0 = 1;
        r9 = 1;
    L_0x02ff:
        r7 = r1.z;
        r7 = r7[r8];
        r13 = 2;
        if (r7 != r13) goto L_0x031b;
    L_0x0306:
        if (r6 <= 0) goto L_0x031b;
    L_0x0308:
        r7 = r27.m();
        if (r7 <= r6) goto L_0x031b;
    L_0x030e:
        r1.aa = r8;
        r0 = r1.z;
        r0[r8] = r8;
        r1.e(r6);
        r0 = 1;
        r14 = 1;
        goto L_0x031c;
    L_0x031a:
        r13 = 2;
    L_0x031b:
        r14 = r9;
    L_0x031c:
        r13 = r0;
        r0 = r15;
        r4 = 0;
        r7 = 2;
        r8 = 8;
        r9 = 1;
        goto L_0x00f3;
    L_0x0325:
        r19 = r14;
        r0 = r1.A;
        if (r0 == 0) goto L_0x038f;
    L_0x032b:
        r0 = r1.H;
        r2 = r27.l();
        r0 = java.lang.Math.max(r0, r2);
        r2 = r1.I;
        r3 = r27.m();
        r2 = java.lang.Math.max(r2, r3);
        r3 = r1.ad;
        r4 = r3.a;
        r1.b(r4);
        r4 = r3.b;
        r1.c(r4);
        r4 = r3.c;
        r1.d(r4);
        r4 = r3.d;
        r1.e(r4);
        r4 = r3.e;
        r4 = r4.size();
        r5 = 0;
    L_0x035c:
        if (r5 >= r4) goto L_0x0388;
    L_0x035e:
        r6 = r3.e;
        r6 = r6.get(r5);
        r6 = (defpackage.bx.a) r6;
        r7 = r6.a;
        r7 = r7.c;
        r20 = r1.a(r7);
        r7 = r6.b;
        r8 = r6.c;
        r9 = r6.d;
        r6 = r6.e;
        r23 = -1;
        r26 = 0;
        r21 = r7;
        r22 = r8;
        r24 = r9;
        r25 = r6;
        r20.a(r21, r22, r23, r24, r25, r26);
        r5 = r5 + 1;
        goto L_0x035c;
    L_0x0388:
        r1.d(r0);
        r1.e(r2);
        goto L_0x0393;
    L_0x038f:
        r1.E = r2;
        r1.F = r3;
    L_0x0393:
        if (r19 == 0) goto L_0x039f;
    L_0x0395:
        r0 = r1.z;
        r2 = 0;
        r0[r2] = r11;
        r0 = r1.z;
        r2 = 1;
        r0[r2] = r10;
    L_0x039f:
        r0 = r1.ac;
        r0 = r0.e;
        r1.a(r0);
        r0 = r1.A;
        r2 = r1;
        r2 = (defpackage.bp) r2;
    L_0x03ab:
        if (r0 == 0) goto L_0x03b8;
    L_0x03ad:
        r3 = r0.A;
        r4 = r0 instanceof defpackage.bp;
        if (r4 == 0) goto L_0x03b6;
    L_0x03b3:
        r2 = r0;
        r2 = (defpackage.bp) r2;
    L_0x03b6:
        r0 = r3;
        goto L_0x03ab;
    L_0x03b8:
        if (r1 != r2) goto L_0x03bd;
    L_0x03ba:
        r27.v();
    L_0x03bd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.B():void");
    }

    public final void C() {
        bu buVar = a(a.LEFT).a;
        bu buVar2 = a(a.TOP).a;
        buVar.a(null, (float) MapboxConstants.MINIMUM_ZOOM);
        buVar2.a(null, (float) MapboxConstants.MINIMUM_ZOOM);
    }

    public final void D() {
        int size = this.ab.size();
        b();
        for (int i = 0; i < size; i++) {
            ((bo) this.ab.get(i)).b();
        }
    }

    public final void a(int i) {
        super.a(i);
        int size = this.ab.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bo) this.ab.get(i2)).a(i);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bo boVar, int i) {
        if (i == 0) {
            while (boVar.s.d != null && boVar.s.d.b.u.d != null && boVar.s.d.b.u.d == boVar.s && boVar.s.d.b != boVar) {
                boVar = boVar.s.d.b;
            }
            c(boVar);
            return;
        }
        if (i == 1) {
            while (boVar.t.d != null && boVar.t.d.b.v.d != null && boVar.t.d.b.v.d == boVar.t && boVar.t.d.b != boVar) {
                boVar = boVar.t.d.b;
            }
            d(boVar);
        }
    }

    public final void e(int i, int i2) {
        if (!(this.z[0] == 2 || this.e == null)) {
            this.e.a(i);
        }
        if (this.z[1] != 2 && this.f != null) {
            this.f.a(i2);
        }
    }

    public final void f() {
        this.ac.a();
        this.ae = 0;
        this.ag = 0;
        this.af = 0;
        this.ah = 0;
        super.f();
    }

    public final boolean j(int i) {
        return (this.Y & i) == i;
    }
}
