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
import com.snap.identity.ui.shared.phonenumber.PhonePickerView;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achd;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.ftl;
import defpackage.ifs;
import defpackage.ifu;
import defpackage.iuc;
import defpackage.jic;
import defpackage.joq;
import defpackage.jqw;
import defpackage.jqx;
import defpackage.jqx.h;
import defpackage.jqy;
import defpackage.jqz;
import defpackage.jra;
import defpackage.jrb;
import defpackage.jrc;
import defpackage.jrl;
import defpackage.jro;
import defpackage.jui;
import defpackage.juj;
import defpackage.jun;
import defpackage.juo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjq;

public final class TfaSetupSmsNewPhoneFragment extends BaseIdentitySettingsFragment implements jrc, zjq {
    public jqx a;
    public jqz b;
    private PhonePickerView c;
    private TextView d;
    private TextView e;
    private EditText f;
    private View j;
    private TextView k;
    private SettingsPhoneButton l;
    private zfw m;
    private final g n = new g(this);
    private final akbl<View, ajxw> o = new c(this);
    private final akbl<View, ajxw> p = new d(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class g implements TextWatcher {
        private /* synthetic */ TfaSetupSmsNewPhoneFragment a;

        g(TfaSetupSmsNewPhoneFragment tfaSetupSmsNewPhoneFragment) {
            this.a = tfaSetupSmsNewPhoneFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.j().a(String.valueOf(charSequence));
        }
    }

    static final class f<T> implements ajfb<jrb> {
        private /* synthetic */ TfaSetupSmsNewPhoneFragment a;

        f(TfaSetupSmsNewPhoneFragment tfaSetupSmsNewPhoneFragment) {
            this.a = tfaSetupSmsNewPhoneFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jrb) obj;
            this.a.l();
            jqz jqz = this.a.b;
            if (jqz == null) {
                akcr.a("presenter");
            }
            String str = "state";
            akcr.a(obj, str);
            akcr.b(obj, str);
            Object obj2 = (jrc) jqz.getTarget();
            if (obj2 != null) {
                akcr.a(obj2, "target ?: return");
                if (obj.a) {
                    com.snap.identity.ui.settings.shared.SettingsPhoneButton.a aVar;
                    jro a = juj.a(obj.c);
                    if ((akcr.a(obj2.a().b, a.h) ^ 1) != 0) {
                        obj2.a().a(a.h);
                    }
                    if (obj2.a().isEnabled() != a.d) {
                        obj2.a().setEnabled(a.d);
                    }
                    if ((akcr.a(obj2.a().c, a.i) ^ 1) != 0) {
                        obj2.a().b(a.i);
                    }
                    int i = 8;
                    if ((akcr.a(obj2.b().getText().toString(), a.f) ^ 1) != 0) {
                        obj2.b().setText(a.f);
                        obj2.b().setVisibility((((CharSequence) a.f).length() > 0 ? 1 : null) != null ? 0 : 8);
                    }
                    if ((akcr.a(obj2.d().getText().toString(), a.e) ^ 1) != 0) {
                        obj2.d().setText(a.e);
                        obj2.d().setVisibility((((CharSequence) a.e).length() > 0 ? 1 : null) != null ? 0 : 8);
                    }
                    int i2 = a.c ? 8 : 0;
                    if (obj2.f().getVisibility() != i2) {
                        obj2.f().setVisibility(i2);
                    }
                    if ((akcr.a(obj2.f().getText().toString(), a.j) ^ 1) != 0) {
                        obj2.f().setText(a.j);
                    }
                    i2 = a.k ? 0 : 4;
                    if (obj2.g().getVisibility() != i2) {
                        obj2.g().setVisibility(i2);
                    }
                    if ((akcr.a(obj2.h().getText().toString(), a.g) ^ 1) != 0) {
                        obj2.h().setText(a.g);
                        TextView h = obj2.h();
                        if ((((CharSequence) a.g).length() > 0 ? 1 : null) != null) {
                            i = 0;
                        }
                        h.setVisibility(i);
                    }
                    switch (jra.a[a.b.ordinal()]) {
                        case 1:
                            aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(2, a.l);
                            break;
                        case 2:
                            aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(1, a.l);
                            break;
                        case 3:
                            aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(4, a.l);
                            break;
                        case 4:
                            aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(0, a.l);
                            break;
                        case 5:
                            aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(5, a.l);
                            break;
                        case 6:
                            aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(6, a.l);
                            break;
                        default:
                            throw new ajxk();
                    }
                    Integer currentState = obj2.i().getCurrentState();
                    int i3 = aVar.a;
                    if (currentState == null || currentState.intValue() != i3 || aVar.a == 4) {
                        obj2.i().a(aVar);
                    }
                    if (obj.b) {
                        String str2 = a.h;
                        jrl.a((Context) jqz.c.get());
                        akbl bVar = new defpackage.jqz.b(jqz);
                        Object obj3 = jqz.c.get();
                        akcr.a(obj3, "context.get()");
                        Context context = (Context) obj3;
                        obj3 = jqz.b.get();
                        akcr.a(obj3, "navigationHost.get()");
                        defpackage.zgy.a aVar2 = new defpackage.zgy.a(context, (achb) obj3, jqz.d, false, null, 24);
                        str2 = ((Context) jqz.c.get()).getString(R.string.phone_verification_alert_dialog_verification_body, new Object[]{str2});
                        akcr.a((Object) str2, "context.get().getString(…cation_body, phoneNumber)");
                        zgy a2 = defpackage.zgy.a.a(aVar2.b(str2).a((int) R.string.confirm_phone_number_text, bVar, true), null, false, null, null, null, 31).a();
                        ((achb) jqz.b.get()).a((achd) a2, a2.a, null);
                    }
                }
            }
            this.a.k();
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupSmsNewPhoneFragment a;

        c(TfaSetupSmsNewPhoneFragment tfaSetupSmsNewPhoneFragment) {
            this.a = tfaSetupSmsNewPhoneFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            this.a.j().a("");
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ TfaSetupSmsNewPhoneFragment a;

        d(TfaSetupSmsNewPhoneFragment tfaSetupSmsNewPhoneFragment) {
            this.a = tfaSetupSmsNewPhoneFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            jqx j = this.a.j();
            int i = jqy.a[j.a().c.n.ordinal()];
            if (i == 1) {
                j.a(jrb.a(j.a(), false, true, null, 5));
            } else if (i == 2) {
                j.c();
            }
            return ajxw.a;
        }
    }

    static final class b extends akcq implements akbw<String, String, ajxw> {
        b(TfaSetupSmsNewPhoneFragment tfaSetupSmsNewPhoneFragment) {
            super(2, tfaSetupSmsNewPhoneFragment);
        }

        public final String getName() {
            return "onPhonePickerData";
        }

        public final akej getOwner() {
            return akde.a(TfaSetupSmsNewPhoneFragment.class);
        }

        public final String getSignature() {
            return "onPhonePickerData(Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            akcr.b(str, "p1");
            akcr.b(str2, "p2");
            jqx jqx = ((TfaSetupSmsNewPhoneFragment) this.receiver).a;
            if (jqx == null) {
                akcr.a("handler");
            }
            akcr.b(str2, "phoneNumber");
            akcr.b(str, "countryCode");
            jqx.a(jrb.a(jqx.a(), false, false, jui.a(jqx.a().c, str2, str), 3));
            return ajxw.a;
        }
    }

    static final class e extends akcq implements akbk<ajxw> {
        e(jqx jqx) {
            super(0, jqx);
        }

        public final String getName() {
            return "onUserRequestVerifyCode";
        }

        public final akej getOwner() {
            return akde.a(jqx.class);
        }

        public final String getSignature() {
            return "onUserRequestVerifyCode()V";
        }

        public final /* synthetic */ Object invoke() {
            jqx jqx = (jqx) this.receiver;
            jqx.a(jrb.a(jqx.a(), false, false, null, 5));
            jun jun = (jun) jqx.k.get();
            Object u = ((ftl) jqx.j.get()).u(jic.PHONE_VERIFICATION_SMS_FORMAT);
            akcr.a(u, "configProvider.get().obs…_VERIFICATION_SMS_FORMAT)");
            jun.a(u, jqx.h);
            if (jqx.a().c.n == defpackage.juk.b.REQUEST_CODE && !jqx.a().c.h) {
                jqx.a(jrb.a(jqx.a(), false, false, jui.a(jqx.a().c), 3));
                ajej e = ((joq) jqx.d.get()).a(jqx.a().c.c, jqx.a().c.d).a((ajdw) jqx.c.l()).e((ajfb) new h(jqx));
                akcr.a((Object) e, "settingsTfaFlowManager.g…e(response = response) })");
                ajvv.a(e, jqx.b);
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

    public final PhonePickerView a() {
        PhonePickerView phonePickerView = this.c;
        if (phonePickerView == null) {
            akcr.a("phonePickerView");
        }
        return phonePickerView;
    }

    public final TextView b() {
        TextView textView = this.d;
        if (textView == null) {
            akcr.a("phoneError");
        }
        return textView;
    }

    public final TextView d() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("phoneFieldResponseText");
        }
        return textView;
    }

    public final EditText f() {
        EditText editText = this.f;
        if (editText == null) {
            akcr.a("verifyCodeView");
        }
        return editText;
    }

    public final View g() {
        View view = this.j;
        if (view == null) {
            akcr.a("verifyCodeCleaner");
        }
        return view;
    }

    public final TextView h() {
        TextView textView = this.k;
        if (textView == null) {
            akcr.a("verifyCodeError");
        }
        return textView;
    }

    public final SettingsPhoneButton i() {
        SettingsPhoneButton settingsPhoneButton = this.l;
        if (settingsPhoneButton == null) {
            akcr.a("continueButton");
        }
        return settingsPhoneButton;
    }

    public final jqx j() {
        jqx jqx = this.a;
        if (jqx == null) {
            akcr.a("handler");
        }
        return jqx;
    }

    /* Access modifiers changed, original: final */
    public final void k() {
        a().a = new b(this);
        f().addTextChangedListener(this.n);
        g().setOnClickListener(new jqw(this.o));
        i().setOnClickListener(new jqw(this.p));
    }

    /* Access modifiers changed, original: final */
    public final void l() {
        a().a = null;
        f().removeTextChangedListener(this.n);
        g().setOnClickListener(null);
        i().setOnClickListener(null);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        jqz jqz = this.b;
        if (jqz == null) {
            akcr.a("presenter");
        }
        jqz.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jqx jqx = this.a;
        String str = "handler";
        if (jqx == null) {
            akcr.a(str);
        }
        Activity activity = jqx.g;
        Object obj = jqx.f.get();
        akcr.a(obj, "permissionHelper.get()");
        ajej a = juo.a(activity, (ifs) obj, jqx.c, ifu.IN_APP_PHONE_NUMBER, false).a((ajdw) jqx.c.h()).h(defpackage.jqx.c.a).a((ajdw) jqx.c.l()).a((ajfb) new defpackage.jqx.d(jqx), (ajfb) new defpackage.jqx.e(jqx));
        akcr.a((Object) a, "TelephonyUtils.loadPhone…fill()\n                })");
        ajvv.a(a, jqx.b);
        a = jqx.i.c.a((ajdw) jqx.c.l()).f((ajfb) new defpackage.jqx.f(jqx));
        akcr.a((Object) a, "resendTimer.resendTimerS…      )\n                }");
        ajvv.a(a, jqx.b);
        jqz jqz = this.b;
        if (jqz == null) {
            akcr.a("presenter");
        }
        jqx jqx2 = this.a;
        if (jqx2 == null) {
            akcr.a(str);
        }
        jqz.a = new e(jqx2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_tfa_setup_sms_new_phone, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        jqx jqx = this.a;
        if (jqx == null) {
            akcr.a("handler");
        }
        jqx.i.b();
        jqx.b.dispose();
    }

    public final void onDetach() {
        super.onDetach();
        jqz jqz = this.b;
        if (jqz == null) {
            akcr.a("presenter");
        }
        jqz.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        l();
        jqx jqx = this.a;
        if (jqx == null) {
            akcr.a("handler");
        }
        ((jun) jqx.k.get()).a(jqx.h);
    }

    public final void onResume() {
        super.onResume();
        k();
        jqx jqx = this.a;
        if (jqx == null) {
            akcr.a("handler");
        }
        Object h = jqx.a.h((Object) jqx.a());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.m;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new f(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.phone_picker);
        akcr.a(findViewById, "view.findViewById(R.id.phone_picker)");
        PhonePickerView phonePickerView = (PhonePickerView) findViewById;
        String str = "<set-?>";
        akcr.b(phonePickerView, str);
        this.c = phonePickerView;
        findViewById = view.findViewById(R.id.phone_form_err_text);
        akcr.a(findViewById, "view.findViewById(R.id.phone_form_err_text)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.d = textView;
        findViewById = view.findViewById(R.id.phone_response_text);
        akcr.a(findViewById, "view.findViewById(R.id.phone_response_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        findViewById = view.findViewById(R.id.verify_code);
        akcr.a(findViewById, "view.findViewById(R.id.verify_code)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.f = editText;
        findViewById = view.findViewById(R.id.wrong_verify_code_cleaner);
        akcr.a(findViewById, "view.findViewById(R.id.wrong_verify_code_cleaner)");
        akcr.b(findViewById, str);
        this.j = findViewById;
        findViewById = view.findViewById(R.id.verify_code_err_text);
        akcr.a(findViewById, "view.findViewById(R.id.verify_code_err_text)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.k = textView;
        Object findViewById2 = view.findViewById(R.id.continue_button);
        akcr.a(findViewById2, "view.findViewById(R.id.continue_button)");
        SettingsPhoneButton settingsPhoneButton = (SettingsPhoneButton) findViewById2;
        akcr.b(settingsPhoneButton, str);
        this.l = settingsPhoneButton;
        o().get();
        this.m = zgb.a(iuc.m, "TfaSetupSmsNewPhoneFragment");
    }
}
