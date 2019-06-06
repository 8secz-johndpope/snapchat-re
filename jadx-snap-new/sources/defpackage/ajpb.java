package defpackage;

/* renamed from: ajpb */
public final class ajpb<T, R> extends ajnp<T, R> {
    private ajfc<? super T, ? extends Iterable<? extends R>> b;

    /* renamed from: ajpb$a */
    static final class a<T, R> implements ajdv<T>, ajej {
        private ajdv<? super R> a;
        private ajfc<? super T, ? extends Iterable<? extends R>> b;
        private ajej c;

        a(ajdv<? super R> ajdv, ajfc<? super T, ? extends Iterable<? extends R>> ajfc) {
            this.a = ajdv;
            this.b = ajfc;
        }

        public final void a() {
            if (this.c != ajfp.DISPOSED) {
                this.c = ajfp.DISPOSED;
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (this.c != ajfp.DISPOSED) {
                try {
                    ajdv ajdv = this.a;
                    for (Object a : (Iterable) this.b.apply(t)) {
                        ajdv.a(ajfv.a(a, "The iterator returned a null value"));
                    }
                } catch (Throwable th) {
                    ajep.a(th);
                    this.c.dispose();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.c == ajfp.DISPOSED) {
                ajvo.a(th);
                return;
            }
            this.c = ajfp.DISPOSED;
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
            this.c = ajfp.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajpb(ajdt<T> ajdt, ajfc<? super T, ? extends Iterable<? extends R>> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super R> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
