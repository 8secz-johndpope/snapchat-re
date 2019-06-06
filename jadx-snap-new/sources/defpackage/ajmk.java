package defpackage;

/* renamed from: ajmk */
public final class ajmk<T, R> extends ajlj<T, R> {
    private ajfc<? super T, ? extends R> b;

    /* renamed from: ajmk$a */
    static final class a<T, R> implements ajdl<T>, ajej {
        private ajdl<? super R> a;
        private ajfc<? super T, ? extends R> b;
        private ajej c;

        a(ajdl<? super R> ajdl, ajfc<? super T, ? extends R> ajfc) {
            this.a = ajdl;
            this.b = ajfc;
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

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            try {
                this.a.b_(ajfv.a(this.b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                ajep.a(th);
                this.a.a(th);
            }
        }

        public final void dispose() {
            ajej ajej = this.c;
            this.c = ajfp.DISPOSED;
            ajej.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajmk(ajdn<T> ajdn, ajfc<? super T, ? extends R> ajfc) {
        super(ajdn);
        this.b = ajfc;
    }

    public final void a(ajdl<? super R> ajdl) {
        this.a.b(new a(ajdl, this.b));
    }
}
