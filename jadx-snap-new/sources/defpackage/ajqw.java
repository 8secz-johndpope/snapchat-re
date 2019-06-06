package defpackage;

/* renamed from: ajqw */
public final class ajqw<T> extends ajnp<T, T> {
    private long b;

    /* renamed from: ajqw$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private boolean b;
        private ajej c;
        private long d;

        a(ajdv<? super T> ajdv, long j) {
            this.a = ajdv;
            this.d = j;
        }

        public final void a() {
            if (!this.b) {
                this.b = true;
                this.c.dispose();
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                if (this.d == 0) {
                    this.b = true;
                    ajej.dispose();
                    ajfq.a(this.a);
                    return;
                }
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.b) {
                long j = this.d;
                this.d = j - 1;
                if (j > 0) {
                    Object obj = this.d == 0 ? 1 : null;
                    this.a.a((Object) t);
                    if (obj != null) {
                        a();
                    }
                }
            }
        }

        public final void a(Throwable th) {
            if (this.b) {
                ajvo.a(th);
                return;
            }
            this.b = true;
            this.c.dispose();
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajqw(ajdt<T> ajdt, long j) {
        super(ajdt);
        this.b = j;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
