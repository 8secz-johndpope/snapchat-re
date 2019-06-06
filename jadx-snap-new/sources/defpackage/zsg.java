package defpackage;

/* renamed from: zsg */
public final class zsg {
    private final ajxe a;

    /* renamed from: zsg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zsg$b */
    static final class b extends akcs implements akbk<ilv> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zsg.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;");
        a aVar = new a();
    }

    public zsg(ajwy<ilv> ajwy) {
        akcr.b(ajwy, "grapheneProvider");
        this.a = ajxh.a(new b(ajwy));
    }

    public final ilv a() {
        return (ilv) this.a.b();
    }

    public final void a(zrt zrt, int i) {
        akcr.b(zrt, "unlockablesRequestType");
        String str = "status_code";
        a().c(ipg.REQUEST_STATUS.a("req_type", (Enum) zrt).a(str, String.valueOf(i)), 1);
    }

    public final void a(zrt zrt, idd idd) {
        akcr.b(zrt, "unlockablesRequestType");
        String str = "callsite";
        akcr.b(idd, str);
        a().c(ipg.REQUEST_CALLSITE.a("req_type", (Enum) zrt).a(str, idd.toString()), 1);
    }

    public final void a(zrt zrt, Throwable th) {
        akcr.b(zrt, "unlockablesRequestType");
        akcr.b(th, "throwable");
        akwn akwn = (akwn) (!(th instanceof akwn) ? null : th);
        a(zrt, akwn != null ? akwn.a() : 0);
        ilv a = a();
        ilz a2 = ipg.REQUEST_ERROR_INFO.a("req_type", (Enum) zrt);
        String simpleName = th.getClass().getSimpleName();
        akcr.a((Object) simpleName, "throwable::class.java.simpleName");
        a.c(a2.a("exception_name", simpleName), 1);
    }

    public final void a(boolean z, zrt zrt, long j) {
        akcr.b(zrt, "unlockablesRequestType");
        a().a(ipg.REQUEST_LATENCY.a("req_type", (Enum) zrt).a("succeeded", z), j);
    }
}
