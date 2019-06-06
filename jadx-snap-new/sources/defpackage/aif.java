package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: aif */
public class aif {
    private static final String i = "aif";
    private static final Config j = Config.ARGB_8888;
    public ByteBuffer a;
    public byte[] b;
    public int[] c;
    public int d;
    public byte[] e;
    public aih f;
    public a g;
    public Bitmap h;
    private int[] k;
    private final int[] l = new int[256];
    private final byte[] m = new byte[256];
    private short[] n;
    private byte[] o;
    private byte[] p;
    private boolean q;
    private int r;

    /* renamed from: aif$a */
    public interface a {
        Bitmap a(int i, int i2, Config config);

        void a(Bitmap bitmap);
    }

    public aif(a aVar) {
        this.g = aVar;
        this.f = new aih();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b7 A:{LOOP_END, LOOP:2: B:48:0x00b5->B:49:0x00b7} */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01e3 A:{SYNTHETIC, EDGE_INSN: B:137:0x01e3->B:89:0x01e3 ?: BREAK  , EDGE_INSN: B:137:0x01e3->B:89:0x01e3 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e7 A:{LOOP_END, LOOP:7: B:90:0x01e5->B:91:0x01e7} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026c  */
    /* JADX WARNING: Missing block: B:14:0x0034, code skipped:
            if (r0.f.j == r1.h) goto L_0x0036;
     */
    private android.graphics.Bitmap a(defpackage.aig r31, defpackage.aig r32) {
        /*
        r30 = this;
        r0 = r30;
        r1 = r31;
        r2 = r32;
        r3 = r0.f;
        r3 = r3.f;
        r4 = r0.f;
        r12 = r4.g;
        r13 = r0.c;
        r14 = 0;
        if (r2 != 0) goto L_0x0016;
    L_0x0013:
        java.util.Arrays.fill(r13, r14);
    L_0x0016:
        r15 = 3;
        r11 = 2;
        if (r2 == 0) goto L_0x0064;
    L_0x001a:
        r4 = r2.g;
        if (r4 <= 0) goto L_0x0064;
    L_0x001e:
        r4 = r2.g;
        if (r4 != r11) goto L_0x0050;
    L_0x0022:
        r4 = r1.f;
        if (r4 != 0) goto L_0x0036;
    L_0x0026:
        r4 = r0.f;
        r4 = r4.l;
        r5 = r1.k;
        if (r5 == 0) goto L_0x0037;
    L_0x002e:
        r5 = r0.f;
        r5 = r5.j;
        r6 = r1.h;
        if (r5 != r6) goto L_0x0037;
    L_0x0036:
        r4 = 0;
    L_0x0037:
        r5 = r2.b;
        r5 = r5 * r3;
        r6 = r2.a;
        r5 = r5 + r6;
        r6 = r2.d;
        r6 = r6 * r3;
        r6 = r6 + r5;
    L_0x0041:
        if (r5 >= r6) goto L_0x0064;
    L_0x0043:
        r7 = r2.c;
        r7 = r7 + r5;
        r8 = r5;
    L_0x0047:
        if (r8 >= r7) goto L_0x004e;
    L_0x0049:
        r13[r8] = r4;
        r8 = r8 + 1;
        goto L_0x0047;
    L_0x004e:
        r5 = r5 + r3;
        goto L_0x0041;
    L_0x0050:
        r2 = r2.g;
        if (r2 != r15) goto L_0x0064;
    L_0x0054:
        r4 = r0.h;
        if (r4 == 0) goto L_0x0064;
    L_0x0058:
        r6 = 0;
        r8 = 0;
        r9 = 0;
        r5 = r13;
        r7 = r3;
        r10 = r3;
        r2 = 2;
        r11 = r12;
        r4.getPixels(r5, r6, r7, r8, r9, r10, r11);
        goto L_0x0065;
    L_0x0064:
        r2 = 2;
    L_0x0065:
        if (r1 == 0) goto L_0x006e;
    L_0x0067:
        r4 = r0.a;
        r5 = r1.j;
        r4.position(r5);
    L_0x006e:
        if (r1 != 0) goto L_0x0079;
    L_0x0070:
        r4 = r0.f;
        r4 = r4.f;
        r5 = r0.f;
        r5 = r5.g;
        goto L_0x007d;
    L_0x0079:
        r4 = r1.c;
        r5 = r1.d;
    L_0x007d:
        r4 = r4 * r5;
        r5 = r0.b;
        if (r5 == 0) goto L_0x0085;
    L_0x0082:
        r5 = r5.length;
        if (r5 >= r4) goto L_0x0089;
    L_0x0085:
        r5 = new byte[r4];
        r0.b = r5;
    L_0x0089:
        r5 = r0.n;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r5 != 0) goto L_0x0093;
    L_0x008f:
        r5 = new short[r6];
        r0.n = r5;
    L_0x0093:
        r5 = r0.o;
        if (r5 != 0) goto L_0x009b;
    L_0x0097:
        r5 = new byte[r6];
        r0.o = r5;
    L_0x009b:
        r5 = r0.p;
        if (r5 != 0) goto L_0x00a5;
    L_0x009f:
        r5 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        r5 = new byte[r5];
        r0.p = r5;
    L_0x00a5:
        r5 = r30.d();
        r11 = 1;
        r7 = r11 << r5;
        r8 = r7 + 1;
        r9 = r7 + 2;
        r5 = r5 + r11;
        r10 = r11 << r5;
        r10 = r10 - r11;
        r2 = 0;
    L_0x00b5:
        if (r2 >= r7) goto L_0x00c6;
    L_0x00b7:
        r6 = r0.n;
        r6[r2] = r14;
        r6 = r0.o;
        r14 = (byte) r2;
        r6[r2] = r14;
        r2 = r2 + 1;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r14 = 0;
        goto L_0x00b5;
    L_0x00c6:
        r2 = -1;
        r22 = r5;
        r20 = r9;
        r23 = r10;
        r6 = 0;
        r14 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r21 = -1;
        r24 = 0;
        r25 = 0;
    L_0x00dd:
        r26 = 8;
        if (r6 >= r4) goto L_0x01e3;
    L_0x00e1:
        if (r14 != 0) goto L_0x00ef;
    L_0x00e3:
        r14 = r30.e();
        if (r14 > 0) goto L_0x00ed;
    L_0x00e9:
        r0.r = r15;
        goto L_0x01e3;
    L_0x00ed:
        r16 = 0;
    L_0x00ef:
        r15 = r0.m;
        r15 = r15[r16];
        r15 = r15 & 255;
        r15 = r15 << r17;
        r18 = r18 + r15;
        r17 = r17 + 8;
        r16 = r16 + 1;
        r14 = r14 + r2;
        r11 = r20;
        r2 = r21;
        r15 = r22;
        r22 = r5;
        r20 = r6;
        r6 = r17;
        r5 = r25;
    L_0x010c:
        if (r6 < r15) goto L_0x01d0;
    L_0x010e:
        r25 = r9;
        r9 = r18 & r23;
        r18 = r18 >> r15;
        r6 = r6 - r15;
        if (r9 != r7) goto L_0x0120;
    L_0x0117:
        r23 = r10;
        r15 = r22;
        r9 = r25;
        r11 = r9;
        r2 = -1;
        goto L_0x010c;
    L_0x0120:
        if (r9 <= r11) goto L_0x0129;
    L_0x0122:
        r26 = r6;
        r6 = 3;
        r0.r = r6;
        goto L_0x01b3;
    L_0x0129:
        r26 = r6;
        if (r9 == r8) goto L_0x01b3;
    L_0x012d:
        r6 = -1;
        if (r2 != r6) goto L_0x0143;
    L_0x0130:
        r2 = r0.p;
        r5 = r24 + 1;
        r6 = r0.o;
        r6 = r6[r9];
        r2[r24] = r6;
        r24 = r5;
        r2 = r9;
        r5 = r2;
        r9 = r25;
        r6 = r26;
        goto L_0x010c;
    L_0x0143:
        if (r9 < r11) goto L_0x014e;
    L_0x0145:
        r6 = r0.p;
        r27 = r24 + 1;
        r5 = (byte) r5;
        r6[r24] = r5;
        r5 = r2;
        goto L_0x0151;
    L_0x014e:
        r5 = r9;
        r27 = r24;
    L_0x0151:
        if (r5 < r7) goto L_0x0168;
    L_0x0153:
        r6 = r0.p;
        r24 = r27 + 1;
        r28 = r7;
        r7 = r0.o;
        r7 = r7[r5];
        r6[r27] = r7;
        r6 = r0.n;
        r5 = r6[r5];
        r27 = r24;
        r7 = r28;
        goto L_0x0151;
    L_0x0168:
        r28 = r7;
        r6 = r0.o;
        r5 = r6[r5];
        r5 = r5 & 255;
        r7 = r0.p;
        r24 = r27 + 1;
        r29 = r8;
        r8 = (byte) r5;
        r7[r27] = r8;
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r11 >= r7) goto L_0x0195;
    L_0x017d:
        r7 = r0.n;
        r2 = (short) r2;
        r7[r11] = r2;
        r6[r11] = r8;
        r11 = r11 + 1;
        r2 = r11 & r23;
        if (r2 != 0) goto L_0x0193;
    L_0x018a:
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r11 >= r7) goto L_0x0195;
    L_0x018e:
        r15 = r15 + 1;
        r23 = r23 + r11;
        goto L_0x0195;
    L_0x0193:
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
    L_0x0195:
        if (r24 <= 0) goto L_0x01a8;
    L_0x0197:
        r24 = r24 + -1;
        r2 = r0.b;
        r6 = r19 + 1;
        r8 = r0.p;
        r8 = r8[r24];
        r2[r19] = r8;
        r20 = r20 + 1;
        r19 = r6;
        goto L_0x0195;
    L_0x01a8:
        r2 = r9;
        r9 = r25;
        r6 = r26;
        r7 = r28;
        r8 = r29;
        goto L_0x010c;
    L_0x01b3:
        r28 = r7;
        r29 = r8;
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r21 = r2;
        r6 = r20;
        r9 = r25;
        r17 = r26;
        r7 = r28;
        r8 = r29;
        r2 = -1;
        r25 = r5;
        r20 = r11;
        r5 = r22;
        r11 = 1;
        r22 = r15;
        goto L_0x01e0;
    L_0x01d0:
        r21 = r2;
        r25 = r5;
        r17 = r6;
        r6 = r20;
        r5 = r22;
        r2 = -1;
        r20 = r11;
        r22 = r15;
        r11 = 1;
    L_0x01e0:
        r15 = 3;
        goto L_0x00dd;
    L_0x01e3:
        r2 = r19;
    L_0x01e5:
        if (r2 >= r4) goto L_0x01ef;
    L_0x01e7:
        r5 = r0.b;
        r6 = 0;
        r5[r2] = r6;
        r2 = r2 + 1;
        goto L_0x01e5;
    L_0x01ef:
        r6 = 0;
        r2 = 1;
        r11 = 0;
    L_0x01f2:
        r4 = r1.d;
        if (r6 >= r4) goto L_0x025b;
    L_0x01f6:
        r4 = r1.e;
        if (r4 == 0) goto L_0x021a;
    L_0x01fa:
        r4 = r1.d;
        r5 = 4;
        if (r11 < r4) goto L_0x0215;
    L_0x01ff:
        r2 = r2 + 1;
        r4 = 2;
        if (r2 == r4) goto L_0x0212;
    L_0x0204:
        r7 = 3;
        if (r2 == r7) goto L_0x020e;
    L_0x0207:
        if (r2 == r5) goto L_0x020a;
    L_0x0209:
        goto L_0x0217;
    L_0x020a:
        r11 = 1;
        r26 = 2;
        goto L_0x0217;
    L_0x020e:
        r11 = 2;
        r26 = 4;
        goto L_0x0217;
    L_0x0212:
        r7 = 3;
        r11 = 4;
        goto L_0x0217;
    L_0x0215:
        r4 = 2;
        r7 = 3;
    L_0x0217:
        r5 = r11 + r26;
        goto L_0x021e;
    L_0x021a:
        r4 = 2;
        r7 = 3;
        r5 = r11;
        r11 = r6;
    L_0x021e:
        r8 = r1.b;
        r11 = r11 + r8;
        r8 = r0.f;
        r8 = r8.g;
        if (r11 >= r8) goto L_0x0257;
    L_0x0227:
        r8 = r0.f;
        r8 = r8.f;
        r11 = r11 * r8;
        r8 = r1.a;
        r8 = r8 + r11;
        r9 = r1.c;
        r9 = r9 + r8;
        r10 = r0.f;
        r10 = r10.f;
        r10 = r10 + r11;
        if (r10 >= r9) goto L_0x023e;
    L_0x0239:
        r9 = r0.f;
        r9 = r9.f;
        r9 = r9 + r11;
    L_0x023e:
        r10 = r1.c;
        r10 = r10 * r6;
    L_0x0241:
        if (r8 >= r9) goto L_0x0257;
    L_0x0243:
        r11 = r0.b;
        r14 = r10 + 1;
        r10 = r11[r10];
        r10 = r10 & 255;
        r11 = r0.k;
        r10 = r11[r10];
        if (r10 == 0) goto L_0x0253;
    L_0x0251:
        r13[r8] = r10;
    L_0x0253:
        r8 = r8 + 1;
        r10 = r14;
        goto L_0x0241;
    L_0x0257:
        r6 = r6 + 1;
        r11 = r5;
        goto L_0x01f2;
    L_0x025b:
        r2 = r0.q;
        if (r2 == 0) goto L_0x027e;
    L_0x025f:
        r2 = r1.g;
        if (r2 == 0) goto L_0x0268;
    L_0x0263:
        r1 = r1.g;
        r2 = 1;
        if (r1 != r2) goto L_0x027e;
    L_0x0268:
        r1 = r0.h;
        if (r1 != 0) goto L_0x0272;
    L_0x026c:
        r1 = r30.f();
        r0.h = r1;
    L_0x0272:
        r4 = r0.h;
        r6 = 0;
        r8 = 0;
        r9 = 0;
        r5 = r13;
        r7 = r3;
        r10 = r3;
        r11 = r12;
        r4.setPixels(r5, r6, r7, r8, r9, r10, r11);
    L_0x027e:
        r1 = r30.f();
        r6 = 0;
        r8 = 0;
        r9 = 0;
        r4 = r1;
        r5 = r13;
        r7 = r3;
        r10 = r3;
        r11 = r12;
        r4.setPixels(r5, r6, r7, r8, r9, r10, r11);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aif.a(aig, aig):android.graphics.Bitmap");
    }

    private int d() {
        try {
            return this.a.get() & 255;
        } catch (Exception unused) {
            this.r = 1;
            return 0;
        }
    }

    private int e() {
        int d = d();
        int i = 0;
        if (d > 0) {
            while (i < d) {
                int i2 = d - i;
                try {
                    this.a.get(this.m, i, i2);
                    i += i2;
                } catch (Exception e) {
                    Log.w(i, "Error Reading Block", e);
                    this.r = 1;
                }
            }
        }
        return i;
    }

    private Bitmap f() {
        Bitmap a = this.g.a(this.f.f, this.f.g, j);
        if (a == null) {
            a = Bitmap.createBitmap(this.f.f, this.f.g, j);
        }
        a.setHasAlpha(true);
        return a;
    }

    public final int a(int i) {
        return (i < 0 || i >= this.f.c) ? -1 : ((aig) this.f.e.get(i)).i;
    }

    public final void a() {
        this.d = (this.d + 1) % this.f.c;
    }

    public final void a(aih aih, byte[] bArr) {
        this.f = aih;
        this.e = bArr;
        this.r = 0;
        this.d = -1;
        this.a = ByteBuffer.wrap(bArr);
        this.a.rewind();
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.q = false;
        for (aig aig : aih.e) {
            if (aig.g == 3) {
                this.q = true;
                break;
            }
        }
        this.b = new byte[(aih.f * aih.g)];
        this.c = new int[(aih.f * aih.g)];
    }

    public final int b() {
        if (this.f.c > 0) {
            int i = this.d;
            if (i >= 0) {
                return a(i);
            }
        }
        return -1;
    }

    /* JADX WARNING: Missing block: B:43:0x00c3, code skipped:
            return null;
     */
    public final synchronized android.graphics.Bitmap c() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f;	 Catch:{ all -> 0x00c4 }
        r0 = r0.c;	 Catch:{ all -> 0x00c4 }
        r1 = 3;
        r2 = 1;
        if (r0 <= 0) goto L_0x000d;
    L_0x0009:
        r0 = r7.d;	 Catch:{ all -> 0x00c4 }
        if (r0 >= 0) goto L_0x0038;
    L_0x000d:
        r0 = i;	 Catch:{ all -> 0x00c4 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00c4 }
        if (r0 == 0) goto L_0x0036;
    L_0x0015:
        r0 = i;	 Catch:{ all -> 0x00c4 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c4 }
        r4 = "unable to decode frame, frameCount=";
        r3.<init>(r4);	 Catch:{ all -> 0x00c4 }
        r4 = r7.f;	 Catch:{ all -> 0x00c4 }
        r4 = r4.c;	 Catch:{ all -> 0x00c4 }
        r3.append(r4);	 Catch:{ all -> 0x00c4 }
        r4 = " framePointer=";
        r3.append(r4);	 Catch:{ all -> 0x00c4 }
        r4 = r7.d;	 Catch:{ all -> 0x00c4 }
        r3.append(r4);	 Catch:{ all -> 0x00c4 }
        r3 = r3.toString();	 Catch:{ all -> 0x00c4 }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x00c4 }
    L_0x0036:
        r7.r = r2;	 Catch:{ all -> 0x00c4 }
    L_0x0038:
        r0 = r7.r;	 Catch:{ all -> 0x00c4 }
        r3 = 0;
        if (r0 == r2) goto L_0x00a5;
    L_0x003d:
        r0 = r7.r;	 Catch:{ all -> 0x00c4 }
        r4 = 2;
        if (r0 != r4) goto L_0x0043;
    L_0x0042:
        goto L_0x00a5;
    L_0x0043:
        r0 = 0;
        r7.r = r0;	 Catch:{ all -> 0x00c4 }
        r4 = r7.f;	 Catch:{ all -> 0x00c4 }
        r4 = r4.e;	 Catch:{ all -> 0x00c4 }
        r5 = r7.d;	 Catch:{ all -> 0x00c4 }
        r4 = r4.get(r5);	 Catch:{ all -> 0x00c4 }
        r4 = (defpackage.aig) r4;	 Catch:{ all -> 0x00c4 }
        r5 = r7.d;	 Catch:{ all -> 0x00c4 }
        r5 = r5 - r2;
        if (r5 < 0) goto L_0x0062;
    L_0x0057:
        r6 = r7.f;	 Catch:{ all -> 0x00c4 }
        r6 = r6.e;	 Catch:{ all -> 0x00c4 }
        r5 = r6.get(r5);	 Catch:{ all -> 0x00c4 }
        r5 = (defpackage.aig) r5;	 Catch:{ all -> 0x00c4 }
        goto L_0x0063;
    L_0x0062:
        r5 = r3;
    L_0x0063:
        r6 = r4.k;	 Catch:{ all -> 0x00c4 }
        if (r6 == 0) goto L_0x006a;
    L_0x0067:
        r6 = r4.k;	 Catch:{ all -> 0x00c4 }
        goto L_0x006e;
    L_0x006a:
        r6 = r7.f;	 Catch:{ all -> 0x00c4 }
        r6 = r6.a;	 Catch:{ all -> 0x00c4 }
    L_0x006e:
        r7.k = r6;	 Catch:{ all -> 0x00c4 }
        r6 = r7.k;	 Catch:{ all -> 0x00c4 }
        if (r6 != 0) goto L_0x0087;
    L_0x0074:
        r0 = i;	 Catch:{ all -> 0x00c4 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00c4 }
        if (r0 == 0) goto L_0x0083;
    L_0x007c:
        r0 = i;	 Catch:{ all -> 0x00c4 }
        r1 = "No Valid Color Table";
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00c4 }
    L_0x0083:
        r7.r = r2;	 Catch:{ all -> 0x00c4 }
        monitor-exit(r7);
        return r3;
    L_0x0087:
        r1 = r4.f;	 Catch:{ all -> 0x00c4 }
        if (r1 == 0) goto L_0x009f;
    L_0x008b:
        r1 = r7.k;	 Catch:{ all -> 0x00c4 }
        r2 = r7.l;	 Catch:{ all -> 0x00c4 }
        r3 = r7.k;	 Catch:{ all -> 0x00c4 }
        r3 = r3.length;	 Catch:{ all -> 0x00c4 }
        java.lang.System.arraycopy(r1, r0, r2, r0, r3);	 Catch:{ all -> 0x00c4 }
        r1 = r7.l;	 Catch:{ all -> 0x00c4 }
        r7.k = r1;	 Catch:{ all -> 0x00c4 }
        r1 = r7.k;	 Catch:{ all -> 0x00c4 }
        r2 = r4.h;	 Catch:{ all -> 0x00c4 }
        r1[r2] = r0;	 Catch:{ all -> 0x00c4 }
    L_0x009f:
        r0 = r7.a(r4, r5);	 Catch:{ all -> 0x00c4 }
        monitor-exit(r7);
        return r0;
    L_0x00a5:
        r0 = i;	 Catch:{ all -> 0x00c4 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00c4 }
        if (r0 == 0) goto L_0x00c2;
    L_0x00ad:
        r0 = i;	 Catch:{ all -> 0x00c4 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c4 }
        r2 = "Unable to decode frame, status=";
        r1.<init>(r2);	 Catch:{ all -> 0x00c4 }
        r2 = r7.r;	 Catch:{ all -> 0x00c4 }
        r1.append(r2);	 Catch:{ all -> 0x00c4 }
        r1 = r1.toString();	 Catch:{ all -> 0x00c4 }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00c4 }
    L_0x00c2:
        monitor-exit(r7);
        return r3;
    L_0x00c4:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aif.c():android.graphics.Bitmap");
    }
}
