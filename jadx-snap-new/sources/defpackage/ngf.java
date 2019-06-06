package defpackage;

import android.os.Handler;
import android.os.Looper;
import defpackage.ncn.b;
import defpackage.nga.d;
import defpackage.nga.e;
import java.lang.ref.WeakReference;
import java.util.Random;

/* renamed from: ngf */
public final class ngf {
    final nce a;
    final b b;
    boolean c;
    ncp d;
    b e;
    nca f;
    private final nga g;
    private boolean h = this.a.g();
    private Handler i;

    /* renamed from: ngf$b */
    public interface b {
        void a(ngf ngf, long j, int i);

        void a(ngf ngf, long j, boolean z, alkf alkf, long j2);

        void a(ngf ngf, ncp ncp);
    }

    /* renamed from: ngf$a */
    static class a implements d {
        private final WeakReference<ngf> a;
        private final long b;
        private final int c;

        private a(ngf ngf, long j, int i) {
            this.a = new WeakReference(ngf);
            this.b = j;
            this.c = i;
        }

        /* synthetic */ a(ngf ngf, long j, int i, byte b) {
            this(ngf, j, i);
        }

        public final void a() {
            ngf ngf = (ngf) this.a.get();
            if (ngf != null) {
                ngf.a(this.b, null, this.c);
            }
        }

        public final /* synthetic */ void a(Object obj) {
            aljb aljb = (aljb) obj;
            ngf ngf = (ngf) this.a.get();
            if (ngf != null) {
                ngf.a(this.b, aljb, this.c);
            }
        }
    }

    /* renamed from: ngf$c */
    static class c implements e {
        final int a;
        final ncp b;
        final b c;
        final nca d;
        private final WeakReference<ngf> e;
        private final Random f = new Random();
        private final WeakReference<ncn> g;

        public c(ncn ncn, ngf ngf, int i, ncp ncp, b bVar, nca nca) {
            this.g = new WeakReference(ncn);
            this.e = new WeakReference(ngf);
            this.a = i;
            this.b = ncp;
            this.c = bVar;
            this.d = nca;
        }

        public final void a() {
            final ncn ncn = (ncn) this.g.get();
            if (ncn != null) {
                final ngf ngf = (ngf) this.e.get();
                if (ngf != null) {
                    ngf.a().postDelayed(new Runnable() {
                        public final void run() {
                            ngf.a(ncn, c.this.b, c.this.c, c.this.d, c.this.a + 1);
                        }
                    }, nga.b.a(this.a, this.f));
                }
            }
        }

        /* JADX WARNING: Missing block: B:16:0x004d, code skipped:
            r6.b.a(r6, r1);
     */
        public final /* synthetic */ void a(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = r5.e;
            r6 = r6.get();
            r6 = (defpackage.ngf) r6;
            if (r6 == 0) goto L_0x0056;
        L_0x000a:
            r0 = r5.g;
            r0 = r0.get();
            r0 = (defpackage.ncn) r0;
            if (r0 == 0) goto L_0x0056;
        L_0x0014:
            r1 = r5.c;
            r2 = r5.d;
            r3 = r5.b;
            r3 = r3.c;
            r1.a(r0, r2, r3);
            r1 = r5.b;
            monitor-enter(r6);
            r2 = r6.c;	 Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0028;
        L_0x0026:
            monitor-exit(r6);	 Catch:{ all -> 0x0053 }
            return;
        L_0x0028:
            r2 = r6.d;	 Catch:{ all -> 0x0053 }
            r2 = r1.equals(r2);	 Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0043;
        L_0x0030:
            r0 = 0;
            r6.d = r0;	 Catch:{ all -> 0x0053 }
            r6.e = r0;	 Catch:{ all -> 0x0053 }
            r6.f = r0;	 Catch:{ all -> 0x0053 }
            r0 = r6.a;	 Catch:{ all -> 0x0053 }
            r2 = 0;
            r0.b(r2);	 Catch:{ all -> 0x0053 }
            r0 = r6.a;	 Catch:{ all -> 0x0053 }
            r0.r();	 Catch:{ all -> 0x0053 }
            goto L_0x004c;
        L_0x0043:
            r2 = r6.d;	 Catch:{ all -> 0x0053 }
            r3 = r6.e;	 Catch:{ all -> 0x0053 }
            r4 = r6.f;	 Catch:{ all -> 0x0053 }
            r6.b(r0, r2, r3, r4);	 Catch:{ all -> 0x0053 }
        L_0x004c:
            monitor-exit(r6);	 Catch:{ all -> 0x0053 }
            r0 = r6.b;
            r0.a(r6, r1);
            goto L_0x0056;
        L_0x0053:
            r0 = move-exception;
            monitor-exit(r6);	 Catch:{ all -> 0x0053 }
            throw r0;
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ngf$c.a(java.lang.Object):void");
        }
    }

    public ngf(nce nce, nga nga, b bVar, ajei ajei) {
        this.a = nce;
        this.g = nga;
        this.b = bVar;
        ajei.a(nce.I().a(new -$$Lambda$ngf$IUvZ6B8aMoW-hJkBYQh5Za06urg(this), new -$$Lambda$ngf$Xb5cKWI96M_sCmxNAk7RntTplVM(this)));
    }

