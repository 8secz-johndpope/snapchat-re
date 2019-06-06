package com.snap.identity.ui.settings.tfa.otpsetup;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akgb;
import defpackage.iuc;
import defpackage.joq;
import defpackage.jpk;
import defpackage.jpl;
import defpackage.jpm;
import defpackage.jpm.f;
import defpackage.jpm.g;
import defpackage.jpm.h;
import defpackage.jpm.i;
import defpackage.jpm.j;
import defpackage.jpm.k;
import defpackage.jpn;
import defpackage.jpo;
import defpackage.jpp;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjq;

public final class TfaSetupOtpVerificationFragment extends BaseIdentitySettingsFragment implements jpp, zjq {
    public jpl a;
    public jpm b;
    final b c = new b(this);
    final akbl<View, ajxw> d = new d(this);
    final akbl<View, ajxw> e = new c(this);
    private EditText f;
    private TextView j;
    private ImageView k;
    private SettingsStatefulButton l;
    private zfw m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ TfaSetupOtpVerificationFragment a;

        b(TfaSetupOtpVerificationFragment tfaSetupOtpVerificationFragment) {
            this.a = tfaSetupOtpVerificationFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.g().a(String.valueOf(charSequence));
        }
    }

    static final class e<T> implements ajfb<jpo> {
        private /* synthetic */ TfaSetupOtpVerificationFragment a;

        e(TfaSetupOtpVerificationFragment tfaSetupOtpVerificationFragment) {
            this.a = tfaSetupOtpVerificationFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jpo) obj;
            this.a.h();
            jpm jpm = this.a.b;
            if (jpm == null) {
                akcr.a("presenter");
            }
            akcr.a(obj, "it");
            akcr.b(obj, "s");
            Object obj2 = (jpp) jpm.getTarget();
            if (obj2 != null) {
                akcr.a(obj2, "target ?: return");
                int i = 0;
                int i2 = obj.c ? 1 : (!akgb.a((CharSequence) obj.b) || obj.a.length() < 6) ? 2 : 0;
                if (akgb.a(obj.b)) {
                    i = 8;
                }
                jpm.a(obj.a, new defpackage.jpm.a(obj2.a().getText()), new defpackage.jpm.e(obj2.a()));
                jpm.a(Boolean.valueOf(1 ^ obj.c), new f(obj2.a()), new g(obj2.a()));
                jpm.a(obj.b, new h(obj2.b().getText()), new i(obj2.b()));
                jpm.a(Integer.valueOf(i2), new jpn(obj2.f()), new j(obj2.f()));
                jpm.a(Integer.valueOf(i), new k(obj2.b()), new defpackage.jpm.b(obj2.b()));
                jpm.a(Integer.valueOf(i), new defpackage.jpm.c(obj2.d()), new defpackage.jpm.d(obj2.d()));
            }
            TfaSetupOtpVerificationFragment tfaSetupOtpVerificationFragment = this.a;
            tfaSetupOtpVerificationFragment.a().addTextChangedListener(tfaSetupOtpVerificationFragment.c);
            tfaSetupOtpVerificationFragment.d().setOnClickListener(new jpk(tfaSetupOtpVerificationFragment.d));
            tfaSetupOtpVerificationFragment.f().setOnClickListener(new jpk(tfaSetupOtpVerificationFragment.e));
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupOtpVerificationFragment a;

        c(TfaSetupOtpVerificationFragment tfaSetupOtpVerificationFragment) {
            this.a = tfaSetupOtpVerificationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            jpl g = this.a.g();
            g.a(jpo.a(g.a(), null, "", true, 1));
            ajej e = ((joq) g.d.get()).c(g.a().a).a((ajdw) g.b.l()).e((ajfb) new defpackage.jpl.c(g));
            akcr.a((Object) e, "settingsTfaFlowManager.g…      }\n                }");
            ajvv.a(e, g.c);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupOtpVerificationFragment a;

        d(TfaSetupOtpVerificationFragment tfaSetupOtpVerificationFragment) {
            this.a = tfaSetupOtpVerificationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.g().a("");
            return ajxw.a;
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
            akcr.a("codeInput");
        }
        return editText;
    }

    public final TextView b() {
        TextView textView = this.j;
        if (textView == null) {
            akcr.a(Event.ERROR_MESSAGE);
        }
        return textView;
    }

    public final ImageView d() {
        ImageView imageView = this.k;
        if (imageView == null) {
            akcr.a("errorXButton");
        }
        return imageView;
    }

    public final SettingsStatefulButton f() {
        SettingsStatefulButton settingsStatefulButton = this.l;
        if (settingsStatefulButton == null) {
            akcr.a("continueButton");
        }
        return settingsStatefulButton;
    }

    public final jpl g() {
        jpl jpl = this.a;
        if (jpl == null) {
            akcr.a("handler");
        }
        return jpl;
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        d().setOnClickListener(null);
        f().setOnClickListener(null);
        a().removeTextChangedListener(this.c);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jpm jpm = this.b;
        if (jpm == null) {
            akcr.a("presenter");
        }
        jpm.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_setup_otp_verification, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        jpl jpl = this.a;
        if (jpl == null) {
            akcr.a("handler");
        }
        jpl.c.dispose();
    }

    public final void onDetach() {
        super.onDetach();
        jpm jpm = this.b;
        if (jpm == null) {
            akcr.a("presenter");
        }
        jpm.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        h();
    }

    public final void onResume() {
        super.onResume();
        jpl jpl = this.a;
        if (jpl == null) {
            akcr.a("handler");
        }
        Object h = jpl.a.h((Object) jpl.a());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.m;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new e(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_setup_otp_verification_code);
        akcr.a(findViewById, "view.findViewById(R.id.t…up_otp_verification_code)");
        EditText editText = (EditText) findViewById;
        String str = "<set-?>";
        akcr.b(editText, str);
        this.f = editText;
        findViewById = view.findViewById(R.id.tfa_setup_otp_verification_error_red_x);
        akcr.a(findViewById, "view.findViewById(R.id.t…verification_error_red_x)");
        ImageView imageView = (ImageView) findViewById;
        akcr.b(imageView, str);
        this.k = imageView;
        findViewById = view.findViewById(R.id.tfa_setup_otp_verification_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.t…rification_error_message)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.j = textView;
        Object findViewById2 = view.findViewById(R.id.tfa_setup_otp_verification_continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.t…fication_continue_button)");
        SettingsStatefulButton settingsStatefulButton = (SettingsStatefulButton) findViewById2;
        akcr.b(settingsStatefulButton, str);
        this.l = settingsStatefulButton;
        o().get();
        this.m = zgb.a(iuc.m, "TfaSetupOtpVerificationFragment");
    }
}
