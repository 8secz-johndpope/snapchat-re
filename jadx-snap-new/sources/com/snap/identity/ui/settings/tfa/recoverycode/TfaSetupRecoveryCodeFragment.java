package com.snap.identity.ui.settings.tfa.recoverycode;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.iuc;
import defpackage.joo;
import defpackage.joq;
import defpackage.joy;
import defpackage.jpr;
import defpackage.jps;
import defpackage.jpt;
import defpackage.jpu;
import defpackage.jpv;
import defpackage.jpw;
import defpackage.jrl;
import defpackage.zfw;
import defpackage.zgb;

public final class TfaSetupRecoveryCodeFragment extends BaseIdentitySettingsFragment implements jpw {
    public jps a;
    public jpv b;
    private zfw c;
    private TextView d;
    private TextView e;
    private SettingsStatefulButton f;
    private final akbl<View, ajxw> j = new d(this);
    private final akbl<View, ajxw> k = new b(this);

    static final class c<T> implements ajfb<jpt> {
        private /* synthetic */ TfaSetupRecoveryCodeFragment a;

        c(TfaSetupRecoveryCodeFragment tfaSetupRecoveryCodeFragment) {
            this.a = tfaSetupRecoveryCodeFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x011b  */
        public final /* synthetic */ void accept(java.lang.Object r20) {
            /*
            r19 = this;
            r0 = r19;
            r1 = r20;
            r1 = (defpackage.jpt) r1;
            r2 = r0.a;
            r2.f();
            r2 = r0.a;
            r2 = r2.b;
            if (r2 != 0) goto L_0x0016;
        L_0x0011:
            r3 = "presenter";
            defpackage.akcr.a(r3);
        L_0x0016:
            r3 = "it";
            defpackage.akcr.a(r1, r3);
            r3 = "s";
            defpackage.akcr.b(r1, r3);
            r3 = r2.getTarget();
            r3 = (defpackage.jpw) r3;
            if (r3 != 0) goto L_0x002a;
        L_0x0028:
            goto L_0x013a;
        L_0x002a:
            r4 = "target ?: return";
            defpackage.akcr.a(r3, r4);
            r4 = r1.c;
            if (r4 == 0) goto L_0x0037;
        L_0x0033:
            r4 = r1.d;
            if (r4 != 0) goto L_0x004b;
        L_0x0037:
            r4 = r1.c;
            if (r4 == 0) goto L_0x0044;
        L_0x003b:
            r4 = r2.b;
        L_0x003d:
            r4 = r4.b();
            r4 = (java.lang.String) r4;
            goto L_0x004e;
        L_0x0044:
            r4 = r1.d;
            if (r4 == 0) goto L_0x004b;
        L_0x0048:
            r4 = r2.c;
            goto L_0x003d;
        L_0x004b:
            r4 = r2.a;
            goto L_0x003d;
        L_0x004e:
            r5 = r1.e;
            r6 = r1.f;
            r7 = 1;
            r8 = 0;
            r9 = 0;
            if (r6 == 0) goto L_0x00cc;
        L_0x0057:
            r6 = r6.b;
            if (r6 != 0) goto L_0x00cc;
        L_0x005b:
            r6 = r2.e;
            if (r6 != 0) goto L_0x00ce;
        L_0x005f:
            r6 = r1.f;
            if (r6 == 0) goto L_0x00ce;
        L_0x0063:
            r10 = r2.h;
            r11 = 2131890257; // 0x7f121051 float:1.94152E38 double:1.0532937367E-314;
            r12 = new java.lang.Object[r7];
            r6 = r6.a;
            r12[r9] = r6;
            r6 = r10.getString(r11, r12);
            r10 = new jpv$g;
            r10.<init>(r2);
            r10 = (defpackage.akbl) r10;
            r15 = new zgy$a;
            r12 = r2.h;
            r11 = r2.i;
            r11 = r11.get();
            r13 = "navigationHost.get()";
            defpackage.akcr.a(r11, r13);
            r13 = r11;
            r13 = (defpackage.achb) r13;
            r14 = r2.f;
            r16 = 0;
            r17 = 0;
            r18 = 16;
            r11 = r15;
            r7 = r15;
            r15 = r16;
            r16 = r17;
            r17 = r18;
            r11.<init>(r12, r13, r14, r15, r16, r17);
            r11 = "title";
            defpackage.akcr.a(r6, r11);
            r6 = r7.a(r6);
            r7 = 2131890256; // 0x7f121050 float:1.9415199E38 double:1.053293736E-314;
            r6 = r6.b(r7);
            r7 = 2131890260; // 0x7f121054 float:1.9415207E38 double:1.053293738E-314;
            r6 = r6.a(r7, r10, r9);
            r6 = r6.a();
            r7 = r2.i;
            r7 = r7.get();
            r7 = (defpackage.achb) r7;
            r10 = r6;
            r10 = (defpackage.achd) r10;
            r11 = r6.a;
            r7.a(r10, r11, r8);
            r2.e = r6;
            goto L_0x00ce;
        L_0x00cc:
            r2.e = r8;
        L_0x00ce:
            r6 = r1.a;
            r6 = (java.lang.CharSequence) r6;
            r6 = defpackage.akgb.a(r6);
            r7 = 1;
            r6 = r6 ^ r7;
            if (r6 == 0) goto L_0x00f0;
        L_0x00da:
            r6 = r2.g;
            if (r6 != 0) goto L_0x00f2;
        L_0x00de:
            r6 = r2.h;
            r7 = r1.a;
            r7 = (java.lang.CharSequence) r7;
            r6 = android.widget.Toast.makeText(r6, r7, r9);
            r6.show();
            r6 = r1.a;
            r2.g = r6;
            goto L_0x00f2;
        L_0x00f0:
            r2.g = r8;
        L_0x00f2:
            r2 = r3.c();
            r2.setState(r5);
            r2 = new jpv$c;
            r5 = r3.b();
            r5 = r5.getText();
            r2.<init>(r5);
            r2 = (defpackage.akbk) r2;
            r5 = new jpv$d;
            r6 = r3.b();
            r5.<init>(r6);
            r5 = (defpackage.akbl) r5;
            defpackage.jpv.a(r4, r2, r5);
            r1 = r1.b;
            if (r1 == 0) goto L_0x011b;
        L_0x011a:
            goto L_0x011d;
        L_0x011b:
            r9 = 8;
        L_0x011d:
            r1 = java.lang.Integer.valueOf(r9);
            r2 = new jpv$e;
            r4 = r3.a();
            r2.<init>(r4);
            r2 = (defpackage.akbk) r2;
            r4 = new jpv$f;
            r3 = r3.a();
            r4.<init>(r3);
            r4 = (defpackage.akbl) r4;
            defpackage.jpv.a(r1, r2, r4);
        L_0x013a:
            r1 = r0.a;
            r1.g();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.tfa.recoverycode.TfaSetupRecoveryCodeFragment$c.accept(java.lang.Object):void");
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupRecoveryCodeFragment a;

        b(TfaSetupRecoveryCodeFragment tfaSetupRecoveryCodeFragment) {
            this.a = tfaSetupRecoveryCodeFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.d().b();
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupRecoveryCodeFragment a;

        d(TfaSetupRecoveryCodeFragment tfaSetupRecoveryCodeFragment) {
            this.a = tfaSetupRecoveryCodeFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((joq) this.a.d().d.get()).s();
            return ajxw.a;
        }
    }

    static final class a extends akcq implements akbk<ajxw> {
        a(jps jps) {
            super(0, jps);
        }

        public final String getName() {
            return "onUserConfirmedGeneratedCode";
        }

        public final akej getOwner() {
            return akde.a(jps.class);
        }

        public final String getSignature() {
            return "onUserConfirmedGeneratedCode()V";
        }

        public final /* synthetic */ Object invoke() {
            jpr jpr;
            jps jps = (jps) this.receiver;
            jpr jpr2 = jps.a().f;
            if (jpr2 != null) {
                String str = jpr2.a;
                akcr.b(str, "code");
                jpr = new jpr(str, true);
            } else {
                jpr = null;
            }
            jps.a(jpt.a(jps.a(), null, false, false, false, false, jpr, 31));
            ((joq) jps.d.get()).t();
            return ajxw.a;
        }
    }

    private SettingsStatefulButton h() {
        SettingsStatefulButton settingsStatefulButton = this.f;
        if (settingsStatefulButton == null) {
            akcr.a("generateCodeButton");
        }
        return settingsStatefulButton;
    }

    public final TextView a() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("skipButton");
        }
        return textView;
    }

