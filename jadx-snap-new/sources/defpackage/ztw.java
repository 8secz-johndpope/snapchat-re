package defpackage;

import defpackage.zts.a;

/* renamed from: ztw */
public final class ztw {
    final ajxe a = ajxh.a(new a(this));
    final aipn<dib> b;
    final ajwy<zug> c;
    final ztx d;
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: ztw$a */
    static final class a extends akcs implements akbk<dib> {
        private /* synthetic */ ztw a;

        a(ztw ztw) {
            this.a = ztw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dib) this.a.b.get();
        }
    }

    /* renamed from: ztw$b */
    static final class b extends akcs implements akbk<zug> {
        private /* synthetic */ ztw a;

        b(ztw ztw) {
            this.a = ztw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zug) this.a.c.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ztw.class), "blizzardEventLogger", "getBlizzardEventLogger()Lcom/snap/blizzard/BlizzardEventLogger;"), new akdc(akde.a(ztw.class), "grapheneMetricEmitter", "getGrapheneMetricEmitter()Lcom/snap/upload/api/UploadGrapheneMetricEmitter;")};
    }

    public ztw(aipn<dib> aipn, ajwy<zug> ajwy, ztx ztx) {
        akcr.b(aipn, "blizzardEventLoggerLazy");
        akcr.b(ajwy, "uploadGrapheneMetricEmitterProvider");
        akcr.b(ztx, "uploadMediaMetricsCreator");
        this.b = aipn;
        this.c = ajwy;
        this.d = ztx;
    }

    /* Access modifiers changed, original: final */
    public final zug a() {
        return (zug) this.e.b();
    }

    public final void a(acgp acgp, boolean z, long j) {
        akcr.b(acgp, "uploadLocation");
        boolean a = a.a(acgp);
        if (z) {
            a().a(a, j);
        }
        a().a(a, z);
    }
}
