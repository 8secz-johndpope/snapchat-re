package com.snap.identity.ui.settings.tfa.otpsetup;

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
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.iuc;
import defpackage.joq;
import defpackage.jot;
import defpackage.jpd;
import defpackage.jpe;
import defpackage.jpf;
import defpackage.jph;
import defpackage.jpi;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjq;

public final class TfaSetupOtpSecretFragment extends BaseIdentitySettingsFragment implements jpi, zjq {
    public jpe a;
    public jpf b;
    private TextView c;
    private SettingsStatefulButton d;
    private zfw e;
    private final akbl<View, ajxw> f = new b(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c<T> implements ajfb<jph> {
        private /* synthetic */ TfaSetupOtpSecretFragment a;

        c(TfaSetupOtpSecretFragment tfaSetupOtpSecretFragment) {
            this.a = tfaSetupOtpSecretFragment;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x00bd in {2, 5, 13, 14, 15, 16, 18, 20} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ void accept(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.jph) r9;
            r0 = r8.a;
            r0.d();
            r0 = r8.a;
            r0 = r0.b;
            if (r0 != 0) goto L_0x0012;
            r1 = "presenter";
            defpackage.akcr.a(r1);
            r1 = "it";
            defpackage.akcr.a(r9, r1);
            r1 = "state";
            defpackage.akcr.b(r9, r1);
            r1 = r0.getTarget();
            r1 = (defpackage.jpi) r1;
            if (r1 != 0) goto L_0x0026;
            goto L_0x00ad;
            r2 = "target ?: return";
            defpackage.akcr.a(r1, r2);
            r0 = r0.a;
            r0.get();
            r9 = r9.a;
            r0 = "secret";
            defpackage.akcr.b(r9, r0);
            r0 = r9.length();
            r2 = 32;
            if (r0 != r2) goto L_0x00b3;
            r0 = new java.lang.StringBuffer;
            r0.<init>();
            r3 = 0;
            r4 = 0;
            r5 = 8;
            if (r4 >= r5) goto L_0x0069;
            r5 = r4 << 2;
            r6 = r4 + 1;
            r7 = r6 << 2;
            r5 = r9.substring(r5, r7);
            r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            defpackage.akcr.a(r5, r7);
            r0.append(r5);
            r5 = 3;
            if (r4 != r5) goto L_0x0062;
            r4 = 10;
            goto L_0x0064;
            r4 = 32;
            r0.append(r4);
            r4 = r6;
            goto L_0x0046;
            r0 = (java.lang.CharSequence) r0;
            r9 = defpackage.akgc.b(r0);
            r9 = r9.toString();
            r0 = java.lang.Integer.valueOf(r3);
            r2 = new jpg;
            r3 = r1.b();
            r2.<init>(r3);
            r2 = (defpackage.akbk) r2;
            r3 = new jpf$a;
            r4 = r1.b();
            r3.<init>(r4);
            r3 = (defpackage.akbl) r3;
            defpackage.jpf.a(r0, r2, r3);
            r0 = new jpf$b;
            r2 = r1.a();
            r2 = r2.getText();
            r0.<init>(r2);
            r0 = (defpackage.akbk) r0;
            r2 = new jpf$c;
            r1 = r1.a();
            r2.<init>(r1);
            r2 = (defpackage.akbl) r2;
            defpackage.jpf.a(r9, r0, r2);
            r9 = r8.a;
            r9.f();
            return;
            r9 = new java.lang.IllegalArgumentException;
            r0 = "Invalid secret length.";
            r9.<init>(r0);
            r9 = (java.lang.Throwable) r9;
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.tfa.otpsetup.TfaSetupOtpSecretFragment$c.accept(java.lang.Object):void");
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupOtpSecretFragment a;

        b(TfaSetupOtpSecretFragment tfaSetupOtpSecretFragment) {
            this.a = tfaSetupOtpSecretFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            jpe jpe = this.a.a;
            if (jpe == null) {
                akcr.a("handler");
            }
            ((joq) jpe.d.get()).b(jpe.a().a);
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public final long S_() {
        return -1;
    }

    public final TextView a() {
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("secretTextView");
        }
        return textView;
    }

    public final SettingsStatefulButton b() {
        SettingsStatefulButton settingsStatefulButton = this.d;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        return settingsStatefulButton;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        b().setOnClickListener(null);
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        b().setOnClickListener(new jpd(this.f));
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jpf jpf = this.b;
        if (jpf == null) {
            akcr.a("presenter");
        }
        jpf.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jpe jpe = this.a;
        if (jpe == null) {
            akcr.a("handler");
        }
        jpe.a();
        jpe.e.get();
        String a = jot.a();
        akcr.b(a, "otpSecret");
        jpe.c.a(jpe, jpe.a[0], new jph(a));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_setup_otp_secret, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        jpf jpf = this.b;
        if (jpf == null) {
            akcr.a("presenter");
        }
        jpf.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        d();
    }

    public final void onResume() {
        super.onResume();
        jpe jpe = this.a;
        if (jpe == null) {
            akcr.a("handler");
        }
        Object h = jpe.b.h((Object) jpe.a());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.e;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new c(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
        f();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_setup_otp_secret);
        akcr.a(findViewById, "view.findViewById(R.id.tfa_setup_otp_secret)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.c = textView;
        Object findViewById2 = view.findViewById(R.id.tfa_setup_otp_secret_continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.t…p_secret_continue_button)");
        SettingsStatefulButton settingsStatefulButton = (SettingsStatefulButton) findViewById2;
        akcr.b(settingsStatefulButton, str);
        this.d = settingsStatefulButton;
        o().get();
        this.e = zgb.a(iuc.m, "TfaSetupOtpSecretFragment");
    }
}
