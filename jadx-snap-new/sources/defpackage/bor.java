package defpackage;

import defpackage.bol.a;
import defpackage.bol.b;
import defpackage.bom.g;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: bor */
public final class bor implements bnk, bns {
    private static final int b = bzo.f("qt  ");
    public bnm a;
    private final int c;
    private final bzc d;
    private final bzc e;
    private final bzc f;
    private final ArrayDeque<a> g;
    private int h;
    private int i;
    private long j;
    private int k;
    private bzc l;
    private int m;
    private int n;
    private int o;
    private a[] p;
    private long[][] q;
    private int r;
    private long s;
    private boolean t;

    /* renamed from: bor$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bor()};
        }
    }

    /* renamed from: bor$a */
    static final class a {
        public final bou a;
        public final box b;
        public final bnu c;
        public int d;

        public a(bou bou, box box, bnu bnu) {
            this.a = bou;
            this.b = box;
            this.c = bnu;
        }
    }

    static {
        1 1 = new 1();
    }

    public bor() {
        this((byte) 0);
    }

    public bor(byte b) {
        this.c = 0;
        this.f = new bzc(16);
        this.g = new ArrayDeque();
        this.d = new bzc(bza.a);
        this.e = new bzc(4);
        this.m = -1;
    }

    private static int a(box box, long j) {
        int a = box.a(j);
        return a == -1 ? box.b(j) : a;
    }

    private static long a(box box, long j, long j2) {
        int a = bor.a(box, j);
        return a == -1 ? j2 : Math.min(box.c[a], j2);
    }

