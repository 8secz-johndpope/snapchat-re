package com.snap.identity.loginsignup.ui.pages.email;

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
import defpackage.izx;
import defpackage.jeu;
import defpackage.jev;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;

public final class EmailFragment extends SignupFragment implements jev {
    public EmailPresenter a;
    private TextView c;
    private EditText d;
    private ProgressButton e;
    private TextView f;

    public final TextView a() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("phoneInstead");
        }
        return textView;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        EmailPresenter emailPresenter = this.a;
        if (emailPresenter == null) {
            akcr.a("presenter");
        }
        emailPresenter.a(jeu.a(emailPresenter.a(), null, null, false, false, true, 15));
        jev jev = (jev) emailPresenter.getTarget();
        if (jev != null) {
            EditText b = jev.b();
            if (b != null) {
                b.requestFocus();
            }
        }
    }

    public final EditText b() {
        EditText editText = this.d;
        if (editText == null) {
            akcr.a("email");
        }
        return editText;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b(achi);
        EmailPresenter emailPresenter = this.a;
        if (emailPresenter == null) {
            akcr.a("presenter");
        }
        jev jev = (jev) emailPresenter.getTarget();
        if (jev != null) {
            EditText b = jev.b();
            if (b != null) {
                b.clearFocus();
            }
        }
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
            akcr.a("error");
        }
        return textView;
    }

    public final aaua f() {
        return aaua.REGISTRATION_USER_SIGNUP_EMAIL;
    }

    public final boolean o_() {
        EmailPresenter emailPresenter = this.a;
        if (emailPresenter == null) {
            akcr.a("presenter");
        }
        ((zke) emailPresenter.b.get()).a(new izx());
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        EmailPresenter emailPresenter = this.a;
        if (emailPresenter == null) {
            akcr.a("presenter");
        }
        emailPresenter.takeTarget((jev) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_signup_email, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        EmailPresenter emailPresenter = this.a;
        if (emailPresenter == null) {
            akcr.a("presenter");
        }
        emailPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.signup_with_phone_instead);
        akcr.a(findViewById, "view.findViewById(R.id.signup_with_phone_instead)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.email_field);
        akcr.a(findViewById, "view.findViewById(R.id.email_field)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.d = editText;
        findViewById = view.findViewById(R.id.email_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.email_error_message)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById2;
        akcr.b(progressButton, str);
        this.e = progressButton;
    }
}
