package com.snap.identity.ui.settings.forgotpassword;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achd;
import defpackage.ahcd;
import defpackage.ahfv;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.ifs;
import defpackage.iqe;
import defpackage.ira;
import defpackage.irc;
import defpackage.irs;
import defpackage.iua;
import defpackage.jic;
import defpackage.jnp;
import defpackage.jnq;
import defpackage.jnr;
import defpackage.jns;
import defpackage.jnt;
import defpackage.jrl;
import defpackage.jrm;
import defpackage.jrn;
import defpackage.jro;
import defpackage.jug;
import defpackage.jui;
import defpackage.juj;
import defpackage.juk;
import defpackage.jul;
import defpackage.jun;
import defpackage.juo;
import defpackage.s;
import defpackage.tnj;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;

public final class SettingsForgotPasswordPhonePresenter extends zll<jns> implements defpackage.k {
    final zjm a = new zjm(irc.t, this.i, false, false, true, false, null, false, false, false, false, null, 4076);
    final jug b = new jug();
    jrm c = jrn.a();
    final aipn<achb<zjm, zjk>> d;
    final aipn<ftl> e;
    final aipn<Context> f;
    final jui g;
    final aipn<jun> h;
    private final String i = "SettingsForgotPasswordPhonePresenter";
    private final zfw j = zgb.a(iua.c, this.i);
    private boolean k = true;
    private boolean l;
    private boolean m;
    private final q n = new q(this);
    private final akbl<View, ajxw> o = new b(this);
    private final akbl<View, ajxw> p = new c(this);
    private final aipn<gpb> q;
    private final aipn<ira> r;
    private final aipn<jnp> s;
    private final aipn<tnj> t;
    private final aipn<iqe> u;
    private final Activity v;
    private final aipn<ifs> w;

    public static final class q implements TextWatcher {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        q(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SettingsForgotPasswordPhonePresenter.a(this.a, String.valueOf(charSequence));
        }
    }

