package defpackage;

/* renamed from: qxh */
public final class qxh {
    final aipn<dis> a;
    private final ajxe b = ajxh.a(new b(this));

    /* renamed from: qxh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: qxh$b */
    static final class b extends akcs implements akbk<dis> {
        private /* synthetic */ qxh a;

        b(qxh qxh) {
            this.a = qxh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dis) this.a.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qxh.class), "eventLogger", "getEventLogger()Lcom/snap/blizzard/EventLogger;");
        a aVar = new a();
    }

    public qxh(aipn<dis> aipn) {
        akcr.b(aipn, "eventLoggerLazy");
        this.a = aipn;
    }

    public final void a(aakh aakh, aakg aakg, long j, long j2, long j3) {
        akcr.b(aakg, "action");
        aaki aaki = new aaki();
        aaki.a(aakg);
        aaki.a(aakh);
        aaki.a(Long.valueOf(j));
        aaki.b(Long.valueOf(j2));
        aaki.c(Long.valueOf(j3));
        ((dis) this.b.b()).a(aaki);
    }
}
