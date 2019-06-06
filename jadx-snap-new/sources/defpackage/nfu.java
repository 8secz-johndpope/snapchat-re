package defpackage;

import android.os.SystemClock;
import defpackage.nbr.a;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nfu */
public final class nfu implements nbr {
    static final AtomicReference<nfu> a = new AtomicReference();
    private final nce b;
    private final String c;
    private a d;
    private long e;
    private boolean f;
    private abqr g;
    private final abqr.a h = new 1();

    /* renamed from: nfu$1 */
    class 1 implements abqr.a {
        1() {
        }

        public final void a() {
            nfu.a(nfu.this);
        }

        public final void a(long j, float f) {
        }
    }

    /* renamed from: nfu$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            nfu.a(nfu.this);
        }
    }

    public nfu(nce nce, UUID uuid) {
        this.b = nce;
        this.c = uuid.toString();
        g();
    }

    public nfu(nce nce, UUID uuid, long j, a aVar, boolean z) {
        this.b = nce;
        this.d = aVar;
        this.c = uuid.toString();
        g();
        b(j, z);
    }

    public nfu(nce nce, UUID uuid, a aVar) {
        this.b = nce;
        this.c = uuid.toString();
        this.d = aVar;
        g();
    }

    /* JADX WARNING: Missing block: B:11:0x001b, code skipped:
            return;
     */
    private synchronized void b(long r4, boolean r6) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);
        return;
    L_0x0007:
        r0 = r3.b;	 Catch:{ all -> 0x001c }
        r0.b(r4);	 Catch:{ all -> 0x001c }
        r0 = r3.b;	 Catch:{ all -> 0x001c }
        r0.G();	 Catch:{ all -> 0x001c }
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x001a;
    L_0x0017:
        r3.a(r4, r6);	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r3);
        return;
    L_0x001c:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfu.b(long, boolean):void");
    }

    private synchronized void g() {
        nfu nfu = (nfu) a.getAndSet(this);
        if (nfu != null) {
            nfu.f();
        }
    }

    public final synchronized long a() {
        if (this.f) {
            return 0;
        }
        return this.b.p();
    }

    public final synchronized void a(long j, boolean z) {
        if (!this.f) {
            if (this.g != null) {
                this.g.b();
            }
            this.e = SystemClock.elapsedRealtime() + j;
            this.g = new abqr();
            if (z) {
                c();
            } else if (j < 1) {
                abmr.d(new 2());
            } else {
                this.g.a(j, j, 0);
                this.g.a(this.h);
                this.g.a();
            }
        }
    }

    public final synchronized void a(a aVar) {
        this.d = aVar;
    }

    public final synchronized void a(boolean z) {
        if (!this.f) {
            Object obj = (this.g == null || !this.g.a) ? null : 1;
            long p = this.b.p();
            if (obj == null && p > 0) {
                a(p, z);
            }
            this.b.C();
            this.b.G();
        }
    }

    public final synchronized long b() {
        if (this.f) {
            return 0;
        }
        if (this.e == 0) {
            return 0;
        }
        return this.e - SystemClock.elapsedRealtime();
    }

    /* JADX WARNING: Missing block: B:11:0x0011, code skipped:
            return;
     */
    public final synchronized void c() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);
        return;
    L_0x0007:
        r0 = r1.g;	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x0010;
    L_0x000b:
        r0 = r1.g;	 Catch:{ all -> 0x0012 }
        r0.b();	 Catch:{ all -> 0x0012 }
    L_0x0010:
        monitor-exit(r1);
        return;
    L_0x0012:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfu.c():void");
    }

    /* JADX WARNING: Missing block: B:11:0x0017, code skipped:
            return;
     */
    public final synchronized void d() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r4);
        return;
    L_0x0007:
        r0 = r4.g;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r0 = r4.e;	 Catch:{ all -> 0x0018 }
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0018 }
        r0 = r0 - r2;
        r2 = 0;
        r4.a(r0, r2);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r4);
        return;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfu.d():void");
    }

    public final String e() {
        return this.c;
    }

    /* JADX WARNING: Missing block: B:12:0x0025, code skipped:
            return;
     */
    public final synchronized void f() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);
        return;
    L_0x0007:
        r0 = 1;
        r2.f = r0;	 Catch:{ all -> 0x0026 }
        r0 = 0;
        r2.e = r0;	 Catch:{ all -> 0x0026 }
        r0 = r2.b;	 Catch:{ all -> 0x0026 }
        r0.C();	 Catch:{ all -> 0x0026 }
        r0 = r2.b;	 Catch:{ all -> 0x0026 }
        r0.G();	 Catch:{ all -> 0x0026 }
        r0 = r2.g;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0024;
    L_0x001c:
        r0 = r2.g;	 Catch:{ all -> 0x0026 }
        r0.b();	 Catch:{ all -> 0x0026 }
        r0 = 0;
        r2.g = r0;	 Catch:{ all -> 0x0026 }
    L_0x0024:
        monitor-exit(r2);
        return;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfu.f():void");
    }
}
