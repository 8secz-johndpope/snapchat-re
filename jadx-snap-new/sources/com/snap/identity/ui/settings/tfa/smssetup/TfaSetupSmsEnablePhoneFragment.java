package com.snap.identity.ui.settings.tfa.smssetup;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsPhoneButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.ifs;
import defpackage.iuc;
import defpackage.jqp;
import defpackage.jqq;
import defpackage.jqr;
import defpackage.jqs;
import defpackage.jqs.f;
import defpackage.jqt;
import defpackage.jqu;
import defpackage.jqv;
import defpackage.jro;
import defpackage.juj;
import defpackage.jun;
import defpackage.juo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjq;

public final class TfaSetupSmsEnablePhoneFragment extends BaseIdentitySettingsFragment implements jqv, zjq {
    public jqq a;
    public jqs b;
    private TextView c;
    private TextView d;
    private EditText e;
    private View f;
    private SettingsPhoneButton j;
    private zfw k;
    private final e l = new e(this);
    private final akbl<View, ajxw> m = new b(this);
    private final akbl<View, ajxw> n = new c(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class e implements TextWatcher {
        private /* synthetic */ TfaSetupSmsEnablePhoneFragment a;

        e(TfaSetupSmsEnablePhoneFragment tfaSetupSmsEnablePhoneFragment) {
            this.a = tfaSetupSmsEnablePhoneFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.h().b(String.valueOf(charSequence));
        }
    }

    static final class d<T> implements ajfb<jqu> {
        private /* synthetic */ TfaSetupSmsEnablePhoneFragment a;

        d(TfaSetupSmsEnablePhoneFragment tfaSetupSmsEnablePhoneFragment) {
            this.a = tfaSetupSmsEnablePhoneFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jqu) obj;
            this.a.j();
            jqs jqs = this.a.b;
            if (jqs == null) {
                akcr.a("presenter");
            }
            String str = "state";
            akcr.a(obj, str);
            akcr.b(obj, str);
            Object obj2 = (jqv) jqs.getTarget();
            if (obj2 != null) {
                Object obj3;
                com.snap.identity.ui.settings.shared.SettingsPhoneButton.a aVar;
                akcr.a(obj2, "target ?: return");
                if ((((CharSequence) obj2.a().getText().toString()).length() == 0 ? 1 : null) != null) {
                    if ((((CharSequence) obj.a.a).length() > 0 ? 1 : null) != null) {
                        TextView a = obj2.a();
                        Context context = (Context) jqs.a.get();
                        Object[] objArr = new Object[1];
                        StringBuilder stringBuilder = new StringBuilder("+");
                        stringBuilder.append(obj.a.a);
                        objArr[0] = stringBuilder.toString();
                        a.setText(context.getString(R.string.two_fa_settings_confirmation_explanation_v2, objArr));
                    }
                }
                jro a2 = juj.a(obj.a);
                if ((((CharSequence) a2.f).length() > 0 ? 1 : null) != null) {
                    obj3 = a2.f;
                } else {
                    obj3 = (((CharSequence) a2.g).length() > 0 ? 1 : null) != null ? a2.g : "";
                }
                jqs.a(obj3, new defpackage.jqs.a(obj2.b().getText()), new defpackage.jqs.b(obj2.b()));
                jqs.a(a2.j, new defpackage.jqs.c(obj2.d().getText()), new defpackage.jqs.d(obj2.d()));
                jqs.a(Integer.valueOf(a2.k ? 0 : 4), new defpackage.jqs.e(obj2.f().getVisibility()), new f(obj2.f()));
                switch (jqt.a[a2.b.ordinal()]) {
                    case 1:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(2, a2.l);
                        break;
                    case 2:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(1, a2.l);
                        break;
                    case 3:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(4, a2.l);
                        break;
                    case 4:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(0, a2.l);
                        break;
                    case 5:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(5, a2.l);
                        break;
                    case 6:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(6, a2.l);
                        break;
                    default:
                        throw new ajxk();
                }
                Integer currentState = obj2.g().getCurrentState();
                int i = aVar.a;
                if (currentState == null || currentState.intValue() != i || aVar.a == 4) {
                    obj2.g().a(aVar);
                }
            }
            this.a.i();
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupSmsEnablePhoneFragment a;

        b(TfaSetupSmsEnablePhoneFragment tfaSetupSmsEnablePhoneFragment) {
            this.a = tfaSetupSmsEnablePhoneFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            this.a.h().b("");
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupSmsEnablePhoneFragment a;

        c(TfaSetupSmsEnablePhoneFragment tfaSetupSmsEnablePhoneFragment) {
            this.a = tfaSetupSmsEnablePhoneFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            jqq h = this.a.h();
            int i = jqr.a[h.a().a.n.ordinal()];
            if (i == 1) {
                h.b();
            } else if (i == 2) {
                h.c();
            }
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
            akcr.a("verifyCodeExplanation");
        }
        return textView;
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("error");
        }
        return textView;
    }

    public final EditText d() {
        EditText editText = this.e;
        if (editText == null) {
            akcr.a("verifyCodeView");
        }
        return editText;
    }

    public final View f() {
        View view = this.f;
        if (view == null) {
            akcr.a("verifyCodeCleaner");
        }
        return view;
    }

    public final SettingsPhoneButton g() {
        SettingsPhoneButton settingsPhoneButton = this.j;
        if (settingsPhoneButton == null) {
            akcr.a("continueButton");
        }
        return settingsPhoneButton;
    }

    public final jqq h() {
        jqq jqq = this.a;
        if (jqq == null) {
            akcr.a("handler");
        }
        return jqq;
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        d().addTextChangedListener(this.l);
        f().setOnClickListener(new jqp(this.m));
        g().setOnClickListener(new jqp(this.n));
    }

    /* Access modifiers changed, original: final */
    public final void j() {
        d().removeTextChangedListener(this.l);
        f().setOnClickListener(null);
        g().setOnClickListener(null);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jqs jqs = this.b;
        if (jqs == null) {
            akcr.a("presenter");
        }
        jqs.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jqq jqq = this.a;
        if (jqq == null) {
            akcr.a("handler");
        }
        Activity activity = jqq.i;
        Object obj = jqq.j.get();
        akcr.a(obj, "userAuthStore.get()");
        gpb gpb = (gpb) obj;
        obj = jqq.e.get();
        akcr.a(obj, "configProvider.get()");
        ftl ftl = (ftl) obj;
        obj = jqq.k.get();
        akcr.a(obj, "permissionHelper.get()");
        ajej a = juo.a(activity, gpb, ftl, (ifs) obj, jqq.c, false, null, 64).a((ajfb) new defpackage.jqq.c(jqq), (ajfb) new defpackage.jqq.d(jqq));
        akcr.a((Object) a, "TelephonyUtils.loadPhone…{ _ -> onInitialData() })");
        ajvv.a(a, jqq.b);
        a = jqq.g.c.a((ajdw) jqq.c.l()).f((ajfb) new defpackage.jqq.e(jqq));
        akcr.a((Object) a, "resendTimer.resendTimerS…      )\n                }");
        ajvv.a(a, jqq.b);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_setup_sms_enable_phone, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        jqq jqq = this.a;
        if (jqq == null) {
            akcr.a("handler");
        }
        jqq.g.b();
        jqq.b.dispose();
    }

    public final void onDetach() {
        super.onDetach();
        jqs jqs = this.b;
        if (jqs == null) {
            akcr.a("presenter");
        }
        jqs.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        j();
        jqq jqq = this.a;
        if (jqq == null) {
            akcr.a("handler");
        }
        ((jun) jqq.l.get()).a(jqq.h);
    }

    public final void onResume() {
        super.onResume();
        i();
        jqq jqq = this.a;
        if (jqq == null) {
            akcr.a("handler");
        }
        Object h = jqq.a.h((Object) jqq.a());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.k;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new d(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.verify_code_explanation);
        akcr.a(findViewById, "view.findViewById(R.id.verify_code_explanation)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.c = textView;
        findViewById = view.findViewById(R.id.verify_code);
        akcr.a(findViewById, "view.findViewById(R.id.verify_code)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.e = editText;
        findViewById = view.findViewById(R.id.wrong_verify_code_cleaner);
        akcr.a(findViewById, "view.findViewById(R.id.wrong_verify_code_cleaner)");
        akcr.b(findViewById, str);
        this.f = findViewById;
        findViewById = view.findViewById(R.id.verify_code_err_text);
        akcr.a(findViewById, "view.findViewById(R.id.verify_code_err_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        SettingsPhoneButton settingsPhoneButton = (SettingsPhoneButton) findViewById2;
        akcr.b(settingsPhoneButton, str);
        this.j = settingsPhoneButton;
        o().get();
        this.k = zgb.a(iuc.m, "TfaSetupSmsEnablePhoneFragment");
    }
}
