package defpackage;

/* renamed from: ajoo */
public final class ajoo<T> extends ajnp<T, T> {
    private ajfb<? super T> b;
    private ajfb<? super Throwable> c;
    private ajev d;
    private ajev e;

    /* renamed from: ajoo$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private ajfb<? super T> b;
        private ajfb<? super Throwable> c;
        private ajev d;
        private ajev e;
        private ajej f;
        private boolean g;

        a(ajdv<? super T> ajdv, ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2) {
            this.a = ajdv;
            this.b = ajfb;
            this.c = ajfb2;
            this.d = ajev;
            this.e = ajev2;
        }

        public final void a() {
            if (!this.g) {
                try {
                    this.d.run();
                    this.g = true;
                    this.a.a();
                    try {
                        this.e.run();
                    } catch (Throwable th) {
                        ajep.a(th);
                        ajvo.a(th);
                    }
                } catch (Throwable th2) {
                    ajep.a(th2);
                    a(th2);
                }
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.f, ajej)) {
                this.f = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.g) {
                try {
                    this.b.accept(t);
                    this.a.a((Object) t);
                } catch (Throwable th) {
                    ajep.a(th);
                    this.f.dispose();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.g) {
                ajvo.a(th);
                return;
            }
            this.g = true;
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                ajep.a(th2);
                th = new ajeo(th, th2);
            }
            this.a.a(th);
            try {
                this.e.run();
            } catch (Throwable th3) {
                ajep.a(th3);
                ajvo.a(th3);
            }
        }

        public final void dispose() {
            this.f.dispose();
        }

        public final boolean isDisposed() {
            return this.f.isDisposed();
        }
    }

    public ajoo(ajdt<T> ajdt, ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2) {
        super(ajdt);
        this.b = ajfb;
        this.c = ajfb2;
        this.d = ajev;
        this.e = ajev2;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b, this.c, this.d, this.e));
    }
}
