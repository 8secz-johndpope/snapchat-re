package com.snap.bitmoji.ui.settings.presenter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.text.TextUtils;
import android.view.View;
import com.brightcove.player.event.Event;
import com.google.common.collect.ImmutableMap;
import com.snap.bitmoji.net.BitmojiAuthHttpInterface;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.abkq;
import defpackage.achb;
import defpackage.achd;
import defpackage.afyc;
import defpackage.afye;
import defpackage.afyg;
import defpackage.afyo;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.ddd;
import defpackage.ddg;
import defpackage.ddt;
import defpackage.dgo;
import defpackage.dhh;
import defpackage.dhn;
import defpackage.gpb;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class BitmojiOAuth2Presenter extends zll<dhn> implements defpackage.k {
    final zfw a = zgb.a(ddg.l, "BitmojiOAuth2Presenter");
    LoadingSpinnerView b;
    ImmutableMap<String, String> c;
    final Context d;
    final ddt e;
    final aipn<achb<zjm, zjk>> f;
    final aipn<BitmojiAuthHttpInterface> g;
    final gpb h;
    final aipn<ddd> i;
    private final AtomicBoolean j = new AtomicBoolean();
    private final dgo k;

    static final class a<V> implements Callable<T> {
        private /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object call() {
            afyo afyo = new afyo();
            afyo.a = this.a;
            return afyo;
        }
    }

    static final class m<V> implements Callable<T> {
        private /* synthetic */ BitmojiOAuth2Presenter a;

        m(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            this.a = bitmojiOAuth2Presenter;
        }

        public final /* synthetic */ Object call() {
            BitmojiOAuth2Presenter bitmojiOAuth2Presenter = this.a;
            afye afye = new afye();
            ImmutableMap immutableMap = bitmojiOAuth2Presenter.c;
            String str = "authParamsMap";
            if (immutableMap == null) {
                akcr.a(str);
            }
            afye.a = (String) immutableMap.get("response_type");
            immutableMap = bitmojiOAuth2Presenter.c;
            if (immutableMap == null) {
                akcr.a(str);
            }
            afye.b = (String) immutableMap.get("client_id");
            immutableMap = bitmojiOAuth2Presenter.c;
            if (immutableMap == null) {
                akcr.a(str);
            }
            afye.c = (String) immutableMap.get("redirect_uri");
            immutableMap = bitmojiOAuth2Presenter.c;
            if (immutableMap == null) {
                akcr.a(str);
            }
            afye.d = (String) immutableMap.get("scope");
            immutableMap = bitmojiOAuth2Presenter.c;
            if (immutableMap == null) {
                akcr.a(str);
            }
            afye.e = (String) immutableMap.get("state");
            immutableMap = bitmojiOAuth2Presenter.c;
            if (immutableMap == null) {
                akcr.a(str);
            }
            afye.f = (String) immutableMap.get("code_challenge_method");
            ImmutableMap immutableMap2 = bitmojiOAuth2Presenter.c;
            if (immutableMap2 == null) {
                akcr.a(str);
            }
            afye.g = (String) immutableMap2.get("code_challenge");
            return afye;
        }
    }

    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ BitmojiOAuth2Presenter a;
        private /* synthetic */ boolean b;

        b(BitmojiOAuth2Presenter bitmojiOAuth2Presenter, boolean z) {
            this.a = bitmojiOAuth2Presenter;
            this.b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            afyo afyo = (afyo) obj;
            akcr.b(afyo, "request");
            return this.b ? ((BitmojiAuthHttpInterface) this.a.g.get()).validateApprovalOAuthRequest(afyo) : ((BitmojiAuthHttpInterface) this.a.g.get()).validateDenialOAuthRequest(afyo);
        }
    }

    static final class g<T> implements ajfb<abkq> {
        private /* synthetic */ BitmojiOAuth2Presenter a;
        private /* synthetic */ afyg b;

        g(BitmojiOAuth2Presenter bitmojiOAuth2Presenter, afyg afyg) {
            this.a = bitmojiOAuth2Presenter;
            this.b = afyg;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.zgy.a b;
            int i;
            i jVar;
            abkq abkq = (abkq) obj;
            BitmojiOAuth2Presenter bitmojiOAuth2Presenter = this.a;
            Object obj2 = this.b.a;
            akcr.a(obj2, "response.approvalToken");
            boolean z = abkq.f != null;
            Object b2 = this.a.h.b();
            akcr.a(b2, "userAuthStore.username");
            ((ddd) bitmojiOAuth2Presenter.i.get()).a(aaua.EXTERNAL);
            zjm zjm = new zjm(ddg.l, "bitmoji_auth_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
            Object obj3 = (achb) bitmojiOAuth2Presenter.f.get();
            akcr.a(obj3, "it");
            defpackage.zgy.a a = dgo.a(zjm, obj3, bitmojiOAuth2Presenter.d, false);
            String format;
            if (z) {
                Object string = bitmojiOAuth2Presenter.d.getString(R.string.bitmoji_login);
                akcr.a(string, "context.getString(R.string.bitmoji_login)");
                format = String.format(string, Arrays.copyOf(new Object[]{b2}, 1));
                akcr.a((Object) format, "java.lang.String.format(this, *args)");
                b = a.b(format);
                i = R.string.bitmoji_login_button_text;
                jVar = new j(bitmojiOAuth2Presenter, zjm, b2, obj2);
            } else {
                dhn dhn = (dhn) bitmojiOAuth2Presenter.getTarget();
                boolean c = dhn != null ? dhn.c() : false;
                defpackage.zgy.a a2 = a.a(c ? R.string.bitmoji_connect_title : R.string.bitmoji_create_title);
                format = bitmojiOAuth2Presenter.d.getString(c ? R.string.bitmoji_connect_message : R.string.bitmoji_create_message, new Object[]{b2});
                akcr.a((Object) format, "context.getString(\n     …                username)");
                b = a2.b(format);
                i = c ? R.string.bitmoji_connect_option : R.string.bitmoji_create_option;
                jVar = new i(bitmojiOAuth2Presenter, zjm, b2, obj2);
            }
            b.a(i, (akbl) jVar, true);
            defpackage.zgy.a.a(a, (akbl) new k(bitmojiOAuth2Presenter, zjm, z, b2, obj2), false, null, null, null, 30);
            zgy a3 = a.a();
            obj3.a((achd) a3, a3.a, null);
        }
    }

    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ BitmojiOAuth2Presenter a;

        n(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            this.a = bitmojiOAuth2Presenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            afye afye = (afye) obj;
            akcr.b(afye, "request");
            return ((BitmojiAuthHttpInterface) this.a.g.get()).validateBitmojiOAuthRequest(afye);
        }
    }

    static final class i extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BitmojiOAuth2Presenter a;
        private /* synthetic */ zjm b;
        private /* synthetic */ boolean c = false;
        private /* synthetic */ String d;
        private /* synthetic */ String e;

        i(BitmojiOAuth2Presenter bitmojiOAuth2Presenter, zjm zjm, String str, String str2) {
            this.a = bitmojiOAuth2Presenter;
            this.b = zjm;
            this.d = str;
            this.e = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.e, true);
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BitmojiOAuth2Presenter a;
        private /* synthetic */ zjm b;
        private /* synthetic */ boolean c = true;
        private /* synthetic */ String d;
        private /* synthetic */ String e;

        j(BitmojiOAuth2Presenter bitmojiOAuth2Presenter, zjm zjm, String str, String str2) {
            this.a = bitmojiOAuth2Presenter;
            this.b = zjm;
            this.d = str;
            this.e = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.e, true);
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BitmojiOAuth2Presenter a;
        private /* synthetic */ zjm b;
        private /* synthetic */ boolean c;
        private /* synthetic */ String d;
        private /* synthetic */ String e;

        k(BitmojiOAuth2Presenter bitmojiOAuth2Presenter, zjm zjm, boolean z, String str, String str2) {
            this.a = bitmojiOAuth2Presenter;
            this.b = zjm;
            this.c = z;
            this.d = str;
            this.e = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.e, false);
            return ajxw.a;
        }
    }

    static final class l extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BitmojiOAuth2Presenter a;
        private /* synthetic */ zjm b;

        l(BitmojiOAuth2Presenter bitmojiOAuth2Presenter, zjm zjm) {
            this.a = bitmojiOAuth2Presenter;
            this.b = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.e.a(defpackage.ddt.a.OAUTH, "", aaua.EXTERNAL);
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbl<afyc, ajxw> {
        c(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            super(1, bitmojiOAuth2Presenter);
        }

        public final String getName() {
            return "onOAuth2ApprovalSuccess";
        }

        public final akej getOwner() {
            return akde.a(BitmojiOAuth2Presenter.class);
        }

        public final String getSignature() {
            return "onOAuth2ApprovalSuccess(Lcom/snapchat/soju/android/bitmoji/BitmojiApprovalResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            afyc afyc = (afyc) obj;
            akcr.b(afyc, "p1");
            BitmojiOAuth2Presenter bitmojiOAuth2Presenter = (BitmojiOAuth2Presenter) this.receiver;
            if (afyc.b == null || afyc.a == null || afyc.c == null) {
                bitmojiOAuth2Presenter.a();
            } else {
                ddt ddt = bitmojiOAuth2Presenter.e;
                Object obj2 = afyc.a;
                akcr.a(obj2, "response.redirectUri");
                Object obj3 = afyc.b;
                akcr.a(obj3, "response.code");
                obj = afyc.c;
                akcr.a(obj, "response.state");
                akcr.b(obj2, "redirectUri");
                String str = "code";
                akcr.b(obj3, str);
                String str2 = "state";
                akcr.b(obj, str2);
                obj = Uri.parse(obj2).buildUpon().appendQueryParameter(str, obj3).appendQueryParameter(str2, obj).build();
                akcr.a(obj, "Uri.parse(redirectUri)\n …\n                .build()");
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", obj);
                    intent.setPackage("com.bitstrips.imoji");
                    intent.addFlags(335544320);
                    ddt.b.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    ddt.a(defpackage.ddt.a.OAUTH, "", aaua.EXTERNAL);
                }
            }
            return ajxw.a;
        }
    }

    static final class d extends akcq implements akbl<afyc, ajxw> {
        d(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            super(1, bitmojiOAuth2Presenter);
        }

        public final String getName() {
            return "onOAuth2DenialSuccess";
        }

        public final akej getOwner() {
            return akde.a(BitmojiOAuth2Presenter.class);
        }

        public final String getSignature() {
            return "onOAuth2DenialSuccess(Lcom/snapchat/soju/android/bitmoji/BitmojiApprovalResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((afyc) obj, "p1");
            ((BitmojiOAuth2Presenter) this.receiver).e.a(defpackage.ddt.a.OAUTH, "", aaua.EXTERNAL);
            return ajxw.a;
        }
    }

    static final class e extends akcq implements akbl<Throwable, ajxw> {
        e(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            super(1, bitmojiOAuth2Presenter);
        }

        public final String getName() {
            return "onOAuth2ApprovalFailure";
        }

        public final akej getOwner() {
            return akde.a(BitmojiOAuth2Presenter.class);
        }

        public final String getSignature() {
            return "onOAuth2ApprovalFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((BitmojiOAuth2Presenter) this.receiver).a();
            return ajxw.a;
        }
    }

    static final class f extends akcq implements akbl<Throwable, ajxw> {
        f(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            super(1, bitmojiOAuth2Presenter);
        }

        public final String getName() {
            return "onOAuth2DenialFailure";
        }

        public final akej getOwner() {
            return akde.a(BitmojiOAuth2Presenter.class);
        }

        public final String getSignature() {
            return "onOAuth2DenialFailure(Ljava/lang/Throwable;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    static final class o extends akcq implements akbl<afyg, ajxw> {
        o(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            super(1, bitmojiOAuth2Presenter);
        }

        public final String getName() {
            return "onOAuth2RequestSuccess";
        }

        public final akej getOwner() {
            return akde.a(BitmojiOAuth2Presenter.class);
        }

        public final String getSignature() {
            return "onOAuth2RequestSuccess(Lcom/snapchat/soju/android/bitmoji/BitmojiAuthorizationResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            afyg afyg = (afyg) obj;
            akcr.b(afyg, "p1");
            BitmojiOAuth2Presenter bitmojiOAuth2Presenter = (BitmojiOAuth2Presenter) this.receiver;
            LoadingSpinnerView loadingSpinnerView = bitmojiOAuth2Presenter.b;
            if (loadingSpinnerView == null) {
                akcr.a("loadingSpinnerView");
            }
            loadingSpinnerView.setVisibility(8);
            zln.bindTo$default(bitmojiOAuth2Presenter, bitmojiOAuth2Presenter.h.c().e().b((ajdw) bitmojiOAuth2Presenter.a.h()).a((ajdw) bitmojiOAuth2Presenter.a.l()).a((ajfb) new g(bitmojiOAuth2Presenter, afyg), (ajfb) h.a), bitmojiOAuth2Presenter, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class p extends akcq implements akbl<Throwable, ajxw> {
        p(BitmojiOAuth2Presenter bitmojiOAuth2Presenter) {
            super(1, bitmojiOAuth2Presenter);
        }

        public final String getName() {
            return "onOAuth2RequestFailure";
        }

        public final akej getOwner() {
            return akde.a(BitmojiOAuth2Presenter.class);
        }

        public final String getSignature() {
            return "onOAuth2RequestFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            BitmojiOAuth2Presenter bitmojiOAuth2Presenter = (BitmojiOAuth2Presenter) this.receiver;
            LoadingSpinnerView loadingSpinnerView = bitmojiOAuth2Presenter.b;
            if (loadingSpinnerView == null) {
                akcr.a("loadingSpinnerView");
            }
            loadingSpinnerView.setVisibility(8);
            bitmojiOAuth2Presenter.a();
            return ajxw.a;
        }
    }

    public BitmojiOAuth2Presenter(Context context, ddt ddt, aipn<achb<zjm, zjk>> aipn, aipn<BitmojiAuthHttpInterface> aipn2, zgb zgb, gpb gpb, dgo dgo, aipn<ddd> aipn3) {
        akcr.b(context, "context");
        akcr.b(ddt, "bitmojiUtils");
        akcr.b(aipn, "navigationHost");
        akcr.b(aipn2, "bitmojiAuthHttpInterface");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(dgo, "bitmojiDialogController");
        akcr.b(aipn3, "bitmojiEventsAnalytics");
        this.d = context;
        this.e = ddt;
        this.f = aipn;
        this.g = aipn2;
        this.h = gpb;
        this.k = dgo;
        this.i = aipn3;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        zjm zjm = new zjm(ddg.l, "bitmoji_auth_please_try_again", false, false, true, false, null, false, false, false, false, null, 4076);
        Object obj = (achb) this.f.get();
        akcr.a(obj, "it");
        zgy a = defpackage.zgy.a.a(dgo.a(zjm, obj, this.d, true).a((int) R.string.bitmoji_please_try_again, (akbl) new l(this, zjm), false), null, false, null, null, null, 31).a();
        obj.a((achd) a, a.a, null);
    }

    /* renamed from: a */
    public final void takeTarget(dhn dhn) {
        akcr.b(dhn, "target");
        super.takeTarget(dhn);
        dhn.getLifecycle().a(this);
    }

    public final void a(String str, boolean z) {
        akcr.b(str, Event.REQUEST_TOKEN);
        if (z) {
            ((ddd) this.i.get()).b(aaua.EXTERNAL, this.e.a());
        }
        zln.bindTo$default(this, ajdx.c((Callable) new a(str)).a((ajfc) new b(this, z)).b((ajdw) this.a.g()).a((ajdw) this.a.l()).a((ajfb) new dhh(z ? new c(this) : new d(this)), (ajfb) new dhh(z ? new e(this) : new f(this))), this, null, null, 6, null);
    }

    public final void dropTarget() {
        dhn dhn = (dhn) getTarget();
        if (dhn != null) {
            defpackage.j lifecycle = dhn.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.j.compareAndSet(false, true)) {
            Object obj = (dhn) getTarget();
            if (obj != null) {
                akcr.a(obj, "it");
                this.b = obj.a();
                Uri b = obj.b();
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(b != null ? b.toString() : null);
                HashMap hashMap = new HashMap();
                for (ParameterValuePair parameterValuePair : urlQuerySanitizer.getParameterList()) {
                    if (!(parameterValuePair == null || TextUtils.isEmpty(parameterValuePair.mParameter) || TextUtils.isEmpty(parameterValuePair.mValue))) {
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
                this.c = obj;
                ImmutableMap immutableMap = this.c;
                String str = "authParamsMap";
                if (immutableMap == null) {
                    akcr.a(str);
                }
                if (!TextUtils.isEmpty((CharSequence) immutableMap.get("state"))) {
                    immutableMap = this.c;
                    if (immutableMap == null) {
                        akcr.a(str);
                    }
                    if (!TextUtils.isEmpty((CharSequence) immutableMap.get("redirect_uri"))) {
                        LoadingSpinnerView loadingSpinnerView = this.b;
                        if (loadingSpinnerView == null) {
                            akcr.a("loadingSpinnerView");
                        }
                        loadingSpinnerView.setVisibility(0);
                        BitmojiOAuth2Presenter bitmojiOAuth2Presenter = this;
                        zln.bindTo$default(this, ajdx.c((Callable) new m(this)).a((ajfc) new n(this)).b((ajdw) this.a.g()).a((ajdw) this.a.l()).a((ajfb) new dhh(new o(bitmojiOAuth2Presenter)), (ajfb) new dhh(new p(bitmojiOAuth2Presenter))), this, null, null, 6, null);
                        return;
                    }
                }
                a();
            }
        }
    }
}
