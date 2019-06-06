package defpackage;

/* renamed from: akwy */
final class akwy<T> extends ajdp<akws<T>> {
    private final akwh<T> a;

    /* renamed from: akwy$a */
    static final class a implements ajej {
        private final akwh<?> a;

        a(akwh<?> akwh) {
            this.a = akwh;
        }

        public final void dispose() {
            this.a.b();
        }

        public final boolean isDisposed() {
            return this.a.c();
        }
    }

    akwy(akwh<T> akwh) {
        this.a = akwh;
    }

    public final void a_(ajdv<? super akws<T>> ajdv) {
        Throwable th;
        Object obj;
        akwh d = this.a.d();
        ajdv.a(new a(d));
        try {
            Object a = d.a();
            if (!d.c()) {
                ajdv.a(a);
            }
            if (!d.c()) {
                try {
                    ajdv.a();
                } catch (Throwable th2) {
                    th = th2;
                    obj = 1;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
            ajep.a(th);
            if (obj != null) {
                ajvo.a(th);
                return;
            }
            if (!d.c()) {
                try {
                    ajdv.a(th);
                } catch (Throwable th4) {
                    ajep.a(th4);
                    ajvo.a(new ajeo(th, th4));
                }
            }
        }
    }
}
