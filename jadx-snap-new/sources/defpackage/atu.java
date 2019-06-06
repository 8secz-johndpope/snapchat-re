package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: atu */
public class atu extends AbstractExecutorService {
    static final Class<?> a = atu.class;
    final String b;
    final BlockingQueue<Runnable> c;
    final AtomicInteger d;
    private final Executor e;
    private volatile int f = 1;
    private final a g;
    private final AtomicInteger h;

    /* renamed from: atu$a */
    class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(atu atu, byte b) {
            this();
        }

        /* JADX WARNING: Missing block: B:9:0x0034, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:11:0x0042, code skipped:
            return;
     */
        public final void run() {
            /*
            r5 = this;
            r0 = "%s: worker finished; %d workers left";
            r1 = defpackage.atu.this;	 Catch:{ all -> 0x0043 }
            r1 = r1.c;	 Catch:{ all -> 0x0043 }
            r1 = r1.poll();	 Catch:{ all -> 0x0043 }
            r1 = (java.lang.Runnable) r1;	 Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0012;
        L_0x000e:
            r1.run();	 Catch:{ all -> 0x0043 }
            goto L_0x001d;
        L_0x0012:
            r1 = defpackage.atu.a;	 Catch:{ all -> 0x0043 }
            r2 = "%s: Worker has nothing to run";
            r3 = defpackage.atu.this;	 Catch:{ all -> 0x0043 }
            r3 = r3.b;	 Catch:{ all -> 0x0043 }
            defpackage.auk.a(r1, r2, r3);	 Catch:{ all -> 0x0043 }
        L_0x001d:
            r1 = defpackage.atu.this;
            r1 = r1.d;
            r1 = r1.decrementAndGet();
            r2 = defpackage.atu.this;
            r2 = r2.c;
            r2 = r2.isEmpty();
            if (r2 != 0) goto L_0x0035;
        L_0x002f:
            r0 = defpackage.atu.this;
            r0.a();
            return;
        L_0x0035:
            r2 = defpackage.atu.a;
            r3 = defpackage.atu.this;
            r3 = r3.b;
            r1 = java.lang.Integer.valueOf(r1);
            defpackage.auk.a(r2, r0, r3, r1);
            return;
        L_0x0043:
            r1 = move-exception;
            r2 = defpackage.atu.this;
            r2 = r2.d;
            r2 = r2.decrementAndGet();
            r3 = defpackage.atu.this;
            r3 = r3.c;
            r3 = r3.isEmpty();
            if (r3 != 0) goto L_0x005c;
        L_0x0056:
            r0 = defpackage.atu.this;
            r0.a();
            goto L_0x0069;
        L_0x005c:
            r3 = defpackage.atu.a;
            r4 = defpackage.atu.this;
            r4 = r4.b;
            r2 = java.lang.Integer.valueOf(r2);
            defpackage.auk.a(r3, r0, r4, r2);
        L_0x0069:
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.atu$a.run():void");
        }
    }

    public atu(String str, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        this.b = str;
        this.e = executor;
        this.c = blockingQueue;
        this.g = new a(this, (byte) 0);
        this.d = new AtomicInteger(0);
        this.h = new AtomicInteger(0);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        while (true) {
            int i = this.d.get();
            if (i < this.f) {
                int i2 = i + 1;
                if (this.d.compareAndSet(i, i2)) {
                    auk.a(a, "%s: starting worker %d of %d", this.b, Integer.valueOf(i2), Integer.valueOf(this.f));
                    this.e.execute(this.g);
                    return;
                }
                auk.a(a, "%s: race in startWorkerIfNeeded; retrying", this.b);
            } else {
                return;
            }
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.c.offer(runnable)) {
            int size = this.c.size();
            int i = this.h.get();
            if (size > i && this.h.compareAndSet(i, size)) {
                auk.a(a, "%s: max pending work in queue = %d", this.b, Integer.valueOf(size));
            }
            a();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append(" queue is full, size=");
            stringBuilder.append(this.c.size());
            throw new RejectedExecutionException(stringBuilder.toString());
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
