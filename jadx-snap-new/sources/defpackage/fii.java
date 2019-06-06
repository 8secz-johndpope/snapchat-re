package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.ConnectedAppsModel;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snapchat.android.R;
import defpackage.ssi.b;
import defpackage.ssi.c;
import defpackage.sti.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: fii */
public final class fii implements eyo {
    boolean a = true;
    final ajwy<sso> b;
    final zfw c;
    final Context d;
    final ajwy<eyh> e;
    final jwb f;
    final jwe g;
    final exz h;
    final faj i;
    final fdd j;
    private final ajxe k = ajxh.a(new a(this));
    private final ajxe l = ajxh.a(new b(this));
    private final ajxe m = ajxh.a(new c(this.y));
    private final ajwy<snu> n;
    private final ajei o;
    private final gpb p;
    private final achb<zjm, zjk> q;
    private final ezd r;
    private final fan s;
    private final eyz t;
    private final fdb u;
    private final fcw v;
    private final eyw w;
    private final eya x;
    private final ajwy<fap> y;
    private final gpb z;

    /* renamed from: fii$c */
    static final class c extends akcq implements akbk<fap> {
        c(ajwy ajwy) {
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
            return (fap) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: fii$a */
    static final class a extends akcs implements akbk<jwa> {
        private /* synthetic */ fii a;

        a(fii fii) {
            this.a = fii;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.f.a(eym.f);
        }
    }

    /* renamed from: fii$b */
    static final class b extends akcs implements akbk<jwc> {
        private /* synthetic */ fii a;

        b(fii fii) {
            this.a = fii;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.g.a();
        }
    }

    /* renamed from: fii$l */
    static final class l<V> implements Callable<T> {
        private /* synthetic */ String a;

        l(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object call() {
            return accy.a(Base64.decode(this.a, 0));
        }
    }

    /* renamed from: fii$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fii a;
        private /* synthetic */ String b;

        d(fii fii, String str) {
            this.a = fii;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "id");
            return ((eyh) this.a.e.get()).a(str, this.b, true);
        }
    }

    /* renamed from: fii$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "userSession");
            String str = abkq.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append('~');
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    /* renamed from: fii$f */
    static final class f<T> implements ajfb<Long> {
        private /* synthetic */ fii a;

        f(fii fii) {
            this.a = fii;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.a = true;
        }
    }

    /* renamed from: fii$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ snu a;

        g(snu snu) {
            this.a = snu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            fgb fgb = (fgb) obj;
            akcr.b(fgb, "inAppConversation");
            snu snu = this.a;
            if (snu != null) {
                ((feg) snu).a(fgb);
                return ajxw.a;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.cognac.internal.opera.CognacLayerFactory");
        }
    }

    /* renamed from: fii$h */
    static final class h<T, R> implements ajfc<ajxw, ajdb> {
        private /* synthetic */ fii a;
        private /* synthetic */ snu b;
        private /* synthetic */ ffs c;
        private /* synthetic */ eza d;

