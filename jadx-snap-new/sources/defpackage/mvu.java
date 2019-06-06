package defpackage;

/* renamed from: mvu */
public interface mvu extends akbl<mux, ajdp<mvs>> {

    /* renamed from: mvu$a */
    public static final class a implements mvu {
        public static final a a = new a();

        private a() {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((mux) obj, "lens");
            obj = ajdp.b(mvs.c);
            akcr.a(obj, "Observable.just(LensContentInfo.EMPTY)");
            return obj;
        }
    }
}
