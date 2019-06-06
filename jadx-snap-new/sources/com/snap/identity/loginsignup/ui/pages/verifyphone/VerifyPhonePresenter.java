package com.snap.identity.loginsignup.ui.pages.verifyphone;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aavk;
import defpackage.aawu;
import defpackage.aawv;
import defpackage.aaxp;
import defpackage.achb;
import defpackage.achd;
import defpackage.ahcd;
import defpackage.ahfv;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akgb;
import defpackage.akqy;
import defpackage.akrb;
import defpackage.akrz;
import defpackage.fth;
import defpackage.ftl;
import defpackage.ira;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.jax;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jdw;
import defpackage.jeb;
import defpackage.jha;
import defpackage.jhb;
import defpackage.jhc;
import defpackage.jrl;
import defpackage.jun;
import defpackage.juo;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class VerifyPhonePresenter extends zll<jhc> implements defpackage.k {
    String a;
    String b;
    String c;
    int d = 2;
    String e;
    akqy f;
    boolean g;
    boolean h;
    boolean i;
    final aipn<zke> j;
    final achb<zjm, zjk> k;
    final aipn<jbw> l;
    final jbk m;
    final Context n;
    final aipn<isf> o;
    final aipn<jun> p;
    private CountDownTimer q;
    private boolean r;
    private final zfw s;
    private final c t;
    private final akbl<View, ajxw> u;
    private final akbl<View, ajxw> v;
    private final aipn<ira> w;
    private final aipn<ftl> x;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class c implements TextWatcher {
        private /* synthetic */ VerifyPhonePresenter a;

        c(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            VerifyPhonePresenter.a(this.a, String.valueOf(charSequence), false);
        }
    }

    public static final class o extends CountDownTimer {
        private /* synthetic */ VerifyPhonePresenter a;

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 5, insn: 0x0000: IPUT  (r5 com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter), (r4 com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter$o) com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter.o.a com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter, block:B:0:0x0000, method: com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter.o.<init>(com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter):void
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
        o(long r4) {
            /*
            r3 = this;
            r4.a = r5;
            r0 = 90000; // 0x15f90 float:1.26117E-40 double:4.4466E-319;
            r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r4.<init>(r0, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter$o.<init>(com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhonePresenter):void");
        }

        public final void onFinish() {
        }

        public final void onTick(long j) {
            Object obj = this.a.f;
            akcr.a(obj, "nextSendActionAt");
            if (obj.d(akrb.a())) {
                cancel();
            }
            this.a.c();
        }
    }

    static final class e<T> implements ajfb<String> {
        private /* synthetic */ VerifyPhonePresenter a;

        e(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            akcr.b(str, "verifyCode");
            if (!this.a.g && juo.c(this.a.b, str)) {
                VerifyPhonePresenter.a(this.a, str, true);
                ((isf) this.a.o.get()).a(aaoo.SIGNUP_VERIFY_PHONE_SUBMIT, aaop.INTERNAL_PROCESS, ish.SIGNUP);
                this.a.a();
                this.a.m.a(aavk.VERIFICATION_CODE);
            }
        }
    }

    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ VerifyPhonePresenter a;

        f(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldAutoAdvance");
            if (obj.booleanValue()) {
                ((isf) this.a.o.get()).a(aaoo.SIGNUP_VERIFY_PHONE_SUBMIT, aaop.USER_TYPING, ish.SIGNUP);
                this.a.a();
            }
            this.a.c();
        }
    }

    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ VerifyPhonePresenter a;

        g(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c();
        }
    }

    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            jeb jeb = (jeb) obj;
            akcr.b(jeb, "it");
            return jeb.I;
        }
    }

    static final class k<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ VerifyPhonePresenter a;

        k(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            akcr.b(bVar, "resp");
            jbk jbk = this.a.m;
            long a = bVar.a();
            Object obj2 = ((ahcd) bVar.b).b;
            String str = "resp.body.logged";
            akcr.a(obj2, str);
            jbk.a(a, obj2.booleanValue());
            Object obj3 = ((ahcd) bVar.b).b;
            akcr.a(obj3, str);
            VerifyPhonePresenter verifyPhonePresenter;
            String str2;
            if (obj3.booleanValue()) {
                verifyPhonePresenter = this.a;
                String str3 = "";
                verifyPhonePresenter.e = str3;
                jbw jbw = (jbw) verifyPhonePresenter.l.get();
                str2 = ((ahcd) bVar.b).e;
                if (str2 == null) {
                    str2 = str3;
                }
                jbw.n(str2);
            } else {
                verifyPhonePresenter = this.a;
                str2 = ((ahcd) bVar.b).a;
                if (str2 == null) {
                    str2 = this.a.n.getString(R.string.default_error_try_again_later);
                    akcr.a((Object) str2, "context.getString(R.stri…lt_error_try_again_later)");
                }
                verifyPhonePresenter.e = str2;
            }
            this.a.c();
        }
    }

    static final class l<T> implements ajfb<Throwable> {
        private /* synthetic */ VerifyPhonePresenter a;

        l(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.m.a(-1, false);
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            Object string = verifyPhonePresenter.n.getString(R.string.default_error_try_again_later);
            akcr.a(string, "context.getString(R.stri…lt_error_try_again_later)");
            verifyPhonePresenter.e = string;
            this.a.c();
        }
    }

    static final class m<T> implements ajfb<defpackage.ira.b<ahfv>> {
        private /* synthetic */ VerifyPhonePresenter a;

        m(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            ahfv ahfv = (ahfv) bVar.b;
            jbk jbk = this.a.m;
            long a = bVar.a();
            obj = ahfv.a;
            String str = "resp.logged";
            akcr.a(obj, str);
            jbk.b(a, obj.booleanValue());
            this.a.g = false;
            obj = ahfv.a;
            akcr.a(obj, str);
            if (obj.booleanValue()) {
                ((jun) this.a.p.get()).a(this.a.n);
                VerifyPhonePresenter verifyPhonePresenter = this.a;
                ((zke) verifyPhonePresenter.j.get()).a(new jax(verifyPhonePresenter.b, verifyPhonePresenter.c));
                return;
            }
            this.a.a(ahfv.b);
            this.a.c();
        }
    }

    static final class n<T> implements ajfb<Throwable> {
        private /* synthetic */ VerifyPhonePresenter a;

        n(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.m.b(-1, false);
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            verifyPhonePresenter.g = false;
            verifyPhonePresenter.a(null);
            this.a.c();
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ VerifyPhonePresenter a;

        b(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            defpackage.zgy.a a;
            akcr.b((View) obj, "v");
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            jrl.a(verifyPhonePresenter.n);
            Object obj2 = verifyPhonePresenter.f;
            akcr.a(obj2, "nextSendActionAt");
            int i;
            defpackage.zgy.a aVar;
            String string;
            if (obj2.d(akrb.a()) || !verifyPhonePresenter.i) {
                i = verifyPhonePresenter.d == 1 ? R.string.signup_phone_alt_sms_dialogue : R.string.signup_phone_alt_call_dialogue;
                aVar = new defpackage.zgy.a(verifyPhonePresenter.n, verifyPhonePresenter.k, new zjm(jbv.y, "verify_phone_confirmation", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24);
                string = verifyPhonePresenter.n.getString(i, new Object[]{juo.a(verifyPhonePresenter.b, verifyPhonePresenter.c)});
                akcr.a((Object) string, "context.getString(resId,…honeNumber, countryCode))");
                a = defpackage.zgy.a.a(aVar.b(string).a((int) R.string.okay, (akbl) new i(verifyPhonePresenter), true), null, false, null, null, null, 31);
            } else {
                obj2 = akrz.a(new akqy(), verifyPhonePresenter.f);
                akcr.a(obj2, "Seconds.secondsBetween(D….now(), nextSendActionAt)");
                i = Math.max(obj2.c(), 0);
                aVar = new defpackage.zgy.a(verifyPhonePresenter.n, verifyPhonePresenter.k, new zjm(jbv.y, "verify_phone_action_to_soon", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24);
                string = verifyPhonePresenter.n.getString(R.string.signup_phone_alt_too_early_dialogue, new Object[]{String.valueOf(i)});
                akcr.a((Object) string, "context.getString(com.sn…secondsToWait.toString())");
                a = aVar.b(string).a((int) R.string.okay, (akbl) j.a, true);
            }
            zgy a2 = a.a();
            verifyPhonePresenter.k.a((achd) a2, a2.a, null);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ VerifyPhonePresenter a;

        d(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            int length = verifyPhonePresenter.a.length();
            if (length == 0) {
                Object obj2 = verifyPhonePresenter.f;
                akcr.a(obj2, "nextSendActionAt");
                if (obj2.d(akrb.a())) {
                    verifyPhonePresenter.b();
                }
            } else if (length == 6) {
                ((isf) verifyPhonePresenter.o.get()).a(aaoo.SIGNUP_VERIFY_PHONE_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
                verifyPhonePresenter.a();
            }
            return ajxw.a;
        }
    }

    static final class i extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ VerifyPhonePresenter a;

        i(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            int i = 1;
            verifyPhonePresenter.i = true;
            int i2 = jha.a[verifyPhonePresenter.d - 1];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 2;
                } else {
                    throw new ajxk();
                }
            }
            verifyPhonePresenter.d = i;
            this.a.b();
            this.a.c();
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public VerifyPhonePresenter(aipn<zke> aipn, achb<zjm, zjk> achb, aipn<jbw> aipn2, aipn<ira> aipn3, jbk jbk, Context context, aipn<isf> aipn4, aipn<jun> aipn5, aipn<ftl> aipn6, zgb zgb) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn2, "store");
        akcr.b(aipn3, "identityApi");
        akcr.b(jbk, "loginSignupAnalytics");
        akcr.b(context, "context");
        akcr.b(aipn4, "stateTransitionService");
        akcr.b(aipn5, "smsAutofillRetrieverRegistry");
        akcr.b(aipn6, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        this.j = aipn;
        this.k = achb;
        this.l = aipn2;
        this.w = aipn3;
        this.m = jbk;
        this.n = context;
        this.o = aipn4;
        this.p = aipn5;
        this.x = aipn6;
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.e = str;
        this.f = new akqy().a();
        this.r = true;
        this.s = zgb.a(jbv.y.callsite(jbv.o.b()));
        this.t = new c(this);
        this.u = new d(this);
        this.v = new b(this);
    }

    public static final /* synthetic */ void a(VerifyPhonePresenter verifyPhonePresenter, String str, boolean z) {
        verifyPhonePresenter.a = str;
        verifyPhonePresenter.e = "";
        if (z || str.length() != 6) {
            verifyPhonePresenter.c();
            return;
        }
        zln.bindTo$default(verifyPhonePresenter, ((ftl) verifyPhonePresenter.x.get()).b((fth) jdw.REG_PHONE_AUTO_ADVANCE).b((ajdw) verifyPhonePresenter.s.h()).a((ajdw) verifyPhonePresenter.s.l()).a((ajfb) new f(verifyPhonePresenter), (ajfb) new g(verifyPhonePresenter)), verifyPhonePresenter, null, null, 6, null);
    }

    private final boolean d() {
        return (this.h || (akgb.a(this.e) ^ 1) != 0) && !this.g;
    }

    private final void e() {
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f = new akqy().a();
        this.q = new o(this).start();
    }

    private final void f() {
        jhc jhc = (jhc) getTarget();
        if (jhc != null) {
            jhc.a().addTextChangedListener(this.t);
            jhc.g().setOnClickListener(new jhb(this.u));
            jhc.d().setOnClickListener(new jhb(this.v));
        }
    }

    private final void g() {
        jhc jhc = (jhc) getTarget();
        if (jhc != null) {
            jhc.a().removeTextChangedListener(this.t);
            jhc.g().setOnClickListener(null);
            jhc.d().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.g) {
            this.g = true;
            jbk jbk = this.m;
            aawu aawu = new aawu();
            aawu.a(Boolean.FALSE);
            aawu.a(aaxp.V2);
            aawu.a(((isc) jbk.g.get()).a());
            jbk.a().a(aawu);
            zln.bindTo$default(this, ((ira) this.w.get()).a(this.a, defpackage.ahft.a.REGISTRATION_TYPE).a((ajdw) this.s.l()).a((ajfb) new m(this), (ajfb) new n(this)), this, null, null, 6, null);
            c();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        if (str == null) {
            str = this.n.getString(R.string.default_error_try_again_later);
            akcr.a((Object) str, "context.getString(R.stri…lt_error_try_again_later)");
        }
        this.e = str;
        jbk jbk = this.m;
        aawv aawv = new aawv();
        aawv.a(aaxp.V2);
        aawv.a(((isc) jbk.g.get()).a());
        jbk.a().a(aawv);
    }

    /* renamed from: a */
    public final void takeTarget(jhc jhc) {
        akcr.b(jhc, "target");
        super.takeTarget(jhc);
        jhc.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        defpackage.ahcb.b bVar;
        int i = jha.b[this.d - 1];
        if (i == 1) {
            bVar = defpackage.ahcb.b.TEXT;
        } else if (i == 2) {
            bVar = defpackage.ahcb.b.CALL;
        } else {
            throw new ajxk();
        }
        zln.bindTo$default(this, ((ira) this.w.get()).a(this.b, this.c, bVar, defpackage.ahcb.c.REGISTRATION_TYPE).a((ajdw) this.s.l()).a((ajfb) new k(this), (ajfb) new l(this)), this, null, null, 6, null);
        e();
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (!this.r) {
            Object obj = (jhc) getTarget();
            if (obj != null) {
                Context context;
                int i;
                akcr.a(obj, "target ?: return");
                g();
                int i2 = 1;
                if ((akcr.a(obj.a().getText().toString(), this.a) ^ 1) != 0) {
                    obj.a().setText(this.a);
                }
                boolean z = this.g ^ 1;
                if (obj.a().isEnabled() != z) {
                    obj.a().setEnabled(z);
                }
                if (d()) {
                    jrl.a(this.n, obj.a());
                }
                if ((akcr.a(obj.b().getText().toString(), this.e) ^ 1) != 0) {
                    obj.b().setText(this.e);
                }
                int i3 = (((CharSequence) this.e).length() == 0 ? 1 : null) != null ? 8 : 0;
                if (obj.b().getVisibility() != i3) {
                    obj.b().setVisibility(i3);
                }
                Object string = this.n.getString(R.string.signup_verify_phone_description_format, new Object[]{juo.a(this.b, this.c)});
                if ((akcr.a(obj.c().getText().toString(), string) ^ 1) != 0) {
                    obj.c().setText((CharSequence) string);
                }
                i3 = jha.c[this.d - 1];
                if (i3 == 1) {
                    context = this.n;
                    i = R.string.signup_phone_alt_code_over_call;
                } else if (i3 == 2) {
                    context = this.n;
                    i = R.string.signup_phone_alt_code_over_sms;
                } else {
                    throw new ajxk();
                }
                string = context.getString(i);
                if ((akcr.a(obj.d().getText().toString(), string) ^ 1) != 0) {
                    obj.d().setText((CharSequence) string);
                }
                if (this.g) {
                    i2 = 4;
                } else {
                    i3 = this.a.length();
                    if (i3 == 0) {
                        string = this.f;
                        akcr.a(string, "nextSendActionAt");
                        i2 = string.d(akrb.a()) ? 2 : 3;
                    } else if (1 <= i3 && 5 >= i3) {
                        i2 = 0;
                    }
                }
                string = akrz.a(new akqy(), this.f);
                akcr.a(string, "Seconds.secondsBetween(D….now(), nextSendActionAt)");
                obj.g().a(i2, Integer.valueOf(Math.max(string.c(), 0)));
                f();
            }
        }
    }

    public final void dropTarget() {
        super.dropTarget();
        jhc jhc = (jhc) getTarget();
        if (jhc != null) {
            defpackage.j lifecycle = jhc.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        e();
        jeb c = ((jbw) this.l.get()).c();
        this.b = c.h;
        this.c = c.i;
        c();
        zln.bindTo$default(this, ((jun) this.p.get()).a().a((ajdw) this.s.l()).e((ajfb) new e(this)), this, null, null, 6, null);
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onEnd() {
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.r = true;
        g();
        ((jun) this.p.get()).a(this.n);
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.r = false;
        f();
        Object p = ((jbw) this.l.get()).a().p(h.a);
        jun jun = (jun) this.p.get();
        akcr.a(p, "formatObservable");
        jun.a(p, this.n);
        c();
    }
}
