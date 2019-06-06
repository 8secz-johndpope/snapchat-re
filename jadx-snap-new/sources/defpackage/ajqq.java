package defpackage;

/* renamed from: ajqq */
public final class ajqq<T> extends ajnp<T, T> {
    private long b;

    /* renamed from: ajqq$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private long b;
        private ajej c;

        a(ajdv<? super T> ajdv, long j) {
            this.a = ajdv;
            this.b = j;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            long j = this.b;
            if (j != 0) {
                this.b = j - 1;
            } else {
                this.a.a((Object) t);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajqq(ajdt<T> ajdt, long j) {
        super(ajdt);
        this.b = j;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
