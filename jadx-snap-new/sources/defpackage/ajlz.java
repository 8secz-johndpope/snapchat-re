package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajlz */
public final class ajlz<T, R> extends ajdx<R> {
    private ajdn<T> a;
    private ajfc<? super T, ? extends ajeb<? extends R>> b;

    /* renamed from: ajlz$a */
    static final class a<T, R> extends AtomicReference<ajej> implements ajdl<T>, ajej {
        private ajdz<? super R> a;
        private ajfc<? super T, ? extends ajeb<? extends R>> b;

        a(ajdz<? super R> ajdz, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
            this.a = ajdz;
            this.b = ajfc;
        }

        public final void a() {
            this.a.a(new NoSuchElementException());
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
                ajeb ajeb = (ajeb) ajfv.a(this.b.apply(t), "The mapper returned a null SingleSource");
                if (!isDisposed()) {
                    ajeb.a(new b(this, this.a));
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

    /* renamed from: ajlz$b */
    static final class b<R> implements ajdz<R> {
        private AtomicReference<ajej> a;
        private ajdz<? super R> b;

        b(AtomicReference<ajej> atomicReference, ajdz<? super R> ajdz) {
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

    public ajlz(ajdn<T> ajdn, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        this.a = ajdn;
        this.b = ajfc;
    }

    public final void b(ajdz<? super R> ajdz) {
        this.a.b(new a(ajdz, this.b));
    }
}
