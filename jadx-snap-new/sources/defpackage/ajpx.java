package defpackage;

/* renamed from: ajpx */
public final class ajpx<T> extends ajnp<T, T> {
    private ajfc<? super Throwable, ? extends T> b;

    /* renamed from: ajpx$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private ajfc<? super Throwable, ? extends T> b;
        private ajej c;

        a(ajdv<? super T> ajdv, ajfc<? super Throwable, ? extends T> ajfc) {
            this.a = ajdv;
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

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            Throwable nullPointerException;
            try {
                Object apply = this.b.apply(th);
                if (apply == null) {
                    nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.a.a(nullPointerException);
                    return;
                }
                this.a.a(apply);
                this.a.a();
            } catch (Throwable nullPointerException2) {
                ajep.a(nullPointerException2);
                this.a.a(new ajeo(th, nullPointerException2));
            }
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajpx(ajdt<T> ajdt, ajfc<? super Throwable, ? extends T> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
