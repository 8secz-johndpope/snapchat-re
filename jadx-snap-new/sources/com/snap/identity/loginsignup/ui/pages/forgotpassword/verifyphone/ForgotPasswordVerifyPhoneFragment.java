package com.snap.identity.loginsignup.ui.pages.forgotpassword.verifyphone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.SubmitResendButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jfs;
import defpackage.jun;
import defpackage.zjk;
import defpackage.zjm;

public final class ForgotPasswordVerifyPhoneFragment extends LoginSignupFragment implements jfs {
    public ForgotPasswordVerifyPhonePresenter a;
    private EditText b;
    private TextView c;
    private TextView d;
    private TextView e;
    private SubmitResendButton f;

    public final EditText a() {
        EditText editText = this.b;
        if (editText == null) {
            akcr.a("codeField");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
        if (forgotPasswordVerifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordVerifyPhonePresenter.c = true;
        forgotPasswordVerifyPhonePresenter.b();
        forgotPasswordVerifyPhonePresenter.c = false;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("errorField");
        }
        return textView;
    }

    public final TextView c() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("description");
        }
        return textView;
    }

    public final TextView d() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("altText");
        }
        return textView;
    }

    public final SubmitResendButton f() {
        SubmitResendButton submitResendButton = this.f;
        if (submitResendButton == null) {
            akcr.a("continueButton");
        }
        return submitResendButton;
    }

    public final boolean o_() {
        ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
        if (forgotPasswordVerifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        ((jun) forgotPasswordVerifyPhonePresenter.k.get()).a(forgotPasswordVerifyPhonePresenter.e);
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
        if (forgotPasswordVerifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordVerifyPhonePresenter.takeTarget((jfs) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_forgot_password_verify_phone, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
        if (forgotPasswordVerifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        forgotPasswordVerifyPhonePresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.code_field);
        akcr.a(findViewById, "view.findViewById(R.id.code_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.b = editText;
        findViewById = view.findViewById(R.id.error_field);
        akcr.a(findViewById, "view.findViewById(R.id.error_field)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.description);
        akcr.a(findViewById, "view.findViewById(R.id.description)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.alt_text);
        akcr.a(findViewById, "view.findViewById(R.id.alt_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        SubmitResendButton submitResendButton = (SubmitResendButton) findViewById2;
        akcr.b(submitResendButton, str);
        this.f = submitResendButton;
    }
}
