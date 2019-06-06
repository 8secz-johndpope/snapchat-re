package com.snap.identity.loginsignup.ui.pages.twofa;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snapchat.android.R;
import defpackage.aaad;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.abgs;
import defpackage.ahao;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.akgb;
import defpackage.akqy;
import defpackage.akrb;
import defpackage.akrz;
import defpackage.ieg;
import defpackage.iqj;
import defpackage.iql;
import defpackage.ira;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.jbc;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jgu;
import defpackage.jgv;
import defpackage.jrl;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class LoginTwoFAPresenter extends zll<jgu> implements k {
    String a;
    boolean b = true;
    String c;
    boolean d;
    boolean e;
    boolean f;
    jgv g;
    akqy h;
    String i;
    String j;
    boolean k;
    String l;
    String m;
    abgs n;
    final aipn<zke> o;
    final Context p;
    final aipn<jbk> q;
    final aipn<isf> r;
    private CountDownTimer s;
    private boolean t;
    private final zfw u;
    private final c v;
    private final OnCheckedChangeListener w;
    private final aipn<jbw> x;
    private final aipn<iqj> y;
    private final aipn<ira> z;

    static final class a implements OnClickListener {
        private /* synthetic */ LoginTwoFAPresenter a;

        a(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final void onClick(View view) {
            akcr.b(view, "<anonymous parameter 0>");
            LoginTwoFAPresenter loginTwoFAPresenter = this.a;
            if (loginTwoFAPresenter.e) {
                loginTwoFAPresenter.g = jgv.SMS;
                ((jbk) loginTwoFAPresenter.q.get()).a(loginTwoFAPresenter.d(), loginTwoFAPresenter.n);
                loginTwoFAPresenter.n = loginTwoFAPresenter.d();
                String str = "";
                loginTwoFAPresenter.c = str;
                loginTwoFAPresenter.a = str;
                loginTwoFAPresenter.b();
                loginTwoFAPresenter.c();
            }
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ LoginTwoFAPresenter a;

        b(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final void onClick(View view) {
            akcr.b(view, "<anonymous parameter 0>");
            LoginTwoFAPresenter loginTwoFAPresenter = this.a;
            if (loginTwoFAPresenter.g != jgv.SMS) {
                loginTwoFAPresenter.a();
            } else if (LoginTwoFAPresenter.a(loginTwoFAPresenter.a)) {
                loginTwoFAPresenter.a();
            } else {
                if (loginTwoFAPresenter.h.d(akrb.a())) {
                    loginTwoFAPresenter.b();
                    loginTwoFAPresenter.c();
                }
            }
        }
    }

    public static final class c implements TextWatcher {
        private /* synthetic */ LoginTwoFAPresenter a;

        c(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LoginTwoFAPresenter loginTwoFAPresenter = this.a;
            loginTwoFAPresenter.a = String.valueOf(charSequence);
            loginTwoFAPresenter.c = "";
            loginTwoFAPresenter.c();
        }
    }

    static final class g implements OnCheckedChangeListener {
        private /* synthetic */ LoginTwoFAPresenter a;

        g(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LoginTwoFAPresenter loginTwoFAPresenter = this.a;
            loginTwoFAPresenter.b = z;
            loginTwoFAPresenter.c();
        }
    }

    public static final class j extends CountDownTimer {
        private /* synthetic */ LoginTwoFAPresenter a;

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 5, insn: 0x0000: IPUT  (r5 com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter), (r4 com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter$j) com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter.j.a com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter, block:B:0:0x0000, method: com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter.j.<init>(com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter):void
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:162)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:133)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        j(long r4) {
            /*
            r3 = this;
            r4.a = r5;
            r0 = 90000; // 0x15f90 float:1.26117E-40 double:4.4466E-319;
            r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r4.<init>(r0, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter$j.<init>(com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter):void");
        }

        public final void onFinish() {
        }

        public final void onTick(long j) {
            if (this.a.h.d(akrb.a())) {
                cancel();
            }
            this.a.c();
        }
    }

    static final class d<T> implements ajfb<jeb> {
        private /* synthetic */ LoginTwoFAPresenter a;

        d(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jeb) obj;
            LoginTwoFAPresenter loginTwoFAPresenter = this.a;
            akcr.a(obj, "newSession");
            loginTwoFAPresenter.i = obj.a;
            loginTwoFAPresenter.j = obj.d;
            if ((akcr.a(loginTwoFAPresenter.l, obj.g) ^ 1) != 0) {
                loginTwoFAPresenter.l = obj.g;
                obj = loginTwoFAPresenter.p.getString(R.string.twofa_new_device_sms_verification_explanation, new Object[]{loginTwoFAPresenter.l});
                akcr.a(obj, "context.getString(com.sn…ion, redactedPhoneNumber)");
                loginTwoFAPresenter.m = obj;
            }
        }
    }

    static final class e<T> implements ajfb<iql> {
        private /* synthetic */ LoginTwoFAPresenter a;

        e(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (iql) obj;
            LoginTwoFAPresenter loginTwoFAPresenter = this.a;
            akcr.a(obj, "it");
            jbk jbk = (jbk) loginTwoFAPresenter.q.get();
            abgs d = loginTwoFAPresenter.d();
            akcr.b(d, "context");
            aaad aaad = new aaad();
            aaad.a(Boolean.valueOf(jbk.m()));
            aaad.a(d);
            aaad.a(jbk.b().c().b);
            aaad.b(((isc) jbk.g.get()).a());
            jbk.a().a(aaad);
            zke zke = (zke) loginTwoFAPresenter.o.get();
            Boolean bool = obj.b.A;
            zke.a(new jbc(bool != null ? bool.booleanValue() : false));
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ LoginTwoFAPresenter a;

        f(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        /* JADX WARNING: Missing block: B:8:0x0064, code skipped:
            if (r6 == null) goto L_0x0066;
     */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (java.lang.Throwable) r6;
            r0 = r5.a;
            r1 = "it";
            defpackage.akcr.a(r6, r1);
            r1 = r0.q;
            r1 = r1.get();
            r1 = (defpackage.jbk) r1;
            r2 = r0.d();
            r3 = "context";
            defpackage.akcr.b(r2, r3);
            r3 = new aaab;
            r3.<init>();
            r4 = r1.m();
            r4 = java.lang.Boolean.valueOf(r4);
            r3.a(r4);
            r3.a(r2);
            r2 = r1.b();
            r2 = r2.c();
            r2 = r2.b;
            r3.a(r2);
            r2 = r1.g;
            r2 = r2.get();
            r2 = (defpackage.isc) r2;
            r2 = r2.a();
            r3.b(r2);
            r1 = r1.a();
            r3 = (defpackage.aajt) r3;
            r1.a(r3);
            r1 = 0;
            r0.d = r1;
            r1 = r6 instanceof defpackage.irg;
            if (r1 != 0) goto L_0x005a;
        L_0x0059:
            r6 = 0;
        L_0x005a:
            r6 = (defpackage.irg) r6;
            if (r6 == 0) goto L_0x0066;
        L_0x005e:
            r6 = r6.a;
            if (r6 == 0) goto L_0x0066;
        L_0x0062:
            r6 = r6.r;
            if (r6 != 0) goto L_0x0074;
        L_0x0066:
            r6 = r0.p;
            r1 = 2131888926; // 0x7f120b1e float:1.9412501E38 double:1.053293079E-314;
            r6 = r6.getString(r1);
            r1 = "context.getString(R.string.problem_connecting)";
            defpackage.akcr.a(r6, r1);
        L_0x0074:
            r0.c = r6;
            r0.c();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAPresenter$f.accept(java.lang.Object):void");
        }
    }

    static final class h<T> implements ajfb<ahao> {
        private /* synthetic */ LoginTwoFAPresenter a;

        h(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ahao ahao = (ahao) obj;
            akcr.b(ahao, "resp");
            obj = ahao.a;
            akcr.a(obj, "resp.success");
            if (obj.booleanValue()) {
                ((isf) this.a.r.get()).a(aaoo.TWO_FA_SMS_REQUEST_SUCCEED, aaop.INTERNAL_PROCESS, ish.LOGIN);
            }
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ LoginTwoFAPresenter a;

        i(LoginTwoFAPresenter loginTwoFAPresenter) {
            this.a = loginTwoFAPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            LoginTwoFAPresenter loginTwoFAPresenter = this.a;
            akcr.a(obj, "it");
            ieg.a(obj.getMessage(), true, 0);
            obj = loginTwoFAPresenter.p.getString(R.string.problem_connecting);
            akcr.a(obj, "context.getString(R.string.problem_connecting)");
            loginTwoFAPresenter.c = obj;
            obj = new akqy();
            akcr.a(obj, "DateTime.now()");
            loginTwoFAPresenter.h = obj;
            loginTwoFAPresenter.c();
        }
    }

    public LoginTwoFAPresenter(aipn<zke> aipn, Context context, aipn<jbw> aipn2, aipn<jbk> aipn3, aipn<iqj> aipn4, aipn<ira> aipn5, aipn<isf> aipn6, zgb zgb) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(context, "context");
        akcr.b(aipn2, "store");
        akcr.b(aipn3, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn4, "authApi");
        akcr.b(aipn5, "identityApi");
        akcr.b(aipn6, "stateTransitionService");
        akcr.b(zgb, "schedulersProvider");
        this.o = aipn;
        this.p = context;
        this.x = aipn2;
        this.q = aipn3;
        this.y = aipn4;
        this.z = aipn5;
        this.r = aipn6;
        String str = "";
        this.a = str;
        this.c = str;
        this.g = jgv.OTP;
        this.h = new akqy(0);
        this.i = str;
        this.j = str;
        this.l = str;
        this.m = str;
        this.t = true;
        this.u = zgb.a(jbv.y.callsite("LoginSignup.LoginTwoFAPresenter"));
        this.v = new c(this);
        this.w = new g(this);
    }

    static boolean a(String str) {
        return str.length() >= 6;
    }

    private final boolean e() {
        return (this.k || (akgb.a(this.c) ^ 1) != 0) && !this.d;
    }

    private final void f() {
        jgu jgu = (jgu) getTarget();
        if (jgu != null) {
            jgu.a().addTextChangedListener(this.v);
            jgu.b().setOnCheckedChangeListener(this.w);
            jgu.g().setOnClickListener(new a(this));
            jgu.c().setOnClickListener(new b(this));
        }
    }

    private final void g() {
        jgu jgu = (jgu) getTarget();
        if (jgu != null) {
            jgu.a().removeTextChangedListener(this.v);
            jgu.b().setOnCheckedChangeListener(null);
            jgu.g().setOnClickListener(null);
            jgu.c().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        isf isf;
        aaoo aaoo;
        this.d = true;
        c();
        if (this.g == jgv.SMS) {
            isf = (isf) this.r.get();
            aaoo = aaoo.TWO_FA_SMS_LOGIN_SUBMIT;
        } else {
            isf = (isf) this.r.get();
            aaoo = aaoo.TWO_FA_AUTHENTICATOR_LOGIN_SUBMIT;
        }
        isf.a(aaoo, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
        zln.bindTo$default(this, ((iqj) this.y.get()).a(this.i, this.a, this.g.name(), this.j, this.b).a((ajdw) this.u.l()).a((ajfb) new e(this), (ajfb) new f(this)), this, null, null, 6, null);
    }

    /* renamed from: a */
    public final void takeTarget(jgu jgu) {
        akcr.b(jgu, "target");
        super.takeTarget(jgu);
        jgu.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.h.d(akrb.a())) {
            ((isf) this.r.get()).a(aaoo.TWO_FA_SMS_REQUEST_SUBMIT, aaop.USER_PRESSED_BUTTON, ish.LOGIN);
            this.c = "";
            Object a = new akqy().a();
            akcr.a(a, "DateTime.now().plusSeconds(60)");
            this.h = a;
            CountDownTimer countDownTimer = this.s;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.s = new j(this).start();
            zln.bindTo$default(this, ((ira) this.z.get()).b(this.j, this.i).a((ajdw) this.u.l()).a((ajfb) new h(this), (ajfb) new i(this)), this, null, null, 6, null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (!this.t) {
            Object obj = (jgu) getTarget();
            if (obj != null) {
                int i;
                akcr.a(obj, "target ?: return");
                g();
                if ((akcr.a(obj.a().getText().toString(), this.a) ^ 1) != 0) {
                    obj.a().setText(this.a);
                }
                boolean z = this.d ^ 1;
                if (obj.a().isEnabled() != z) {
                    obj.a().setEnabled(z);
                }
                if (e()) {
                    jrl.a(this.p, obj.a());
                }
                if (obj.b().isChecked() != this.b) {
                    obj.b().setChecked(this.b);
                }
                if (obj.b().isEnabled() != z) {
                    obj.b().setEnabled(z);
                }
                int i2 = 8;
                int i3 = (akgb.a((CharSequence) this.c) ^ 1) != 0 ? 0 : 8;
                if (obj.h().getVisibility() != i3) {
                    obj.h().setVisibility(i3);
                }
                if ((akcr.a(obj.h().getText().toString(), this.c) ^ 1) != 0) {
                    obj.h().setText(this.c);
                }
                Object a = akrz.a(new akqy(), this.h);
                akcr.a(a, "Seconds.secondsBetween(D…now(), canRequestSmsTime)");
                i3 = a.c();
                if (this.d) {
                    i = 4;
                } else {
                    if (!(this.g == jgv.OTP && a(this.a) && akgb.a(this.c))) {
                        if (this.g != jgv.OTP) {
                            if (!(this.g == jgv.SMS && a(this.a) && akgb.a(this.c))) {
                                if (!(this.g == jgv.SMS && a(this.a) && (akgb.a(this.c) ^ 1) != 0)) {
                                    if (this.g == jgv.SMS && i3 > 0) {
                                        i = 3;
                                    } else if (this.g == jgv.SMS) {
                                        i = 2;
                                    }
                                }
                            }
                        }
                        i = 0;
                    }
                    i = 1;
                }
                obj.c().a(i, Integer.valueOf(i3));
                i3 = this.g == jgv.OTP ? 0 : 8;
                if (obj.d().getVisibility() != i3) {
                    obj.d().setVisibility(i3);
                }
                i3 = this.g == jgv.SMS ? 0 : 8;
                if (obj.f().getVisibility() != i3) {
                    obj.f().setVisibility(i3);
                }
                if ((akcr.a(obj.f().getText().toString(), this.m) ^ 1) != 0) {
                    obj.f().setText(this.m);
                }
                if (this.g == jgv.OTP && this.e) {
                    i2 = 0;
                }
                if (obj.g().getVisibility() != i2) {
                    obj.g().setVisibility(i2);
                }
                f();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final abgs d() {
        return this.g == jgv.OTP ? abgs.AUTHENTICATOR : abgs.PHONE;
    }

    public final void dropTarget() {
        Object obj = (jgu) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        this.g = this.f ? jgv.OTP : jgv.SMS;
        zln.bindTo$default(this, ((jbw) this.x.get()).a().a((ajdw) this.u.l()).f((ajfb) new d(this)), this, null, null, 6, null);
        c();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onEnd() {
        CountDownTimer countDownTimer = this.s;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        this.t = true;
        g();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        this.t = false;
        f();
        c();
    }
}
