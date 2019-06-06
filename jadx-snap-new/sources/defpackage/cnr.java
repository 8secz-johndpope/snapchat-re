package defpackage;

import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import com.snap.ads.network.SnapAdsHttpInterface;
import defpackage.cnx.c;
import defpackage.cnx.d;
import defpackage.cnx.e;
import defpackage.cnx.f;
import defpackage.cyt.a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: cnr */
public final class cnr implements cko {
    final ajxe a;
    final ajxe b;
    final ajxe c;
    final cmd d;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j = ajxh.a(a.a);
    private final ajxe k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private cob o;

    /* renamed from: cnr$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("AdTracker");
        }
    }

    /* renamed from: cnr$b */
    static final class b extends akcs implements akbk<SnapAdsHttpInterface> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SnapAdsHttpInterface) this.a.get();
        }
    }

    /* renamed from: cnr$s */
    static final class s extends akcs implements akbk<zfw> {
        private /* synthetic */ cnr a;
        private /* synthetic */ ajwy b;

        s(cnr cnr, ajwy ajwy) {
            this.a = cnr;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a(this.a.b());
        }
    }

    /* renamed from: cnr$c */
    static final class c extends akcs implements akbk<cnm> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cnm) this.a.get();
        }
    }

    /* renamed from: cnr$q */
    static final class q extends akcs implements akbk<cnx> {
        private /* synthetic */ ajwy a;

        q(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cnx) this.a.get();
        }
    }

    /* renamed from: cnr$d */
    static final class d extends akcs implements akbk<ckn> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ckn) this.a.get();
        }
    }

    /* renamed from: cnr$l */
    static final class l extends akcs implements akbk<ilv> {
        private /* synthetic */ ajwy a;

        l(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.get();
        }
    }

    /* renamed from: cnr$f */
    static final class f extends akcs implements akbk<cnt> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cnt) this.a.get();
        }
    }

    /* renamed from: cnr$g */
    static final class g extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: cnr$t */
    static final class t extends akcs implements akbk<Long> {
        private /* synthetic */ cnr a;

        t(cnr cnr) {
            this.a = cnr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.d().h(cld.MUSHROOM_THIRD_PARTY_TRACK_NETWORK_REQUEST_TIMEOUT_SECONDS));
        }
    }

    /* renamed from: cnr$e */
    static final class e extends akcs implements akbk<Long> {
        private /* synthetic */ cnr a;

        e(cnr cnr) {
            this.a = cnr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.d().h(cld.MUSHROOM_AD_TRACK_NETWORK_REQUEST_TIMEOUT_SECONDS));
        }
    }

    /* renamed from: cnr$p */
    static final class p extends akcs implements akbk<cjt> {
        private /* synthetic */ ajwy a;

        p(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cjt) this.a.get();
        }
    }

    /* renamed from: cnr$r */
    static final class r extends akcs implements akbk<com> {
        private /* synthetic */ ajwy a;

        r(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (com) this.a.get();
        }
    }

    /* renamed from: cnr$aa */
    static final class aa<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ cnr a;

        aa(cnr cnr) {
            this.a = cnr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            cys cys = (cys) obj;
            akcr.b(cys, "it");
            obj = this.a.a().issueRequest(cys, cnr.a(2)).g(new m(cys));
            akcr.a(obj, "adNetworkApi\n           …st.url, exception = it) }");
            return obj.i();
        }
    }

    /* renamed from: cnr$h */
    static final class h<T, R> implements ajfc<albr, ajdb> {
        private /* synthetic */ cnr a;
        private /* synthetic */ cxo b;
        private /* synthetic */ String c;

        h(cnr cnr, cxo cxo, String str) {
            this.a = cnr;
            this.b = cxo;
            this.c = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            albr albr = (albr) obj;
            akcr.b(albr, "trackRequest");
            String str = "inventory_type";
            this.a.c().c(inm.TRACK_REQUEST_SEND.a(str, (Enum) this.b.b.a.a), 1);
            return this.a.a(this.c, albr, this.b.e);
        }
    }

    /* renamed from: cnr$i */
    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ cnr a;

        i(cnr cnr) {
            this.a = cnr;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            cjt e = this.a.e();
            ckt ckt = ckt.NORMAL;
            idd b = this.a.b();
            akcr.a(obj, "it");
            e.a(ckt, b, "track_failed", obj, false);
        }
    }

    /* renamed from: cnr$m */
    static final class m<T, R> implements ajfc<Throwable, cyt> {
        private /* synthetic */ cys a;

        m(cys cys) {
            this.a = cys;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return a.a(this.a.b, 0, th, null, 10);
        }
    }

    /* renamed from: cnr$n */
    static final class n<T, R> implements ajfc<T, R> {
        private /* synthetic */ cnr a;
        private /* synthetic */ albr b;
        private /* synthetic */ String c;
        private /* synthetic */ cyr d;

        /* renamed from: cnr$n$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            public static final 1 a = new 1();

            1() {
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return ajxw.a;
            }
        }

        /* renamed from: cnr$n$2 */
        static final class 2 extends akcs implements akbl<Throwable, ajxw> {
            public static final 2 a = new 2();

            2() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((Throwable) obj, "it");
                return ajxw.a;
            }
        }

        n(cnr cnr, albr albr, String str, cyr cyr) {
            this.a = cnr;
            this.b = albr;
            this.c = str;
            this.d = cyr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            cyt cyt = (cyt) obj;
            akcr.b(cyt, "it");
            int i = cyt.b;
            Object obj2 = (i == 0 || i == 429 || i == 408 || i > 499) ? 1 : null;
            if (obj2 != null) {
                cjl.a(((com) this.a.c.b()).a(this.b, this.c, this.d, this.a.f()), (akbk) 1.a, (akbl) 2.a, (cjo) this.a.d);
            }
            return cyt;
        }
    }

    /* renamed from: cnr$o */
    static final class o<T, R> implements ajfc<Throwable, cyt> {
        private /* synthetic */ cys a;

        o(cys cys) {
            this.a = cys;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return a.a(this.a.b, 0, th, null, 10);
        }
    }

    /* renamed from: cnr$u */
    static final class u<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ cnr a;
        private /* synthetic */ String b;
        private /* synthetic */ cvp c;

        u(cnr cnr, String str, cvp cvp) {
            this.a = cnr;
            this.b = str;
            this.c = cvp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            albr albr = (albr) obj;
            akcr.b(albr, "it");
            ((ckn) this.a.i.b()).a(this.b, albr);
            cnr cnr = this.a;
            cyr cyr = cyr.TRACK;
            String str = this.b;
            long longValue = ((Number) this.a.b.b()).longValue();
            cvp cvp = this.c;
            akcr.b(cyr, "requestType");
            akcr.b(str, "url");
            akcr.b(albr, "trackRequest");
            Object toByteArray = MessageNano.toByteArray(albr);
            akcr.a(toByteArray, "MessageNano.toByteArray(trackRequest)");
            cys cys = new cys(cyr, str, null, toByteArray, null, longValue, cvp, 20);
            obj = cnr.a().issueRequest(cys, cnr.a(cnr.f().d)).f(new n(cnr, albr, str, cyr)).g(new o(cys));
            akcr.a(obj, "adNetworkApi\n           …st.url, exception = it) }");
            return obj;
        }
    }

    /* renamed from: cnr$v */
    static final class v<T, R> implements ajfc<cyt, ajdb> {
        private /* synthetic */ cnr a;

        v(cnr cnr) {
            this.a = cnr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            cyt cyt = (cyt) obj;
            akcr.b(cyt, "it");
            ((ckn) this.a.i.b()).a(cyt);
            return ajvo.a(ajhn.a);
        }
    }

    /* renamed from: cnr$w */
    static final class w<T, R> implements ajfc<albr, ajdb> {
        private /* synthetic */ cnr a;
        private /* synthetic */ String b;

        w(cnr cnr, String str) {
            this.a = cnr;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            albr albr = (albr) obj;
            akcr.b(albr, "it");
            return this.a.a(this.b, albr, null);
        }
    }

    /* renamed from: cnr$z */
    static final class z<T, R> implements ajfc<T, R> {
        private /* synthetic */ cnr a;
        private /* synthetic */ Map b;

        z(cnr cnr, Map map) {
            this.a = cnr;
            this.b = map;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return new cys(cyr.THIRD_PARTY_TRACK, str, this.b, new byte[0], sac.GET, ((Number) this.a.a.b()).longValue(), null, 64);
        }
    }

    /* renamed from: cnr$ab */
    static final class ab extends akcs implements akbl<cyt, ajxw> {
        public static final ab a = new ab();

        ab() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    /* renamed from: cnr$ac */
    static final class ac extends akcs implements akbl<Throwable, ajxw> {
        public static final ac a = new ac();

        ac() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: cnr$j */
    static final class j extends akcs implements akbk<ajxw> {
        public static final j a = new j();

        j() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: cnr$k */
    static final class k extends akcs implements akbl<Throwable, ajxw> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: cnr$x */
    static final class x extends akcs implements akbk<ajxw> {
        public static final x a = new x();

        x() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: cnr$y */
    static final class y extends akcs implements akbl<Throwable, ajxw> {
        public static final y a = new y();

        y() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cnr.class), "adNetworkApi", "getAdNetworkApi()Lcom/snap/ads/network/SnapAdsHttpInterface;"), new akdc(akde.a(cnr.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(cnr.class), "adSourceProvider", "getAdSourceProvider()Lcom/snap/ads/core/lib/adsource/AdSourceProviderApi;"), new akdc(akde.a(cnr.class), "protoTrackRequestFactory", "getProtoTrackRequestFactory()Lcom/snap/ads/core/lib/adtrack/proto/ProtoTrackRequestFactory;"), new akdc(akde.a(cnr.class), "adTrackLogger", "getAdTrackLogger()Lcom/snap/ads/api/AdTrackNetworkingLoggerApi;"), new akdc(akde.a(cnr.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(cnr.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;"), new akdc(akde.a(cnr.class), "adTrackerThirdPartyUserAgent", "getAdTrackerThirdPartyUserAgent()Lcom/snap/ads/core/lib/adtrack/AdTrackerThirdPartyUserAgent;"), new akdc(akde.a(cnr.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(cnr.class), "thirdPartyTrackRequestTimeoutSeconds", "getThirdPartyTrackRequestTimeoutSeconds()J"), new akdc(akde.a(cnr.class), "adTrackRequestTimeoutSeconds", "getAdTrackRequestTimeoutSeconds()J"), new akdc(akde.a(cnr.class), "issuesReporter", "getIssuesReporter()Lcom/snap/ads/api/AdIssuesReporterApi;"), new akdc(akde.a(cnr.class), "retroRetryManager", "getRetroRetryManager()Lcom/snap/ads/core/lib/adtrack/retro/RetroRetryManager;")};
    }

    public cnr(ajwy<SnapAdsHttpInterface> ajwy, ajwy<zgb> ajwy2, ajwy<cnm> ajwy3, ajwy<cnx> ajwy4, ajwy<ckn> ajwy5, ajwy<cnt> ajwy6, ajwy<ftl> ajwy7, ajwy<ilv> ajwy8, cmd cmd, ajwy<cjt> ajwy9, ajwy<com> ajwy10) {
        akcr.b(ajwy, "snapAdsHttpInterfaceProvider");
        akcr.b(ajwy2, "schedulersProviderLazy");
        akcr.b(ajwy3, "adSourceProviderApiProvider");
        akcr.b(ajwy4, "protoTrackRequestFactoryProvider");
        akcr.b(ajwy5, "trackNetworkingLoggerApi");
        akcr.b(ajwy6, "adTrackerThirdPartyUserAgentProvider");
        akcr.b(ajwy7, "configProviderProvider");
        akcr.b(ajwy8, "grapheneProvider");
        akcr.b(cmd, "adDisposableManager");
        akcr.b(ajwy9, "issuesReporterProvider");
        akcr.b(ajwy10, "retroRetryManagerProvider");
        this.d = cmd;
        this.e = ajxh.a(new b(ajwy));
        this.f = ajxh.a(new s(this, ajwy2));
        this.g = ajxh.a(new c(ajwy3));
        this.h = ajxh.a(new q(ajwy4));
        this.i = ajxh.a(new d(ajwy5));
        this.k = ajxh.a(new l(ajwy8));
        this.l = ajxh.a(new f(ajwy6));
        this.m = ajxh.a(new g(ajwy7));
        this.a = ajxh.a(new t(this));
        this.b = ajxh.a(new e(this));
        this.n = ajxh.a(new p(ajwy9));
        this.c = ajxh.a(new r(ajwy10));
    }

    public static igo a(int i) {
        return new igo(igq.b, i, 0, 0, null, 16);
    }

    private final zfw g() {
        return (zfw) this.f.b();
    }

    private final cnm h() {
        return (cnm) this.g.b();
    }

    private final cnx i() {
        return (cnx) this.h.b();
    }

    private final cnt j() {
        return (cnt) this.l.b();
    }

    /* Access modifiers changed, original: final */
    public final ajcx a(String str, albr albr, cvp cvp) {
        Object e = ajdx.b((Object) albr).b((ajdw) g().g()).a((ajdw) g().b()).a((ajfc) new u(this, str, cvp)).e((ajfc) new v(this));
        akcr.a(e, "Single.just(trackRequest…plete()\n                }");
        return e;
    }

    /* Access modifiers changed, original: final */
    public final SnapAdsHttpInterface a() {
        return (SnapAdsHttpInterface) this.e.b();
    }

    public final void a(cxo cxo) {
        String str = "adTrackInfo";
        akcr.b(cxo, str);
        List list = cxo.d;
        Collection collection = list;
        Object obj = null;
        Object obj2 = (collection == null || collection.isEmpty()) ? 1 : null;
        if (obj2 == null) {
            a(list);
        }
        Map c = h().c();
        obj2 = (c == null || c.isEmpty()) ? 1 : null;
        Object a = (obj2 == null && c.containsKey(aecl.a.PRIMARY) && c.get(aecl.a.PRIMARY) != null) ? c.get(aecl.a.PRIMARY) : h().a(cnn.TRACK_HOST_AND_PATH_V2);
        a = Optional.fromNullable(a);
        akcr.a(a, "primaryAdSource");
        if (a.isPresent()) {
            obj2 = cxo.b.f;
            CharSequence charSequence = (CharSequence) obj2;
            if (charSequence == null || charSequence.length() == 0) {
                obj = 1;
            }
            if (obj != null) {
                e().a(ckt.HIGH, "track_url_missing");
                c().c((ily) inm.TRACK_URL_MISSING, 1);
                obj2 = ((ckk) a.get()).b;
            }
            akcr.b(cxo, str);
            akcr.b(obj2, "url");
            cnx i = i();
            akcr.b(cxo, str);
            Object a2 = ajdx.c((Callable) new cny(new c(i))).a((ajfc) new d(i, cxo));
            akcr.a(a2, "Single.fromCallable(this…      )\n                }");
            ajcx a3 = a2.e((ajfc) new h(this, cxo, obj2)).a((ajfb) new i(this)).a(ajfu.g);
            akcr.a((Object) a3, "protoTrackRequestFactory…       .onErrorComplete()");
            cjl.a(a3, (akbk) j.a, (akbl) k.a, (cjo) this.d);
            return;
        }
        e().a(ckt.HIGH, b(), "track_adsource_not_found", new Exception("track adsources not found"), false);
    }

    public final void a(String str, aflk aflk) {
        akcr.b(str, "url");
        akcr.b(aflk, "trackRequest");
        cnx i = i();
        akcr.b(aflk, "sojuTrackRequest");
        CharSequence charSequence = aflk.d;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj != null) {
            aflk.d = i.b.a();
        }
        Object a = ajdx.c((Callable) new cny(new e(i))).b((ajdw) ((zfw) i.a.b()).f()).a((ajfc) new f(i, aflk));
        akcr.a(a, "Single.fromCallable(this…quest))\n                }");
        ajcx e = a.e((ajfc) new w(this, str));
        akcr.a((Object) e, "protoTrackRequestFactory…e { trackProto(url, it) }");
        cjl.a(e, (akbk) x.a, (akbl) y.a, (cjo) this.d);
    }

    public final void a(List<String> list) {
        akcr.b(list, "urls");
        ajdp k = ajdp.b((Iterable) list).b((ajdw) g().g()).a((ajdw) g().b()).p(new z(this, ajzl.a(ajxs.a("User-Agent", j().a())))).k((ajfc) new aa(this));
        akcr.a((Object) k, "Observable.fromIterable(…rror(it).toObservable() }");
        cjl.a(k, (akbl) ab.a, (akbl) ac.a, (cjo) this.d);
    }

    /* Access modifiers changed, original: final */
    public final idd b() {
        return (idd) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final ilv c() {
        return (ilv) this.k.b();
    }

    /* Access modifiers changed, original: final */
    public final ftl d() {
        return (ftl) this.m.b();
    }

    /* Access modifiers changed, original: final */
    public final cjt e() {
        return (cjt) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final cob f() {
        if (this.o == null) {
            this.o = new cob(d().a((fth) cld.SNAP_ADS_RETRO_IS_ENABLED), d().h(cld.SNAP_ADS_RETRO_INITIAL_RETRY_DELAY_MILLIS), d().f(cld.SNAP_ADS_RETRO_MAX_NETWORK_RETRIES_PERSISTENCE), d().f(cld.SNAP_ADS_RETRO_MAX_NETWORK_RETRIES), d().h(cld.SNAP_ADS_RETRO_MAX_AGE_MILLIS), d().f(cld.SNAP_ADS_RETRO_MAX_RETRO_RETRIES));
        }
        cob cob = this.o;
        return cob == null ? cns.a : cob;
    }
}
