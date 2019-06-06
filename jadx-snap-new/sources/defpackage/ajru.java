package defpackage;

/* renamed from: ajru */
public final class ajru<T> extends ajdx<T> {
    private ajeb<T> a;
    private ajev b;

    /* renamed from: ajru$a */
    static final class a<T> implements ajdz<T>, ajej {
        private ajdz<? super T> a;
        private ajev b;
        private ajej c;

        a(ajdz<? super T> ajdz, ajev ajev) {
            this.a = ajdz;
            this.b = ajev;
        }

        private void a() {
            try {
                this.b.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
            a();
        }

        public final void b_(T t) {
            this.a.b_(t);
            a();
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajru(ajeb<T> ajeb, ajev ajev) {
        this.a = ajeb;
        this.b = ajev;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
