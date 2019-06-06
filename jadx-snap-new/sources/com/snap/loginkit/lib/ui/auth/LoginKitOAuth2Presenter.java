package com.snap.loginkit.lib.ui.auth;

import android.content.Context;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.brightcove.player.event.EventType;
import com.google.common.collect.ImmutableMap;
import com.snap.loginkit.lib.net.LoginKitAuthHttpInterface;
import com.snap.loginkit.lib.net.SnapKitHttpInterface;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aaas;
import defpackage.aban;
import defpackage.abao;
import defpackage.abaq;
import defpackage.abtp;
import defpackage.abur;
import defpackage.achb;
import defpackage.achd;
import defpackage.afnd;
import defpackage.aftr;
import defpackage.aftt;
import defpackage.aftz;
import defpackage.afub;
import defpackage.afun;
import defpackage.afur;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwc;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akgb;
import defpackage.akhw;
import defpackage.akws;
import defpackage.dds;
import defpackage.dib;
import defpackage.ftl;
import defpackage.hxs;
import defpackage.jwc;
import defpackage.jwe;
import defpackage.jwj;
import defpackage.jxa;
import defpackage.kaz;
import defpackage.kof;
import defpackage.ngn;
import defpackage.ngp;
import defpackage.nhf;
import defpackage.nhk;
import defpackage.nhp;
import defpackage.nht;
import defpackage.nhu;
import defpackage.nhv;
import defpackage.nhw;
import defpackage.nhx;
import defpackage.nhy;
import defpackage.nhz;
import defpackage.wjd;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class LoginKitOAuth2Presenter extends zll<nhw> implements defpackage.k, nhu, nhy {
    ImmutableMap<String, String> a;
    final zfw b = zgb.a(ngn.d, "LoginKitOAuth2Presenter");
    final Map<String, kaz<jwj>> c;
    kaz<jwj> d;
    kaz<jwj> e;
    afub f;
    kaz<jwj> g;
    final ajxe h;
    boolean i;
    Boolean j;
    final aipn<LoginKitAuthHttpInterface> k;
    final aipn<SnapKitHttpInterface> l;
    final Context m;
    final aipn<dib> n;
    final nhp o;
    final aipn<hxs> p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private Boolean v;
    private final achb<zjm, zjk> w;
    private final ngp x;
    private final aipn<ftl> y;

    static final class aa<T> implements ajfb<Throwable> {
        public static final aa a = new aa();

        aa() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class ac<T, R> implements ajfc<afub, ajdb> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        ac(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            afub afub = (afub) obj;
            akcr.b(afub, EventType.RESPONSE);
            LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.a;
            loginKitOAuth2Presenter.f = afub;
            int dimensionPixelSize = loginKitOAuth2Presenter.m.getResources().getDimensionPixelSize(R.dimen.login_kit_scope_row_icon_size);
            jxa b = new defpackage.jxa.a().a(dimensionPixelSize, dimensionPixelSize).b();
            akcr.a((Object) b, "RequestOptions.Builder()…e, scopeIconSize).build()");
            Object obj2 = afub.g;
            akcr.a(obj2, "response.scopesRequested");
            Iterable<afur> iterable = (Iterable) obj2;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (afur afur : iterable) {
                Uri parse = Uri.parse(afur.d);
                arrayList.add(loginKitOAuth2Presenter.a().a(parse, ngn.a(), b).b((ajdw) loginKitOAuth2Presenter.b.g()).a((ajdw) loginKitOAuth2Presenter.b.l()).a((ajfb) new m(afur, loginKitOAuth2Presenter, b)).d((ajfb) new q(parse)).e());
            }
            List h = ajyu.h((Collection) (List) arrayList);
            int dimensionPixelSize2 = loginKitOAuth2Presenter.m.getResources().getDimensionPixelSize(R.dimen.login_kit_app_icon_size);
            h.add(loginKitOAuth2Presenter.a().a(Uri.parse(afub.e), ngn.a(), new defpackage.jxa.a().a(dimensionPixelSize2, dimensionPixelSize2).b()).b((ajdw) loginKitOAuth2Presenter.b.g()).a((ajdw) loginKitOAuth2Presenter.b.l()).a((ajfb) new n(loginKitOAuth2Presenter)).d((ajfb) o.a).e());
            obj = ajcx.b((Iterable) h).a((ajfb) p.a);
            akcr.a(obj, "Completable.merge(comple…ing bitmaps %s\", error) }");
            return obj;
        }
    }

    static final class ad<T> implements ajfb<Throwable> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        ad(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f();
        }
    }

    static final class e<T> implements ajfb<akws<akhw>> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class g implements ajev {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        g(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final void run() {
            nht b = this.a.b();
            b.a().setVisibility(8);
            b.b().setVisibility(0);
            nhw nhw = (nhw) this.a.getTarget();
            if (nhw != null) {
                LoadingSpinnerView c = nhw.c();
                if (c != null) {
                    c.setVisibility(8);
                }
            }
        }
    }

    static final class h<T> implements ajfb<ajxm<? extends aftt, ? extends akws<akhw>>> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        h(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            Object obj2 = ajxm.a;
            akcr.a(obj2, "it.first");
            aftt aftt = (aftt) obj2;
            obj = ajxm.b;
            akcr.a(obj, "it.second");
            if (((akws) obj).e()) {
                obj = aftt.a;
                akcr.a(obj, "approvalResponse.redirectUri");
                if (!akgb.a((CharSequence) obj)) {
                    nhw nhw = (nhw) this.a.getTarget();
                    if (nhw != null) {
                        String str = "state";
                        obj2 = Uri.parse(aftt.a).buildUpon().appendQueryParameter("code", aftt.b).appendQueryParameter(str, aftt.c).build();
                        akcr.a(obj2, "Uri.parse(approvalRespon…\n                .build()");
                        Object obj3 = LoginKitOAuth2Presenter.a(this.a).get("package_name");
                        if (obj3 == null) {
                            akcr.a();
                        }
                        akcr.a(obj3, "authParamsMap[CLIENT_PACKAGE_NAME_EXTRA]!!");
                        nhw.a(obj2, (String) obj3);
                    }
                    this.a.c().a(true);
                    return;
                }
            }
            this.a.c().a(false);
            this.a.f();
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        i(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            akcr.b((Throwable) obj, "error");
            this.a.c().a(false);
            this.a.f();
        }
    }

    static final class j implements ajev {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        j(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final void run() {
            nhw nhw = (nhw) this.a.getTarget();
            if (nhw != null) {
                LoadingSpinnerView c = nhw.c();
                if (c != null) {
                    c.setVisibility(8);
                }
            }
        }
    }

    static final class k<T> implements ajfb<akws<akhw>> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        k(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            nhw nhw = (nhw) this.a.getTarget();
            if (nhw != null) {
                Object obj2 = LoginKitOAuth2Presenter.a(this.a).get("redirect_uri");
                if (obj2 == null) {
                    akcr.a();
                }
                obj2 = Uri.parse((String) obj2);
                akcr.a(obj2, "Uri.parse(authParamsMap[REDIRECT_URI_EXTRA]!!)");
                Object obj3 = LoginKitOAuth2Presenter.a(this.a).get("package_name");
                if (obj3 == null) {
                    akcr.a();
                }
                akcr.a(obj3, "authParamsMap[CLIENT_PACKAGE_NAME_EXTRA]!!");
                nhw.a(obj2, (String) obj3);
            }
        }
    }

    static final class l<T> implements ajfb<Throwable> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        l(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f();
        }
    }

    static final class m<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ afur a;
        private /* synthetic */ LoginKitOAuth2Presenter b;
        private /* synthetic */ jxa c;

        m(afur afur, LoginKitOAuth2Presenter loginKitOAuth2Presenter, jxa jxa) {
            this.a = afur;
            this.b = loginKitOAuth2Presenter;
            this.c = jxa;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (kaz) obj;
            Map map = this.b.c;
            Object obj2 = this.a.a;
            akcr.a(obj2, "scope.name");
            akcr.a(obj, "refCountedDisposable");
            map.put(obj2, obj);
        }
    }

    static final class n<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        n(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.g = (kaz) obj;
        }
    }

    static final class o<T> implements ajfb<Throwable> {
        public static final o a = new o();

        o() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class p<T> implements ajfb<Throwable> {
        public static final p a = new p();

        p() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class q<T> implements ajfb<Throwable> {
        private /* synthetic */ Uri a;

        q(Uri uri) {
            this.a = uri;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class r<T> implements ajfb<Long> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        r(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.a;
            long currentTimeMillis = System.currentTimeMillis();
            akcr.a(obj, "privacyScreenLastSeen");
            loginKitOAuth2Presenter.j = Boolean.valueOf(currentTimeMillis - obj.longValue() > 31449600000L);
            if (akcr.a(this.a.j, Boolean.TRUE)) {
                loginKitOAuth2Presenter = this.a;
                hxs hxs = (hxs) loginKitOAuth2Presenter.p.get();
                ImmutableMap of = ImmutableMap.of(nhf.LOGIN_KIT_PRIVACY_EXPLAINER_LAST_SEEN, Long.valueOf(System.currentTimeMillis()));
                if (of != null) {
                    zln.bindTo$default(loginKitOAuth2Presenter, hxs.a((Map) of, this.a.b).a((ajev) AnonymousClass1.a, (ajfb) AnonymousClass2.a), this.a, null, null, 6, null);
                    nhx nhx = (nhx) this.a.h.b();
                    nhw nhw = (nhw) this.a.getTarget();
                    abur f = nhw != null ? nhw.f() : null;
                    if (f != null) {
                        f.a((defpackage.abur.a) new nhz(new defpackage.nhx.b(nhx)));
                    }
                    nhp nhp = nhx.d;
                    Object i = abtp.i(nhx.b);
                    akcr.a(i, "ViewUtils.getDpiSuffix(context)");
                    nhp.a(i, ngn.a(), new defpackage.nhx.c(nhx, f));
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<com.snap.config.ConfigurationKey, kotlin.Any>");
            }
        }
    }

    static final class s<T> implements ajfb<Throwable> {
        public static final s a = new s();

        s() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class v implements ajev {
        private /* synthetic */ LoginKitOAuth2Presenter a;
        private /* synthetic */ String b;

        v(LoginKitOAuth2Presenter loginKitOAuth2Presenter, String str) {
            this.a = loginKitOAuth2Presenter;
            this.b = str;
        }

        public final void run() {
            this.a.d();
        }
    }

    static final class w<T> implements ajfb<Throwable> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        w(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.e();
        }
    }

    static final class x<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        x(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.e = (kaz) obj;
        }
    }

    static final class y<T> implements ajfb<Throwable> {
        public static final y a = new y();

        y() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class z<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        z(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.d = (kaz) obj;
        }
    }

    static final class a extends akcs implements akbk<nhk> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        a(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new nhk(this.a.n, (String) LoginKitOAuth2Presenter.a(this.a).get("client_id"), (String) LoginKitOAuth2Presenter.a(this.a).get("kit_version"));
        }
    }

    static final class ab extends akcs implements akbk<ajcx> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        ab(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.a;
            LoginKitAuthHttpInterface loginKitAuthHttpInterface = (LoginKitAuthHttpInterface) loginKitOAuth2Presenter.k.get();
            aftz aftz = new aftz();
            ImmutableMap immutableMap = loginKitOAuth2Presenter.a;
            String str = "authParamsMap";
            if (immutableMap == null) {
                akcr.a(str);
            }
            aftz.a = (String) immutableMap.get("response_type");
            immutableMap = loginKitOAuth2Presenter.a;
            if (immutableMap == null) {
                akcr.a(str);
            }
            aftz.b = (String) immutableMap.get("client_id");
            immutableMap = loginKitOAuth2Presenter.a;
            if (immutableMap == null) {
                akcr.a(str);
            }
            aftz.c = (String) immutableMap.get("redirect_uri");
            immutableMap = loginKitOAuth2Presenter.a;
            if (immutableMap == null) {
                akcr.a(str);
            }
            aftz.d = (String) immutableMap.get("scope");
            immutableMap = loginKitOAuth2Presenter.a;
            if (immutableMap == null) {
                akcr.a(str);
            }
            aftz.e = (String) immutableMap.get("state");
            immutableMap = loginKitOAuth2Presenter.a;
            if (immutableMap == null) {
                akcr.a(str);
            }
            aftz.f = (String) immutableMap.get("code_challenge_method");
            immutableMap = loginKitOAuth2Presenter.a;
            if (immutableMap == null) {
                akcr.a(str);
            }
            aftz.g = (String) immutableMap.get("code_challenge");
            Object a = loginKitAuthHttpInterface.validateOAuthRequest(aftz).b((ajdw) loginKitOAuth2Presenter.b.g()).a((ajdw) loginKitOAuth2Presenter.b.l()).e((ajfc) new ac(loginKitOAuth2Presenter)).a((ajfb) new ad(loginKitOAuth2Presenter));
            akcr.a(a, "loginkitAuthHttpInterfac…ialog()\n                }");
            return a;
        }
    }

    static final class b extends akcs implements akbk<nht> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        b(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.a.m;
            LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.a;
            nhu nhu = loginKitOAuth2Presenter;
            afub afub = loginKitOAuth2Presenter.f;
            if (afub == null) {
                akcr.a();
            }
            return new nht(context, nhu, afub, this.a.g, this.a.d, this.a.e, this.a.c);
        }
    }

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

    static final class d extends akcs implements akbk<ajcx> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        d(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.a;
            SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) loginKitOAuth2Presenter.l.get();
            ImmutableMap immutableMap = loginKitOAuth2Presenter.a;
            String str = "authParamsMap";
            if (immutableMap == null) {
                akcr.a(str);
            }
            String str2 = (String) immutableMap.get("client_id");
            ImmutableMap immutableMap2 = loginKitOAuth2Presenter.a;
            if (immutableMap2 == null) {
                akcr.a(str);
            }
            String str3 = (String) immutableMap2.get("package_name");
            ImmutableMap immutableMap3 = loginKitOAuth2Presenter.a;
            if (immutableMap3 == null) {
                akcr.a(str);
            }
            String str4 = (String) immutableMap3.get("kit_version");
            Object a = wjd.LOGIN_KIT.a();
            akcr.a(a, "SnapTokenAccessTokenScop…N_KIT.serverSideScopeName");
            Object e = snapKitHttpInterface.validateThirdPartyClient(str2, str3, null, str4, "LOGIN_KIT", a).b((ajdw) loginKitOAuth2Presenter.b.g()).a((ajfb) e.a).d((ajfb) f.a).e();
            akcr.a(e, "snapkitHttpInterface.get…         .ignoreElement()");
            return e;
        }
    }

    static final class t extends akcs implements akbk<nhx> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        t(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.a.m;
            LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.a;
            return new nhx(context, loginKitOAuth2Presenter, loginKitOAuth2Presenter.o);
        }
    }

    static final class u extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginKitOAuth2Presenter a;

        u(LoginKitOAuth2Presenter loginKitOAuth2Presenter) {
            this.a = loginKitOAuth2Presenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            nhw nhw = (nhw) this.a.getTarget();
            if (nhw != null) {
                nhw.g();
            }
            this.a.c().a(aaas.STAY_IN_CAMERA);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(LoginKitOAuth2Presenter.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(LoginKitOAuth2Presenter.class), "clientValidateReqCompletable", "getClientValidateReqCompletable()Lio/reactivex/Completable;"), new akdc(akde.a(LoginKitOAuth2Presenter.class), "validateOAuthReqCompletable", "getValidateOAuthReqCompletable()Lio/reactivex/Completable;"), new akdc(akde.a(LoginKitOAuth2Presenter.class), "authCardPresenter", "getAuthCardPresenter()Lcom/snap/loginkit/lib/ui/auth/LoginKitAuthCardPresenter;"), new akdc(akde.a(LoginKitOAuth2Presenter.class), "privacyScreenPresenter", "getPrivacyScreenPresenter()Lcom/snap/loginkit/lib/ui/auth/LoginKitPrivacyScreenPresenter;"), new akdc(akde.a(LoginKitOAuth2Presenter.class), "analyticsLogger", "getAnalyticsLogger()Lcom/snap/loginkit/lib/metrics/LoginKitAnalyticsLogger;")};
    }

    public LoginKitOAuth2Presenter(zgb zgb, jwe jwe, aipn<LoginKitAuthHttpInterface> aipn, aipn<SnapKitHttpInterface> aipn2, achb<zjm, zjk> achb, Context context, ngp ngp, aipn<dib> aipn3, aipn<ftl> aipn4, nhp nhp, aipn<hxs> aipn5) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(jwe, "bitmapLoaderFactory");
        akcr.b(aipn, "loginkitAuthHttpInterface");
        akcr.b(aipn2, "snapkitHttpInterface");
        akcr.b(achb, "navigationHost");
        akcr.b(context, "context");
        akcr.b(ngp, "loginkitUser");
        akcr.b(aipn3, "blizzardEventLogger");
        akcr.b(aipn4, "compositeConfigurationProvider");
        akcr.b(nhp, "privacyExplainerGraphicDownloader");
        akcr.b(aipn5, "featureConfiguration");
        this.k = aipn;
        this.l = aipn2;
        this.w = achb;
        this.m = context;
        this.x = ngp;
        this.n = aipn3;
        this.y = aipn4;
        this.o = nhp;
        this.p = aipn5;
        this.q = ajxh.a(new c(jwe));
        this.c = new LinkedHashMap();
        this.r = ajxh.a(new d(this));
        this.s = ajxh.a(new ab(this));
        this.t = ajxh.a(new b(this));
        this.h = ajxh.a(new t(this));
        this.u = ajxh.a(new a(this));
    }

    private final void c(String str, List<String> list) {
        nhw nhw = (nhw) getTarget();
        if (nhw != null) {
            LoadingSpinnerView c = nhw.c();
            if (c != null) {
                c.setVisibility(0);
            }
        }
        ajdx approveOAuthRequest = ((LoginKitAuthHttpInterface) this.k.get()).approveOAuthRequest(d(str, list));
        SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) this.l.get();
        kof kof = new kof();
        ImmutableMap immutableMap = this.a;
        if (immutableMap == null) {
            akcr.a("authParamsMap");
        }
        Object a = kof.a((String) immutableMap.get("client_id"));
        akcr.a(a, "ConnectRequest().setOAut…ramsMap[CLIENT_ID_EXTRA])");
        Object a2 = wjd.LOGIN_KIT.a();
        akcr.a(a2, "SnapTokenAccessTokenScop…N_KIT.serverSideScopeName");
        zln.bindTo$default(this, ajwc.a(approveOAuthRequest, snapKitHttpInterface.appConnect(a, a2)).b((ajdw) this.b.g()).a((ajdw) this.b.l()).b((ajev) new g(this)).a((ajfb) new h(this), (ajfb) new i(this)), this, null, null, 6, null);
    }

    private static aftr d(String str, List<String> list) {
        aftr aftr = new aftr();
        aftr.a = str;
        aftr.b = list;
        return aftr;
    }

    private final ajcx h() {
        return (ajcx) this.r.b();
    }

    private final ajcx i() {
        return (ajcx) this.s.b();
    }

    /* Access modifiers changed, original: final */
    public final jwc a() {
        return (jwc) this.q.b();
    }

    public final void a(String str) {
        akcr.b(str, "approvalToken");
        nhw nhw = (nhw) getTarget();
        if (nhw != null) {
            LoadingSpinnerView c = nhw.c();
            if (c != null) {
                c.setVisibility(0);
            }
        }
        nhk c2 = c();
        abao abao = new abao();
        abao.a(Boolean.FALSE);
        c2.a((aban) abao);
        this.i = true;
        LoginKitAuthHttpInterface loginKitAuthHttpInterface = (LoginKitAuthHttpInterface) this.k.get();
        afun afun = new afun();
        afun.a = str;
        zln.bindTo$default(this, loginKitAuthHttpInterface.denyOAuthRequest(afun).b((ajdw) this.b.g()).a((ajdw) this.b.l()).b((ajev) new j(this)).a((ajfb) new k(this), (ajfb) new l(this)), this, null, null, 6, null);
    }

    public final void a(String str, List<String> list) {
        akcr.b(str, "approvalToken");
        akcr.b(list, "approvedScopes");
        b().c();
        boolean contains = list.contains("https://auth.snapchat.com/oauth2/api/user.bitmoji.avatar");
        nhk c = c();
        abao abao = new abao();
        abao.a(Boolean.TRUE);
        abao.b(Boolean.valueOf(contains));
        c.a((aban) abao);
        this.i = true;
        c(str, list);
    }

    /* renamed from: a */
    public final void takeTarget(nhw nhw) {
        akcr.b(nhw, "target");
        super.takeTarget(nhw);
        nhw.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final nht b() {
        return (nht) this.t.b();
    }

    public final void b(String str, List<String> list) {
        akcr.b(str, "approvalToken");
        akcr.b(list, "approvedScopes");
        b().c();
        boolean contains = list.contains("https://auth.snapchat.com/oauth2/api/user.bitmoji.avatar");
        nhk c = c();
        abaq abaq = new abaq();
        abaq.a(Boolean.TRUE);
        abaq.b(Boolean.valueOf(contains));
        c.a((aban) abaq);
        this.i = true;
        c(str, list);
    }

    /* Access modifiers changed, original: final */
    public final nhk c() {
        return (nhk) this.u.b();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.v = Boolean.TRUE;
        if (!akcr.a(this.j, Boolean.TRUE) && this.j != null) {
            nhw nhw = (nhw) getTarget();
            if (nhw != null) {
                LoadingSpinnerView c = nhw.c();
                if (c != null) {
                    c.setVisibility(8);
                }
            }
            nht b = b();
            nhw nhw2 = (nhw) getTarget();
            abur d = nhw2 != null ? nhw2.d() : null;
            if (d != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(b.c, R.anim.slide_up_from_bottom);
                loadAnimation.setAnimationListener(new defpackage.nht.d(d));
                d.a((defpackage.abur.a) new nhv(new defpackage.nht.e(b)));
                d.a().startAnimation(loadAnimation);
            }
        }
    }

    public final void dropTarget() {
        nhw nhw = (nhw) getTarget();
        if (nhw != null) {
            defpackage.j lifecycle = nhw.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        this.v = Boolean.FALSE;
        if (this.j != null) {
            f();
        }
    }

    public final void f() {
        zgy a = new defpackage.zgy.a(this.m, this.w, ngn.b, false, null, 16).a((int) R.string.error).b((int) R.string.something_went_wrong).a((int) R.string.okay, (akbl) new u(this), false).a();
        this.w.a((achd) a, a.a, null);
    }

    public final void g() {
        this.j = Boolean.FALSE;
        if (akcr.a(this.v, Boolean.TRUE)) {
            d();
            return;
        }
        if (akcr.a(this.v, Boolean.FALSE)) {
            e();
        }
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onFragmentCreate() {
        List b;
        Object obj = (nhw) getTarget();
        if (obj != null) {
            akcr.a(obj, "it");
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.registerParameter("scope", UrlQuerySanitizer.getSpaceLegal());
            Uri b2 = obj.b();
            urlQuerySanitizer.parseUrl(b2 != null ? b2.toString() : null);
            HashMap hashMap = new HashMap();
            for (ParameterValuePair parameterValuePair : urlQuerySanitizer.getParameterList()) {
                if (!(TextUtils.isEmpty(parameterValuePair.mParameter) || TextUtils.isEmpty(parameterValuePair.mValue))) {
                    Map map = hashMap;
                    Object obj2 = parameterValuePair.mParameter;
                    akcr.a(obj2, "valuePair.mParameter");
                    Object obj3 = parameterValuePair.mValue;
                    akcr.a(obj3, "valuePair.mValue");
                    map.put(obj2, obj3);
                }
            }
            obj = ImmutableMap.copyOf((Map) hashMap);
            akcr.a(obj, "ImmutableMap.copyOf(tempMap)");
            this.a = obj;
        }
        nhw nhw = (nhw) getTarget();
        if (nhw != null) {
            LoadingSpinnerView c = nhw.c();
            if (c != null) {
                c.setVisibility(0);
            }
        }
        zln zln = this;
        zln.bindTo$default(this, ((ftl) this.y.get()).t(nhf.LOGIN_KIT_PRIVACY_EXPLAINER_LAST_SEEN).e().b((ajdw) this.b.f()).a((ajdw) this.b.l()).a((ajfb) new r(this), (ajfb) s.a), zln, null, null, 6, null);
        String a = this.x.a();
        if (a == null) {
            b = ajym.b((Object[]) new ajcx[]{i(), h()});
        } else {
            int dimensionPixelSize = this.m.getResources().getDimensionPixelSize(R.dimen.login_kit_bitmoji_large_size);
            int dimensionPixelSize2 = this.m.getResources().getDimensionPixelSize(R.dimen.login_kit_bitmoji_scope_profile_size);
            ajcx e = a().a(dds.a(a, "10228371", afnd.SNAP_KIT, false, 0, 24), ngn.a(), new defpackage.jxa.a().a(dimensionPixelSize, dimensionPixelSize).b()).b((ajdw) this.b.f()).a((ajdw) this.b.l()).a((ajfb) new z(this)).d((ajfb) aa.a).e();
            ajcx e2 = a().a(dds.a(a, "6972338", afnd.SNAP_KIT, false, 0, 24), ngn.a(), new defpackage.jxa.a().a(dimensionPixelSize2, dimensionPixelSize2).b()).b((ajdw) this.b.f()).a((ajdw) this.b.l()).a((ajfb) new x(this)).d((ajfb) y.a).e();
            b = ajym.b((Object[]) new ajcx[]{i(), h(), e, e2});
        }
        zln.bindTo$default(this, ajcx.b((Iterable) b).a((ajdw) this.b.l()).a((ajev) new v(this, a), (ajfb) new w(this)), zln, null, null, 6, null);
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onFragmentDestroyed() {
        kaz kaz = this.g;
        if (kaz != null) {
            kaz.dispose();
        }
        for (Entry value : this.c.entrySet()) {
            ((kaz) value.getValue()).dispose();
        }
        kaz = this.d;
        if (kaz != null) {
            kaz.dispose();
        }
        kaz = this.e;
        if (kaz != null) {
            kaz.dispose();
        }
    }
}
