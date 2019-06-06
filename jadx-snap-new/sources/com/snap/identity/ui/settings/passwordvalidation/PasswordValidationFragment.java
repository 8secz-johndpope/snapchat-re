package com.snap.identity.ui.settings.passwordvalidation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.abtj;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.joi;
import defpackage.joo;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;

public final class PasswordValidationFragment extends BaseIdentitySettingsFragment implements joi, zjq {
    public PasswordValidationPresenter a;
    private Context b;
    private ScHeaderView c;
    private TextView d;
    private View e;
    private EditText f;
    private TextView j;
    private ImageView k;
    private TextView l;
    private joo m;

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

    public final long S_() {
        return -1;
    }

    public final EditText a() {
        EditText editText = this.f;
        if (editText == null) {
            akcr.a("passwordField");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        a().clearFocus();
        if (a().requestFocus()) {
            abtj.a(getContext(), a());
        }
    }

    public final TextView b() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a("passwordFieldErrorMsg");
        }
        return textView;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        jrl.a(this.b);
    }

    public final ImageView d() {
        ImageView imageView = this.k;
        if (imageView == null) {
            akcr.a("passwordFieldErrorRedX");
        }
        return imageView;
    }

    public final TextView f() {
        TextView textView = this.l;
        if (textView == null) {
            akcr.a("forgotPasswordButton");
        }
        return textView;
    }

    public final joo g() {
        joo joo = this.m;
        if (joo == null) {
            akcr.a("passwordContinueButton");
        }
        return joo;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        this.b = context.getApplicationContext();
        PasswordValidationPresenter passwordValidationPresenter = this.a;
        if (passwordValidationPresenter == null) {
            akcr.a("presenter");
        }
        passwordValidationPresenter.takeTarget((joi) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_password_validation, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        PasswordValidationPresenter passwordValidationPresenter = this.a;
        if (passwordValidationPresenter == null) {
            akcr.a("presenter");
        }
        passwordValidationPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        String str = "<set-?>";
        akcr.b(view, str);
        this.e = view;
        Object findViewById = view.findViewById(R.id.password_validation_page_header);
        akcr.a(findViewById, "view.findViewById(R.id.p…d_validation_page_header)");
        this.c = (ScHeaderView) findViewById;
        findViewById = view.findViewById(R.id.password_validation_page_explanation);
        akcr.a(findViewById, "view.findViewById(R.id.p…idation_page_explanation)");
        this.d = (TextView) findViewById;
        findViewById = view.findViewById(R.id.password_validation_password_field);
        akcr.a(findViewById, "view.findViewById(R.id.p…alidation_password_field)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.f = editText;
        findViewById = view.findViewById(R.id.password_validation_error_red_x);
        akcr.a(findViewById, "view.findViewById(R.id.p…d_validation_error_red_x)");
        ImageView imageView = (ImageView) findViewById;
        akcr.b(imageView, str);
        this.k = imageView;
        findViewById = view.findViewById(R.id.password_validation_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.p…validation_error_message)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.j = textView;
        findViewById = view.findViewById(R.id.forgot_password_button);
        akcr.a(findViewById, "view.findViewById(R.id.forgot_password_button)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.l = textView;
        Object findViewById2 = view.findViewById(R.id.password_validation_continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.p…lidation_continue_button)");
        joo joo = (joo) findViewById2;
        akcr.b(joo, str);
        this.m = joo;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("headerTextId", R.string.password_validation_default_header);
            ScHeaderView scHeaderView = this.c;
            if (scHeaderView == null) {
                akcr.a("pageHeader");
            }
            scHeaderView.setTitleText(getContext().getString(i));
            int i2 = arguments.getInt("explanationTextId", R.string.default_password_validation_explanation);
            TextView textView2 = this.d;
            if (textView2 == null) {
                akcr.a("pageExplanation");
            }
            textView2.setText(getContext().getString(i2));
        }
        arguments = getArguments();
        boolean z = false;
        boolean z2 = arguments != null ? arguments.getBoolean("manualNavigationOnSuccess", false) : false;
        PasswordValidationPresenter passwordValidationPresenter = this.a;
        String str2 = "presenter";
        if (passwordValidationPresenter == null) {
            akcr.a(str2);
        }
        boolean z3 = true;
        if (!z2) {
            z = true;
        }
        passwordValidationPresenter.d = z;
        PasswordValidationPresenter passwordValidationPresenter2 = this.a;
        if (passwordValidationPresenter2 == null) {
            akcr.a(str2);
        }
        bundle = getArguments();
        if (bundle != null) {
            z3 = bundle.getBoolean("allowsForgotPassword", true);
        }
        passwordValidationPresenter2.e = z3;
    }
}
