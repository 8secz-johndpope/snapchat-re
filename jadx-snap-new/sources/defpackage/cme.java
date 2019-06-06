package defpackage;

/* renamed from: cme */
public final class cme implements cmf {
    final ajwy<cii> a;
    private final ajxe b = ajxh.a(new b(this));
    private final ajwy<ilv> c;

    /* renamed from: cme$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cme$b */
    static final class b extends akcs implements akbk<cii> {
        private /* synthetic */ cme a;

        b(cme cme) {
            this.a = cme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cii) this.a.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(cme.class), "adRequestDataSupplierApi", "getAdRequestDataSupplierApi()Lcom/snap/adinfo/api/DeviceInfoSupplierApi;");
        a aVar = new a();
    }

    public cme(ajwy<cii> ajwy, ajwy<ilv> ajwy2) {
        akcr.b(ajwy, "deviceInfoSupplierApi");
        akcr.b(ajwy2, "graphene");
        this.a = ajwy;
        this.c = ajwy2;
    }

    private final cii b() {
        return (cii) this.b.b();
    }

    public final ajdj<alaq> a() {
        Object a;
        String str;
        byte[] h = ((cii) this.a.get()).h();
        if ((h.length == 0 ? 1 : null) != null) {
            ((ilv) this.c.get()).c((ily) inm.EMPTY_RAW_USER_DATA_SKIP_INIT, 1);
            a = ajvo.a(ajlu.a);
            str = "Maybe.empty()";
        } else {
            Object alaq = new alaq();
            alaq.a(b().i());
            alaq.b(h);
            alaq.a(b().s());
            alaq.a = b().p();
            alaq.b = b().o();
            alaq.c = b().q();
            alaq.d = b().r();
            a = ajdj.b(alaq);
            str = "Maybe.just(\n            …()\n                    })";
        }
        akcr.a(a, str);
        return a;
    }
}
