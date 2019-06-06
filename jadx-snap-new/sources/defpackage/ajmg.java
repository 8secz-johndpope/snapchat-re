package defpackage;

/* renamed from: ajmg */
public final class ajmg<T> extends ajcx implements ajfy<T> {
    private ajdn<T> a;

    /* renamed from: ajmg$a */
    static final class a<T> implements ajdl<T>, ajej {
        private ajcz a;
        private ajej b;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        public final void a() {
            this.b = ajfp.DISPOSED;
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.b = ajfp.DISPOSED;
            this.a.a(th);
        }

        public final void b_(T t) {
            this.b = ajfp.DISPOSED;
            this.a.a();
        }

        public final void dispose() {
            this.b.dispose();
            this.b = ajfp.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajmg(ajdn<T> ajdn) {
        this.a = ajdn;
    }

    public final ajdj<T> ao_() {
        return ajvo.a(new ajmf(this.a));
    }

    public final void b(ajcz ajcz) {
        this.a.b(new a(ajcz));
    }
}
