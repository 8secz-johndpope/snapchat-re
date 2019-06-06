package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aixx */
public final class aixx {
    private static final c k = new c();
    final ScheduledExecutorService a;
    final d b;
    final b c;
    int d;
    long e;
    ScheduledFuture<?> f;
    ScheduledFuture<?> g;
    final Runnable h;
    final Runnable i;
    long j;
    private final boolean l;
    private long m;

    /* renamed from: aixx$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            Object obj;
            synchronized (aixx.this) {
                if (aixx.this.d != 6) {
                    aixx.this.d = 6;
                    obj = 1;
                } else {
                    obj = null;
                }
            }
            if (obj != null) {
                aixx.this.c.b();
            }
        }
    }

    /* renamed from: aixx$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            Object obj;
            aixx aixx = aixx.this;
            aixx.g = null;
            synchronized (aixx) {
                if (aixx.this.d == 2) {
                    obj = 1;
                    aixx.this.d = 4;
                    aixx.this.f = aixx.this.a.schedule(aixx.this.h, aixx.this.j, TimeUnit.NANOSECONDS);
                } else {
                    if (aixx.this.d == 3) {
                        aixx.this.g = aixx.this.a.schedule(aixx.this.i, aixx.this.e - aixx.this.b.a(), TimeUnit.NANOSECONDS);
                        aixx.this.d = 2;
                    }
                    obj = null;
                }
            }
            if (obj != null) {
                aixx.this.c.a();
            }
        }
    }

    /* renamed from: aixx$b */
    public interface b {
        void a();

        void b();
    }

    /* renamed from: aixx$d */
    static abstract class d {
        d() {
        }

        public abstract long a();
    }

    /* renamed from: aixx$a */
    public static final class a implements b {
        final aiwx a;

        /* renamed from: aixx$a$1 */
        class 1 implements defpackage.aiwu.a {
            1() {
            }

            public final void a() {
                a.this.a.b(aivw.j.a("Keepalive failed. The connection is likely gone"));
            }
        }

        public a(aiwx aiwx) {
            this.a = aiwx;
        }

        public final void a() {
            this.a.a(new 1(), MoreExecutors.directExecutor());
        }

        public final void b() {
            this.a.b(aivw.j.a("Keepalive failed. The connection is likely gone"));
        }
    }

    /* renamed from: aixx$c */
    static class c extends d {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final long a() {
            return System.nanoTime();
        }
    }

    static {
        TimeUnit.SECONDS.toNanos(10);
        TimeUnit.MILLISECONDS.toNanos(10);
    }

    public aixx(b bVar, ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this(bVar, scheduledExecutorService, k, j, j2, z);
    }

