package defpackage;

/* renamed from: ajqr */
public final class ajqr<T, U> extends ajnp<T, T> {
    private ajdt<U> b;

    /* renamed from: ajqr$b */
    static final class b<T> implements ajdv<T> {
        volatile boolean a;
        private ajdv<? super T> b;
        private ajfm c;
        private ajej d;
        private boolean e;

        b(ajdv<? super T> ajdv, ajfm ajfm) {
            this.b = ajdv;
            this.c = ajfm;
        }

        public final void a() {
            this.c.dispose();
            this.b.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.c.a(0, ajej);
            }
        }

        public final void a(T t) {
            if (this.e) {
                this.b.a((Object) t);
                return;
            }
            if (this.a) {
                this.e = true;
                this.b.a((Object) t);
            }
        }

        public final void a(Throwable th) {
            this.c.dispose();
            this.b.a(th);
        }
    }

    /* renamed from: ajqr$a */
    final class a implements ajdv<U> {
        private ajfm a;
        private b<T> b;
        private ajvm<T> c;
        private ajej d;

        a(ajfm ajfm, b<T> bVar, ajvm<T> ajvm) {
            this.a = ajfm;
            this.b = bVar;
            this.c = ajvm;
        }

        public final void a() {
            this.b.a = true;
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.a.a(1, ajej);
            }
        }

        public final void a(U u) {
            this.d.dispose();
            this.b.a = true;
        }

        public final void a(Throwable th) {
            this.a.dispose();
            this.c.a(th);
        }
    }

    public ajqr(ajdt<T> ajdt, ajdt<U> ajdt2) {
        super(ajdt);
        this.b = ajdt2;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajvm ajvm = new ajvm(ajdv);
        ajej ajfm = new ajfm();
        ajvm.a(ajfm);
        b bVar = new b(ajvm, ajfm);
        this.b.a(new a(ajfm, bVar, ajvm));
        this.a.a(bVar);
    }
}
