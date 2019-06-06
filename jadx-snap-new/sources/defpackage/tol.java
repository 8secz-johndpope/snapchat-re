package defpackage;

/* renamed from: tol */
public final class tol {
    private final ajxe a;

    /* renamed from: tol$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: tol$b */
    static final class b extends akcs implements akbk<dib> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dib) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tol.class), "blizzardEventLogger", "getBlizzardEventLogger()Lcom/snap/blizzard/BlizzardEventLogger;");
        a aVar = new a();
    }

    public tol(ajwy<dib> ajwy) {
        akcr.b(ajwy, "blizzardEventLoggerProvider");
        this.a = ajxh.a(new b(ajwy));
    }

    public final dib a() {
        return (dib) this.a.b();
    }
}
