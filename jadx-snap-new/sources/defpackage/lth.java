package defpackage;

/* renamed from: lth */
public interface lth {

    /* renamed from: lth$a */
    public static final class a implements lth {
        public static final a a = new a();

        private a() {
        }

        public final ajdp<Boolean> a() {
            Object b = ajdp.b(Boolean.FALSE);
            akcr.a(b, "Observable.just(false)");
            return b;
        }

        public final ajcx b() {
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }
    }

    ajdp<Boolean> a();

    ajcx b();
}
