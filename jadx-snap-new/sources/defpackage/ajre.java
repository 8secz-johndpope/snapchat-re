package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajre */
public final class ajre<T> extends ajnp<T, T> {
    private long b;
    private TimeUnit c;
    private ajdw d;
    private ajdt<? extends T> e;

    /* renamed from: ajre$d */
    interface d {
        void a(long j);
    }

    /* renamed from: ajre$c */
    static final class c<T> extends AtomicLong implements ajdv<T>, ajej, d {
        private ajdv<? super T> a;
        private long b;
        private TimeUnit c;
        private defpackage.ajdw.c d;
        private ajft e = new ajft();
        private AtomicReference<ajej> f = new AtomicReference();

        c(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, defpackage.ajdw.c cVar) {
            this.a = ajdv;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        public final void a() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.a.a();
                this.d.dispose();
            }
        }

        public final void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                ajfp.a(this.f);
                this.a.a(new TimeoutException(ajur.a(this.b, this.c)));
                this.d.dispose();
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this.f, ajej);
        }

        public final void a(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((ajej) this.e.get()).dispose();
                    this.a.a((Object) t);
                    b(j2);
                }
            }
        }

        public final void a(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.a.a(th);
                this.d.dispose();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b(long j) {
            ajfp.c(this.e, this.d.a(new e(j, this), this.b, this.c));
        }

        public final void dispose() {
            ajfp.a(this.f);
            this.d.dispose();
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) this.f.get());
        }
    }

    /* renamed from: ajre$e */
    static final class e implements Runnable {
        private d a;
        private long b;

        e(long j, d dVar) {
            this.b = j;
            this.a = dVar;
        }

        public final void run() {
            this.a.a(this.b);
        }
    }

    /* renamed from: ajre$a */
    static final class a<T> implements ajdv<T> {
        private ajdv<? super T> a;
        private AtomicReference<ajej> b;

        a(ajdv<? super T> ajdv, AtomicReference<ajej> atomicReference) {
            this.a = ajdv;
            this.b = atomicReference;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            ajfp.c(this.b, ajej);
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }
    }

    /* renamed from: ajre$b */
    static final class b<T> extends AtomicReference<ajej> implements ajdv<T>, ajej, d {
        private ajdv<? super T> a;
        private long b;
        private TimeUnit c;
        private c d;
        private ajft e = new ajft();
        private AtomicLong f = new AtomicLong();
        private AtomicReference<ajej> g = new AtomicReference();
        private ajdt<? extends T> h;

        b(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, c cVar, ajdt<? extends T> ajdt) {
            this.a = ajdv;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
            this.h = ajdt;
        }

        public final void a() {
            if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.a.a();
                this.d.dispose();
            }
        }

        public final void a(long j) {
            if (this.f.compareAndSet(j, Long.MAX_VALUE)) {
                ajfp.a(this.g);
                ajdt ajdt = this.h;
                this.h = null;
                ajdt.a(new a(this.a, this));
                this.d.dispose();
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this.g, ajej);
        }

        public final void a(T t) {
            long j = this.f.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f.compareAndSet(j, j2)) {
                    ((ajej) this.e.get()).dispose();
                    this.a.a((Object) t);
                    b(j2);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.a.a(th);
                this.d.dispose();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b(long j) {
            ajfp.c(this.e, this.d.a(new e(j, this), this.b, this.c));
        }

        public final void dispose() {
            ajfp.a(this.g);
            ajfp.a((AtomicReference) this);
            this.d.dispose();
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajre(ajdp<T> ajdp, long j, TimeUnit timeUnit, ajdw ajdw, ajdt<? extends T> ajdt) {
        super(ajdp);
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
        this.e = ajdt;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajdv cVar;
        if (this.e == null) {
            cVar = new c(ajdv, this.b, this.c, this.d.b());
            ajdv.a((ajej) cVar);
            cVar.b(0);
        } else {
            cVar = new b(ajdv, this.b, this.c, this.d.b(), this.e);
            ajdv.a((ajej) cVar);
            cVar.b(0);
        }
        this.a.a(r0);
    }
}
