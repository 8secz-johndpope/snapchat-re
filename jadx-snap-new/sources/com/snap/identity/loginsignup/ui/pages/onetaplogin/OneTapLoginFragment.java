package com.snap.identity.loginsignup.ui.pages.onetaplogin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.bitmoji.view.BitmojiSilhouetteView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.akcr;
import defpackage.jbk;
import defpackage.jbk.g;
import defpackage.jbk.h;
import defpackage.jgn;
import defpackage.jrl;
import defpackage.zjj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;

public final class OneTapLoginFragment extends LoginSignupFragment implements jgn, zjj, zjq {
    public OneTapLoginPresenter a;
    private BitmojiSilhouetteView b;
    private ProgressButton c;
    private View d;
    private View e;
    private View f;

    public final long S_() {
        return -1;
    }

    public final BitmojiSilhouetteView a() {
        BitmojiSilhouetteView bitmojiSilhouetteView = this.b;
        if (bitmojiSilhouetteView == null) {
            akcr.a("avatar");
        }
        return bitmojiSilhouetteView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        OneTapLoginPresenter oneTapLoginPresenter = this.a;
        if (oneTapLoginPresenter == null) {
            akcr.a("presenter");
        }
        ((jbk) oneTapLoginPresenter.j.get()).i();
        jbk jbk = (jbk) oneTapLoginPresenter.j.get();
        ajej a = jbk.c().b().a((ajdw) jbk.d().l()).a((ajfb) new g(jbk), (ajfb) h.a);
        akcr.a((Object) a, "loginSignupPersistentSes…e, it)\n                })");
        ajvv.a(a, jbk.a);
        oneTapLoginPresenter.e = false;
        jrl.a(oneTapLoginPresenter.g);
        oneTapLoginPresenter.b();
    }

    public final ProgressButton b() {
        ProgressButton progressButton = this.c;
        if (progressButton == null) {
            akcr.a("loginButton");
        }
        return progressButton;
    }

    public final boolean d() {
        return false;
    }

    public final View f() {
        View view = this.d;
        if (view == null) {
            akcr.a("signupButton");
        }
        return view;
    }

    public final View g() {
        View view = this.e;
        if (view == null) {
            akcr.a("switchAccountButton");
        }
        return view;
    }

    public final View h() {
        View view = this.f;
        if (view == null) {
            akcr.a("removeAccountButton");
        }
        return view;
    }

    public final boolean o_() {
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        OneTapLoginPresenter oneTapLoginPresenter = this.a;
        if (oneTapLoginPresenter == null) {
            akcr.a("presenter");
        }
        oneTapLoginPresenter.takeTarget((jgn) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_one_tap_login, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.avatar);
        akcr.a(findViewById, "root.findViewById(R.id.avatar)");
        BitmojiSilhouetteView bitmojiSilhouetteView = (BitmojiSilhouetteView) findViewById;
        String str = "<set-?>";
        akcr.b(bitmojiSilhouetteView, str);
        this.b = bitmojiSilhouetteView;
        findViewById = inflate.findViewById(R.id.login_button);
        akcr.a(findViewById, "root.findViewById(R.id.login_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.c = progressButton;
        findViewById = inflate.findViewById(R.id.signup_button);
        akcr.a(findViewById, "root.findViewById(R.id.signup_button)");
        akcr.b(findViewById, str);
        this.d = findViewById;
        findViewById = inflate.findViewById(R.id.switch_account_button);
        akcr.a(findViewById, "root.findViewById(R.id.switch_account_button)");
        akcr.b(findViewById, str);
        this.e = findViewById;
        findViewById = inflate.findViewById(R.id.remove_account_button);
        akcr.a(findViewById, "root.findViewById(R.id.remove_account_button)");
        akcr.b(findViewById, str);
        this.f = findViewById;
        return inflate;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        OneTapLoginPresenter oneTapLoginPresenter = this.a;
        if (oneTapLoginPresenter == null) {
            akcr.a("presenter");
        }
        oneTapLoginPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        OneTapLoginPresenter oneTapLoginPresenter = this.a;
        if (oneTapLoginPresenter == null) {
            akcr.a("presenter");
        }
        jgn jgn = (jgn) oneTapLoginPresenter.getTarget();
        if (jgn == null) {
            akcr.a();
        }
        jgn.a().setOnClickListener(new e(oneTapLoginPresenter));
        jgn.b().setOnClickListener(new f(oneTapLoginPresenter));
        jgn.h().setOnClickListener(new g(oneTapLoginPresenter));
        jgn.f().setOnClickListener(new h(oneTapLoginPresenter));
        jgn.g().setOnClickListener(new i(oneTapLoginPresenter));
    }
}
