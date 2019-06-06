package defpackage;

/* renamed from: ajrx */
public final class ajrx<T> extends ajdx<T> {
    final ajfb<? super Throwable> a;
    private ajeb<T> b;

    /* renamed from: ajrx$a */
    final class a implements ajdz<T> {
        private final ajdz<? super T> a;

        a(ajdz<? super T> ajdz) {
            this.a = ajdz;
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            try {
                ajrx.this.a.accept(th);
            } catch (Throwable th2) {
                ajep.a(th2);
                th = new ajeo(th, th2);
            }
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }
    }

    public ajrx(ajeb<T> ajeb, ajfb<? super Throwable> ajfb) {
        this.b = ajeb;
        this.a = ajfb;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.b.a(new a(ajdz));
    }
}
