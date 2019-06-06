package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajmu */
public final class ajmu<T> extends ajdx<T> {
    private ajdn<T> a;
    private ajeb<? extends T> b;

    /* renamed from: ajmu$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdl<T>, ajej {
        private ajdz<? super T> a;
        private ajeb<? extends T> b;

        /* renamed from: ajmu$a$a */
        static final class a<T> implements ajdz<T> {
            private ajdz<? super T> a;
            private AtomicReference<ajej> b;

            a(ajdz<? super T> ajdz, AtomicReference<ajej> atomicReference) {
                this.a = ajdz;
                this.b = atomicReference;
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

        a(ajdz<? super T> ajdz, ajeb<? extends T> ajeb) {
            this.a = ajdz;
            this.b = ajeb;
        }

        public final void a() {
            ajej ajej = (ajej) get();
            if (ajej != ajfp.DISPOSED && compareAndSet(ajej, null)) {
                this.b.a(new a(this.a, this));
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

    public ajmu(ajdn<T> ajdn, ajeb<? extends T> ajeb) {
        this.a = ajdn;
        this.b = ajeb;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.b(new a(ajdz, this.b));
    }
}