    private aixx(b bVar, ScheduledExecutorService scheduledExecutorService, d dVar, long j, long j2, boolean z) {
        this.d = 1;
        this.h = new aixy(new 1());
        this.i = new aixy(new 2());
        this.c = (b) Preconditions.checkNotNull(bVar, "keepAlivePinger");
        this.a = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService, "scheduler");
        this.b = (d) Preconditions.checkNotNull(dVar, "ticker");
        this.m = j;
        this.j = j2;
        this.l = z;
        this.e = dVar.a() + j;
    }

    public final synchronized void a() {
        if (this.l) {
            c();
        }
    }

    /* JADX WARNING: Missing block: B:26:0x004e, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.b;	 Catch:{ all -> 0x004f }
        r0 = r0.a();	 Catch:{ all -> 0x004f }
        r2 = r5.m;	 Catch:{ all -> 0x004f }
        r0 = r0 + r2;
        r5.e = r0;	 Catch:{ all -> 0x004f }
        r0 = r5.d;	 Catch:{ all -> 0x004f }
        r1 = 2;
        if (r0 != r1) goto L_0x0016;
    L_0x0011:
        r0 = 3;
        r5.d = r0;	 Catch:{ all -> 0x004f }
        monitor-exit(r5);
        return;
    L_0x0016:
        r0 = r5.d;	 Catch:{ all -> 0x004f }
        r2 = 4;
        r3 = 5;
        if (r0 == r2) goto L_0x0020;
    L_0x001c:
        r0 = r5.d;	 Catch:{ all -> 0x004f }
        if (r0 != r3) goto L_0x004d;
    L_0x0020:
        r0 = r5.f;	 Catch:{ all -> 0x004f }
        r2 = 0;
        if (r0 == 0) goto L_0x002a;
    L_0x0025:
        r0 = r5.f;	 Catch:{ all -> 0x004f }
        r0.cancel(r2);	 Catch:{ all -> 0x004f }
    L_0x002a:
        r0 = r5.d;	 Catch:{ all -> 0x004f }
        r4 = 1;
        if (r0 != r3) goto L_0x0033;
    L_0x002f:
        r5.d = r4;	 Catch:{ all -> 0x004f }
        monitor-exit(r5);
        return;
    L_0x0033:
        r5.d = r1;	 Catch:{ all -> 0x004f }
        r0 = r5.g;	 Catch:{ all -> 0x004f }
        if (r0 != 0) goto L_0x003a;
    L_0x0039:
        r2 = 1;
    L_0x003a:
        r0 = "There should be no outstanding pingFuture";
        com.google.common.base.Preconditions.checkState(r2, r0);	 Catch:{ all -> 0x004f }
        r0 = r5.a;	 Catch:{ all -> 0x004f }
        r1 = r5.i;	 Catch:{ all -> 0x004f }
        r2 = r5.m;	 Catch:{ all -> 0x004f }
        r4 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x004f }
        r0 = r0.schedule(r1, r2, r4);	 Catch:{ all -> 0x004f }
        r5.g = r0;	 Catch:{ all -> 0x004f }
    L_0x004d:
        monitor-exit(r5);
        return;
    L_0x004f:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixx.b():void");
    }

    /* JADX WARNING: Missing block: B:14:0x002d, code skipped:
            return;
     */
    public final synchronized void c() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.d;	 Catch:{ all -> 0x002e }
        r1 = 1;
        if (r0 != r1) goto L_0x0024;
    L_0x0006:
        r0 = 2;
        r6.d = r0;	 Catch:{ all -> 0x002e }
        r0 = r6.g;	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x002c;
    L_0x000d:
        r0 = r6.a;	 Catch:{ all -> 0x002e }
        r1 = r6.i;	 Catch:{ all -> 0x002e }
        r2 = r6.e;	 Catch:{ all -> 0x002e }
        r4 = r6.b;	 Catch:{ all -> 0x002e }
        r4 = r4.a();	 Catch:{ all -> 0x002e }
        r2 = r2 - r4;
        r4 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x002e }
        r0 = r0.schedule(r1, r2, r4);	 Catch:{ all -> 0x002e }
        r6.g = r0;	 Catch:{ all -> 0x002e }
        monitor-exit(r6);
        return;
    L_0x0024:
        r0 = r6.d;	 Catch:{ all -> 0x002e }
        r1 = 5;
        if (r0 != r1) goto L_0x002c;
    L_0x0029:
        r0 = 4;
        r6.d = r0;	 Catch:{ all -> 0x002e }
    L_0x002c:
        monitor-exit(r6);
        return;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixx.c():void");
    }

    /* JADX WARNING: Missing block: B:16:0x001d, code skipped:
            return;
     */
    public final synchronized void d() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.l;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);
        return;
    L_0x0007:
        r0 = r2.d;	 Catch:{ all -> 0x001e }
        r1 = 2;
        if (r0 == r1) goto L_0x0011;
    L_0x000c:
        r0 = r2.d;	 Catch:{ all -> 0x001e }
        r1 = 3;
        if (r0 != r1) goto L_0x0014;
    L_0x0011:
        r0 = 1;
        r2.d = r0;	 Catch:{ all -> 0x001e }
    L_0x0014:
        r0 = r2.d;	 Catch:{ all -> 0x001e }
        r1 = 4;
        if (r0 != r1) goto L_0x001c;
    L_0x0019:
        r0 = 5;
        r2.d = r0;	 Catch:{ all -> 0x001e }
    L_0x001c:
        monitor-exit(r2);
        return;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixx.d():void");
    }

    public final synchronized void e() {
        if (this.d != 6) {
            this.d = 6;
            if (this.f != null) {
                this.f.cancel(false);
            }
            if (this.g != null) {
                this.g.cancel(false);
                this.g = null;
            }
        }
    }
}
