package defpackage;

import android.content.Context;
import defpackage.ssi.a;
import java.util.List;
import java.util.Map;

/* renamed from: acth */
public final class acth {
    private final kkz a;
    private final ajxe b;
    private final zfw c;
    private final ajxe d;
    private final ajxe e;
    private final ajxe f;
    private final Context g;
    private final aipn<sso> h;
    private final iib i;
    private final ajws<gwa> j;
    private final hal k;
    private final acsw l;
    private final yhp m;
    private final ajwy<fvh> n;
    private final ajwy<sml> o;
    private final actj p;
    private final ajei q;

    /* renamed from: acth$a */
    public static final class a {
        final sri a;
        final stl b;
        private final int c;
        private final Map<String, String> d;

        public /* synthetic */ a(int i, Map map, sri sri) {
            this(i, map, sri, null);
        }

        public a(int i, Map<String, String> map, sri sri, stl stl) {
            akcr.b(map, "snapToSSSIdMap");
            this.c = i;
            this.d = map;
            this.a = sri;
            this.b = stl;
        }

        public final szw a() {
            Object a = szw.a(defpackage.kkx.a.a, this.d, defpackage.kkx.a.b, Integer.valueOf(this.c));
            akcr.a(a, "Params.of(DynamicStoryIn…E_TYPE, reportSourceType)");
            return a;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!((this.c == aVar.c ? 1 : null) != null && akcr.a(this.d, aVar.d) && akcr.a(this.a, aVar.a) && akcr.a(this.b, aVar.b))) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.c * 31;
            Map map = this.d;
            int i2 = 0;
            i = (i + (map != null ? map.hashCode() : 0)) * 31;
            sri sri = this.a;
            i = (i + (sri != null ? sri.hashCode() : 0)) * 31;
            stl stl = this.b;
            if (stl != null) {
                i2 = stl.hashCode();
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LaunchConfig(reportSourceType=");
            stringBuilder.append(this.c);
            stringBuilder.append(", snapToSSSIdMap=");
            stringBuilder.append(this.d);
            stringBuilder.append(", closedAnimationState=");
            stringBuilder.append(this.a);
            stringBuilder.append(", presenterContext=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: acth$e */
    static final class e<T> implements ajfb<actc> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acth$f */
    static final class f implements ajev {
        private /* synthetic */ ajei a;

        f(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.dispose();
        }
    }

    /* renamed from: acth$b */
    static final class b extends akcs implements akbk<jwa> {
        private /* synthetic */ jwb a;
        private /* synthetic */ ide b;

        b(jwb jwb, ide ide) {
            this.a = jwb;
            this.b = ide;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(this.b);
        }
    }

    /* renamed from: acth$c */
    static final class c extends akcs implements akbk<jwc> {
        private /* synthetic */ jwe a;

        c(jwe jwe) {
            this.a = jwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a();
        }
    }

    /* renamed from: acth$d */
    static final class d extends akcq implements akbk<ihh> {
        d(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: acth$g */
    static final class g extends akcq implements akbk<sku> {
        g(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (sku) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acth.class), "playbackPerformanceAnalytics", "getPlaybackPerformanceAnalytics()Lcom/snap/opera/extensions/api/analytics/PlaybackPerformanceAnalytics;"), new akdc(akde.a(acth.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(acth.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(acth.class), "clock", "getClock()Lcom/snap/framework/time/Clock;")};
    }

    public acth(ide ide, Context context, aipn<sso> aipn, jwb jwb, jwe jwe, iib iib, ajws<gwa> ajws, hal hal, acsw acsw, yhp yhp, kky kky, zgb zgb, ajwy<fvh> ajwy, ajwy<sku> ajwy2, ajwy<sml> ajwy3, ajwy<ihh> ajwy4, actj actj, ajei ajei) {
        ide ide2 = ide;
        Context context2 = context;
        aipn<sso> aipn2 = aipn;
        jwb jwb2 = jwb;
        jwe jwe2 = jwe;
        iib iib2 = iib;
        ajws<gwa> ajws2 = ajws;
        hal hal2 = hal;
        acsw acsw2 = acsw;
        yhp yhp2 = yhp;
        kky kky2 = kky;
        ajwy<fvh> ajwy5 = ajwy;
        ajwy<sku> ajwy6 = ajwy2;
        ajwy<sml> ajwy7 = ajwy3;
        ajwy<ihh> ajwy8 = ajwy4;
        actj actj2 = actj;
        akcr.b(ide2, "feature");
        akcr.b(context2, "context");
        akcr.b(aipn2, "operaLauncher");
        akcr.b(jwb2, "bitmapFactoryProvider");
        akcr.b(jwe2, "bitmapLoaderFactory");
        akcr.b(iib2, "screenParameterProvider");
        akcr.b(ajws2, "playbackEvents");
        akcr.b(hal2, "playbackShareDependenciesProvider");
        akcr.b(acsw2, "mapPlaybackUtils");
        akcr.b(yhp2, "storyViewAnalytics");
        akcr.b(kky2, "operaInAppReportClient");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy5, "contextCardsLayerControllerPlugin");
        akcr.b(ajwy6, "playbackPerformanceAnalyticsProvider");
        akcr.b(ajwy7, "snappableOperaPluginProvider");
        akcr.b(ajwy8, "clockProvider");
        akcr.b(actj, "reportedSnaps");
        ajei ajei2 = ajei;
        akcr.b(ajei2, "userSessionDisposable");
        actj actj3 = actj;
        this.g = context2;
        this.h = aipn2;
        this.i = iib2;
        this.j = ajws2;
        this.k = hal2;
        this.l = acsw2;
        this.m = yhp2;
        this.n = ajwy5;
        this.o = ajwy7;
        this.p = actj3;
        this.q = ajei2;
        this.a = (kkz) kky2;
        this.b = ajxh.a(new g(ajwy6));
        this.c = zgb.a(ide2.callsite("story_viewer"));
        this.d = ajxh.a(new b(jwb2, ide2));
        this.e = ajxh.a(new c(jwe));
        this.f = ajxh.a(new d(ajwy4));
    }

    private final sku a() {
        return (sku) this.b.b();
    }

    private final jwa b() {
        return (jwa) this.d.b();
    }

    private final jwc c() {
        return (jwc) this.e.b();
    }

    private final ihh d() {
        return (ihh) this.f.b();
    }

    public final ajdp<actc> a(a aVar, List<? extends smi> list) {
        ajcx a;
        a aVar2 = aVar;
        List list2 = list;
        akcr.b(aVar2, "config");
        akcr.b(list2, "operaPlaylistGroups");
        long a2 = d().a();
        long b = a().b();
        long c = a().c();
        slg slg = new slg(this.g, new slh());
        slg.a(sqx.CIRCLE);
        ssi[] ssiArr = new ssi[2];
        ssiArr[0] = new actk(a2, this.l, this.m);
        Object a3 = a();
        akcr.a(a3, "playbackPerformanceAnalytics");
        ssi[] ssiArr2 = ssiArr;
        ssiArr2[1] = new sks(a3, aaug.TAP, b, c, new acsm(aajz.OUR_STORY));
        a aVar3 = new a(ssiArr2);
        ajei ajei = new ajei();
        sti.a aVar4 = new sti.a(ajzt.a((Object[]) new smm[]{new actl(new actd()), new gzc(this.i), new hak(this.k, this.j, ajei, this.c), new snr(), new acti(this.a, aVar.a(), this.p, this.q), (smm) this.n.get(), (smm) this.o.get()}), slg, this.c, b(), c(), adcw.a());
        aVar4.e = true;
        aVar4.c = aVar2.a;
        aVar4.b = new skv(this.g, adcw.a(), aVar4.t, aVar4.u);
        aVar4.h = 60000;
        aVar4.i = true;
        aVar4.p = aahb.NYC;
        if (aVar2.b == null) {
            a = ((sso) this.h.get()).a(list2, aVar4.a(), 0, (ssi) aVar3, new stl());
        } else {
            a = ((sso) this.h.get()).a((List) list, aVar4.a(), 0, (ssi) aVar3, aVar2.b);
        }
        Object a4 = a.a((ajdt) ajdp.a((ajdr) r8)).d((ajfb) e.a).a((ajev) new f(ajei));
        akcr.a(a4, "operaLaunchCompletable.a…spose()\n                }");
        return a4;
    }
}
