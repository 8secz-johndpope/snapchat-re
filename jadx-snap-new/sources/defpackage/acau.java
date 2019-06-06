package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.google.common.base.Preconditions;
import defpackage.adkk.a.a.c;
import defpackage.adkk.b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: acau */
public final class acau implements adkk {
    b a;
    AtomicReference<b> b;
    adkm c;
    volatile CountDownLatch d;
    final adkt e;
    final adkx f;
    private Bitmap g;
    private Surface h;
    private adiv i;
    private adie j;
    private boolean k;
    private final ajwy<adnj> l;
    private final adhi m;
    private final adhl n;
    private final ajwy<adhq> o;
    private final HandlerThread p;
    private final Handler q;
    private final adkh r;

    /* renamed from: acau$a */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Missing block: B:19:?, code skipped:
            r1.a();
            r6.e.a(r6.f, defpackage.adks.STOPPED);
     */
        /* JADX WARNING: Missing block: B:21:?, code skipped:
            r6.e.a(r6.f, defpackage.adks.RELEASE_BEGIN);
            r1.b();
            r6.e.a(r6.f, defpackage.adks.RELEASE_FINISH);
            r6.b.set(defpackage.acau.b.RELEASED);
     */
        /* JADX WARNING: Missing block: B:22:0x0072, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:23:0x0073, code skipped:
            r6.a(new defpackage.adkk.a.a.a(r0));
     */
        /* JADX WARNING: Missing block: B:25:0x007e, code skipped:
            r0 = move-exception;
     */
        /* JADX WARNING: Missing block: B:27:?, code skipped:
            r6.a(new defpackage.adkk.a.a.b(r0));
     */
        /* JADX WARNING: Missing block: B:40:?, code skipped:
            r6.e.a(r6.f, defpackage.adks.RELEASE_BEGIN);
            r1.b();
            r6.e.a(r6.f, defpackage.adks.RELEASE_FINISH);
            r6.b.set(defpackage.acau.b.RELEASED);
     */
        /* JADX WARNING: Missing block: B:41:0x00b8, code skipped:
            r1 = move-exception;
     */
        /* JADX WARNING: Missing block: B:42:0x00b9, code skipped:
            r6.a(new defpackage.adkk.a.a.a(r1));
     */
        /* JADX WARNING: Missing block: B:43:0x00c1, code skipped:
            r6.d.countDown();
     */
        public final void handleMessage(android.os.Message r6) {
            /*
            r5 = this;
            super.handleMessage(r6);
            r6 = r6.what;
            if (r6 == 0) goto L_0x00ca;
        L_0x0007:
            r0 = 1;
            if (r6 == r0) goto L_0x000b;
        L_0x000a:
            return;
        L_0x000b:
            r6 = defpackage.acau.this;
            monitor-enter(r6);
            r1 = r6.c;	 Catch:{ all -> 0x00c7 }
            r2 = r6.b;	 Catch:{ all -> 0x00c7 }
            r2 = r2.get();	 Catch:{ all -> 0x00c7 }
            r2 = (defpackage.acau.b) r2;	 Catch:{ all -> 0x00c7 }
            r3 = defpackage.acau.b.INITIALIZED;	 Catch:{ all -> 0x00c7 }
            if (r2 == r3) goto L_0x001e;
        L_0x001c:
            monitor-exit(r6);	 Catch:{ all -> 0x00c7 }
            return;
        L_0x001e:
            if (r1 != 0) goto L_0x0031;
        L_0x0020:
            r0 = new adkk$a$a$b;	 Catch:{ all -> 0x00c7 }
            r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00c7 }
            r2 = "Image player is null when start";
            r1.<init>(r2);	 Catch:{ all -> 0x00c7 }
            r0.<init>(r1);	 Catch:{ all -> 0x00c7 }
            r6.a(r0);	 Catch:{ all -> 0x00c7 }
            monitor-exit(r6);	 Catch:{ all -> 0x00c7 }
            return;
        L_0x0031:
            r2 = r6.b;	 Catch:{ all -> 0x00c7 }
            r3 = defpackage.acau.b.START;	 Catch:{ all -> 0x00c7 }
            r2.set(r3);	 Catch:{ all -> 0x00c7 }
            r2 = r6.e;	 Catch:{ all -> 0x00c7 }
            r3 = r6.f;	 Catch:{ all -> 0x00c7 }
            r4 = defpackage.adks.STARTED;	 Catch:{ all -> 0x00c7 }
            r2.a(r3, r4);	 Catch:{ all -> 0x00c7 }
            r2 = new java.util.concurrent.CountDownLatch;	 Catch:{ all -> 0x00c7 }
            r2.<init>(r0);	 Catch:{ all -> 0x00c7 }
            r6.d = r2;	 Catch:{ all -> 0x00c7 }
            monitor-exit(r6);	 Catch:{ all -> 0x00c7 }
            r1.a();	 Catch:{ adjz -> 0x007e }
            r0 = r6.e;	 Catch:{ adjz -> 0x007e }
            r2 = r6.f;	 Catch:{ adjz -> 0x007e }
            r3 = defpackage.adks.STOPPED;	 Catch:{ adjz -> 0x007e }
            r0.a(r2, r3);	 Catch:{ adjz -> 0x007e }
            r0 = r6.e;	 Catch:{ adjz -> 0x0072 }
            r2 = r6.f;	 Catch:{ adjz -> 0x0072 }
            r3 = defpackage.adks.RELEASE_BEGIN;	 Catch:{ adjz -> 0x0072 }
            r0.a(r2, r3);	 Catch:{ adjz -> 0x0072 }
            r1.b();	 Catch:{ adjz -> 0x0072 }
            r0 = r6.e;	 Catch:{ adjz -> 0x0072 }
            r1 = r6.f;	 Catch:{ adjz -> 0x0072 }
            r2 = defpackage.adks.RELEASE_FINISH;	 Catch:{ adjz -> 0x0072 }
            r0.a(r1, r2);	 Catch:{ adjz -> 0x0072 }
            r0 = r6.b;	 Catch:{ adjz -> 0x0072 }
            r1 = defpackage.acau.b.RELEASED;	 Catch:{ adjz -> 0x0072 }
            r0.set(r1);	 Catch:{ adjz -> 0x0072 }
            goto L_0x0087;
        L_0x0072:
            r0 = move-exception;
            r1 = new adkk$a$a$a;
            r1.<init>(r0);
            r6.a(r1);
            goto L_0x0087;
        L_0x007c:
            r0 = move-exception;
            goto L_0x009b;
        L_0x007e:
            r0 = move-exception;
            r2 = new adkk$a$a$b;	 Catch:{ all -> 0x007c }
            r2.<init>(r0);	 Catch:{ all -> 0x007c }
            r6.a(r2);	 Catch:{ all -> 0x007c }
        L_0x0087:
            r0 = r6.d;
            r0.countDown();
            monitor-enter(r6);
            r0 = r6.a;	 Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0096;
        L_0x0091:
            r0 = r6.a;	 Catch:{ all -> 0x0098 }
            r0.c();	 Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r6);	 Catch:{ all -> 0x0098 }
            return;
        L_0x0098:
            r0 = move-exception;
            monitor-exit(r6);	 Catch:{ all -> 0x0098 }
            throw r0;
        L_0x009b:
            r2 = r6.e;	 Catch:{ adjz -> 0x00b8 }
            r3 = r6.f;	 Catch:{ adjz -> 0x00b8 }
            r4 = defpackage.adks.RELEASE_BEGIN;	 Catch:{ adjz -> 0x00b8 }
            r2.a(r3, r4);	 Catch:{ adjz -> 0x00b8 }
            r1.b();	 Catch:{ adjz -> 0x00b8 }
            r1 = r6.e;	 Catch:{ adjz -> 0x00b8 }
            r2 = r6.f;	 Catch:{ adjz -> 0x00b8 }
            r3 = defpackage.adks.RELEASE_FINISH;	 Catch:{ adjz -> 0x00b8 }
            r1.a(r2, r3);	 Catch:{ adjz -> 0x00b8 }
            r1 = r6.b;	 Catch:{ adjz -> 0x00b8 }
            r2 = defpackage.acau.b.RELEASED;	 Catch:{ adjz -> 0x00b8 }
            r1.set(r2);	 Catch:{ adjz -> 0x00b8 }
            goto L_0x00c1;
        L_0x00b8:
            r1 = move-exception;
            r2 = new adkk$a$a$a;
            r2.<init>(r1);
            r6.a(r2);
        L_0x00c1:
            r6 = r6.d;
            r6.countDown();
            throw r0;
        L_0x00c7:
            r0 = move-exception;
            monitor-exit(r6);	 Catch:{ all -> 0x00c7 }
            throw r0;
        L_0x00ca:
            r6 = defpackage.acau.this;
            r6.e();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acau$a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: acau$b */
    public enum b {
        INVALID,
        INITIALIZED,
        START,
        STOP,
        RELEASED
    }

    /* renamed from: acau$1 */
    class 1 implements adkh {
        private boolean a = false;

        1() {
        }

        public final void a() {
            if (!this.a) {
                acau.this.e.a(acau.this.f, adks.FIRST_FRAME_RENDERED);
                if (acau.this.a != null) {
                    acau.this.a.a();
                }
                this.a = true;
            } else if (acau.this.a != null) {
                acau.this.a.b();
            }
        }
    }

    public acau(ajwy<adnj> ajwy, adhl adhl, adhi adhi, ajwy<adhq> ajwy2, adkt adkt) {
        this(adfa.a, ajwy, adhl, adhi, ajwy2, adkt);
    }

    public acau(ide ide, ajwy<adnj> ajwy, adhl adhl, adhi adhi, ajwy<adhq> ajwy2, adkt adkt) {
        this.b = new AtomicReference(b.INVALID);
        this.d = new CountDownLatch(0);
        this.r = new 1();
        this.l = ajwy;
        this.n = adhl;
        this.o = ajwy2;
        this.m = adhi;
        String str = "ScImagePlayer";
        this.p = new HandlerThread(str, -2);
        this.p.start();
        this.q = new a(this.p.getLooper());
        if (adkt == null) {
            adkt = new adkv();
        }
        this.e = adkt;
        this.f = new adkx(ide, str, adhl, new ihl());
    }

    /* JADX WARNING: Missing block: B:9:0x0016, code skipped:
            return;
     */
    private synchronized void d(boolean r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x0055 }
        r0 = r0.get();	 Catch:{ all -> 0x0055 }
        r0 = (defpackage.acau.b) r0;	 Catch:{ all -> 0x0055 }
        r1 = defpackage.acau.b.INITIALIZED;	 Catch:{ all -> 0x0055 }
        if (r0 == r1) goto L_0x0011;
    L_0x000d:
        r1 = defpackage.acau.b.START;	 Catch:{ all -> 0x0055 }
        if (r0 != r1) goto L_0x0015;
    L_0x0011:
        r1 = r2.c;	 Catch:{ all -> 0x0055 }
        if (r1 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r2);
        return;
    L_0x0017:
        r1 = defpackage.acau.b.INITIALIZED;	 Catch:{ all -> 0x0055 }
        if (r0 != r1) goto L_0x003d;
    L_0x001b:
        r3 = r2.e;	 Catch:{ adjz -> 0x0033 }
        r0 = r2.f;	 Catch:{ adjz -> 0x0033 }
        r1 = defpackage.adks.RELEASE_BEGIN;	 Catch:{ adjz -> 0x0033 }
        r3.a(r0, r1);	 Catch:{ adjz -> 0x0033 }
        r3 = r2.c;	 Catch:{ adjz -> 0x0033 }
        r3.b();	 Catch:{ adjz -> 0x0033 }
        r3 = r2.e;	 Catch:{ adjz -> 0x0033 }
        r0 = r2.f;	 Catch:{ adjz -> 0x0033 }
        r1 = defpackage.adks.RELEASE_FINISH;	 Catch:{ adjz -> 0x0033 }
        r3.a(r0, r1);	 Catch:{ adjz -> 0x0033 }
        goto L_0x004c;
    L_0x0033:
        r3 = move-exception;
        r0 = new adkk$a$a$a;	 Catch:{ all -> 0x0055 }
        r0.<init>(r3);	 Catch:{ all -> 0x0055 }
        r2.a(r0);	 Catch:{ all -> 0x0055 }
        goto L_0x004c;
    L_0x003d:
        r0 = r2.c;	 Catch:{ all -> 0x0055 }
        r0.o = r3;	 Catch:{ all -> 0x0055 }
        r3 = r0.b;	 Catch:{ all -> 0x0055 }
        r1 = 0;
        r3.getAndSet(r1);	 Catch:{ all -> 0x0055 }
        r3 = r0.a;	 Catch:{ all -> 0x0055 }
        r3.c();	 Catch:{ all -> 0x0055 }
    L_0x004c:
        r3 = r2.b;	 Catch:{ all -> 0x0055 }
        r0 = defpackage.acau.b.STOP;	 Catch:{ all -> 0x0055 }
        r3.set(r0);	 Catch:{ all -> 0x0055 }
        monitor-exit(r2);
        return;
    L_0x0055:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acau.d(boolean):void");
    }

