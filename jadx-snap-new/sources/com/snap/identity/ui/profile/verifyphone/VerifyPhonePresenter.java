package com.snap.identity.ui.profile.verifyphone;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.snap.core.db.record.FeedModel;
import com.snap.identity.ui.profile.ContactsFragment;
import com.snapchat.android.R;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.acig;
import defpackage.acio;
import defpackage.acip;
import defpackage.aciv;
import defpackage.ahcd;
import defpackage.ahfv;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.ajyu;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akqy;
import defpackage.akrb;
import defpackage.akrz;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.ira;
import defpackage.irc;
import defpackage.jic;
import defpackage.jln;
import defpackage.jlo;
import defpackage.jlp;
import defpackage.jrl;
import defpackage.jun;
import defpackage.juo;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import java.util.List;
import java.util.concurrent.Callable;

public final class VerifyPhonePresenter extends zll<jlp> implements defpackage.k {
    String a;
    String b;
    int c = 2;
    String d;
    akqy e;
    boolean f;
    boolean g;
    final achb<zjm, zjk> h;
    final Context i;
    final aipn<gpb> j;
    final aipn<jun> k;
    private CountDownTimer l;
    private zkf m;
    private boolean n;
    private final zfw o;
    private final ajei p;
    private final c q;
    private final akbl<View, ajxw> r;
    private final akbl<View, ajxw> s;
    private final aipn<ira> t;
    private final ftl u;

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
            VerifyPhonePresenter.a(this.a, String.valueOf(charSequence));
        }
    }

    public static final class n extends CountDownTimer {
        private /* synthetic */ VerifyPhonePresenter a;

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 5, insn: 0x0000: IPUT  (r5 com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter), (r4 com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter$n) com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter.n.a com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter, block:B:0:0x0000, method: com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter.n.<init>(com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter):void
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
        n(long r4) {
            /*
            r3 = this;
            r4.a = r5;
            r0 = 90000; // 0x15f90 float:1.26117E-40 double:4.4466E-319;
            r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r4.<init>(r0, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter$n.<init>(com.snap.identity.ui.profile.verifyphone.VerifyPhonePresenter):void");
        }

        public final void onFinish() {
        }

        public final void onTick(long j) {
            Object obj = this.a.e;
            akcr.a(obj, "nextSendActionAt");
            if (obj.d(akrb.a())) {
                cancel();
            }
            this.a.b();
        }
    }

    static final class e<T> implements ajfb<String> {
        private /* synthetic */ VerifyPhonePresenter a;

        e(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            VerifyPhonePresenter.a(this.a, str);
            VerifyPhonePresenter.a(this.a);
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ VerifyPhonePresenter a;

        g(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            akcr.b(bVar, "statusAndBody");
            obj = (ahfv) bVar.b;
            Object obj2 = obj.a;
            akcr.a(obj2, "resp.logged");
            if (!obj2.booleanValue()) {
                return ajdx.b(obj);
            }
            return ((gpb) this.a.j.get()).b(juo.b(this.a.a, this.a.b)).c((Callable) new Callable<ahfv>() {
                public final /* bridge */ /* synthetic */ Object call() {
                    return obj;
                }
            });
        }
    }

    static final class h<T> implements ajfb<ahfv> {
        private /* synthetic */ VerifyPhonePresenter a;

        h(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ahfv ahfv = (ahfv) obj;
            this.a.f = false;
            Object obj2 = ahfv.a;
            akcr.a(obj2, "resp.logged");
            if (obj2.booleanValue()) {
                VerifyPhonePresenter verifyPhonePresenter = this.a;
                ((jun) verifyPhonePresenter.k.get()).a(verifyPhonePresenter.i);
                zjf zjf = new zjf(irc.m, new ContactsFragment(), acgv.a().a(irc.p).a());
                List k = ajyu.k(verifyPhonePresenter.h.g());
                obj2 = (aciv) (k.size() > 1 ? k.get(1) : k.get(0));
                achb achb = verifyPhonePresenter.h;
                r5 = new acig[2];
                akcr.a(obj2, FeedModel.SOURCEPAGE);
                r5[0] = new acio(obj2.e(), true, false);
                achb achb2 = verifyPhonePresenter.h;
                achd achd = zjf;
                Object obj3 = irc.o;
                akcr.a(obj3, "IdentityFeature.PROFILE_…ENDS_PRESENT_NO_ANIMATION");
                r5[1] = new acip(achb2, achd, obj3);
                achb.b((acig) defpackage.acie.a.a(r5, null));
                return;
            }
            VerifyPhonePresenter verifyPhonePresenter2 = this.a;
            String str = ahfv.b;
            if (str == null) {
                str = this.a.i.getString(R.string.problem_connecting);
                akcr.a((Object) str, "context.getString(R.string.problem_connecting)");
            }
            verifyPhonePresenter2.d = str;
            this.a.b();
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ VerifyPhonePresenter a;

        i(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            verifyPhonePresenter.f = false;
            Object string = verifyPhonePresenter.i.getString(R.string.problem_connecting);
            akcr.a(string, "context.getString(R.string.problem_connecting)");
            verifyPhonePresenter.d = string;
            this.a.b();
        }
    }

    static final class l<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ VerifyPhonePresenter a;

        l(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            VerifyPhonePresenter verifyPhonePresenter;
            String str;
            ahcd ahcd = (ahcd) ((defpackage.ira.b) obj).b;
            this.a.f = false;
            Object obj2 = ahcd.b;
            akcr.a(obj2, "resp.logged");
            if (obj2.booleanValue()) {
                verifyPhonePresenter = this.a;
                str = "";
            } else {
                verifyPhonePresenter = this.a;
                str = ahcd.a;
                if (str == null) {
                    str = this.a.i.getString(R.string.problem_connecting);
                    akcr.a((Object) str, "context.getString(R.string.problem_connecting)");
                }
            }
            verifyPhonePresenter.d = str;
            this.a.b();
        }
    }

    static final class m<T> implements ajfb<Throwable> {
        private /* synthetic */ VerifyPhonePresenter a;

        m(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            verifyPhonePresenter.f = false;
            Object string = verifyPhonePresenter.i.getString(R.string.problem_connecting);
            akcr.a(string, "context.getString(R.string.problem_connecting)");
            verifyPhonePresenter.d = string;
            this.a.b();
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
            jrl.a(verifyPhonePresenter.i);
            Object obj2 = verifyPhonePresenter.e;
            akcr.a(obj2, "nextSendActionAt");
            int i;
            defpackage.zgy.a aVar;
            String string;
            if (obj2.d(akrb.a()) || !verifyPhonePresenter.g) {
                i = verifyPhonePresenter.c == 1 ? R.string.signup_phone_alt_sms_dialogue : R.string.signup_phone_alt_call_dialogue;
                aVar = new defpackage.zgy.a(verifyPhonePresenter.i, verifyPhonePresenter.h, new zjm(irc.t, "verify_phone_confirmation", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24);
                string = verifyPhonePresenter.i.getString(i, new Object[]{juo.a(verifyPhonePresenter.a, verifyPhonePresenter.b)});
                akcr.a((Object) string, "context.getString(resId,…honeNumber, countryCode))");
                a = defpackage.zgy.a.a(aVar.b(string).a((int) R.string.okay, (akbl) new j(verifyPhonePresenter), true), null, false, null, null, null, 31);
            } else {
                obj2 = akrz.a(new akqy(), verifyPhonePresenter.e);
                akcr.a(obj2, "Seconds.secondsBetween(D….now(), nextSendActionAt)");
                i = Math.max(obj2.c(), 0);
                aVar = new defpackage.zgy.a(verifyPhonePresenter.i, verifyPhonePresenter.h, new zjm(irc.t, "verify_phone_action_to_soon", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24);
                string = verifyPhonePresenter.i.getString(R.string.signup_phone_alt_too_early_dialogue, new Object[]{String.valueOf(i)});
                akcr.a((Object) string, "context.getString(R.stri…secondsToWait.toString())");
                a = aVar.b(string).a((int) R.string.okay, (akbl) k.a, true);
            }
            zgy a2 = a.a();
            verifyPhonePresenter.h.a((achd) a2, a2.a, null);
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
            VerifyPhonePresenter.a(this.a);
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ VerifyPhonePresenter a;

        j(VerifyPhonePresenter verifyPhonePresenter) {
            this.a = verifyPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            VerifyPhonePresenter verifyPhonePresenter = this.a;
            int i = 1;
            verifyPhonePresenter.g = true;
            int i2 = jln.a[verifyPhonePresenter.c - 1];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 2;
                } else {
                    throw new ajxk();
                }
            }
            verifyPhonePresenter.c = i;
            this.a.a();
            this.a.b();
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbl<View, ajxw> {
        public static final k a = new k();

        k() {
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

    public VerifyPhonePresenter(achb<zjm, zjk> achb, aipn<ira> aipn, Context context, ftl ftl, aipn<gpb> aipn2, zgb zgb, aipn<jun> aipn3) {
        akcr.b(achb, "navigationHost");
        akcr.b(aipn, "identityApi");
        akcr.b(context, "context");
        akcr.b(ftl, "configProvider");
        akcr.b(aipn2, "userAuthStore");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn3, "smsAutofillRetrieverRegistry");
        this.h = achb;
        this.t = aipn;
        this.i = context;
        this.u = ftl;
        this.j = aipn2;
        this.k = aipn3;
        String str = "";
        this.a = str;
        this.b = str;
        this.d = str;
        this.e = new akqy().a();
        this.n = true;
        this.o = zgb.a(irc.t.callsite("VerifyPhonePresenter"));
        this.p = new ajei();
        this.q = new c(this);
        this.r = new d(this);
        this.s = new b(this);
    }

    public static final /* synthetic */ void a(VerifyPhonePresenter verifyPhonePresenter, String str) {
        jlp jlp = (jlp) verifyPhonePresenter.getTarget();
        if (jlp == null) {
            akcr.a();
        }
        if ((akcr.a(jlp.a().getText().toString(), (Object) str) ^ 1) != 0) {
            jlp = (jlp) verifyPhonePresenter.getTarget();
            if (jlp == null) {
                akcr.a();
            }
            jlp.a().setText(str);
        }
        verifyPhonePresenter.d = "";
        verifyPhonePresenter.b();
    }

    private final void c() {
        CountDownTimer countDownTimer = this.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.l = new n(this).start();
    }

    private final void d() {
        jlp jlp = (jlp) getTarget();
        if (jlp != null) {
            jlp.g().setOnClickListener(new jlo(this.r));
            jlp.f().setOnClickListener(new jlo(this.s));
            jlp.a().addTextChangedListener(this.q);
        }
    }

    private final void e() {
        jlp jlp = (jlp) getTarget();
        if (jlp != null) {
            jlp.g().setOnClickListener(null);
            jlp.f().setOnClickListener(null);
            jlp.a().removeTextChangedListener(this.q);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        defpackage.ahcb.b bVar;
        int i = jln.b[this.c - 1];
        if (i == 1) {
            bVar = defpackage.ahcb.b.TEXT;
        } else if (i == 2) {
            bVar = defpackage.ahcb.b.CALL;
        } else {
            throw new ajxk();
        }
        this.f = true;
        this.p.a(zln.bindTo$default(this, ((ira) this.t.get()).a(this.a, this.b, bVar, defpackage.ahcb.c.IN_APP_CONTACT_TYPE).a((ajdw) this.o.l()).a((ajfb) new l(this), (ajfb) new m(this)), this, null, null, 6, null));
        this.e = new akqy().a();
        c();
    }

    /* renamed from: a */
    public final void takeTarget(jlp jlp) {
        akcr.b(jlp, "target");
        super.takeTarget(jlp);
        jlp.getLifecycle().a(this);
        zkf zkf = new zkf();
        zln.bindTo$default(this, zkf, this, null, null, 6, null);
        this.m = zkf;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.n) {
            Object obj = (jlp) getTarget();
            if (obj != null) {
                Context context;
                int i;
                akcr.a(obj, "target ?: return");
                e();
                int i2 = 1;
                boolean z = this.f ^ 1;
                if (obj.a().isEnabled() != z) {
                    obj.a().setEnabled(z);
                }
                if ((akcr.a(obj.b().getText().toString(), this.d) ^ 1) != 0) {
                    obj.b().setText(this.d);
                }
                int i3 = (((CharSequence) this.d).length() == 0 ? 1 : null) != null ? 8 : 0;
                if (obj.b().getVisibility() != i3) {
                    obj.b().setVisibility(i3);
                }
                Object string = this.i.getString(R.string.inapp_verify_phone_description_format, new Object[]{juo.a(this.a, this.b)});
                if ((akcr.a(obj.d().getText().toString(), string) ^ 1) != 0) {
                    obj.d().setText((CharSequence) string);
                }
                i3 = jln.c[this.c - 1];
                if (i3 == 1) {
                    context = this.i;
                    i = R.string.signup_phone_alt_code_over_call;
                } else if (i3 == 2) {
                    context = this.i;
                    i = R.string.signup_phone_alt_code_over_sms;
                } else {
                    throw new ajxk();
                }
                string = context.getString(i);
                if ((akcr.a(obj.f().getText().toString(), string) ^ 1) != 0) {
                    obj.f().setText((CharSequence) string);
                }
                if (this.f) {
                    i2 = 4;
                } else {
                    i3 = obj.a().getText().toString().length();
                    if (i3 == 0) {
                        string = this.e;
                        akcr.a(string, "nextSendActionAt");
                        i2 = string.d(akrb.a()) ? 2 : 3;
                    } else if (1 <= i3 && 5 >= i3) {
                        i2 = 0;
                    }
                }
                string = akrz.a(new akqy(), this.e);
                akcr.a(string, "Seconds.secondsBetween(D….now(), nextSendActionAt)");
                obj.g().a(i2, Integer.valueOf(Math.max(string.c(), 0)));
                d();
            }
        }
    }

    public final void dropTarget() {
        super.dropTarget();
        jlp jlp = (jlp) getTarget();
        if (jlp != null) {
            defpackage.j lifecycle = jlp.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        c();
        Object j = this.u.j(jic.INAPP_PHONE_NUMBER);
        akcr.a(j, "configProvider.getString…onKey.INAPP_PHONE_NUMBER)");
        this.a = j;
        j = this.u.j(jic.INAPP_COUNTRY_CODE);
        akcr.a(j, "configProvider.getString…onKey.INAPP_COUNTRY_CODE)");
        this.b = j;
        this.p.a(((jun) this.k.get()).b().a((ajdw) this.o.l()).a((ajfb) new e(this), (ajfb) f.a));
        b();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onEnd() {
        CountDownTimer countDownTimer = this.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        ((jun) this.k.get()).a(this.i);
        this.n = true;
        e();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        Object b = this.u.u(jic.PHONE_VERIFICATION_SMS_FORMAT).b((ajdw) this.o.f());
        jun jun = (jun) this.k.get();
        akcr.a(b, "formatObservable");
        jun.a(b, this.i);
        this.n = false;
        d();
        b();
    }
}
