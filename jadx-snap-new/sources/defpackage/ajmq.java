package defpackage;

/* renamed from: ajmq */
public final class ajmq<T> extends ajlj<T, T> {
    private ajfc<? super Throwable, ? extends T> b;

    /* renamed from: ajmq$a */
    static final class a<T> implements ajdl<T>, ajej {
        private ajdl<? super T> a;
        private ajfc<? super Throwable, ? extends T> b;
        private ajej c;

        a(ajdl<? super T> ajdl, ajfc<? super Throwable, ? extends T> ajfc) {
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
            try {
                th = ajfv.a(this.b.apply(th), "The valueSupplier returned a null value");
                this.a.b_(th);
            } catch (Throwable th2) {
                ajep.a(th2);
                this.a.a(new ajeo(th, th2));
            }
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajmq(ajdn<T> ajdn, ajfc<? super Throwable, ? extends T> ajfc) {
        super(ajdn);
        this.b = ajfc;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.b(new a(ajdl, this.b));
    }
}
