package defpackage;

/* renamed from: ajql */
public final class ajql<T> extends ajnp<T, T> {
    private ajex<T, T, T> b;

    /* renamed from: ajql$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private ajex<T, T, T> b;
        private ajej c;
        private T d;
        private boolean e;

        a(ajdv<? super T> ajdv, ajex<T, T, T> ajex) {
            this.a = ajdv;
            this.b = ajex;
        }

        public final void a() {
            if (!this.e) {
                this.e = true;
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
            if (!this.e) {
                ajdv ajdv = this.a;
                Object obj = this.d;
                if (obj == null) {
                    this.d = t;
                    ajdv.a((Object) t);
                    return;
                }
                try {
                    Object a = ajfv.a(this.b.apply(obj, t), "The value returned by the accumulator is null");
                    this.d = a;
                    ajdv.a(a);
                } catch (Throwable th) {
                    ajep.a(th);
                    this.c.dispose();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.e) {
                ajvo.a(th);
                return;
            }
            this.e = true;
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajql(ajdt<T> ajdt, ajex<T, T, T> ajex) {
        super(ajdt);
        this.b = ajex;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
