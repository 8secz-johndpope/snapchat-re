package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: ajrg */
public final class ajrg<T, U extends Collection<? super T>> extends ajnp<T, U> {
    private Callable<U> b;

    /* renamed from: ajrg$a */
    static final class a<T, U extends Collection<? super T>> implements ajdv<T>, ajej {
        private ajdv<? super U> a;
        private ajej b;
        private U c;

        a(ajdv<? super U> ajdv, U u) {
            this.a = ajdv;
            this.c = u;
        }

        public final void a() {
            Object obj = this.c;
            this.c = null;
            this.a.a(obj);
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.c.add(t);
        }

        public final void a(Throwable th) {
            this.c = null;
            this.a.a(th);
        }

        public final void dispose() {
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajrg(ajdt<T> ajdt, Callable<U> callable) {
        super(ajdt);
        this.b = callable;
    }

    public final void a_(ajdv<? super U> ajdv) {
        try {
            this.a.a(new a(ajdv, (Collection) ajfv.a(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
        }
    }
}
