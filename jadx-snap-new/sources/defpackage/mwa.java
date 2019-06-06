package defpackage;

/* renamed from: mwa */
public interface mwa extends akbl<mux, ajdp<b>> {

    /* renamed from: mwa$a */
    public static final class a implements mwa {
        public static final a a = new a();

        private a() {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((mux) obj, "lens");
            obj = ajdp.b(b.COMPLETED);
            akcr.a(obj, "Observable.just(Status.COMPLETED)");
            return obj;
        }
    }

    /* renamed from: mwa$b */
    public enum b {
        COMPLETED,
        IN_PROGRESS,
        PENDING
    }
}
