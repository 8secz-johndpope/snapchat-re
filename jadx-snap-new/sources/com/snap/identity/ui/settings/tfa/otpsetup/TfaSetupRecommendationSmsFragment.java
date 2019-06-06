package com.snap.identity.ui.settings.tfa.otpsetup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajwy;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.joq;
import defpackage.jpq;

public final class TfaSetupRecommendationSmsFragment extends BaseIdentitySettingsFragment {
    public ajwy<joq> a;
    private TextView b;
    private SettingsStatefulButton c;
    private final akbl<View, ajxw> d = new b(this);
    private final akbl<View, ajxw> e = new a(this);

    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupRecommendationSmsFragment a;

        a(TfaSetupRecommendationSmsFragment tfaSetupRecommendationSmsFragment) {
            this.a = tfaSetupRecommendationSmsFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((joq) this.a.a().get()).m();
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupRecommendationSmsFragment a;

        b(TfaSetupRecommendationSmsFragment tfaSetupRecommendationSmsFragment) {
            this.a = tfaSetupRecommendationSmsFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((joq) this.a.a().get()).l();
            return ajxw.a;
        }
    }

    public final ajwy<joq> a() {
        ajwy ajwy = this.a;
        if (ajwy == null) {
            akcr.a("settingsTfaFlowManager");
        }
        return ajwy;
    }

    public final boolean o_() {
        ajwy ajwy = this.a;
        if (ajwy == null) {
            akcr.a("settingsTfaFlowManager");
        }
        return ((joq) ajwy.get()).v();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_setup_recommendation_sms, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        TextView textView = this.b;
        if (textView == null) {
            akcr.a("skipTextView");
        }
        textView.setOnClickListener(null);
        SettingsStatefulButton settingsStatefulButton = this.c;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        settingsStatefulButton.setOnClickListener(null);
    }

    public final void onResume() {
        super.onResume();
        TextView textView = this.b;
        if (textView == null) {
            akcr.a("skipTextView");
        }
        textView.setOnClickListener(new jpq(this.d));
        SettingsStatefulButton settingsStatefulButton = this.c;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        settingsStatefulButton.setOnClickListener(new jpq(this.e));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_setup_recommendation_sms_skip);
        akcr.a(findViewById, "view.findViewById(R.id.t…_recommendation_sms_skip)");
        this.b = (TextView) findViewById;
        Object findViewById2 = view.findViewById(R.id.tfa_setup_recommendation_sms_continue);
        akcr.a(findViewById2, "view.findViewById(R.id.t…ommendation_sms_continue)");
        this.c = (SettingsStatefulButton) findViewById2;
        SettingsStatefulButton settingsStatefulButton = this.c;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        settingsStatefulButton.setState(0);
    }
}
