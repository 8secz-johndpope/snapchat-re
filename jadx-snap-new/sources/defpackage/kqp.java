package defpackage;

import defpackage.kqj.a;

/* renamed from: kqp */
public final class kqp implements kqf {
    private final kru a;
    private final kru b;
    private final krn c;
    private final krr d;
    private volatile Class<kqe> e;
    private volatile kqi f = kqi.n;
    private final ksr g;
    private final ksu h;
    private final kqu i;
    private final krj j;
    private final ksf k;
    private final ksk l;
    private final krk m;
    private final krw n;

    public kqp(ksr ksr, ksu ksu, kqu kqu, krj krj, ksf ksf, ksk ksk, krk krk, krw krw, mhk mhk) {
        akcr.b(ksr, "analyticsReporter");
        akcr.b(ksu, "nativeAccidentsReporter");
        akcr.b(kqu, "adTrackReporter");
        akcr.b(krj, "snappablesEventsReporter");
        akcr.b(ksf, "lensExplorerEventTracker");
        akcr.b(ksk, "performanceEventsTracker");
        akcr.b(krk, "carouselSessionTracker");
        akcr.b(krw, "deviceClassProvider");
        akcr.b(mhk, "clock");
        this.g = ksr;
        this.h = ksu;
        this.i = kqu;
        this.j = krj;
        this.k = ksf;
        this.l = ksk;
        this.m = krk;
        this.n = krw;
        this.a = new kru(this.g, mhk);
        this.b = new krs(this.g, mhk);
        this.c = new krn(this.g, mhk);
        this.d = new krr(this.g, mhk);
    }

    private final void a() {
        this.a.a();
        this.b.a();
        this.c.a();
        this.d.a();
        this.j.a(this.f);
        this.m.a();
    }

    private final void a(kqi kqi) {
        this.f = kqi;
        c();
        if (!this.f.i) {
            this.a.a(this.f.a());
        } else if (!(this.a.d() == null || (akcr.a(this.a.d(), this.f.a) ^ 1) == 0)) {
            this.a.a();
        }
        if ((akcr.a(this.b.d(), this.f.a) ^ 1) != 0) {
            this.b.a();
            if (this.f.i) {
                this.b.a(this.f.a());
                this.l.c(this.f);
            }
        }
        this.c.a(this.f.a());
        this.d.a();
        d();
    }

    private final long b() {
        return this.n.a().a;
    }

    private final void b(kqe kqe) {
        this.e = kqe.getClass();
    }

    private final void c() {
        if (akcr.a(this.f.k, kqj.c)) {
            this.f = kqi.a(this.f, null, 0, 0, 0, null, null, false, 0, false, null, null, a.a(), 0, 0, 14335);
        }
    }

