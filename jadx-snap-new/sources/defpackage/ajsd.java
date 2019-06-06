package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsd */
public final class ajsd<T> extends ajcx {
    private ajeb<T> a;
    private ajfc<? super T, ? extends ajdb> b;

    /* renamed from: ajsd$a */
    static final class a<T> extends AtomicReference<ajej> implements ajcz, ajdz<T>, ajej {
        private ajcz a;
        private ajfc<? super T, ? extends ajdb> b;

        a(ajcz ajcz, ajfc<? super T, ? extends ajdb> ajfc) {
            this.a = ajcz;
            this.b = ajfc;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            ajfp.c(this, ajej);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            try {
                ajdb ajdb = (ajdb) ajfv.a(this.b.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    ajdb.a(this);
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

    public ajsd(ajeb<T> ajeb, ajfc<? super T, ? extends ajdb> ajfc) {
        this.a = ajeb;
        this.b = ajfc;
    }

    public final void b(ajcz ajcz) {
        ajej aVar = new a(ajcz, this.b);
        ajcz.a(aVar);
        this.a.a(aVar);
    }
}
