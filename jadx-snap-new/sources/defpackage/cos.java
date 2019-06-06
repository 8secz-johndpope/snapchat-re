package defpackage;

import com.snap.ads.core.lib.network.AdRequestHttpInterface;
import com.snap.ads.network.SnapAdsHttpInterface;
import defpackage.akdd.a;
import defpackage.akdd.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: cos */
public final class cos implements SnapAdsHttpInterface {
    final ajwy<ilv> a;
    final cjt b;
    private final ajxe c;
    private final ajxe d;
    private final ajxe e = ajxh.a(b.a);
    private final ajxe f;
    private final ajxe g;
    private final abqo h;

    /* renamed from: cos$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("SnapAdsHttpClient");
        }
    }

    /* renamed from: cos$j */
    static final class j extends akcs implements akbk<akho> {
        public static final j a = new j();

        j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return akho.a("application/x-protobuf");
        }
    }

    /* renamed from: cos$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cos$c */
    static final class c extends akcs implements akbk<AdRequestHttpInterface> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((cor) this.a.get()).a();
        }
    }

    /* renamed from: cos$d */
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

    /* renamed from: cos$l */
    static final class l extends akcs implements akbk<zfw> {
        private /* synthetic */ cos a;
        private /* synthetic */ zgb b;

        l(cos cos, zgb zgb) {
            this.a = cos;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.a());
        }
    }

    /* renamed from: cos$k */
    static final class k<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (akws) obj;
            akcr.b(obj, "it");
            return !obj.e() ? ajdx.b((Throwable) new akwn(obj)) : ajdx.b(obj);
        }
    }

    /* renamed from: cos$e */
    static final class e<T> implements ajfb<ajej> {
        private /* synthetic */ cos a;
        private /* synthetic */ d b;

        e(cos cos, d dVar) {
            this.a = cos;
            this.b = dVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.a = abqo.c();
        }
    }

    /* renamed from: cos$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ cos a;
        private /* synthetic */ cys b;
        private /* synthetic */ d c;

        f(cos cos, cys cys, d dVar) {
            this.a = cos;
            this.b = cys;
            this.c = dVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akws akws = (akws) obj;
            akcr.b(akws, "it");
            this.a.a(this.b, akws.b());
            String str = this.b.b;
            int b = akws.b();
            String c = akws.c();
            akhw g = akws.g();
            Throwable th = g != null ? new Throwable(g.g()) : null;
            g = (akhw) akws.f();
            byte[] e = g != null ? g.e() : null;
            long c2 = abqo.c() - this.c.a;
            Object d = akws.d();
            akcr.a(d, "it.headers()");
            return new cyt(str, b, c, th, e, c2, d);
        }
    }

    /* renamed from: cos$g */
    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ cos a;
        private /* synthetic */ a b;
        private /* synthetic */ cys c;

        g(cos cos, a aVar, cys cys) {
            this.a = cos;
            this.b = aVar;
            this.c = cys;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            int i = 0;
            this.b.a = false;
            cos cos = this.a;
            cys cys = this.c;
            akcr.a(obj, "it");
            akcr.b(cys, "snapAdsRequest");
            akcr.b(obj, "throwable");
            akwn akwn = (akwn) (!(obj instanceof akwn) ? null : obj);
            if (akwn != null) {
                i = akwn.a();
            }
            cos.a(cys, i);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder("request_url: ");
            stringBuilder2.append(cys.b);
            String str = ppy.d;
            stringBuilder2.append(str);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("request_type: ");
            stringBuilder2.append(cys.a);
            stringBuilder2.append(str);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("throwable name: ");
            stringBuilder2.append(obj.getClass().getSimpleName());
            stringBuilder2.append(str);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("error_msg: ");
            stringBuilder2.append(obj.getMessage());
            stringBuilder2.append(str);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder("localized_message: ");
            stringBuilder2.append(obj.getLocalizedMessage());
            stringBuilder.append(stringBuilder2.toString());
            cos.b.a(ckt.NORMAL, cos.a(), "network_error", new Exception(stringBuilder.toString(), obj), true);
            ilv ilv = (ilv) cos.a.get();
            ilz a = inm.REQUEST_ERROR_INFO.a("req_type", (Enum) cys.a);
            String simpleName = obj.getClass().getSimpleName();
            akcr.a((Object) simpleName, "throwable::class.java.simpleName");
            ilv.c(a.a("exception_name", simpleName), 1);
        }
    }

    /* renamed from: cos$h */
    static final class h<T, R> implements ajfc<Throwable, cyt> {
        private /* synthetic */ cys a;

        h(cys cys) {
            this.a = cys;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            akwn akwn = (akwn) (!(th instanceof akwn) ? null : th);
            return cyt.a.a(this.a.b, akwn != null ? akwn.a() : 0, th, null, 8);
        }
    }

    /* renamed from: cos$i */
    static final class i implements ajev {
        private /* synthetic */ cos a;
        private /* synthetic */ a b;
        private /* synthetic */ cys c;
        private /* synthetic */ d d;

        i(cos cos, a aVar, cys cys, d dVar) {
            this.a = cos;
            this.b = aVar;
            this.c = cys;
            this.d = dVar;
        }

        /* JADX WARNING: Missing block: B:3:0x0033, code skipped:
            if (r2 == null) goto L_0x0035;
     */
        public final void run() {
            /*
            r8 = this;
            r0 = r8.a;
            r1 = r8.b;
            r1 = r1.a;
            r2 = r8.c;
            r3 = defpackage.abqo.c();
            r5 = r8.d;
            r5 = r5.a;
            r3 = r3 - r5;
            r0 = r0.a;
            r0 = r0.get();
            r0 = (defpackage.ilv) r0;
            r5 = defpackage.inm.AD_REQUEST_LATENCY;
            r6 = r2.a;
            r6 = (java.lang.Enum) r6;
            r7 = "req_type";
            r5 = r5.a(r7, r6);
            r6 = "succeeded";
            r1 = r5.a(r6, r1);
            r2 = r2.g;
            if (r2 == 0) goto L_0x0035;
        L_0x002f:
            r2 = r2.toString();
            if (r2 != 0) goto L_0x0037;
        L_0x0035:
            r2 = "none";
        L_0x0037:
            r5 = "ad_product";
            r1 = r1.a(r5, r2);
            r0.a(r1, r3);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cos$i.run():void");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cos.class), "adRequestHttpInterface", "getAdRequestHttpInterface()Lcom/snap/ads/core/lib/network/AdRequestHttpInterface;"), new akdc(akde.a(cos.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(cos.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(cos.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(cos.class), "protoMediaType", "getProtoMediaType()Lokhttp3/MediaType;")};
        a aVar = new a();
    }

    public cos(ajwy<cor> ajwy, zgb zgb, ajwy<ftl> ajwy2, abqo abqo, ajwy<ilv> ajwy3, cjt cjt) {
        akcr.b(ajwy, "adRequestHttpInterfaceFactoryProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "configProviderProvider");
        akcr.b(abqo, "clock");
        akcr.b(ajwy3, "graphene");
        akcr.b(cjt, "issuesReporter");
        this.h = abqo;
        this.a = ajwy3;
        this.b = cjt;
        this.c = ajxh.a(new c(ajwy));
        this.d = ajxh.a(new d(ajwy2));
        this.f = ajxh.a(new l(this, zgb));
        this.g = ajxh.a(j.a);
    }

    private static ajdx<akws<akhw>> a(ajdx<akws<akhw>> ajdx, igo igo) {
        Object a = ajdx.a((ajfc) k.a);
        akcr.a(a, "this.flatMap {\n         …)\n            }\n        }");
        return igq.a(a, igo);
    }

    private final AdRequestHttpInterface b() {
        return (AdRequestHttpInterface) this.c.b();
    }

    /* Access modifiers changed, original: final */
    public final idd a() {
        return (idd) this.e.b();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:3:0x0026, code skipped:
            if (r5 == null) goto L_0x0028;
     */
    public final void a(defpackage.cys r5, int r6) {
        /*
        r4 = this;
        r0 = r4.a;
        r0 = r0.get();
        r0 = (defpackage.ilv) r0;
        r1 = defpackage.inm.AD_REQUEST_STATUS;
        r2 = r5.a;
        r2 = (java.lang.Enum) r2;
        r3 = "req_type";
        r1 = r1.a(r3, r2);
        r6 = java.lang.String.valueOf(r6);
        r2 = "status_code";
        r6 = r1.a(r2, r6);
        r5 = r5.g;
        if (r5 == 0) goto L_0x0028;
    L_0x0022:
        r5 = r5.toString();
        if (r5 != 0) goto L_0x002a;
    L_0x0028:
        r5 = "none";
    L_0x002a:
        r1 = "ad_product";
        r5 = r6.a(r1, r5);
        r0.c(r5, 1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cos.a(cys, int):void");
    }

    public final ajdx<cyt> issueRequest(cys cys, igo igo) {
        ajdx issueProtoRequest;
        ajdx b;
        d dVar;
        a aVar;
        Object b2;
        akcr.b(cys, "snapAdsRequest");
        akcr.b(igo, "retryConfig");
        Map d = ajzm.d(cys.c);
        if (((ftl) this.d.b()).a((fth) cld.ENABLE_GZIP_FOR_REQUEST)) {
            d.put("__xsc_local__gzip", "request");
        }
        int i = cot.a[cys.e.ordinal()];
        if (i == 1) {
            AdRequestHttpInterface b3 = b();
            String str = cys.b;
            Object create = akhu.create((akho) this.g.b(), cys.d);
            akcr.a(create, "RequestBody.create(proto…, snapAdsRequest.payload)");
            issueProtoRequest = b3.issueProtoRequest(str, d, create);
        } else if (i != 2) {
            this.b.a(ckt.HIGH, "unsupported_method");
            StringBuilder stringBuilder = new StringBuilder("Unsupported HTTP method: ");
            stringBuilder.append(cys.e);
            b = ajdx.b((Throwable) new UnsupportedOperationException(stringBuilder.toString()));
            akcr.a((Object) b, "Single.error(Unsupported…snapAdsRequest.method}\"))");
            dVar = new d();
            dVar.a = 0;
            aVar = new a();
            aVar.a = true;
            b2 = b.b((ajfb) new e(this, dVar)).c(cys.f, TimeUnit.SECONDS).f(new f(this, cys, dVar)).d((ajfb) new g(this, aVar, cys)).g(new h(cys)).b((ajev) new i(this, aVar, cys, dVar)).b((ajdw) ((zfw) this.f.b()).g());
            akcr.a(b2, "responseSingle\n         …eOn(schedulers.network())");
            return b2;
        } else {
            issueProtoRequest = b().issueGetRequest(cys.b, d);
        }
        b = cos.a(issueProtoRequest, igo);
        dVar = new d();
        dVar.a = 0;
        aVar = new a();
        aVar.a = true;
        b2 = b.b((ajfb) new e(this, dVar)).c(cys.f, TimeUnit.SECONDS).f(new f(this, cys, dVar)).d((ajfb) new g(this, aVar, cys)).g(new h(cys)).b((ajev) new i(this, aVar, cys, dVar)).b((ajdw) ((zfw) this.f.b()).g());
        akcr.a(b2, "responseSingle\n         …eOn(schedulers.network())");
        return b2;
    }
}
