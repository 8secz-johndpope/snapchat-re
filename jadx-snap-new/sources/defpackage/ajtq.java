package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajtq */
public final class ajtq extends ajdw {
    public static final ajtq a = new ajtq();

    /* renamed from: ajtq$a */
    static final class a implements Runnable {
        private final Runnable a;
        private final c b;
        private final long c;

        a(Runnable runnable, c cVar, long j) {
            this.a = runnable;
            this.b = cVar;
            this.c = j;
        }

        public final void run() {
            if (!this.b.b) {
                long a = this.b.a(TimeUnit.MILLISECONDS);
                long j = this.c;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        ajvo.a(e);
                        return;
                    }
                }
                if (!this.b.b) {
                    this.a.run();
                }
            }
        }
    }

    /* renamed from: ajtq$b */
    static final class b implements Comparable<b> {
        final Runnable a;
        volatile boolean b;
        private long c;
        private int d;

        b(Runnable runnable, Long l, int i) {
            this.a = runnable;
            this.c = l.longValue();
            this.d = i;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            int a = ajfv.a(this.c, bVar.c);
            if (a != 0) {
                return a;
            }
            a = this.d;
            int i = bVar.d;
            return a < i ? -1 : a > i ? 1 : 0;
        }
    }

    /* renamed from: ajtq$c */
    static final class c extends defpackage.ajdw.c implements ajej {
        final PriorityBlockingQueue<b> a = new PriorityBlockingQueue();
        volatile boolean b;
        private final AtomicInteger c = new AtomicInteger();
        private AtomicInteger d = new AtomicInteger();

        /* renamed from: ajtq$c$a */
        final class a implements Runnable {
            private b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                this.a.b = true;
                c.this.a.remove(this.a);
            }
        }

        c() {
        }

        private ajej a(Runnable runnable, long j) {
            if (this.b) {
                return ajfq.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.d.incrementAndGet());
            this.a.add(bVar);
            if (this.c.getAndIncrement() != 0) {
                return ajek.a(new a(bVar));
            }
            int i = 1;
            while (!this.b) {
                b bVar2 = (b) this.a.poll();
                if (bVar2 == null) {
                    i = this.c.addAndGet(-i);
                    if (i == 0) {
                        return ajfq.INSTANCE;
                    }
                } else if (!bVar2.b) {
                    bVar2.a.run();
                }
            }
            this.a.clear();
            return ajfq.INSTANCE;
        }

        public final ajej a(Runnable runnable) {
            return a(runnable, a(TimeUnit.MILLISECONDS));
        }

        public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return a(new a(runnable, this, a), a);
        }

        public final void dispose() {
            this.b = true;
        }

        public final boolean isDisposed() {
            return this.b;
        }
    }

    ajtq() {
    }

    public final ajej a(Runnable runnable) {
        ajvo.a(runnable).run();
        return ajfq.INSTANCE;
    }

    public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            ajvo.a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ajvo.a(e);
        }
        return ajfq.INSTANCE;
    }

    public final c b() {
        return new c();
    }
}
