package com.snap.identity.loginsignup.ui.pages.verifyphone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.SubmitResendButton;
import com.snap.identity.loginsignup.ui.shared.SignupFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jhc;
import defpackage.jun;
import defpackage.zjk;
import defpackage.zjm;

public final class VerifyPhoneFragment extends SignupFragment implements jhc {
    public VerifyPhonePresenter a;
    private EditText c;
    private TextView d;
    private TextView e;
    private TextView f;
    private SubmitResendButton g;

    public final EditText a() {
        EditText editText = this.c;
        if (editText == null) {
            akcr.a("codeField");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        VerifyPhonePresenter verifyPhonePresenter = this.a;
        if (verifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        verifyPhonePresenter.h = true;
        verifyPhonePresenter.c();
        verifyPhonePresenter.h = false;
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("errorField");
        }
        return textView;
    }

    public final TextView c() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("description");
        }
        return textView;
    }

    public final TextView d() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("altText");
        }
        return textView;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_VERIFY_PHONE;
    }

    public final SubmitResendButton g() {
        SubmitResendButton submitResendButton = this.g;
        if (submitResendButton == null) {
            akcr.a("continueButton");
        }
        return submitResendButton;
    }

    public final boolean o_() {
        VerifyPhonePresenter verifyPhonePresenter = this.a;
        if (verifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        ((jun) verifyPhonePresenter.p.get()).a(verifyPhonePresenter.n);
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        VerifyPhonePresenter verifyPhonePresenter = this.a;
        if (verifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        verifyPhonePresenter.takeTarget((jhc) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_verify_phone, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        VerifyPhonePresenter verifyPhonePresenter = this.a;
        if (verifyPhonePresenter == null) {
            akcr.a("presenter");
        }
        verifyPhonePresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.code_field);
        akcr.a(findViewById, "view.findViewById(R.id.code_field)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.c = editText;
        findViewById = view.findViewById(R.id.error_field);
        akcr.a(findViewById, "view.findViewById(R.id.error_field)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.description);
        akcr.a(findViewById, "view.findViewById(R.id.description)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        findViewById = view.findViewById(R.id.alt_text);
        akcr.a(findViewById, "view.findViewById(R.id.alt_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        SubmitResendButton submitResendButton = (SubmitResendButton) findViewById2;
        akcr.b(submitResendButton, str);
        this.g = submitResendButton;
    }
}
