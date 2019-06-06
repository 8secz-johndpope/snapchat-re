package defpackage;

/* renamed from: ajme */
public final class ajme<T> extends ajdj<T> {
    private ajeb<T> a;

    /* renamed from: ajme$a */
    static final class a<T> implements ajdz<T>, ajej {
        private ajdl<? super T> a;
        private ajej b;

        a(ajdl<? super T> ajdl) {
            this.a = ajdl;
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.b = ajfp.DISPOSED;
            this.a.a(th);
        }

        public final void b_(T t) {
            this.b = ajfp.DISPOSED;
            this.a.b_(t);
        }

        public final void dispose() {
            this.b.dispose();
            this.b = ajfp.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajme(ajeb<T> ajeb) {
        this.a = ajeb;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.a(new a(ajdl));
    }
}
