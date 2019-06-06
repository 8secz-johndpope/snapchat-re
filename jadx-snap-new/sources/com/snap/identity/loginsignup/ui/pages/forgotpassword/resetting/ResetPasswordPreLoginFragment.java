package com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.aamh;
import defpackage.aaua;
import defpackage.achb;
import defpackage.achd;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.isc;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jfl;
import defpackage.jrl;
import defpackage.zgy;
import defpackage.zgy.a;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zzz;

public final class ResetPasswordPreLoginFragment extends LoginSignupFragment implements jfl {
    public ResetPasswordPreLoginPresenter a;
    private EditText b;
    private EditText c;
    private View d;
    private View e;
    private TextView f;
    private ProgressButton g;

    public final EditText a() {
        EditText editText = this.b;
        if (editText == null) {
            akcr.a("newPasswordView");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter = this.a;
        if (resetPasswordPreLoginPresenter == null) {
            akcr.a("presenter");
        }
        jbk jbk = (jbk) resetPasswordPreLoginPresenter.f.get();
        aaua aaua = aaua.REGISTRATION_RESET_PASSWORD;
        if (aaua != jbk.b().c().H) {
            jbk.b().a(aaua);
            zzz zzz = new zzz();
            zzz.a(Boolean.valueOf(jbk.m()));
            zzz.a(jbk.b().c().c);
            zzz.a(aamh.PHONE);
            zzz.b(((isc) jbk.g.get()).a());
            jbk.a().a(zzz);
            jbk.a(aaua);
        }
        resetPasswordPreLoginPresenter.g.a(true);
    }

    public final EditText b() {
        EditText editText = this.c;
        if (editText == null) {
            akcr.a("confirmPasswordView");
        }
        return editText;
    }

    public final View c() {
        View view = this.d;
        if (view == null) {
            akcr.a("checkingProgressBar");
        }
        return view;
    }

    public final View d() {
        View view = this.e;
        if (view == null) {
            akcr.a("resultField");
        }
        return view;
    }

    public final TextView f() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("resultText");
        }
        return textView;
    }

    public final ProgressButton g() {
        ProgressButton progressButton = this.g;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final boolean o_() {
        ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter = this.a;
        if (resetPasswordPreLoginPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a(resetPasswordPreLoginPresenter.d);
        zjm zjm = new zjm(jbv.y, "exit_reset_password", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = resetPasswordPreLoginPresenter.d;
        Object obj = resetPasswordPreLoginPresenter.e.get();
        akcr.a(obj, "navigationHost.get()");
        zgy a = a.a(new a(context, (achb) obj, zjm, false, null, 24).b((int) R.string.reset_password_on_back_pressed_safe_warning).a((int) R.string.reset_password_exit, (akbl) new f(resetPasswordPreLoginPresenter), true), null, false, null, null, null, 31).a();
        ((achb) resetPasswordPreLoginPresenter.e.get()).a((achd) a, a.a, null);
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter = this.a;
        if (resetPasswordPreLoginPresenter == null) {
            akcr.a("presenter");
        }
        resetPasswordPreLoginPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_reset_password_prelogin, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter = this.a;
        if (resetPasswordPreLoginPresenter == null) {
            akcr.a("presenter");
        }
        resetPasswordPreLoginPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.new_password);
        akcr.a(findViewById, "view.findViewById(R.id.new_password)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.b = editText;
        findViewById = view.findViewById(R.id.confirm_password);
        akcr.a(findViewById, "view.findViewById(R.id.confirm_password)");
        editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.c = editText;
        findViewById = view.findViewById(R.id.checking_password_progress_bar);
        akcr.a(findViewById, "view.findViewById(R.id.c…ng_password_progress_bar)");
        akcr.b(findViewById, str);
        this.d = findViewById;
        findViewById = view.findViewById(R.id.result_field);
        akcr.a(findViewById, "view.findViewById(R.id.result_field)");
        akcr.b(findViewById, str);
        this.e = findViewById;
        findViewById = view.findViewById(R.id.result_text);
        akcr.a(findViewById, "view.findViewById(R.id.result_text)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById2;
        akcr.b(progressButton, str);
        this.g = progressButton;
    }
}
