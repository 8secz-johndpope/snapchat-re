package defpackage;

import android.location.Location;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.acum.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: acvu */
public final class acvu {
    public static final int a = 9;
    public static final int b = 12;
    public static final acwk[] c = new acwk[0];
    private double A;
    private final Set<String> B = new HashSet();
    private boolean C;
    private acvc D;
    public final acxj d;
    public final acwc e;
    public int f;
    public final ConcurrentHashMap<String, acwk> g = new ConcurrentHashMap();
    public List<alhm> h;
    public final adba i;
    public final Comparator<ackn> j = new acko();
    public adcf<acwk> k = new adcf(c, 0);
    public final List<acwk> l = new ArrayList();
    public final List<acwh> m = new ArrayList();
    public final float[] n = new float[3];
    public List<alhm> o;
    public double p;
    public acvt q;
    public acwj r;
    public final HashMap<String, acwj> s = new HashMap();
    public final HashMap<String, acvt> t = new HashMap();
    private final acum u;
    private final a<acwk> v;
    private final List<acwk> w = new ArrayList();
    private final Interpolator x = new LinearInterpolator();
    private int y;
    private Location z;

    /* renamed from: acvu$b */
    public static class b {
        public final List<acwk> a;

        public b(List<acwk> list) {
            this.a = new ArrayList(list);
        }
    }

    /* renamed from: acvu$a */
    static class a implements defpackage.acum.a<acwk> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final int a() {
            return 2;
        }

