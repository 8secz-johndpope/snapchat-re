package defpackage;

/* renamed from: ajsv */
public final class ajsv<T> extends ajdp<T> {
    private ajeb<? extends T> a;

    /* renamed from: ajsv$a */
    static final class a<T> extends ajgp<T> implements ajdz<T> {
        private ajej b;

        a(ajdv<? super T> ajdv) {
            super(ajdv);
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

    public ajsv(ajeb<? extends T> ajeb) {
        this.a = ajeb;
    }

    public static <T> ajdz<T> b(ajdv<? super T> ajdv) {
        return new a(ajdv);
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(ajsv.b(ajdv));
    }
}
