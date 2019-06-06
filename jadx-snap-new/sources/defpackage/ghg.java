package defpackage;

import com.brightcove.player.event.Event;
import com.snap.core.net.content.impl.ContentManagerEvents.OnRequestComplete;
import defpackage.ggf.j;
import defpackage.ggf.k;
import defpackage.ggf.l;
import defpackage.gkz.a;
import defpackage.ryx.b;
import java.util.UUID;

/* renamed from: ghg */
public final class ghg implements geu {
    static final String d;
    final ajxe a;
    final ajxe b;
    final ajxe c;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;

    /* renamed from: ghg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ghg$d */
    static final class d extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: ghg$o */
    static final class o extends akcs implements akbk<ggf> {
        private /* synthetic */ ajwy a;

        o(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ggf) this.a.get();
        }
    }

    /* renamed from: ghg$c */
    static final class c extends akcs implements akbk<ihh> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    /* renamed from: ghg$b */
    static final class b extends akcs implements akbk<gkn> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gkn) this.a.get();
        }
    }

    /* renamed from: ghg$f */
    static final class f extends akcs implements akbk<rxl> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rxl) this.a.get();
        }
    }

    /* renamed from: ghg$e */
    static final class e extends akcs implements akbk<ryg> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ryg) this.a.get();
        }
    }

    /* renamed from: ghg$h */
    static final class h<T> implements ajfb<iff<OnRequestComplete>> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ghg$l */
    static final class l<T> implements ajfb<iff<b>> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ghg$g */
    static final class g extends akcq implements akbl<iff<OnRequestComplete>, Boolean> {
        g(ghg ghg) {
            super(1, ghg);
        }

        public final String getName() {
            return "isConsumeRequest";
        }

        public final akej getOwner() {
            return akde.a(ghg.class);
        }

        public final String getSignature() {
            return "isConsumeRequest(Lcom/snap/framework/network/event/NetEvent;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            geg geg = ((OnRequestComplete) iff.a).a;
            gej gej = ((OnRequestComplete) iff.a).b;
            boolean z = gej.a() && gej.f().a == gfc.CACHE && !gei.a(geg) && !geg.h().contains(gdy.READ_CACHE_ONLY);
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ghg$i */
    static final class i extends akcq implements akbl<iff<OnRequestComplete>, geq> {
        i(ghg ghg) {
            super(1, ghg);
        }

        public final String getName() {
            return "createConsumedEntry";
        }

        public final akej getOwner() {
            return akde.a(ghg.class);
        }

        public final String getSignature() {
            return "createConsumedEntry(Lcom/snap/framework/network/event/NetEvent;)Lcom/snap/core/net/content/api/DataConsumedEntry;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            return new geq(((OnRequestComplete) iff.a).a.a(), a.a(((OnRequestComplete) iff.a).a.f().c()), ((ghg) this.receiver).b().a(), ghg.d);
        }
    }

    /* renamed from: ghg$j */
    static final class j extends akcq implements akbl<geq, ajcx> {
        j(ggf ggf) {
            super(1, ggf);
        }

        public final String getName() {
            return "onContentConsumed";
        }

        public final akej getOwner() {
            return akde.a(ggf.class);
        }

        public final String getSignature() {
            return "onContentConsumed(Lcom/snap/core/net/content/api/DataConsumedEntry;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            geq geq = (geq) obj;
            akcr.b(geq, "p1");
            ggf ggf = (ggf) this.receiver;
            akcr.b(geq, "entry");
            obj = ajcx.a((ajev) new k(ggf, geq));
            akcr.a(obj, "Completable.fromAction {…rySubject.onNext(entry) }");
            return obj;
        }
    }

    /* renamed from: ghg$k */
    static final class k extends akcq implements akbl<iff<b>, Boolean> {
        k(ghg ghg) {
            super(1, ghg);
        }

        public final String getName() {
            return "isFetchRequest";
        }

        public final akej getOwner() {
            return akde.a(ghg.class);
        }

        public final String getSignature() {
            return "isFetchRequest(Lcom/snap/framework/network/event/NetEvent;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            boolean z = ((b) iff.a).c.a() && sap.b(((b) iff.a).a) != null;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ghg$m */
    static final class m extends akcq implements akbl<iff<b>, gev> {
        m(ghg ghg) {
            super(1, ghg);
        }

        public final String getName() {
            return "createFetchedEntry";
        }

        public final akej getOwner() {
            return akde.a(ghg.class);
        }

        public final String getSignature() {
            return "createFetchedEntry(Lcom/snap/framework/network/event/NetEvent;)Lcom/snap/core/net/content/api/DataFetchedEntry;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            ghg ghg = (ghg) this.receiver;
            return new gev((b) iff.a, ghg.d, ghg.b().a(), ((rxk) ((rxl) ghg.b.b()).get()).c, ((gdl) ((gkn) ghg.a.b()).a()).a, ((ryg) ghg.c.b()).c());
        }
    }

    /* renamed from: ghg$n */
    static final class n extends akcq implements akbl<gev, ajcx> {
        n(ggf ggf) {
            super(1, ggf);
        }

        public final String getName() {
            return "onContentFetched";
        }

        public final akej getOwner() {
            return akde.a(ggf.class);
        }

        public final String getSignature() {
            return "onContentFetched(Lcom/snap/core/net/content/api/DataFetchedEntry;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            gev gev = (gev) obj;
            akcr.b(gev, "p1");
            ggf ggf = (ggf) this.receiver;
            akcr.b(gev, "entry");
            obj = ajcx.a((ajev) new l(ggf, gev));
            akcr.a(obj, "Completable.fromAction {…rySubject.onNext(entry) }");
            return obj;
        }
    }

    /* renamed from: ghg$p */
    static final class p extends akcq implements akbl<ajdp<iff<OnRequestComplete>>, ajcx> {
        p(ghg ghg) {
            super(1, ghg);
        }

        public final String getName() {
            return "onConsume";
        }

        public final akej getOwner() {
            return akde.a(ghg.class);
        }

        public final String getSignature() {
            return "onConsume(Lio/reactivex/Observable;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ajdp ajdp = (ajdp) obj;
            akcr.b(ajdp, "p1");
            ghg ghg = (ghg) this.receiver;
            akcr.b(ajdp, "observable");
            ghg ghg2 = ghg;
            obj = ajdp.a((ajfl) new ghi(new g(ghg2))).d((ajfb) h.a).p(new ghh(new i(ghg2))).a((ajfc) new ghh(new j(ghg.a())), false);
            akcr.a(obj, "observable.filter(::isCo…itory::onContentConsumed)");
            return obj;
        }
    }

    /* renamed from: ghg$q */
    static final class q extends akcq implements akbl<ajdp<iff<b>>, ajcx> {
        q(ghg ghg) {
            super(1, ghg);
        }

        public final String getName() {
            return "onFetch";
        }

        public final akej getOwner() {
            return akde.a(ghg.class);
        }

        public final String getSignature() {
            return "onFetch(Lio/reactivex/Observable;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ajdp ajdp = (ajdp) obj;
            akcr.b(ajdp, "p1");
            ghg ghg = (ghg) this.receiver;
            akcr.b(ajdp, "observable");
            ghg ghg2 = ghg;
            obj = ajdp.a((ajfl) new ghi(new k(ghg2))).d((ajfb) l.a).p(new ghh(new m(ghg2))).a((ajfc) new ghh(new n(ghg.a())), false);
            akcr.a(obj, "observable.filter(::isFe…sitory::onContentFetched)");
            return obj;
        }
    }

    /* renamed from: ghg$r */
    static final class r extends akcq implements akbl<iff<gdl>, ajcx> {
        r(ggf ggf) {
            super(1, ggf);
        }

        public final String getName() {
            return "onAppBackground";
        }

        public final akej getOwner() {
            return akde.a(ggf.class);
        }

        public final String getSignature() {
            return "onAppBackground(Lcom/snap/framework/network/event/NetEvent;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            ggf ggf = (ggf) this.receiver;
            akcr.b(iff, "event");
            if (((gdl) iff.a).a == gdj.BACKGROUND) {
                obj = ajcx.a((ajev) new j(ggf));
                str = "Completable.fromAction {…nNext(Unit)\n            }";
            } else {
                obj = ajvo.a(ajhn.a);
                str = "Completable.complete()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ghg.class), Event.CONFIGURATION, "getConfiguration()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(ghg.class), "repository", "getRepository()Lcom/snap/core/net/content/impl/CacheDataConsumptionRepository;"), new akdc(akde.a(ghg.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(ghg.class), "appStateProvider", "getAppStateProvider()Lcom/snap/core/net/metrics/AppStateChangeEventSubscriber;"), new akdc(akde.a(ghg.class), "networkCondition", "getNetworkCondition()Lcom/snap/network/bandwidth/api/NetworkConditionProvider;"), new akdc(akde.a(ghg.class), "dataSaverPreferenceWrapper", "getDataSaverPreferenceWrapper()Lcom/snap/network/datasaver/DataSaverPreferenceWrapper;")};
        a aVar = new a();
        Object uuid = UUID.randomUUID().toString();
        akcr.a(uuid, "UUID.randomUUID().toString()");
        d = uuid;
    }

    public ghg(ajwy<ftl> ajwy, ajwy<ggf> ajwy2, ajwy<ihh> ajwy3, ajwy<gkn> ajwy4, ajwy<ryg> ajwy5, ajwy<rxl> ajwy6) {
        akcr.b(ajwy, "configurationProvider");
        akcr.b(ajwy2, "repositoryProvider");
        akcr.b(ajwy3, "clockProvider");
        akcr.b(ajwy4, "appStateProviderProvider");
        akcr.b(ajwy5, "dataSaverPreferenceWrapperProvider");
        akcr.b(ajwy6, "networkConditionProvider");
        this.e = ajxh.a(new d(ajwy));
        this.f = ajxh.a(new o(ajwy2));
        this.g = ajxh.a(new c(ajwy3));
        this.a = ajxh.a(new b(ajwy4));
        this.b = ajxh.a(new f(ajwy6));
        this.c = ajxh.a(new e(ajwy5));
    }

    /* Access modifiers changed, original: final */
    public final ggf a() {
        return (ggf) this.f.b();
    }

    public final void a(ifg ifg) {
        akcr.b(ifg, "netEventBus");
        if (((ftl) this.e.b()).a((fth) rxp.DATA_CONSUMPTION_LOGGING)) {
            ghg ghg = this;
            ifg.b(OnRequestComplete.class, new p(ghg));
            ifg.b(b.class, new q(ghg));
            ifg.a(gdl.class, (akbl) new r(a()));
        }
    }

    /* Access modifiers changed, original: final */
    public final ihh b() {
        return (ihh) this.g.b();
    }
}
