package com.snap.identity.ui.settings.tfa.enrollment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajwy;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akgb;
import defpackage.iuc;
import defpackage.joq;
import defpackage.joy;
import defpackage.jpa;
import defpackage.jpb;
import defpackage.jpc;
import defpackage.zfw;
import defpackage.zgb;

public final class TfaEnrollmentSelectionFragment extends BaseIdentitySettingsFragment implements jpc {
    public jpb a;
    public ajwy<joq> b;
    final akbl<View, ajxw> c = new d(this);
    final akbl<View, ajxw> d = new b(this);
    private View e;
    private View f;
    private TextView j;
    private zfw k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c<T> implements ajfb<joy> {
        private /* synthetic */ TfaEnrollmentSelectionFragment a;

        c(TfaEnrollmentSelectionFragment tfaEnrollmentSelectionFragment) {
            this.a = tfaEnrollmentSelectionFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (joy) obj;
            this.a.f();
            jpb jpb = this.a.a;
            if (jpb == null) {
                akcr.a("presenter");
            }
            akcr.a(obj, "state");
            akcr.b(obj, "userTfaState");
            String str = obj.b;
            jpc jpc = (jpc) jpb.getTarget();
            if (jpc != null) {
                TextView c = jpc.c();
                if (c != null) {
                    if ((akgb.a(str) ^ 1) != 0) {
                        str = jpb.a.getString(R.string.settings_tfa_settings_sms_explanation, new Object[]{str});
                    } else {
                        str = jpb.a.getString(R.string.settings_tfa_settings_sms_explanation_your_phone_number);
                    }
                    c.setText(str);
                }
            }
            TfaEnrollmentSelectionFragment tfaEnrollmentSelectionFragment = this.a;
            tfaEnrollmentSelectionFragment.a().setOnClickListener(new jpa(tfaEnrollmentSelectionFragment.c));
            tfaEnrollmentSelectionFragment.b().setOnClickListener(new jpa(tfaEnrollmentSelectionFragment.d));
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaEnrollmentSelectionFragment a;

        b(TfaEnrollmentSelectionFragment tfaEnrollmentSelectionFragment) {
            this.a = tfaEnrollmentSelectionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((joq) this.a.d().get()).g();
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaEnrollmentSelectionFragment a;

        d(TfaEnrollmentSelectionFragment tfaEnrollmentSelectionFragment) {
            this.a = tfaEnrollmentSelectionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((joq) this.a.d().get()).f();
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public final View a() {
        View view = this.e;
        if (view == null) {
            akcr.a("smsTfaSection");
        }
        return view;
    }

    public final View b() {
        View view = this.f;
        if (view == null) {
            akcr.a("otpTfaSection");
        }
        return view;
    }

    public final TextView c() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a("smsTfaSubText");
        }
        return textView;
    }

    public final ajwy<joq> d() {
        ajwy ajwy = this.b;
        if (ajwy == null) {
            akcr.a("settingsTfaFlowManager");
        }
        return ajwy;
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        a().setOnClickListener(null);
        b().setOnClickListener(null);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jpb jpb = this.a;
        if (jpb == null) {
            akcr.a("presenter");
        }
        jpb.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_enrollment_selection, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        jpb jpb = this.a;
        if (jpb == null) {
            akcr.a("presenter");
        }
        jpb.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        f();
    }

    public final void onResume() {
        super.onResume();
        ajwy ajwy = this.b;
        if (ajwy == null) {
            akcr.a("settingsTfaFlowManager");
        }
        ajdp c = ((joq) ajwy.get()).c();
        zfw zfw = this.k;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, c.a((ajdw) zfw.l()).f((ajfb) new c(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_enrollment_selection_sms_section);
        akcr.a(findViewById, "view.findViewById(R.id.t…nt_selection_sms_section)");
        String str = "<set-?>";
        akcr.b(findViewById, str);
        this.e = findViewById;
        findViewById = view.findViewById(R.id.tfa_enrollment_selection_otp_section);
        akcr.a(findViewById, "view.findViewById(R.id.t…nt_selection_otp_section)");
        akcr.b(findViewById, str);
        this.f = findViewById;
        Object findViewById2 = view.findViewById(R.id.tfa_enrollment_selection_sms_subtext);
        akcr.a(findViewById2, "view.findViewById(R.id.t…nt_selection_sms_subtext)");
        TextView textView = (TextView) findViewById2;
        akcr.b(textView, str);
        this.j = textView;
        o().get();
        this.k = zgb.a(iuc.m, "TfaEnrollmentSelectionFragment");
    }
}
