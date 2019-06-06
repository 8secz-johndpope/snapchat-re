package defpackage;

/* renamed from: akwx */
final class akwx<T> extends ajdp<akws<T>> {
    private final akwh<T> a;

    /* renamed from: akwx$a */
    static final class a<T> implements ajej, akwj<T> {
        private final akwh<?> a;
        private final ajdv<? super akws<T>> b;
        private boolean c = false;

        a(akwh<?> akwh, ajdv<? super akws<T>> ajdv) {
            this.a = akwh;
            this.b = ajdv;
        }

        public final void a(akwh<T> akwh, akws<T> akws) {
            if (!akwh.c()) {
                try {
                    this.b.a((Object) akws);
                    if (!akwh.c()) {
                        this.c = true;
                        this.b.a();
                    }
                } catch (Throwable th) {
                    ajep.a(th);
                    ajvo.a(new ajeo(th, th));
                }
            }
        }

        public final void a(akwh<T> akwh, Throwable th) {
            if (!akwh.c()) {
                try {
                    this.b.a(th);
                } catch (Throwable th2) {
                    ajep.a(th2);
                    ajvo.a(new ajeo(th, th2));
                }
            }
        }

        public final void dispose() {
            this.a.b();
        }

        public final boolean isDisposed() {
            return this.a.c();
        }
    }

    akwx(akwh<T> akwh) {
        this.a = akwh;
    }

    public final void a_(ajdv<? super akws<T>> ajdv) {
        akwh d = this.a.d();
        ajej aVar = new a(d, ajdv);
        ajdv.a(aVar);
        d.a(aVar);
    }
}
