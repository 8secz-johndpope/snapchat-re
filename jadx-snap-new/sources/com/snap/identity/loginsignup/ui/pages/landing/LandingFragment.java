package com.snap.identity.loginsignup.ui.pages.landing;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import defpackage.jbk.i;
import defpackage.jbk.j;
import defpackage.jfu;
import defpackage.jrl;
import defpackage.zjj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;

public final class LandingFragment extends LoginSignupFragment implements jfu, zjj, zjq {
    public LandingPresenter a;
    private TextView b;
    private TextView c;

    public final long S_() {
        return -1;
    }

    public final TextView a() {
        TextView textView = this.b;
        if (textView == null) {
            akcr.a("loginButton");
        }
        return textView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        LandingPresenter landingPresenter = this.a;
        if (landingPresenter == null) {
            akcr.a("presenter");
        }
        landingPresenter.c.i();
        jbk jbk = landingPresenter.c;
        ajej a = jbk.c().b().a((ajdw) jbk.d().l()).a((ajfb) new i(jbk), (ajfb) j.a);
        akcr.a((Object) a, "loginSignupPersistentSes…e, it)\n                })");
        ajvv.a(a, jbk.a);
        jrl.a((Context) landingPresenter.a.get());
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("signupButton");
        }
        return textView;
    }

    public final boolean d() {
        return false;
    }

    public final boolean o_() {
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        LandingPresenter landingPresenter = this.a;
        if (landingPresenter == null) {
            akcr.a("presenter");
        }
        landingPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_landing, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        LandingPresenter landingPresenter = this.a;
        if (landingPresenter == null) {
            akcr.a("presenter");
        }
        landingPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.login_and_signup_page_fragment_login_button);
        akcr.a(findViewById, "view.findViewById(R.id.l…ge_fragment_login_button)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.b = textView;
        Object findViewById2 = view.findViewById(R.id.login_and_signup_page_fragment_signup_button);
        akcr.a(findViewById2, "view.findViewById(R.id.l…e_fragment_signup_button)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.c = textView2;
    }
}
