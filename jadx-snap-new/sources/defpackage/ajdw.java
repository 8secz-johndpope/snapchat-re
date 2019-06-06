package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajdw */
// io.reactivex.Scheduler
public abstract class ajdw {
	static final long c = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue()); // CLOCK_DRIFT_TOLERANCE_NANOSECONDS

    /* renamed from: ajdw$c */
    public static abstract class c implements ajej {

        /* renamed from: ajdw$c$a */
        final class a implements Runnable {
            private Runnable a;
            private ajft b;
            private long c;
            private long d;
            private long e;
            private long f;

            a(long j, Runnable runnable, long j2, ajft ajft, long j3) {
                this.a = runnable;
                this.b = ajft;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            public final void run() {
                this.a.run();
                if (!this.b.isDisposed()) {
                    long a = c.this.a(TimeUnit.NANOSECONDS);
                    long j = ajdw.c + a;
                    long j2 = this.e;
                    if (j < j2 || a >= (j2 + this.c) + ajdw.c) {
                        j = this.c;
                        j2 = a + j;
                        long j3 = this.d + 1;
                        this.d = j3;
                        this.f = j2 - (j * j3);
                        j = j2;
                    } else {
                        j = this.f;
                        j2 = this.d + 1;
                        this.d = j2;
                        j += j2 * this.c;
                    }
                    this.e = a;
                    ajfp.c(this.b, c.this.a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public ajej a(Runnable runnable) {
            return a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public final ajej a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            AtomicReference ajft = new ajft();
            ajft ajft2 = new ajft(ajft);
            Runnable a = ajvo.a(runnable);
            long toNanos = timeUnit2.toNanos(j2);
            long a2 = a(TimeUnit.NANOSECONDS);
            AtomicReference atomicReference = ajft;
            a aVar = r0;
            a aVar2 = new a(a2 + timeUnit2.toNanos(j3), a, a2, ajft2, toNanos);
            ajej a3 = a(aVar, j3, timeUnit2);
            if (a3 == ajfq.INSTANCE) {
                return a3;
            }
            ajfp.c(atomicReference, a3);
            return ajft2;
        }

        public abstract ajej a(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* renamed from: ajdw$a */
    static final class a implements ajej, Runnable {
        private Runnable a;
        private c b;
        private Thread c;

        a(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        public final void dispose() {
            if (this.c == Thread.currentThread()) {
                c cVar = this.b;
                if (cVar instanceof ajtj) {
                    ajtj ajtj = (ajtj) cVar;
                    if (!ajtj.c) {
                        ajtj.c = true;
                        ajtj.b.shutdown();
                    }
                    return;
                }
            }
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void run() {
            this.c = Thread.currentThread();
            try {
                this.a.run();
            } finally {
                dispose();
                this.c = null;
            }
        }
    }

    /* renamed from: ajdw$b */
    static final class b implements ajej, Runnable {
        private Runnable a;
        private c b;
        private volatile boolean c;

        b(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        public final void dispose() {
            this.c = true;
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.c;
        }

        public final void run() {
            if (!this.c) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    ajep.a(th);
                    this.b.dispose();
                    RuntimeException a = ajur.a(th);
                }
            }
        }
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public ajej a(Runnable runnable) {
        return a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public ajej a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c b = b();
        b bVar = new b(ajvo.a(runnable), b);
        ajej a = b.a(bVar, j, j2, timeUnit);
        return a == ajfq.INSTANCE ? a : bVar;
    }

    public ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
        c b = b();
        a aVar = new a(ajvo.a(runnable), b);
        b.a(aVar, j, timeUnit);
        return aVar;
    }

    public abstract c b();

    public void c() {
    }
}
