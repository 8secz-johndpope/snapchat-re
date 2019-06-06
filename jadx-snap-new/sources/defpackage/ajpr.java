package defpackage;

/* renamed from: ajpr */
public final class ajpr<T, U> extends ajnp<T, U> {
    private ajfc<? super T, ? extends U> b;

    /* renamed from: ajpr$a */
    static final class a<T, U> extends ajgg<T, U> {
        private ajfc<? super T, ? extends U> a;

        a(ajdv<? super U> ajdv, ajfc<? super T, ? extends U> ajfc) {
            super(ajdv);
            this.a = ajfc;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.b.a(null);
                    return;
                }
                try {
                    this.b.a(ajfv.a(this.a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final U poll() {
            Object poll = this.c.poll();
            return poll != null ? ajfv.a(this.a.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    public ajpr(ajdt<T> ajdt, ajfc<? super T, ? extends U> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super U> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
