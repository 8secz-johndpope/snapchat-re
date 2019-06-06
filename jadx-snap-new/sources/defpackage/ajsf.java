package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsf */
public final class ajsf<T, R> extends ajdj<R> {
    private ajeb<? extends T> a;
    private ajfc<? super T, ? extends ajdn<? extends R>> b;

    /* renamed from: ajsf$b */
    static final class b<T, R> extends AtomicReference<ajej> implements ajdz<T>, ajej {
        private ajdl<? super R> a;
        private ajfc<? super T, ? extends ajdn<? extends R>> b;

        b(ajdl<? super R> ajdl, ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
            this.a = ajdl;
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
                ajdn ajdn = (ajdn) ajfv.a(this.b.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    ajdn.b(new a(this, this.a));
                }
            } catch (Throwable th) {
                ajep.a(th);
                a(th);
            }
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    /* renamed from: ajsf$a */
    static final class a<R> implements ajdl<R> {
        private AtomicReference<ajej> a;
        private ajdl<? super R> b;

        a(AtomicReference<ajej> atomicReference, ajdl<? super R> ajdl) {
            this.a = atomicReference;
            this.b = ajdl;
        }

        public final void a() {
            this.b.a();
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

    public ajsf(ajeb<? extends T> ajeb, ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
        this.b = ajfc;
        this.a = ajeb;
    }

    public final void a(ajdl<? super R> ajdl) {
        this.a.a(new b(ajdl, this.b));
    }
}
