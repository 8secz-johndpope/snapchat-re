package defpackage;

import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.acnf.b;
import java.util.List;
import java.util.Set;

/* renamed from: acnd */
public final class acnd implements addk {
    final ajwy<acnf> a;
    final wmg b;
    private final zfw c = zgb.a(adcw.b.callsite("EggHuntImpl"));
    private final ajxe d = ajxh.a(ajxj.PUBLICATION, new d(this));
    private final ajxe e = ajxh.a(new b(this));
    private final ftl f;

    /* renamed from: acnd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acnd$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ acnd a;

        c(acnd acnd) {
            this.a = acnd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            if (bool.booleanValue()) {
                return this.a.a().b();
            }
            obj = ajdp.b(new addm(null, false, 12));
            akcr.a(obj, "Observable.just(GameStat…, showUserScore = false))");
            return obj;
        }
    }

    /* renamed from: acnd$e */
    static final class e<T> implements ajfb<String> {
        private /* synthetic */ acnd a;

        e(acnd acnd) {
            this.a = acnd;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            wmg wmg = this.a.b;
            alpu alpu = new alpu();
            alpu.a("snapchat://map-game-friend-leaderboard.serengeti");
            alpz alpz = new alpz();
            alpz.a("#ffffff");
            alpu.c = alpz;
            Object obj2 = wmg.b;
            akcr.a(obj2, "SerengetiLauncher.RIGHT_TO_LEFT_NAVIGATION_ACTION");
            wmg.a(alpu, obj2, false, str);
        }
    }

    /* renamed from: acnd$b */
    static final class b extends akcs implements akbk<ajdp<List<? extends addl>>> {
        private /* synthetic */ acnd a;

        /* renamed from: acnd$b$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Set set = (Set) obj;
                akcr.b(set, "eggSet");
                return ajyu.k(set);
            }
        }

        b(acnd acnd) {
            this.a = acnd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().c().p(1.a).i().g(ajfu.d);
        }
    }

    /* renamed from: acnd$d */
    static final class d extends akcs implements akbk<acnf> {
        private /* synthetic */ acnd a;

        d(acnd acnd) {
            this.a = acnd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (acnf) this.a.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acnd.class), MapboxEvent.KEY_MODEL, "getModel()Lcom/snapchat/map/egghunt/EggHuntReactiveModel;"), new akdc(akde.a(acnd.class), "acquiredEggsListObservable", "getAcquiredEggsListObservable()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public acnd(ajwy<acnf> ajwy, wmg wmg, zgb zgb, ftl ftl) {
        akcr.b(ajwy, "modelProvider");
        akcr.b(wmg, "serengetiLauncher");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ftl, "config");
        this.a = ajwy;
        this.b = wmg;
        this.f = ftl;
    }

    /* Access modifiers changed, original: final */
    public final acnf a() {
        return (acnf) this.d.b();
    }

    public final ajdx<Boolean> a(addl addl) {
        String str = "egg";
        akcr.b(addl, str);
        acnf a = a();
        akcr.b(addl, str);
        Object f = a.c().e().f(new b(a, addl));
        akcr.a(f, "acquiredEggsSetObservabl…   true\n                }");
        return f;
    }

    public final ajdp<Boolean> b() {
        Object p = this.f.p(adew.EGG_HUNT);
        akcr.a(p, "config.observeBoolean(Ma…onfigurationKey.EGG_HUNT)");
        return p;
    }

    public final ajdp<addm> c() {
        Object g = b().u(new c(this)).i().g(ajfu.d);
        akcr.a(g, "isGameEnabled()\n        …           .autoConnect()");
        return g;
    }

    public final ajdp<List<addl>> d() {
        return (ajdp) this.e.b();
    }

    public final ajdp<Optional<addl>> e() {
        return a().b;
    }

    public final ajcx f() {
        Object e = this.f.k(adew.LEADERBOARD_SERENGETI_REGISTRY).a((ajdw) this.c.l()).c((ajfb) new e(this)).e();
        akcr.a(e, "config.getStringConfig(M…        }.ignoreElement()");
        return e;
    }
}
