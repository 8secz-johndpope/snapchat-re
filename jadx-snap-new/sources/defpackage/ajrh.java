package defpackage;

import defpackage.ajfu.j;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: ajrh */
public final class ajrh<T, U extends Collection<? super T>> extends ajdx<U> implements ajfz<U> {
    private ajdt<T> a;
    private Callable<U> b;

    /* renamed from: ajrh$a */
    static final class a<T, U extends Collection<? super T>> implements ajdv<T>, ajej {
        private ajdz<? super U> a;
        private U b;
        private ajej c;

        a(ajdz<? super U> ajdz, U u) {
            this.a = ajdz;
            this.b = u;
        }

        public final void a() {
            Collection collection = this.b;
            this.b = null;
            this.a.b_(collection);
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.b.add(t);
        }

        public final void a(Throwable th) {
            this.b = null;
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajrh(ajdt<T> ajdt, int i) {
        this.a = ajdt;
        this.b = new j(i);
    }

    public final ajdp<U> ap_() {
        return ajvo.a(new ajrg(this.a, this.b));
    }

    public final void b(ajdz<? super U> ajdz) {
        try {
            this.a.a(new a(ajdz, (Collection) ajfv.a(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdz) ajdz);
        }
    }
}
