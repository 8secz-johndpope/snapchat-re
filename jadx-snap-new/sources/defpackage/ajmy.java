package defpackage;

/* renamed from: ajmy */
public final class ajmy<T> extends ajdp<T> {
    private ajdn<T> a;

    /* renamed from: ajmy$a */
    static final class a<T> extends ajgp<T> implements ajdl<T> {
        private ajej b;

        a(ajdv<? super T> ajdv) {
            super(ajdv);
        }

        public final void a() {
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            b(th);
        }

        public final void b_(T t) {
            b((Object) t);
        }

        public final void dispose() {
            super.dispose();
            this.b.dispose();
        }
    }

    public ajmy(ajdn<T> ajdn) {
        this.a = ajdn;
    }

    public static <T> ajdl<T> b(ajdv<? super T> ajdv) {
        return new a(ajdv);
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.b(ajmy.b(ajdv));
    }
}
