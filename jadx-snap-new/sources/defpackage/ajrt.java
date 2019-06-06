package defpackage;

/* renamed from: ajrt */
public final class ajrt<T> extends ajdx<T> {
    private ajeb<T> a;
    private ajfb<? super T> b;

    /* renamed from: ajrt$a */
    static final class a<T> implements ajdz<T>, ajej {
        private ajdz<? super T> a;
        private ajfb<? super T> b;
        private ajej c;

        a(ajdz<? super T> ajdz, ajfb<? super T> ajfb) {
            this.a = ajdz;
            this.b = ajfb;
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.b_(t);
            try {
                this.b.accept(t);
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajrt(ajeb<T> ajeb, ajfb<? super T> ajfb) {
        this.a = ajeb;
        this.b = ajfb;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
