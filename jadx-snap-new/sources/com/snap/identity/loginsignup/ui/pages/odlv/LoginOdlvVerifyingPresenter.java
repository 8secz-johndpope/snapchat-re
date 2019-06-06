package com.snap.identity.loginsignup.ui.pages.odlv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.View;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aatg;
import defpackage.aath;
import defpackage.aatk;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.aert;
import defpackage.ahro;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajdx;
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
import defpackage.akgc;
import defpackage.akqy;
import defpackage.akrb;
import defpackage.akrz;
import defpackage.iqj;
import defpackage.iql;
import defpackage.ira;
import defpackage.irg;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.jam;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jgf;
import defpackage.jgg;
import defpackage.jgh;
import defpackage.jgi;
import defpackage.jgj;
import defpackage.jgk;
import defpackage.jgl;
import defpackage.jrk;
import defpackage.jrl;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import defpackage.zzx;
import java.lang.ref.WeakReference;

public final class LoginOdlvVerifyingPresenter extends zll<jgk> implements defpackage.k {
    String a;
    String b;
    boolean c = true;
    boolean d;
    CountDownTimer e = new a(new WeakReference(this));
    akqy f;
    final zfw g;
    final aipn<jbk> h;
    final aipn<iqj> i;
    final aipn<jbw> j;
    final aipn<ira> k;
    final Context l;
    final aipn<zke> m;
    aipn<achb<zjm, zjk>> n;
    final aipn<isf> o;
    final aipn<jrk> p;
    private boolean q;
    private boolean r = true;
    private boolean s;
    private final ajxe t;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w;
    private final b x;
    private final akbl<View, ajxw> y;
    private final akbl<View, ajxw> z;

    static final class a extends CountDownTimer {
        private final WeakReference<LoginOdlvVerifyingPresenter> a;

        public a(WeakReference<LoginOdlvVerifyingPresenter> weakReference) {
            akcr.b(weakReference, "presenter");
            super(60000, 1000);
            this.a = weakReference;
        }

        public final void onFinish() {
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = (LoginOdlvVerifyingPresenter) this.a.get();
            if (loginOdlvVerifyingPresenter != null) {
                loginOdlvVerifyingPresenter.d();
            } else {
                cancel();
            }
        }

        public final void onTick(long j) {
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = (LoginOdlvVerifyingPresenter) this.a.get();
            if (loginOdlvVerifyingPresenter != null) {
                if (loginOdlvVerifyingPresenter.f.d(akrb.a())) {
                    cancel();
                }
                loginOdlvVerifyingPresenter.d();
                return;
            }
            cancel();
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        b(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = this.a;
            loginOdlvVerifyingPresenter.a = String.valueOf(charSequence);
            loginOdlvVerifyingPresenter.b = "";
            loginOdlvVerifyingPresenter.c = true;
            loginOdlvVerifyingPresenter.d();
        }
    }

    public static final class k extends ClickableSpan {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        k(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
        }

        public final void onClick(View view) {
            akcr.b(view, "textView");
            if (this.a.l instanceof Activity) {
                Context context = this.a.l;
                this.a.p.get();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.snapchat.com")));
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            akcr.b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        c(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ajdx a;
            ajfb jgj;
            jgj jgj2;
            akcr.b((View) obj, "<anonymous parameter 0>");
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = this.a;
            boolean z = true;
            loginOdlvVerifyingPresenter.a(true);
            if (loginOdlvVerifyingPresenter.a.length() != 0) {
                z = false;
            }
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter2;
            if (z) {
                isf isf;
                aaoo aaoo;
                ((jbk) loginOdlvVerifyingPresenter.h.get()).a(jgf.a(loginOdlvVerifyingPresenter.a()));
                if (loginOdlvVerifyingPresenter.a() == jgl.PHONE_TOTP) {
                    isf = (isf) loginOdlvVerifyingPresenter.o.get();
                    aaoo = aaoo.ODLV_SMS_REQUEST_SUBMIT;
                } else {
                    isf = (isf) loginOdlvVerifyingPresenter.o.get();
                    aaoo = aaoo.ODLV_EMAIL_REQUEST_SUBMIT;
                }
                isf.a(aaoo, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
                a = ((ira) loginOdlvVerifyingPresenter.k.get()).b(loginOdlvVerifyingPresenter.a().otpRequestType.name(), loginOdlvVerifyingPresenter.c(), loginOdlvVerifyingPresenter.b()).a((ajdw) loginOdlvVerifyingPresenter.g.l());
                loginOdlvVerifyingPresenter2 = loginOdlvVerifyingPresenter;
                jgj = new jgj(new g(loginOdlvVerifyingPresenter2));
                jgj2 = new jgj(new h(loginOdlvVerifyingPresenter2));
            } else {
                ((isf) loginOdlvVerifyingPresenter.o.get()).a(aaoo.ODLV_LOGIN_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
                a = ((iqj) loginOdlvVerifyingPresenter.i.get()).a(loginOdlvVerifyingPresenter.a().loginRequestType.name(), loginOdlvVerifyingPresenter.c(), loginOdlvVerifyingPresenter.a, loginOdlvVerifyingPresenter.b()).a((ajdw) loginOdlvVerifyingPresenter.g.l());
                loginOdlvVerifyingPresenter2 = loginOdlvVerifyingPresenter;
                jgj = new jgj(new i(loginOdlvVerifyingPresenter2));
                jgj2 = new jgj(new j(loginOdlvVerifyingPresenter2));
            }
            zln.bindTo$default(loginOdlvVerifyingPresenter, a.a(jgj, (ajfb) jgj2), loginOdlvVerifyingPresenter, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbk<String> {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        d(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jbw) this.a.j.get()).c().a;
        }
    }

    static final class e extends akcs implements akbk<String> {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        e(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i = jgg.a[this.a.a().ordinal()];
            return i != 1 ? i != 2 ? "" : ((jbw) this.a.j.get()).c().m : ((jbw) this.a.j.get()).c().l;
        }
    }

    static final class f extends akcs implements akbk<jgl> {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        f(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jbw) this.a.j.get()).d();
        }
    }

    static final class l extends akcs implements akbk<String> {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        l(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jbw) this.a.j.get()).c().d;
        }
    }

