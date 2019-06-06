package com.snap.identity.ui.settings.tfa.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achd;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.iuc;
import defpackage.joq;
import defpackage.jow;
import defpackage.jqg;
import defpackage.jqh;
import defpackage.jqi;
import defpackage.jqj;
import defpackage.jqk;
import defpackage.jql;
import defpackage.jql.h;
import defpackage.jql.i;
import defpackage.jql.j;
import defpackage.jql.k;
import defpackage.jql.l;
import defpackage.jqm;
import defpackage.jqn;
import defpackage.jqo;
import defpackage.jrl;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjq;

public final class TfaSettingsFragment extends BaseIdentitySettingsFragment implements jqo, zjq {
    public jqi a;
    public jql b;
    private View c;
    private TextView d;
    private CheckBox e;
    private CheckBox f;
    private View j;
    private View k;
    private zfw l;
    private final akbw<CompoundButton, Boolean, ajxw> m = new g(this);
    private final akbw<CompoundButton, Boolean, ajxw> n = new d(this);
    private final akbl<View, ajxw> o = new e(this);
    private final akbl<View, ajxw> p = new c(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class f<T> implements ajfb<jqn> {
        private /* synthetic */ TfaSettingsFragment a;

        f(TfaSettingsFragment tfaSettingsFragment) {
            this.a = tfaSettingsFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (jqn) obj;
            this.a.h();
            jql jql = this.a.b;
            if (jql == null) {
                akcr.a("presenter");
            }
            akcr.a(obj2, "it");
            akcr.b(obj2, "s");
            Object obj3 = (jqo) jql.getTarget();
            if (obj3 != null) {
                String str;
                zgy a;
                akcr.a(obj3, "target ?: return");
                String str2 = "navigationHost.get()";
                if ((akgb.a(obj2.d) ^ 1) != 0) {
                    str = obj2.d;
                    Context context = jql.b;
                    Object obj4 = jql.c.get();
                    akcr.a(obj4, str2);
                    a = new defpackage.zgy.a(context, (achb) obj4, jql.d, false, null, 24).b(str).a((int) R.string.privacy_policy_ok, (akbl) l.a, true).a();
                    ((achb) jql.c.get()).a((achd) a, a.a, null);
                }
                if (obj2.f != null) {
                    jow jow = obj2.f;
                    int i = jqm.a[jow.ordinal()];
                    if (i == 1) {
                        i = obj2.c ? R.string.settings_tfa_settings_disable_sms_w_otp_description : R.string.settings_tfa_settings_disable_sms_only_description;
                    } else if (i == 2) {
                        i = obj2.b ? R.string.settings_tfa_settings_disable_otp_w_sms_description : R.string.settings_tfa_settings_disable_otp_only_description;
                    } else {
                        throw new ajxk();
                    }
                    akbl jVar = new j(jql, jow);
                    akbl kVar = new k(jql, jow);
                    Context context2 = jql.b;
                    Object obj5 = jql.c.get();
                    akcr.a(obj5, str2);
                    a = defpackage.zgy.a.a(new defpackage.zgy.a(context2, (achb) obj5, jql.d, false, null, 24).b(i).a((int) R.string.disable, kVar, true), jVar, true, Integer.valueOf(R.string.cancel), null, null, 24).a();
                    ((achb) jql.c.get()).a((achd) a, a.a, null);
                }
                str = obj2.a;
                int i2 = obj2.e ? 0 : 8;
                jql.a((akgb.a((CharSequence) str) ^ 1) != 0 ? jql.b.getString(R.string.settings_tfa_settings_sms_explanation, new Object[]{str}) : jql.b.getString(R.string.settings_tfa_settings_sms_explanation_your_phone_number), new defpackage.jql.b(obj3.b().getText()), new defpackage.jql.c(obj3.b()));
                jql.a(Boolean.valueOf(obj2.c), new defpackage.jql.d(obj3.f()), new defpackage.jql.e(obj3.f()));
                jql.a(Boolean.valueOf(obj2.b), new defpackage.jql.f(obj3.d()), new defpackage.jql.g(obj3.d()));
                jql.a(Integer.valueOf(i2), new h(obj3.a()), new i(obj3.a()));
            }
            this.a.i();
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSettingsFragment a;

        c(TfaSettingsFragment tfaSettingsFragment) {
            this.a = tfaSettingsFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((joq) this.a.g().c.get()).i();
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbw<CompoundButton, Boolean, ajxw> {
        private /* synthetic */ TfaSettingsFragment a;

        d(TfaSettingsFragment tfaSettingsFragment) {
            this.a = tfaSettingsFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            CompoundButton compoundButton = (CompoundButton) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(compoundButton, "<anonymous parameter 0>");
            jqi g = this.a.g();
            if (booleanValue != g.a().c) {
                if (booleanValue) {
                    ((joq) g.c.get()).g();
                } else {
                    g.a(jqn.a(g.a(), null, false, false, null, false, jow.OTP, 31));
                }
            }
            g.a(g.a());
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSettingsFragment a;

        e(TfaSettingsFragment tfaSettingsFragment) {
            this.a = tfaSettingsFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((joq) this.a.g().c.get()).h();
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbw<CompoundButton, Boolean, ajxw> {
        private /* synthetic */ TfaSettingsFragment a;

        g(TfaSettingsFragment tfaSettingsFragment) {
            this.a = tfaSettingsFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            CompoundButton compoundButton = (CompoundButton) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(compoundButton, "<anonymous parameter 0>");
            jqi g = this.a.g();
            if (booleanValue != g.a().b) {
                if (booleanValue) {
                    ((joq) g.c.get()).f();
                } else {
                    g.a(jqn.a(g.a(), null, false, false, null, false, jow.SMS, 31));
                }
            }
            g.a(g.a());
            return ajxw.a;
        }
    }

    static final class b extends akcq implements akbw<jow, Boolean, ajxw> {
        b(jqi jqi) {
            super(2, jqi);
        }

        public final String getName() {
            return "onConfirmDisablingTfaResponded";
        }

        public final akej getOwner() {
            return akde.a(jqi.class);
        }

        public final String getSignature() {
            return "onConfirmDisablingTfaResponded(Lcom/snap/identity/ui/settings/tfa/TfaType;Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            jow jow = (jow) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(jow, "p1");
            jqi jqi = (jqi) this.receiver;
            akcr.b(jow, "tfaType");
            jqi.a(jqn.a(jqi.a(), null, false, false, null, false, null, 31));
            if (booleanValue) {
                ajdx w;
                jqi.a(jqn.a(jqi.a(), null, false, false, null, true, null, 47));
                int i = jqj.a[jow.ordinal()];
                if (i == 1) {
                    w = ((joq) jqi.c.get()).w();
                } else if (i == 2) {
                    w = ((joq) jqi.c.get()).x();
                } else {
                    throw new ajxk();
                }
                ajej e = w.e((ajfb) new defpackage.jqi.c(jqi, jow));
                akcr.a((Object) e, "when (tfaType) {\n       …essage)\n                }");
                ajvv.a(e, jqi.b);
            } else {
                jqn a;
                int i2 = jqj.c[jow.ordinal()];
                if (i2 == 1) {
                    a = jqn.a(jqi.a(), null, true, false, null, false, null, 61);
                } else if (i2 == 2) {
                    a = jqn.a(jqi.a(), null, false, true, null, false, null, 59);
                }
                jqi.a(a);
            }
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    private View j() {
        View view = this.j;
        if (view == null) {
            akcr.a("recoveryCodeSection");
        }
        return view;
    }

    private View k() {
        View view = this.k;
        if (view == null) {
            akcr.a("forgetDevicesSection");
        }
        return view;
    }

    public final long S_() {
        return -1;
    }

    public final View a() {
        View view = this.c;
        if (view == null) {
            akcr.a("disablingOverlay");
        }
        return view;
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("smsTfaSubText");
        }
        return textView;
    }

    public final CheckBox d() {
        CheckBox checkBox = this.e;
        if (checkBox == null) {
            akcr.a("smsTfaCheckbox");
        }
        return checkBox;
    }

    public final CheckBox f() {
        CheckBox checkBox = this.f;
        if (checkBox == null) {
            akcr.a("otpTfaCheckbox");
        }
        return checkBox;
    }

    public final jqi g() {
        jqi jqi = this.a;
        if (jqi == null) {
            akcr.a("handler");
        }
        return jqi;
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        j().setOnClickListener(null);
        k().setOnClickListener(null);
        d().setOnCheckedChangeListener(null);
        f().setOnCheckedChangeListener(null);
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        d().setOnCheckedChangeListener(new jqh(this.m));
        f().setOnCheckedChangeListener(new jqh(this.n));
        j().setOnClickListener(new jqg(this.o));
        k().setOnClickListener(new jqg(this.p));
    }

    public final boolean o_() {
        jqi jqi = this.a;
        if (jqi == null) {
            akcr.a("handler");
        }
        ((joq) jqi.c.get()).e();
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jql jql = this.b;
        if (jql == null) {
            akcr.a("presenter");
        }
        jql.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jqi jqi = this.a;
        String str = "handler";
        if (jqi == null) {
            akcr.a(str);
        }
        ajej f = ((joq) jqi.c.get()).c().f((ajfb) new jqk(new defpackage.jqi.b(jqi)));
        akcr.a((Object) f, "settingsTfaFlowManager.g…e(::onUserTfaStateUpdate)");
        ajvv.a(f, jqi.b);
        jql jql = this.b;
        if (jql == null) {
            akcr.a("presenter");
        }
        jqi jqi2 = this.a;
        if (jqi2 == null) {
            akcr.a(str);
        }
        jql.a = new b(jqi2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_settings, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        jqi jqi = this.a;
        if (jqi == null) {
            akcr.a("handler");
        }
        jqi.b.dispose();
    }

    public final void onDetach() {
        super.onDetach();
        jql jql = this.b;
        if (jql == null) {
            akcr.a("presenter");
        }
        jql.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        h();
    }

    public final void onResume() {
        super.onResume();
        jqi jqi = this.a;
        if (jqi == null) {
            akcr.a("handler");
        }
        Object h = jqi.a.h((Object) jqi.a());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.l;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new f(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
        i();
    }

    public final void onStart() {
        super.onStart();
        jrl.a(getContext());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.tfa_settings_disabling_overlay);
        akcr.a(findViewById, "view.findViewById(R.id.t…ttings_disabling_overlay)");
        String str = "<set-?>";
        akcr.b(findViewById, str);
        this.c = findViewById;
        findViewById = view.findViewById(R.id.tfa_settings_sms_subtext);
        akcr.a(findViewById, "view.findViewById(R.id.tfa_settings_sms_subtext)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.tfa_settings_sms_checkbox);
        akcr.a(findViewById, "view.findViewById(R.id.tfa_settings_sms_checkbox)");
        CheckBox checkBox = (CheckBox) findViewById;
        akcr.b(checkBox, str);
        this.e = checkBox;
        findViewById = view.findViewById(R.id.tfa_settings_otp_checkbox);
        akcr.a(findViewById, "view.findViewById(R.id.tfa_settings_otp_checkbox)");
        checkBox = (CheckBox) findViewById;
        akcr.b(checkBox, str);
        this.f = checkBox;
        findViewById = view.findViewById(R.id.tfa_settings_recovery_code_section);
        akcr.a(findViewById, "view.findViewById(R.id.t…gs_recovery_code_section)");
        akcr.b(findViewById, str);
        this.j = findViewById;
        Object findViewById2 = view.findViewById(R.id.tfa_settings_forget_devices_section);
        akcr.a(findViewById2, "view.findViewById(R.id.t…s_forget_devices_section)");
        akcr.b(findViewById2, str);
        this.k = findViewById2;
        o().get();
        this.l = zgb.a(iuc.m, "TfaSettingsFragment");
    }
}
