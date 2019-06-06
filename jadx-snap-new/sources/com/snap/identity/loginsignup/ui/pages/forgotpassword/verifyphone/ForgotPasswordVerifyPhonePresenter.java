package com.snap.identity.loginsignup.ui.pages.forgotpassword.verifyphone;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.achb;
import defpackage.achd;
import defpackage.ahcd;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.akrz;
import defpackage.ira;
import defpackage.isf;
import defpackage.ish;
import defpackage.jac;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jfr;
import defpackage.jfs;
import defpackage.jrl;
import defpackage.jrm;
import defpackage.jrn;
import defpackage.jro;
import defpackage.jug;
import defpackage.jui;
import defpackage.juj;
import defpackage.jul;
import defpackage.jun;
import defpackage.juo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class ForgotPasswordVerifyPhonePresenter extends zll<jfs> implements defpackage.k {
    defpackage.ahcb.b a = defpackage.ahcb.b.TEXT;
    boolean b;
    boolean c;
    jrm d = jrn.a();
    final Context e;
    final aipn<zke> f;
    final achb<zjm, zjk> g;
    final jug h;
    final aipn<jbw> i;
    final jui j;
    final aipn<jun> k;
    final aipn<isf> l;
    private String m;
    private String n;
    private boolean o = true;
    private final zfw p = zgb.a(jbv.y.callsite(jbv.u.b()));
    private final e q = new e(this);
    private final aipn<ira> r;

    static final class a implements OnClickListener {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        a(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final void onClick(View view) {
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            int i = jfr.a[forgotPasswordVerifyPhonePresenter.d.n.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ((isf) forgotPasswordVerifyPhonePresenter.l.get()).a(aaoo.FORGOT_PASSWORD_VERIFY_PHONE_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
                    forgotPasswordVerifyPhonePresenter.a();
                }
                return;
            }
            ((isf) forgotPasswordVerifyPhonePresenter.l.get()).a(aaoo.FORGOT_PASSWORD_SET_PHONE_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
            forgotPasswordVerifyPhonePresenter.a(forgotPasswordVerifyPhonePresenter.a);
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        b(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final void onClick(View view) {
            defpackage.zgy.a a;
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            akrz akrz = juj.a(forgotPasswordVerifyPhonePresenter.d).l;
            int i;
            defpackage.zgy.a aVar;
            String string;
            if (!forgotPasswordVerifyPhonePresenter.b || akrz.c() <= 0) {
                forgotPasswordVerifyPhonePresenter.b = true;
                jrl.a(forgotPasswordVerifyPhonePresenter.e);
                i = forgotPasswordVerifyPhonePresenter.a == defpackage.ahcb.b.CALL ? R.string.signup_phone_alt_sms_dialogue : R.string.signup_phone_alt_call_dialogue;
                aVar = new defpackage.zgy.a(forgotPasswordVerifyPhonePresenter.e, forgotPasswordVerifyPhonePresenter.g, new zjm(jbv.y, "verify_phone_confirmation", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24);
                string = forgotPasswordVerifyPhonePresenter.e.getString(i, new Object[]{forgotPasswordVerifyPhonePresenter.d.e});
                akcr.a((Object) string, "context.getString(resId,…ate.requestedPhoneNumber)");
                a = defpackage.zgy.a.a(aVar.b(string).a((int) R.string.okay, (akbl) new j(forgotPasswordVerifyPhonePresenter), true), null, false, null, null, null, 31);
            } else {
                i = akrz.c();
                jrl.a(forgotPasswordVerifyPhonePresenter.e);
                aVar = new defpackage.zgy.a(forgotPasswordVerifyPhonePresenter.e, forgotPasswordVerifyPhonePresenter.g, new zjm(jbv.y, "verify_phone_action_too_soon", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24);
                string = forgotPasswordVerifyPhonePresenter.e.getString(R.string.signup_phone_alt_too_early_dialogue, new Object[]{String.valueOf(i)});
                akcr.a((Object) string, "context.getString(com.sn…ondsRemaining.toString())");
                a = aVar.b(string).a((int) R.string.okay, (akbl) k.a, true);
            }
            zgy a2 = a.a();
            forgotPasswordVerifyPhonePresenter.g.a((achd) a2, a2.a, null);
        }
    }

    public static final class e implements TextWatcher {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        e(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ForgotPasswordVerifyPhonePresenter.a(this.a, String.valueOf(charSequence));
        }
    }

    static final class c<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        c(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            ahcd ahcd = (ahcd) bVar.b;
            Object obj2 = ahcd.b;
            akcr.a(obj2, "resp.logged");
            if (obj2.booleanValue()) {
                ((jun) forgotPasswordVerifyPhonePresenter.k.get()).a(forgotPasswordVerifyPhonePresenter.e);
                jui jui = forgotPasswordVerifyPhonePresenter.j;
                jrm jrm = forgotPasswordVerifyPhonePresenter.d;
                obj = ahcd.a;
                akcr.a(obj, "resp.message");
                forgotPasswordVerifyPhonePresenter.d = jui.e(jrm, obj);
                forgotPasswordVerifyPhonePresenter.b();
                forgotPasswordVerifyPhonePresenter.h.b();
                ((zke) forgotPasswordVerifyPhonePresenter.f.get()).a(new jac());
                return;
            }
            String str = ahcd.a;
            if (str == null) {
                str = forgotPasswordVerifyPhonePresenter.e.getString(R.string.problem_connecting);
                akcr.a((Object) str, "context.getString(com.sn…tring.problem_connecting)");
            }
            forgotPasswordVerifyPhonePresenter.b(str);
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        d(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            Object string = forgotPasswordVerifyPhonePresenter.e.getString(R.string.problem_connecting);
            akcr.a(string, "context.getString(com.sn…tring.problem_connecting)");
            forgotPasswordVerifyPhonePresenter.b(string);
        }
    }

    static final class f<T> implements ajfb<jul> {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        f(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jul jul = (jul) obj;
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            jrm jrm = forgotPasswordVerifyPhonePresenter.d;
            akcr.a((Object) jul, "resendTimerState");
            forgotPasswordVerifyPhonePresenter.d = jui.a(jrm, jul);
            this.a.b();
        }
    }

    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class h<T> implements ajfb<String> {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        h(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            akcr.b(str, "verifyCode");
            if (!this.a.d.h && juo.c(this.a.d.e, str)) {
                ForgotPasswordVerifyPhonePresenter.a(this.a, str);
                ((isf) this.a.l.get()).a(aaoo.FORGOT_PASSWORD_VERIFY_PHONE_SUBMIT, aaop.INTERNAL_PROCESS, ish.LOGIN);
                this.a.a();
            }
        }
    }

    static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            jeb jeb = (jeb) obj;
            akcr.b(jeb, "it");
            return jeb.I;
        }
    }

    static final class x<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        x(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            ahcd ahcd = (ahcd) bVar.b;
            Object obj2 = ahcd.b;
            akcr.a(obj2, "resp.logged");
            String str;
            if (obj2.booleanValue()) {
                jbw jbw = (jbw) forgotPasswordVerifyPhonePresenter.i.get();
                String str2 = ahcd.e;
                if (str2 == null) {
                    str2 = "";
                }
                jbw.n(str2);
                jui jui = forgotPasswordVerifyPhonePresenter.j;
                jrm jrm = forgotPasswordVerifyPhonePresenter.d;
                str = ahcd.a;
                akcr.a((Object) str, "resp.message");
                forgotPasswordVerifyPhonePresenter.d = jui.a(jrm, str);
                forgotPasswordVerifyPhonePresenter.b();
                return;
            }
            str = ahcd.a;
            if (str == null) {
                str = forgotPasswordVerifyPhonePresenter.e.getString(R.string.default_error_try_again_later);
                akcr.a((Object) str, "context.getString(R.stri…lt_error_try_again_later)");
            }
            forgotPasswordVerifyPhonePresenter.a(str);
        }
    }

    static final class y<T> implements ajfb<Throwable> {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        y(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            String string = forgotPasswordVerifyPhonePresenter.e.getString(R.string.default_error_try_again_later);
            akcr.a((Object) string, "context.getString(R.stri…lt_error_try_again_later)");
            forgotPasswordVerifyPhonePresenter.a(string);
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ForgotPasswordVerifyPhonePresenter a;

        j(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter) {
            this.a = forgotPasswordVerifyPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter = this.a;
            forgotPasswordVerifyPhonePresenter.a = forgotPasswordVerifyPhonePresenter.a == defpackage.ahcb.b.TEXT ? defpackage.ahcb.b.CALL : defpackage.ahcb.b.TEXT;
            ((isf) forgotPasswordVerifyPhonePresenter.l.get()).a(aaoo.FORGOT_PASSWORD_SET_PHONE_SUBMIT, aaop.USER_PRESSED_BUTTON, ish.LOGIN);
            forgotPasswordVerifyPhonePresenter.a(forgotPasswordVerifyPhonePresenter.a);
            forgotPasswordVerifyPhonePresenter.b();
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

    static final class l extends akcq implements akbk<String> {
        l(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    static final class m extends akcq implements akbl<CharSequence, ajxw> {
        m(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class n extends akcq implements akbk<Integer> {
        n(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((TextView) this.receiver).getVisibility());
        }
    }

    static final class o extends akcq implements akbl<Integer, ajxw> {
        o(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class p extends akcq implements akbl<CharSequence, ajxw> {
        p(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class q extends akcq implements akbk<String> {
        q(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    static final class r extends akcq implements akbl<CharSequence, ajxw> {
        r(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class s extends akcq implements akbk<String> {
        s(Editable editable) {
            super(0, editable);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(Editable.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((Editable) this.receiver).toString();
        }
    }

    static final class t extends akcq implements akbl<CharSequence, ajxw> {
        t(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class u extends akcq implements akbk<Boolean> {
        u(EditText editText) {
            super(0, editText);
        }

        public final String getName() {
            return "isEnabled";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "isEnabled()Z";
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((EditText) this.receiver).isEnabled());
        }
    }

    static final class v extends akcq implements akbl<Boolean, ajxw> {
        v(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setEnabled";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setEnabled(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setEnabled(((Boolean) obj).booleanValue());
            return ajxw.a;
        }
    }

    static final class w extends akcq implements akbk<String> {
        w(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    public ForgotPasswordVerifyPhonePresenter(Context context, aipn<zke> aipn, achb<zjm, zjk> achb, jug jug, aipn<jbw> aipn2, aipn<ira> aipn3, jui jui, aipn<jun> aipn4, aipn<isf> aipn5, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(aipn, "eventDispatcher");
        akcr.b(achb, "navigationHost");
        akcr.b(jug, "resendTimer");
        akcr.b(aipn2, "store");
        akcr.b(aipn3, "identityApi");
        akcr.b(jui, "reducers");
        akcr.b(aipn4, "smsAutofillRetrieverRegistry");
        akcr.b(aipn5, "stateTransitionService");
        akcr.b(zgb, "schedulersProvider");
        this.e = context;
        this.f = aipn;
        this.g = achb;
        this.h = jug;
        this.i = aipn2;
        this.r = aipn3;
        this.j = jui;
        this.k = aipn4;
        this.l = aipn5;
        String str = "";
        this.m = str;
        this.n = str;
    }

    public static final /* synthetic */ void a(ForgotPasswordVerifyPhonePresenter forgotPasswordVerifyPhonePresenter, String str) {
        forgotPasswordVerifyPhonePresenter.d = jui.c(forgotPasswordVerifyPhonePresenter.d, str);
        forgotPasswordVerifyPhonePresenter.b();
    }

    private static <T> void a(T t, akbk<? extends T> akbk, akbl<? super T, ajxw> akbl) {
        if ((akcr.a(akbk.invoke(), (Object) t) ^ 1) != 0) {
            akbl.invoke(t);
        }
    }

    private boolean c() {
        return this.c && !this.d.h;
    }

    private final void d() {
        jfs jfs = (jfs) getTarget();
        if (jfs != null) {
            jfs.a().addTextChangedListener(this.q);
            jfs.f().setOnClickListener(new a(this));
            jfs.d().setOnClickListener(new b(this));
        }
    }

    private final void e() {
        jfs jfs = (jfs) getTarget();
        if (jfs != null) {
            jfs.a().removeTextChangedListener(this.q);
            jfs.f().setOnClickListener(null);
            jfs.d().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.d.h) {
            zln.bindTo$default(this, ((ira) this.r.get()).a(this.d.g, this.d.e, this.d.f, this.m, this.n, this.a).a((ajdw) this.p.l()).a((ajfb) new c(this), (ajfb) new d(this)), this, null, null, 6, null);
            this.d = jui.b(this.d);
            b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(defpackage.ahcb.b bVar) {
        zln.bindTo$default(this, ((ira) this.r.get()).a(this.d.e, this.d.f, this.m, bVar, this.n).a((ajdw) this.p.l()).a((ajfb) new x(this), (ajfb) new y(this)), this, null, null, 6, null);
        this.h.a();
        this.d = jui.a(this.d);
        b();
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        this.d = this.j.b(this.d, str);
        b();
    }

    /* renamed from: a */
    public final void takeTarget(jfs jfs) {
        akcr.b(jfs, "target");
        super.takeTarget(jfs);
        jfs.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.o) {
            Object obj = (jfs) getTarget();
            if (obj != null) {
                Context context;
                int i;
                akcr.a(obj, "target ?: return");
                e();
                jro a = juj.a(this.d);
                if (c()) {
                    jrl.a(this.e, obj.a());
                }
                if (this.a == defpackage.ahcb.b.TEXT) {
                    context = this.e;
                    i = R.string.signup_phone_alt_code_over_call;
                } else {
                    context = this.e;
                    i = R.string.signup_phone_alt_code_over_sms;
                }
                a(context.getString(i), new l(obj.d().getText()), new p(obj.d()));
                int i2 = 1;
                a(this.e.getString(R.string.signup_verify_phone_description_format, new Object[]{this.d.e}), new q(obj.c().getText()), new r(obj.c()));
                a(a.j, new s(obj.a().getText()), new t(obj.a()));
                a(Boolean.valueOf(a.d), new u(obj.a()), new v(obj.a()));
                a(a.a, new w(obj.b().getText()), new m(obj.b()));
                a(Integer.valueOf(akgb.a((CharSequence) a.a) ? 4 : 0), new n(obj.b()), new o(obj.b()));
                switch (jfr.b[a.b.ordinal()]) {
                    case 1:
                        i2 = 4;
                        break;
                    case 2:
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                    case 5:
                        i2 = 0;
                        break;
                    case 6:
                        i2 = 2;
                        break;
                    default:
                        throw new ajxk();
                }
                obj.f().a(i2, Integer.valueOf(a.l.c()));
                d();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(String str) {
        this.d = this.j.d(this.d, str);
        b();
    }

    public final void dropTarget() {
        Object obj = (jfs) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        jeb c = ((jbw) this.i.get()).c();
        this.m = c.D;
        Object a = defpackage.ahcb.b.a(c.G);
        akcr.a(a, "Method.fromValue(it.forgotPasswordVerifyMethod)");
        this.a = a;
        this.n = c.C;
        String str = c.F;
        String str2 = c.E;
        akcr.b(str, "requestedPhoneNumber");
        akcr.b(str2, "requestedCountryCode");
        jrm a2 = jrn.a();
        CharSequence charSequence = str;
        Appendable stringBuilder = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (Character.isDigit(charAt)) {
                stringBuilder.append(charAt);
            }
        }
        Object stringBuilder2 = ((StringBuilder) stringBuilder).toString();
        akcr.a(stringBuilder2, "filterTo(StringBuilder(), predicate).toString()");
        this.d = jrm.a(a2, null, null, stringBuilder2, str2, str, str2, null, false, null, null, null, true, null, null, 14147);
        this.h.a();
        zln zln = this;
        zln.bindTo$default(this, this.h.c.a((ajdw) this.p.l()).a((ajfb) new f(this), (ajfb) g.a), zln, null, null, 6, null);
        b();
        zln.bindTo$default(this, ((jun) this.k.get()).a().a((ajdw) this.p.l()).e((ajfb) new h(this)), zln, null, null, 6, null);
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.h.b();
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.o = true;
        e();
        ((jun) this.k.get()).a(this.e);
    }

    @defpackage.s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.o = false;
        d();
        Object p = ((jbw) this.i.get()).a().p(i.a);
        jun jun = (jun) this.k.get();
        akcr.a(p, "formatObservable");
        jun.a(p, this.e);
        b();
    }
}
