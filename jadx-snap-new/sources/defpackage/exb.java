package defpackage;

/* renamed from: exb */
public final class exb {
    final ajwy<ajwo<ewp>> a;
    final ajwy<ajwo<ewx>> b;
    final ajwy<ajwo<exa>> c;
    final ajwy<ajwo<exc>> d;
    private final ajxe e = ajxh.a(new a(this));
    private final ajxe f = ajxh.a(new b(this));
    private final ajxe g = ajxh.a(new c(this));
    private final ajxe h = ajxh.a(new d(this));

    /* renamed from: exb$a */
    static final class a extends akcs implements akbk<ajwo<ewp>> {
        private /* synthetic */ exb a;

        a(exb exb) {
            this.a = exb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajwo) this.a.a.get();
        }
    }

    /* renamed from: exb$b */
    static final class b extends akcs implements akbk<ajwo<ewx>> {
        private /* synthetic */ exb a;

        b(exb exb) {
            this.a = exb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajwo) this.a.b.get();
        }
    }

    /* renamed from: exb$c */
    static final class c extends akcs implements akbk<ajwo<exa>> {
        private /* synthetic */ exb a;

        c(exb exb) {
            this.a = exb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajwo) this.a.c.get();
        }
    }

    /* renamed from: exb$d */
    static final class d extends akcs implements akbk<ajwo<exc>> {
        private /* synthetic */ exb a;

        d(exb exb) {
            this.a = exb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajwo) this.a.d.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(exb.class), "configExpiredPublisher", "getConfigExpiredPublisher()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(exb.class), "configSyncedPublisher", "getConfigSyncedPublisher()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(exb.class), "refreshConfigTtlsPublisher", "getRefreshConfigTtlsPublisher()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(exb.class), "writeGrapheneMetricsPublisher", "getWriteGrapheneMetricsPublisher()Lio/reactivex/subjects/PublishSubject;")};
    }

    public exb(ajwy<ajwo<ewp>> ajwy, ajwy<ajwo<ewx>> ajwy2, ajwy<ajwo<exa>> ajwy3, ajwy<ajwo<exc>> ajwy4) {
        akcr.b(ajwy, "configExpiredPublisherProvider");
        akcr.b(ajwy2, "configSyncedPublisherProvider");
        akcr.b(ajwy3, "refreshConfigTtlsPublisherProvider");
        akcr.b(ajwy4, "writeGrapheneMetricsPublisherProvider");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
    }

    private final ajwo<exc> e() {
        return (ajwo) this.h.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwo<ewp> a() {
        return (ajwo) this.e.b();
    }

    public final void a(exc exc) {
        akcr.b(exc, "event");
        e().a((Object) exc);
    }

    /* Access modifiers changed, original: final */
    public final ajwo<ewx> b() {
        return (ajwo) this.f.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwo<exa> c() {
        return (ajwo) this.g.b();
    }

    public final ajdp<exc> d() {
        Object f = e().f();
        akcr.a(f, "writeGrapheneMetricsPublisher.hide()");
        return f;
    }
}
