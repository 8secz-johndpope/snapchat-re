package defpackage;

/* renamed from: ajsu */
public final class ajsu<T> extends ajde<T> {
    private ajeb<? extends T> b;

    /* renamed from: ajsu$a */
    static final class a<T> extends ajue<T> implements ajdz<T> {
        private ajej c;

        a(akux<? super T> akux) {
            super(akux);
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((akuy) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b() {
            super.b();
            this.c.dispose();
        }

        public final void b_(T t) {
            b(t);
        }
    }

    public ajsu(ajeb<? extends T> ajeb) {
        this.b = ajeb;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(akux));
    }
}