    static final class m extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;
        private /* synthetic */ zjm b;

        m(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter, zjm zjm) {
            this.a = loginOdlvVerifyingPresenter;
            this.b = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((achb) this.a.n.get()).a((achg) this.b, false, false, null);
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginOdlvVerifyingPresenter a;

        n(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            this.a = loginOdlvVerifyingPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = this.a;
            jbk jbk = (jbk) loginOdlvVerifyingPresenter.h.get();
            aatk a = jgf.a(loginOdlvVerifyingPresenter.a());
            akcr.b(a, "otpType");
            zzx zzx = new zzx();
            zzx.a(a);
            zzx.a(jbk.b().c().b);
            zzx.b(((isc) jbk.g.get()).a());
            jbk.a().a(zzx);
            k kVar = new k(loginOdlvVerifyingPresenter);
            String string = loginOdlvVerifyingPresenter.l.getString(R.string.odlv_verification_support_url_label);
            Context context = loginOdlvVerifyingPresenter.l;
            Object[] objArr = new Object[1];
            String str = "{*-1-*}";
            objArr[0] = str;
            Object string2 = context.getString(R.string.odlv_verification_unable_to_verify_dialogue, objArr);
            akcr.a(string2, "context.getString(R.stri…o_verify_dialogue, token)");
            int a2 = akgc.a((CharSequence) string2, str, 0, false, 6);
            SpannableString spannableString = new SpannableString(loginOdlvVerifyingPresenter.l.getString(R.string.odlv_verification_unable_to_verify_dialogue, new Object[]{string}));
            spannableString.setSpan(kVar, a2, string.length() + a2, 33);
            LoginOdlvVerifyingPresenter.a(loginOdlvVerifyingPresenter, spannableString, null, 2);
            return ajxw.a;
        }
    }

    static final class g extends akcq implements akbl<ahro, ajxw> {
        g(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            super(1, loginOdlvVerifyingPresenter);
        }

        public final String getName() {
            return "onOtpResendResponse";
        }

        public final akej getOwner() {
            return akde.a(LoginOdlvVerifyingPresenter.class);
        }

        public final String getSignature() {
            return "onOtpResendResponse(Lcom/snapchat/soju/android/security/OdlvRequestOtpResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ahro ahro = (ahro) obj;
            akcr.b(ahro, "p1");
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = (LoginOdlvVerifyingPresenter) this.receiver;
            loginOdlvVerifyingPresenter.a(false);
            if (ahro.a == null || akcr.a(ahro.a, defpackage.ahro.a.SUCCESS.name())) {
                isf isf;
                aaoo aaoo;
                loginOdlvVerifyingPresenter.e = new a(new WeakReference(loginOdlvVerifyingPresenter));
                obj = new akqy().b(60000);
                akcr.a(obj, "DateTime.now().plusMillis(ONE_MINUTE_MS.toInt())");
                loginOdlvVerifyingPresenter.f = obj;
                loginOdlvVerifyingPresenter.e.start();
                ((jbk) loginOdlvVerifyingPresenter.h.get()).a(aatg.REQUEST_OTP, jgf.a(loginOdlvVerifyingPresenter.a()));
                if (loginOdlvVerifyingPresenter.a() == jgl.PHONE_TOTP) {
                    isf = (isf) loginOdlvVerifyingPresenter.o.get();
                    aaoo = aaoo.ODLV_SMS_REQUEST_SUCCEED;
                } else {
                    isf = (isf) loginOdlvVerifyingPresenter.o.get();
                    aaoo = aaoo.ODLV_EMAIL_REQUEST_SUCCEED;
                }
                isf.a(aaoo, aaop.INTERNAL_PROCESS, ish.LOGIN);
            } else {
                ((jbk) loginOdlvVerifyingPresenter.h.get()).b(aatg.REQUEST_OTP, jgf.a(loginOdlvVerifyingPresenter.a()));
                loginOdlvVerifyingPresenter.a(ahro.b, jbv.c);
            }
            return ajxw.a;
        }
    }

