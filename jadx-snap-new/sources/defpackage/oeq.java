package defpackage;

/* renamed from: oeq */
public final class oeq {
    public final ajxe a;
    public final admm b;

    /* renamed from: oeq$a */
    static final class a extends akcs implements akbk<jwc> {
        private /* synthetic */ jwe a;

        a(jwe jwe) {
            this.a = jwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a();
        }
    }

    /* renamed from: oeq$b */
    public static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            jwu jwu = (jwu) obj;
            akcr.b(jwu, "it");
            return jwu.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(oeq.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;");
    }

    public oeq(admm admm, jwe jwe) {
        akcr.b(admm, "videoFrameRetriever");
        akcr.b(jwe, "bitmapLoaderFactory");
        this.b = admm;
        this.a = ajxh.a(new a(jwe));
    }
}
