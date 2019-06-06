package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ajih */
public final class ajih extends ajcx {
    final long a;
    final TimeUnit b;
    final ajdb c;
    private ajdb d;
    private ajdw e;

    /* renamed from: ajih$b */
    static final class b implements ajcz {
        private final ajei a;
        private final AtomicBoolean b;
        private final ajcz c;

        b(ajei ajei, AtomicBoolean atomicBoolean, ajcz ajcz) {
            this.a = ajei;
            this.b = atomicBoolean;
            this.c = ajcz;
        }

        public final void a() {
            if (this.b.compareAndSet(false, true)) {
                this.a.dispose();
                this.c.a();
            }
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                this.a.dispose();
                this.c.a(th);
                return;
            }
            ajvo.a(th);
        }
    }

    /* renamed from: ajih$a */
    final class a implements Runnable {
        final ajei a;
        final ajcz b;
        private final AtomicBoolean c;

        /* renamed from: ajih$a$a */
        final class a implements ajcz {
            a() {
            }

            public final void a() {
                a.this.a.dispose();
                a.this.b.a();
            }

            public final void a(ajej ajej) {
                a.this.a.a(ajej);
            }

            public final void a(Throwable th) {
                a.this.a.dispose();
                a.this.b.a(th);
            }
        }

        a(AtomicBoolean atomicBoolean, ajei ajei, ajcz ajcz) {
            this.c = atomicBoolean;
            this.a = ajei;
            this.b = ajcz;
        }

        public final void run() {
            if (this.c.compareAndSet(false, true)) {
                this.a.a();
                if (ajih.this.c == null) {
                    this.b.a(new TimeoutException(ajur.a(ajih.this.a, ajih.this.b)));
                    return;
                }
                ajih.this.c.a(new a());
            }
        }
    }

    public ajih(ajdb ajdb, long j, TimeUnit timeUnit, ajdw ajdw, ajdb ajdb2) {
        this.d = ajdb;
        this.a = j;
        this.b = timeUnit;
        this.e = ajdw;
        this.c = ajdb2;
    }

    public final void b(ajcz ajcz) {
        ajej ajei = new ajei();
        ajcz.a(ajei);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ajei.a(this.e.a(new a(atomicBoolean, ajei, ajcz), this.a, this.b));
        this.d.a(new b(ajei, atomicBoolean, ajcz));
    }
}
