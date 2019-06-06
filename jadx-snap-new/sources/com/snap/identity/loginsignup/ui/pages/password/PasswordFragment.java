package com.snap.identity.loginsignup.ui.pages.password;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jbw;
import defpackage.jgq;
import defpackage.zjk;
import defpackage.zjm;

public final class PasswordFragment extends SignupFragment implements jgq {
    public PasswordPresenter a;
    private EditText c;
    private TextView d;
    private ProgressButton e;
    private TextView f;

    public final EditText a() {
        EditText editText = this.c;
        if (editText == null) {
            akcr.a("password");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        PasswordPresenter passwordPresenter = this.a;
        if (passwordPresenter == null) {
            akcr.a("presenter");
        }
        if (passwordPresenter.b) {
            passwordPresenter.b = false;
        }
        passwordPresenter.f = true;
        passwordPresenter.a();
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("error");
        }
        return textView;
    }

    public final ProgressButton c() {
        ProgressButton progressButton = this.e;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final TextView d() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("hideButton");
        }
        return textView;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_SIGNUP_PASSWORD;
    }

    public final boolean o_() {
        PasswordPresenter passwordPresenter = this.a;
        if (passwordPresenter == null) {
            akcr.a("presenter");
        }
        int i = passwordPresenter.b ^ 1;
        if (i != 0) {
            ((jbw) passwordPresenter.h.get()).e(passwordPresenter.a);
        }
        return i == 0;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        PasswordPresenter passwordPresenter = this.a;
        if (passwordPresenter == null) {
            akcr.a("presenter");
        }
        passwordPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_password, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        PasswordPresenter passwordPresenter = this.a;
        if (passwordPresenter == null) {
            akcr.a("presenter");
        }
        passwordPresenter.dropTarget();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.password_form_field);
        akcr.a(findViewById, "view.findViewById(R.id.password_form_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.c = editText;
        findViewById = view.findViewById(R.id.password_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.password_error_message)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.e = progressButton;
        Object findViewById2 = view.findViewById(R.id.password_form_show_or_hide_button);
        akcr.a(findViewById2, "view.findViewById(R.id.p…form_show_or_hide_button)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.f = textView2;
    }
}