    private synchronized adkm f() {
        b bVar = (b) this.b.get();
        if (this.g != null) {
            if (this.h != null) {
                this.j = this.j != null ? this.j : new adie();
                this.i = this.i != null ? this.i : new adii();
            }
        }
        String str = "The ScImagePlayer cannot setup, sourceIsReady=%b, surfaceIsReady=%b, playerState=%s";
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.g != null);
        if (this.h != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = bVar;
        throw new adkd(String.format(str, objArr));
        return new adkm(new adgs(this.g, 1, this.j, this.i), this.h, (adnj) this.l.get(), this.n, this.m, this.o, this.r, this.k);
    }

    private synchronized void g() {
        if (this.b.get() == b.START) {
            d(false);
        }
        this.p.quit();
        this.g = null;
        this.h = null;
        this.c = null;
        this.a = null;
    }

    public final synchronized void a(int i, int i2) {
        if (this.c != null) {
            adkm adkm = this.c;
            adkm.p = i;
            adkm.q = i2;
            adkm.c.a();
        }
    }

    public final synchronized void a(long j) {
        if (this.c != null) {
            adkm adkm = this.c;
            adkm.j = System.currentTimeMillis() - j;
            adkm.c.a();
        }
    }

    public final synchronized void a(adie adie) {
        this.j = adie;
    }

