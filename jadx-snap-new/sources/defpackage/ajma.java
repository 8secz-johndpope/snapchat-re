package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajma */
public final class ajma<T, R> extends ajdj<R> {
    private ajdn<T> a;
    private ajfc<? super T, ? extends ajeb<? extends R>> b;

    /* renamed from: ajma$a */
    static final class a<T, R> extends AtomicReference<ajej> implements ajdl<T>, ajej {
        private ajdl<? super R> a;
        private ajfc<? super T, ? extends ajeb<? extends R>> b;

        a(ajdl<? super R> ajdl, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
            this.a = ajdl;
            this.b = ajfc;
        }

        public final void a() {
            this.a.a();
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
                ((ajeb) ajfv.a(this.b.apply(t), "The mapper returned a null SingleSource")).a(new b(this, this.a));
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

    /* renamed from: ajma$b */
    static final class b<R> implements ajdz<R> {
        private AtomicReference<ajej> a;
        private ajdl<? super R> b;

        b(AtomicReference<ajej> atomicReference, ajdl<? super R> ajdl) {
            this.a = atomicReference;
            this.b = ajdl;
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

    public ajma(ajdn<T> ajdn, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        this.a = ajdn;
        this.b = ajfc;
    }

    public final void a(ajdl<? super R> ajdl) {
        this.a.b(new a(ajdl, this.b));
    }
}
