package com.snap.identity.loginsignup.ui.pages.odlv;

import android.content.Context;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aatg;
import defpackage.aath;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.ahro;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akgb;
import defpackage.ira;
import defpackage.isf;
import defpackage.ish;
import defpackage.jan;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jgb;
import defpackage.jgc;
import defpackage.jgd;
import defpackage.jge;
import defpackage.jgf;
import defpackage.jgl;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class LoginOdlvLandingPresenter extends zll<jge> implements k {
    jgl a = jgl.PHONE_TOTP;
    final zfw b = zgb.a(jbv.y.callsite("LoginSignup.LoginOdlvLandingPresenter"));
    final ajxe c = ajxh.a(new h(this));
    final ajxe d = ajxh.a(new c(this));
    final aipn<jbk> e;
    final aipn<jbw> f;
    final aipn<ira> g;
    final aipn<Context> h;
    final aipn<zke> i;
    aipn<achb<zjm, zjk>> j;
    final aipn<isf> k;
    private boolean l = true;
    private boolean m;
    private boolean n;
    private final ajxe o = ajxh.a(new e(this));
    private final ajxe p = ajxh.a(new d(this));
    private final akbl<View, ajxw> q = new a(this);
    private final OnCheckedChangeListener r = new i(this);

    static final class i implements OnCheckedChangeListener {
        private /* synthetic */ LoginOdlvLandingPresenter a;

        i(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            this.a = loginOdlvLandingPresenter;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            jgl jgl;
            LoginOdlvLandingPresenter loginOdlvLandingPresenter = this.a;
            if (i == R.id.odlv_landing_radio_option_button_phone) {
                jgl = jgl.PHONE_TOTP;
            } else {
                if (i == R.id.odlv_landing_radio_option_button_email) {
                    jgl = jgl.EMAIL_TOTP;
                }
                loginOdlvLandingPresenter.a();
            }
            loginOdlvLandingPresenter.a = jgl;
            loginOdlvLandingPresenter.a();
        }
    }

    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginOdlvLandingPresenter a;

        a(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            this.a = loginOdlvLandingPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            isf isf;
            aaoo aaoo;
            akcr.b((View) obj, "<anonymous parameter 0>");
            LoginOdlvLandingPresenter loginOdlvLandingPresenter = this.a;
            loginOdlvLandingPresenter.a(true);
            ((jbk) loginOdlvLandingPresenter.e.get()).a(jgf.a(loginOdlvLandingPresenter.a));
            if (loginOdlvLandingPresenter.a == jgl.PHONE_TOTP) {
                isf = (isf) loginOdlvLandingPresenter.k.get();
                aaoo = aaoo.ODLV_SMS_REQUEST_SUBMIT;
            } else {
                isf = (isf) loginOdlvLandingPresenter.k.get();
                aaoo = aaoo.ODLV_EMAIL_REQUEST_SUBMIT;
            }
            isf.a(aaoo, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
            LoginOdlvLandingPresenter loginOdlvLandingPresenter2 = loginOdlvLandingPresenter;
            zln.bindTo$default(loginOdlvLandingPresenter, ((ira) loginOdlvLandingPresenter.g.get()).b(loginOdlvLandingPresenter.a.otpRequestType.name(), (String) loginOdlvLandingPresenter.d.b(), (String) loginOdlvLandingPresenter.c.b()).a((ajdw) loginOdlvLandingPresenter.b.l()).a((ajfb) new jgd(new f(loginOdlvLandingPresenter2)), (ajfb) new jgd(new g(loginOdlvLandingPresenter2))), loginOdlvLandingPresenter, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginOdlvLandingPresenter a;

        b(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            this.a = loginOdlvLandingPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((achb) this.a.j.get()).a((achg) jbv.c, false, true, null);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ LoginOdlvLandingPresenter a;

        c(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            this.a = loginOdlvLandingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jbw) this.a.f.get()).c().a;
        }
    }

    static final class d extends akcs implements akbk<String> {
        private /* synthetic */ LoginOdlvLandingPresenter a;

        d(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            this.a = loginOdlvLandingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jbw) this.a.f.get()).c().m;
        }
    }

    static final class e extends akcs implements akbk<String> {
        private /* synthetic */ LoginOdlvLandingPresenter a;

        e(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            this.a = loginOdlvLandingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jbw) this.a.f.get()).c().l;
        }
    }

    static final class h extends akcs implements akbk<String> {
        private /* synthetic */ LoginOdlvLandingPresenter a;

        h(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            this.a = loginOdlvLandingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jbw) this.a.f.get()).c().d;
        }
    }

    static final class f extends akcq implements akbl<ahro, ajxw> {
        f(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            super(1, loginOdlvLandingPresenter);
        }

        public final String getName() {
            return "onOtpRequestResponse";
        }

        public final akej getOwner() {
            return akde.a(LoginOdlvLandingPresenter.class);
        }

        public final String getSignature() {
            return "onOtpRequestResponse(Lcom/snapchat/soju/android/security/OdlvRequestOtpResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ahro ahro = (ahro) obj;
            akcr.b(ahro, "p1");
            LoginOdlvLandingPresenter loginOdlvLandingPresenter = (LoginOdlvLandingPresenter) this.receiver;
            loginOdlvLandingPresenter.a(false);
            if (ahro.a == null || akcr.a(ahro.a, defpackage.ahro.a.SUCCESS.name())) {
                isf isf;
                aaoo aaoo;
                ((jbk) loginOdlvLandingPresenter.e.get()).a(aatg.REQUEST_OTP, jgf.a(loginOdlvLandingPresenter.a));
                if (loginOdlvLandingPresenter.a == jgl.PHONE_TOTP) {
                    isf = (isf) loginOdlvLandingPresenter.k.get();
                    aaoo = aaoo.ODLV_SMS_REQUEST_SUCCEED;
                } else {
                    isf = (isf) loginOdlvLandingPresenter.k.get();
                    aaoo = aaoo.ODLV_EMAIL_REQUEST_SUCCEED;
                }
                isf.a(aaoo, aaop.INTERNAL_PROCESS, ish.LOGIN);
                ((zke) loginOdlvLandingPresenter.i.get()).a(new jan(loginOdlvLandingPresenter.a));
            } else {
                ((jbk) loginOdlvLandingPresenter.e.get()).b(aatg.REQUEST_OTP, jgf.a(loginOdlvLandingPresenter.a));
                loginOdlvLandingPresenter.a(ahro.b);
            }
            return ajxw.a;
        }
    }

    static final class g extends akcq implements akbl<Throwable, ajxw> {
        g(LoginOdlvLandingPresenter loginOdlvLandingPresenter) {
            super(1, loginOdlvLandingPresenter);
        }

        public final String getName() {
            return "onOtpRequestFailure";
        }

        public final akej getOwner() {
            return akde.a(LoginOdlvLandingPresenter.class);
        }

        public final String getSignature() {
            return "onOtpRequestFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            LoginOdlvLandingPresenter loginOdlvLandingPresenter = (LoginOdlvLandingPresenter) this.receiver;
            loginOdlvLandingPresenter.a(false);
            ((jbk) loginOdlvLandingPresenter.e.get()).b(aatg.REQUEST_OTP, jgf.a(loginOdlvLandingPresenter.a));
            loginOdlvLandingPresenter.a(null);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(LoginOdlvLandingPresenter.class), "preAuthToken", "getPreAuthToken()Ljava/lang/String;"), new akdc(akde.a(LoginOdlvLandingPresenter.class), "loginUsername", "getLoginUsername()Ljava/lang/String;"), new akdc(akde.a(LoginOdlvLandingPresenter.class), "obfuscatedPhone", "getObfuscatedPhone()Ljava/lang/String;"), new akdc(akde.a(LoginOdlvLandingPresenter.class), "obfuscatedEmail", "getObfuscatedEmail()Ljava/lang/String;")};
    }

    public LoginOdlvLandingPresenter(aipn<jbk> aipn, aipn<jbw> aipn2, aipn<ira> aipn3, aipn<Context> aipn4, aipn<zke> aipn5, aipn<achb<zjm, zjk>> aipn6, aipn<isf> aipn7, zgb zgb) {
        akcr.b(aipn, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn2, "store");
        akcr.b(aipn3, "identityApi");
        akcr.b(aipn4, "context");
        akcr.b(aipn5, "eventDispatcher");
        akcr.b(aipn6, "navigationHost");
        akcr.b(aipn7, "stateTransitionService");
        akcr.b(zgb, "schedulersProvider");
        this.e = aipn;
        this.f = aipn2;
        this.g = aipn3;
        this.h = aipn4;
        this.i = aipn5;
        this.j = aipn6;
        this.k = aipn7;
    }

    private final String b() {
        return (String) this.o.b();
    }

    private final String c() {
        return (String) this.p.b();
    }

    private final void d() {
        if (!this.m) {
            Object obj = (jge) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                int i = 0;
                int i2 = (akgb.a((CharSequence) b()) ^ 1) != 0 ? 0 : 8;
                obj.d().setText(b());
                obj.f().setVisibility(i2);
                obj.c().setVisibility(i2);
                obj.d().setVisibility(i2);
                if ((akgb.a(c()) ^ 1) == 0) {
                    i = 8;
                }
                obj.h().setText(c());
                obj.g().setVisibility(i);
                obj.h().setVisibility(i);
                this.m = true;
            }
        }
    }

    private final void e() {
        jge jge = (jge) getTarget();
        if (jge != null) {
            jge.k().setOnClickListener(null);
            jge.a().setOnCheckedChangeListener(null);
        }
    }

    private final void f() {
        jge jge = (jge) getTarget();
        if (jge != null) {
            jge.k().setOnClickListener(new jgc(this.q));
            jge.a().setOnCheckedChangeListener(this.r);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.l) {
            Object obj = (jge) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                e();
                d();
                int i = 1;
                int i2 = 0;
                boolean z = this.a == jgl.PHONE_TOTP;
                if (obj.d().isChecked() != z) {
                    obj.d().setChecked(z);
                }
                boolean z2 = this.a == jgl.EMAIL_TOTP;
                if (obj.h().isChecked() != z2) {
                    obj.h().setChecked(z2);
                }
                TextView b = obj.b();
                if (!z) {
                    i2 = 4;
                }
                b.setVisibility(i2);
                ProgressButton k = obj.k();
                if (this.n) {
                    i = 2;
                }
                k.setState(i);
                f();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        if (str == null) {
            str = ((Context) this.h.get()).getString(R.string.default_error_try_again_later);
            akcr.a((Object) str, "context.get().getString(…lt_error_try_again_later)");
        }
        Object obj = this.h.get();
        akcr.a(obj, "context.get()");
        Context context = (Context) obj;
        obj = this.j.get();
        akcr.a(obj, "navigationHost.get()");
        zgy a = new defpackage.zgy.a(context, (achb) obj, jgb.a, false, null, 24).b(str).a((int) R.string.signup_ok_button, (akbl) new b(this), false).a();
        ((achb) this.j.get()).a((achd) a, a.a, null);
    }

    /* renamed from: a */
    public final void takeTarget(jge jge) {
        akcr.b(jge, "target");
        super.takeTarget(jge);
        jge.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.n = z;
        a();
    }

    public final void dropTarget() {
        Object obj = (jge) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onTargetCreate() {
        this.a = (akgb.a((CharSequence) b()) ^ 1) != 0 ? jgl.PHONE_TOTP : jgl.EMAIL_TOTP;
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        this.l = true;
        e();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        ((jbk) this.e.get()).a(aath.LANDING);
        this.l = false;
        a();
    }
}