    private ArrayList<box> a(a aVar, bno bno, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.aR.size(); i++) {
            a aVar2 = (a) aVar.aR.get(i);
            if (aVar2.aO == bol.D) {
                bou a = bom.a(aVar2, aVar.c(bol.C), -9223372036854775807L, null, z, this.t);
                if (a != null) {
                    box a2 = bom.a(a, aVar2.d(bol.E).d(bol.F).d(bol.G), bno);
                    if (a2.b != 0) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(long j) {
        while (!this.g.isEmpty() && ((a) this.g.peek()).aP == j) {
            a aVar = (a) this.g.pop();
            if (aVar.aO == bol.B) {
                a(aVar);
                this.g.clear();
                this.h = 2;
            } else if (!this.g.isEmpty()) {
                ((a) this.g.peek()).a(aVar);
            }
        }
        if (this.h != 2) {
            c();
        }
    }

    private void a(a aVar) {
        bqp a;
        ArrayList a2;
        a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        bno bno = new bno();
        b c = aVar2.c(bol.az);
        if (c != null) {
            a = bom.a(c, this.t);
            if (a != null) {
                bno.a(a);
            }
        } else {
            a = null;
        }
        int i = 0;
        boolean z = true;
        try {
            a2 = a(aVar2, bno, false);
        } catch (g unused) {
            bno = new bno();
            a2 = a(aVar2, bno, true);
        }
        int size = a2.size();
        int i2 = -1;
        long j = -9223372036854775807L;
        while (i < size) {
            box box = (box) a2.get(i);
            bou bou = box.a;
            a aVar3 = new a(bou, box, this.a.a(i, bou.b));
            blg a3 = bou.f.a(box.e + 30);
            if (bou.b == z) {
                if (bno.a()) {
                    a3 = a3.a(bno.b, bno.c);
                }
                if (a != null) {
                    a3 = a3.a(a);
                }
            }
            aVar3.c.a(a3);
            j = Math.max(j, bou.e != -9223372036854775807L ? bou.e : box.h);
            if (bou.b == 2) {
                if (i2 == -1) {
                    i2 = arrayList.size();
                }
            }
            arrayList.add(aVar3);
            i++;
            z = true;
        }
        this.r = i2;
        this.s = j;
        this.p = (a[]) arrayList.toArray(new a[arrayList.size()]);
        this.q = bor.a(this.p);
        this.a.a();
        this.a.a(this);
    }

    private static long[][] a(a[] aVarArr) {
        int i;
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        i = 0;
        while (i < aVarArr.length) {
            int i2 = -1;
            long j2 = Long.MAX_VALUE;
            int i3 = 0;
            while (i3 < aVarArr.length) {
                if (!zArr[i3] && jArr2[i3] <= j2) {
                    j2 = jArr2[i3];
                    i2 = i3;
                }
                i3++;
            }
            i3 = iArr[i2];
            jArr[i2][i3] = j;
            j += (long) aVarArr[i2].b.d[i3];
            i3++;
            iArr[i2] = i3;
            if (i3 < jArr[i2].length) {
                jArr2[i2] = aVarArr[i2].b.f[i3];
            } else {
                zArr[i2] = true;
                i++;
            }
        }
        return jArr;
    }

    private void c() {
        this.h = 0;
        this.k = 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:196:0x0352 in {17, 18, 19, 21, 24, 25, 26, 29, 30, 31, 37, 38, 39, 42, 47, 50, 58, 59, 62, 64, 66, 68, 75, 81, 82, 83, 86, 89, 90, 91, 96, 97, 100, 105, 106, 109, 110, 117, 120, 135, 136, 137, 141, 142, 143, 176, 177, 178, 182, 183, 186, 187, 188, 189, 190, 193, 195} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final int a(defpackage.bnl r32, defpackage.bnr r33) {
        /*
        r31 = this;
        r0 = r31;
        r1 = r32;
        r2 = r33;
        r3 = r0.h;
        r4 = 0;
        r6 = -1;
        r7 = 8;
        r8 = 1;
        if (r3 == 0) goto L_0x01ff;
        r10 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r12 = 2;
        if (r3 == r8) goto L_0x0177;
        if (r3 != r12) goto L_0x0171;
        r14 = r32.c();
        r3 = r0.m;
        if (r3 != r6) goto L_0x009b;
        r16 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r18 = r16;
        r20 = r18;
        r24 = r20;
        r3 = 0;
        r7 = 1;
        r13 = 1;
        r22 = -1;
        r23 = -1;
        r12 = r0.p;
        r9 = r12.length;
        if (r3 >= r9) goto L_0x007f;
        r9 = r12[r3];
        r12 = r9.d;
        r8 = r9.b;
        r8 = r8.b;
        if (r12 == r8) goto L_0x007b;
        r8 = r9.b;
        r8 = r8.c;
        r27 = r8[r12];
        r8 = r0.q;
        r8 = r8[r3];
        r29 = r8[r12];
        r8 = r27 - r14;
        r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r12 < 0) goto L_0x005a;
        r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r12 < 0) goto L_0x0058;
        goto L_0x005a;
        r12 = 0;
        goto L_0x005b;
        r12 = 1;
        if (r12 != 0) goto L_0x005f;
        if (r13 != 0) goto L_0x0065;
        if (r12 != r13) goto L_0x006b;
        r27 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1));
        if (r27 >= 0) goto L_0x006b;
        r23 = r3;
        r13 = r12;
        r20 = r29;
        goto L_0x006d;
        r8 = r24;
        r24 = (r29 > r18 ? 1 : (r29 == r18 ? 0 : -1));
        if (r24 >= 0) goto L_0x0079;
        r22 = r3;
        r24 = r8;
        r7 = r12;
        r18 = r29;
        goto L_0x007b;
        r24 = r8;
        r3 = r3 + 1;
        r8 = 1;
        goto L_0x0032;
        r3 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1));
        if (r3 == 0) goto L_0x0092;
        if (r7 == 0) goto L_0x0092;
        r7 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r18 = r18 + r7;
        r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1));
        if (r3 >= 0) goto L_0x008f;
        goto L_0x0092;
        r3 = r22;
        goto L_0x0094;
        r3 = r23;
        r0.m = r3;
        r3 = r0.m;
        if (r3 != r6) goto L_0x009b;
        return r6;
        r3 = r0.p;
        r7 = r0.m;
        r3 = r3[r7];
        r7 = r3.c;
        r8 = r3.d;
        r9 = r3.b;
        r9 = r9.c;
        r12 = r9[r8];
        r9 = r3.b;
        r9 = r9.d;
        r9 = r9[r8];
        r14 = r12 - r14;
        r6 = r0.n;
        r10 = (long) r6;
        r14 = r14 + r10;
        r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x016d;
        r4 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x00c4;
        goto L_0x016d;
        r2 = r3.a;
        r2 = r2.g;
        r4 = 1;
        if (r2 != r4) goto L_0x00d0;
        r4 = 8;
        r14 = r14 + r4;
        r9 = r9 + -8;
        r2 = (int) r14;
        r1.b(r2);
        r2 = r3.a;
        r2 = r2.j;
        if (r2 == 0) goto L_0x0131;
        r2 = r0.e;
        r2 = r2.a;
        r4 = 0;
        r2[r4] = r4;
        r5 = 1;
        r2[r5] = r4;
        r5 = 2;
        r2[r5] = r4;
        r2 = r3.a;
        r2 = r2.j;
        r4 = r3.a;
        r4 = r4.j;
        r5 = 4;
        r13 = 4 - r4;
        r4 = r0.n;
        if (r4 >= r9) goto L_0x0147;
        r4 = r0.o;
        if (r4 != 0) goto L_0x0121;
        r4 = r0.e;
        r4 = r4.a;
        r1.b(r4, r13, r2);
        r4 = r0.e;
        r5 = 0;
        r4.c(r5);
        r4 = r0.e;
        r4 = r4.o();
        r0.o = r4;
        r4 = r0.d;
        r4.c(r5);
        r4 = r0.d;
        r6 = 4;
        r7.a(r4, r6);
        r4 = r0.n;
        r4 = r4 + r6;
        r0.n = r4;
        r9 = r9 + r13;
        goto L_0x00f2;
        r5 = 0;
        r4 = r7.a(r1, r4, r5);
        r5 = r0.n;
        r5 = r5 + r4;
        r0.n = r5;
        r5 = r0.o;
        r5 = r5 - r4;
        r0.o = r5;
        goto L_0x00f2;
        r2 = r0.n;
        if (r2 >= r9) goto L_0x0147;
        r2 = r9 - r2;
        r4 = 0;
        r2 = r7.a(r1, r2, r4);
        r4 = r0.n;
        r4 = r4 + r2;
        r0.n = r4;
        r4 = r0.o;
        r4 = r4 - r2;
        r0.o = r4;
        goto L_0x0131;
        r20 = r9;
        r1 = r3.b;
        r1 = r1.f;
        r17 = r1[r8];
        r1 = r3.b;
        r1 = r1.g;
        r19 = r1[r8];
        r21 = 0;
        r22 = 0;
        r16 = r7;
        r16.a(r17, r19, r20, r21, r22);
        r1 = r3.d;
        r4 = 1;
        r1 = r1 + r4;
        r3.d = r1;
        r1 = -1;
        r0.m = r1;
        r1 = 0;
        r0.n = r1;
        r0.o = r1;
        return r1;
        r4 = 1;
        r2.a = r12;
        return r4;
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
        r3 = r0.j;
        r5 = r0.k;
        r5 = (long) r5;
        r3 = r3 - r5;
        r5 = r32.c();
        r5 = r5 + r3;
        r8 = r0.l;
        if (r8 == 0) goto L_0x01d7;
        r8 = r8.a;
        r9 = r0.k;
        r4 = (int) r3;
        r1.b(r8, r9, r4);
        r3 = r0.i;
        r4 = defpackage.bol.a;
        if (r3 != r4) goto L_0x01ba;
        r3 = r0.l;
        r3.c(r7);
        r4 = r3.j();
        r7 = b;
        if (r4 != r7) goto L_0x01a3;
        r3 = 1;
        goto L_0x01b7;
        r4 = 4;
        r3.d(r4);
        r4 = r3.b();
        if (r4 <= 0) goto L_0x01b6;
        r4 = r3.j();
        r7 = b;
        if (r4 != r7) goto L_0x01a7;
        goto L_0x01a1;
        r3 = 0;
        r0.t = r3;
        goto L_0x01e2;
        r3 = r0.g;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x01e2;
        r3 = r0.g;
        r3 = r3.peek();
        r3 = (defpackage.bol.a) r3;
        r4 = new bol$b;
        r7 = r0.i;
        r8 = r0.l;
        r4.<init>(r7, r8);
        r3.a(r4);
        goto L_0x01e2;
        r7 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x01e4;
        r4 = (int) r3;
        r1.b(r4);
        r3 = 0;
        goto L_0x01ec;
        r7 = r32.c();
        r7 = r7 + r3;
        r2.a = r7;
        r3 = 1;
        r0.a(r5);
        if (r3 == 0) goto L_0x01f9;
        r3 = r0.h;
        r4 = 2;
        if (r3 == r4) goto L_0x01f9;
        r26 = 1;
        goto L_0x01fb;
        r26 = 0;
        if (r26 == 0) goto L_0x0006;
        r3 = 1;
        return r3;
        r3 = 1;
        r6 = r0.k;
        if (r6 != 0) goto L_0x0229;
        r6 = r0.f;
        r6 = r6.a;
        r8 = 0;
        r6 = r1.a(r6, r8, r7, r3);
        if (r6 != 0) goto L_0x0212;
        r4 = 0;
        goto L_0x0346;
        r0.k = r7;
        r3 = r0.f;
        r3.c(r8);
        r3 = r0.f;
        r8 = r3.h();
        r0.j = r8;
        r3 = r0.f;
        r3 = r3.j();
        r0.i = r3;
        r8 = r0.j;
        r10 = 1;
        r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x0246;
        r3 = r0.f;
        r3 = r3.a;
        r1.b(r3, r7, r7);
        r3 = r0.k;
        r3 = r3 + r7;
        r0.k = r3;
        r3 = r0.f;
        r3 = r3.q();
        r0.j = r3;
        goto L_0x0274;
        r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x0274;
        r3 = r32.d();
        r5 = -1;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 != 0) goto L_0x0266;
        r8 = r0.g;
        r8 = r8.isEmpty();
        if (r8 != 0) goto L_0x0266;
        r3 = r0.g;
        r3 = r3.peek();
        r3 = (defpackage.bol.a) r3;
        r3 = r3.aP;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 == 0) goto L_0x0274;
        r5 = r32.c();
        r3 = r3 - r5;
        r5 = r0.k;
        r5 = (long) r5;
        r3 = r3 + r5;
        goto L_0x0243;
        r3 = r0.j;
        r5 = r0.k;
        r5 = (long) r5;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 < 0) goto L_0x034a;
        r3 = r0.i;
        r4 = defpackage.bol.B;
        if (r3 == r4) goto L_0x029a;
        r4 = defpackage.bol.D;
        if (r3 == r4) goto L_0x029a;
        r4 = defpackage.bol.E;
        if (r3 == r4) goto L_0x029a;
        r4 = defpackage.bol.F;
        if (r3 == r4) goto L_0x029a;
        r4 = defpackage.bol.G;
        if (r3 == r4) goto L_0x029a;
        r4 = defpackage.bol.P;
        if (r3 != r4) goto L_0x0298;
        goto L_0x029a;
        r3 = 0;
        goto L_0x029b;
        r3 = 1;
        if (r3 == 0) goto L_0x02c7;
        r3 = r32.c();
        r5 = r0.j;
        r3 = r3 + r5;
        r5 = r0.k;
        r5 = (long) r5;
        r3 = r3 - r5;
        r5 = r0.g;
        r6 = new bol$a;
        r7 = r0.i;
        r6.<init>(r7, r3);
        r5.push(r6);
        r5 = r0.j;
        r7 = r0.k;
        r7 = (long) r7;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x02c1;
        r0.a(r3);
        goto L_0x02c4;
        r31.c();
        r4 = 1;
        goto L_0x0346;
        r3 = r0.i;
        r4 = defpackage.bol.R;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.C;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.S;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.T;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.al;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.am;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.an;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.Q;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.ao;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.ap;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.aq;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.ar;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.as;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.O;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.a;
        if (r3 == r4) goto L_0x030c;
        r4 = defpackage.bol.az;
        if (r3 != r4) goto L_0x030a;
        goto L_0x030c;
        r3 = 0;
        goto L_0x030d;
        r3 = 1;
        if (r3 == 0) goto L_0x0340;
        r3 = r0.k;
        if (r3 != r7) goto L_0x0315;
        r3 = 1;
        goto L_0x0316;
        r3 = 0;
        defpackage.byo.b(r3);
        r3 = r0.j;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 > 0) goto L_0x0324;
        r3 = 1;
        goto L_0x0325;
        r3 = 0;
        defpackage.byo.b(r3);
        r3 = new bzc;
        r4 = r0.j;
        r5 = (int) r4;
        r3.<init>(r5);
        r0.l = r3;
        r3 = r0.f;
        r3 = r3.a;
        r4 = r0.l;
        r4 = r4.a;
        r5 = 0;
        java.lang.System.arraycopy(r3, r5, r4, r5, r7);
        r4 = 1;
        goto L_0x0344;
        r4 = 1;
        r3 = 0;
        r0.l = r3;
        r0.h = r4;
        if (r4 != 0) goto L_0x0006;
        r3 = -1;
        return r3;
        r1 = new bln;
        r2 = "Atom size less than header length (unsupported).";
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bor.a(bnl, bnr):int");
    }

    public final void a(long j, long j2) {
        this.g.clear();
        int i = 0;
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        if (j == 0) {
            c();
            return;
        }
        a[] aVarArr = this.p;
        if (aVarArr != null) {
            int length = aVarArr.length;
            while (i < length) {
                a aVar = aVarArr[i];
                box box = aVar.b;
                int a = box.a(j2);
                if (a == -1) {
                    a = box.b(j2);
                }
                aVar.d = a;
                i++;
            }
        }
    }

    public final void a(bnm bnm) {
        this.a = bnm;
    }

    public final boolean a(bnl bnl) {
        return bot.a(bnl, false);
    }

    public final long b() {
        return this.s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073 A:{SYNTHETIC, EDGE_INSN: B:35:0x0073->B:29:0x0073 ?: BREAK  , EDGE_INSN: B:35:0x0073->B:29:0x0073 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    public final defpackage.bns.a b(long r13) {
        /*
        r12 = this;
        r0 = r12.p;
        r1 = r0.length;
        if (r1 != 0) goto L_0x000d;
    L_0x0005:
        r13 = new bns$a;
        r14 = defpackage.bnt.a;
        r13.<init>(r14);
        return r13;
    L_0x000d:
        r1 = -1;
        r3 = r12.r;
        r4 = -1;
        r5 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r3 == r4) goto L_0x004e;
    L_0x0019:
        r0 = r0[r3];
        r0 = r0.b;
        r3 = defpackage.bor.a(r0, r13);
        if (r3 != r4) goto L_0x002b;
    L_0x0023:
        r13 = new bns$a;
        r14 = defpackage.bnt.a;
        r13.<init>(r14);
        return r13;
    L_0x002b:
        r7 = r0.f;
        r8 = r7[r3];
        r7 = r0.c;
        r10 = r7[r3];
        r7 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r7 >= 0) goto L_0x0054;
    L_0x0037:
        r7 = r0.b;
        r7 = r7 + -1;
        if (r3 >= r7) goto L_0x0054;
    L_0x003d:
        r13 = r0.b(r13);
        if (r13 == r4) goto L_0x0054;
    L_0x0043:
        if (r13 == r3) goto L_0x0054;
    L_0x0045:
        r14 = r0.f;
        r1 = r14[r13];
        r14 = r0.c;
        r13 = r14[r13];
        goto L_0x0056;
    L_0x004e:
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r8 = r13;
    L_0x0054:
        r13 = r1;
        r1 = r5;
    L_0x0056:
        r0 = 0;
    L_0x0057:
        r3 = r12.p;
        r4 = r3.length;
        if (r0 >= r4) goto L_0x0073;
    L_0x005c:
        r4 = r12.r;
        if (r0 == r4) goto L_0x0070;
    L_0x0060:
        r3 = r3[r0];
        r3 = r3.b;
        r10 = defpackage.bor.a(r3, r8, r10);
        r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r4 == 0) goto L_0x0070;
    L_0x006c:
        r13 = defpackage.bor.a(r3, r1, r13);
    L_0x0070:
        r0 = r0 + 1;
        goto L_0x0057;
    L_0x0073:
        r0 = new bnt;
        r0.<init>(r8, r10);
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r3 != 0) goto L_0x0082;
    L_0x007c:
        r13 = new bns$a;
        r13.<init>(r0);
        return r13;
    L_0x0082:
        r3 = new bnt;
        r3.<init>(r1, r13);
        r13 = new bns$a;
        r13.<init>(r0, r3);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bor.b(long):bns$a");
    }

    public final boolean k_() {
        return true;
    }
}