    public final TextView b() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("explanationText");
        }
        return textView;
    }

    public final /* synthetic */ joo c() {
        return h();
    }

    public final jps d() {
        jps jps = this.a;
        if (jps == null) {
            akcr.a("handler");
        }
        return jps;
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        a().setOnClickListener(null);
        h().setOnClickListener(null);
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        a().setOnClickListener(new jpu(this.j));
        h().setOnClickListener(new jpu(this.k));
    }

    public final boolean o_() {
        jps jps = this.a;
        if (jps == null) {
            akcr.a("handler");
        }
        return ((joq) jps.d.get()).u();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jpv jpv = this.b;
        if (jpv == null) {
            akcr.a("presenter");
        }
        jpv.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jps jps = this.a;
        String str = "handler";
        if (jps == null) {
            akcr.a(str);
        }
        joy b = ((joq) jps.d.get()).b();
        jps.a(jpt.a(jps.a(), null, b.c, b.d, b.e, false, null, 49));
        jpv jpv = this.b;
        if (jpv == null) {
            akcr.a("presenter");
        }
        jps jps2 = this.a;
        if (jps2 == null) {
            akcr.a(str);
        }
        jpv.d = new a(jps2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_recovery_code, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        jps jps = this.a;
        if (jps == null) {
            akcr.a("handler");
        }
        jps.b.dispose();
    }

    public final void onDetach() {
        super.onDetach();
        jpv jpv = this.b;
        if (jpv == null) {
            akcr.a("presenter");
        }
        jpv.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        f();
    }

    public final void onResume() {
        super.onResume();
        jps jps = this.a;
        if (jps == null) {
            akcr.a("handler");
        }
        Object h = jps.a.h((Object) jps.a());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.c;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new c(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
        g();
    }

    public final void onStart() {
        super.onStart();
        jrl.a(getContext());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.recovery_skip_button);
        akcr.a(findViewById, "view.findViewById(R.id.recovery_skip_button)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.generate_button);
        akcr.a(findViewById, "view.findViewById(R.id.generate_button)");
        SettingsStatefulButton settingsStatefulButton = (SettingsStatefulButton) findViewById;
        akcr.b(settingsStatefulButton, str);
        this.f = settingsStatefulButton;
        Object findViewById2 = view.findViewById(R.id.settings_two_fa_recovery_code_explanation);
        akcr.a(findViewById2, "view.findViewById(R.id.s…ecovery_code_explanation)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.e = textView2;
        o().get();
        this.c = zgb.a(iuc.m, iuc.e.b());
    }
}
