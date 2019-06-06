package defpackage;

/* renamed from: ajqu */
public final class ajqu<T> extends ajnp<T, T> {
    private ajdt<? extends T> b;

    /* renamed from: ajqu$a */
    static final class a<T> implements ajdv<T> {
        final ajft a = new ajft();
        private ajdv<? super T> b;
        private ajdt<? extends T> c;
        private boolean d = true;

        a(ajdv<? super T> ajdv, ajdt<? extends T> ajdt) {
            this.b = ajdv;
            this.c = ajdt;
        }

        public final void a() {
            if (this.d) {
                this.d = false;
                this.c.a(this);
                return;
            }
            this.b.a();
        }

        public final void a(ajej ajej) {
            ajfp.a(this.a, ajej);
        }

        public final void a(T t) {
            if (this.d) {
                this.d = false;
            }
            this.b.a((Object) t);
        }

        public final void a(Throwable th) {
            this.b.a(th);
        }
    }

    public ajqu(ajdt<T> ajdt, ajdt<? extends T> ajdt2) {
        super(ajdt);
        this.b = ajdt2;
    }

    public final void a_(ajdv<? super T> ajdv) {
        a aVar = new a(ajdv, this.b);
        ajdv.a(aVar.a);
        this.a.a(aVar);
    }
}
