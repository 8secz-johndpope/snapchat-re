package defpackage;

/* renamed from: ajmr */
public final class ajmr<T> extends ajlj<T, T> {
    final ajfb<? super ajej> b;
    final ajfb<? super T> c;
    final ajfb<? super Throwable> d;
    final ajev e;
    final ajev f;
    final ajev g;

    /* renamed from: ajmr$a */
    static final class a<T> implements ajdl<T>, ajej {
        private ajdl<? super T> a;
        private ajmr<T> b;
        private ajej c;

        a(ajdl<? super T> ajdl, ajmr<T> ajmr) {
            this.a = ajdl;
            this.b = ajmr;
        }

        private void b() {
            try {
                this.b.f.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
        }

        private void b(Throwable th) {
            try {
                this.b.d.accept(th);
            } catch (Throwable th2) {
                ajep.a(th2);
                th = new ajeo(th, th2);
            }
            this.c = ajfp.DISPOSED;
            this.a.a(th);
            b();
        }

        public final void a() {
            if (this.c != ajfp.DISPOSED) {
                try {
                    this.b.e.run();
                    this.c = ajfp.DISPOSED;
                    this.a.a();
                    b();
                } catch (Throwable th) {
                    ajep.a(th);
                    b(th);
                }
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                try {
                    this.b.b.accept(ajej);
                    this.c = ajej;
                    this.a.a((ajej) this);
                } catch (Throwable th) {
                    ajep.a(th);
                    ajej.dispose();
                    this.c = ajfp.DISPOSED;
                    ajfq.a(th, this.a);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.c == ajfp.DISPOSED) {
                ajvo.a(th);
            } else {
                b(th);
            }
        }

        public final void b_(T t) {
            if (this.c != ajfp.DISPOSED) {
                try {
                    this.b.c.accept(t);
                    this.c = ajfp.DISPOSED;
                    this.a.b_(t);
                    b();
                } catch (Throwable th) {
                    ajep.a(th);
                    b(th);
                }
            }
        }

        public final void dispose() {
            try {
                this.b.g.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
            this.c.dispose();
            this.c = ajfp.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajmr(ajdn<T> ajdn, ajfb<? super ajej> ajfb, ajfb<? super T> ajfb2, ajfb<? super Throwable> ajfb3, ajev ajev, ajev ajev2, ajev ajev3) {
        super(ajdn);
        this.b = ajfb;
        this.c = ajfb2;
        this.d = ajfb3;
        this.e = ajev;
        this.f = ajev2;
        this.g = ajev3;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.b(new a(ajdl, this));
    }
}
