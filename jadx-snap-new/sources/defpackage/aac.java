package defpackage;

import android.os.Process;
import defpackage.aar.a;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: aac */
final class aac {
    final ReferenceQueue<aar<?>> a;
    a b;
    volatile boolean c;
    volatile a d;
    private final boolean e;
    private final Executor f;
    private Map<zd, b> g;

    /* renamed from: aac$1 */
    class 1 implements ThreadFactory {
        1() {
        }

        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }, "glide-active-resources");
        }
    }

    /* renamed from: aac$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            aac aac = aac.this;
            while (true) {
                boolean z = aac.c;
                try {
                    aac.a((b) aac.a.remove());
                    a aVar = aac.d;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: aac$a */
    interface a {
    }

    /* renamed from: aac$b */
    static final class b extends WeakReference<aar<?>> {
        final zd a;
        final boolean b;
        aax<?> c;

        b(zd zdVar, aar<?> aar, ReferenceQueue<? super aar<?>> referenceQueue, boolean z) {
            super(aar, referenceQueue);
            String str = "Argument must not be null";
            this.a = (zd) ahl.a((Object) zdVar, str);
            aax aax = (aar.a && z) ? (aax) ahl.a(aar.b, str) : null;
            this.c = aax;
            this.b = aar.a;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            this.c = null;
            clear();
        }
    }

    aac(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new 1()));
    }

    private aac(boolean z, Executor executor) {
        this.g = new HashMap();
        this.a = new ReferenceQueue();
        this.e = z;
        this.f = executor;
        executor.execute(new 2());
    }

    /* Access modifiers changed, original: final */
    public final void a(b bVar) {
        synchronized (this.b) {
            synchronized (this) {
                this.g.remove(bVar.a);
                if (bVar.b) {
                    if (bVar.c != null) {
                        aar aar = new aar(bVar.c, true, false);
                        aar.a(bVar.a, this.b);
                        this.b.a(bVar.a, aar);
                        return;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(zd zdVar) {
        b bVar = (b) this.g.remove(zdVar);
        if (bVar != null) {
            bVar.a();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(zd zdVar, aar<?> aar) {
        b bVar = (b) this.g.put(zdVar, new b(zdVar, aar, this.a, this.e));
        if (bVar != null) {
            bVar.a();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:12:0x001a, code skipped:
            return r0;
     */
    public final synchronized defpackage.aar<?> b(defpackage.zd r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.g;	 Catch:{ all -> 0x001b }
        r2 = r0.get(r2);	 Catch:{ all -> 0x001b }
        r2 = (defpackage.aac.b) r2;	 Catch:{ all -> 0x001b }
        if (r2 != 0) goto L_0x000e;
    L_0x000b:
        r2 = 0;
        monitor-exit(r1);
        return r2;
    L_0x000e:
        r0 = r2.get();	 Catch:{ all -> 0x001b }
        r0 = (defpackage.aar) r0;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x0019;
    L_0x0016:
        r1.a(r2);	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r1);
        return r0;
    L_0x001b:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aac.b(zd):aar");
    }
}
