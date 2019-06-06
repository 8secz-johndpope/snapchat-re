package defpackage;

import android.util.Base64;
import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import com.snap.ads.network.SnapAdsHttpInterface;
import defpackage.cyt.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cmg */
public final class cmg implements cjr {
    final ajxe a;
    final AtomicReference<ajdx<Boolean>> b;
    long c;
    final ajwy<SnapAdsHttpInterface> d;
    final cjt e;
    final ajwy<cnm> f;
    final ajwy<cjq> g;
    final abss h;
    final ftl i;
    private final ajxe j = ajxh.a(b.a);
    private final ajxe k;
    private final ajxe l;
    private final ajwy<cmf> m;
    private final abqo n;

    /* renamed from: cmg$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("AdInitializer");
        }
    }

    /* renamed from: cmg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cmg$q */
    static final class q extends akcs implements akbk<zfw> {
        private /* synthetic */ cmg a;
        private /* synthetic */ ajwy b;

        q(cmg cmg, ajwy ajwy) {
            this.a = cmg;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a(this.a.b());
        }
    }

    /* renamed from: cmg$c */
    static final class c extends akcs implements akbk<cnm> {
        private /* synthetic */ cmg a;

        c(cmg cmg) {
            this.a = cmg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cnm) this.a.f.get();
        }
    }

    /* renamed from: cmg$p */
    static final class p extends akcs implements akbk<Long> {
        private /* synthetic */ cmg a;

        p(cmg cmg) {
            this.a = cmg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.i.h(cld.MUSHROOM_INIT_NETWORK_REQUEST_TIMEOUT_SECONDS));
        }
    }

    /* renamed from: cmg$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ cmg a;
        private /* synthetic */ ckk b;

        d(cmg cmg, ckk ckk) {
            this.a = cmg;
            this.b = ckk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alaq alaq = (alaq) obj;
            akcr.b(alaq, "it");
            ((cjq) this.a.g.get()).a(this.b.b, alaq);
            cyr cyr = cyr.INIT;
            String str = this.b.b;
            Object toByteArray = MessageNano.toByteArray(alaq);
            akcr.a(toByteArray, "MessageNano.toByteArray(it)");
            return new cys(cyr, str, null, toByteArray, null, ((Number) this.a.a.b()).longValue(), null, 84);
        }
    }

    /* renamed from: cmg$e */
    static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ cmg a;

        e(cmg cmg) {
            this.a = cmg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            cys cys = (cys) obj;
            akcr.b(cys, "it");
            return ((SnapAdsHttpInterface) this.a.d.get()).issueRequest(cys, new igo(igq.a, 0, 0, 0, null, 30)).h();
        }
    }

    /* renamed from: cmg$f */
    static final class f<T, R> implements ajfc<Throwable, cyt> {
        private /* synthetic */ ckk a;

        f(ckk ckk) {
            this.a = ckk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return a.a(this.a.b, 0, th, null, 10);
        }
    }

    /* renamed from: cmg$g */
    static final class g<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ cmg a;

        g(cmg cmg) {
            this.a = cmg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            cyt cyt = (cyt) obj;
            akcr.b(cyt, "it");
            cmg cmg = this.a;
            akcr.b(cyt, "snapAdsResponse");
            if (cyt.a()) {
                obj = ajdx.c((Callable) new j(cyt)).c((ajfb) new k(cmg, cyt)).d((ajfb) new l(cmg, cyt));
                str = "Single.fromCallable {\n  …          }\n            }";
            } else {
                obj = ajdx.b(cyt.c);
                str = "Single.error<InitRespons…napAdsResponse.exception)";
            }
            akcr.a(obj, str);
            return obj.h();
        }
    }

    /* renamed from: cmg$h */
    static final class h<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ cmg a;
        private /* synthetic */ ckk b;

        h(cmg cmg, ckk ckk) {
            this.a = cmg;
            this.b = ckk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            cnn cnn;
            Object b;
            alar alar = (alar) obj;
            akcr.b(alar, "it");
            aecl.a aVar = this.b.a;
            Object linkedHashMap = new LinkedHashMap();
            CharSequence b2 = alar.b();
            Object obj2 = null;
            Object obj3 = (b2 == null || b2.length() == 0) ? 1 : null;
            if (obj3 == null) {
                cnn = cnn.INIT_HOST_AND_PATH_V2;
                b = alar.b();
                akcr.a(b, "initResponse.initHostAndPathV2");
                linkedHashMap.put(cnn, new ckk(aVar, b));
            }
            b2 = alar.a();
            obj3 = (b2 == null || b2.length() == 0) ? 1 : null;
            if (obj3 == null) {
                cnn = cnn.SERVE_HOST_AND_PATH_BATCH;
                b = alar.a();
                akcr.a(b, "initResponse.serveHostAndPathBatch");
                linkedHashMap.put(cnn, new ckk(aVar, b));
            }
            b2 = alar.c();
            obj3 = (b2 == null || b2.length() == 0) ? 1 : null;
            if (obj3 == null) {
                cnn = cnn.TRACK_HOST_AND_PATH_V2;
                b = alar.c();
                akcr.a(b, "initResponse.trackHostAndPathV2");
                linkedHashMap.put(cnn, new ckk(aVar, b));
            }
            b2 = alar.d();
            if (b2 == null || b2.length() == 0) {
                obj2 = 1;
            }
            if (obj2 == null) {
                cnn = cnn.BATCH_TRACK_HOST_AND_PATH_V2;
                obj = alar.d();
                akcr.a(obj, "initResponse.batchTrackHostAndPathV2");
                linkedHashMap.put(cnn, new ckk(aVar, obj));
            }
            obj = ajdx.b(linkedHashMap);
            akcr.a(obj, "Single.just(adSources)");
            return obj.h();
        }
    }

    /* renamed from: cmg$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ cmg a;

        i(cmg cmg) {
            this.a = cmg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Map map = (Map) obj;
            akcr.b(map, "it");
            cmg cmg = this.a;
            akcr.b(map, "adSourceMap");
            if (map.isEmpty()) {
                cmg.e.a(ckt.HIGH, "init_response_emptyAdSources");
                obj = ajdx.b(Boolean.FALSE);
                str = "Single.just(false)";
            } else {
                for (Entry entry : map.entrySet()) {
                    cmg.c().a((cnn) entry.getKey(), ajyl.a(entry.getValue()));
                }
                cmg.c = abqo.a();
                obj = ajdx.b(Boolean.TRUE);
                str = "Single.just(true )";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: cmg$o */
    static final class o implements ajev {
        private /* synthetic */ cmg a;

        o(cmg cmg) {
            this.a = cmg;
        }

        public final void run() {
            this.a.b.set(null);
        }
    }

    /* renamed from: cmg$j */
    static final class j<V> implements Callable<T> {
        private /* synthetic */ cyt a;

        j(cyt cyt) {
            this.a = cyt;
        }

        public final /* synthetic */ Object call() {
            return alar.a(this.a.d);
        }
    }

    /* renamed from: cmg$k */
    static final class k<T> implements ajfb<alar> {
        private /* synthetic */ cmg a;
        private /* synthetic */ cyt b;

        k(cmg cmg, cyt cyt) {
            this.a = cmg;
            this.b = cyt;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((cjq) this.a.g.get()).a(this.b, (alar) obj);
        }
    }

    /* renamed from: cmg$l */
    static final class l<T> implements ajfb<Throwable> {
        private /* synthetic */ cmg a;
        private /* synthetic */ cyt b;

        l(cmg cmg, cyt cyt) {
            this.a = cmg;
            this.b = cyt;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.a.h.d()) {
                cjt cjt = this.a.e;
                ckt ckt = ckt.NORMAL;
                idd b = this.a.b();
                cyt cyt = this.b;
                byte[] bArr = cyt.d;
                int length = bArr != null ? bArr.length : 0;
                String encodeToString = Base64.encodeToString(cyt.d, 10);
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder stringBuilder2 = new StringBuilder("Proto Response Size: ");
                stringBuilder2.append(length);
                stringBuilder2.append(ppy.b);
                stringBuilder.append(stringBuilder2.toString());
                stringBuilder.append("Base64 Encoded ProtoBuf Message: ".concat(String.valueOf(encodeToString)));
                Object stringBuilder3 = stringBuilder.toString();
                akcr.a(stringBuilder3, "debugMessageBuilder.toString()");
                cjt.a(ckt, b, "init_response_parse_error", new Exception(stringBuilder3, th), true);
            }
        }
    }

    /* renamed from: cmg$m */
    static final class m<T, R> implements ajfc<Throwable, Boolean> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: cmg$n */
    static final class n<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            akcr.b(bool, "t1");
            akcr.b(bool2, "<anonymous parameter 1>");
            return bool;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cmg.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(cmg.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(cmg.class), "adSourceProvider", "getAdSourceProvider()Lcom/snap/ads/core/lib/adsource/AdSourceProviderApi;"), new akdc(akde.a(cmg.class), "initRequestTimeoutSeconds", "getInitRequestTimeoutSeconds()J")};
        a aVar = new a();
    }

    public cmg(ajwy<SnapAdsHttpInterface> ajwy, ajwy<cmf> ajwy2, cjt cjt, ajwy<cnm> ajwy3, ajwy<zgb> ajwy4, ajwy<cjq> ajwy5, abss abss, ftl ftl, abqo abqo) {
        akcr.b(ajwy, "snapAdsHttpInterfaceProvider");
        akcr.b(ajwy2, "adInitRequestFactoryApiProvider");
        akcr.b(cjt, "issuesReporter");
        akcr.b(ajwy3, "adSourceProviderApi");
        akcr.b(ajwy4, "schedulersProvider");
        akcr.b(ajwy5, "adInitNetworkingLogger");
        akcr.b(abss, "releaseManager");
        akcr.b(ftl, "compositeConfigProvider");
        akcr.b(abqo, "clock");
        this.d = ajwy;
        this.m = ajwy2;
        this.e = cjt;
        this.f = ajwy3;
        this.g = ajwy5;
        this.h = abss;
        this.i = ftl;
        this.n = abqo;
        this.k = ajxh.a(new q(this, ajwy4));
        this.l = ajxh.a(new c(this));
        this.a = ajxh.a(new p(this));
        this.b = new AtomicReference(null);
    }

    private ajdx<Boolean> a(ckk ckk) {
        akcr.b(ckk, "adSource");
        Object c = ((cmf) this.m.get()).a().b((ajdw) d().g()).a((ajdw) d().b()).f(new d(this, ckk)).a((ajfc) new e(this)).h(new f(ckk)).a((ajfc) new g(this)).a((ajfc) new h(this, ckk)).c((ajfc) new i(this));
        akcr.a(c, "adInitRequestFactoryApiP…e { updateAdSources(it) }");
        return c;
    }

    private final zfw d() {
        return (zfw) this.k.b();
    }

    public final ajdx<Boolean> a() {
        String str = "Single.just(false)";
        Object b;
        if (abqo.a() - this.c < this.i.h(cld.INIT_RESPONSE_TTL_MS)) {
            b = ajdx.b(Boolean.FALSE);
            akcr.a(b, str);
            return b;
        }
        Map a = c().a();
        Object obj = (a == null || a.isEmpty()) ? 1 : null;
        obj = (obj == null && a.containsKey(aecl.a.PRIMARY) && a.get(aecl.a.PRIMARY) != null) ? a.get(aecl.a.PRIMARY) : c().a(cnn.INIT_HOST_AND_PATH_V2);
        obj = Optional.fromNullable(obj);
        akcr.a(obj, "primaryAdSource");
        if (!obj.isPresent()) {
            Throwable exception = new Exception("init adsources not found");
            this.e.a(ckt.HIGH, b(), "init_adsource_not_found", exception, false);
            b = ajdx.b(exception);
            akcr.a(b, "Single.error(exception)");
            return b;
        } else if (((ajdx) this.b.get()) != null) {
            b = ajdx.b(Boolean.FALSE);
            akcr.a(b, str);
            return b;
        } else {
            obj = obj.get();
            akcr.a(obj, "primaryAdSource.get()");
            obj = a((ckk) obj);
            ckk ckk = (ckk) a.get(aecl.a.SHADOW);
            if (this.i.a((fth) cld.ENABLE_SHADOW_REQUESTS) && ckk != null) {
                obj = ajdx.a((ajeb) obj, (ajeb) a(ckk).g(m.a), (ajex) n.a);
                akcr.a(obj, "currentRequest.zipWith(\n…Boolean> { t1, _ -> t1 })");
            }
            if (this.b.compareAndSet(null, obj)) {
                b = obj.b((ajev) new o(this));
                akcr.a(b, "currentRequest.doFinally…s.set(null)\n            }");
                return b;
            }
            b = ajdx.b(Boolean.FALSE);
            akcr.a(b, str);
            return b;
        }
    }

    /* Access modifiers changed, original: final */
    public final idd b() {
        return (idd) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final cnm c() {
        return (cnm) this.l.b();
    }
}
