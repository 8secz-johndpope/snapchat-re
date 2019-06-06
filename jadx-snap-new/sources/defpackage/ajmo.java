package defpackage;

/* renamed from: ajmo */
public final class ajmo<T> extends ajlj<T, T> {
    private ajfl<? super Throwable> b;

    /* renamed from: ajmo$a */
    static final class a<T> implements ajdl<T>, ajej {
        private ajdl<? super T> a;
        private ajfl<? super Throwable> b;
        private ajej c;

        a(ajdl<? super T> ajdl, ajfl<? super Throwable> ajfl) {
            this.a = ajdl;
            this.b = ajfl;
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
                if (this.b.test(th)) {
                    this.a.a();
                } else {
                    this.a.a(th);
                }
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

    public ajmo(ajdn<T> ajdn, ajfl<? super Throwable> ajfl) {
        super(ajdn);
        this.b = ajfl;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.b(new a(ajdl, this.b));
    }
}
