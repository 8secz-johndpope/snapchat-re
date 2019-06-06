package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajss */
public final class ajss<T> extends ajdx<T> {
    private ajeb<T> a;
    private long b;
    private TimeUnit c;
    private ajdw d;
    private ajeb<? extends T> e;

    /* renamed from: ajss$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdz<T>, ajej, Runnable {
        final AtomicReference<ajej> a = new AtomicReference();
        private ajdz<? super T> b;
        private a<T> c;
        private ajeb<? extends T> d;
        private long e;
        private TimeUnit f;

        /* renamed from: ajss$a$a */
        static final class a<T> extends AtomicReference<ajej> implements ajdz<T> {
            private ajdz<? super T> a;

            a(ajdz<? super T> ajdz) {
                this.a = ajdz;
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                this.a.a(th);
            }

            public final void b_(T t) {
                this.a.b_(t);
            }
        }

        a(ajdz<? super T> ajdz, ajeb<? extends T> ajeb, long j, TimeUnit timeUnit) {
            this.b = ajdz;
            this.d = ajeb;
            this.e = j;
            this.f = timeUnit;
            if (ajeb != null) {
                this.c = new a(ajdz);
            } else {
                this.c = null;
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this, ajej);
        }

        public final void a(Throwable th) {
            ajej ajej = (ajej) get();
            if (ajej == ajfp.DISPOSED || !compareAndSet(ajej, ajfp.DISPOSED)) {
                ajvo.a(th);
                return;
            }
            ajfp.a(this.a);
            this.b.a(th);
        }

        public final void b_(T t) {
            ajej ajej = (ajej) get();
            if (ajej != ajfp.DISPOSED && compareAndSet(ajej, ajfp.DISPOSED)) {
                ajfp.a(this.a);
                this.b.b_(t);
            }
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
            ajfp.a(this.a);
            AtomicReference atomicReference = this.c;
            if (atomicReference != null) {
                ajfp.a(atomicReference);
            }
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final void run() {
            ajej ajej = (ajej) get();
            if (ajej != ajfp.DISPOSED && compareAndSet(ajej, ajfp.DISPOSED)) {
                if (ajej != null) {
                    ajej.dispose();
                }
                ajeb ajeb = this.d;
                if (ajeb == null) {
                    this.b.a(new TimeoutException(ajur.a(this.e, this.f)));
                } else {
                    this.d = null;
                    ajeb.a(this.c);
                }
            }
        }
    }

    public ajss(ajeb<T> ajeb, long j, TimeUnit timeUnit, ajdw ajdw, ajeb<? extends T> ajeb2) {
        this.a = ajeb;
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
        this.e = ajeb2;
    }

    public final void b(ajdz<? super T> ajdz) {
        ajej aVar = new a(ajdz, this.e, this.b, this.c);
        ajdz.a(aVar);
        ajfp.c(aVar.a, this.d.a(aVar, this.b, this.c));
        this.a.a(aVar);
    }
}
