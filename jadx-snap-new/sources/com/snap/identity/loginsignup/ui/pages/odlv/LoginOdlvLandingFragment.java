package com.snap.identity.loginsignup.ui.pages.odlv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jge;
import defpackage.jrl;
import defpackage.zjk;
import defpackage.zjm;

public final class LoginOdlvLandingFragment extends LoginSignupFragment implements jge {
    public LoginOdlvLandingPresenter a;
    private RadioGroup b;
    private TextView c;
    private TextView d;
    private RadioButton e;
    private View f;
    private TextView g;
    private RadioButton h;
    private ProgressButton i;

    public final RadioGroup a() {
        RadioGroup radioGroup = this.b;
        if (radioGroup == null) {
            akcr.a("radioOptionGroup");
        }
        return radioGroup;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        LoginOdlvLandingPresenter loginOdlvLandingPresenter = this.a;
        if (loginOdlvLandingPresenter == null) {
            akcr.a("presenter");
        }
        jrl.a((Context) loginOdlvLandingPresenter.h.get());
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("radioOptionNotePhone");
        }
        return textView;
    }

    public final TextView c() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("radioOptionTitlePhone");
        }
        return textView;
    }

    public final RadioButton d() {
        RadioButton radioButton = this.e;
        if (radioButton == null) {
            akcr.a("radioOptionButtonPhone");
        }
        return radioButton;
    }

    public final View f() {
        View view = this.f;
        if (view == null) {
            akcr.a("radioOptionDivider1");
        }
        return view;
    }

    public final TextView g() {
        TextView textView = this.g;
        if (textView == null) {
            akcr.a("radioOptionTitleEmail");
        }
        return textView;
    }

    public final RadioButton h() {
        RadioButton radioButton = this.h;
        if (radioButton == null) {
            akcr.a("radioOptionButtonEmail");
        }
        return radioButton;
    }

    public final ProgressButton k() {
        ProgressButton progressButton = this.i;
        if (progressButton == null) {
            akcr.a("continueButton");
        }
        return progressButton;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        LoginOdlvLandingPresenter loginOdlvLandingPresenter = this.a;
        if (loginOdlvLandingPresenter == null) {
            akcr.a("presenter");
        }
        loginOdlvLandingPresenter.takeTarget((jge) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_login_odlv_landing, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onDetach() {
        super.onDetach();
        LoginOdlvLandingPresenter loginOdlvLandingPresenter = this.a;
        if (loginOdlvLandingPresenter == null) {
            akcr.a("presenter");
        }
        loginOdlvLandingPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.odlv_landing_radio_option_group);
        akcr.a(findViewById, "view.findViewById(R.id.o…nding_radio_option_group)");
        RadioGroup radioGroup = (RadioGroup) findViewById;
        String str = "<set-?>";
        akcr.b(radioGroup, str);
        this.b = radioGroup;
        findViewById = view.findViewById(R.id.odlv_landing_radio_option_note_phone);
        akcr.a(findViewById, "view.findViewById(R.id.o…_radio_option_note_phone)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.odlv_landing_radio_option_title_phone);
        akcr.a(findViewById, "view.findViewById(R.id.o…radio_option_title_phone)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.odlv_landing_radio_option_button_phone);
        akcr.a(findViewById, "view.findViewById(R.id.o…adio_option_button_phone)");
        RadioButton radioButton = (RadioButton) findViewById;
        akcr.b(radioButton, str);
        this.e = radioButton;
        findViewById = view.findViewById(R.id.odlv_landing_radio_option_divider_1);
        akcr.a(findViewById, "view.findViewById(R.id.o…g_radio_option_divider_1)");
        akcr.b(findViewById, str);
        this.f = findViewById;
        findViewById = view.findViewById(R.id.odlv_landing_radio_option_title_email);
        akcr.a(findViewById, "view.findViewById(R.id.o…radio_option_title_email)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.g = textView;
        findViewById = view.findViewById(R.id.odlv_landing_radio_option_button_email);
        akcr.a(findViewById, "view.findViewById(R.id.o…adio_option_button_email)");
        radioButton = (RadioButton) findViewById;
        akcr.b(radioButton, str);
        this.h = radioButton;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        ProgressButton progressButton = (ProgressButton) findViewById2;
        akcr.b(progressButton, str);
        this.i = progressButton;
    }
}
