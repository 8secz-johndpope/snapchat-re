package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.bnu.a;

/* renamed from: bsl */
public final class bsl {
    public int[] a;
    public int b;
    public int c;
    public int d;
    private int e = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
    private long[] f;
    private int[] g;
    private int[] h;
    private long[] i;
    private a[] j;
    private blg[] k;
    private int l;
    private int m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;
    private blg r;

    /* renamed from: bsl$a */
    public static final class a {
        public int a;
        public long b;
        public defpackage.bnu.a c;
    }

    public bsl() {
        int i = this.e;
        this.a = new int[i];
        this.f = new long[i];
        this.i = new long[i];
        this.h = new int[i];
        this.g = new int[i];
        this.j = new a[i];
        this.k = new blg[i];
        this.n = Long.MIN_VALUE;
        this.o = Long.MIN_VALUE;
        this.q = true;
        this.p = true;
    }

    private int a(int i, int i2, long j, boolean z) {
        int i3 = i;
        int i4 = -1;
        for (i = 0; i < i2 && this.i[i3] <= j; i++) {
            if (!(z && (this.h[i3] & 1) == 0)) {
                i4 = i;
            }
            i3++;
            if (i3 == this.e) {
                i3 = 0;
            }
        }
        return i4;
    }

    private synchronized void b(long j) {
        this.o = Math.max(this.o, j);
    }

    private long d(int i) {
        this.n = Math.max(this.n, e(i));
        this.l -= i;
        this.b += i;
        this.m += i;
        int i2 = this.m;
        int i3 = this.e;
        if (i2 >= i3) {
            this.m = i2 - i3;
        }
        this.c -= i;
        if (this.c < 0) {
            this.c = 0;
        }
        if (this.l != 0) {
            return this.f[this.m];
        }
        i = this.m;
        if (i == 0) {
            i = this.e;
        }
        i--;
        return this.f[i] + ((long) this.g[i]);
    }

