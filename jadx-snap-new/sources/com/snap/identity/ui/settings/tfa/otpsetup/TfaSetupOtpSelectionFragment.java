package com.snap.identity.ui.settings.tfa.otpsetup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.aipx;
import defpackage.ajwy;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.irc;
import defpackage.joq;
import defpackage.jot;
import defpackage.jpj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;

public final class TfaSetupOtpSelectionFragment extends BaseIdentitySettingsFragment implements zjq {
    static final zjm d = new zjm(irc.t, "TfaSetupOtpSelectionFragment", false, false, true, false, null, false, false, false, false, null, 4076);
    public ajwy<joq> a;
    public ajwy<jot> b;
    public ajwy<achb<zjm, zjk>> c;
    private View e;
    private View f;
    private View j;
    private final akbl<View, ajxw> k = new e(this);
    private final akbl<View, ajxw> l = new d(this);
    private final akbl<View, ajxw> m = new c(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ TfaSetupOtpSelectionFragment a;
        private /* synthetic */ String b;
        private /* synthetic */ Intent c;

        b(TfaSetupOtpSelectionFragment tfaSetupOtpSelectionFragment, String str, Intent intent) {
            this.a = tfaSetupOtpSelectionFragment;
            this.b = str;
            this.c = intent;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.a;
            if (ajwy == null) {
                akcr.a("settingsTfaFlowManager");
            }
            ((joq) ajwy.get()).a(this.b);
            this.a.startActivity(this.c);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupOtpSelectionFragment a;

        c(TfaSetupOtpSelectionFragment tfaSetupOtpSelectionFragment) {
            this.a = tfaSetupOtpSelectionFragment;
            super(1);
        }

        /* JADX WARNING: Missing block: B:15:0x00b3, code skipped:
            if (r1 == null) goto L_0x010a;
     */
        /* JADX WARNING: Missing block: B:20:0x0108, code skipped:
            if (r1 == null) goto L_0x010a;
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
            /*
            r18 = this;
            r0 = r19;
            r0 = (android.view.View) r0;
            r1 = "<anonymous parameter 0>";
            defpackage.akcr.b(r0, r1);
            r0 = r18;
            r1 = r0.a;
            r2 = r1.b;
            if (r2 != 0) goto L_0x0016;
        L_0x0011:
            r3 = "settingsTfaHelperUtils";
            defpackage.akcr.a(r3);
        L_0x0016:
            r2.get();
            r2 = defpackage.jot.a();
            r3 = r1.a;
            if (r3 != 0) goto L_0x0026;
        L_0x0021:
            r4 = "settingsTfaFlowManager";
            defpackage.akcr.a(r4);
        L_0x0026:
            r3 = r3.get();
            r3 = (defpackage.joq) r3;
            r3 = r3.b();
            r3 = r3.a;
            r4 = 2;
            r5 = new java.lang.Object[r4];
            r6 = 0;
            r5[r6] = r3;
            r3 = 1;
            r5[r3] = r2;
            r4 = java.util.Arrays.copyOf(r5, r4);
            r5 = "otpauth://totp/%s?secret=%s&issuer=Snapchat";
            r4 = java.lang.String.format(r5, r4);
            r5 = "java.lang.String.format(this, *args)";
            defpackage.akcr.a(r4, r5);
            r4 = android.net.Uri.parse(r4);
            r5 = new android.content.Intent;
            r7 = "android.intent.action.VIEW";
            r5.<init>(r7, r4);
            r4 = r1.getActivity();
            if (r4 != 0) goto L_0x005e;
        L_0x005b:
            defpackage.akcr.a();
        L_0x005e:
            r7 = "activity!!";
            defpackage.akcr.a(r4, r7);
            r4 = r4.getPackageManager();
            r4 = r5.resolveActivity(r4);
            r7 = 0;
            r8 = 2131888755; // 0x7f120a73 float:1.9412154E38 double:1.0532929946E-314;
            r9 = "navigationHost.get()";
            r10 = "navigationHost";
            if (r4 != 0) goto L_0x00b6;
        L_0x0075:
            r2 = new zgy$a;
            r12 = r1.getContext();
            r4 = r1.c;
            if (r4 != 0) goto L_0x0082;
        L_0x007f:
            defpackage.akcr.a(r10);
        L_0x0082:
            r4 = r4.get();
            defpackage.akcr.a(r4, r9);
            r13 = r4;
            r13 = (defpackage.achb) r13;
            r14 = com.snap.identity.ui.settings.tfa.otpsetup.TfaSetupOtpSelectionFragment.d;
            r15 = 0;
            r16 = 0;
            r17 = 24;
            r11 = r2;
            r11.<init>(r12, r13, r14, r15, r16, r17);
            r4 = 2131889651; // 0x7f120df3 float:1.9413972E38 double:1.0532934373E-314;
            r2 = r2.a(r4);
            r4 = 2131889650; // 0x7f120df2 float:1.941397E38 double:1.053293437E-314;
            r2 = r2.b(r4);
            r4 = com.snap.identity.ui.settings.tfa.otpsetup.TfaSetupOtpSelectionFragment.g.a;
            r4 = (defpackage.akbl) r4;
            r2 = r2.a(r8, r4, r3);
            r2 = r2.a();
            r1 = r1.c;
            if (r1 != 0) goto L_0x010d;
        L_0x00b5:
            goto L_0x010a;
        L_0x00b6:
            r3 = new com.snap.identity.ui.settings.tfa.otpsetup.TfaSetupOtpSelectionFragment$b;
            r3.<init>(r1, r2, r5);
            r3 = (defpackage.akbk) r3;
            r2 = new zgy$a;
            r12 = r1.getContext();
            r4 = r1.c;
            if (r4 != 0) goto L_0x00ca;
        L_0x00c7:
            defpackage.akcr.a(r10);
        L_0x00ca:
            r4 = r4.get();
            defpackage.akcr.a(r4, r9);
            r13 = r4;
            r13 = (defpackage.achb) r13;
            r14 = com.snap.identity.ui.settings.tfa.otpsetup.TfaSetupOtpSelectionFragment.d;
            r15 = 0;
            r16 = 0;
            r17 = 24;
            r11 = r2;
            r11.<init>(r12, r13, r14, r15, r16, r17);
            r4 = 2131889649; // 0x7f120df1 float:1.9413968E38 double:1.0532934363E-314;
            r2 = r2.a(r4);
            r4 = 2131889648; // 0x7f120df0 float:1.9413966E38 double:1.053293436E-314;
            r2 = r2.b(r4);
            r4 = new com.snap.identity.ui.settings.tfa.otpsetup.TfaSetupOtpSelectionFragment$f;
            r4.<init>(r3);
            r4 = (defpackage.akbl) r4;
            r11 = r2.a(r8, r4, r6);
            r12 = 0;
            r13 = 0;
            r14 = 0;
            r15 = 0;
            r17 = 31;
            r2 = defpackage.zgy.a.a(r11, r12, r13, r14, r15, r16, r17);
            r2 = r2.a();
            r1 = r1.c;
            if (r1 != 0) goto L_0x010d;
        L_0x010a:
            defpackage.akcr.a(r10);
        L_0x010d:
            r1 = r1.get();
            r1 = (defpackage.achb) r1;
            r3 = r2;
            r3 = (defpackage.achd) r3;
            r2 = r2.a;
            r1.a(r3, r2, r7);
            r1 = defpackage.ajxw.a;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.tfa.otpsetup.TfaSetupOtpSelectionFragment$c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupOtpSelectionFragment a;

        d(TfaSetupOtpSelectionFragment tfaSetupOtpSelectionFragment) {
            this.a = tfaSetupOtpSelectionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.snapchat.com/a/find-an-authentication-app")));
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupOtpSelectionFragment a;

        e(TfaSetupOtpSelectionFragment tfaSetupOtpSelectionFragment) {
            this.a = tfaSetupOtpSelectionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ajwy ajwy = this.a.a;
            if (ajwy == null) {
                akcr.a("settingsTfaFlowManager");
            }
            ((joq) ajwy.get()).q();
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ akbk a;

        f(akbk akbk) {
            this.a = akbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.invoke();
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<View, ajxw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public final long S_() {
        return -1;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_setup_otp, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        View view = this.e;
        if (view == null) {
            akcr.a("manualSection");
        }
        view.setOnClickListener(null);
        view = this.f;
        if (view == null) {
            akcr.a("findAppSection");
        }
        view.setOnClickListener(null);
        view = this.j;
        if (view == null) {
            akcr.a("automaticSection");
        }
        view.setOnClickListener(null);
    }

    public final void onResume() {
        super.onResume();
        View view = this.e;
        if (view == null) {
            akcr.a("manualSection");
        }
        view.setOnClickListener(new jpj(this.k));
        view = this.f;
        if (view == null) {
            akcr.a("findAppSection");
        }
        view.setOnClickListener(new jpj(this.l));
        view = this.j;
        if (view == null) {
            akcr.a("automaticSection");
        }
        view.setOnClickListener(new jpj(this.m));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_setup_otp_manual_section);
        akcr.a(findViewById, "view.findViewById(R.id.t…setup_otp_manual_section)");
        this.e = findViewById;
        findViewById = view.findViewById(R.id.tfa_setup_otp_find_app_section);
        akcr.a(findViewById, "view.findViewById(R.id.t…tup_otp_find_app_section)");
        this.f = findViewById;
        Object findViewById2 = view.findViewById(R.id.tfa_setup_otp_automatic_section);
        akcr.a(findViewById2, "view.findViewById(R.id.t…up_otp_automatic_section)");
        this.j = findViewById2;
    }
}
