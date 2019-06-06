package defpackage;

import defpackage.j.a;

/* renamed from: nke */
public final class nke {
    final zfw a = zgb.a(adcw.b.callsite("MapLifecycleManager"));
    final ajxe b = ajxh.a(new c(this));
    final ajei c = new ajei();
    final ajxe d = ajxh.a(new d(this));
    final adcu e;
    final ajdp<a> f;
    final ajwy<adcl> g;
    final ajwy<niw> h;
    final ajwy<aczt> i;
    final ajwy<acmf> j;
    private final ajxe k = ajxh.a(new b(this));

    /* renamed from: nke$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: nke$b */
    static final class b extends akcs implements akbk<acmf> {
        private /* synthetic */ nke a;

        b(nke nke) {
            this.a = nke;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (acmf) this.a.j.get();
        }
    }

    /* renamed from: nke$c */
    static final class c extends akcs implements akbk<acml> {
        private /* synthetic */ nke a;

        c(nke nke) {
            this.a = nke;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().a();
        }
    }

    /* renamed from: nke$d */
    static final class d extends akcs implements akbk<niw> {
        private /* synthetic */ nke a;

        d(nke nke) {
            this.a = nke;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (niw) this.a.h.get();
        }
    }

    /* renamed from: nke$e */
    static final class e<T> implements ajfb<a> {
        private /* synthetic */ nke a;

        e(nke nke) {
            this.a = nke;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            if (aVar != null) {
                int i = nkf.a[aVar.ordinal()];
                nke nke;
                if (i == 1) {
                    nke = this.a;
                    if (nke.e.b() && nke.e.a()) {
                        try {
                            if (((niw) nke.d.b()).b() != null) {
                                nke.a().b().a(nke.g, nke.i);
                            }
                        } catch (InternalError e) {
                            if (!akcr.a((Object) "Thread starting during runtime shutdown", e.getMessage())) {
                                throw e;
                            }
                        }
                    }
                } else if (i == 2) {
                    nke = this.a;
                    if (nke.e.b()) {
                        if (nke.e.a()) {
                            ((acml) nke.b.b()).a();
                            ((adcl) nke.g.get()).a();
                            nke.c.a();
                        }
                    }
                }
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(nke.class), "hostDelegateFactory", "getHostDelegateFactory()Lcom/snapchat/map/api/BaseMapImplementation;"), new akdc(akde.a(nke.class), "mapRequestManager", "getMapRequestManager()Lcom/snapchat/map/api/MapRequestMakerManager;"), new akdc(akde.a(nke.class), "mapUserDataProvider", "getMapUserDataProvider()Lcom/snap/map/MapUserDataProvider;")};
        a aVar = new a();
    }

    public nke(zgb zgb, adcu adcu, ajdp<a> ajdp, ajwy<adcl> ajwy, ajwy<niw> ajwy2, ajwy<aczt> ajwy3, ajwy<acmf> ajwy4) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(adcu, "mapConfigurationProvider");
        akcr.b(ajdp, "activityLifecycleObservable");
        akcr.b(ajwy, "snapMapClient");
        akcr.b(ajwy2, "mapUserDataProviderProvider");
        akcr.b(ajwy3, "contentProviderProvider");
        akcr.b(ajwy4, "mapHostDelegateFactory");
        this.e = adcu;
        this.f = ajdp;
        this.g = ajwy;
        this.h = ajwy2;
        this.i = ajwy3;
        this.j = ajwy4;
    }

    /* Access modifiers changed, original: final */
    public final acmf a() {
        return (acmf) this.k.b();
    }
}
