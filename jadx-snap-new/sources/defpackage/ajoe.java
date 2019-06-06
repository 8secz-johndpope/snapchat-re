package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajoe */
public final class ajoe<T, U> extends ajnp<T, T> {
    private ajfc<? super T, ? extends ajdt<U>> b;

    /* renamed from: ajoe$a */
    static final class a<T, U> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private ajfc<? super T, ? extends ajdt<U>> b;
        private ajej c;
        private AtomicReference<ajej> d = new AtomicReference();
        private volatile long e;
        private boolean f;

        /* renamed from: ajoe$a$a */
        static final class a<T, U> extends ajvf<U> {
            private a<T, U> a;
            private long b;
            private T c;
            private boolean d;
            private AtomicBoolean e = new AtomicBoolean();

            a(a<T, U> aVar, long j, T t) {
                this.a = aVar;
                this.b = j;
                this.c = t;
            }

            public final void a() {
                if (!this.d) {
                    this.d = true;
                    c();
                }
            }

            public final void a(U u) {
                if (!this.d) {
                    this.d = true;
                    dispose();
                    c();
                }
            }

            public final void a(Throwable th) {
                if (this.d) {
                    ajvo.a(th);
                    return;
                }
                this.d = true;
                this.a.a(th);
            }

            /* Access modifiers changed, original: final */
            public final void c() {
                if (this.e.compareAndSet(false, true)) {
                    this.a.a(this.b, this.c);
                }
            }
        }

        a(ajdv<? super T> ajdv, ajfc<? super T, ? extends ajdt<U>> ajfc) {
            this.a = ajdv;
            this.b = ajfc;
        }

        public final void a() {
            if (!this.f) {
                this.f = true;
                ajej ajej = (ajej) this.d.get();
                if (ajej != ajfp.DISPOSED) {
                    ((a) ajej).c();
                    ajfp.a(this.d);
                    this.a.a();
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(long j, T t) {
            if (j == this.e) {
                this.a.a((Object) t);
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.f) {
                long j = this.e + 1;
                this.e = j;
                ajej ajej = (ajej) this.d.get();
                if (ajej != null) {
                    ajej.dispose();
                }
                try {
                    ajdt ajdt = (ajdt) ajfv.a(this.b.apply(t), "The ObservableSource supplied is null");
                    a aVar = new a(this, j, t);
                    if (this.d.compareAndSet(ajej, aVar)) {
                        ajdt.a(aVar);
                    }
                } catch (Throwable th) {
                    ajep.a(th);
                    dispose();
                    this.a.a(th);
                }
            }
        }

        public final void a(Throwable th) {
            ajfp.a(this.d);
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
            ajfp.a(this.d);
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajoe(ajdt<T> ajdt, ajfc<? super T, ? extends ajdt<U>> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(new ajvm(ajdv), this.b));
    }
}
