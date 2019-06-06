package com.snap.identity.ui.settings.tfa.enrollment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snapchat.android.R;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.joq;
import defpackage.joz;

public final class TfaEnrollmentDescriptionFragment extends BaseIdentitySettingsFragment {
    public aipn<joq> a;
    private SettingsStatefulButton b;
    private final akbl<View, ajxw> c = new a(this);

    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaEnrollmentDescriptionFragment a;

        a(TfaEnrollmentDescriptionFragment tfaEnrollmentDescriptionFragment) {
            this.a = tfaEnrollmentDescriptionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            aipn aipn = this.a.a;
            if (aipn == null) {
                akcr.a("settingsTfaFlowManager");
            }
            ((joq) aipn.get()).k();
            return ajxw.a;
        }
    }

    public final boolean o_() {
        aipn aipn = this.a;
        if (aipn == null) {
            akcr.a("settingsTfaFlowManager");
        }
        ((joq) aipn.get()).e();
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_enrollment_description, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        SettingsStatefulButton settingsStatefulButton = this.b;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        settingsStatefulButton.setOnClickListener(null);
    }

    public final void onResume() {
        super.onResume();
        SettingsStatefulButton settingsStatefulButton = this.b;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        settingsStatefulButton.setOnClickListener(new joz(this.c));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_enrollment_description_continue_button);
        akcr.a(findViewById, "view.findViewById(R.id.t…cription_continue_button)");
        this.b = (SettingsStatefulButton) findViewById;
        SettingsStatefulButton settingsStatefulButton = this.b;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        settingsStatefulButton.setState(0);
    }
}