        h(fii fii, snu snu, ffs ffs, eza eza) {
            this.a = fii;
            this.b = snu;
            this.c = ffs;
            this.d = eza;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajxw) obj, "it");
            fii fii = this.a;
            Object obj2 = this.b;
            akcr.a(obj2, "factory");
            ffs ffs = this.c;
            eza eza = this.d;
            slg slg = new slg(fii.d, new slh());
            sqh[] sqhArr = new sqh[1];
            sqh sqh = new sqh();
            sqh.b(fer.a, ffs.b);
            sqh.b(fer.b, ffs.c);
            sqh.b(fer.c, ffs.d);
            sqh.b(fer.d, ffs.f);
            sqh.b(fer.e, ffs.e);
            sqh.b(fer.f, ffs.g);
            sqh.b(fer.i, ffs.h);
            sqh.b(fer.h, ffs.i);
            sqh.b(fer.g, ffs.j);
            sqh.b(sqh.c, Boolean.TRUE);
            sqhArr[0] = sqh;
            ssy ssy = new ssy(sqhArr);
            a aVar = new a(ajzs.a(new fef(obj2)), slg, fii.c, fii.a(), fii.b(), eym.f.getPage());
            aVar.j = true;
            aVar.h = 60000;
            aVar.m = Boolean.TRUE;
            aVar.p = aahb.COGNAC;
            aVar.n = Boolean.valueOf(eza.b());
            return ((sso) fii.b.get()).a((smi) ssy, aVar.a(), (ssi) new j(), new stl());
        }
    }

    /* renamed from: fii$j */
    public static final class j implements ssi {
        j() {
        }

        public final void a(long j, long j2) {
        }

        public final void a(sqh sqh, long j) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void a(sqh sqh, long j, long j2) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void a(sqh sqh, sqh sqh2, srb srb, long j) {
            String str = "exitMethod";
            akcr.b(srb, str);
            akcr.b(srb, str);
        }

        public final void a(sqh sqh, srb srb, long j) {
            akcr.b(sqh, "page");
            akcr.b(srb, "exitMethod");
            b.b(sqh, srb);
        }

        public final void a(sqh sqh, c cVar, long j) {
            akcr.b(sqh, "page");
            b.a(this, sqh, j);
        }

        public final void a(sqh sqh, c cVar, srb srb, long j, Set<? extends spr> set) {
            akcr.b(sqh, "page");
            akcr.b(srb, "exitMethod");
            b.a(this, sqh, srb, j);
        }

        public final void a(srb srb, long j) {
            String str = "exitMethod";
            akcr.b(srb, str);
            akcr.b(srb, str);
        }

        public final void b(long j, long j2) {
        }

        public final void b(sqh sqh, long j) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void b(sqh sqh, long j, long j2) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void b(sqh sqh, sqh sqh2, srb srb, long j) {
            String str = "exitMethod";
            akcr.b(srb, str);
            akcr.b(srb, str);
        }

        public final void b(sqh sqh, srb srb, long j) {
            akcr.b(sqh, "page");
            akcr.b(srb, "exitMethod");
            b.a(sqh, srb);
        }

        public final void c(long j, long j2) {
        }

        public final void c(sqh sqh, long j) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void c(sqh sqh, long j, long j2) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void d(long j, long j2) {
        }

        public final void e(long j, long j2) {
        }
    }

    /* renamed from: fii$k */
    public static final class k implements ssi {
        k() {
        }

        public final void a(long j, long j2) {
        }

        public final void a(sqh sqh, long j) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void a(sqh sqh, long j, long j2) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void a(sqh sqh, sqh sqh2, srb srb, long j) {
            String str = "exitMethod";
            akcr.b(srb, str);
            akcr.b(srb, str);
        }

        public final void a(sqh sqh, srb srb, long j) {
            akcr.b(sqh, "page");
            akcr.b(srb, "exitMethod");
            b.b(sqh, srb);
        }

        public final void a(sqh sqh, c cVar, long j) {
            akcr.b(sqh, "page");
            b.a(this, sqh, j);
        }

        public final void a(sqh sqh, c cVar, srb srb, long j, Set<? extends spr> set) {
            akcr.b(sqh, "page");
            akcr.b(srb, "exitMethod");
            b.a(this, sqh, srb, j);
        }

        public final void a(srb srb, long j) {
            String str = "exitMethod";
            akcr.b(srb, str);
            akcr.b(srb, str);
        }

        public final void b(long j, long j2) {
        }

        public final void b(sqh sqh, long j) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void b(sqh sqh, long j, long j2) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void b(sqh sqh, sqh sqh2, srb srb, long j) {
            String str = "exitMethod";
            akcr.b(srb, str);
            akcr.b(srb, str);
        }

        public final void b(sqh sqh, srb srb, long j) {
            akcr.b(sqh, "page");
            akcr.b(srb, "exitMethod");
            b.a(sqh, srb);
        }

        public final void c(long j, long j2) {
        }

        public final void c(sqh sqh, long j) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void c(sqh sqh, long j, long j2) {
            String str = "page";
            akcr.b(sqh, str);
            akcr.b(sqh, str);
        }

        public final void d(long j, long j2) {
        }

        public final void e(long j, long j2) {
        }
    }

    /* renamed from: fii$m */
    static final class m implements ajev {
        private /* synthetic */ fii a;
        private /* synthetic */ ffq b;

        m(fii fii, ffq ffq) {
            this.a = fii;
            this.b = ffq;
        }

        public final void run() {
            fii fii = this.a;
            ffq ffq = this.b;
            fgm b = fii.j.b(ffq.a);
            String str = null;
            fii.c().a(ffq.a, fii.d(), b != null ? b.f() : null);
            fii.c().a(abbd.SNAP_ATTACHMENT);
            fii.i.a(eza.COGNAC_OPENED_FROM_SNAP_ATTACHMENT);
            String str2 = ffq.a;
            if (b != null) {
                str = b.f();
            }
            fii.a(new ffs(null, str2, str, null, ffq.f, ffq.b, "INDIVIDUAL", new ArrayList(), ffq.c, ffq.d, ffq.e), eza.COGNAC_OPENED_FROM_SNAP_ATTACHMENT);
        }
    }

    /* renamed from: fii$n */
    static final class n<T> implements ajfb<Throwable> {
        private /* synthetic */ fii a;

        n(fii fii) {
            this.a = fii;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.h.a(this.a.d, this.a.d.getResources().getString(R.string.cognac_oops), this.a.d.getResources().getString(R.string.no_internet_connection), eym.a);
        }
    }

    /* renamed from: fii$o */
    static final class o<T> implements ajfb<accy> {
        private /* synthetic */ fii a;
        private /* synthetic */ String b;

        o(fii fii, String str) {
            this.a = fii;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (accy) obj;
            fii fii = this.a;
            akcr.a(obj2, "payload");
            String str = this.b;
            accr accr = obj2.a;
            Object obj3 = accr.a;
            String str2 = "chatDockEntry.appInstance";
            akcr.a(obj3, str2);
            String b = obj3.b();
            fgm b2 = fii.j.b(b);
            eza eza = eza.COGNAC_OPENED_FROM_NOTIFICATION;
            if (b2 != null) {
                Object d = b2.d();
                akcr.a(d, "item.contentUrl");
                if (d != null) {
                    akcr.a((Object) b, "appId");
                    String f = b2.f();
                    Object obj4 = accr.a;
                    akcr.a(obj4, str2);
                    String a = obj4.a();
                    Object b3 = b2.b();
                    akcr.a(b3, "launcherItem.name");
                    obj4 = ImmutableList.of();
                    akcr.a(obj4, "ImmutableList.of()");
                    ffs ffs = r4;
                    ffs ffs2 = new ffs(str, b, f, a, d, b3, "CONVERSATION", (List) obj4);
                    fii.a(ffs, eza);
                    faj faj = fii.i;
                    obj2 = accr.a;
                    akcr.a(obj2, str2);
                    faj.a(obj2.a());
                    fii.i.a(eza.COGNAC_OPENED_FROM_NOTIFICATION);
                    fii.c().a(b, fii.d(), b2.f());
                    fii.c().a(abbd.NOTIFICATION);
                }
            }
        }
    }

    /* renamed from: fii$p */
    static final class p<T> implements ajfb<Throwable> {
        public static final p a = new p();

        p() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fii$i */
    static final class i extends akcs implements akbl<Throwable, ajxw> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "e");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(fii.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(fii.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(fii.class), "cognacAnalytics", "getCognacAnalytics()Lcom/snap/cognac/impl/blizzard/CognacAnalytics;")};
    }

    public fii(ajwy<sso> ajwy, ajwy<snu> ajwy2, zfw zfw, Context context, ajei ajei, gpb gpb, ajwy<eyh> ajwy3, jwb jwb, jwe jwe, achb<zjm, zjk> achb, ezd ezd, fan fan, exz exz, faj faj, eyz eyz, fdb fdb, fcw fcw, fdd fdd, eyw eyw, eya eya, ajwy<fap> ajwy4, gpb gpb2) {
        ajwy<sso> ajwy5 = ajwy;
        ajwy<snu> ajwy6 = ajwy2;
        zfw zfw2 = zfw;
        Context context2 = context;
        ajei ajei2 = ajei;
        gpb gpb3 = gpb;
        ajwy<eyh> ajwy7 = ajwy3;
        jwb jwb2 = jwb;
        jwe jwe2 = jwe;
        achb<zjm, zjk> achb2 = achb;
        ezd ezd2 = ezd;
        fan fan2 = fan;
        exz exz2 = exz;
        faj faj2 = faj;
        eyz eyz2 = eyz;
        fdb fdb2 = fdb;
        akcr.b(ajwy5, "operaLauncher");
        akcr.b(ajwy6, "operaLayerFactory");
        akcr.b(zfw2, "schedulers");
        akcr.b(context2, "context");
        akcr.b(ajei2, "disposable");
        akcr.b(gpb3, "userAuthStore");
        akcr.b(ajwy7, "cognacConversationService");
        akcr.b(jwb2, "bitmapFactoryProvider");
        akcr.b(jwe2, "bitmapLoaderFactory");
        akcr.b(achb2, "navigationHost");
        akcr.b(ezd2, "tweakService");
        akcr.b(fan2, "networkHandler");
        akcr.b(exz2, "alertService");
        akcr.b(faj2, "cognacStateManager");
        akcr.b(eyz2, "snapTokenService");
        akcr.b(fdb, "webviewUriHandler");
        akcr.b(fcw, "secureUriHandler");
        akcr.b(fdd, "launcherItemManager");
        akcr.b(eyw, "notificationService");
        akcr.b(eya, "appListService");
        akcr.b(ajwy4, "cognacAnalyticsProvider");
        akcr.b(gpb2, "authStore");
        fdb fdb3 = fdb;
        this.b = ajwy5;
        this.n = ajwy6;
        this.c = zfw2;
        this.d = context2;
        this.o = ajei2;
        this.p = gpb3;
        this.e = ajwy7;
        this.f = jwb2;
        this.g = jwe2;
        this.q = achb2;
        this.r = ezd2;
        this.s = fan2;
        this.h = exz2;
        this.i = faj2;
        this.t = eyz;
        this.u = fdb3;
        fdd fdd2 = fdd;
        this.v = fcw;
        this.j = fdd2;
        eya eya2 = eya;
        this.w = eyw;
        this.x = eya2;
        gpb gpb4 = gpb2;
        this.y = ajwy4;
        this.z = gpb4;
    }

    private final ajdx<fgb> a(String str, String str2, String str3) {
        Object a;
        if (akcr.a((Object) str3, (Object) "INDIVIDUAL") || str == null) {
            a = e().a((ajfc) new d(this, str2));
            str2 = "createStubConversationId…ceId, true)\n            }";
        } else {
            a = ((eyh) this.e.get()).a(str, str2, false);
            str2 = "cognacConversationServic…Id, appInstanceId, false)";
        }
        akcr.a(a, str2);
        return a;
    }

    static String d() {
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        return uuid;
    }

    private final ajdx<String> e() {
        Object e = this.p.c().p(e.a).e();
        akcr.a(e, "userAuthStore.observeUse…\n        }.firstOrError()");
        return e;
    }

    /* Access modifiers changed, original: final */
    public final jwa a() {
        return (jwa) this.k.b();
    }

    public final void a(ffq ffq) {
        akcr.b(ffq, "deepLinkModel");
        Object a = this.x.a(false).b((ajdw) this.c.g()).a((ajdw) this.c.l()).a((ajev) new m(this, ffq), (ajfb) new n(this));
        akcr.a(a, "appListService.loadAppLi…                       })");
        std.a(a, this.o);
    }

    /* Access modifiers changed, original: final */
    public final void a(ffs ffs, eza eza) {
        if (this.a) {
            this.a = false;
            Object f = ajdp.b(1, TimeUnit.SECONDS).f((ajfb) new f(this));
            akcr.a(f, "Observable.timer(LAUNCH_…ribe { canLaunch = true }");
            std.a(f, this.o);
            snu snu = (snu) this.n.get();
            this.u.a(this.t.a(wjd.PUPPY).g());
            Object g = this.t.a(wjd.API_GATEWAY).g();
            fcw fcw = this.v;
            akcr.a(g, "apiGatewayAccessToken");
            fcw.a(g);
            Object e = a(ffs.a, ffs.d, ffs.g).f(new g(snu)).e((ajfc) new h(this, snu, ffs, eza));
            akcr.a(e, "createConversation(cogna…nacParams, cognacState) }");
            std.a(ajwe.a((ajcx) e, (akbl) i.a, ajwe.a), this.o);
        }
    }

    public final void a(fgm fgm) {
        akcr.b(fgm, "launcherItem");
        fdp fdp = new fdp(eym.a, this.d, this.q, fgm);
        achb achb = this.q;
        achd achd = fdp;
        acgu acgu = eym.e;
        akcr.a((Object) acgu, "CognacFeature.PRESENT_BOTTOM_TO_TOP_WITH_ANIMATION");
        achb.a(achd, acgu, null);
    }

    public final void a(String str) {
        akcr.b(str, "url");
        slg slg = new slg(this.d, new slh());
        slg.a(sqx.SWIPE_DOWN);
        sqh[] sqhArr = new sqh[1];
        sqh sqh = new sqh();
        sqh.b(sqh.ai, new sqf(str));
        sqh.b(sqh.ak, sqn.ALWAYS);
        sqh.b(sqh.aj, Boolean.FALSE);
        sqhArr[0] = sqh;
        Object e = ((sso) this.b.get()).a((smi) new ssy(sqhArr), new a(ajyy.a, slg, this.c, a(), b(), eym.f.getPage()).a(), (ssi) new k(), new stl()).b((ajdw) this.c.l()).e();
        akcr.a(e, "launchOperaWebview(url)\n…             .subscribe()");
        std.a(e, this.o);
    }

    public final void a(String str, String str2, long j) {
        akcr.b(str, "cognacPayload");
        akcr.b(str2, "conversationId");
        if (System.currentTimeMillis() - j < ((long) (this.r.m() * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL))) {
            Object b = ajdj.b((Callable) new l(str));
            akcr.a(b, "Maybe.fromCallable {\n   …arseFrom(bytes)\n        }");
            b = b.b((ajdw) this.c.b()).a((ajdw) this.c.l()).a((ajfb) new o(this, str2), (ajfb) p.a);
            akcr.a(b, "parseNotificationPayload…otification payload \") })");
            std.a(b, this.o);
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, eza eza) {
        String str8 = str2;
        eza eza2 = eza;
        akcr.b(str2, "appId");
        String str9 = str5;
        akcr.b(str9, "url");
        String str10 = str6;
        akcr.b(str10, ConnectedAppsModel.APPNAME);
        String str11 = str7;
        akcr.b(str11, "contextType");
        List<String> list2 = list;
        akcr.b(list2, "presentUserIds");
        akcr.b(eza2, "cognacState");
        a(new ffs(str, str2, str3, str4, str9, str10, str11, list2), eza2);
        c().a(str2, fii.d(), str3);
        c().a(eza.a());
        this.i.a(str4);
        this.i.a(eza.COGNAC_OPENED_FROM_CHAT);
    }

    public final void a(List<? extends ffv> list, fgc fgc, ezf ezf) {
        List<? extends ffv> list2 = list;
        akcr.b(list2, "friendPickerFriends");
        akcr.b(fgc, "inAppConversationInfo");
        fdm fdm = new fdm(this.d, fgc.b(), this.q, eym.a, list2, this.c, this.r, this.s, this.w, this.h, this.z, ezf, this.y, this.o);
        achb achb = this.q;
        achd achd = fdm;
        acgu acgu = eym.c;
        akcr.a((Object) acgu, "CognacFeature.PRESENT_BOTTOM_TO_TOP");
        achb.a(achd, acgu, null);
    }

    /* Access modifiers changed, original: final */
    public final jwc b() {
        return (jwc) this.l.b();
    }

    /* Access modifiers changed, original: final */
    public final fap c() {
        return (fap) this.m.b();
    }
}