    static final class h extends akcq implements akbl<Throwable, ajxw> {
        h(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            super(1, loginOdlvVerifyingPresenter);
        }

        public final String getName() {
            return "onOtpResendFailure";
        }

        public final akej getOwner() {
            return akde.a(LoginOdlvVerifyingPresenter.class);
        }

        public final String getSignature() {
            return "onOtpResendFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = (LoginOdlvVerifyingPresenter) this.receiver;
            loginOdlvVerifyingPresenter.a(false);
            ((jbk) loginOdlvVerifyingPresenter.h.get()).b(aatg.REQUEST_OTP, jgf.a(loginOdlvVerifyingPresenter.a()));
            LoginOdlvVerifyingPresenter.a(loginOdlvVerifyingPresenter, null, jbv.c, 1);
            return ajxw.a;
        }
    }

    static final class i extends akcq implements akbl<iql, ajxw> {
        i(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            super(1, loginOdlvVerifyingPresenter);
        }

        public final String getName() {
            return "onOtpVerificationSuccess";
        }

        public final akej getOwner() {
            return akde.a(LoginOdlvVerifyingPresenter.class);
        }

        public final String getSignature() {
            return "onOtpVerificationSuccess(Lcom/snap/identity/api/AuthResult;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((iql) obj, "p1");
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = (LoginOdlvVerifyingPresenter) this.receiver;
            loginOdlvVerifyingPresenter.a(false);
            ((jbk) loginOdlvVerifyingPresenter.h.get()).a(aatg.VERIFY_OTP, jgf.a(loginOdlvVerifyingPresenter.a()));
            ((zke) loginOdlvVerifyingPresenter.m.get()).a(new jam());
            return ajxw.a;
        }
    }

    static final class j extends akcq implements akbl<Throwable, ajxw> {
        j(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter) {
            super(1, loginOdlvVerifyingPresenter);
        }

        public final String getName() {
            return "onOtpVerificationFailure";
        }

        public final akej getOwner() {
            return akde.a(LoginOdlvVerifyingPresenter.class);
        }

        public final String getSignature() {
            return "onOtpVerificationFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter = (LoginOdlvVerifyingPresenter) this.receiver;
            loginOdlvVerifyingPresenter.a(false);
            ((jbk) loginOdlvVerifyingPresenter.h.get()).b(aatg.VERIFY_OTP, jgf.a(loginOdlvVerifyingPresenter.a()));
            String string = loginOdlvVerifyingPresenter.l.getString(R.string.default_error_try_again_later);
            akcr.a((Object) string, "context.getString(R.stri…lt_error_try_again_later)");
            if (th instanceof irg) {
                aert aert = ((irg) th).a;
                if (aert != null) {
                    Integer num = aert.s;
                    if (num != null && num.intValue() == -104) {
                        loginOdlvVerifyingPresenter.a(aert.r, jbv.c);
                        return ajxw.a;
                    }
                    string = aert.r;
                    akcr.a((Object) string, "loginResponse.message");
                }
            }
            loginOdlvVerifyingPresenter.c = false;
            loginOdlvVerifyingPresenter.b = string;
            loginOdlvVerifyingPresenter.d();
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(LoginOdlvVerifyingPresenter.class), "odlvOtpType", "getOdlvOtpType()Lcom/snap/identity/loginsignup/ui/pages/odlv/OdlvOtpType;"), new akdc(akde.a(LoginOdlvVerifyingPresenter.class), "preAuthToken", "getPreAuthToken()Ljava/lang/String;"), new akdc(akde.a(LoginOdlvVerifyingPresenter.class), "loginUsername", "getLoginUsername()Ljava/lang/String;"), new akdc(akde.a(LoginOdlvVerifyingPresenter.class), "obfuscatedContact", "getObfuscatedContact()Ljava/lang/String;")};
    }

