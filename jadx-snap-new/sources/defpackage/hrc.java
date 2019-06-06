package defpackage;

import android.util.Base64;
import com.google.common.collect.Sets;
import defpackage.iib.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hrc */
public final class hrc implements hhq {
    final ajxe a;
    final Set<String> b;
    final AtomicReference<String> c;
    final ajxe d;
    final Random e;
    final ihh f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l = ajxh.a(d.a);
    private final ajxe m;
    private final iib n;

    /* renamed from: hrc$d */
    static final class d extends akcs implements akbk<idd> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return hbn.f.callsite("PromotedStoriesAnalytics");
        }
    }

    /* renamed from: hrc$g */
    static final class g extends akcs implements akbk<hhy> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (hhy) this.a.get();
        }
    }

    /* renamed from: hrc$c */
    static final class c extends akcs implements akbk<cko> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cko) this.a.get();
        }
    }

    /* renamed from: hrc$m */
    static final class m extends akcs implements akbk<ckm> {
        private /* synthetic */ ajwy a;

        m(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ckm) this.a.get();
        }
    }

    /* renamed from: hrc$e */
    static final class e extends akcs implements akbk<dis> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dis) this.a.get();
        }
    }

    /* renamed from: hrc$a */
    static final class a extends akcs implements akbk<cjo> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cjo) this.a.get();
        }
    }

    /* renamed from: hrc$f */
    static final class f extends akcs implements akbk<gqr> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) this.a.get();
        }
    }

    /* renamed from: hrc$l */
    static final class l extends akcs implements akbk<zfw> {
        private /* synthetic */ hrc a;
        private /* synthetic */ zgb b;

        l(hrc hrc, zgb zgb) {
            this.a = hrc;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(((idd) this.a.l.b()));
        }
    }

    /* renamed from: hrc$b */
    static final class b extends akcs implements akbk<ckl> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ckl) this.a.get();
        }
    }

    /* renamed from: hrc$h */
    static final class h extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ hrc a;
        private /* synthetic */ hjq b;
        private /* synthetic */ abpq c;

        h(hrc hrc, hjq hjq, abpq abpq) {
            this.a = hrc;
            this.b = hjq;
            this.c = abpq;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2 = (a) obj;
            cko a = ((cko) this.a.h.b());
            hrc hrc = this.a;
            hjq hjq = this.b;
            abpq abpq = this.c;
            akcr.a(obj2, "it");
            List list = ajyw.a;
            cwi cwi = cwi.STORY;
            int j = hjq.j();
            Object J = hjq.J();
            akcr.a(J, "cardData.adKey()");
            cko cko = a;
            hrc hrc2 = hrc;
            cxa cxa = new cxa(list, cwi, j, J, (long) abpq.b(), (long) abpq.a(), (long) obj2.g, (long) obj2.h);
            cjg cjg = (cjg) ajyu.f(cvl.a);
            String encodeToString = Base64.encodeToString(hjq.I(), 10);
            String encodeToString2 = Base64.encodeToString(hjq.H(), 10);
            String B = hjq.B();
            akcr.a((Object) B, "cardData.adRequestId()");
            hrc hrc3 = hrc2;
            cxc cxc = new cxc(cjg, encodeToString, encodeToString2, B, hrc3.e.nextInt(), hjq.G());
            Object obj3 = hrc3.c.get();
            akcr.a(obj3, "currentSessionId.get()");
            String str = (String) obj3;
            J = hjq.L();
            akcr.a(J, "cardData.impressionTrackingUrls()");
            cko cko2 = cko;
            cko2.a(new cxo(str, cxc, cxa, J, cvp.PROMOTED_STORIES));
            obj2 = this.b.N();
            akcr.a(obj2, "storyData.adResponse()");
            obj2 = obj2.w();
            akcr.a(obj2, "storyData.adResponse().impressionTrackingUrls");
            if ((((Collection) obj2).isEmpty() ^ 1) != 0) {
                List a2 = ((ckm) this.a.a.b()).a(obj2, this.a.f.a());
                if ((a2.isEmpty() ^ 1) != 0) {
                    ((cko) this.a.h.b()).a(a2);
                }
            }
            this.a.b.add(this.b.z());
            return ajxw.a;
        }
    }

    /* renamed from: hrc$i */
    static final class i extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ hrc a;

        i(hrc hrc) {
            this.a = hrc;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            ((gqr) this.a.k.b()).a(gqt.NORMAL, th, ((idd) this.a.l.b()));
            return ajxw.a;
        }
    }

    /* renamed from: hrc$j */
    static final class j extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ hrc a;
        private /* synthetic */ String b;

        j(hrc hrc, String str) {
            this.a = hrc;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2 = (a) obj;
            cvc a = ((ckl) this.a.d.b()).a(this.b);
            if (a != null) {
                cvw cvw = a.d;
                if (cvw == null) {
                    akcr.a();
                }
                cko a2 = ((cko) this.a.h.b());
                hrc hrc = this.a;
                String str = this.b;
                String f = cvw.b.f();
                akcr.a((Object) f, "adRequestResponse.adResponse.adKey");
                String b = cvw.b();
                String a3 = cvw.a();
                String str2 = cvw.e;
                akcr.a(obj2, "it");
                int i = 0;
                f = f;
                cxa cxa = new cxa(ajyw.a, cwi.NO_FILL, i, f, 0, 0, (long) obj2.g, (long) obj2.h);
                cxa cxa2 = cxa;
                cxc cxc = new cxc((cjg) ajyu.f(cvl.a), b, a3, str, hrc.e.nextInt(), str2);
                Object obj3 = hrc.c.get();
                akcr.a(obj3, "currentSessionId.get()");
                a2.a(new cxo((String) obj3, cxc, cxa2, cvp.PROMOTED_STORIES));
                this.a.b.add(this.b);
            }
            return ajxw.a;
        }
    }

    /* renamed from: hrc$k */
    static final class k extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ hrc a;

        k(hrc hrc) {
            this.a = hrc;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            ((gqr) this.a.k.b()).a(gqt.NORMAL, th, ((idd) this.a.l.b()));
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hrc.class), "feedSessionIdProvider", "getFeedSessionIdProvider()Lcom/snap/discoverfeed/dependency/StoryFeedSessionIdProvider;"), new akdc(akde.a(hrc.class), "adTrackerApi", "getAdTrackerApi()Lcom/snap/ads/api/AdTrackerApi;"), new akdc(akde.a(hrc.class), "thirdPartyTrackingBuilder", "getThirdPartyTrackingBuilder()Lcom/snap/ads/api/AdThirdPartyTrackingBuilderApi;"), new akdc(akde.a(hrc.class), "eventLogger", "getEventLogger()Lcom/snap/blizzard/EventLogger;"), new akdc(akde.a(hrc.class), "adDisposableManagerApi", "getAdDisposableManagerApi()Lcom/snap/ads/api/AdDisposableManagerApi;"), new akdc(akde.a(hrc.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;"), new akdc(akde.a(hrc.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(hrc.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hrc.class), "adStoreApi", "getAdStoreApi()Lcom/snap/ads/api/AdStoreApi;")};
    }

    public hrc(ajwy<hhy> ajwy, ajwy<cko> ajwy2, iib iib, ajwy<ckm> ajwy3, ajwy<dis> ajwy4, ajwy<cjo> ajwy5, ajwy<gqr> ajwy6, ajwy<ckl> ajwy7, zgb zgb, ihh ihh) {
        akcr.b(ajwy, "feedSessionIdProvider");
        akcr.b(ajwy2, "adTrackApiProvider");
        akcr.b(iib, "screenParameterProvider");
        akcr.b(ajwy3, "thirdPartyTrackingBuilderProvider");
        akcr.b(ajwy4, "eventLoggerProvider");
        akcr.b(ajwy5, "adDisposableManagerApiProvider");
        akcr.b(ajwy6, "exceptionTrackerProvider");
        akcr.b(ajwy7, "adStoreApiProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ihh, "clock");
        this.n = iib;
        this.f = ihh;
        this.g = ajxh.a(new g(ajwy));
        this.h = ajxh.a(new c(ajwy2));
        this.a = ajxh.a(new m(ajwy3));
        this.i = ajxh.a(new e(ajwy4));
        this.j = ajxh.a(new a(ajwy5));
        this.k = ajxh.a(new f(ajwy6));
        this.m = ajxh.a(new l(this, zgb));
        this.b = Sets.newConcurrentHashSet();
        this.c = new AtomicReference();
        this.d = ajxh.a(new b(ajwy7));
        this.e = new Random();
    }

    private final hhy a() {
        return (hhy) this.g.b();
    }

    private final void a(hjq hjq, abpq abpq) {
        ajdx b = this.n.b().b((ajdw) d().b());
        akcr.a((Object) b, "screenParameterProvider.…schedulers.computation())");
        akbl hVar = new h(this, hjq, abpq);
        akbl iVar = new i(this);
        cjo c = c();
        akcr.a((Object) c, "adDisposableManagerApi");
        cjl.a(b, hVar, iVar, c);
    }

    private final boolean a(String str) {
        return akcr.a((Object) str, (String) this.c.get()) ^ 1;
    }

    private final boolean a(String str, String str2) {
        return (akcr.a((Object) str, (String) this.c.get()) && this.b.contains(str2)) ? false : true;
    }

    private final dis b() {
        return (dis) this.i.b();
    }

    private final String b(String str) {
        String str2 = "%s_%s";
        Object format = String.format(str2, Arrays.copyOf(new Object[]{a().a(), str}, 2));
        akcr.a(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final cjo c() {
        return (cjo) this.j.b();
    }

    private final synchronized void c(String str) {
        this.c.set(str);
        this.b.clear();
    }

    private final zfw d() {
        return (zfw) this.m.b();
    }

    public final void a(hio hio, String str, float f) {
        akcr.b(hio, "storyData");
        akcr.b(str, "adResponseIdentifier");
        if (f < 1.0f) {
            String l = hio.l();
            akcr.a((Object) l, "storyData.requestId()");
            l = b(l);
            if (a(l, str)) {
                if (a(l)) {
                    c(l);
                }
                ajdx b = this.n.b().b((ajdw) d().b());
                akcr.a((Object) b, "screenParameterProvider.…schedulers.computation())");
                akbl jVar = new j(this, str);
                akbl kVar = new k(this);
                cjo c = c();
                akcr.a((Object) c, "adDisposableManagerApi");
                cjl.a(b, jVar, kVar, c);
            }
        }
    }

    public final void a(hjq hjq) {
        akcr.b(hjq, "storyData");
    }

    public final void a(hjq hjq, long j, float f, abpq abpq) {
        akcr.b(hjq, "storyData");
        akcr.b(abpq, "cardSize");
        Double valueOf = Double.valueOf(abqq.a(j));
        double d = (double) f;
        zzg zzg = new zzg();
        zzg.c(hjq.z());
        zzg.a(hjq.y());
        zzg.b(hjq.A());
        zzg.b(Boolean.FALSE);
        zzg.a(Boolean.FALSE);
        zzg.a(valueOf);
        zzg.a(abfx.PROMOTED_STORY);
        zzg.b(Double.valueOf(d));
        b().a(zzg);
        if (f <= 1.0f) {
            String l = hjq.l();
            akcr.a((Object) l, "storyData.requestId()");
            l = b(l);
            String z = hjq.z();
            akcr.a((Object) z, "storyData.adId()");
            if (a(l, z)) {
                if (a(l)) {
                    c(l);
                }
                a(hjq, abpq);
            }
        }
    }

    public final void a(hjq hjq, zza zza, zyz zyz, abpq abpq) {
        akcr.b(hjq, "storyData");
        akcr.b(zyz, "exitType");
        String l = hjq.l();
        akcr.a((Object) l, "storyData.requestId()");
        l = b(l);
        if (a(l)) {
            c(l);
        }
        abev abev = new abev();
        abev.a(hjq.J());
        abev.b(hjq.z());
        abev.c(hjq.C());
        abev.d(hjq.A());
        abev.a(abfx.PROMOTED_STORY);
        abev.a(zza);
        abev.a(zyz);
        b().a(abev);
        if (zyz == zyz.SUBMITTED && abpq != null) {
            a(hjq, abpq);
        }
    }
}
