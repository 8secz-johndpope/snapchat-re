package defpackage;

/* renamed from: ajsm */
public final class ajsm<T, R> extends ajdx<R> {
    private ajeb<? extends T> a;
    private ajfc<? super T, ? extends R> b;

    /* renamed from: ajsm$a */
    static final class a<T, R> implements ajdz<T> {
        private ajdz<? super R> a;
        private ajfc<? super T, ? extends R> b;

        a(ajdz<? super R> ajdz, ajfc<? super T, ? extends R> ajfc) {
            this.a = ajdz;
            this.b = ajfc;
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            try {
                this.a.b_(ajfv.a(this.b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                ajep.a(th);
                a(th);
            }
        }
    }

    public ajsm(ajeb<? extends T> ajeb, ajfc<? super T, ? extends R> ajfc) {
        this.a = ajeb;
        this.b = ajfc;
    }

    public final void b(ajdz<? super R> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
