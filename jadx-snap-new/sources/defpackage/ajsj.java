package defpackage;

/* renamed from: ajsj */
public final class ajsj<T> extends ajdx<T> {
    private ajeb<? extends T> a;

    /* renamed from: ajsj$a */
    static final class a<T> implements ajdz<T>, ajej {
        private ajdz<? super T> a;
        private ajej b;

        a(ajdz<? super T> ajdz) {
            this.a = ajdz;
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void dispose() {
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajsj(ajeb<? extends T> ajeb) {
        this.a = ajeb;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz));
    }
}
