package defpackage;

/* renamed from: gdn */
public final class gdn implements gdp {
    private final ajxe a;

    /* renamed from: gdn$a */
    static final class a extends akcs implements akbk<ajws<gdj>> {
        final /* synthetic */ ihh a;
        private /* synthetic */ ajwy b;
        private /* synthetic */ ajwy c;

        /* renamed from: gdn$a$b */
        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                gdj gdj = (gdj) obj;
                akcr.b(gdj, "appState");
                return gdj;
            }
        }

        /* renamed from: gdn$a$a */
        static final class a<T> implements ajfb<gdj> {
            private /* synthetic */ a a;
            private /* synthetic */ ifi b;

            a(a aVar, ifi ifi) {
                this.a = aVar;
                this.b = ifi;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (gdj) obj;
                ifi ifi = this.b;
                akcr.a(obj, "appState");
                ifi.a(new gdl(obj, new ifl(this.a.a)));
            }
        }

        /* renamed from: gdn$a$c */
        static final class c<T> implements ajfb<Throwable> {
            public static final c a = new c();

            c() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        a(ajwy ajwy, ajwy ajwy2, ihh ihh) {
            this.b = ajwy;
            this.c = ajwy2;
            this.a = ihh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ifi a = ((ifg) this.b.get()).a();
            ajws r = ajwl.i(gdj.BACKGROUND).r();
            ajdp p = r.p(b.a);
            this.c.get();
            p.a((ajdw) zgb.a(iew.a.callsite(gdo.a)).f()).j(ajfu.a).a((ajfb) new a(this, a), (ajfb) c.a);
            return r;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gdn.class), "publisher", "getPublisher()Lio/reactivex/subjects/Subject;");
    }

    public gdn(ajwy<ifg> ajwy, ajwy<zgb> ajwy2, ihh ihh) {
        akcr.b(ajwy, "netEventBus");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(ihh, "clock");
        this.a = ajxh.a(new a(ajwy, ajwy2, ihh));
    }

    public final ajws<gdj> a() {
        return (ajws) this.a.b();
    }

    public final ajdp<gdj> b() {
        Object f = a().f();
        akcr.a(f, "publisher.hide()");
        return f;
    }
}
