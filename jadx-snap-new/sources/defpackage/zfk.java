package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zfk */
public final class zfk extends zfh {
    final Queue<Runnable> d = new ConcurrentLinkedQueue();
    final a e = new a();

    /* renamed from: zfk$a */
    class a extends zfu {
        private final AtomicReference<Runnable> b = new AtomicReference();
        private final AtomicBoolean c = new AtomicBoolean(false);

        a() {
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        /* JADX WARNING: Missing block: B:16:0x003f, code skipped:
            return;
     */
        public final synchronized void a() {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.c;	 Catch:{ all -> 0x0040 }
            r1 = 1;
            r0 = r0.getAndSet(r1);	 Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003e;
        L_0x000a:
            r0 = defpackage.zfk.this;	 Catch:{ all -> 0x0040 }
            r0 = r0.d;	 Catch:{ all -> 0x0040 }
            r0 = r0.poll();	 Catch:{ all -> 0x0040 }
            r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0038;
        L_0x0016:
            r1 = defpackage.zfv.a(r0);	 Catch:{ all -> 0x0040 }
            r3.a = r1;	 Catch:{ all -> 0x0040 }
            r1 = r3.b;	 Catch:{ all -> 0x0040 }
            r2 = 0;
            r0 = r1.compareAndSet(r2, r0);	 Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0030;
        L_0x0025:
            r0 = defpackage.zfk.this;	 Catch:{ all -> 0x0040 }
            r1 = defpackage.zfk.this;	 Catch:{ all -> 0x0040 }
            r1 = r1.e;	 Catch:{ all -> 0x0040 }
            super.execute(r1);	 Catch:{ all -> 0x0040 }
            monitor-exit(r3);
            return;
        L_0x0030:
            r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0040 }
            r1 = "Attempted to set a new task while a task was already there.";
            r0.<init>(r1);	 Catch:{ all -> 0x0040 }
            throw r0;	 Catch:{ all -> 0x0040 }
        L_0x0038:
            r0 = r3.c;	 Catch:{ all -> 0x0040 }
            r1 = 0;
            r0.set(r1);	 Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r3);
            return;
        L_0x0040:
            r0 = move-exception;
            monitor-exit(r3);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zfk$a.a():void");
        }

        public final void run() {
            ((Runnable) this.b.getAndSet(null)).run();
            this.c.set(false);
            a();
        }
    }

    public zfk(idd idd, ScheduledExecutorService scheduledExecutorService, AtomicReference<aipn<zfq>> atomicReference) {
        super(idd, scheduledExecutorService, atomicReference);
    }

    public final void execute(Runnable runnable) {
        this.d.offer(runnable);
        this.e.a();
    }
}
