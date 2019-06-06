package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajpz */
public final class ajpz<T, R> extends ajnp<T, R> {
    private ajfc<? super ajdp<T>, ? extends ajdt<R>> b;

    /* renamed from: ajpz$b */
    static final class b<T, R> extends AtomicReference<ajej> implements ajdv<R>, ajej {
        private ajdv<? super R> a;
        private ajej b;

        b(ajdv<? super R> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            ajfp.a((AtomicReference) this);
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(R r) {
            this.a.a((Object) r);
        }

        public final void a(Throwable th) {
            ajfp.a((AtomicReference) this);
            this.a.a(th);
        }

        public final void dispose() {
            this.b.dispose();
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    /* renamed from: ajpz$a */
    static final class a<T, R> implements ajdv<T> {
        private ajwo<T> a;
        private AtomicReference<ajej> b;

        a(ajwo<T> ajwo, AtomicReference<ajej> atomicReference) {
            this.a = ajwo;
            this.b = atomicReference;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            ajfp.b(this.b, ajej);
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }
    }

    public ajpz(ajdt<T> ajdt, ajfc<? super ajdp<T>, ? extends ajdt<R>> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super R> ajdv) {
        ajwo ajwo = new ajwo();
        try {
            ajdt ajdt = (ajdt) ajfv.a(this.b.apply(ajwo), "The selector returned a null ObservableSource");
            b bVar = new b(ajdv);
            ajdt.a(bVar);
            this.a.a(new a(ajwo, bVar));
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
        }
    }
}
