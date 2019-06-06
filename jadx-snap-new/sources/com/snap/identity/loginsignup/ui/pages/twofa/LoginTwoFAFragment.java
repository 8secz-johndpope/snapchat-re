package com.snap.identity.loginsignup.ui.pages.twofa;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.identity.api.sharedui.SubmitResendButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jbk;
import defpackage.jgu;
import defpackage.jgv;
import defpackage.zjk;
import defpackage.zjm;

public final class LoginTwoFAFragment extends LoginSignupFragment implements jgu {
    public LoginTwoFAPresenter a;
    private EditText b;
    private CheckBox c;
    private SubmitResendButton d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final EditText a() {
        EditText editText = this.b;
        if (editText == null) {
            akcr.a("code");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        LoginTwoFAPresenter loginTwoFAPresenter = this.a;
        if (loginTwoFAPresenter == null) {
            akcr.a("presenter");
        }
        ((jbk) loginTwoFAPresenter.q.get()).a(loginTwoFAPresenter.d(), loginTwoFAPresenter.n);
        loginTwoFAPresenter.n = loginTwoFAPresenter.d();
        loginTwoFAPresenter.k = true;
        loginTwoFAPresenter.c();
        loginTwoFAPresenter.k = false;
    }

    public final CheckBox b() {
        CheckBox checkBox = this.c;
        if (checkBox == null) {
            akcr.a("rememberDevice");
        }
        return checkBox;
    }

    public final SubmitResendButton c() {
        SubmitResendButton submitResendButton = this.d;
        if (submitResendButton == null) {
            akcr.a("verifyButton");
        }
        return submitResendButton;
    }

    public final TextView d() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("otpDescription");
        }
        return textView;
    }

    public final TextView f() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("smsDescription");
        }
        return textView;
    }

    public final TextView g() {
        TextView textView = this.g;
        if (textView == null) {
            akcr.a("smsInstead");
        }
        return textView;
    }

    public final TextView h() {
        TextView textView = this.h;
        if (textView == null) {
            akcr.a(Event.ERROR_MESSAGE);
        }
        return textView;
    }

    public final boolean o_() {
        LoginTwoFAPresenter loginTwoFAPresenter = this.a;
        if (loginTwoFAPresenter == null) {
            akcr.a("presenter");
        }
        if (loginTwoFAPresenter.g != jgv.SMS || !loginTwoFAPresenter.f) {
            return false;
        }
        loginTwoFAPresenter.g = jgv.OTP;
        ((jbk) loginTwoFAPresenter.q.get()).a(loginTwoFAPresenter.d(), loginTwoFAPresenter.n);
        loginTwoFAPresenter.n = loginTwoFAPresenter.d();
        String str = "";
        loginTwoFAPresenter.c = str;
        loginTwoFAPresenter.a = str;
        loginTwoFAPresenter.c();
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        LoginTwoFAPresenter loginTwoFAPresenter = this.a;
        String str = "presenter";
        if (loginTwoFAPresenter == null) {
            akcr.a(str);
        }
        loginTwoFAPresenter.takeTarget((jgu) this);
        loginTwoFAPresenter = this.a;
        if (loginTwoFAPresenter == null) {
            akcr.a(str);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            akcr.a();
        }
        boolean z = arguments.getBoolean("sms_enabled", false);
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            akcr.a();
        }
        boolean z2 = arguments2.getBoolean("otp_enabled", false);
        loginTwoFAPresenter.e = z;
        loginTwoFAPresenter.f = z2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_login_two_fa, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        LoginTwoFAPresenter loginTwoFAPresenter = this.a;
        if (loginTwoFAPresenter == null) {
            akcr.a("presenter");
        }
        loginTwoFAPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.two_factor_code_field);
        akcr.a(findViewById, "view.findViewById(R.id.two_factor_code_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.b = editText;
        findViewById = view.findViewById(R.id.two_factor_allow_remember_device_checkbox);
        akcr.a(findViewById, "view.findViewById(R.id.t…remember_device_checkbox)");
        CheckBox checkBox = (CheckBox) findViewById;
        akcr.b(checkBox, str);
        this.c = checkBox;
        findViewById = view.findViewById(R.id.verify_button);
        akcr.a(findViewById, "view.findViewById(R.id.verify_button)");
        SubmitResendButton submitResendButton = (SubmitResendButton) findViewById;
        akcr.b(submitResendButton, str);
        this.d = submitResendButton;
        findViewById = view.findViewById(R.id.two_factor_form_sms_description);
        akcr.a(findViewById, "view.findViewById(R.id.t…tor_form_sms_description)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        findViewById = view.findViewById(R.id.two_factor_form_otp_description);
        akcr.a(findViewById, "view.findViewById(R.id.t…tor_form_otp_description)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        findViewById = view.findViewById(R.id.two_factor_send_sms_instead);
        akcr.a(findViewById, "view.findViewById(R.id.t…_factor_send_sms_instead)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.g = textView;
        Object findViewById2 = view.findViewById(R.id.two_factor_code_error_message);
        akcr.a(findViewById2, "view.findViewById(R.id.t…actor_code_error_message)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.h = textView2;
    }
}
