package defpackage;

import defpackage.dvx.a;
import defpackage.dvx.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: dyp */
public final class dyp implements b, dyq {
    final gqr a;
    final dpf b;
    final abre c;
    final adhk d;
    dvx e;
    int f = -1;
    public adii g;
    public adii h;
    private final adie k = new adie();
    private final List<dyy> l;
    private final ConcurrentLinkedQueue<dyy> m;

    /* renamed from: dyp$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[abrd.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.abrd.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.abrd.LOW_END;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.abrd.BARELY_WORKING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.abrd.HIGH_END;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.abrd.MID_END;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dyp$2.<clinit>():void");
        }
    }

    /* renamed from: dyp$1 */
    class 1 implements Runnable {
        private /* synthetic */ dvl a;
        private /* synthetic */ a b;
        private /* synthetic */ aipn c;
        private /* synthetic */ dzb d;
        private /* synthetic */ int e;
        private /* synthetic */ boolean f;
        private /* synthetic */ boolean g;
        private /* synthetic */ boolean h;
        private /* synthetic */ long i;
        private /* synthetic */ adie j;
        private /* synthetic */ boolean k;
        private /* synthetic */ boolean l;
        private /* synthetic */ boolean m;
        private /* synthetic */ float n;
        private /* synthetic */ dyp o;

        1(dyp dyp, dvl dvl, a aVar, aipn aipn, dzb dzb, int i, boolean z, boolean z2, boolean z3, long j, adie adie, boolean z4, boolean z5, boolean z6, float f) {
            this.o = dyp;
            this.a = dvl;
            this.b = aVar;
            this.c = aipn;
            this.d = dzb;
            this.e = i;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = j;
            this.j = adie;
            this.k = z4;
            this.l = z5;
            this.m = z6;
            this.n = f;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0058 in {1, 3, 7, 8, 11, 13} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r14 = this;
            r0 = r14.a;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0 = r0.b;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0.b();	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0 = r14.b;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0 = r0.d;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0.b();	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r1 = r14.e;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0 = r14.b;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0 = r0.a;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r2 = r0.c;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r3 = r14.f;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r4 = r14.g;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r5 = r14.h;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r6 = r14.a;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r7 = r14.i;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r9 = r14.j;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0 = r14.b;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r10 = r0.c;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r11 = r14.l;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r12 = r14.m;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r13 = r14.n;	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            defpackage.dyp.a(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13);	 Catch:{ dxx -> 0x0039, adjw -> 0x0037 }
            r0 = r14.b;
            r0.b();
            return;
            r0 = move-exception;
            goto L_0x0052;
            r0 = move-exception;
            goto L_0x003a;
            r0 = move-exception;
            r1 = r14.o;	 Catch:{ all -> 0x0035 }
            r1 = r1.a;	 Catch:{ all -> 0x0035 }
            r2 = defpackage.gqt.NORMAL;	 Catch:{ all -> 0x0035 }
            r3 = defpackage.dnj.a;	 Catch:{ all -> 0x0035 }
            r4 = "FrameToSurfacesBufferDispatcher";	 Catch:{ all -> 0x0035 }
            r3 = r3.callsite(r4);	 Catch:{ all -> 0x0035 }
            r4 = "renderToSurfaceWithCache";	 Catch:{ all -> 0x0035 }
            r3 = r3.a(r4);	 Catch:{ all -> 0x0035 }
            r1.a(r2, r0, r3);	 Catch:{ all -> 0x0035 }
            goto L_0x002f;
            r1 = r14.b;
            r1.b();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dyp$1.run():void");
        }
    }

    dyp(gqr gqr, abre abre, adhk adhk, dpf dpf) {
        this.a = gqr;
        this.b = dpf;
        this.d = adhk;
        this.l = new ArrayList();
        this.m = new ConcurrentLinkedQueue();
        this.c = abre;
    }

