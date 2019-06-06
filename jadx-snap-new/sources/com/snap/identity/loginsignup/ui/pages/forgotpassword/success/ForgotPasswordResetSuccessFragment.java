package com.snap.identity.loginsignup.ui.pages.forgotpassword.success;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jfq;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;

public final class ForgotPasswordResetSuccessFragment extends LoginSignupFragment implements jfq {
    public ForgotPasswordResetSuccessPresenter a;
    private ProgressButton b;

    public final ProgressButton a() {
        ProgressButton progressButton = this.b;
        if (progressButton == null) {
            akcr.a("gotoLoginButton");
        }
        return progressButton;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        ForgotPasswordResetSuccessPresenter forgotPasswordResetSuccessPresenter = this.a;
        if (forgotPasswordResetSuccessPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a((Context) forgotPasswordResetSuccessPresenter.b.get());
    }

    public final boolean o_() {
        ForgotPasswordResetSuccessPresenter forgotPasswordResetSuccessPresenter = this.a;
        if (forgotPasswordResetSuccessPresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordResetSuccessPresenter.a();
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        ForgotPasswordResetSuccessPresenter forgotPasswordResetSuccessPresenter = this.a;
        if (forgotPasswordResetSuccessPresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordResetSuccessPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_forgot_password_reset_success, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        ForgotPasswordResetSuccessPresenter forgotPasswordResetSuccessPresenter = this.a;
        if (forgotPasswordResetSuccessPresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordResetSuccessPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.goto_login_button);
        akcr.a(findViewById, "view.findViewById(R.id.goto_login_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, "<set-?>");
        this.b = progressButton;
        a().setState(1);
    }
}
