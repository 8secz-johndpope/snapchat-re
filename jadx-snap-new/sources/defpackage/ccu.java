package defpackage;

/* renamed from: ccu */
public class ccu {
    private cct A = new cct();
    private ccw B = new ccw();
    private cct C = new cct();
    private cct D = new cct();
    private cct E = new cct();
    private cct F = new cct();
    private cct G = new cct();
    private cct H = new cct();
    private cct I = new cct();
    private cct J = new cct();
    private ccw K = new ccw();
    private ccw L = new ccw();
    private ccw M = new ccw();
    private ccw N = new ccw();
    private ccw O = new ccw();
    private ccw P = new ccw();
    private ccw Q = new ccw();
    private ccw R = new ccw();
    private cct S = new cct();
    private cct T = new cct();
    private cct U = new cct();
    private cct V = new cct();
    private cct W = new cct();
    private cct X = new cct();
    private cct Y = new cct();
    private cct Z = new cct();
    private double[] a = new double[16];
    private cct aa = new cct();
    private boolean ab;
    private boolean ac;
    private cct b = new cct();
    private cct c = new cct();
    private cct d = new cct();
    private cct e = new cct();
    private cct f = new cct();
    private cct g = new cct();
    private cct h = new cct();
    private cct i = new cct();
    private cct j = new cct();
    private ccw k = new ccw();
    private ccw l = new ccw();
    private ccw m = new ccw();
    private ccw n = new ccw();
    private ccw o = new ccw();
    private ccw p = new ccw();
    private ccw q = new ccw();
    private long r;
    private final ccw s = new ccw();
    private double t = 0.0d;
    private double u = 0.0d;
    private float v;
    private boolean w = false;
    private int x;
    private boolean y = true;
    private cct z = new cct();

    static {
        ccu.class.desiredAssertionStatus();
    }

    public ccu() {
        a();
    }

    private void a(cct cct, ccw ccw) {
        cct.a(cct, this.p, this.m);
        ccv.a(this.m, this.l, this.Z);
        ccv.a(this.Z, ccw);
    }

    private void b(cct cct, ccw ccw) {
        cct.a(cct, this.q, this.m);
        ccv.a(this.m, this.l, this.aa);
        ccv.a(this.aa, ccw);
    }

    private void e() {
        this.c.c(this.X);
        cct.b(this.d, this.X, this.Y);
        cct.b(this.c, this.Y, this.d);
        this.c.b();
    }