    public LoginOdlvVerifyingPresenter(aipn<jbk> aipn, aipn<iqj> aipn2, aipn<jbw> aipn3, aipn<ira> aipn4, zgb zgb, Context context, aipn<zke> aipn5, aipn<achb<zjm, zjk>> aipn6, aipn<isf> aipn7, aipn<jrk> aipn8) {
        akcr.b(aipn, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn2, "authApi");
        akcr.b(aipn3, "store");
        akcr.b(aipn4, "identityApi");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(context, "context");
        akcr.b(aipn5, "eventDispatcher");
        akcr.b(aipn6, "navigationHost");
        akcr.b(aipn7, "stateTransitionService");
        akcr.b(aipn8, "intentFactory");
        this.h = aipn;
        this.i = aipn2;
        this.j = aipn3;
        this.k = aipn4;
        this.l = context;
        this.m = aipn5;
        this.n = aipn6;
        this.o = aipn7;
        this.p = aipn8;
        String str = "";
        this.a = str;
        this.b = str;
        Object b = new akqy().b(60000);
        akcr.a(b, "DateTime.now().plusMillis(ONE_MINUTE_MS.toInt())");
        this.f = b;
        this.g = zgb.a(jbv.y.callsite("LoginSignup.LoginOdlvVerifyingPresenter"));
        this.t = ajxh.a(new f(this));
        this.u = ajxh.a(new l(this));
        this.v = ajxh.a(new d(this));
        this.w = ajxh.a(new e(this));
        this.x = new b(this);
        this.y = new c(this);
        this.z = new n(this);
    }

    static /* synthetic */ void a(LoginOdlvVerifyingPresenter loginOdlvVerifyingPresenter, CharSequence charSequence, zjm zjm, int i) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        if ((i & 2) != 0) {
            zjm = jbv.g;
        }
        loginOdlvVerifyingPresenter.a(charSequence, zjm);
    }

    private final String e() {
        return (String) this.w.b();
    }

    private final boolean f() {
        return this.d && !this.q;
    }

    private final void g() {
        if (!this.s) {
            Object obj = (jgk) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                obj.b().setText(this.l.getString(R.string.odlv_verification_description, new Object[]{e()}));
                this.s = true;
            }
        }
    }

    private final void h() {
        jgk jgk = (jgk) getTarget();
        if (jgk != null) {
            jgk.f().setOnClickListener(null);
            jgk.d().setOnClickListener(null);
            jgk.a().removeTextChangedListener(this.x);
        }
    }

    private final void i() {
        jgk jgk = (jgk) getTarget();
        if (jgk != null) {
            jgk.a().addTextChangedListener(this.x);
            jgk.f().setOnClickListener(new jgi(this.y));
            jgk.d().setOnClickListener(new jgi(this.z));
        }
    }

    private final int j() {
        if (this.q) {
            return 4;
        }
        if (!this.c) {
            return 0;
        }
        int length = this.a.length();
        return length == 0 ? this.f.d(akrb.a()) ? 2 : 3 : (length > 0 && 5 >= length) ? 0 : 1;
    }

    private final int k() {
        Object a = akrz.a(new akqy(), this.f);
        akcr.a(a, "Seconds.secondsBetween(D…Time.now(), nextResendAt)");
        return Math.max(a.c(), 0);
    }

    /* Access modifiers changed, original: final */
    public final jgl a() {
        return (jgl) this.t.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(CharSequence charSequence, zjm zjm) {
        if (charSequence == null) {
            Object string = this.l.getString(R.string.default_error_try_again_later);
            akcr.a(string, "context.getString(R.stri…lt_error_try_again_later)");
            charSequence = (CharSequence) string;
        }
        Context context = this.l;
        Object obj = this.n.get();
        akcr.a(obj, "navigationHost.get()");
        zgy a = new defpackage.zgy.a(context, (achb) obj, jgh.a, false, null, 24).a(charSequence).a((int) R.string.signup_ok_button, (akbl) new m(this, zjm), false).a();
        ((achb) this.n.get()).a((achd) a, a.a, null);
    }

    /* renamed from: a */
    public final void takeTarget(jgk jgk) {
        akcr.b(jgk, "target");
        super.takeTarget(jgk);
        jgk.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.q = z;
        d();
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return (String) this.u.b();
    }

    /* Access modifiers changed, original: final */
    public final String c() {
        return (String) this.v.b();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        if (!this.r) {
            Object obj = (jgk) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                h();
                g();
                if ((akcr.a(obj.c().getText(), this.b) ^ 1) != 0) {
                    obj.c().setText(this.b);
                    obj.c().setVisibility(akgb.a((CharSequence) this.b) ? 4 : 0);
                }
                obj.a().setEnabled(this.q ^ 1);
                if (f()) {
                    jrl.a(this.l, obj.a());
                }
                obj.f().a(j(), Integer.valueOf(k()));
                i();
            }
        }
    }

    public final void dropTarget() {
        Object obj = (jgk) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onTargetCreate() {
        this.e.start();
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        this.r = true;
        h();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        ((jbk) this.h.get()).a(aath.VERIFYING);
        this.r = false;
        d();
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onTargetStop() {
        this.e.cancel();
    }
}
