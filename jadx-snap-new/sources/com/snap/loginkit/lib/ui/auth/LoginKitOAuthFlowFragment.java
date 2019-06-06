package com.snap.loginkit.lib.ui.auth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableMap;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aaas;
import defpackage.abur;
import defpackage.achb;
import defpackage.achg;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajef;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.dnh;
import defpackage.nhw;
import defpackage.zjk;
import defpackage.zjm;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LoginKitOAuthFlowFragment extends MainPageFragment implements nhw {
    public achb<zjm, zjk> a;
    public LoginKitOAuth2Presenter b;
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new a(this));
    private final ajxe e = ajxh.a(new d(this));
    private ajej f;
    private final AtomicBoolean g = new AtomicBoolean(true);

    static final class c implements ajev {
        private /* synthetic */ LoginKitOAuthFlowFragment a;

        c(LoginKitOAuthFlowFragment loginKitOAuthFlowFragment) {
            this.a = loginKitOAuthFlowFragment;
        }

        public final void run() {
        }
    }

    static final class a extends akcs implements akbk<abur<View>> {
        private /* synthetic */ LoginKitOAuthFlowFragment a;

        a(LoginKitOAuthFlowFragment loginKitOAuthFlowFragment) {
            this.a = loginKitOAuthFlowFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.a.getView();
            return view != null ? new abur(view, (int) R.id.authorization_screen_stub, (int) R.id.authorization_card) : null;
        }
    }

    static final class b extends akcs implements akbk<LoadingSpinnerView> {
        private /* synthetic */ LoginKitOAuthFlowFragment a;

        b(LoginKitOAuthFlowFragment loginKitOAuthFlowFragment) {
            this.a = loginKitOAuthFlowFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.a.getView();
            return view != null ? (LoadingSpinnerView) view.findViewById(R.id.loginkit_oauth2_spinner) : null;
        }
    }

    static final class d extends akcs implements akbk<abur<View>> {
        private /* synthetic */ LoginKitOAuthFlowFragment a;

        d(LoginKitOAuthFlowFragment loginKitOAuthFlowFragment) {
            this.a = loginKitOAuthFlowFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.a.getView();
            return view != null ? new abur(view, (int) R.id.auth_privacy_explainer_stub, (int) R.id.privacy_explainer_card) : null;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(LoginKitOAuthFlowFragment.class), "loadingView", "getLoadingView()Lcom/snap/ui/view/LoadingSpinnerView;"), new akdc(akde.a(LoginKitOAuthFlowFragment.class), "authCardView", "getAuthCardView()Lcom/snapchat/android/framework/ui/views/LazyViewWrapper;"), new akdc(akde.a(LoginKitOAuthFlowFragment.class), "privacyScreenView", "getPrivacyScreenView()Lcom/snapchat/android/framework/ui/views/LazyViewWrapper;")};
    }

    public final void a(Uri uri, String str) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(str, "clientPackageName");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(str);
        intent.addFlags(67108864);
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            getContext().startActivity(intent);
            return;
        }
        LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.b;
        if (loginKitOAuth2Presenter == null) {
            akcr.a("presenter");
        }
        loginKitOAuth2Presenter.f();
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        if (this.g.compareAndSet(true, false)) {
            Object e = ajvo.a(ajhn.a).b(100, TimeUnit.MILLISECONDS).a(ajef.a()).b((ajev) new c(this)).e();
            akcr.a(e, "Completable.complete()\n …             .subscribe()");
            this.f = e;
        }
    }

    public final Uri b() {
        Bundle arguments = getArguments();
        Uri uri = arguments != null ? (Uri) arguments.getParcelable("OAUTH2_URI") : null;
        if (uri != null) {
            return uri;
        }
        throw new ajxt("null cannot be cast to non-null type android.net.Uri");
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        ajej ajej = this.f;
        if (ajej == null) {
            akcr.a("disposable");
        }
        ajej.dispose();
    }

    public final LoadingSpinnerView c() {
        return (LoadingSpinnerView) this.c.b();
    }

    public final abur<View> d() {
        return (abur) this.d.b();
    }

    public final abur<View> f() {
        return (abur) this.e.b();
    }

    public final void g() {
        achb achb = this.a;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.a((achg) dnh.a, false, true, null);
    }

    public final boolean o_() {
        LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.b;
        if (loginKitOAuth2Presenter == null) {
            akcr.a("presenter");
        }
        if (!loginKitOAuth2Presenter.i) {
            nhw nhw;
            if (loginKitOAuth2Presenter.f != null) {
                loginKitOAuth2Presenter.c().a(aaas.GO_BACK_TO_ORIGINAL_APP);
                ImmutableMap immutableMap = loginKitOAuth2Presenter.a;
                String str = "authParamsMap";
                if (immutableMap == null) {
                    akcr.a(str);
                }
                Object obj = immutableMap.get("redirect_uri");
                if (obj == null) {
                    akcr.a();
                }
                obj = Uri.parse((String) obj);
                ImmutableMap immutableMap2 = loginKitOAuth2Presenter.a;
                if (immutableMap2 == null) {
                    akcr.a(str);
                }
                str = (String) immutableMap2.get("package_name");
                nhw = (nhw) loginKitOAuth2Presenter.getTarget();
                if (nhw != null) {
                    akcr.a(obj, "redirectUri");
                    if (str == null) {
                        akcr.a();
                    }
                    nhw.a(obj, str);
                }
            } else {
                loginKitOAuth2Presenter.c().a(aaas.STAY_IN_CAMERA);
                nhw = (nhw) loginKitOAuth2Presenter.getTarget();
                if (nhw != null) {
                    nhw.g();
                }
            }
        }
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.b;
        if (loginKitOAuth2Presenter == null) {
            akcr.a("presenter");
        }
        loginKitOAuth2Presenter.takeTarget((nhw) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mushroom_login_kit_oauth2_fragment, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        LoginKitOAuth2Presenter loginKitOAuth2Presenter = this.b;
        if (loginKitOAuth2Presenter == null) {
            akcr.a("presenter");
        }
        loginKitOAuth2Presenter.dropTarget();
    }
}
