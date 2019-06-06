package defpackage;

import defpackage.ajdw.c;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: ajwi */
public final class ajwi extends ajdw {
    final Queue<b> a = new PriorityBlockingQueue(11);
    long b;
    volatile long d;

    /* renamed from: ajwi$b */
    static final class b implements Comparable<b> {
        private long a;
        private Runnable b;
        private a c;
        private long d;

        b(a aVar, long j, Runnable runnable, long j2) {
            this.a = j;
            this.b = runnable;
            this.c = aVar;
            this.d = j2;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            long j = this.a;
            long j2 = bVar.a;
            return j == j2 ? ajfv.a(this.d, bVar.d) : ajfv.a(j, j2);
        }

        public final String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", new Object[]{Long.valueOf(this.a), this.b.toString()});
        }
    }

    /* renamed from: ajwi$a */
    final class a extends c {
        private volatile boolean b;

        /* renamed from: ajwi$a$a */
        final class a implements Runnable {
            private b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                ajwi.this.a.remove(this.a);
            }
        }

        a() {
        }

        public final long a(TimeUnit timeUnit) {
            return ajwi.this.a(timeUnit);
        }

        public final ajej a(Runnable runnable) {
            if (this.b) {
                return ajfq.INSTANCE;
            }
            ajwi ajwi = ajwi.this;
            long j = ajwi.b;
            ajwi.b = 1 + j;
            b bVar = new b(this, 0, runnable, j);
            ajwi.this.a.add(bVar);
            return ajek.a(new a(bVar));
        }

        public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.b) {
                return ajfq.INSTANCE;
            }
            long toNanos = ajwi.this.d + timeUnit.toNanos(j);
            ajwi ajwi = ajwi.this;
            long j2 = ajwi.b;
            ajwi.b = 1 + j2;
            b bVar = new b(this, toNanos, runnable, j2);
            ajwi.this.a.add(bVar);
            return ajek.a(new a(bVar));
        }

        public final void dispose() {
            this.b = true;
        }

        public final boolean isDisposed() {
            return this.b;
        }
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.NANOSECONDS);
    }

    public final c b() {
        return new a();
    }
}