    private int a(int i, float... fArr) {
        try {
            a(adic.EXTERNAL_OES).a(i, 0, new adie((float[]) fArr.clone()), null);
            return 0;
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    private int a(aipn<ebf> aipn) {
        ((ebf) aipn.get()).a(ebf.a.Default, this.k.b, false, false);
        try {
            adii a = a(adic.TEXTURE_2D);
            a.d = this.k;
            a.a(((ebf) aipn.get()).a(ebf.a.Default, false), 0, i, null);
            return ((ebf) aipn.get()).a(ebf.a.Preview, false);
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    private int a(dzb dzb, float... fArr) {
        try {
            adii a = a(adic.TEXTURE_2D);
            int b = dzb.b();
            a.d = i;
            a.a(b, 0, new adie((float[]) fArr.clone()), null);
            return 0;
        } catch (adjz e) {
            throw new dxx(e);
        }
    }

    private adii a(adic adic) {
        if (adic == adic.TEXTURE_2D) {
            if (this.g == null) {
                this.g = b(adic);
            }
            return this.g;
        }
        if (this.h == null) {
            this.h = b(adic);
        }
        return this.h;
    }

    /* JADX WARNING: Missing block: B:16:0x0059, code skipped:
            if (r27 == false) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:19:0x0064, code skipped:
            if (r27 == false) goto L_0x0066;
     */
    static void a(int r16, int r17, boolean r18, boolean r19, boolean r20, defpackage.dvl r21, long r22, defpackage.adie r24, defpackage.dyy r25, boolean r26, boolean r27, float r28) {
        /*
        r0 = r16;
        r1 = r21;
        r13 = r25;
        r14 = android.os.SystemClock.elapsedRealtime();
        r2 = r1.a;
        r2 = r2.a;
        r3 = -1;
        r13.c(r2, r3);
        r2 = r1.b;
        r2.b();
        r2 = 1;
        r3 = 3;
        if (r0 != r3) goto L_0x0033;
    L_0x001c:
        r0 = r1.c;
        r3 = -1;
        r4 = defpackage.adic.TEXTURE_2D;
        r8 = i;
        r9 = r27 ^ 1;
        r2 = r0;
        r5 = r22;
        r7 = r8;
    L_0x0029:
        r10 = r25;
        r11 = r26;
        r12 = r28;
        r2.a(r3, r4, r5, r7, r8, r9, r10, r11, r12);
        goto L_0x0072;
    L_0x0033:
        r3 = 0;
        r4 = 2;
        if (r18 == 0) goto L_0x004f;
    L_0x0037:
        if (r19 == 0) goto L_0x004f;
    L_0x0039:
        r5 = r1.c;
        r6 = defpackage.adic.TEXTURE_2D;
        r7 = j;
        r8 = i;
        if (r0 == r4) goto L_0x0047;
    L_0x0043:
        if (r27 != 0) goto L_0x0047;
    L_0x0045:
        r9 = 1;
        goto L_0x0048;
    L_0x0047:
        r9 = 0;
    L_0x0048:
        r2 = r5;
        r3 = r17;
        r4 = r6;
        r5 = r22;
        goto L_0x0029;
    L_0x004f:
        if (r20 == 0) goto L_0x005c;
    L_0x0051:
        r5 = r1.c;
        r6 = defpackage.adic.TEXTURE_2D;
        r7 = i;
        if (r0 == r4) goto L_0x0068;
    L_0x0059:
        if (r27 != 0) goto L_0x0068;
    L_0x005b:
        goto L_0x0066;
    L_0x005c:
        r5 = r1.c;
        r6 = defpackage.adic.TEXTURE_2D;
        r7 = i;
        if (r0 == r4) goto L_0x0068;
    L_0x0064:
        if (r27 != 0) goto L_0x0068;
    L_0x0066:
        r9 = 1;
        goto L_0x0069;
    L_0x0068:
        r9 = 0;
    L_0x0069:
        r2 = r5;
        r3 = r17;
        r4 = r6;
        r5 = r22;
        r8 = r24;
        goto L_0x0029;
    L_0x0072:
        r0 = r1.a;
        r0 = r0.a;
        r1 = android.os.SystemClock.elapsedRealtime();
        r1 = r1 - r14;
        r13.c(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyp.a(int, int, boolean, boolean, boolean, dvl, long, adie, dyy, boolean, boolean, float):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARNING: Missing block: B:15:0x0086, code skipped:
            if (r32 == false) goto L_0x00ac;
     */
    /* JADX WARNING: Missing block: B:18:0x00aa, code skipped:
            if (r32 == false) goto L_0x00ac;
     */
    private void a(defpackage.aipn<defpackage.ebf> r20, boolean r21, boolean r22, int r23, int r24, defpackage.dvl r25, float[] r26, long r27, defpackage.adie r29, defpackage.dyy r30, boolean r31, boolean r32, float r33) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r23;
        r2 = r25;
        r14 = r30;
        r15 = android.os.SystemClock.elapsedRealtime();
        r3 = r2.a;
        r3 = r3.a;
        r4 = -1;
        r14.c(r3, r4);
        r3 = r2.b;
        r3.b();
        r20.get();
        r13 = 2;
        r12 = 0;
        r11 = 1;
        r3 = 3;
        if (r1 != r3) goto L_0x003a;
    L_0x0023:
        r3 = r2.c;
        r4 = -1;
        r5 = defpackage.adic.TEXTURE_2D;
        r9 = i;
        r10 = r32 ^ 1;
        r6 = r27;
        r8 = r9;
        r11 = r30;
        r12 = r31;
        r14 = 2;
        r13 = r33;
        r3.a(r4, r5, r6, r8, r9, r10, r11, r12, r13);
        goto L_0x006f;
    L_0x003a:
        r14 = 2;
        if (r22 == 0) goto L_0x006f;
    L_0x003d:
        r3 = r20.get();
        r3 = (defpackage.ebf) r3;
        r4 = defpackage.ebf.a.Preview;
        r5 = r0.k;
        r5 = r5.b;
        r12 = 1;
        r13 = 0;
        r3.a(r4, r5, r13, r12);
        r3 = r2.c;
        r5 = defpackage.adic.TEXTURE_2D;
        r8 = r0.k;
        if (r1 == r14) goto L_0x005a;
    L_0x0056:
        if (r32 != 0) goto L_0x005a;
    L_0x0058:
        r10 = 1;
        goto L_0x005b;
    L_0x005a:
        r10 = 0;
    L_0x005b:
        r4 = r24;
        r6 = r27;
        r9 = r29;
        r11 = r30;
        r17 = 1;
        r12 = r31;
        r18 = 0;
        r13 = r33;
        r3.a(r4, r5, r6, r8, r9, r10, r11, r12, r13);
        goto L_0x0073;
    L_0x006f:
        r17 = 1;
        r18 = 0;
    L_0x0073:
        if (r21 == 0) goto L_0x0089;
    L_0x0075:
        r3 = r2.c;
        r5 = defpackage.adic.TEXTURE_2D;
        r8 = new adie;
        r4 = r26.clone();
        r4 = (float[]) r4;
        r8.<init>(r4);
        if (r1 == r14) goto L_0x00ae;
    L_0x0086:
        if (r32 != 0) goto L_0x00ae;
    L_0x0088:
        goto L_0x00ac;
    L_0x0089:
        r3 = r2.c;
        r5 = defpackage.adic.EXTERNAL_OES;
        r4 = new adie;
        r6 = r26.clone();
        r6 = (float[]) r6;
        r4.<init>(r6);
        r6 = -1090519040; // 0xffffffffbf000000 float:-0.5 double:NaN;
        r4 = r4.a(r6, r6);
        r4 = r4.d();
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r8 = r4.a(r6, r6);
        if (r1 == r14) goto L_0x00ae;
    L_0x00aa:
        if (r32 != 0) goto L_0x00ae;
    L_0x00ac:
        r10 = 1;
        goto L_0x00af;
    L_0x00ae:
        r10 = 0;
    L_0x00af:
        r4 = r24;
        r6 = r27;
        r9 = r29;
        r11 = r30;
        r12 = r31;
        r13 = r33;
        r3.a(r4, r5, r6, r8, r9, r10, r11, r12, r13);
        r1 = r2.a;
        r1 = r1.a;
        r2 = android.os.SystemClock.elapsedRealtime();
        r2 = r2 - r15;
        r4 = r30;
        r4.c(r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyp.a(aipn, boolean, boolean, int, int, dvl, float[], long, adie, dyy, boolean, boolean, float):void");
    }

    private void a(Collection<dvl> collection) {
        while (true) {
            dyy dyy = (dyy) this.m.poll();
            if (dyy != null) {
                for (dvl a : collection) {
                    a.a(dyy, dyy.f());
                }
                this.l.add(dyy);
            } else {
                return;
            }
        }
    }

    private adii b(adic adic) {
        adii adii = new adii();
        try {
            adie adie = i;
            adii.a(adie, adie, this.e.d.b(), this.e.d.c(), adic, null, new adhz(abyb.a.a.a));
            return adii;
        } catch (adjz e) {
            try {
                adii.e();
            } catch (adjw unused) {
            }
            throw new dxx(e);
        }
    }

    public final void a() {
        a(new ArrayList());
    }

    public final void a(a aVar) {
        this.m.add(aVar.c);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:127:0x031b in {2, 3, 6, 7, 9, 10, 15, 16, 21, 22, 27, 28, 29, 38, 39, 41, 44, 45, 58, 59, 60, 62, 63, 69, 71, 81, 82, 84, 90, 92, 93, 97, 99, 100, 102, 104, 108, 109, 111, 113, 115, 117, 120, 123, 126} preds:[]
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
    public final void a(defpackage.dxz r47, defpackage.aipn<defpackage.ebf> r48, defpackage.dzb r49, int r50, float[] r51, int r52, long r53, long r55, defpackage.adie r57, java.util.Collection<defpackage.dvl> r58, boolean r59, boolean r60, boolean r61, boolean r62, float r63) {
        /*
        r46 = this;
        r15 = r46;
        r0 = r49;
        r18 = android.os.SystemClock.elapsedRealtime();
        r1 = r58;
        r15.a(r1);
        r2 = r15.l;
        r2 = r2.isEmpty();
        r14 = 1;
        if (r2 == 0) goto L_0x001c;
        r2 = new dyy;
        r2.<init>();
        goto L_0x0029;
        r2 = r15.l;
        r3 = r2.size();
        r3 = r3 - r14;
        r2 = r2.remove(r3);
        r2 = (defpackage.dyy) r2;
        r13 = r2;
        r13.e();
        r47.b();
        r2 = defpackage.adic.EXTERNAL_OES;
        r3 = r49.a();
        r20 = 0;
        if (r3 == 0) goto L_0x0049;
        r3 = r57;
        r4 = r3.b;
        r5 = r51;
        r6 = r52;
        r4 = r0.a(r6, r2, r5, r4);
        r34 = r4;
        goto L_0x0051;
        r5 = r51;
        r6 = r52;
        r3 = r57;
        r34 = 0;
        if (r34 == 0) goto L_0x006a;
        r2 = r49.b();
        r3 = r49.c();
        r4 = r49.d();
        r4 = r4.b;
        r5 = r49.e();
        r12 = r2;
        r2 = r3;
        r11 = r4;
        r9 = r5;
        goto L_0x006d;
        r9 = r3;
        r11 = r5;
        r12 = r6;
        r3 = r48.get();
        r3 = (defpackage.ebf) r3;
        r3 = r3.e();
        if (r3 == 0) goto L_0x0087;
        r3 = r48.get();
        r3 = (defpackage.ebf) r3;
        r3 = r3.f();
        if (r3 == 0) goto L_0x0087;
        r3 = 1;
        goto L_0x0088;
        r3 = 0;
        r4 = r48.get();
        r4 = (defpackage.ebf) r4;
        r4 = r4.g();
        if (r4 == 0) goto L_0x00a3;
        r4 = r48.get();
        r4 = (defpackage.ebf) r4;
        r4 = r4.f();
        if (r4 == 0) goto L_0x00a3;
        r35 = 1;
        goto L_0x00a5;
        r35 = 0;
        r4 = android.os.SystemClock.elapsedRealtime();
        if (r3 == 0) goto L_0x00d5;
        r3 = r48.get();
        r21 = r3;
        r21 = (defpackage.ebf) r21;
        r3 = defpackage.adic.EXTERNAL_OES;
        if (r2 != r3) goto L_0x00be;
        r2 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r23 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        goto L_0x00c2;
        r2 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        r23 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        r2 = r9.b;
        r22 = r12;
        r24 = r53;
        r26 = r11;
        r27 = r2;
        r28 = r60;
        r29 = r61;
        r30 = r62;
        r21.a(r22, r23, r24, r26, r27, r28, r29, r30);
        r2 = android.os.SystemClock.elapsedRealtime();
        r2 = r2 - r4;
        r13.a(r2);
        r2 = android.os.SystemClock.elapsedRealtime();
        r4 = r48.get();
        r4 = (defpackage.ebf) r4;
        r36 = r4.h();
        r4 = r15.e;	 Catch:{ InterruptedException -> 0x030d, adjw -> 0x0306 }
        r10 = r4.a();	 Catch:{ InterruptedException -> 0x030d, adjw -> 0x0306 }
        r4 = android.os.SystemClock.elapsedRealtime();
        r4 = r4 - r2;
        r13.b(r4);
        r10.a();
        r10.c = r13;
        r2 = r15.e;
        r2 = r2.g;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adjw -> 0x02fd }
        r4 = r10.a;	 Catch:{ adjw -> 0x02fd }
        r4.a();	 Catch:{ adjw -> 0x02fd }
        if (r36 == 0) goto L_0x0111;	 Catch:{ adjw -> 0x02fd }
        if (r35 == 0) goto L_0x0111;	 Catch:{ adjw -> 0x02fd }
        r4 = 1;	 Catch:{ adjw -> 0x02fd }
        goto L_0x0112;	 Catch:{ adjw -> 0x02fd }
        r4 = 0;	 Catch:{ adjw -> 0x02fd }
        if (r4 == 0) goto L_0x011b;	 Catch:{ adjw -> 0x02fd }
        r8 = r48;	 Catch:{ adjw -> 0x02fd }
        r4 = r15.a(r8);	 Catch:{ adjw -> 0x02fd }
        goto L_0x0128;	 Catch:{ adjw -> 0x02fd }
        r8 = r48;	 Catch:{ adjw -> 0x02fd }
        if (r34 == 0) goto L_0x0124;	 Catch:{ adjw -> 0x02fd }
        r4 = r15.a(r0, r11);	 Catch:{ adjw -> 0x02fd }
        goto L_0x0128;	 Catch:{ adjw -> 0x02fd }
        r4 = r15.a(r12, r11);	 Catch:{ adjw -> 0x02fd }
        r37 = r4;	 Catch:{ adjw -> 0x02fd }
        r4 = r10.a;	 Catch:{ adjw -> 0x02fd }
        r4.a(r14);	 Catch:{ adjw -> 0x02fd }
        r4 = r10.d;	 Catch:{ adjw -> 0x02fd }
        r4.a();	 Catch:{ adjw -> 0x02fd }
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ adjw -> 0x02fd }
        r4 = r4 - r2;	 Catch:{ adjw -> 0x02fd }
        r13.c(r4);	 Catch:{ adjw -> 0x02fd }
        r38 = r58.iterator();
        r1 = r38.hasNext();
        if (r1 == 0) goto L_0x02e8;
        r1 = r38.next();
        r7 = r1;
        r7 = (defpackage.dvl) r7;
        r1 = r7.a;	 Catch:{ dxx -> 0x02ba }
        r1 = r1.c;	 Catch:{ dxx -> 0x02ba }
        if (r1 == 0) goto L_0x0277;
        r1 = r7.a;	 Catch:{ dxx -> 0x026f }
        r1 = r1.e;	 Catch:{ dxx -> 0x026f }
        if (r1 != 0) goto L_0x015e;
        if (r62 == 0) goto L_0x015c;
        goto L_0x015e;
        r1 = 0;
        goto L_0x015f;
        r1 = 1;
        if (r37 == 0) goto L_0x0163;
        r2 = 1;
        goto L_0x0164;
        r2 = 0;
        if (r1 != 0) goto L_0x01a8;
        if (r2 == 0) goto L_0x01a8;
        r3 = 0;
        r4 = 1;
        r16 = 0;
        r1 = r46;
        r2 = r48;
        r5 = r50;
        r6 = r37;
        r47 = r7;
        r8 = r11;
        r39 = r9;
        r51 = r10;
        r9 = r53;
        r40 = r11;
        r11 = r39;
        r41 = r12;
        r12 = r13;
        r52 = r13;
        r13 = r59;
        r42 = 1;
        r14 = r62;
        r15 = r16;
        r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15);	 Catch:{ dxx -> 0x01a1 }
        r14 = 1;
        r15 = r46;
        r8 = r48;
        r10 = r51;
        r13 = r52;
        r9 = r39;
        r11 = r40;
        r12 = r41;
        goto L_0x0140;
        r0 = move-exception;
        r45 = r47;
        r44 = r51;
        goto L_0x02c1;
        r39 = r9;
        r51 = r10;
        r40 = r11;
        r41 = r12;
        r52 = r13;
        r42 = 1;
        r15 = r7;
        r1 = r15.a;	 Catch:{ dxx -> 0x0269 }
        r14 = r1.e;	 Catch:{ dxx -> 0x0269 }
        r13 = r15.e;	 Catch:{ dxx -> 0x0269 }
        if (r13 == 0) goto L_0x020b;	 Catch:{ dxx -> 0x0269 }
        r51.a();	 Catch:{ dxx -> 0x0269 }
        r11 = new dyp$1;	 Catch:{ dxx -> 0x0269 }
        r17 = 0;
        r1 = r11;
        r2 = r46;
        r3 = r15;
        r4 = r51;
        r5 = r48;
        r6 = r49;
        r7 = r50;
        r8 = r36;
        r9 = r35;
        r10 = r34;
        r0 = r11;
        r11 = r55;
        r21 = r0;
        r0 = r13;
        r13 = r39;
        r43 = r15;
        r15 = r59;
        r16 = r62;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17);	 Catch:{ dxx -> 0x0204 }
        r1 = r21;	 Catch:{ dxx -> 0x0204 }
        r0 = r0.post(r1);	 Catch:{ dxx -> 0x0204 }
        if (r0 != 0) goto L_0x01f2;	 Catch:{ dxx -> 0x0204 }
        r51.b();	 Catch:{ dxx -> 0x0204 }
        r15 = r46;
        r8 = r48;
        r0 = r49;
        r10 = r51;
        r13 = r52;
        r9 = r39;
        r11 = r40;
        r12 = r41;
        goto L_0x02b5;
        r0 = move-exception;
        r44 = r51;
        r45 = r43;
        goto L_0x02c1;
        r43 = r15;
        r0 = 3;
        r15 = r50;
        if (r15 != r0) goto L_0x022c;
        r14 = r43;
        r0 = r14.b;	 Catch:{ dxx -> 0x0228 }
        r0.b();	 Catch:{ dxx -> 0x0228 }
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ dxx -> 0x0228 }
        r1 = 0;	 Catch:{ dxx -> 0x0228 }
        android.opengl.GLES20.glClearColor(r1, r1, r1, r0);	 Catch:{ dxx -> 0x0228 }
        r0 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;	 Catch:{ dxx -> 0x0228 }
        android.opengl.GLES20.glClear(r0);	 Catch:{ dxx -> 0x0228 }
        r48.get();	 Catch:{ dxx -> 0x0228 }
        goto L_0x022e;
        r0 = move-exception;
        r44 = r51;
        goto L_0x0266;
        r14 = r43;
        r13 = r51;
        r0 = r13.a;	 Catch:{ dxx -> 0x0263 }
        r0 = r0.c;	 Catch:{ dxx -> 0x0263 }
        r1 = r13.c;	 Catch:{ dxx -> 0x0263 }
        r33 = 0;	 Catch:{ dxx -> 0x0263 }
        r21 = r50;	 Catch:{ dxx -> 0x0263 }
        r22 = r0;	 Catch:{ dxx -> 0x0263 }
        r23 = r36;	 Catch:{ dxx -> 0x0263 }
        r24 = r35;	 Catch:{ dxx -> 0x0263 }
        r25 = r34;	 Catch:{ dxx -> 0x0263 }
        r26 = r14;	 Catch:{ dxx -> 0x0263 }
        r27 = r55;	 Catch:{ dxx -> 0x0263 }
        r29 = r39;	 Catch:{ dxx -> 0x0263 }
        r30 = r1;	 Catch:{ dxx -> 0x0263 }
        r31 = r59;	 Catch:{ dxx -> 0x0263 }
        r32 = r62;	 Catch:{ dxx -> 0x0263 }
        defpackage.dyp.a(r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33);	 Catch:{ dxx -> 0x0263 }
        r15 = r46;
        r8 = r48;
        r0 = r49;
        r10 = r13;
        r9 = r39;
        r11 = r40;
        r12 = r41;
        r14 = 1;
        r13 = r52;
        goto L_0x0140;
        r0 = move-exception;
        r44 = r13;
        r45 = r14;
        goto L_0x02c1;
        r0 = move-exception;
        r44 = r51;
        r45 = r15;
        goto L_0x02c1;
        r0 = move-exception;
        r42 = 1;
        r45 = r7;
        r44 = r10;
        goto L_0x02c1;
        r15 = r50;
        r14 = r7;
        r39 = r9;
        r40 = r11;
        r41 = r12;
        r52 = r13;
        r42 = 1;
        r13 = r10;
        r4 = 0;
        r0 = 0;
        r1 = r46;
        r2 = r48;
        r3 = r34;
        r5 = r50;
        r6 = r41;
        r8 = r40;
        r9 = r53;
        r11 = r39;
        r12 = r52;
        r44 = r13;
        r13 = r59;
        r45 = r14;
        r14 = r62;
        r15 = r0;
        r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15);	 Catch:{ dxx -> 0x02b8 }
        r15 = r46;
        r8 = r48;
        r0 = r49;
        r13 = r52;
        r9 = r39;
        r11 = r40;
        r12 = r41;
        r10 = r44;
        r14 = 1;
        goto L_0x0140;
        r0 = move-exception;
        goto L_0x02c1;
        r0 = move-exception;
        r45 = r7;
        r44 = r10;
        r42 = 1;
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r2 = r44;
        r2 = r2.a;
        r2 = r2.c;
        r2 = android.opengl.GLES20.glIsTexture(r2);
        r2 = java.lang.Boolean.valueOf(r2);
        r1[r20] = r2;
        r2 = r45;
        r2 = r2.a;
        r2 = r2.a;
        r1[r42] = r2;
        r2 = "error in rendering, glIsTexture: %b, surfaceType %s";
        r1 = java.lang.String.format(r2, r1);
        r2 = new dxx;
        r2.<init>(r1, r0);
        throw r2;
        r2 = r10;
        r52 = r13;
        r48.get();
        r0 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r18;
        r3 = r52;
        r3.d(r0);
        r2.b();
        return;
        r0 = move-exception;
        r1 = new dxx;
        r2 = "Render to frame buffer failed, errorMessage: ";
        r1.<init>(r2, r0);
        throw r1;
        r0 = move-exception;
        r1 = new dxx;
        r1.<init>(r0);
        throw r1;
        r0 = move-exception;
        r1 = java.lang.Thread.currentThread();
        r1.interrupt();
        r1 = new dxx;
        r1.<init>(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyp.a(dxz, aipn, dzb, int, float[], int, long, long, adie, java.util.Collection, boolean, boolean, boolean, boolean, float):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0041 in {10, 14, 15, 19, 21, 27, 29} preds:[]
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
    public final void b() {
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.e;	 Catch:{ adjw -> 0x0037 }
        if (r1 == 0) goto L_0x0032;	 Catch:{ adjw -> 0x0037 }
        r1 = r5.e;	 Catch:{ adjw -> 0x0037 }
        r2 = r1.a;	 Catch:{ adjw -> 0x0037 }
        monitor-enter(r2);	 Catch:{ adjw -> 0x0037 }
        r3 = r1.b;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x0010;	 Catch:{ all -> 0x002f }
        monitor-exit(r2);	 Catch:{ all -> 0x002f }
        goto L_0x0032;	 Catch:{ all -> 0x002f }
        r3 = r1.c;	 Catch:{ all -> 0x002f }
        r3 = r3.iterator();	 Catch:{ all -> 0x002f }
        r4 = r3.hasNext();	 Catch:{ all -> 0x002f }
        if (r4 == 0) goto L_0x0026;	 Catch:{ all -> 0x002f }
        r4 = r3.next();	 Catch:{ all -> 0x002f }
        r4 = (defpackage.dvx.a) r4;	 Catch:{ all -> 0x002f }
        r4.c();	 Catch:{ all -> 0x002f }
        goto L_0x0016;	 Catch:{ all -> 0x002f }
        r3 = r1.c;	 Catch:{ all -> 0x002f }
        r3.clear();	 Catch:{ all -> 0x002f }
        r3 = 1;	 Catch:{ all -> 0x002f }
        r1.b = r3;	 Catch:{ all -> 0x002f }
        goto L_0x000e;	 Catch:{ all -> 0x002f }
        r1 = move-exception;	 Catch:{ all -> 0x002f }
        monitor-exit(r2);	 Catch:{ all -> 0x002f }
        throw r1;	 Catch:{ adjw -> 0x0037 }
        r5.e = r0;
        return;
        r1 = move-exception;
        goto L_0x003e;
        r1 = move-exception;
        r2 = new dxx;	 Catch:{ all -> 0x0035 }
        r2.<init>(r1);	 Catch:{ all -> 0x0035 }
        throw r2;	 Catch:{ all -> 0x0035 }
        r5.e = r0;
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyp.b():void");
    }
}