    private synchronized long e() {
        return this.a.i();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Handler a() {
        if (this.i == null) {
            this.i = new Handler(Looper.getMainLooper());
        }
        return this.i;
    }

    public final synchronized void a(long j, int i) {
        if (!this.c) {
            this.g.a(new a(this, j, i, (byte) 0));
        }
    }

    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r12 == null) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:13:0x0020, code skipped:
            if (r12.a != null) goto L_0x0023;
     */
    /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            r9.b.a(r9, r10, r12.c, r12.a, r12.b);
     */
    /* JADX WARNING: Missing block: B:15:0x0030, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            r9.b.a(r9, r10, r13);
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            return;
     */
    public final void a(long r10, defpackage.aljb r12, int r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.c;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r9);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0007:
        if (r12 == 0) goto L_0x001b;
    L_0x0009:
        r0 = r12.a;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x001b;
    L_0x000d:
        r0 = r9.a;	 Catch:{ all -> 0x0037 }
        r0.r();	 Catch:{ all -> 0x0037 }
        r0 = r9.a;	 Catch:{ all -> 0x0037 }
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0037 }
        r0.a(r1);	 Catch:{ all -> 0x0037 }
    L_0x001b:
        monitor-exit(r9);	 Catch:{ all -> 0x0037 }
        if (r12 == 0) goto L_0x0031;
    L_0x001e:
        r0 = r12.a;
        if (r0 != 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0031;
    L_0x0023:
        r1 = r9.b;
        r5 = r12.c;
        r6 = r12.a;
        r7 = r12.b;
        r2 = r9;
        r3 = r10;
        r1.a(r2, r3, r5, r6, r7);
        return;
    L_0x0031:
        r12 = r9.b;
        r12.a(r9, r10, r13);
        return;
    L_0x0037:
        r10 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0037 }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngf.a(long, aljb, int):void");
    }

    public final synchronized void a(ncn ncn, ncp ncp, b bVar, nca nca) {
        if (!this.c) {
            Object obj = this.d == null ? 1 : null;
            this.d = ncp;
            this.e = bVar;
            this.f = nca;
            if (obj != null) {
                b(ncn, ncp, bVar, nca);
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(ncn ncn, ncp ncp, b bVar, nca nca, int i) {
        if (!this.c) {
            this.a.b(true);
            this.g.a(ncp, new c(ncn, this, i, ncp, bVar, nca));
        }
    }

    /* JADX WARNING: Missing block: B:38:0x0062, code skipped:
            return;
     */
    public final synchronized void a(defpackage.ncn r7, boolean r8, defpackage.ncp r9, defpackage.ncn.b r10) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x0063 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r6);
        return;
    L_0x0007:
        r0 = r6.d;	 Catch:{ all -> 0x0063 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r6);
        return;
    L_0x000d:
        r0 = 0;
        if (r9 == 0) goto L_0x0020;
    L_0x0010:
        r1 = r6.h;	 Catch:{ all -> 0x0063 }
        if (r1 == 0) goto L_0x0020;
    L_0x0014:
        r8 = new nca;	 Catch:{ all -> 0x0063 }
        r1 = defpackage.aapu.USER_UPDATE;	 Catch:{ all -> 0x0063 }
        r8.<init>(r0, r1);	 Catch:{ all -> 0x0063 }
        r6.a(r7, r9, r10, r8);	 Catch:{ all -> 0x0063 }
        monitor-exit(r6);
        return;
    L_0x0020:
        r9 = r6.a;	 Catch:{ all -> 0x0063 }
        r9 = r9.h();	 Catch:{ all -> 0x0063 }
        if (r9 != 0) goto L_0x002a;
    L_0x0028:
        r9 = 0;
        goto L_0x002b;
    L_0x002a:
        r9 = 1;
    L_0x002b:
        if (r9 == 0) goto L_0x0033;
    L_0x002d:
        r9 = r6.b();	 Catch:{ all -> 0x0063 }
        if (r9 != 0) goto L_0x0035;
    L_0x0033:
        if (r8 == 0) goto L_0x0049;
    L_0x0035:
        r7 = r6.g;	 Catch:{ all -> 0x0063 }
        r8 = new ngf$a;	 Catch:{ all -> 0x0063 }
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0063 }
        r4 = 0;
        r5 = 0;
        r0 = r8;
        r1 = r6;
        r0.<init>(r1, r2, r4, r5);	 Catch:{ all -> 0x0063 }
        r7.a(r8);	 Catch:{ all -> 0x0063 }
        monitor-exit(r6);
        return;
    L_0x0049:
        r8 = r6.e;	 Catch:{ all -> 0x0063 }
        if (r8 == 0) goto L_0x0061;
    L_0x004d:
        r8 = r6.b();	 Catch:{ all -> 0x0063 }
        if (r8 == 0) goto L_0x0061;
    L_0x0053:
        r8 = r6.e;	 Catch:{ all -> 0x0063 }
        r9 = new nca;	 Catch:{ all -> 0x0063 }
        r10 = defpackage.aapu.USER_UPDATE;	 Catch:{ all -> 0x0063 }
        r9.<init>(r0, r10);	 Catch:{ all -> 0x0063 }
        r0 = 0;
        r8.a(r7, r9, r0);	 Catch:{ all -> 0x0063 }
    L_0x0061:
        monitor-exit(r6);
        return;
    L_0x0063:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngf.a(ncn, boolean, ncp, ncn$b):void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(ncn ncn, ncp ncp, b bVar, nca nca) {
        if (!this.c) {
            a(ncn, ncp, bVar, nca, 0);
        }
    }

    public final boolean b() {
        return System.currentTimeMillis() - e() > 43200000;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
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
        r1 = this;
        monitor-enter(r1);
        r0 = r1.h;	 Catch:{ all -> 0x000a }
        if (r0 != 0) goto L_0x0008;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x0006;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngf.c():boolean");
    }

    public final synchronized void d() {
        this.c = true;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = false;
        this.a.D();
        this.a.E();
        this.a.s();
    }
}
