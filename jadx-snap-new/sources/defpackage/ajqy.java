package defpackage;

/* renamed from: ajqy */
public final class ajqy<T> extends ajnp<T, T> {
    private ajfl<? super T> b;

    /* renamed from: ajqy$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private ajfl<? super T> b;
        private ajej c;
        private boolean d;

        a(ajdv<? super T> ajdv, ajfl<? super T> ajfl) {
            this.a = ajdv;
            this.b = ajfl;
        }

        public final void a() {
            if (!this.d) {
                this.d = true;
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
            if (!this.d) {
                this.a.a((Object) t);
                try {
                    if (this.b.test(t)) {
                        this.d = true;
                        this.c.dispose();
                        this.a.a();
                    }
                } catch (Throwable th) {
                    ajep.a(th);
                    this.c.dispose();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.d) {
                ajvo.a(th);
                return;
            }
            this.d = true;
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajqy(ajdt<T> ajdt, ajfl<? super T> ajfl) {
        super(ajdt);
        this.b = ajfl;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
