package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajmt */
public final class ajmt<T> extends ajlj<T, T> {
    private ajdn<? extends T> b;

    /* renamed from: ajmt$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdl<T>, ajej {
        private ajdl<? super T> a;
        private ajdn<? extends T> b;

        /* renamed from: ajmt$a$a */
        static final class a<T> implements ajdl<T> {
            private ajdl<? super T> a;
            private AtomicReference<ajej> b;

            a(ajdl<? super T> ajdl, AtomicReference<ajej> atomicReference) {
                this.a = ajdl;
                this.b = atomicReference;
            }

            public final void a() {
                this.a.a();
            }

            public final void a(ajej ajej) {
                ajfp.b(this.b, ajej);
            }

            public final void a(Throwable th) {
                this.a.a(th);
            }

            public final void b_(T t) {
                this.a.b_(t);
            }
        }

        a(ajdl<? super T> ajdl, ajdn<? extends T> ajdn) {
            this.a = ajdl;
            this.b = ajdn;
        }

        public final void a() {
            ajej ajej = (ajej) get();
            if (ajej != ajfp.DISPOSED && compareAndSet(ajej, null)) {
                this.b.b(new a(this.a, this));
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajmt(ajdn<T> ajdn, ajdn<? extends T> ajdn2) {
        super(ajdn);
        this.b = ajdn2;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.b(new a(ajdl, this.b));
    }
}
