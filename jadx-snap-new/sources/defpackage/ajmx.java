package defpackage;

/* renamed from: ajmx */
public final class ajmx<T> extends ajde<T> {
    private ajdn<T> b;

    /* renamed from: ajmx$a */
    static final class a<T> extends ajue<T> implements ajdl<T> {
        private ajej c;

        a(akux<? super T> akux) {
            super(akux);
        }

        public final void a() {
            this.a.a();
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

    public ajmx(ajdn<T> ajdn) {
        this.b = ajdn;
    }

    public final void a_(akux<? super T> akux) {
        this.b.b(new a(akux));
    }
}
