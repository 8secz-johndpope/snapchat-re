package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsc */
public final class ajsc<T, R> extends ajdx<R> {
    private ajeb<? extends T> a;
    private ajfc<? super T, ? extends ajeb<? extends R>> b;

    /* renamed from: ajsc$a */
    static final class a<T, R> extends AtomicReference<ajej> implements ajdz<T>, ajej {
        private ajdz<? super R> a;
        private ajfc<? super T, ? extends ajeb<? extends R>> b;

        /* renamed from: ajsc$a$a */
        static final class a<R> implements ajdz<R> {
            private AtomicReference<ajej> a;
            private ajdz<? super R> b;

            a(AtomicReference<ajej> atomicReference, ajdz<? super R> ajdz) {
                this.a = atomicReference;
                this.b = ajdz;
            }

            public final void a(ajej ajej) {
                ajfp.c(this.a, ajej);
            }

            public final void a(Throwable th) {
                this.b.a(th);
            }

            public final void b_(R r) {
                this.b.b_(r);
            }
        }

        a(ajdz<? super R> ajdz, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
            this.a = ajdz;
            this.b = ajfc;
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
            try {
                ajeb ajeb = (ajeb) ajfv.a(this.b.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    ajeb.a(new a(this, this.a));
                }
            } catch (Throwable th) {
                ajep.a(th);
                this.a.a(th);
            }
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajsc(ajeb<? extends T> ajeb, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        this.b = ajfc;
        this.a = ajeb;
    }

    public final void b(ajdz<? super R> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
