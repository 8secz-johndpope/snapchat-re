package defpackage;

/* renamed from: ajsa */
public final class ajsa<T> extends ajdx<T> {
    final ajfb<? super T> a;
    private ajeb<T> b;

    /* renamed from: ajsa$a */
    final class a implements ajdz<T> {
        private ajdz<? super T> a;

        a(ajdz<? super T> ajdz) {
            this.a = ajdz;
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            try {
                ajsa.this.a.accept(t);
                this.a.b_(t);
            } catch (Throwable th) {
                ajep.a(th);
                this.a.a(th);
            }
        }
    }

    public ajsa(ajeb<T> ajeb, ajfb<? super T> ajfb) {
        this.b = ajeb;
        this.a = ajfb;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.b.a(new a(ajdz));
    }
}
