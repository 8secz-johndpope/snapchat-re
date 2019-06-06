package defpackage;

/* renamed from: ajpj */
public final class ajpj<T> extends ajnp<T, T> {

    /* renamed from: ajpj$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private ajej b;

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void dispose() {
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajpj(ajdt<T> ajdt) {
        super(ajdt);
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv));
    }
}