    static final class d<T> implements ajfb<String> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        d(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            if (!this.a.c.h) {
                String str2 = this.a.c.e;
                akcr.a((Object) str, "verifyCode");
                if (juo.c(str2, str)) {
                    SettingsForgotPasswordPhonePresenter.a(this.a, str);
                    this.a.a();
                }
            }
        }
    }

    static final class e<T> implements ajfb<irs> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        e(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            irs irs = (irs) obj;
            akcr.b(irs, "autofillState");
            this.a.a(irs.a, irs.b, irs.c);
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        f(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = "";
            this.a.a(str, str, juk.c);
        }
    }

    static final class g<T> implements ajfb<jul> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        g(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jul jul = (jul) obj;
            SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter = this.a;
            jrm jrm = settingsForgotPasswordPhonePresenter.c;
            akcr.a((Object) jul, "resendTimerState");
            settingsForgotPasswordPhonePresenter.c = jui.a(jrm, jul);
            this.a.b();
        }
    }

    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class i<T> implements ajfb<Boolean> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class j<T> implements ajfb<Throwable> {
        public static final j a = new j();

        j() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class k<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        k(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter = this.a;
            ahcd ahcd = (ahcd) bVar.b;
            Object obj2 = ahcd.b;
            akcr.a(obj2, "response.logged");
            String str;
            if (obj2.booleanValue()) {
                jui jui = settingsForgotPasswordPhonePresenter.g;
                jrm jrm = settingsForgotPasswordPhonePresenter.c;
                str = ahcd.a;
                akcr.a((Object) str, "response.message");
                settingsForgotPasswordPhonePresenter.c = jui.a(jrm, str);
                settingsForgotPasswordPhonePresenter.b.a();
                settingsForgotPasswordPhonePresenter.b();
                return;
            }
            str = ahcd.a;
            if (str == null) {
                str = ((Context) settingsForgotPasswordPhonePresenter.f.get()).getString(R.string.problem_connecting);
                akcr.a((Object) str, "context.get().getString(…tring.problem_connecting)");
            }
            settingsForgotPasswordPhonePresenter.a(str);
        }
    }

    static final class l<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        l(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter = this.a;
            String string = ((Context) settingsForgotPasswordPhonePresenter.f.get()).getString(R.string.problem_connecting);
            akcr.a((Object) string, "context.get().getString(…tring.problem_connecting)");
            settingsForgotPasswordPhonePresenter.a(string);
        }
    }

    static final class o<T> implements ajfb<defpackage.ira.b<ahfv>> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        o(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsForgotPasswordPhonePresenter.a(this.a, (ahfv) ((defpackage.ira.b) obj).b);
        }
    }

    static final class p<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        p(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsForgotPasswordPhonePresenter.a(this.a, null);
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        b(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            SettingsForgotPasswordPhonePresenter.a(this.a, "");
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        c(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter = this.a;
            if (settingsForgotPasswordPhonePresenter.c.n == defpackage.juk.b.REQUEST_CODE) {
                jrl.a((Context) settingsForgotPasswordPhonePresenter.f.get());
                Object obj2 = settingsForgotPasswordPhonePresenter.f.get();
                akcr.a(obj2, "context.get()");
                Context context = (Context) obj2;
                obj2 = settingsForgotPasswordPhonePresenter.d.get();
                akcr.a(obj2, "navigationHost.get()");
                defpackage.zgy.a aVar = new defpackage.zgy.a(context, (achb) obj2, settingsForgotPasswordPhonePresenter.a, false, null, 24);
                String string = ((Context) settingsForgotPasswordPhonePresenter.f.get()).getString(R.string.phone_verification_alert_dialog_verification_body, new Object[]{settingsForgotPasswordPhonePresenter.c.c});
                akcr.a((Object) string, "context.get().getString(…ssState.inputPhoneNumber)");
                zgy a = defpackage.zgy.a.a(aVar.b(string).a((int) R.string.confirm_phone_number_text, (akbl) new m(settingsForgotPasswordPhonePresenter), true).a((int) R.string.confirm_phone_number_call, (akbl) new n(settingsForgotPasswordPhonePresenter), true), null, false, null, null, null, 31).a();
                ((achb) settingsForgotPasswordPhonePresenter.d.get()).a((achd) a, a.a, null);
            } else {
                settingsForgotPasswordPhonePresenter.a();
            }
            return ajxw.a;
        }
    }

    static final class m extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        m(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            jun jun = (jun) this.a.h.get();
            Object u = ((ftl) this.a.e.get()).u(jic.PHONE_VERIFICATION_SMS_FORMAT);
            akcr.a(u, "configProvider.get().obs…_VERIFICATION_SMS_FORMAT)");
            Object obj2 = this.a.f.get();
            akcr.a(obj2, "context.get()");
            jun.a(u, (Context) obj2);
            SettingsForgotPasswordPhonePresenter.a(this.a, defpackage.ahcb.b.TEXT);
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsForgotPasswordPhonePresenter a;

        n(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            this.a = settingsForgotPasswordPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SettingsForgotPasswordPhonePresenter.a(this.a, defpackage.ahcb.b.CALL);
            return ajxw.a;
        }
    }

    static final class a extends akcq implements akbw<String, String, ajxw> {
        a(SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter) {
            super(2, settingsForgotPasswordPhonePresenter);
        }

        public final String getName() {
            return "onPhonePickerData";
        }

        public final akej getOwner() {
            return akde.a(SettingsForgotPasswordPhonePresenter.class);
        }

        public final String getSignature() {
            return "onPhonePickerData(Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            akcr.b(str, "p1");
            akcr.b(str2, "p2");
            SettingsForgotPasswordPhonePresenter settingsForgotPasswordPhonePresenter = (SettingsForgotPasswordPhonePresenter) this.receiver;
            settingsForgotPasswordPhonePresenter.c = jui.a(settingsForgotPasswordPhonePresenter.c, str2, str);
            settingsForgotPasswordPhonePresenter.b();
            return ajxw.a;
        }
    }

    public SettingsForgotPasswordPhonePresenter(aipn<gpb> aipn, aipn<achb<zjm, zjk>> aipn2, aipn<ira> aipn3, aipn<jnp> aipn4, aipn<ftl> aipn5, aipn<tnj> aipn6, aipn<iqe> aipn7, aipn<Context> aipn8, Activity activity, aipn<ifs> aipn9, jui jui, aipn<jun> aipn10, zgb zgb) {
        aipn<gpb> aipn11 = aipn;
        aipn<achb<zjm, zjk>> aipn12 = aipn2;
        aipn<ira> aipn13 = aipn3;
        aipn<jnp> aipn14 = aipn4;
        aipn<ftl> aipn15 = aipn5;
        aipn<tnj> aipn16 = aipn6;
        aipn<iqe> aipn17 = aipn7;
        aipn<Context> aipn18 = aipn8;
        Activity activity2 = activity;
        aipn<ifs> aipn19 = aipn9;
        jui jui2 = jui;
        aipn<jun> aipn20 = aipn10;
        akcr.b(aipn11, "userAuthStore");
        akcr.b(aipn12, "navigationHost");
        akcr.b(aipn13, "identityApi");
        akcr.b(aipn14, "settingsForgotPasswordHelper");
        akcr.b(aipn15, "configProvider");
        akcr.b(aipn16, "prefs");
        akcr.b(aipn17, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn18, "context");
        akcr.b(activity2, Event.ACTIVITY);
        akcr.b(aipn19, "permissionHelper");
        akcr.b(jui2, "reducers");
        akcr.b(aipn20, "smsAutofillRetrieverRegistry");
        akcr.b(zgb, "schedulersProvider");
        this.q = aipn11;
        this.d = aipn12;
        this.r = aipn13;
        this.s = aipn14;
        this.e = aipn15;
        this.t = aipn16;
        this.u = aipn17;
        this.f = aipn18;
        this.v = activity2;
        this.w = aipn19;
        this.g = jui2;
        this.h = aipn20;
    }

    private final void c() {
        jns jns = (jns) getTarget();
        if (jns != null) {
            jns.a().a = new a(this);
            jns.f().addTextChangedListener(this.n);
            jns.g().setOnClickListener(new jnr(this.o));
            jns.i().setOnClickListener(new jnr(this.p));
        }
    }

    private final void d() {
        jns jns = (jns) getTarget();
        if (jns != null) {
            jns.a().a = null;
            jns.f().removeTextChangedListener(this.n);
            jns.g().setOnClickListener(null);
            jns.i().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.c.n != defpackage.juk.b.VERIFY || this.c.h) {
            b();
            return;
        }
        zln.bindTo$default(this, ((ira) this.r.get()).a(this.c.g, defpackage.ahft.a.IN_APP_FORGOT_PASSWORD_TYPE).a((ajdw) this.j.l()).a((ajfb) new o(this), (ajfb) new p(this)), this, null, null, 6, null);
        this.c = jui.b(this.c);
        b();
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        this.c = this.g.b(this.c, str);
        b();
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2, String str3) {
        boolean z = true;
        this.l = true;
        if (str.length() != 0) {
            z = false;
        }
        this.c = jui.a(str, str3, str2, z, 16);
        zln.bindTo$default(this, ((jun) this.h.get()).a().a((ajdw) this.j.l()).e((ajfb) new d(this)), this, null, null, 6, null);
        b();
    }

    /* renamed from: a */
    public final void takeTarget(jns jns) {
        akcr.b(jns, "target");
        super.takeTarget(jns);
        jns.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.k && this.l) {
            Object obj = (jns) getTarget();
            if (obj != null) {
                com.snap.identity.ui.settings.shared.SettingsPhoneButton.a aVar;
                akcr.a(obj, "target ?: return");
                d();
                jro a = juj.a(this.c);
                if ((akcr.a(obj.a().b, a.h) ^ 1) != 0) {
                    obj.a().a(a.h);
                }
                if (obj.a().isEnabled() != a.d) {
                    obj.a().setEnabled(a.d);
                }
                if ((akcr.a(obj.a().c, a.i) ^ 1) != 0) {
                    obj.a().b(a.i);
                }
                int i = 8;
                if ((akcr.a(obj.b().getText().toString(), a.f) ^ 1) != 0) {
                    obj.b().setText(a.f);
                    obj.b().setVisibility((((CharSequence) a.f).length() > 0 ? 1 : null) != null ? 0 : 8);
                }
                if ((akcr.a(obj.d().getText().toString(), a.e) ^ 1) != 0) {
                    obj.d().setText(a.e);
                    obj.d().setVisibility((((CharSequence) a.e).length() > 0 ? 1 : null) != null ? 0 : 8);
                }
                int i2 = a.c ? 8 : 0;
                if (obj.f().getVisibility() != i2) {
                    obj.f().setVisibility(i2);
                }
                if ((akcr.a(obj.f().getText().toString(), a.j) ^ 1) != 0) {
                    obj.f().setText(a.j);
                }
                i2 = a.k ? 0 : 4;
                if (obj.g().getVisibility() != i2) {
                    obj.g().setVisibility(i2);
                }
                if ((akcr.a(obj.h().getText().toString(), a.g) ^ 1) != 0) {
                    obj.h().setText(a.g);
                    TextView h = obj.h();
                    if ((((CharSequence) a.g).length() > 0 ? 1 : null) != null) {
                        i = 0;
                    }
                    h.setVisibility(i);
                }
                switch (jnq.a[a.b.ordinal()]) {
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
                Integer currentState = obj.i().getCurrentState();
                int i3 = aVar.a;
                if (currentState == null || currentState.intValue() != i3 || aVar.a == 4) {
                    obj.i().a(aVar);
                }
                c();
            }
        }
    }

    public final void dropTarget() {
        super.dropTarget();
        jns jns = (jns) getTarget();
        if (jns != null) {
            defpackage.j lifecycle = jns.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        Activity activity = this.v;
        Object obj = this.q.get();
        akcr.a(obj, "userAuthStore.get()");
        gpb gpb = (gpb) obj;
        Object obj2 = this.e.get();
        akcr.a(obj2, "configProvider.get()");
        ftl ftl = (ftl) obj2;
        Object obj3 = this.w.get();
        akcr.a(obj3, "permissionHelper.get()");
        juo.a(activity, gpb, ftl, (ifs) obj3, this.j, false, null, 96).a((ajdw) this.j.l()).a((ajfb) new e(this), (ajfb) new f(this));
        zln.bindTo$default(this, this.b.c.a((ajdw) this.j.l()).a((ajfb) new g(this), (ajfb) h.a), this, null, null, 6, null);
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.b.b();
        ((jnp) this.s.get()).a.a(new jnt(this.m));
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.k = true;
        d();
        jun jun = (jun) this.h.get();
        Object obj = this.f.get();
        akcr.a(obj, "context.get()");
        jun.a((Context) obj);
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.k = false;
        b();
    }
}
