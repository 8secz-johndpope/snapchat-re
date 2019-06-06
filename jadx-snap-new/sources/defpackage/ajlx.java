package defpackage;

/* renamed from: ajlx */
public final class ajlx<T> extends ajdj<T> {
    private ajeb<T> a;
    private ajfl<? super T> b;

    /* renamed from: ajlx$a */
    static final class a<T> implements ajdz<T>, ajej {
        private ajdl<? super T> a;
        private ajfl<? super T> b;
        private ajej c;

        a(ajdl<? super T> ajdl, ajfl<? super T> ajfl) {
            this.a = ajdl;
            this.b = ajfl;
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
            try {
                if (this.b.test(t)) {
                    this.a.b_(t);
                } else {
                    this.a.a();
                }
            } catch (Throwable th) {
                ajep.a(th);
                this.a.a(th);
            }
        }

        public final void dispose() {
            ajej ajej = this.c;
            this.c = ajfp.DISPOSED;
            ajej.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajlx(ajeb<T> ajeb, ajfl<? super T> ajfl) {
        this.a = ajeb;
        this.b = ajfl;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.a(new a(ajdl, this.b));
    }
}