    private long e(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int c = c(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.i[c]);
            if ((this.h[c] & 1) != 0) {
                break;
            }
            c--;
            if (c == -1) {
                c = this.e - 1;
            }
        }
        return j;
    }

    public final int a() {
        return this.b + this.l;
    }

    /* JADX WARNING: Missing block: B:19:0x0038, code skipped:
            return -1;
     */
    public final synchronized int a(long r9, boolean r11) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.c;	 Catch:{ all -> 0x0039 }
        r2 = r8.c(r0);	 Catch:{ all -> 0x0039 }
        r0 = r8.c();	 Catch:{ all -> 0x0039 }
        r7 = -1;
        if (r0 == 0) goto L_0x0037;
    L_0x000e:
        r0 = r8.i;	 Catch:{ all -> 0x0039 }
        r3 = r0[r2];	 Catch:{ all -> 0x0039 }
        r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r0 < 0) goto L_0x0037;
    L_0x0016:
        r0 = r8.o;	 Catch:{ all -> 0x0039 }
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x001f;
    L_0x001c:
        if (r11 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0037;
    L_0x001f:
        r11 = r8.l;	 Catch:{ all -> 0x0039 }
        r0 = r8.c;	 Catch:{ all -> 0x0039 }
        r3 = r11 - r0;
        r6 = 1;
        r1 = r8;
        r4 = r9;
        r9 = r1.a(r2, r3, r4, r6);	 Catch:{ all -> 0x0039 }
        if (r9 != r7) goto L_0x0030;
    L_0x002e:
        monitor-exit(r8);
        return r7;
    L_0x0030:
        r10 = r8.c;	 Catch:{ all -> 0x0039 }
        r10 = r10 + r9;
        r8.c = r10;	 Catch:{ all -> 0x0039 }
        monitor-exit(r8);
        return r9;
    L_0x0037:
        monitor-exit(r8);
        return r7;
    L_0x0039:
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.a(long, boolean):int");
    }

    /* JADX WARNING: Missing block: B:18:0x0022, code skipped:
            return -3;
     */
    public final synchronized int a(defpackage.blh r5, defpackage.bmy r6, boolean r7, boolean r8, defpackage.blg r9, defpackage.bsl.a r10) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c();	 Catch:{ all -> 0x006f }
        r1 = -5;
        r2 = -3;
        r3 = -4;
        if (r0 != 0) goto L_0x0023;
    L_0x000a:
        if (r8 == 0) goto L_0x0011;
    L_0x000c:
        r5 = 4;
        r6.a = r5;	 Catch:{ all -> 0x006f }
        monitor-exit(r4);
        return r3;
    L_0x0011:
        r6 = r4.r;	 Catch:{ all -> 0x006f }
        if (r6 == 0) goto L_0x0021;
    L_0x0015:
        if (r7 != 0) goto L_0x001b;
    L_0x0017:
        r6 = r4.r;	 Catch:{ all -> 0x006f }
        if (r6 == r9) goto L_0x0021;
    L_0x001b:
        r6 = r4.r;	 Catch:{ all -> 0x006f }
        r5.a = r6;	 Catch:{ all -> 0x006f }
        monitor-exit(r4);
        return r1;
    L_0x0021:
        monitor-exit(r4);
        return r2;
    L_0x0023:
        r8 = r4.c;	 Catch:{ all -> 0x006f }
        r8 = r4.c(r8);	 Catch:{ all -> 0x006f }
        if (r7 != 0) goto L_0x0067;
    L_0x002b:
        r7 = r4.k;	 Catch:{ all -> 0x006f }
        r7 = r7[r8];	 Catch:{ all -> 0x006f }
        if (r7 == r9) goto L_0x0032;
    L_0x0031:
        goto L_0x0067;
    L_0x0032:
        r5 = r6.c;	 Catch:{ all -> 0x006f }
        r7 = 1;
        if (r5 != 0) goto L_0x003d;
    L_0x0037:
        r5 = r6.e;	 Catch:{ all -> 0x006f }
        if (r5 != 0) goto L_0x003d;
    L_0x003b:
        r5 = 1;
        goto L_0x003e;
    L_0x003d:
        r5 = 0;
    L_0x003e:
        if (r5 == 0) goto L_0x0042;
    L_0x0040:
        monitor-exit(r4);
        return r2;
    L_0x0042:
        r5 = r4.i;	 Catch:{ all -> 0x006f }
        r0 = r5[r8];	 Catch:{ all -> 0x006f }
        r6.d = r0;	 Catch:{ all -> 0x006f }
        r5 = r4.h;	 Catch:{ all -> 0x006f }
        r5 = r5[r8];	 Catch:{ all -> 0x006f }
        r6.a = r5;	 Catch:{ all -> 0x006f }
        r5 = r4.g;	 Catch:{ all -> 0x006f }
        r5 = r5[r8];	 Catch:{ all -> 0x006f }
        r10.a = r5;	 Catch:{ all -> 0x006f }
        r5 = r4.f;	 Catch:{ all -> 0x006f }
        r0 = r5[r8];	 Catch:{ all -> 0x006f }
        r10.b = r0;	 Catch:{ all -> 0x006f }
        r5 = r4.j;	 Catch:{ all -> 0x006f }
        r5 = r5[r8];	 Catch:{ all -> 0x006f }
        r10.c = r5;	 Catch:{ all -> 0x006f }
        r5 = r4.c;	 Catch:{ all -> 0x006f }
        r5 = r5 + r7;
        r4.c = r5;	 Catch:{ all -> 0x006f }
        monitor-exit(r4);
        return r3;
    L_0x0067:
        r6 = r4.k;	 Catch:{ all -> 0x006f }
        r6 = r6[r8];	 Catch:{ all -> 0x006f }
        r5.a = r6;	 Catch:{ all -> 0x006f }
        monitor-exit(r4);
        return r1;
    L_0x006f:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.a(blh, bmy, boolean, boolean, blg, bsl$a):int");
    }

    public final long a(int i) {
        int a = a() - i;
        boolean z = a >= 0 && a <= this.l - this.c;
        byo.a(z);
        this.l -= a;
        this.o = Math.max(this.n, e(this.l));
        a = this.l;
        if (a == 0) {
            return 0;
        }
        i = c(a - 1);
        return this.f[i] + ((long) this.g[i]);
    }

    /* JADX WARNING: Missing block: B:22:0x0037, code skipped:
            return -1;
     */
    public final synchronized long a(long r10, boolean r12, boolean r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.l;	 Catch:{ all -> 0x0038 }
        r1 = -1;
        if (r0 == 0) goto L_0x0036;
    L_0x0007:
        r0 = r9.i;	 Catch:{ all -> 0x0038 }
        r3 = r9.m;	 Catch:{ all -> 0x0038 }
        r3 = r0[r3];	 Catch:{ all -> 0x0038 }
        r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0036;
    L_0x0012:
        if (r13 == 0) goto L_0x001f;
    L_0x0014:
        r13 = r9.c;	 Catch:{ all -> 0x0038 }
        r0 = r9.l;	 Catch:{ all -> 0x0038 }
        if (r13 == r0) goto L_0x001f;
    L_0x001a:
        r13 = r9.c;	 Catch:{ all -> 0x0038 }
        r13 = r13 + 1;
        goto L_0x0021;
    L_0x001f:
        r13 = r9.l;	 Catch:{ all -> 0x0038 }
    L_0x0021:
        r5 = r13;
        r4 = r9.m;	 Catch:{ all -> 0x0038 }
        r3 = r9;
        r6 = r10;
        r8 = r12;
        r10 = r3.a(r4, r5, r6, r8);	 Catch:{ all -> 0x0038 }
        r11 = -1;
        if (r10 != r11) goto L_0x0030;
    L_0x002e:
        monitor-exit(r9);
        return r1;
    L_0x0030:
        r10 = r9.d(r10);	 Catch:{ all -> 0x0038 }
        monitor-exit(r9);
        return r10;
    L_0x0036:
        monitor-exit(r9);
        return r1;
    L_0x0038:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.a(long, boolean, boolean):long");
    }

    /* JADX WARNING: Missing block: B:19:0x00d1, code skipped:
            return;
     */
    public final synchronized void a(long r6, int r8, long r9, int r11, defpackage.bnu.a r12) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.p;	 Catch:{ all -> 0x00d2 }
        r1 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = r8 & 1;
        if (r0 != 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r5);
        return;
    L_0x000c:
        r5.p = r1;	 Catch:{ all -> 0x00d2 }
    L_0x000e:
        r0 = r5.q;	 Catch:{ all -> 0x00d2 }
        r2 = 1;
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        r0 = 1;
        goto L_0x0016;
    L_0x0015:
        r0 = 0;
    L_0x0016:
        defpackage.byo.b(r0);	 Catch:{ all -> 0x00d2 }
        r5.b(r6);	 Catch:{ all -> 0x00d2 }
        r0 = r5.l;	 Catch:{ all -> 0x00d2 }
        r0 = r5.c(r0);	 Catch:{ all -> 0x00d2 }
        r3 = r5.i;	 Catch:{ all -> 0x00d2 }
        r3[r0] = r6;	 Catch:{ all -> 0x00d2 }
        r6 = r5.f;	 Catch:{ all -> 0x00d2 }
        r6[r0] = r9;	 Catch:{ all -> 0x00d2 }
        r6 = r5.g;	 Catch:{ all -> 0x00d2 }
        r6[r0] = r11;	 Catch:{ all -> 0x00d2 }
        r6 = r5.h;	 Catch:{ all -> 0x00d2 }
        r6[r0] = r8;	 Catch:{ all -> 0x00d2 }
        r6 = r5.j;	 Catch:{ all -> 0x00d2 }
        r6[r0] = r12;	 Catch:{ all -> 0x00d2 }
        r6 = r5.k;	 Catch:{ all -> 0x00d2 }
        r7 = r5.r;	 Catch:{ all -> 0x00d2 }
        r6[r0] = r7;	 Catch:{ all -> 0x00d2 }
        r6 = r5.a;	 Catch:{ all -> 0x00d2 }
        r7 = r5.d;	 Catch:{ all -> 0x00d2 }
        r6[r0] = r7;	 Catch:{ all -> 0x00d2 }
        r6 = r5.l;	 Catch:{ all -> 0x00d2 }
        r6 = r6 + r2;
        r5.l = r6;	 Catch:{ all -> 0x00d2 }
        r6 = r5.l;	 Catch:{ all -> 0x00d2 }
        r7 = r5.e;	 Catch:{ all -> 0x00d2 }
        if (r6 != r7) goto L_0x00d0;
    L_0x004d:
        r6 = r5.e;	 Catch:{ all -> 0x00d2 }
        r6 = r6 + 1000;
        r7 = new int[r6];	 Catch:{ all -> 0x00d2 }
        r8 = new long[r6];	 Catch:{ all -> 0x00d2 }
        r9 = new long[r6];	 Catch:{ all -> 0x00d2 }
        r10 = new int[r6];	 Catch:{ all -> 0x00d2 }
        r11 = new int[r6];	 Catch:{ all -> 0x00d2 }
        r12 = new defpackage.bnu.a[r6];	 Catch:{ all -> 0x00d2 }
        r0 = new defpackage.blg[r6];	 Catch:{ all -> 0x00d2 }
        r2 = r5.e;	 Catch:{ all -> 0x00d2 }
        r3 = r5.m;	 Catch:{ all -> 0x00d2 }
        r2 = r2 - r3;
        r3 = r5.f;	 Catch:{ all -> 0x00d2 }
        r4 = r5.m;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r3, r4, r8, r1, r2);	 Catch:{ all -> 0x00d2 }
        r3 = r5.i;	 Catch:{ all -> 0x00d2 }
        r4 = r5.m;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r3, r4, r9, r1, r2);	 Catch:{ all -> 0x00d2 }
        r3 = r5.h;	 Catch:{ all -> 0x00d2 }
        r4 = r5.m;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r3, r4, r10, r1, r2);	 Catch:{ all -> 0x00d2 }
        r3 = r5.g;	 Catch:{ all -> 0x00d2 }
        r4 = r5.m;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r3, r4, r11, r1, r2);	 Catch:{ all -> 0x00d2 }
        r3 = r5.j;	 Catch:{ all -> 0x00d2 }
        r4 = r5.m;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r3, r4, r12, r1, r2);	 Catch:{ all -> 0x00d2 }
        r3 = r5.k;	 Catch:{ all -> 0x00d2 }
        r4 = r5.m;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r3, r4, r0, r1, r2);	 Catch:{ all -> 0x00d2 }
        r3 = r5.a;	 Catch:{ all -> 0x00d2 }
        r4 = r5.m;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r3, r4, r7, r1, r2);	 Catch:{ all -> 0x00d2 }
        r3 = r5.m;	 Catch:{ all -> 0x00d2 }
        r4 = r5.f;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r4, r1, r8, r2, r3);	 Catch:{ all -> 0x00d2 }
        r4 = r5.i;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r4, r1, r9, r2, r3);	 Catch:{ all -> 0x00d2 }
        r4 = r5.h;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r4, r1, r10, r2, r3);	 Catch:{ all -> 0x00d2 }
        r4 = r5.g;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r4, r1, r11, r2, r3);	 Catch:{ all -> 0x00d2 }
        r4 = r5.j;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r4, r1, r12, r2, r3);	 Catch:{ all -> 0x00d2 }
        r4 = r5.k;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ all -> 0x00d2 }
        r4 = r5.a;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r4, r1, r7, r2, r3);	 Catch:{ all -> 0x00d2 }
        r5.f = r8;	 Catch:{ all -> 0x00d2 }
        r5.i = r9;	 Catch:{ all -> 0x00d2 }
        r5.h = r10;	 Catch:{ all -> 0x00d2 }
        r5.g = r11;	 Catch:{ all -> 0x00d2 }
        r5.j = r12;	 Catch:{ all -> 0x00d2 }
        r5.k = r0;	 Catch:{ all -> 0x00d2 }
        r5.a = r7;	 Catch:{ all -> 0x00d2 }
        r5.m = r1;	 Catch:{ all -> 0x00d2 }
        r7 = r5.e;	 Catch:{ all -> 0x00d2 }
        r5.l = r7;	 Catch:{ all -> 0x00d2 }
        r5.e = r6;	 Catch:{ all -> 0x00d2 }
    L_0x00d0:
        monitor-exit(r5);
        return;
    L_0x00d2:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.a(long, int, long, int, bnu$a):void");
    }

    public final void a(boolean z) {
        this.l = 0;
        this.b = 0;
        this.m = 0;
        this.c = 0;
        this.p = true;
        this.n = Long.MIN_VALUE;
        this.o = Long.MIN_VALUE;
        if (z) {
            this.r = null;
            this.q = true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x004e in {8, 10, 16, 25, 28, 31} preds:[]
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
    public final synchronized boolean a(long r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.l;	 Catch:{ all -> 0x004b }
        r1 = 0;	 Catch:{ all -> 0x004b }
        r2 = 1;	 Catch:{ all -> 0x004b }
        if (r0 != 0) goto L_0x0011;	 Catch:{ all -> 0x004b }
        r3 = r7.n;	 Catch:{ all -> 0x004b }
        r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x000f;
        monitor-exit(r7);
        return r2;
        monitor-exit(r7);
        return r1;
        r3 = r7.n;	 Catch:{ all -> 0x004b }
        r0 = r7.c;	 Catch:{ all -> 0x004b }
        r5 = r7.e(r0);	 Catch:{ all -> 0x004b }
        r3 = java.lang.Math.max(r3, r5);	 Catch:{ all -> 0x004b }
        r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x0023;
        monitor-exit(r7);
        return r1;
        r0 = r7.l;	 Catch:{ all -> 0x004b }
        r1 = r7.l;	 Catch:{ all -> 0x004b }
        r1 = r1 - r2;	 Catch:{ all -> 0x004b }
        r1 = r7.c(r1);	 Catch:{ all -> 0x004b }
        r3 = r7.c;	 Catch:{ all -> 0x004b }
        if (r0 <= r3) goto L_0x0043;	 Catch:{ all -> 0x004b }
        r3 = r7.i;	 Catch:{ all -> 0x004b }
        r4 = r3[r1];	 Catch:{ all -> 0x004b }
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));	 Catch:{ all -> 0x004b }
        if (r3 < 0) goto L_0x0043;	 Catch:{ all -> 0x004b }
        r0 = r0 + -1;	 Catch:{ all -> 0x004b }
        r1 = r1 + -1;	 Catch:{ all -> 0x004b }
        r3 = -1;	 Catch:{ all -> 0x004b }
        if (r1 != r3) goto L_0x002c;	 Catch:{ all -> 0x004b }
        r1 = r7.e;	 Catch:{ all -> 0x004b }
        r1 = r1 - r2;	 Catch:{ all -> 0x004b }
        goto L_0x002c;	 Catch:{ all -> 0x004b }
        r8 = r7.b;	 Catch:{ all -> 0x004b }
        r8 = r8 + r0;	 Catch:{ all -> 0x004b }
        r7.a(r8);	 Catch:{ all -> 0x004b }
        monitor-exit(r7);
        return r2;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.a(long):boolean");
    }

    public final synchronized boolean a(blg blg) {
        if (blg == null) {
            this.q = true;
            return false;
        }
        this.q = false;
        if (bzo.a((Object) blg, this.r)) {
            return false;
        }
        this.r = blg;
        return true;
    }

    public final int b() {
        return this.b + this.c;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0019 in {7, 9, 10, 13} preds:[]
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
    public final synchronized boolean b(int r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x0016 }
        if (r0 > r3) goto L_0x0014;	 Catch:{ all -> 0x0016 }
        r0 = r2.b;	 Catch:{ all -> 0x0016 }
        r1 = r2.l;	 Catch:{ all -> 0x0016 }
        r0 = r0 + r1;	 Catch:{ all -> 0x0016 }
        if (r3 > r0) goto L_0x0014;	 Catch:{ all -> 0x0016 }
        r0 = r2.b;	 Catch:{ all -> 0x0016 }
        r3 = r3 - r0;	 Catch:{ all -> 0x0016 }
        r2.c = r3;	 Catch:{ all -> 0x0016 }
        r3 = 1;
        monitor-exit(r2);
        return r3;
        r3 = 0;
        goto L_0x0012;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.b(int):boolean");
    }

    public final int c(int i) {
        int i2 = this.m + i;
        i = this.e;
        return i2 < i ? i2 : i2 - i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000f in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean c() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.c;	 Catch:{ all -> 0x000c }
        r1 = r2.l;	 Catch:{ all -> 0x000c }
        if (r0 == r1) goto L_0x000a;
        r0 = 1;
        monitor-exit(r2);
        return r0;
        r0 = 0;
        goto L_0x0008;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.c():boolean");
    }

    public final synchronized blg d() {
        if (this.q) {
            return null;
        }
        return this.r;
    }

    public final synchronized long e() {
        return this.o;
    }

    public final synchronized long f() {
        if (this.l == 0) {
            return Long.MIN_VALUE;
        }
        return this.i[this.m];
    }

    public final synchronized void g() {
        this.c = 0;
    }

    public final synchronized int h() {
        int i;
        i = this.l - this.c;
        this.c = this.l;
        return i;
    }

    public final synchronized long i() {
        if (this.c == 0) {
            return -1;
        }
        return d(this.c);
    }

    public final synchronized long j() {
        if (this.l == 0) {
            return -1;
        }
        return d(this.l);
    }
}
