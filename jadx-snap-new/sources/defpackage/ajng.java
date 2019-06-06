package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajng */
public final class ajng<T, R> extends ajdp<R> {
    private ajdn<T> a;
    private ajfc<? super T, ? extends ajdt<? extends R>> b;

    /* renamed from: ajng$a */
    static final class a<T, R> extends AtomicReference<ajej> implements ajdl<T>, ajdv<R>, ajej {
        private ajdv<? super R> a;
        private ajfc<? super T, ? extends ajdt<? extends R>> b;

        a(ajdv<? super R> ajdv, ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
            this.a = ajdv;
            this.b = ajfc;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            ajfp.c(this, ajej);
        }

        public final void a(R r) {
            this.a.a((Object) r);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            try {
                ((ajdt) ajfv.a(this.b.apply(t), "The mapper returned a null Publisher")).a(this);
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

    public ajng(ajdn<T> ajdn, ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
        this.a = ajdn;
        this.b = ajfc;
    }

    public final void a_(ajdv<? super R> ajdv) {
        ajej aVar = new a(ajdv, this.b);
        ajdv.a(aVar);
        this.a.b(aVar);
    }
}
