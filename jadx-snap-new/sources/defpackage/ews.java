package defpackage;

import android.net.NetworkInfo;
import com.google.protobuf.nano.BoolValue;
import com.snap.core.db.record.ConfigEtagModel;
import com.snap.core.db.record.NetworkGatewayInfoModel;
import defpackage.acbx.a;
import defpackage.aivl.e;
import defpackage.akdd.d;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ews */
public final class ews {
    final ajxe a;
    final ajxe b;
    final ajxe c;
    final ajwy<exb> d;
    final ajwy<a> e;
    final ajwy<wja> f;
    final ajwy<ewn> g;
    final ajwy<ilv> h;
    final ajwy<ihh> i;
    final ajwy<iib> j;
    final ajwy<ifa> k;
    final ajwy<fik> l;
    private final ajxe m = ajxh.a(new g(this));
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;

    /* renamed from: ews$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ews$g */
    static final class g extends akcs implements akbk<exb> {
        private /* synthetic */ ews a;

        g(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (exb) this.a.d.get();
        }
    }

    /* renamed from: ews$r */
    static final class r extends akcs implements akbk<zgb> {
        private /* synthetic */ ajwy a;

        r(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zgb) this.a.get();
        }
    }

    /* renamed from: ews$q */
    static final class q extends akcs implements akbk<zfw> {
        private /* synthetic */ ews a;

        q(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a.b();
            return zgb.a(evh.a.callsite("ConfigSyncEngine"));
        }
    }

    /* renamed from: ews$l */
    static final class l extends akcs implements akbk<ilv> {
        private /* synthetic */ ews a;

        l(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.h.get();
        }
    }

    /* renamed from: ews$c */
    static final class c extends akcs implements akbk<ihh> {
        private /* synthetic */ ews a;

        c(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.i.get();
        }
    }

    /* renamed from: ews$b */
    static final class b extends akcs implements akbk<a> {
        private /* synthetic */ ews a;

        b(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (a) this.a.e.get();
        }
    }

    /* renamed from: ews$s */
    static final class s extends akcs implements akbk<iib> {
        private /* synthetic */ ews a;

        s(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iib) this.a.j.get();
        }
    }

    /* renamed from: ews$h */
    static final class h extends akcs implements akbk<ewn> {
        private /* synthetic */ ews a;

        h(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ewn) this.a.g.get();
        }
    }

    /* renamed from: ews$o */
    static final class o extends akcs implements akbk<ifa> {
        private /* synthetic */ ews a;

        o(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ifa) this.a.k.get();
        }
    }

    /* renamed from: ews$d */
    static final class d extends akcs implements akbk<fik> {
        private /* synthetic */ ews a;

        d(ews ews) {
            this.a = ews;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (fik) this.a.l.get();
        }
    }

    /* renamed from: ews$f */
    static final class f extends akcq implements akbl<acca, ajdj<accb>> {
        f(ews ews) {
            super(1, ews);
        }

        public final String getName() {
            return "issueAndProcessRequest";
        }

        public final akej getOwner() {
            return akde.a(ews.class);
        }

        public final String getSignature() {
            return "issueAndProcessRequest(Lcom/snapchat/cdp/cof/nano/ConfigTargetingRequest;)Lio/reactivex/Maybe;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            acca acca = (acca) obj;
            akcr.b(acca, "p1");
            ews ews = (ews) this.receiver;
            d dVar = new d();
            dVar.a = -1;
            ajdx b = ((wja) ews.f.get()).a(wjd.API_GATEWAY).b((ajfb) new i(ews, dVar));
            akcr.a((Object) b, "rxSnapToken.get().getAcc…illis()\n                }");
            Object f = ign.a(b, (ajdw) ews.a().f()).a((ajdw) ews.a().b()).f(new j(ews, dVar));
            akcr.a(f, "rxSnapToken.get().getAcc…eader);\n                }");
            obj = f.a((ajdw) ews.a().g()).b((ajfc) new m(ews, acca)).a((ajfb) new n(ews));
            akcr.a(obj, "generateStubWithHeader()…      }\n                }");
            return obj;
        }
    }

    /* renamed from: ews$k */
    static final class k<T> implements ajfb<String> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ews$e */
    static final class e<T1, T2, T3, R> implements ajfd<String, iib.a, List<? extends acbu>, acca> {
        private /* synthetic */ ews a;

        e(ews ews) {
            this.a = ews;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            iib.a aVar = (iib.a) obj2;
            List list = (List) obj3;
            String str2 = ConfigEtagModel.ETAG;
            akcr.b(str, str2);
            String str3 = "screenParameters";
            akcr.b(aVar, str3);
            String str4 = "benchmarkResults";
            akcr.b(list, str4);
            iex g = ((ifa) this.a.r.b()).g();
            NetworkInfo f = ((ifa) this.a.r.b()).f();
            Boolean valueOf = f != null ? Boolean.valueOf(f.isRoaming()) : null;
            int m = ((ifa) this.a.r.b()).m() ^ 1;
            akcr.b(str, str2);
            akcr.b(aVar, str3);
            akcr.b(g, "networkReachability");
            akcr.b(list, str4);
            acca acca = new acca();
            acca.a(str);
            obj = aVar.a;
            str3 = "screenParameters.resolution";
            akcr.a(obj, str3);
            acca.a(obj.a());
            obj = aVar.a;
            akcr.a(obj, str3);
            acca.b(obj.b());
            acca.c(aVar.d);
            acca.d(aVar.c);
            acca.a = new accc();
            acca.a.a = new BoolValue().setValue(m);
            int i = ewt.a[g.ordinal()];
            if (i == 1) {
                acca.a.a(1);
            } else if (i == 2) {
                acca.a.a(2);
            }
            if (valueOf != null) {
                acca.a.b = new BoolValue().setValue(valueOf.booleanValue());
            }
            acca.b();
            Object[] toArray = list.toArray(new acbu[0]);
            if (toArray != null) {
                acca.b = (acbu[]) toArray;
                return acca;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: ews$i */
    static final class i<T> implements ajfb<ajej> {
        private /* synthetic */ ews a;
        private /* synthetic */ d b;

        i(ews ews, d dVar) {
            this.a = ews;
            this.b = dVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.a = ((ihh) this.a.p.b()).a();
        }
    }

    /* renamed from: ews$j */
    static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ ews a;
        private /* synthetic */ d b;

        j(ews ews, d dVar) {
            this.a = ews;
            this.b = dVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (String) obj;
            akcr.b(obj, "token");
            ily ily = inr.FETCH_SNAP_TOKEN;
            ((ilv) this.a.o.b()).a(ily, ((ihh) this.a.p.b()).a() - this.b.a);
            ((ilv) this.a.o.b()).c(ily, 1);
            aivl aivl = new aivl();
            aivl.a(e.a("X-Snap-Access-Token", aivl.a), obj);
            return (a) ajat.a((a) this.a.b.b(), aivl);
        }
    }

    /* renamed from: ews$m */
    static final class m<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ ews a;
        final /* synthetic */ acca b;

        /* renamed from: ews$m$2 */
        static final class 2<T, R> implements ajfc<T, ajdn<? extends R>> {
            private /* synthetic */ m a;

            2(m mVar) {
                this.a = mVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x008d  */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
                /*
                r8 = this;
                r9 = (defpackage.accb) r9;
                r0 = "response";
                defpackage.akcr.b(r9, r0);
                r0 = r9.a();
                r1 = r8.a;
                r1 = r1.b;
                r1 = r1.a();
                r0 = defpackage.akcr.a(r0, r1);
                r1 = 1;
                r0 = r0 ^ r1;
                if (r0 == 0) goto L_0x0049;
            L_0x001b:
                r0 = r8.a;
                r0 = r0.a;
                r2 = r9.a();
                r3 = "response.configResultsEtag";
                defpackage.akcr.a(r2, r3);
                r0 = r0.b();
                r3 = "etag";
                defpackage.akcr.b(r2, r3);
                r3 = r0.a();
                r4 = new ewn$e;
                r4.<init>(r0, r2);
                r4 = (defpackage.akbl) r4;
                r0 = "ConfigEtagRepository.updateEtag";
                r0 = r3.callInTransaction(r0, r4);
                r0 = r0.e();
                r2 = "etagRepository.updateEta…ultsEtag).ignoreElement()";
                goto L_0x0051;
            L_0x0049:
                r0 = defpackage.ajhn.a;
                r0 = defpackage.ajvo.a(r0);
                r2 = "Completable.complete()";
            L_0x0051:
                defpackage.akcr.a(r0, r2);
                r2 = r8.a;
                r2 = r2.a;
                r3 = r8.a;
                r3 = r3.b;
                r4 = 0;
                r5 = "Single.just(true)";
                if (r9 == 0) goto L_0x0082;
            L_0x0061:
                r6 = r3.b;
                if (r6 == 0) goto L_0x0082;
            L_0x0065:
                r6 = r6.length;
                if (r6 != 0) goto L_0x006a;
            L_0x0068:
                r6 = 1;
                goto L_0x006b;
            L_0x006a:
                r6 = 0;
            L_0x006b:
                r6 = r6 ^ r1;
                if (r6 != r1) goto L_0x0082;
            L_0x006e:
                r6 = r2.c();
                r3 = r3.b;
                r7 = "request.benchmarkResults";
                defpackage.akcr.a(r3, r7);
                r3 = defpackage.ajyi.i(r3);
                r3 = r6.a(r3);
                goto L_0x008b;
            L_0x0082:
                r3 = java.lang.Boolean.TRUE;
                r3 = defpackage.ajdx.b(r3);
                defpackage.akcr.a(r3, r5);
            L_0x008b:
                if (r9 == 0) goto L_0x00ac;
            L_0x008d:
                r6 = r9.b;
                if (r6 == 0) goto L_0x00ac;
            L_0x0091:
                r6 = r6.a;
                if (r6 == 0) goto L_0x00ac;
            L_0x0095:
                r6 = r6.length;
                if (r6 != 0) goto L_0x0099;
            L_0x0098:
                r4 = 1;
            L_0x0099:
                r4 = r4 ^ r1;
                if (r4 != r1) goto L_0x00ac;
            L_0x009c:
                r1 = r2.c();
                r2 = r9.b;
                r4 = "response.benchmarkRequest";
                defpackage.akcr.a(r2, r4);
                r1 = r1.a(r2);
                goto L_0x00b5;
            L_0x00ac:
                r1 = java.lang.Boolean.TRUE;
                r1 = defpackage.ajdx.b(r1);
                defpackage.akcr.a(r1, r5);
            L_0x00b5:
                r3 = (defpackage.ajeb) r3;
                r1 = (defpackage.ajeb) r1;
                r2 = new ews$p;
                r2.<init>();
                r2 = (defpackage.ajex) r2;
                r1 = defpackage.ajdx.a(r3, r1, r2);
                r2 = "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })";
                defpackage.akcr.a(r1, r2);
                r1 = r1.e();
                r1 = (defpackage.ajdb) r1;
                r0 = r0.b(r1);
                r9 = defpackage.ajdj.b(r9);
                r9 = (defpackage.ajdn) r9;
                r9 = r0.a(r9);
                return r9;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ews$m$2.apply(java.lang.Object):java.lang.Object");
            }
        }

        m(ews ews, acca acca) {
            this.a = ews;
            this.b = acca;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final a aVar = (a) obj;
            akcr.b(aVar, "requestStub");
            return ajdj.b((Callable) new Callable<T>(this) {
                private /* synthetic */ m a;

                public final /* synthetic */ Object call() {
                    long a = ((ihh) this.a.a.p.b()).a();
                    accb a2 = aVar.a(this.a.b);
                    ily ily = inr.SYNC_REQUEST;
                    ((ilv) this.a.a.o.b()).a(ily, ((ihh) this.a.a.p.b()).a() - a);
                    if (a2 != null) {
                        Object exa;
                        ajwo c;
                        boolean a3 = akcr.a(a2.a(), this.a.b.a());
                        ((ilv) this.a.a.o.b()).c(inr.SYNC_REQUEST.a("success", true).a("has_configs", a3 ^ 1), 1);
                        String str = "event";
                        exb d;
                        if (a3) {
                            d = ((exb) this.a.a.m.b());
                            exa = new exa(((ihh) this.a.a.p.b()).a());
                            akcr.b(exa, str);
                            c = d.c();
                        } else {
                            ((ilv) this.a.a.o.b()).b(ily, (long) a2.a.length);
                            d = ((exb) this.a.a.m.b());
                            Object obj = a2.a;
                            akcr.a(obj, "targetingResponse.configResults");
                            exa = new ewx(obj, a2.b());
                            akcr.b(exa, str);
                            c = d.b();
                        }
                        c.a(exa);
                    }
                    return a2;
                }
            }).a((ajdw) this.a.a().b()).a((ajfc) new 2(this));
        }
    }

    /* renamed from: ews$n */
    static final class n<T> implements ajfb<Throwable> {
        private /* synthetic */ ews a;

        n(ews ews) {
            this.a = ews;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ((ilv) this.a.o.b()).c(inr.SYNC_REQUEST.a("success", false), 1);
            if (th instanceof aivy) {
                ilv c = ((ilv) this.a.o.b());
                obj = ((aivy) th).a();
                akcr.a(obj, "error.status");
                String str = "error_code";
                c.c(inr.SYNC_REQUEST_ERROR.a("error_source", NetworkGatewayInfoModel.SERVER).a(str, String.valueOf((long) obj.a().a())), 1);
            } else if (th instanceof wjo) {
                ((ilv) this.a.o.b()).c(exg.a((long) ((wjo) th).a.ordinal()), 1);
            } else {
                ((ilv) this.a.o.b()).c(exg.a(-1), 1);
            }
        }
    }

    /* renamed from: ews$p */
    public static final class p<T1, T2, R> implements ajex<Boolean, Boolean, R> {
        public final R apply(Boolean bool, Boolean bool2) {
            return Boolean.valueOf(bool.booleanValue() & bool2.booleanValue());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ews.class), "dispatcher", "getDispatcher()Lcom/snap/circumstanceengine/lib/SyncEngineActionDispatcher;"), new akdc(akde.a(ews.class), "schedulersProvider", "getSchedulersProvider()Lcom/snap/taskexecution/scheduling/SchedulersProvider;"), new akdc(akde.a(ews.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ews.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;"), new akdc(akde.a(ews.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(ews.class), "circumstanceService", "getCircumstanceService()Lcom/snapchat/cdp/cof/nano/CircumstancesServiceGrpc$CircumstancesServiceBlockingStub;"), new akdc(akde.a(ews.class), "screenParameterProvider", "getScreenParameterProvider()Lcom/snap/framework/util/ScreenParameterProvider;"), new akdc(akde.a(ews.class), "etagRepository", "getEtagRepository()Lcom/snap/circumstanceengine/lib/ConfigEtagRepository;"), new akdc(akde.a(ews.class), "networkStatusManager", "getNetworkStatusManager()Lcom/snap/framework/network/RxNetworkStatusManager;"), new akdc(akde.a(ews.class), "collectionService", "getCollectionService()Lcom/snap/collectionservice/api/CollectionService;")};
        a aVar = new a();
    }

    public ews(ajwy<exb> ajwy, ajwy<zgb> ajwy2, ajwy<a> ajwy3, ajwy<wja> ajwy4, ajwy<ewn> ajwy5, ajwy<ilv> ajwy6, ajwy<ihh> ajwy7, ajwy<iib> ajwy8, ajwy<ifa> ajwy9, ajwy<fik> ajwy10) {
        akcr.b(ajwy, "dispatcherProvider");
        akcr.b(ajwy2, "schedulersProviderProvider");
        akcr.b(ajwy3, "circumstanceServiceProvider");
        akcr.b(ajwy4, "rxSnapToken");
        akcr.b(ajwy5, "etagRepositoryProvider");
        akcr.b(ajwy6, "grapheneProvider");
        akcr.b(ajwy7, "clockProvider");
        akcr.b(ajwy8, "screenParameterProviderProvider");
        akcr.b(ajwy9, "networkStatusManagerProvider");
        akcr.b(ajwy10, "collectionServiceProvider");
        this.d = ajwy;
        this.e = ajwy3;
        this.f = ajwy4;
        this.g = ajwy5;
        this.h = ajwy6;
        this.i = ajwy7;
        this.j = ajwy8;
        this.k = ajwy9;
        this.l = ajwy10;
        this.a = ajxh.a(new r(ajwy2));
        this.n = ajxh.a(new q(this));
        this.o = ajxh.a(new l(this));
        this.p = ajxh.a(new c(this));
        this.b = ajxh.a(new b(this));
        this.c = ajxh.a(new s(this));
        this.q = ajxh.a(new h(this));
        this.r = ajxh.a(new o(this));
        this.s = ajxh.a(new d(this));
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final ewn b() {
        return (ewn) this.q.b();
    }

    /* Access modifiers changed, original: final */
    public final fik c() {
        return (fik) this.s.b();
    }
}
