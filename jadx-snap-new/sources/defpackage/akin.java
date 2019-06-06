package defpackage;

import defpackage.akim.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Proxy.Type;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: akin */
public final class akin {
    public static final /* synthetic */ boolean e = (akin.class.desiredAssertionStatus() ^ 1);
    public final akhc a;
    public akij b;
    public boolean c;
    public akiq d;
    private akgt f;
    private a g;
    private akhx h;
    private akgx i;
    private akhi j;
    private final Object k;
    private final akim l;
    private int m;
    private boolean n;
    private boolean o;

    /* renamed from: akin$a */
    public static final class a extends WeakReference<akin> {
        public final Object a;

        a(akin akin, Object obj) {
            super(akin);
            this.a = obj;
        }
    }

    public akin(akhc akhc, akgt akgt, akgx akgx, akhi akhi, Object obj) {
        this.a = akhc;
        this.f = akgt;
        this.i = akgx;
        this.j = akhi;
        this.l = new akim(akgt, f(), akgx, akhi);
        this.k = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:96:0x0144 in {13, 15, 20, 21, 24, 25, 29, 30, 31, 32, 36, 41, 42, 43, 54, 55, 60, 62, 63, 66, 72, 75, 79, 82, 85, 88, 90, 92, 95} preds:[]
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
    private defpackage.akij a(int r18, int r19, int r20, boolean r21) {
        /*
        r17 = this;
        r1 = r17;
        r2 = r1.a;
        monitor-enter(r2);
        r0 = r1.o;	 Catch:{ all -> 0x0141 }
        if (r0 != 0) goto L_0x0139;	 Catch:{ all -> 0x0141 }
        r0 = r1.d;	 Catch:{ all -> 0x0141 }
        if (r0 != 0) goto L_0x0131;	 Catch:{ all -> 0x0141 }
        r0 = r1.c;	 Catch:{ all -> 0x0141 }
        if (r0 != 0) goto L_0x0129;	 Catch:{ all -> 0x0141 }
        r0 = e;	 Catch:{ all -> 0x0141 }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x0141 }
        r0 = r1.a;	 Catch:{ all -> 0x0141 }
        r0 = java.lang.Thread.holdsLock(r0);	 Catch:{ all -> 0x0141 }
        if (r0 == 0) goto L_0x001e;	 Catch:{ all -> 0x0141 }
        goto L_0x0024;	 Catch:{ all -> 0x0141 }
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x0141 }
        r0.<init>();	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
        r0 = r1.b;	 Catch:{ all -> 0x0141 }
        r3 = 0;	 Catch:{ all -> 0x0141 }
        r4 = 1;	 Catch:{ all -> 0x0141 }
        r5 = 0;	 Catch:{ all -> 0x0141 }
        if (r0 == 0) goto L_0x0034;	 Catch:{ all -> 0x0141 }
        r0 = r0.h;	 Catch:{ all -> 0x0141 }
        if (r0 == 0) goto L_0x0034;	 Catch:{ all -> 0x0141 }
        r0 = r1.a(r5, r5, r4);	 Catch:{ all -> 0x0141 }
        goto L_0x0035;	 Catch:{ all -> 0x0141 }
        r0 = r3;	 Catch:{ all -> 0x0141 }
        r6 = r1.b;	 Catch:{ all -> 0x0141 }
        if (r6 == 0) goto L_0x003c;	 Catch:{ all -> 0x0141 }
        r6 = r1.b;	 Catch:{ all -> 0x0141 }
        goto L_0x003d;	 Catch:{ all -> 0x0141 }
        r6 = r3;	 Catch:{ all -> 0x0141 }
        if (r6 != 0) goto L_0x0054;	 Catch:{ all -> 0x0141 }
        r7 = defpackage.akhz.a;	 Catch:{ all -> 0x0141 }
        r8 = r1.a;	 Catch:{ all -> 0x0141 }
        r9 = r1.f;	 Catch:{ all -> 0x0141 }
        r7.a(r8, r9, r1, r3);	 Catch:{ all -> 0x0141 }
        r7 = r1.b;	 Catch:{ all -> 0x0141 }
        if (r7 == 0) goto L_0x0051;	 Catch:{ all -> 0x0141 }
        r6 = r1.b;	 Catch:{ all -> 0x0141 }
        r7 = r3;	 Catch:{ all -> 0x0141 }
        r8 = 1;	 Catch:{ all -> 0x0141 }
        goto L_0x0056;	 Catch:{ all -> 0x0141 }
        r7 = r1.h;	 Catch:{ all -> 0x0141 }
        goto L_0x0055;	 Catch:{ all -> 0x0141 }
        r7 = r3;	 Catch:{ all -> 0x0141 }
        r8 = 0;	 Catch:{ all -> 0x0141 }
        monitor-exit(r2);	 Catch:{ all -> 0x0141 }
        defpackage.akib.a(r0);
        if (r6 == 0) goto L_0x005d;
        return r6;
        if (r7 != 0) goto L_0x0073;
        r0 = r1.g;
        if (r0 == 0) goto L_0x0069;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0073;
        r0 = r1.l;
        r0 = r0.b();
        r1.g = r0;
        r0 = 1;
        goto L_0x0074;
        r0 = 0;
        r9 = r1.a;
        monitor-enter(r9);
        r2 = r1.c;	 Catch:{ all -> 0x0126 }
        if (r2 != 0) goto L_0x011e;	 Catch:{ all -> 0x0126 }
        if (r0 == 0) goto L_0x00a9;	 Catch:{ all -> 0x0126 }
        r0 = r1.g;	 Catch:{ all -> 0x0126 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0126 }
        r0 = r0.a;	 Catch:{ all -> 0x0126 }
        r2.<init>(r0);	 Catch:{ all -> 0x0126 }
        r0 = r2.size();	 Catch:{ all -> 0x0126 }
        r10 = 0;	 Catch:{ all -> 0x0126 }
        if (r10 >= r0) goto L_0x00a9;	 Catch:{ all -> 0x0126 }
        r11 = r2.get(r10);	 Catch:{ all -> 0x0126 }
        r11 = (defpackage.akhx) r11;	 Catch:{ all -> 0x0126 }
        r12 = defpackage.akhz.a;	 Catch:{ all -> 0x0126 }
        r13 = r1.a;	 Catch:{ all -> 0x0126 }
        r14 = r1.f;	 Catch:{ all -> 0x0126 }
        r12.a(r13, r14, r1, r11);	 Catch:{ all -> 0x0126 }
        r12 = r1.b;	 Catch:{ all -> 0x0126 }
        if (r12 == 0) goto L_0x00a6;	 Catch:{ all -> 0x0126 }
        r6 = r1.b;	 Catch:{ all -> 0x0126 }
        r1.h = r11;	 Catch:{ all -> 0x0126 }
        r8 = 1;	 Catch:{ all -> 0x0126 }
        goto L_0x00a9;	 Catch:{ all -> 0x0126 }
        r10 = r10 + 1;	 Catch:{ all -> 0x0126 }
        goto L_0x008b;	 Catch:{ all -> 0x0126 }
        if (r8 != 0) goto L_0x00d9;	 Catch:{ all -> 0x0126 }
        if (r7 != 0) goto L_0x00cb;	 Catch:{ all -> 0x0126 }
        r0 = r1.g;	 Catch:{ all -> 0x0126 }
        r2 = r0.a();	 Catch:{ all -> 0x0126 }
        if (r2 == 0) goto L_0x00c5;	 Catch:{ all -> 0x0126 }
        r2 = r0.a;	 Catch:{ all -> 0x0126 }
        r6 = r0.b;	 Catch:{ all -> 0x0126 }
        r7 = r6 + 1;	 Catch:{ all -> 0x0126 }
        r0.b = r7;	 Catch:{ all -> 0x0126 }
        r0 = r2.get(r6);	 Catch:{ all -> 0x0126 }
        r7 = r0;	 Catch:{ all -> 0x0126 }
        r7 = (defpackage.akhx) r7;	 Catch:{ all -> 0x0126 }
        goto L_0x00cb;	 Catch:{ all -> 0x0126 }
        r0 = new java.util.NoSuchElementException;	 Catch:{ all -> 0x0126 }
        r0.<init>();	 Catch:{ all -> 0x0126 }
        throw r0;	 Catch:{ all -> 0x0126 }
        r1.h = r7;	 Catch:{ all -> 0x0126 }
        r1.m = r5;	 Catch:{ all -> 0x0126 }
        r6 = new akij;	 Catch:{ all -> 0x0126 }
        r0 = r1.a;	 Catch:{ all -> 0x0126 }
        r6.<init>(r0, r7);	 Catch:{ all -> 0x0126 }
        r1.a(r6, r5);	 Catch:{ all -> 0x0126 }
        monitor-exit(r9);	 Catch:{ all -> 0x0126 }
        if (r8 == 0) goto L_0x00dd;
        return r6;
        r15 = r1.i;
        r0 = r1.j;
        r10 = r6;
        r11 = r18;
        r12 = r19;
        r13 = r20;
        r14 = r21;
        r16 = r0;
        r10.a(r11, r12, r13, r14, r15, r16);
        r0 = r17.f();
        r2 = r6.a;
        r0.b(r2);
        r2 = r1.a;
        monitor-enter(r2);
        r1.n = r4;	 Catch:{ all -> 0x011b }
        r0 = defpackage.akhz.a;	 Catch:{ all -> 0x011b }
        r4 = r1.a;	 Catch:{ all -> 0x011b }
        r0.b(r4, r6);	 Catch:{ all -> 0x011b }
        r0 = r6.b();	 Catch:{ all -> 0x011b }
        if (r0 == 0) goto L_0x0116;	 Catch:{ all -> 0x011b }
        r0 = defpackage.akhz.a;	 Catch:{ all -> 0x011b }
        r3 = r1.a;	 Catch:{ all -> 0x011b }
        r4 = r1.f;	 Catch:{ all -> 0x011b }
        r3 = r0.a(r3, r4, r1);	 Catch:{ all -> 0x011b }
        r6 = r1.b;	 Catch:{ all -> 0x011b }
        monitor-exit(r2);	 Catch:{ all -> 0x011b }
        defpackage.akib.a(r3);
        return r6;
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x011b }
        throw r0;
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0126 }
        r2 = "Canceled";	 Catch:{ all -> 0x0126 }
        r0.<init>(r2);	 Catch:{ all -> 0x0126 }
        throw r0;	 Catch:{ all -> 0x0126 }
        r0 = move-exception;	 Catch:{ all -> 0x0126 }
        monitor-exit(r9);	 Catch:{ all -> 0x0126 }
        throw r0;
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0141 }
        r3 = "Canceled";	 Catch:{ all -> 0x0141 }
        r0.<init>(r3);	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0141 }
        r3 = "codec != null";	 Catch:{ all -> 0x0141 }
        r0.<init>(r3);	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0141 }
        r3 = "released";	 Catch:{ all -> 0x0141 }
        r0.<init>(r3);	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
        r0 = move-exception;	 Catch:{ all -> 0x0141 }
        monitor-exit(r2);	 Catch:{ all -> 0x0141 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akin.a(int, int, int, boolean):akij");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x001c in {6, 10, 11, 15} preds:[]
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
    private defpackage.akij a(int r4, int r5, int r6, boolean r7, boolean r8) {
        /*
        r3 = this;
        r0 = r3.a(r4, r5, r6, r7);
        r1 = r3.a;
        monitor-enter(r1);
        r2 = r0.i;	 Catch:{ all -> 0x0019 }
        if (r2 != 0) goto L_0x000d;	 Catch:{ all -> 0x0019 }
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        return r0;	 Catch:{ all -> 0x0019 }
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        r1 = r0.a(r8);
        if (r1 != 0) goto L_0x0018;
        r3.d();
        goto L_0x0000;
        return r0;
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akin.a(int, int, int, boolean, boolean):akij");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0026 in {5, 6, 8} preds:[]
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
    private void a(defpackage.akij r4) {
        /*
        r3 = this;
        r0 = r4.j;
        r0 = r0.size();
        r1 = 0;
        if (r1 >= r0) goto L_0x0020;
        r2 = r4.j;
        r2 = r2.get(r1);
        r2 = (java.lang.ref.Reference) r2;
        r2 = r2.get();
        if (r2 != r3) goto L_0x001d;
        r4 = r4.j;
        r4.remove(r1);
        return;
        r1 = r1 + 1;
        goto L_0x0007;
        r4 = new java.lang.IllegalStateException;
        r4.<init>();
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akin.a(akij):void");
    }

    private akik f() {
        return akhz.a.a(this.a);
    }

    public final akiq a() {
        akiq akiq;
        synchronized (this.a) {
            akiq = this.d;
        }
        return akiq;
    }

    public final akiq a(akhq akhq, akhn.a aVar, boolean z) {
        try {
            akiq akjg;
            akij a = a(aVar.b(), aVar.c(), aVar.d(), akhq.t, z);
            if (a.e != null) {
                akjg = new akjg(akhq, aVar, this, a.e);
            } else {
                a.c.setSoTimeout(aVar.c());
                a.f.a().a((long) aVar.c(), TimeUnit.MILLISECONDS);
                a.g.a().a((long) aVar.d(), TimeUnit.MILLISECONDS);
                akjg = new akja(akhq, this, a.f, a.g);
            }
            synchronized (this.a) {
                this.d = akjg;
            }
            return akjg;
        } catch (IOException e) {
            throw new akil(e);
        }
    }

    public final Socket a(boolean z, boolean z2, boolean z3) {
        if (e || Thread.holdsLock(this.a)) {
            if (z3) {
                this.d = null;
            }
            if (z2) {
                this.o = true;
            }
            akij akij = this.b;
            if (akij != null) {
                if (z) {
                    akij.h = true;
                }
                if (this.d == null && (this.o || this.b.h)) {
                    Socket socket;
                    a(this.b);
                    if (this.b.j.isEmpty()) {
                        this.b.k = System.nanoTime();
                        if (akhz.a.a(this.a, this.b)) {
                            socket = this.b.c;
                            this.b = null;
                            return socket;
                        }
                    }
                    socket = null;
                    this.b = null;
                    return socket;
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    public final void a(akij akij, boolean z) {
        if (!e && !Thread.holdsLock(this.a)) {
            throw new AssertionError();
        } else if (this.b == null) {
            this.b = akij;
            this.n = z;
            akij.j.add(new a(this, this.k));
        } else {
            throw new IllegalStateException();
        }
    }

    public final void a(IOException iOException) {
        Socket a;
        synchronized (this.a) {
            boolean z;
            if (iOException instanceof akjp) {
                akjp akjp = (akjp) iOException;
                if (akjp.a == akjc.REFUSED_STREAM) {
                    this.m++;
                }
                if (akjp.a == akjc.REFUSED_STREAM) {
                    if (this.m > 1) {
                    }
                    z = false;
                    a = a(z, false, true);
                }
            } else {
                if (this.b != null && (!this.b.b() || (iOException instanceof akjb))) {
                    if (this.b.i == 0) {
                        if (!(this.h == null || iOException == null)) {
                            akim akim = this.l;
                            akhx akhx = this.h;
                            if (!(akhx.b.type() == Type.DIRECT || akim.a.f == null)) {
                                akim.a.f.connectFailed(akim.a.a.b(), akhx.b.address(), iOException);
                            }
                            akim.b.a(akhx);
                        }
                    }
                    z = true;
                    a = a(z, false, true);
                }
                z = false;
                a = a(z, false, true);
            }
            this.h = null;
            z = true;
            a = a(z, false, true);
        }
        akib.a(a);
    }

    public final void a(boolean z, akiq akiq) {
        Socket a;
        synchronized (this.a) {
            if (akiq != null) {
                if (akiq == this.d) {
                    if (!z) {
                        akij akij = this.b;
                        akij.i++;
                    }
                    a = a(z, false, true);
                }
            }
            StringBuilder stringBuilder = new StringBuilder("expected ");
            stringBuilder.append(this.d);
            stringBuilder.append(" but was ");
            stringBuilder.append(akiq);
            throw new IllegalStateException(stringBuilder.toString());
        }
        akib.a(a);
    }

    public final synchronized akij b() {
        return this.b;
    }

    public final void c() {
        Socket a;
        synchronized (this.a) {
            a = a(false, true, false);
        }
        akib.a(a);
    }

    public final void d() {
        Socket a;
        synchronized (this.a) {
            a = a(true, false, false);
        }
        akib.a(a);
    }

    public final boolean e() {
        if (this.h == null) {
            a aVar = this.g;
            if ((aVar == null || !aVar.a()) && !this.l.a()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        akij b = b();
        return b != null ? b.toString() : this.f.toString();
    }
}
