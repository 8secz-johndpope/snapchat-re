package com.snap.identity.loginsignup.ui.pages.login;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.aawr;
import defpackage.aaxp;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.isc;
import defpackage.jbk;
import defpackage.jga;
import defpackage.zjk;
import defpackage.zjm;

public final class LoginFragment extends LoginSignupFragment implements jga {
    public LoginPresenter a;
    private EditText b;
    private EditText c;
    private TextView d;
    private ProgressButton e;
    private TextView f;
    private View g;
    private View h;

    public static final class a implements TextWatcher {
        private /* synthetic */ LoginFragment a;

        a(LoginFragment loginFragment) {
            this.a = loginFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.a().setSelection(i + i3);
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ LoginFragment a;

        b(LoginFragment loginFragment) {
            this.a = loginFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.b().setSelection(i + i3);
        }
    }

    public final EditText a() {
        EditText editText = this.b;
        if (editText == null) {
            akcr.a("usernameOrEmail");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        LoginPresenter loginPresenter = this.a;
        if (loginPresenter == null) {
            akcr.a("presenter");
        }
        jbk jbk = (jbk) loginPresenter.l.get();
        aaua aaua = aaua.REGISTRATION_USER_LOGIN;
        if (aaua != jbk.b().c().H) {
            jbk.b().a(aaua);
            aawr aawr = new aawr();
            aawr.a(aaxp.V2);
            aawr.a(Boolean.valueOf(jbk.m()));
            aawr.a(((isc) jbk.g.get()).a());
            jbk.a().a(aawr);
            jbk.a(aaua);
        }
        loginPresenter.f = true;
        loginPresenter.e = false;
        loginPresenter.a();
        loginPresenter.f = false;
        loginPresenter.g = false;
    }

    public final EditText b() {
        EditText editText = this.c;
        if (editText == null) {
            akcr.a("password");
        }
        return editText;
    }

    public final TextView c() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("errorText");
        }
        return textView;
    }

    public final ProgressButton d() {
        ProgressButton progressButton = this.e;
        if (progressButton == null) {
            akcr.a("logInButton");
        }
        return progressButton;
    }

    public final TextView f() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("forgotPasswordButton");
        }
        return textView;
    }

    public final View g() {
        View view = this.g;
        if (view == null) {
            akcr.a("showIcon");
        }
        return view;
    }

    public final View h() {
        View view = this.h;
        if (view == null) {
            akcr.a("hideIcon");
        }
        return view;
    }

    public final boolean o_() {
        LoginPresenter loginPresenter = this.a;
        if (loginPresenter == null) {
            akcr.a("presenter");
        }
        return loginPresenter.d || loginPresenter.e;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        LoginPresenter loginPresenter = this.a;
        if (loginPresenter == null) {
            akcr.a("presenter");
        }
        loginPresenter.takeTarget((jga) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        LoginPresenter loginPresenter = this.a;
        if (loginPresenter == null) {
            akcr.a("presenter");
        }
        loginPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.username_or_email_field);
        akcr.a(findViewById, "view.findViewById(R.id.username_or_email_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.b = editText;
        findViewById = view.findViewById(R.id.password_field);
        akcr.a(findViewById, "view.findViewById(R.id.password_field)");
        editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.c = editText;
        findViewById = view.findViewById(R.id.nav_button);
        akcr.a(findViewById, "view.findViewById(R.id.nav_button)");
        ProgressButton progressButton = (ProgressButton) findViewById;
        akcr.b(progressButton, str);
        this.e = progressButton;
        findViewById = view.findViewById(R.id.login_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.login_error_message)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.forgot_password_button);
        akcr.a(findViewById, "view.findViewById(R.id.forgot_password_button)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        findViewById = view.findViewById(R.id.eye);
        akcr.a(findViewById, "view.findViewById(R.id.eye)");
        akcr.b(findViewById, str);
        this.g = findViewById;
        Object findViewById2 = view.findViewById(R.id.eye_hidden);
        akcr.a(findViewById2, "view.findViewById(R.id.eye_hidden)");
        akcr.b(findViewById2, str);
        this.h = findViewById2;
        a().addTextChangedListener(new a(this));
        b().addTextChangedListener(new b(this));
    }
}