        public final void a(float[] fArr, Iterable<acwk> iterable) {
            int i = 0;
            for (acwk acwk : iterable) {
                int i2 = i + 1;
                fArr[i] = acwk.f;
                i = i2 + 1;
                fArr[i2] = acwk.g;
            }
        }
    }

    public acvu(acxj acxj, acwc acwc, adba adba) {
        this.d = acxj;
        this.e = acwc;
        this.u = new acum(50);
        this.v = new a();
        this.i = adba;
    }

    public static aljh a(acwh acwh) {
        if (acwh.b.size() == 1) {
            alhm alhm = (alhm) acwh.b.get(0);
            if (!(alhm.a == null || alhm.a.a == null)) {
                return alhm.a;
            }
        }
        return null;
    }

    public static aljh b(acwh acwh) {
        if (acwh.b.size() == 1) {
            alhm alhm = (alhm) acwh.b.get(0);
            if (!(alhm.b == null || alhm.b.a == null)) {
                return alhm.b;
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x003d in {13, 15, 19} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.acvp a(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x003a }
        r1 = r4.w;	 Catch:{ all -> 0x003a }
        r0.<init>(r1);	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0038;
        r1 = r0.next();
        r1 = (defpackage.acwk) r1;
        r2 = r1.c();
        r2 = r2.iterator();
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x000d;
        r3 = r2.next();
        r3 = (defpackage.acvm) r3;
        r3 = r3.a;
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0021;
        r5 = r1.a;
        return r5;
        r5 = 0;
        return r5;
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acvu.a(java.lang.String):acvp");
    }

    public final synchronized acvu a(List<alhm> list) {
        this.h = list;
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:235:0x0553 in {3, 6, 13, 14, 19, 35, 36, 37, 46, 47, 48, 50, 51, 54, 55, 62, 63, 64, 70, 77, 78, 79, 84, 85, 86, 96, 102, 107, 108, 115, 116, 121, 122, 127, 130, 131, 134, 137, 138, 143, 144, 149, 150, 151, 154, 155, 156, 163, 164, 165, 168, 169, 174, 177, 180, 183, 184, 185, 190, 191, 196, 197, 198, 199, 202, 203, 205, 206, 211, 223, 226, 227, 228, 230, 234} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.util.List<defpackage.acwk> a(defpackage.ackr r33, defpackage.acmj r34, defpackage.acxj r35, defpackage.acwf r36, float r37, float r38, defpackage.ackh r39, java.lang.String r40, defpackage.acup.b r41, defpackage.aclo r42, java.util.HashMap<java.lang.String, defpackage.acvh> r43) {
        /*
        r32 = this;
        r1 = r32;
        r0 = r35;
        r2 = r36;
        r3 = r37;
        r4 = r39;
        r5 = r40;
        r6 = r41;
        r7 = r42;
        r8 = r43;
        r9 = r1.w;
        r9.clear();
        r9 = r33;
        r9 = r9.a;
        if (r9 != 0) goto L_0x0022;
        r0 = java.util.Collections.emptyList();
        return r0;
        r9 = r1.D;
        if (r9 != 0) goto L_0x0031;
        r9 = new acvc;
        r10 = r34.n();
        r9.<init>(r10);
        r1.D = r9;
        r9 = r1.y;
        r10 = r9 + 1;
        r1.y = r10;
        r10 = 1;
        r11 = r2.a(r10);
        r11 = r11.iterator();
        r12 = r11.hasNext();
        r13 = 0;
        if (r12 == 0) goto L_0x0077;
        r12 = r11.next();
        r12 = (defpackage.acvr) r12;
        r12.I = r10;
        r14 = r1.C;
        if (r14 == 0) goto L_0x0062;
        r14 = r1.B;
        r15 = r12.p;
        r15 = r15.a;
        r14 = r14.contains(r15);
        if (r14 != 0) goto L_0x0062;
        r12.I = r13;
        goto L_0x0040;
        r14 = r12.p;
        r14 = r14.a;
        r14 = r14.equals(r5);
        r12.x = r14;
        r14 = r12.x;
        if (r14 == 0) goto L_0x0040;
        r14 = r7.q;
        r14 = r14.a;
        if (r14 != 0) goto L_0x0040;
        goto L_0x005f;
        monitor-enter(r32);
        r11 = r1.k;	 Catch:{ all -> 0x0550 }
        monitor-exit(r32);	 Catch:{ all -> 0x0550 }
        r15 = r1.u;
        r18 = r11.b();
        r12 = r1.v;
        r16 = r34;
        r17 = r38;
        r19 = r11;
        r20 = r12;
        r12 = r15.a(r16, r17, r18, r19, r20);
        r2 = r2.b;
        r14 = r11.b();
        r14 = r14 << r10;
        r15 = 0;
        r21 = -1;
        r17 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r15 >= r14) goto L_0x01c0;
        r10 = r15 / 2;
        r18 = r11.a(r10);
        r38 = r10;
        r10 = r18;
        r10 = (defpackage.acwk) r10;
        r10.d = r13;
        r13 = r12[r15];
        r13 = (int) r13;
        r10.l = r13;
        r13 = r15 + 1;
        r13 = r12[r13];
        r13 = (int) r13;
        r10.m = r13;
        r13 = r10.l;
        r13 = (float) r13;
        r19 = r12;
        r12 = r10.m;
        r12 = (float) r12;
        r20 = r14;
        r14 = r1.D;
        r22 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r23 = r9;
        r9 = r3 * r22;
        r10.h = r9;
        r9 = r10.h;
        r9 = r9 * r17;
        r10.i = r9;
        r9 = r10.h;
        r0 = r14.e;
        r9 = r9 * r0;
        r0 = r10.i;
        r8 = r14.e;
        r0 = r0 * r8;
        r8 = r14.a;
        r8 = r8 - r9;
        r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r8 < 0) goto L_0x00fa;
        r8 = r14.b;
        r8 = r8 + r9;
        r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r8 > 0) goto L_0x00fa;
        r8 = r14.c;
        r8 = r8 - r0;
        r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
        if (r8 < 0) goto L_0x00fa;
        r8 = r14.d;
        r8 = r8 + r0;
        r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x00f8;
        goto L_0x00fa;
        r0 = 0;
        goto L_0x00fb;
        r0 = 1;
        if (r0 != 0) goto L_0x01b1;
        r0 = r10.c();
        if (r2 == 0) goto L_0x0120;
        r8 = r0.iterator();
        r9 = 0;
        r12 = r8.hasNext();
        if (r12 == 0) goto L_0x0120;
        r12 = r8.next();
        r12 = (defpackage.acvm) r12;
        r12 = r12.a;
        r12 = java.util.Objects.equals(r12, r2);
        if (r12 == 0) goto L_0x011d;
        goto L_0x0121;
        r9 = r9 + 1;
        goto L_0x0108;
        r9 = -1;
        if (r9 < 0) goto L_0x0125;
        r8 = 1;
        goto L_0x0126;
        r8 = 0;
        r12 = r10.a;
        r13 = r12.e;
        if (r8 == r13) goto L_0x012e;
        r13 = 1;
        goto L_0x012f;
        r13 = 0;
        r12.f = r13;
        r12 = r10.a;
        r12.e = r8;
        r8 = r0.size();
        r12 = r10.a;
        r13 = 0;
        r12.a = r13;
        r13 = r12.b;
        r13.clear();
        r13 = 1;
        r12.c = r13;
        r12 = 0;
        if (r12 >= r8) goto L_0x0162;
        r13 = r0.get(r12);
        r13 = (defpackage.acvm) r13;
        r13 = r13.b;
        r14 = r13.x;
        if (r14 == 0) goto L_0x015f;
        r14 = r13.I;
        if (r14 == 0) goto L_0x015f;
        r14 = r10.a;
        r14.a(r13);
        goto L_0x0163;
        r12 = r12 + 1;
        goto L_0x0147;
        r12 = -1;
        r13 = r10.a;
        r13 = r13.e;
        if (r13 == 0) goto L_0x017c;
        if (r9 == r12) goto L_0x017c;
        r13 = r0.get(r9);
        r13 = (defpackage.acvm) r13;
        r13 = r13.b;
        r14 = r13.I;
        if (r14 == 0) goto L_0x017c;
        r14 = r10.a;
        r14.a(r13);
        r13 = 0;
        if (r13 >= r8) goto L_0x019e;
        if (r13 == r9) goto L_0x0197;
        if (r13 == r12) goto L_0x0197;
        r14 = r0.get(r13);
        r14 = (defpackage.acvm) r14;
        r14 = r14.b;
        r36 = r0;
        r0 = r14.I;
        if (r0 == 0) goto L_0x0199;
        r0 = r10.a;
        r0.a(r14);
        goto L_0x0199;
        r36 = r0;
        r13 = r13 + 1;
        r0 = r36;
        goto L_0x017d;
        r0 = r10.a;
        r0 = r0.c();
        if (r0 != 0) goto L_0x01b1;
        r0 = r10.a;
        r0 = r0.e;
        if (r0 == 0) goto L_0x01ae;
        r21 = r38;
        r0 = 1;
        r10.d = r0;
        r15 = r15 + 2;
        r0 = r35;
        r8 = r43;
        r12 = r19;
        r14 = r20;
        r9 = r23;
        r13 = 0;
        goto L_0x0099;
        r23 = r9;
        r15 = r21;
        if (r15 < 0) goto L_0x01ed;
        r0 = r11.a(r15);
        r0 = (defpackage.acwk) r0;
        r2 = r1.w;
        r2.add(r0);
        r2 = r11.iterator();
        r8 = r2.hasNext();
        if (r8 == 0) goto L_0x0207;
        r8 = r2.next();
        r8 = (defpackage.acwk) r8;
        if (r8 == r0) goto L_0x01d5;
        r9 = r8.d;
        if (r9 == 0) goto L_0x01d5;
        r9 = r1.w;
        r9.add(r8);
        goto L_0x01d5;
        r0 = r11.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0207;
        r2 = r0.next();
        r2 = (defpackage.acwk) r2;
        r8 = r2.d;
        if (r8 == 0) goto L_0x01f1;
        r8 = r1.w;
        r8.add(r2);
        goto L_0x01f1;
        r0 = r7.F;
        r7 = r34.i();
        r2 = r1.w;
        r2 = r2.size();
        r9 = 0;
        if (r9 >= r2) goto L_0x0544;
        r10 = r1.w;
        r10 = r10.get(r9);
        r10 = (defpackage.acwk) r10;
        if (r15 < 0) goto L_0x0222;
        r11 = 1;
        goto L_0x0223;
        r11 = 0;
        r12 = r10.a;
        r13 = r12.b;
        r14 = r13.size();
        r33 = r2;
        r2 = r12.f;
        r38 = r15;
        if (r2 == 0) goto L_0x02e0;
        r2 = r12.e;
        if (r2 == 0) goto L_0x0299;
        r19 = r7;
        r7 = r4.b;
        r2 = r1.x;
        r15 = r12.h;
        r22 = r9;
        r9 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        if (r15 != 0) goto L_0x025a;
        r15 = new acuh;
        r30 = r0;
        r31 = r11;
        r0 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r15.<init>(r11, r9, r0, r2);
        r12.h = r15;
        r0 = r12.h;
        r11 = 1;
        r0.h = r11;
        goto L_0x025e;
        r30 = r0;
        r31 = r11;
        r0 = r12.h;
        r0 = r0.c;
        r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
        if (r0 == 0) goto L_0x0282;
        r0 = r12.h;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0282;
        r0 = r12.h;
        r27 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r28 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r24 = r0;
        r25 = r7;
        r29 = r2;
        r24.a(r25, r27, r28, r29);
        r0 = r12.h;
        r2 = 1;
        r0.h = r2;
        r0 = new acuh;
        r2 = defpackage.acue.a;
        r9 = 0;
        r0.<init>(r9, r9, r9, r2);
        r12.i = r0;
        r0 = r12.h;
        r0 = r0.i;
        r2 = new acvp$1;
        r2.<init>(r5, r7);
        r0.add(r2);
        goto L_0x02e8;
        r30 = r0;
        r19 = r7;
        r22 = r9;
        r31 = r11;
        r7 = r4.b;
        r0 = r1.x;
        r2 = r12.h;
        if (r2 == 0) goto L_0x02c7;
        r2 = r12.h;
        r2 = r2.c;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 == 0) goto L_0x02c7;
        r2 = r12.h;
        r27 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r28 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r24 = r2;
        r25 = r7;
        r29 = r0;
        r24.a(r25, r27, r28, r29);
        r0 = r12.h;
        r2 = 1;
        r0.h = r2;
        r0 = r12.i;
        if (r0 == 0) goto L_0x02e8;
        r0 = r12.i;
        r27 = 0;
        r28 = 1133903872; // 0x43960000 float:300.0 double:5.60222949E-315;
        r29 = defpackage.acue.a;
        r24 = r0;
        r25 = r7;
        r24.a(r25, r27, r28, r29);
        r0 = r12.i;
        r2 = 1;
        r0.h = r2;
        goto L_0x02e8;
        r30 = r0;
        r19 = r7;
        r22 = r9;
        r31 = r11;
        r0 = r12.h;
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r4.a(r0, r11);
        r10.j = r0;
        r2 = 0;
        if (r2 >= r14) goto L_0x030c;
        r7 = r13.get(r2);
        r7 = (defpackage.acvr) r7;
        r4.a(r7);
        r7.e = r0;
        r8 = -9999; // 0xffffffffffffd8f1 float:NaN double:NaN;
        r7.c = r8;
        r7.d = r8;
        r7.c(r3);
        r2 = r2 + 1;
        goto L_0x02f3;
        r0 = r10.b();
        if (r0 == 0) goto L_0x0315;
        r2 = 12;
        goto L_0x0317;
        r2 = 9;
        r2 = java.lang.Math.min(r2, r14);
        r12.k = r2;
        r7 = 0;
        if (r7 >= r2) goto L_0x049b;
        r8 = r13.get(r7);
        r8 = (defpackage.acvr) r8;
        if (r0 == 0) goto L_0x032b;
        r9 = defpackage.acwb.b;
        goto L_0x032d;
        r9 = defpackage.acwb.a;
        r15 = r2 + -1;
        r9 = r9[r15];
        r9 = r9[r7];
        r15 = r9.a;
        r11 = r9.b;
        r24 = r2;
        r2 = r9.c;
        r9 = r9.d;
        r8.u = r9;
        r3 = r6.c;
        r8.v = r3;
        r3 = r10.l;
        r8.c = r3;
        r3 = r10.m;
        r8.d = r3;
        r3 = r8.s;
        r3 = r3 * r9;
        r8.i = r3;
        r3 = r8.t;
        r25 = r10;
        r10 = r8.v;
        r3 = r3 * r10;
        r3 = r3 * r9;
        r8.j = r3;
        if (r0 == 0) goto L_0x0369;
        r3 = 0;
        r9 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1));
        if (r9 <= 0) goto L_0x0364;
        r9 = defpackage.acvm.c.RIGHT;
        goto L_0x0366;
        r9 = defpackage.acvm.c.LEFT;
        r8.H = r9;
        goto L_0x0375;
        r3 = 0;
        r9 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1));
        if (r9 <= 0) goto L_0x0371;
        r3 = defpackage.acvm.c.LEFT;
        goto L_0x0373;
        r3 = defpackage.acvm.c.RIGHT;
        r8.H = r3;
        r3 = r8.a(r6);
        r9 = r8.i;
        r9 = r9 * r15;
        r3 = r3 + r9;
        r8.k = r3;
        r3 = r8.b(r6);
        r9 = r8.j;
        r9 = r9 * r11;
        r3 = r3 + r9;
        r8.l = r3;
        r2 = (double) r2;
        r2 = java.lang.Math.toRadians(r2);
        r2 = (float) r2;
        r8.o = r2;
        r8.m();
        r2 = r43;
        if (r2 == 0) goto L_0x03b1;
        r3 = r8.p;
        r3 = r3.a;
        r3 = r2.get(r3);
        r3 = (defpackage.acvh) r3;
        if (r3 == 0) goto L_0x03b1;
        r3 = r3.i;
        r3 = r3.h;
        if (r3 == 0) goto L_0x03ad;
        r3 = defpackage.acvm.c.RIGHT;
        goto L_0x03af;
        r3 = defpackage.acvm.c.LEFT;
        r8.H = r3;
        r3 = 1;
        if (r14 <= r3) goto L_0x03c6;
        r3 = r8.p;
        r3 = r3.k;
        r9 = r8.H;
        r3 = defpackage.acwb.a(r3, r9);
        r9 = r8.p;
        r9 = r9.f;
        r10 = 0;
        r9.a = r10;
        goto L_0x03dd;
        r10 = 0;
        r3 = r8.p;
        r3 = r3.k;
        r9 = r8.H;
        r3 = defpackage.acwb.b(r3, r9);
        r9 = r8.p;
        r9 = r9.f;
        r11 = r8.p;
        r11 = r11.k;
        r11 = r11.d;
        r9.a = r11;
        r9 = r8.r;
        r11 = defpackage.acwb.1.b;
        r3 = r9.a(r8, r3);
        r15 = 1;
        r3 = r3 - r15;
        r3 = r11[r3];
        if (r3 == r15) goto L_0x040a;
        r11 = 2;
        if (r3 == r11) goto L_0x03f1;
        r9 = r35;
        goto L_0x0418;
        r3 = r9.b();
        r9 = r35;
        r9.a(r8, r3);
        r3 = r8.q;
        if (r3 == 0) goto L_0x0418;
        r3 = r8.q;
        r11 = r8.q;
        r11 = r11.a();
        r9.a(r3, r11);
        goto L_0x0418;
        r9 = r35;
        r9.a(r8);
        r3 = r8.q;
        if (r3 == 0) goto L_0x0418;
        r3 = r8.q;
        r9.a(r3);
        r3 = 1059481190; // 0x3f266666 float:0.65 double:5.234532584E-315;
        if (r7 <= 0) goto L_0x0463;
        r11 = r12.d;
        r15 = r8.k;
        r10 = r8.s;
        r10 = r10 * r3;
        r15 = r15 - r10;
        r10 = r12.d;
        r10 = r10.a;
        r10 = java.lang.Math.min(r15, r10);
        r15 = r8.l;
        r3 = r8.t;
        r3 = r3 / r17;
        r15 = r15 + r3;
        r3 = r12.d;
        r3 = r3.b;
        r3 = java.lang.Math.max(r15, r3);
        r15 = r8.k;
        r27 = r0;
        r0 = r8.s;
        r26 = 1059481190; // 0x3f266666 float:0.65 double:5.234532584E-315;
        r0 = r0 * r26;
        r15 = r15 + r0;
        r0 = r12.d;
        r0 = r0.c;
        r0 = java.lang.Math.max(r15, r0);
        r15 = r8.l;
        r2 = r8.t;
        r2 = r2 / r17;
        r15 = r15 - r2;
        r2 = r12.d;
        r2 = r2.d;
        r2 = java.lang.Math.min(r15, r2);
        r11.a(r10, r3, r0, r2);
        goto L_0x0487;
        r27 = r0;
        r0 = r12.d;
        r2 = r8.k;
        r3 = r8.s;
        r10 = 1059481190; // 0x3f266666 float:0.65 double:5.234532584E-315;
        r3 = r3 * r10;
        r2 = r2 - r3;
        r3 = r8.l;
        r11 = r8.t;
        r11 = r11 / r17;
        r3 = r3 + r11;
        r11 = r8.k;
        r15 = r8.s;
        r15 = r15 * r10;
        r11 = r11 + r15;
        r10 = r8.l;
        r15 = r8.t;
        r15 = r15 / r17;
        r10 = r10 - r15;
        r0.a(r2, r3, r11, r10);
        r0 = r23;
        r8.y = r0;
        r7 = r7 + 1;
        r3 = r37;
        r23 = r0;
        r2 = r24;
        r10 = r25;
        r0 = r27;
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x031e;
        r9 = r35;
        r0 = r23;
        if (r31 == 0) goto L_0x04a9;
        r2 = r12.e;
        if (r2 != 0) goto L_0x04a9;
        r15 = 1051931443; // 0x3eb33333 float:0.35 double:5.19723188E-315;
        goto L_0x04ab;
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r12.j;
        r2 = r15 - r2;
        r2 = java.lang.Math.abs(r2);
        r3 = 981668463; // 0x3a83126f float:0.001 double:4.85008663E-315;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x04e3;
        r2 = r12.g;
        if (r2 != 0) goto L_0x04cc;
        r2 = new acuh;
        r3 = r12.j;
        r7 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r8 = defpackage.acun.a;
        r2.<init>(r3, r15, r7, r8);
        r12.g = r2;
        goto L_0x04dd;
        r2 = r12.g;
        r7 = r4.b;
        r27 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r28 = defpackage.acun.a;
        r23 = r2;
        r24 = r7;
        r26 = r15;
        r23.a(r24, r26, r27, r28);
        r2 = r12.g;
        r3 = 1;
        r2.h = r3;
        goto L_0x04e4;
        r3 = 1;
        r2 = r12.g;
        r7 = r12.j;
        r2 = r4.a(r2, r7);
        r12.j = r2;
        r2 = r1.z;
        if (r2 != 0) goto L_0x04f4;
        r15 = 0;
        goto L_0x04f8;
        r15 = r2.getAccuracy();
        if (r30 != 0) goto L_0x04fc;
        r2 = 0;
        goto L_0x0500;
        r2 = r30.getAccuracy();
        r7 = 0;
        r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r8 <= 0) goto L_0x050c;
        r7 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r7 > 0) goto L_0x050c;
        r2 = 0;
        if (r30 == 0) goto L_0x0529;
        r7 = r12.a(r5);
        if (r7 == 0) goto L_0x0529;
        r7 = r12.d();
        if (r7 == 0) goto L_0x0529;
        r7 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1));
        if (r7 != 0) goto L_0x0530;
        r7 = r1.A;
        r10 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1));
        if (r10 != 0) goto L_0x0530;
        r7 = r12.f;
        if (r7 == 0) goto L_0x0529;
        goto L_0x0530;
        r2 = r12.a(r5);
        if (r2 != 0) goto L_0x0533;
        r2 = 0;
        r12.a(r6, r2, r4);
        r2 = r22 + 1;
        r3 = r37;
        r15 = r38;
        r23 = r0;
        r9 = r2;
        r7 = r19;
        r0 = r30;
        r2 = r33;
        goto L_0x0214;
        r2 = r0;
        r19 = r7;
        r1.z = r2;
        r2 = r19;
        r1.A = r2;
        r0 = r1.w;
        return r0;
        r0 = move-exception;
        monitor-exit(r32);	 Catch:{ all -> 0x0550 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acvu.a(ackr, acmj, acxj, acwf, float, float, ackh, java.lang.String, acup$b, aclo, java.util.HashMap):java.util.List");
    }

    public final void a() {
        this.C = false;
        this.B.clear();
    }

    public final void a(Collection<String> collection) {
        this.C = true;
        this.B.clear();
        this.B.addAll(collection);
    }
}