    public final synchronized void a(adiv adiv) {
        this.i = adiv;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|(2:6|7)|8|9|10|(1:12)|13) */
    public final synchronized void a(defpackage.adkk.a.a r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.c;	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0016;
    L_0x0005:
        r0 = r3 instanceof defpackage.adkk.a.a.a;	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x0016;
    L_0x0009:
        r0 = r2.c;	 Catch:{ adjz -> 0x0016 }
        r0.b();	 Catch:{ adjz -> 0x0016 }
        r0 = r2.b;	 Catch:{ adjz -> 0x0016 }
        r1 = defpackage.acau.b.RELEASED;	 Catch:{ adjz -> 0x0016 }
        r0.set(r1);	 Catch:{ adjz -> 0x0016 }
        goto L_0x001d;
    L_0x0016:
        r0 = r2.b;	 Catch:{ all -> 0x002f }
        r1 = defpackage.acau.b.INVALID;	 Catch:{ all -> 0x002f }
        r0.set(r1);	 Catch:{ all -> 0x002f }
    L_0x001d:
        r0 = r2.e;	 Catch:{ all -> 0x002f }
        r1 = r2.f;	 Catch:{ all -> 0x002f }
        r0.a(r1, r3);	 Catch:{ all -> 0x002f }
        r0 = r2.a;	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r2.a;	 Catch:{ all -> 0x002f }
        r0.a(r3);	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r2);
        return;
    L_0x002f:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acau.a(adkk$a$a):void");
    }

    public final synchronized void a(b bVar) {
        this.a = bVar;
    }

    public final synchronized void a(Bitmap bitmap) {
        this.g = bitmap;
    }

    public final synchronized void a(Surface surface) {
        this.h = surface;
    }

    public final synchronized void a(boolean z) {
        this.k = z;
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
    public final synchronized boolean a() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.h;	 Catch:{ all -> 0x000a }
        if (r0 == 0) goto L_0x0008;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acau.a():boolean");
    }

    public final synchronized void b() {
        this.q.obtainMessage(0).sendToTarget();
    }

    public final synchronized void b(boolean z) {
        d(z);
    }

    public final synchronized void c() {
        this.q.obtainMessage(1).sendToTarget();
    }

    public final void c(boolean z) {
        g();
        if (z) {
            try {
                this.d.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0019, code skipped:
            return 0;
     */
    public final synchronized long d() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x001a }
        r1 = 0;
        if (r0 == 0) goto L_0x0018;
    L_0x0007:
        r0 = r6.c;	 Catch:{ all -> 0x001a }
        r3 = r0.j;	 Catch:{ all -> 0x001a }
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r5 == 0) goto L_0x0018;
    L_0x000f:
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x001a }
        r3 = r0.j;	 Catch:{ all -> 0x001a }
        r1 = r1 - r3;
        monitor-exit(r6);
        return r1;
    L_0x0018:
        monitor-exit(r6);
        return r1;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acau.d():long");
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void e() {
        try {
            if (((b) this.b.get()) == b.INVALID) {
                this.e.a(this.f, adks.SETUP_BEGIN);
                this.c = f();
                adkm adkm = this.c;
                Preconditions.checkState(adkm.k == null);
                Preconditions.checkState(adkm.l == null);
                adkm.c.a = adkm;
                adkm.k = new adhh(adkm.g, adkm.h);
                adkm.i.get();
                adkm.l = adhq.a(adkm.e, adkm.k);
                adkm.l.c();
                adiv adiv = adkm.d.d;
                adiv.a(adkm.d.c, new adie(), adkm.d.a.getWidth(), adkm.d.a.getHeight(), adic.TEXTURE_2D, adkm.c, adkm.f);
                adkm.m = adiv;
                adkm.n = new adib().a(adkm.d.a, true);
                adkm.n.a(0);
                this.b.set(b.INITIALIZED);
                this.e.a(this.f, adks.SETUP_FINISH);
            }
        } catch (Exception e) {
            throw new adkd(e);
        } catch (adjz e2) {
            a(new c(e2));
        }
    }
}
