package defpackage;

/* renamed from: ajpl */
public final class ajpl<T> extends ajcx implements ajfz<T> {
    private ajdt<T> a;

    /* renamed from: ajpl$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajcz a;
        private ajej b;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            this.b = ajej;
            this.a.a((ajej) this);
        }

        public final void a(T t) {
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

    public ajpl(ajdt<T> ajdt) {
        this.a = ajdt;
    }

    public final ajdp<T> ap_() {
        return ajvo.a(new ajpk(this.a));
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz));
    }
}
