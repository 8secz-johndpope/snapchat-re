package defpackage;

/* renamed from: rwc */
public final class rwc implements zii {
    static final String b = b;
    final ajwy<jwk> a;
    private final ajxe c;
    private idl d;

    /* renamed from: rwc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: rwc$c */
    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        c(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(jwp.a, rwc.b);
        }
    }

    /* renamed from: rwc$b */
    static final class b implements Runnable {
        private /* synthetic */ rwc a;

        b(rwc rwc) {
            this.a = rwc;
        }

        public final void run() {
            ((jwk) this.a.a.get()).a(iot.BITMAP_PER_PAGE);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rwc.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public rwc(ajwy<jwk> ajwy, zgb zgb) {
        akcr.b(ajwy, "disposableBitmapTracker");
        akcr.b(zgb, "schedulersProvider");
        this.a = ajwy;
        this.c = ajxh.a(new c(zgb));
    }

    public final void a() {
        ((jwk) this.a.get()).a(iot.BITMAP_PER_PAGE);
        this.d = null;
    }

    public final void a(idl idl) {
        akcr.b(idl, "uiPage");
        if (this.d != null) {
            ((zfw) this.c.b()).b().a((Runnable) new b(this));
        }
        this.d = idl;
    }
}