    private final void d() {
        this.g.a(this.f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:300:0x073e in {10, 11, 12, 19, 20, 21, 24, 25, 28, 31, 34, 35, 37, 41, 45, 49, 54, 55, 60, 63, 64, 67, 68, 70, 75, 76, 78, 79, 82, 88, 89, 91, 98, 103, 104, 105, 110, 115, 117, 122, 130, 133, 136, 139, 140, 141, 143, 147, 151, 156, 157, 159, 164, 171, 173, 177, 182, 187, 189, 191, 196, 198, 203, 205, 210, 212, 217, 219, 224, 225, 234, 236, 240, 244, 248, 253, 254, 259, 260, 264, 269, 273, 277, 281, 289, 290, 291, 292, 294, 296, 297, 299} preds:[]
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
    public final void a(defpackage.kqe r41) {
        /*
        r40 = this;
        r1 = r40;
        r2 = r41;
        r3 = "event";
        defpackage.akcr.b(r2, r3);
        r4 = r2 instanceof defpackage.kqe.x;	 Catch:{ all -> 0x073b }
        r5 = "sessionId";
        r6 = "receiver$0";
        r9 = 1;
        if (r4 == 0) goto L_0x00b6;
        r2 = (defpackage.kqe.x) r2;	 Catch:{ all -> 0x073b }
        r21 = r40.b();	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.k;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r2, r6);	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r3, r5);	 Catch:{ all -> 0x073b }
        r4 = r2.b;	 Catch:{ all -> 0x073b }
        r4 = r4.k;	 Catch:{ all -> 0x073b }
        r4 = r4.a();	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r4, r6);	 Catch:{ all -> 0x073b }
        r5 = defpackage.aapr.values();	 Catch:{ all -> 0x073b }
        r6 = r5.length;	 Catch:{ all -> 0x073b }
        r10 = 0;	 Catch:{ all -> 0x073b }
        if (r10 >= r6) goto L_0x0046;	 Catch:{ all -> 0x073b }
        r11 = r5[r10];	 Catch:{ all -> 0x073b }
        r12 = r11.name();	 Catch:{ all -> 0x073b }
        r12 = defpackage.akcr.a(r12, r4);	 Catch:{ all -> 0x073b }
        if (r12 == 0) goto L_0x0043;	 Catch:{ all -> 0x073b }
        r4 = r11;	 Catch:{ all -> 0x073b }
        goto L_0x0047;	 Catch:{ all -> 0x073b }
        r10 = r10 + 1;	 Catch:{ all -> 0x073b }
        goto L_0x0033;	 Catch:{ all -> 0x073b }
        r4 = 0;	 Catch:{ all -> 0x073b }
        r5 = r2.a;	 Catch:{ all -> 0x073b }
        r5 = defpackage.kqk.a(r5);	 Catch:{ all -> 0x073b }
        r6 = new kqi;	 Catch:{ all -> 0x073b }
        r11 = r2.b;	 Catch:{ all -> 0x073b }
        r10 = r2.c;	 Catch:{ all -> 0x073b }
        r12 = (long) r10;	 Catch:{ all -> 0x073b }
        r10 = r2.d;	 Catch:{ all -> 0x073b }
        r14 = (long) r10;	 Catch:{ all -> 0x073b }
        r10 = r2.e;	 Catch:{ all -> 0x073b }
        r7 = (long) r10;	 Catch:{ all -> 0x073b }
        r10 = defpackage.aapr.GEO;	 Catch:{ all -> 0x073b }
        if (r10 == r4) goto L_0x006a;	 Catch:{ all -> 0x073b }
        r10 = defpackage.aapr.SCAN_UNLOCKED;	 Catch:{ all -> 0x073b }
        if (r10 == r4) goto L_0x006a;	 Catch:{ all -> 0x073b }
        r10 = defpackage.aapp.AD_TO_LENS;	 Catch:{ all -> 0x073b }
        if (r10 != r5) goto L_0x0067;	 Catch:{ all -> 0x073b }
        goto L_0x006a;	 Catch:{ all -> 0x073b }
        r20 = 0;	 Catch:{ all -> 0x073b }
        goto L_0x006c;	 Catch:{ all -> 0x073b }
        r20 = 1;	 Catch:{ all -> 0x073b }
        r9 = r2.b;	 Catch:{ all -> 0x073b }
        r9 = r9.b;	 Catch:{ all -> 0x073b }
        r9 = r9 instanceof defpackage.miq.f;	 Catch:{ all -> 0x073b }
        r10 = r2.b;	 Catch:{ all -> 0x073b }
        r10 = r10.s;	 Catch:{ all -> 0x073b }
        r10 = r10.c;	 Catch:{ all -> 0x073b }
        r2 = r2.b;	 Catch:{ all -> 0x073b }
        r2 = r2.l;	 Catch:{ all -> 0x073b }
        r17 = r10;	 Catch:{ all -> 0x073b }
        r10 = r2 instanceof defpackage.mva.d;	 Catch:{ all -> 0x073b }
        if (r10 == 0) goto L_0x0087;	 Catch:{ all -> 0x073b }
        r2 = defpackage.aasc.WEB;	 Catch:{ all -> 0x073b }
        r25 = r2;	 Catch:{ all -> 0x073b }
        goto L_0x009e;	 Catch:{ all -> 0x073b }
        r10 = r2 instanceof defpackage.mva.c;	 Catch:{ all -> 0x073b }
        if (r10 == 0) goto L_0x008e;	 Catch:{ all -> 0x073b }
        r2 = defpackage.aasc.VIDEO;	 Catch:{ all -> 0x073b }
        goto L_0x0084;	 Catch:{ all -> 0x073b }
        r10 = r2 instanceof defpackage.mva.a;	 Catch:{ all -> 0x073b }
        if (r10 == 0) goto L_0x0095;	 Catch:{ all -> 0x073b }
        r2 = defpackage.aasc.APP_INSTALL;	 Catch:{ all -> 0x073b }
        goto L_0x0084;	 Catch:{ all -> 0x073b }
        r2 = r2 instanceof defpackage.mva.b;	 Catch:{ all -> 0x073b }
        if (r2 == 0) goto L_0x009c;	 Catch:{ all -> 0x073b }
        r2 = defpackage.aasc.DEEP_LINK_ATTACHMENT;	 Catch:{ all -> 0x073b }
        goto L_0x0084;	 Catch:{ all -> 0x073b }
        r25 = 0;	 Catch:{ all -> 0x073b }
        r27 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;	 Catch:{ all -> 0x073b }
        r2 = r17;	 Catch:{ all -> 0x073b }
        r10 = r6;	 Catch:{ all -> 0x073b }
        r16 = r7;	 Catch:{ all -> 0x073b }
        r18 = r4;	 Catch:{ all -> 0x073b }
        r19 = r5;	 Catch:{ all -> 0x073b }
        r23 = r9;	 Catch:{ all -> 0x073b }
        r24 = r2;	 Catch:{ all -> 0x073b }
        r26 = r3;	 Catch:{ all -> 0x073b }
        r10.<init>(r11, r12, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27);	 Catch:{ all -> 0x073b }
        r1.a(r6);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.e;	 Catch:{ all -> 0x073b }
        r7 = 1;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0121;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.e) r2;	 Catch:{ all -> 0x073b }
        r20 = r40.b();	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.k;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r2, r6);	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r3, r5);	 Catch:{ all -> 0x073b }
        r4 = new kqi;	 Catch:{ all -> 0x073b }
        r5 = new mux;	 Catch:{ all -> 0x073b }
        r6 = new mhs$b;	 Catch:{ all -> 0x073b }
        r9 = "original";	 Catch:{ all -> 0x073b }
        r6.<init>(r9);	 Catch:{ all -> 0x073b }
        r24 = 0;	 Catch:{ all -> 0x073b }
        r25 = 0;	 Catch:{ all -> 0x073b }
        r26 = 0;	 Catch:{ all -> 0x073b }
        r27 = 0;	 Catch:{ all -> 0x073b }
        r28 = 0;	 Catch:{ all -> 0x073b }
        r29 = 0;	 Catch:{ all -> 0x073b }
        r30 = 0;	 Catch:{ all -> 0x073b }
        r31 = 0;	 Catch:{ all -> 0x073b }
        r32 = 0;	 Catch:{ all -> 0x073b }
        r33 = 0;	 Catch:{ all -> 0x073b }
        r34 = 0;	 Catch:{ all -> 0x073b }
        r35 = 0;	 Catch:{ all -> 0x073b }
        r36 = 2097150; // 0x1ffffe float:2.938733E-39 double:1.03613E-317;	 Catch:{ all -> 0x073b }
        r22 = r5;	 Catch:{ all -> 0x073b }
        r23 = r6;	 Catch:{ all -> 0x073b }
        r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36);	 Catch:{ all -> 0x073b }
        r11 = 0;	 Catch:{ all -> 0x073b }
        r6 = r2.b;	 Catch:{ all -> 0x073b }
        r9 = (long) r6;	 Catch:{ all -> 0x073b }
        r13 = r9 + r7;	 Catch:{ all -> 0x073b }
        r6 = r2.c;	 Catch:{ all -> 0x073b }
        r6 = (long) r6;	 Catch:{ all -> 0x073b }
        r17 = defpackage.aapr.BUNDLED;	 Catch:{ all -> 0x073b }
        r2 = r2.a;	 Catch:{ all -> 0x073b }
        r18 = defpackage.kqk.a(r2);	 Catch:{ all -> 0x073b }
        r19 = 0;	 Catch:{ all -> 0x073b }
        r22 = 0;	 Catch:{ all -> 0x073b }
        r23 = 0;	 Catch:{ all -> 0x073b }
        r24 = 0;	 Catch:{ all -> 0x073b }
        r26 = 14080; // 0x3700 float:1.973E-41 double:6.9564E-320;	 Catch:{ all -> 0x073b }
        r9 = r4;	 Catch:{ all -> 0x073b }
        r10 = r5;	 Catch:{ all -> 0x073b }
        r15 = r6;	 Catch:{ all -> 0x073b }
        r25 = r3;	 Catch:{ all -> 0x073b }
        r9.<init>(r10, r11, r13, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26);	 Catch:{ all -> 0x073b }
        r1.a(r4);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.d;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x013d;	 Catch:{ all -> 0x073b }
        r3 = r2;	 Catch:{ all -> 0x073b }
        r3 = (defpackage.kqe.d) r3;	 Catch:{ all -> 0x073b }
        r5 = r3.b;	 Catch:{ all -> 0x073b }
        r3 = r2;	 Catch:{ all -> 0x073b }
        r3 = (defpackage.kqe.d) r3;	 Catch:{ all -> 0x073b }
        r6 = r3.c;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.d) r2;	 Catch:{ all -> 0x073b }
        r8 = r2.d;	 Catch:{ all -> 0x073b }
        r4 = r1.g;	 Catch:{ all -> 0x073b }
        r10 = r40.b();	 Catch:{ all -> 0x073b }
        r4.a(r5, r6, r8, r10);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.u;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x016d;	 Catch:{ all -> 0x073b }
        r2 = r1.b;	 Catch:{ all -> 0x073b }
        r2.a();	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.a();	 Catch:{ all -> 0x073b }
        r2.a(r3);	 Catch:{ all -> 0x073b }
        r2 = r1.c;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.a();	 Catch:{ all -> 0x073b }
        r2.a(r3);	 Catch:{ all -> 0x073b }
        r2 = r1.l;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r2.d(r3);	 Catch:{ all -> 0x073b }
        r2 = r1.m;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.k;	 Catch:{ all -> 0x073b }
        r2.d(r3);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.f;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x01c3;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.f) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.b;	 Catch:{ all -> 0x073b }
        r9 = (long) r2;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r4 = r3.e;	 Catch:{ all -> 0x073b }
        r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 == 0) goto L_0x01c2;	 Catch:{ all -> 0x073b }
        r2 = r1.b;	 Catch:{ all -> 0x073b }
        r2.a(r9);	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        r2.a(r9);	 Catch:{ all -> 0x073b }
        r2 = r1.c;	 Catch:{ all -> 0x073b }
        r2.a(r9);	 Catch:{ all -> 0x073b }
        r2 = r1.i;	 Catch:{ all -> 0x073b }
        r4 = r3.b;	 Catch:{ all -> 0x073b }
        r4 = r4.a;	 Catch:{ all -> 0x073b }
        r4 = r4.a;	 Catch:{ all -> 0x073b }
        r2.a(r4);	 Catch:{ all -> 0x073b }
        r2 = r1.m;	 Catch:{ all -> 0x073b }
        r4 = r1.f;	 Catch:{ all -> 0x073b }
        r4 = r4.k;	 Catch:{ all -> 0x073b }
        r2.c(r4);	 Catch:{ all -> 0x073b }
        r4 = 0;	 Catch:{ all -> 0x073b }
        r5 = 0;	 Catch:{ all -> 0x073b }
        r7 = 0;	 Catch:{ all -> 0x073b }
        r11 = 0;	 Catch:{ all -> 0x073b }
        r12 = 0;	 Catch:{ all -> 0x073b }
        r13 = 0;	 Catch:{ all -> 0x073b }
        r14 = 0;	 Catch:{ all -> 0x073b }
        r16 = 0;	 Catch:{ all -> 0x073b }
        r17 = 0;	 Catch:{ all -> 0x073b }
        r18 = 0;	 Catch:{ all -> 0x073b }
        r19 = 0;	 Catch:{ all -> 0x073b }
        r20 = 0;	 Catch:{ all -> 0x073b }
        r22 = 0;	 Catch:{ all -> 0x073b }
        r24 = 16375; // 0x3ff7 float:2.2946E-41 double:8.0903E-320;	 Catch:{ all -> 0x073b }
        r2 = defpackage.kqi.a(r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r22, r24);	 Catch:{ all -> 0x073b }
        r1.f = r2;	 Catch:{ all -> 0x073b }
        r40.d();	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.k;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x020a;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.k) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.b;	 Catch:{ all -> 0x073b }
        r3 = r1.a;	 Catch:{ all -> 0x073b }
        r4 = "expression";	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r2, r4);	 Catch:{ all -> 0x073b }
        r4 = r3.a;	 Catch:{ all -> 0x073b }
        if (r4 != 0) goto L_0x01d7;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r5 = r4.e;	 Catch:{ all -> 0x073b }
        r5 = r5.get(r2);	 Catch:{ all -> 0x073b }
        r5 = (java.lang.Integer) r5;	 Catch:{ all -> 0x073b }
        r6 = r4.e;	 Catch:{ all -> 0x073b }
        r6 = (java.util.Map) r6;	 Catch:{ all -> 0x073b }
        if (r5 != 0) goto L_0x01e6;	 Catch:{ all -> 0x073b }
        goto L_0x01eb;	 Catch:{ all -> 0x073b }
        r5 = r5.intValue();	 Catch:{ all -> 0x073b }
        r9 = r9 + r5;	 Catch:{ all -> 0x073b }
        r5 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x073b }
        r6.put(r2, r5);	 Catch:{ all -> 0x073b }
        r2 = r4.p;	 Catch:{ all -> 0x073b }
        if (r2 == 0) goto L_0x01fb;	 Catch:{ all -> 0x073b }
        r2 = r2.longValue();	 Catch:{ all -> 0x073b }
        goto L_0x0203;	 Catch:{ all -> 0x073b }
        r2 = r3.c;	 Catch:{ all -> 0x073b }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x073b }
        r2 = r2.a(r3);	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x073b }
        r4.p = r2;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.l;	 Catch:{ all -> 0x073b }
        r10 = 0;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0288;	 Catch:{ all -> 0x073b }
        r3 = r2;	 Catch:{ all -> 0x073b }
        r3 = (defpackage.kqe.l) r3;	 Catch:{ all -> 0x073b }
        r3 = r3.b;	 Catch:{ all -> 0x073b }
        r3 = (long) r3;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.l) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.c;	 Catch:{ all -> 0x073b }
        r5 = (long) r2;	 Catch:{ all -> 0x073b }
        r2 = r1.f;	 Catch:{ all -> 0x073b }
        r12 = r2.l;	 Catch:{ all -> 0x073b }
        r2 = r1.f;	 Catch:{ all -> 0x073b }
        r14 = r2.m;	 Catch:{ all -> 0x073b }
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x022a;	 Catch:{ all -> 0x073b }
        r17 = 1;	 Catch:{ all -> 0x073b }
        goto L_0x022c;	 Catch:{ all -> 0x073b }
        r17 = 0;	 Catch:{ all -> 0x073b }
        if (r17 == 0) goto L_0x0233;	 Catch:{ all -> 0x073b }
        r12 = java.lang.Math.max(r12, r3);	 Catch:{ all -> 0x073b }
        goto L_0x0237;	 Catch:{ all -> 0x073b }
        r14 = java.lang.Math.max(r14, r3);	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        r3 = r2.a;	 Catch:{ all -> 0x073b }
        if (r3 != 0) goto L_0x023e;	 Catch:{ all -> 0x073b }
        goto L_0x025c;	 Catch:{ all -> 0x073b }
        r3.f = r12;	 Catch:{ all -> 0x073b }
        r3.g = r14;	 Catch:{ all -> 0x073b }
        r4 = r3.q;	 Catch:{ all -> 0x073b }
        if (r4 != 0) goto L_0x025c;	 Catch:{ all -> 0x073b }
        r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r4 > 0) goto L_0x024e;	 Catch:{ all -> 0x073b }
        r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r4 <= 0) goto L_0x025c;	 Catch:{ all -> 0x073b }
        r2 = r2.c;	 Catch:{ all -> 0x073b }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x073b }
        r4 = r2.a(r4);	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r3.q = r2;	 Catch:{ all -> 0x073b }
        r2 = r1.f;	 Catch:{ all -> 0x073b }
        r17 = 0;	 Catch:{ all -> 0x073b }
        r18 = 0;	 Catch:{ all -> 0x073b }
        r20 = 0;	 Catch:{ all -> 0x073b }
        r22 = 0;	 Catch:{ all -> 0x073b }
        r24 = 0;	 Catch:{ all -> 0x073b }
        r25 = 0;	 Catch:{ all -> 0x073b }
        r26 = 0;	 Catch:{ all -> 0x073b }
        r27 = 0;	 Catch:{ all -> 0x073b }
        r29 = 0;	 Catch:{ all -> 0x073b }
        r30 = 0;	 Catch:{ all -> 0x073b }
        r31 = 0;	 Catch:{ all -> 0x073b }
        r32 = 0;	 Catch:{ all -> 0x073b }
        r37 = 4095; // 0xfff float:5.738E-42 double:2.023E-320;	 Catch:{ all -> 0x073b }
        r16 = r2;	 Catch:{ all -> 0x073b }
        r33 = r12;	 Catch:{ all -> 0x073b }
        r35 = r14;	 Catch:{ all -> 0x073b }
        r2 = defpackage.kqi.a(r16, r17, r18, r20, r22, r24, r25, r26, r27, r29, r30, r31, r32, r33, r35, r37);	 Catch:{ all -> 0x073b }
        r1.f = r2;	 Catch:{ all -> 0x073b }
        r40.d();	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.ah;	 Catch:{ all -> 0x073b }
        r6 = "lensId";
        if (r4 == 0) goto L_0x02e2;
        r3 = r2;	 Catch:{ all -> 0x073b }
        r3 = (defpackage.kqe.ah) r3;	 Catch:{ all -> 0x073b }
        r3 = r3.b;	 Catch:{ all -> 0x073b }
        r4 = r2;	 Catch:{ all -> 0x073b }
        r4 = (defpackage.kqe.ah) r4;	 Catch:{ all -> 0x073b }
        r4 = r4.c;	 Catch:{ all -> 0x073b }
        r7 = r2;	 Catch:{ all -> 0x073b }
        r7 = (defpackage.kqe.ah) r7;	 Catch:{ all -> 0x073b }
        r7 = r7.d;	 Catch:{ all -> 0x073b }
        r9 = r2;	 Catch:{ all -> 0x073b }
        r9 = (defpackage.kqe.ah) r9;	 Catch:{ all -> 0x073b }
        r9 = r9.e;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.ah) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.f;	 Catch:{ all -> 0x073b }
        r11 = r1.a;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r3, r6);	 Catch:{ all -> 0x073b }
        r6 = r11.a;	 Catch:{ all -> 0x073b }
        if (r6 != 0) goto L_0x02b0;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r11 = r6.a();	 Catch:{ all -> 0x073b }
        r3 = defpackage.akcr.a(r3, r11);	 Catch:{ all -> 0x073b }
        if (r3 == 0) goto L_0x02e1;	 Catch:{ all -> 0x073b }
        if (r2 == 0) goto L_0x02cf;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Double.valueOf(r4);	 Catch:{ all -> 0x073b }
        r6.k = r2;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Double.valueOf(r7);	 Catch:{ all -> 0x073b }
        r6.l = r2;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Double.valueOf(r9);	 Catch:{ all -> 0x073b }
        r6.m = r2;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Double.valueOf(r4);	 Catch:{ all -> 0x073b }
        r6.h = r2;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Double.valueOf(r7);	 Catch:{ all -> 0x073b }
        r6.i = r2;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Double.valueOf(r9);	 Catch:{ all -> 0x073b }
        r6.j = r2;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.v;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0315;	 Catch:{ all -> 0x073b }
        r3 = r2;	 Catch:{ all -> 0x073b }
        r3 = (defpackage.kqe.v) r3;	 Catch:{ all -> 0x073b }
        r3 = r3.b;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.v) r2;	 Catch:{ all -> 0x073b }
        r4 = r2.c;	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r3, r6);	 Catch:{ all -> 0x073b }
        r2 = r2.a;	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x02f9;	 Catch:{ all -> 0x073b }
        goto L_0x030d;	 Catch:{ all -> 0x073b }
        r6 = r2.a();	 Catch:{ all -> 0x073b }
        r6 = defpackage.akcr.a(r3, r6);	 Catch:{ all -> 0x073b }
        if (r6 == 0) goto L_0x030d;	 Catch:{ all -> 0x073b }
        r6 = r2.n;	 Catch:{ all -> 0x073b }
        if (r6 != 0) goto L_0x030d;	 Catch:{ all -> 0x073b }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r2.n = r4;	 Catch:{ all -> 0x073b }
        r2 = r1.l;	 Catch:{ all -> 0x073b }
        r4 = r1.f;	 Catch:{ all -> 0x073b }
        r2.a(r3, r4);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.j;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0394;	 Catch:{ all -> 0x073b }
        r3 = r1.n;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.j) r2;	 Catch:{ all -> 0x073b }
        r4 = r2.b;	 Catch:{ all -> 0x073b }
        r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x0330;	 Catch:{ all -> 0x073b }
        r4 = 50;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r4 = "BE";	 Catch:{ all -> 0x073b }
        r2 = defpackage.ajxs.a(r2, r4);	 Catch:{ all -> 0x073b }
        goto L_0x037f;	 Catch:{ all -> 0x073b }
        r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 == 0) goto L_0x0376;	 Catch:{ all -> 0x073b }
        r6 = 2;	 Catch:{ all -> 0x073b }
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 == 0) goto L_0x0376;	 Catch:{ all -> 0x073b }
        r6 = 3;	 Catch:{ all -> 0x073b }
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x0341;	 Catch:{ all -> 0x073b }
        goto L_0x0376;	 Catch:{ all -> 0x073b }
        r6 = 4;	 Catch:{ all -> 0x073b }
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x0350;	 Catch:{ all -> 0x073b }
        r4 = 83;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r4 = "ME";	 Catch:{ all -> 0x073b }
        goto L_0x032b;	 Catch:{ all -> 0x073b }
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ all -> 0x073b }
        r8 = 5;	 Catch:{ all -> 0x073b }
        r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 <= 0) goto L_0x035c;	 Catch:{ all -> 0x073b }
        goto L_0x0369;	 Catch:{ all -> 0x073b }
        r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));	 Catch:{ all -> 0x073b }
        if (r2 < 0) goto L_0x0369;	 Catch:{ all -> 0x073b }
        r4 = 92;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r4 = "HE";	 Catch:{ all -> 0x073b }
        goto L_0x032b;	 Catch:{ all -> 0x073b }
        r2 = defpackage.krv.c;	 Catch:{ all -> 0x073b }
        r4 = r2.a;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r4 = defpackage.krv.c;	 Catch:{ all -> 0x073b }
        r4 = r4.b;	 Catch:{ all -> 0x073b }
        goto L_0x032b;	 Catch:{ all -> 0x073b }
        r4 = 75;	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r4 = "LE";	 Catch:{ all -> 0x073b }
        goto L_0x032b;	 Catch:{ all -> 0x073b }
        r4 = r2.a;	 Catch:{ all -> 0x073b }
        r4 = (java.lang.Number) r4;	 Catch:{ all -> 0x073b }
        r4 = r4.longValue();	 Catch:{ all -> 0x073b }
        r2 = r2.b;	 Catch:{ all -> 0x073b }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x073b }
        r6 = new krv;	 Catch:{ all -> 0x073b }
        r6.<init>(r4, r2);	 Catch:{ all -> 0x073b }
        r3.a(r6);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.b;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x03a6;	 Catch:{ all -> 0x073b }
        r3 = r1.h;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.b) r2;	 Catch:{ all -> 0x073b }
        r4 = r1.n;	 Catch:{ all -> 0x073b }
        r4 = r4.a();	 Catch:{ all -> 0x073b }
        r3.a(r2, r4);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.al;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x03b8;	 Catch:{ all -> 0x073b }
        r3 = r1.h;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.al) r2;	 Catch:{ all -> 0x073b }
        r4 = r1.n;	 Catch:{ all -> 0x073b }
        r4 = r4.a();	 Catch:{ all -> 0x073b }
        r3.a(r2, r4);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.a.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x040c;	 Catch:{ all -> 0x073b }
        r40.a();	 Catch:{ all -> 0x073b }
        r2 = 0;	 Catch:{ all -> 0x073b }
        r1.e = r2;	 Catch:{ all -> 0x073b }
        r2 = r1.i;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r4 = new kqn;	 Catch:{ all -> 0x073b }
        r19 = 0;	 Catch:{ all -> 0x073b }
        r20 = 0;	 Catch:{ all -> 0x073b }
        r21 = 0;	 Catch:{ all -> 0x073b }
        r22 = 0;	 Catch:{ all -> 0x073b }
        r23 = 0;	 Catch:{ all -> 0x073b }
        r24 = 0;	 Catch:{ all -> 0x073b }
        r25 = 0;	 Catch:{ all -> 0x073b }
        r26 = 0;	 Catch:{ all -> 0x073b }
        r27 = 0;	 Catch:{ all -> 0x073b }
        r29 = 0;	 Catch:{ all -> 0x073b }
        r31 = 0;	 Catch:{ all -> 0x073b }
        r32 = 0;	 Catch:{ all -> 0x073b }
        r33 = 0;	 Catch:{ all -> 0x073b }
        r5 = r3.d;	 Catch:{ all -> 0x073b }
        r36 = 0;	 Catch:{ all -> 0x073b }
        r3 = r3.g;	 Catch:{ all -> 0x073b }
        r7 = defpackage.aapp.AD_TO_LENS;	 Catch:{ all -> 0x073b }
        if (r3 != r7) goto L_0x03f3;	 Catch:{ all -> 0x073b }
        r38 = 1;	 Catch:{ all -> 0x073b }
        goto L_0x03f5;	 Catch:{ all -> 0x073b }
        r38 = 0;	 Catch:{ all -> 0x073b }
        r39 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;	 Catch:{ all -> 0x073b }
        r18 = r4;	 Catch:{ all -> 0x073b }
        r34 = r5;	 Catch:{ all -> 0x073b }
        r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33, r34, r36, r38, r39);	 Catch:{ all -> 0x073b }
        r2.a(r4);	 Catch:{ all -> 0x073b }
        r2 = defpackage.kqi.n;	 Catch:{ all -> 0x073b }
        r1.f = r2;	 Catch:{ all -> 0x073b }
        r2 = r1.l;	 Catch:{ all -> 0x073b }
        r2.a();	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.g.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 != 0) goto L_0x0737;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.h.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x041e;	 Catch:{ all -> 0x073b }
        goto L_0x0737;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.y.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        r10 = "analyticsSession";
        if (r4 == 0) goto L_0x0456;
        r3 = r1.a;	 Catch:{ all -> 0x073b }
        r3.c();	 Catch:{ all -> 0x073b }
        r3 = r1.c;	 Catch:{ all -> 0x073b }
        r3.c();	 Catch:{ all -> 0x073b }
        r3 = r1.j;	 Catch:{ all -> 0x073b }
        r4 = 0;	 Catch:{ all -> 0x073b }
        r3.c = r4;	 Catch:{ all -> 0x073b }
        r3 = r1.j;	 Catch:{ all -> 0x073b }
        r4 = r1.f;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r4, r10);	 Catch:{ all -> 0x073b }
        r5 = r4.b;	 Catch:{ all -> 0x073b }
        r5 = r5.a();	 Catch:{ all -> 0x073b }
        if (r5 == 0) goto L_0x0452;	 Catch:{ all -> 0x073b }
        r5 = r3.d;	 Catch:{ all -> 0x073b }
        r6 = new krj$c;	 Catch:{ all -> 0x073b }
        r6.<init>(r3, r4);	 Catch:{ all -> 0x073b }
        r6 = (defpackage.akbk) r6;	 Catch:{ all -> 0x073b }
        r5.a(r6);	 Catch:{ all -> 0x073b }
        r40.b(r41);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = 0;	 Catch:{ all -> 0x073b }
        r11 = defpackage.kqe.aj.b;	 Catch:{ all -> 0x073b }
        r11 = defpackage.akcr.a(r2, r11);	 Catch:{ all -> 0x073b }
        if (r11 == 0) goto L_0x0471;	 Catch:{ all -> 0x073b }
        r3 = r1.a;	 Catch:{ all -> 0x073b }
        r3.b();	 Catch:{ all -> 0x073b }
        r3 = r1.c;	 Catch:{ all -> 0x073b }
        r3.b();	 Catch:{ all -> 0x073b }
        r3 = r1.j;	 Catch:{ all -> 0x073b }
        r3.c = r9;	 Catch:{ all -> 0x073b }
        r40.b(r41);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r11 = defpackage.kqe.ai.b;	 Catch:{ all -> 0x073b }
        r11 = defpackage.akcr.a(r2, r11);	 Catch:{ all -> 0x073b }
        if (r11 == 0) goto L_0x04e3;	 Catch:{ all -> 0x073b }
        r2 = r1.e;	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x0480;	 Catch:{ all -> 0x073b }
        r40.a();	 Catch:{ all -> 0x073b }
        r2 = r1.e;	 Catch:{ all -> 0x073b }
        r3 = defpackage.kqe.h.b;	 Catch:{ all -> 0x073b }
        r3 = r3.getClass();	 Catch:{ all -> 0x073b }
        r2 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x049f;	 Catch:{ all -> 0x073b }
        r2 = r1.e;	 Catch:{ all -> 0x073b }
        r3 = defpackage.kqe.y.b;	 Catch:{ all -> 0x073b }
        r3 = r3.getClass();	 Catch:{ all -> 0x073b }
        r2 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x073b }
        if (r2 == 0) goto L_0x049d;	 Catch:{ all -> 0x073b }
        goto L_0x049f;	 Catch:{ all -> 0x073b }
        r2 = 0;	 Catch:{ all -> 0x073b }
        goto L_0x04e0;	 Catch:{ all -> 0x073b }
        r2 = r1.f;	 Catch:{ all -> 0x073b }
        r18 = 0;	 Catch:{ all -> 0x073b }
        r19 = 0;	 Catch:{ all -> 0x073b }
        r21 = 0;	 Catch:{ all -> 0x073b }
        r23 = 0;	 Catch:{ all -> 0x073b }
        r25 = 0;	 Catch:{ all -> 0x073b }
        r26 = 0;	 Catch:{ all -> 0x073b }
        r27 = 0;	 Catch:{ all -> 0x073b }
        r28 = 0;	 Catch:{ all -> 0x073b }
        r30 = 0;	 Catch:{ all -> 0x073b }
        r31 = 0;	 Catch:{ all -> 0x073b }
        r32 = 0;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.k;	 Catch:{ all -> 0x073b }
        r4 = r1.f;	 Catch:{ all -> 0x073b }
        r4 = r4.k;	 Catch:{ all -> 0x073b }
        r9 = r4.b;	 Catch:{ all -> 0x073b }
        r9 = r9 + r7;	 Catch:{ all -> 0x073b }
        r3 = r3.a;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r3, r5);	 Catch:{ all -> 0x073b }
        r4 = new kqj;	 Catch:{ all -> 0x073b }
        r4.<init>(r3, r9);	 Catch:{ all -> 0x073b }
        r34 = 0;	 Catch:{ all -> 0x073b }
        r36 = 0;	 Catch:{ all -> 0x073b }
        r38 = 14335; // 0x37ff float:2.0088E-41 double:7.0824E-320;	 Catch:{ all -> 0x073b }
        r17 = r2;	 Catch:{ all -> 0x073b }
        r33 = r4;	 Catch:{ all -> 0x073b }
        r2 = defpackage.kqi.a(r17, r18, r19, r21, r23, r25, r26, r27, r28, r30, r31, r32, r33, r34, r36, r38);	 Catch:{ all -> 0x073b }
        r1.f = r2;	 Catch:{ all -> 0x073b }
        r40.a();	 Catch:{ all -> 0x073b }
        goto L_0x049d;	 Catch:{ all -> 0x073b }
        r1.e = r2;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r5 = defpackage.kqe.o.b;	 Catch:{ all -> 0x073b }
        r5 = defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x073b }
        if (r5 == 0) goto L_0x0508;	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        r3 = r2.a;	 Catch:{ all -> 0x073b }
        if (r3 != 0) goto L_0x04f2;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r3.o = r9;	 Catch:{ all -> 0x073b }
        r2 = r2.c;	 Catch:{ all -> 0x073b }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x073b }
        r4 = r2.a(r4);	 Catch:{ all -> 0x073b }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x073b }
        r3.r = r2;	 Catch:{ all -> 0x073b }
        r2 = r3.d;	 Catch:{ all -> 0x073b }
        r2.a();	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r5 = defpackage.kqe.p.b;	 Catch:{ all -> 0x073b }
        r5 = defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x073b }
        if (r5 == 0) goto L_0x051c;	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        r2 = r2.a;	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x0517;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x073b }
        r2.t = r3;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r5 = defpackage.kqe.q.b;	 Catch:{ all -> 0x073b }
        r5 = defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x073b }
        if (r5 == 0) goto L_0x0530;	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        r2 = r2.a;	 Catch:{ all -> 0x073b }
        if (r2 != 0) goto L_0x052b;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x073b }
        r2.u = r3;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r5 = defpackage.kqe.n.b;	 Catch:{ all -> 0x073b }
        r5 = defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x073b }
        if (r5 == 0) goto L_0x0560;	 Catch:{ all -> 0x073b }
        r2 = r1.a;	 Catch:{ all -> 0x073b }
        r3 = r2.a;	 Catch:{ all -> 0x073b }
        if (r3 != 0) goto L_0x053f;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r3.d;	 Catch:{ all -> 0x073b }
        r4.b();	 Catch:{ all -> 0x073b }
        r4 = r3.d;	 Catch:{ all -> 0x073b }
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x073b }
        r4 = r4.a(r5);	 Catch:{ all -> 0x073b }
        r4 = (float) r4;	 Catch:{ all -> 0x073b }
        r5 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;	 Catch:{ all -> 0x073b }
        r4 = r4 / r5;	 Catch:{ all -> 0x073b }
        r4 = java.lang.Float.valueOf(r4);	 Catch:{ all -> 0x073b }
        r3.s = r4;	 Catch:{ all -> 0x073b }
        r2 = r2.b;	 Catch:{ all -> 0x073b }
        r3 = defpackage.kst.a.a(r3);	 Catch:{ all -> 0x073b }
        r2.d(r3);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r5 = r2 instanceof defpackage.kqe.ab;	 Catch:{ all -> 0x073b }
        if (r5 == 0) goto L_0x05d1;	 Catch:{ all -> 0x073b }
        r3 = r1.i;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.ab) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.b;	 Catch:{ all -> 0x073b }
        r5 = r1.f;	 Catch:{ all -> 0x073b }
        r5 = r5.g;	 Catch:{ all -> 0x073b }
        r6 = defpackage.aapp.AD_TO_LENS;	 Catch:{ all -> 0x073b }
        if (r5 != r6) goto L_0x0575;	 Catch:{ all -> 0x073b }
        r32 = 1;	 Catch:{ all -> 0x073b }
        goto L_0x0577;	 Catch:{ all -> 0x073b }
        r32 = 0;	 Catch:{ all -> 0x073b }
        r11 = r2.a;	 Catch:{ all -> 0x073b }
        r12 = r2.b;	 Catch:{ all -> 0x073b }
        r13 = r2.c;	 Catch:{ all -> 0x073b }
        r14 = r2.d;	 Catch:{ all -> 0x073b }
        r15 = r2.e;	 Catch:{ all -> 0x073b }
        r4 = r2.f;	 Catch:{ all -> 0x073b }
        r5 = r2.g;	 Catch:{ all -> 0x073b }
        r6 = r2.h;	 Catch:{ all -> 0x073b }
        r7 = r2.i;	 Catch:{ all -> 0x073b }
        r9 = r2.j;	 Catch:{ all -> 0x073b }
        r16 = r9;	 Catch:{ all -> 0x073b }
        r9 = r2.k;	 Catch:{ all -> 0x073b }
        r10 = r2.l;	 Catch:{ all -> 0x073b }
        r1 = r2.m;	 Catch:{ all -> 0x05cc }
        r19 = r7;	 Catch:{ all -> 0x05cc }
        r7 = r2.n;	 Catch:{ all -> 0x05cc }
        r26 = r7;	 Catch:{ all -> 0x05cc }
        r7 = r2.o;	 Catch:{ all -> 0x05cc }
        r33 = r3;	 Catch:{ all -> 0x05cc }
        r2 = r2.p;	 Catch:{ all -> 0x05cc }
        r30 = r2;	 Catch:{ all -> 0x05cc }
        r2 = new kqn;	 Catch:{ all -> 0x05cc }
        r3 = r10;	 Catch:{ all -> 0x05cc }
        r21 = r16;	 Catch:{ all -> 0x05cc }
        r10 = r2;	 Catch:{ all -> 0x05cc }
        r16 = r4;	 Catch:{ all -> 0x05cc }
        r17 = r5;	 Catch:{ all -> 0x05cc }
        r18 = r6;	 Catch:{ all -> 0x05cc }
        r23 = r9;	 Catch:{ all -> 0x05cc }
        r24 = r3;	 Catch:{ all -> 0x05cc }
        r25 = r1;	 Catch:{ all -> 0x05cc }
        r28 = r7;	 Catch:{ all -> 0x05cc }
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r30, r32);	 Catch:{ all -> 0x05cc }
        r1 = r33;	 Catch:{ all -> 0x05cc }
        r1.a(r2);	 Catch:{ all -> 0x05cc }
        r1 = r40;
        r2 = r1.f;	 Catch:{ all -> 0x073b }
        r2 = r2.g;	 Catch:{ all -> 0x073b }
        r3 = defpackage.aapp.AD_TO_LENS;	 Catch:{ all -> 0x073b }
        if (r2 != r3) goto L_0x0725;	 Catch:{ all -> 0x073b }
        r2 = defpackage.kqi.n;	 Catch:{ all -> 0x073b }
        r1.f = r2;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r0 = move-exception;	 Catch:{ all -> 0x073b }
        r1 = r40;	 Catch:{ all -> 0x073b }
        goto L_0x073c;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.ad;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x05fb;	 Catch:{ all -> 0x073b }
        r3 = r1.j;	 Catch:{ all -> 0x073b }
        r4 = r2;	 Catch:{ all -> 0x073b }
        r4 = (defpackage.kqe.ad) r4;	 Catch:{ all -> 0x073b }
        r4 = r4.b;	 Catch:{ all -> 0x073b }
        r5 = r2;	 Catch:{ all -> 0x073b }
        r5 = (defpackage.kqe.ad) r5;	 Catch:{ all -> 0x073b }
        r5 = r5.c;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.ad) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.d;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r4, r6);	 Catch:{ all -> 0x073b }
        r2 = defpackage.krj.a(r2);	 Catch:{ all -> 0x073b }
        r3.b = r2;	 Catch:{ all -> 0x073b }
        r2 = r3.d;	 Catch:{ all -> 0x073b }
        r6 = new krj$b;	 Catch:{ all -> 0x073b }
        r6.<init>(r3, r4, r5);	 Catch:{ all -> 0x073b }
        r6 = (defpackage.akbk) r6;	 Catch:{ all -> 0x073b }
        r2.a(r6);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.af;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x061f;	 Catch:{ all -> 0x073b }
        r3 = r1.j;	 Catch:{ all -> 0x073b }
        r4 = r2;	 Catch:{ all -> 0x073b }
        r4 = (defpackage.kqe.af) r4;	 Catch:{ all -> 0x073b }
        r4 = r4.b;	 Catch:{ all -> 0x073b }
        r5 = r2;	 Catch:{ all -> 0x073b }
        r5 = (defpackage.kqe.af) r5;	 Catch:{ all -> 0x073b }
        r5 = r5.c;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.af) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.d;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r4, r6);	 Catch:{ all -> 0x073b }
        r6 = r3.d;	 Catch:{ all -> 0x073b }
        r7 = new krj$e;	 Catch:{ all -> 0x073b }
        r7.<init>(r3, r4, r5, r2);	 Catch:{ all -> 0x073b }
        r7 = (defpackage.akbk) r7;	 Catch:{ all -> 0x073b }
        r6.a(r7);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.ae;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x062c;	 Catch:{ all -> 0x073b }
        r3 = r1.j;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.ae) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.b;	 Catch:{ all -> 0x073b }
        r3.a = r2;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.ac.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0650;	 Catch:{ all -> 0x073b }
        r2 = r1.j;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r3, r10);	 Catch:{ all -> 0x073b }
        r4 = r3.b;	 Catch:{ all -> 0x073b }
        r4 = r4.a();	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x064f;	 Catch:{ all -> 0x073b }
        r4 = r2.d;	 Catch:{ all -> 0x073b }
        r5 = new krj$a;	 Catch:{ all -> 0x073b }
        r5.<init>(r2, r3);	 Catch:{ all -> 0x073b }
        r5 = (defpackage.akbk) r5;	 Catch:{ all -> 0x073b }
        r4.a(r5);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.ag.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0674;	 Catch:{ all -> 0x073b }
        r2 = r1.j;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r3, r10);	 Catch:{ all -> 0x073b }
        r4 = r3.b;	 Catch:{ all -> 0x073b }
        r4 = r4.a();	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0673;	 Catch:{ all -> 0x073b }
        r4 = r2.d;	 Catch:{ all -> 0x073b }
        r5 = new krj$d;	 Catch:{ all -> 0x073b }
        r5.<init>(r2, r3);	 Catch:{ all -> 0x073b }
        r5 = (defpackage.akbk) r5;	 Catch:{ all -> 0x073b }
        r4.a(r5);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.t;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0682;	 Catch:{ all -> 0x073b }
        r3 = r1.g;	 Catch:{ all -> 0x073b }
        r4 = r1.f;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.t) r2;	 Catch:{ all -> 0x073b }
        r3.a(r4, r2);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.m.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 != 0) goto L_0x0726;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.r.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0694;	 Catch:{ all -> 0x073b }
        goto L_0x0726;	 Catch:{ all -> 0x073b }
        r4 = defpackage.kqe.z.b;	 Catch:{ all -> 0x073b }
        r4 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x06ad;	 Catch:{ all -> 0x073b }
        r2 = r1.l;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r2.b(r3);	 Catch:{ all -> 0x073b }
        r2 = r1.m;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.k;	 Catch:{ all -> 0x073b }
        r2.b(r3);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.c;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x06b9;	 Catch:{ all -> 0x073b }
        r3 = r1.k;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.c) r2;	 Catch:{ all -> 0x073b }
        r3.a(r2);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.ak;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x06d0;	 Catch:{ all -> 0x073b }
        r3 = r1.m;	 Catch:{ all -> 0x073b }
        r4 = r2;	 Catch:{ all -> 0x073b }
        r4 = (defpackage.kqe.ak) r4;	 Catch:{ all -> 0x073b }
        r4 = r4.b;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.ak) r2;	 Catch:{ all -> 0x073b }
        r2 = r2.c;	 Catch:{ all -> 0x073b }
        r5 = r1.f;	 Catch:{ all -> 0x073b }
        r5 = r5.k;	 Catch:{ all -> 0x073b }
        r3.a(r4, r2, r5);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r4 = r2 instanceof defpackage.kqe.w;	 Catch:{ all -> 0x073b }
        if (r4 == 0) goto L_0x0725;	 Catch:{ all -> 0x073b }
        r4 = r1.d;	 Catch:{ all -> 0x073b }
        r2 = (defpackage.kqe.w) r2;	 Catch:{ all -> 0x073b }
        r5 = r1.f;	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r2, r3);	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r5, r10);	 Catch:{ all -> 0x073b }
        r6 = r4.a;	 Catch:{ all -> 0x073b }
        if (r6 == 0) goto L_0x06f7;	 Catch:{ all -> 0x073b }
        r7 = r6.a;	 Catch:{ all -> 0x073b }
        r8 = r2.b;	 Catch:{ all -> 0x073b }
        if (r7 != r8) goto L_0x06f4;	 Catch:{ all -> 0x073b }
        r6 = r6.b;	 Catch:{ all -> 0x073b }
        r7 = r5.a;	 Catch:{ all -> 0x073b }
        r6 = defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x073b }
        if (r6 != 0) goto L_0x0725;	 Catch:{ all -> 0x073b }
        r4.a();	 Catch:{ all -> 0x073b }
        r6 = r4.b;	 Catch:{ all -> 0x073b }
        r14 = defpackage.krm.a(r6);	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r2, r3);	 Catch:{ all -> 0x073b }
        defpackage.akcr.b(r5, r10);	 Catch:{ all -> 0x073b }
        r3 = new krq;	 Catch:{ all -> 0x073b }
        r12 = r2.b;	 Catch:{ all -> 0x073b }
        r13 = r2.c;	 Catch:{ all -> 0x073b }
        r2 = r5.g;	 Catch:{ all -> 0x073b }
        r6 = r5.e;	 Catch:{ all -> 0x073b }
        r8 = r5.a;	 Catch:{ all -> 0x073b }
        r9 = r5.k;	 Catch:{ all -> 0x073b }
        r20 = r9.a();	 Catch:{ all -> 0x073b }
        r5 = r5.h;	 Catch:{ all -> 0x073b }
        r11 = r3;	 Catch:{ all -> 0x073b }
        r16 = r2;	 Catch:{ all -> 0x073b }
        r17 = r6;	 Catch:{ all -> 0x073b }
        r19 = r8;	 Catch:{ all -> 0x073b }
        r21 = r5;	 Catch:{ all -> 0x073b }
        r11.<init>(r12, r13, r14, r16, r17, r19, r20, r21);	 Catch:{ all -> 0x073b }
        r4.a = r3;	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r2 = r1.l;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r2.a(r3);	 Catch:{ all -> 0x073b }
        r2 = r1.m;	 Catch:{ all -> 0x073b }
        r3 = r1.f;	 Catch:{ all -> 0x073b }
        r3 = r3.k;	 Catch:{ all -> 0x073b }
        r2.a(r3);	 Catch:{ all -> 0x073b }
        return;	 Catch:{ all -> 0x073b }
        r40.b(r41);	 Catch:{ all -> 0x073b }
        return;
        r0 = move-exception;
        r2 = r0;
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqp.a(kqe):void");
    }
}