    public final synchronized void a() {
        this.r = 0;
        this.b.b();
        this.c.b();
        this.d.a();
        this.d.a(25.0d);
        this.e.a();
        this.e.a(1.0d);
        this.f.a();
        this.f.a(0.0625d);
        this.g.a();
        this.g.a(0.5625d);
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        this.l.a();
        this.m.a();
        this.n.a();
        this.o.a();
        this.p.a(0.0d, 0.0d, 9.81d);
        this.q.a(0.0d, 1.0d, 0.0d);
        this.ab = false;
        this.ac = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x011d in {7, 10, 14, 17} preds:[]
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
    public final synchronized void a(defpackage.ccw r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.l;	 Catch:{ all -> 0x011a }
        r0.a(r9);	 Catch:{ all -> 0x011a }
        r9 = r8.l;	 Catch:{ all -> 0x011a }
        r0 = r9.c();	 Catch:{ all -> 0x011a }
        r2 = r8.t;	 Catch:{ all -> 0x011a }
        r2 = r0 - r2;	 Catch:{ all -> 0x011a }
        r2 = java.lang.Math.abs(r2);	 Catch:{ all -> 0x011a }
        r8.t = r0;	 Catch:{ all -> 0x011a }
        r0 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;	 Catch:{ all -> 0x011a }
        r2 = r2 * r0;	 Catch:{ all -> 0x011a }
        r4 = r8.u;	 Catch:{ all -> 0x011a }
        r4 = r4 * r0;	 Catch:{ all -> 0x011a }
        r2 = r2 + r4;	 Catch:{ all -> 0x011a }
        r8.u = r2;	 Catch:{ all -> 0x011a }
        r0 = r8.u;	 Catch:{ all -> 0x011a }
        r2 = 4594572339843380019; // 0x3fc3333333333333 float:4.172325E-8 double:0.15;	 Catch:{ all -> 0x011a }
        r0 = r0 / r2;	 Catch:{ all -> 0x011a }
        r2 = 4619567317775286272; // 0x401c000000000000 float:0.0 double:7.0;	 Catch:{ all -> 0x011a }
        r4 = 4604930618986332160; // 0x3fe8000000000000 float:0.0 double:0.75;	 Catch:{ all -> 0x011a }
        r6 = 4618722892845154304; // 0x4019000000000000 float:0.0 double:6.25;	 Catch:{ all -> 0x011a }
        r0 = r0 * r6;	 Catch:{ all -> 0x011a }
        r0 = r0 + r4;	 Catch:{ all -> 0x011a }
        r0 = java.lang.Math.min(r2, r0);	 Catch:{ all -> 0x011a }
        r9 = r8.g;	 Catch:{ all -> 0x011a }
        r0 = r0 * r0;	 Catch:{ all -> 0x011a }
        r9.a(r0);	 Catch:{ all -> 0x011a }
        r9 = r8.ab;	 Catch:{ all -> 0x011a }
        if (r9 == 0) goto L_0x010c;	 Catch:{ all -> 0x011a }
        r9 = r8.b;	 Catch:{ all -> 0x011a }
        r0 = r8.k;	 Catch:{ all -> 0x011a }
        r8.a(r9, r0);	 Catch:{ all -> 0x011a }
        r9 = 0;	 Catch:{ all -> 0x011a }
        r0 = 3;	 Catch:{ all -> 0x011a }
        if (r9 >= r0) goto L_0x0087;	 Catch:{ all -> 0x011a }
        r0 = r8.M;	 Catch:{ all -> 0x011a }
        r0.a();	 Catch:{ all -> 0x011a }
        r1 = 4502148214488346440; // 0x3e7ad7f29abcaf48 float:-7.803816E-23 double:1.0E-7;	 Catch:{ all -> 0x011a }
        r0.a(r9, r1);	 Catch:{ all -> 0x011a }
        r1 = r8.F;	 Catch:{ all -> 0x011a }
        defpackage.ccv.a(r0, r1);	 Catch:{ all -> 0x011a }
        r0 = r8.F;	 Catch:{ all -> 0x011a }
        r1 = r8.b;	 Catch:{ all -> 0x011a }
        r2 = r8.G;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r0, r1, r2);	 Catch:{ all -> 0x011a }
        r0 = r8.G;	 Catch:{ all -> 0x011a }
        r1 = r8.K;	 Catch:{ all -> 0x011a }
        r8.a(r0, r1);	 Catch:{ all -> 0x011a }
        r0 = r8.K;	 Catch:{ all -> 0x011a }
        r1 = r8.k;	 Catch:{ all -> 0x011a }
        r2 = r8.L;	 Catch:{ all -> 0x011a }
        defpackage.ccw.a(r1, r0, r2);	 Catch:{ all -> 0x011a }
        r0 = r8.L;	 Catch:{ all -> 0x011a }
        r1 = 4711630319722168320; // 0x416312d000000000 float:0.0 double:1.0E7;	 Catch:{ all -> 0x011a }
        r0.a(r1);	 Catch:{ all -> 0x011a }
        r0 = r8.i;	 Catch:{ all -> 0x011a }
        r1 = r8.L;	 Catch:{ all -> 0x011a }
        r0.a(r9, r1);	 Catch:{ all -> 0x011a }
        r9 = r9 + 1;	 Catch:{ all -> 0x011a }
        goto L_0x0045;	 Catch:{ all -> 0x011a }
        r9 = r8.i;	 Catch:{ all -> 0x011a }
        r0 = r8.H;	 Catch:{ all -> 0x011a }
        r9.c(r0);	 Catch:{ all -> 0x011a }
        r9 = r8.d;	 Catch:{ all -> 0x011a }
        r0 = r8.H;	 Catch:{ all -> 0x011a }
        r1 = r8.I;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.i;	 Catch:{ all -> 0x011a }
        r0 = r8.I;	 Catch:{ all -> 0x011a }
        r1 = r8.J;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.J;	 Catch:{ all -> 0x011a }
        r0 = r8.g;	 Catch:{ all -> 0x011a }
        r1 = r8.h;	 Catch:{ all -> 0x011a }
        defpackage.cct.a(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.h;	 Catch:{ all -> 0x011a }
        r0 = r8.H;	 Catch:{ all -> 0x011a }
        r9.d(r0);	 Catch:{ all -> 0x011a }
        r9 = r8.i;	 Catch:{ all -> 0x011a }
        r0 = r8.I;	 Catch:{ all -> 0x011a }
        r9.c(r0);	 Catch:{ all -> 0x011a }
        r9 = r8.I;	 Catch:{ all -> 0x011a }
        r0 = r8.H;	 Catch:{ all -> 0x011a }
        r1 = r8.J;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.d;	 Catch:{ all -> 0x011a }
        r0 = r8.J;	 Catch:{ all -> 0x011a }
        r1 = r8.j;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.j;	 Catch:{ all -> 0x011a }
        r0 = r8.k;	 Catch:{ all -> 0x011a }
        r1 = r8.o;	 Catch:{ all -> 0x011a }
        defpackage.cct.a(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.j;	 Catch:{ all -> 0x011a }
        r0 = r8.i;	 Catch:{ all -> 0x011a }
        r1 = r8.H;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.I;	 Catch:{ all -> 0x011a }
        r9.b();	 Catch:{ all -> 0x011a }
        r9 = r8.I;	 Catch:{ all -> 0x011a }
        r0 = r8.H;	 Catch:{ all -> 0x011a }
        r9.b(r0);	 Catch:{ all -> 0x011a }
        r9 = r8.I;	 Catch:{ all -> 0x011a }
        r0 = r8.d;	 Catch:{ all -> 0x011a }
        r1 = r8.H;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = r8.d;	 Catch:{ all -> 0x011a }
        r0 = r8.H;	 Catch:{ all -> 0x011a }
        r9.a(r0);	 Catch:{ all -> 0x011a }
        r9 = r8.o;	 Catch:{ all -> 0x011a }
        r0 = r8.c;	 Catch:{ all -> 0x011a }
        defpackage.ccv.a(r9, r0);	 Catch:{ all -> 0x011a }
        r9 = r8.c;	 Catch:{ all -> 0x011a }
        r0 = r8.b;	 Catch:{ all -> 0x011a }
        r1 = r8.b;	 Catch:{ all -> 0x011a }
        defpackage.cct.b(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r8.e();	 Catch:{ all -> 0x011a }
        monitor-exit(r8);
        return;
        r9 = r8.p;	 Catch:{ all -> 0x011a }
        r0 = r8.l;	 Catch:{ all -> 0x011a }
        r1 = r8.b;	 Catch:{ all -> 0x011a }
        defpackage.ccv.a(r9, r0, r1);	 Catch:{ all -> 0x011a }
        r9 = 1;	 Catch:{ all -> 0x011a }
        r8.ab = r9;	 Catch:{ all -> 0x011a }
        monitor-exit(r8);
        return;
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccu.a(ccw):void");
    }

    public final synchronized void a(ccw ccw, long j) {
        ccw ccw2 = ccw;
        long j2 = j;
        synchronized (this) {
            if (this.r != 0) {
                float f = ((float) (j2 - this.r)) * 1.0E-9f;
                if (f > 0.04f) {
                    f = this.y ? this.v : 0.01f;
                } else if (this.w) {
                    this.v = (this.v * 0.95f) + (0.050000012f * f);
                    int i = this.x + 1;
                    this.x = i;
                    if (((float) i) > 10.0f) {
                        this.y = true;
                    }
                } else {
                    this.v = f;
                    this.x = 1;
                    this.w = true;
                }
                this.n.a(ccw2);
                this.n.a((double) (-f));
                ccv.a(this.n, this.c);
                this.D.a(this.b);
                cct.b(this.c, this.b, this.D);
                this.b.a(this.D);
                e();
                this.E.a(this.e);
                cct cct = this.E;
                double d = (double) (f * f);
                double[] dArr = cct.a;
                double d2 = dArr[0];
                Double.isNaN(d);
                dArr[0] = d2 * d;
                dArr = cct.a;
                d2 = dArr[1];
                Double.isNaN(d);
                dArr[1] = d2 * d;
                dArr = cct.a;
                double d3 = dArr[2];
                Double.isNaN(d);
                dArr[2] = d3 * d;
                dArr = cct.a;
                double d4 = dArr[3];
                Double.isNaN(d);
                dArr[3] = d4 * d;
                dArr = cct.a;
                double d5 = dArr[4];
                Double.isNaN(d);
                dArr[4] = d5 * d;
                dArr = cct.a;
                double d6 = dArr[5];
                Double.isNaN(d);
                dArr[5] = d6 * d;
                dArr = cct.a;
                double d7 = dArr[6];
                Double.isNaN(d);
                dArr[6] = d7 * d;
                dArr = cct.a;
                double d8 = dArr[7];
                Double.isNaN(d);
                dArr[7] = d8 * d;
                dArr = cct.a;
                d8 = dArr[8];
                Double.isNaN(d);
                dArr[8] = d8 * d;
                cct cct2 = this.d;
                cct cct3 = this.E;
                double[] dArr2 = cct2.a;
                dArr2[0] = dArr2[0] + cct3.a[0];
                double[] dArr3 = cct2.a;
                dArr3[1] = dArr3[1] + cct3.a[1];
                dArr3 = cct2.a;
                dArr3[2] = dArr3[2] + cct3.a[2];
                dArr3 = cct2.a;
                dArr3[3] = dArr3[3] + cct3.a[3];
                dArr3 = cct2.a;
                dArr3[4] = dArr3[4] + cct3.a[4];
                dArr3 = cct2.a;
                dArr3[5] = dArr3[5] + cct3.a[5];
                dArr3 = cct2.a;
                dArr3[6] = dArr3[6] + cct3.a[6];
                dArr3 = cct2.a;
                dArr3[7] = dArr3[7] + cct3.a[7];
                dArr = cct2.a;
                dArr[8] = dArr[8] + cct3.a[8];
            }
            this.r = j2;
            this.s.a(ccw2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0155 in {5, 12, 15, 19, 22} preds:[]
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
    public final synchronized void a(float[] r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.ab;	 Catch:{ all -> 0x0152 }
        if (r0 != 0) goto L_0x0007;
        monitor-exit(r10);
        return;
        r1 = r10.l;	 Catch:{ all -> 0x0152 }
        r0 = 0;	 Catch:{ all -> 0x0152 }
        r2 = r11[r0];	 Catch:{ all -> 0x0152 }
        r2 = (double) r2;	 Catch:{ all -> 0x0152 }
        r8 = 1;	 Catch:{ all -> 0x0152 }
        r4 = r11[r8];	 Catch:{ all -> 0x0152 }
        r4 = (double) r4;	 Catch:{ all -> 0x0152 }
        r9 = 2;	 Catch:{ all -> 0x0152 }
        r11 = r11[r9];	 Catch:{ all -> 0x0152 }
        r6 = (double) r11;	 Catch:{ all -> 0x0152 }
        r1.a(r2, r4, r6);	 Catch:{ all -> 0x0152 }
        r11 = r10.l;	 Catch:{ all -> 0x0152 }
        r11.b();	 Catch:{ all -> 0x0152 }
        r11 = new ccw;	 Catch:{ all -> 0x0152 }
        r11.<init>();	 Catch:{ all -> 0x0152 }
        r1 = r10.b;	 Catch:{ all -> 0x0152 }
        r2 = r1.a;	 Catch:{ all -> 0x0152 }
        r3 = r2[r9];	 Catch:{ all -> 0x0152 }
        r11.a = r3;	 Catch:{ all -> 0x0152 }
        r2 = r1.a;	 Catch:{ all -> 0x0152 }
        r3 = 5;	 Catch:{ all -> 0x0152 }
        r3 = r2[r3];	 Catch:{ all -> 0x0152 }
        r11.b = r3;	 Catch:{ all -> 0x0152 }
        r1 = r1.a;	 Catch:{ all -> 0x0152 }
        r2 = 8;	 Catch:{ all -> 0x0152 }
        r2 = r1[r2];	 Catch:{ all -> 0x0152 }
        r11.c = r2;	 Catch:{ all -> 0x0152 }
        r1 = r10.l;	 Catch:{ all -> 0x0152 }
        r2 = r10.N;	 Catch:{ all -> 0x0152 }
        defpackage.ccw.b(r1, r11, r2);	 Catch:{ all -> 0x0152 }
        r1 = r10.N;	 Catch:{ all -> 0x0152 }
        r1.b();	 Catch:{ all -> 0x0152 }
        r2 = r10.O;	 Catch:{ all -> 0x0152 }
        defpackage.ccw.b(r11, r1, r2);	 Catch:{ all -> 0x0152 }
        r11 = r10.O;	 Catch:{ all -> 0x0152 }
        r11.b();	 Catch:{ all -> 0x0152 }
        r1 = r10.l;	 Catch:{ all -> 0x0152 }
        r1.a(r11);	 Catch:{ all -> 0x0152 }
        r11 = r10.ac;	 Catch:{ all -> 0x0152 }
        if (r11 == 0) goto L_0x012d;	 Catch:{ all -> 0x0152 }
        r11 = r10.b;	 Catch:{ all -> 0x0152 }
        r1 = r10.k;	 Catch:{ all -> 0x0152 }
        r10.b(r11, r1);	 Catch:{ all -> 0x0152 }
        r11 = 3;	 Catch:{ all -> 0x0152 }
        if (r0 >= r11) goto L_0x00a1;	 Catch:{ all -> 0x0152 }
        r11 = r10.P;	 Catch:{ all -> 0x0152 }
        r11.a();	 Catch:{ all -> 0x0152 }
        r1 = 4502148214488346440; // 0x3e7ad7f29abcaf48 float:-7.803816E-23 double:1.0E-7;	 Catch:{ all -> 0x0152 }
        r11.a(r0, r1);	 Catch:{ all -> 0x0152 }
        r1 = r10.S;	 Catch:{ all -> 0x0152 }
        defpackage.ccv.a(r11, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.S;	 Catch:{ all -> 0x0152 }
        r1 = r10.b;	 Catch:{ all -> 0x0152 }
        r2 = r10.T;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r1, r2);	 Catch:{ all -> 0x0152 }
        r11 = r10.T;	 Catch:{ all -> 0x0152 }
        r1 = r10.Q;	 Catch:{ all -> 0x0152 }
        r10.b(r11, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.Q;	 Catch:{ all -> 0x0152 }
        r1 = r10.k;	 Catch:{ all -> 0x0152 }
        r2 = r10.R;	 Catch:{ all -> 0x0152 }
        defpackage.ccw.a(r1, r11, r2);	 Catch:{ all -> 0x0152 }
        r11 = r10.R;	 Catch:{ all -> 0x0152 }
        r1 = 4711630319722168320; // 0x416312d000000000 float:0.0 double:1.0E7;	 Catch:{ all -> 0x0152 }
        r11.a(r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.i;	 Catch:{ all -> 0x0152 }
        r1 = r10.R;	 Catch:{ all -> 0x0152 }
        r11.a(r0, r1);	 Catch:{ all -> 0x0152 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0152 }
        goto L_0x005f;	 Catch:{ all -> 0x0152 }
        r11 = r10.i;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r11.c(r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.d;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r1 = r10.V;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.i;	 Catch:{ all -> 0x0152 }
        r0 = r10.V;	 Catch:{ all -> 0x0152 }
        r1 = r10.W;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.W;	 Catch:{ all -> 0x0152 }
        r0 = r10.f;	 Catch:{ all -> 0x0152 }
        r1 = r10.h;	 Catch:{ all -> 0x0152 }
        defpackage.cct.a(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.h;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r11.d(r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.i;	 Catch:{ all -> 0x0152 }
        r0 = r10.V;	 Catch:{ all -> 0x0152 }
        r11.c(r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.V;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r1 = r10.W;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.d;	 Catch:{ all -> 0x0152 }
        r0 = r10.W;	 Catch:{ all -> 0x0152 }
        r1 = r10.j;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.j;	 Catch:{ all -> 0x0152 }
        r0 = r10.k;	 Catch:{ all -> 0x0152 }
        r1 = r10.o;	 Catch:{ all -> 0x0152 }
        defpackage.cct.a(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.j;	 Catch:{ all -> 0x0152 }
        r0 = r10.i;	 Catch:{ all -> 0x0152 }
        r1 = r10.U;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.V;	 Catch:{ all -> 0x0152 }
        r11.b();	 Catch:{ all -> 0x0152 }
        r11 = r10.V;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r11.b(r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.V;	 Catch:{ all -> 0x0152 }
        r0 = r10.d;	 Catch:{ all -> 0x0152 }
        r1 = r10.U;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.d;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r11.a(r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.o;	 Catch:{ all -> 0x0152 }
        r0 = r10.c;	 Catch:{ all -> 0x0152 }
        defpackage.ccv.a(r11, r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.c;	 Catch:{ all -> 0x0152 }
        r0 = r10.b;	 Catch:{ all -> 0x0152 }
        r1 = r10.U;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.b;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r11.a(r0);	 Catch:{ all -> 0x0152 }
        r10.e();	 Catch:{ all -> 0x0152 }
        monitor-exit(r10);
        return;
        r11 = r10.b;	 Catch:{ all -> 0x0152 }
        r0 = r10.k;	 Catch:{ all -> 0x0152 }
        r10.b(r11, r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.k;	 Catch:{ all -> 0x0152 }
        r0 = r10.c;	 Catch:{ all -> 0x0152 }
        defpackage.ccv.a(r11, r0);	 Catch:{ all -> 0x0152 }
        r11 = r10.c;	 Catch:{ all -> 0x0152 }
        r0 = r10.b;	 Catch:{ all -> 0x0152 }
        r1 = r10.U;	 Catch:{ all -> 0x0152 }
        defpackage.cct.b(r11, r0, r1);	 Catch:{ all -> 0x0152 }
        r11 = r10.b;	 Catch:{ all -> 0x0152 }
        r0 = r10.U;	 Catch:{ all -> 0x0152 }
        r11.a(r0);	 Catch:{ all -> 0x0152 }
        r10.e();	 Catch:{ all -> 0x0152 }
        r10.ac = r8;	 Catch:{ all -> 0x0152 }
        monitor-exit(r10);
        return;
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccu.a(float[]):void");
    }

    public final synchronized boolean b() {
        return this.ab;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x004e in {7, 8, 11, 14} preds:[]
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
    public final synchronized double[] c() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.b;	 Catch:{ all -> 0x004b }
        r1 = 0;	 Catch:{ all -> 0x004b }
        r2 = 0;	 Catch:{ all -> 0x004b }
        r3 = 3;	 Catch:{ all -> 0x004b }
        if (r2 >= r3) goto L_0x001c;	 Catch:{ all -> 0x004b }
        r4 = 0;	 Catch:{ all -> 0x004b }
        if (r4 >= r3) goto L_0x0019;	 Catch:{ all -> 0x004b }
        r5 = r9.a;	 Catch:{ all -> 0x004b }
        r6 = r4 * 4;	 Catch:{ all -> 0x004b }
        r6 = r6 + r2;	 Catch:{ all -> 0x004b }
        r7 = r0.a(r2, r4);	 Catch:{ all -> 0x004b }
        r5[r6] = r7;	 Catch:{ all -> 0x004b }
        r4 = r4 + 1;	 Catch:{ all -> 0x004b }
        goto L_0x0009;	 Catch:{ all -> 0x004b }
        r2 = r2 + 1;	 Catch:{ all -> 0x004b }
        goto L_0x0005;	 Catch:{ all -> 0x004b }
        r0 = r9.a;	 Catch:{ all -> 0x004b }
        r1 = r9.a;	 Catch:{ all -> 0x004b }
        r2 = 7;	 Catch:{ all -> 0x004b }
        r4 = r9.a;	 Catch:{ all -> 0x004b }
        r5 = 11;	 Catch:{ all -> 0x004b }
        r6 = 0;	 Catch:{ all -> 0x004b }
        r4[r5] = r6;	 Catch:{ all -> 0x004b }
        r1[r2] = r6;	 Catch:{ all -> 0x004b }
        r0[r3] = r6;	 Catch:{ all -> 0x004b }
        r0 = r9.a;	 Catch:{ all -> 0x004b }
        r1 = 12;	 Catch:{ all -> 0x004b }
        r2 = r9.a;	 Catch:{ all -> 0x004b }
        r3 = 13;	 Catch:{ all -> 0x004b }
        r4 = r9.a;	 Catch:{ all -> 0x004b }
        r5 = 14;	 Catch:{ all -> 0x004b }
        r4[r5] = r6;	 Catch:{ all -> 0x004b }
        r2[r3] = r6;	 Catch:{ all -> 0x004b }
        r0[r1] = r6;	 Catch:{ all -> 0x004b }
        r0 = r9.a;	 Catch:{ all -> 0x004b }
        r1 = 15;	 Catch:{ all -> 0x004b }
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;	 Catch:{ all -> 0x004b }
        r0[r1] = r2;	 Catch:{ all -> 0x004b }
        r0 = r9.a;	 Catch:{ all -> 0x004b }
        monitor-exit(r9);
        return r0;
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccu.c():double[]");
    }

    public final synchronized cct d() {
        return this.b;
    }
}
