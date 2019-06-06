package com.snap.identity.loginsignup.ui.pages.email;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aavk;
import defpackage.achb;
import defpackage.ahdj;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akcv;
import defpackage.akde;
import defpackage.akdq;
import defpackage.akdr;
import defpackage.akej;
import defpackage.aken;
import defpackage.akgb;
import defpackage.akgc;
import defpackage.ifs;
import defpackage.ifu;
import defpackage.iqe;
import defpackage.iqm;
import defpackage.ira;
import defpackage.isf;
import defpackage.ish;
import defpackage.jbh;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jes;
import defpackage.jet;
import defpackage.jeu;
import defpackage.jev;
import defpackage.jrl;
import defpackage.s;
import defpackage.tnj;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class EmailPresenter extends zll<jev> implements defpackage.k {
    private static /* synthetic */ aken[] j = new aken[]{new akcv(akde.a(EmailPresenter.class), "state", "getState$login_signup_release()Lcom/snap/identity/loginsignup/ui/pages/email/EmailState;")};
    final zfw a = zgb.a(jbv.y.callsite("LoginSignup.EmailPresenter"));
    final aipn<zke> b;
    final aipn<jbw> c;
    final aipn<ira> d;
    final tnj e;
    final aipn<iqe> f;
    final aipn<jbk> g;
    final aipn<isf> h;
    final aipn<Context> i;
    private final akdr k;
    private final c l;
    private final akbl<View, ajxw> m;
    private final akbl<View, ajxw> n;
    private final aipn<iqm> o;
    private final aipn<ifs> p;
    private final aipn<achb<zjm, zjk>> q;

    public static final class c implements TextWatcher {
        private /* synthetic */ EmailPresenter a;

        c(EmailPresenter emailPresenter) {
            this.a = emailPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EmailPresenter emailPresenter = this.a;
            String valueOf = String.valueOf(charSequence);
            if (valueOf != null) {
                emailPresenter.a(jeu.a(emailPresenter.a(), akgc.b(valueOf).toString(), "", false, false, false, 28));
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    static final class d<T> implements ajfb<String> {
        private /* synthetic */ EmailPresenter a;

        d(EmailPresenter emailPresenter) {
            this.a = emailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            akcr.a((Object) str, "defaultEmail");
            if (EmailPresenter.b(str) && akgb.a(this.a.a().a)) {
                this.a.a(str);
                ((jbk) this.a.g.get()).a(aavk.EMAIL);
                return;
            }
            this.a.a("");
        }
    }

    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ EmailPresenter a;

        e(EmailPresenter emailPresenter) {
            this.a = emailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a("");
        }
    }

    static final class f<T> implements ajfb<defpackage.ira.b<ahdj>> {
        private /* synthetic */ EmailPresenter a;

        f(EmailPresenter emailPresenter) {
            this.a = emailPresenter;
        }

        /* JADX WARNING: Missing block: B:12:0x011d, code skipped:
            if (r14 == null) goto L_0x0108;
     */
        public final /* synthetic */ void accept(java.lang.Object r14) {
            /*
            r13 = this;
            r14 = (defpackage.ira.b) r14;
            r0 = r13.a;
            r0 = r0.g;
            r0 = r0.get();
            r0 = (defpackage.jbk) r0;
            r1 = r14.a();
            r3 = r14.b;
            r3 = (defpackage.ahdj) r3;
            r3 = r3.a;
            r4 = "resp.body.logged";
            defpackage.akcr.a(r3, r4);
            r3 = r3.booleanValue();
            r4 = r14.b;
            r4 = (defpackage.ahdj) r4;
            r4 = r4.d;
            r5 = 0;
            if (r4 == 0) goto L_0x0033;
        L_0x0028:
            r4 = (java.lang.CharSequence) r4;
            r6 = "skipCaptcha";
            r6 = (java.lang.CharSequence) r6;
            r4 = defpackage.akgc.a(r4, r6, r5);
            goto L_0x0034;
        L_0x0033:
            r4 = 0;
        L_0x0034:
            r0.a(r1, r3, r4);
            r0 = r14.b;
            r0 = (defpackage.ahdj) r0;
            r0 = r0.a;
            r1 = java.lang.Boolean.TRUE;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x00ea;
        L_0x0045:
            r14 = r13.a;
            r6 = r14.a();
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 27;
            r0 = defpackage.jeu.a(r6, r7, r8, r9, r10, r11, r12);
            r14.a(r0);
            r14 = r13.a;
            r14 = r14.e;
            r14 = r14.b();
            r0 = defpackage.jic.PENDING_EMAIL;
            r0 = (defpackage.fth) r0;
            r1 = r13.a;
            r1 = r1.a();
            r1 = r1.a;
            r14 = r14.a(r0, r1);
            r14.b();
            r14 = r13.a;
            r14 = r14.f;
            r14 = r14.get();
            r14 = (defpackage.iqe) r14;
            r14.b(r5);
            r14 = r13.a;
            r14 = r14.g;
            r14 = r14.get();
            r14 = (defpackage.jbk) r14;
            r0 = new aawm;
            r0.<init>();
            r14 = r14.a();
            r0 = (defpackage.aajt) r0;
            r14.a(r0);
            r14 = r13.a;
            r14 = r14.g;
            r14 = r14.get();
            r14 = (defpackage.jbk) r14;
            r0 = new aaxa;
            r0.<init>();
            r1 = r14.b();
            r1 = r1.c();
            r1 = r1.n;
            r0.b(r1);
            r1 = r14.c();
            r1 = r1.a();
            r1 = r1.b;
            r1 = java.lang.Boolean.valueOf(r1);
            r0.d(r1);
            r14 = r14.a();
            r0 = (defpackage.aajt) r0;
            r14.a(r0);
            r14 = r13.a;
            r14 = r14.b;
            r14 = r14.get();
            r14 = (defpackage.zke) r14;
            r0 = new izw;
            r1 = r13.a;
            r1 = r1.a();
            r1 = r1.a;
            r0.<init>(r1);
            r14.a(r0);
            return;
        L_0x00ea:
            r0 = r13.a;
            r0 = r0.g;
            r0 = r0.get();
            r0 = (defpackage.jbk) r0;
            r0.e();
            r0 = r14.b;
            r0 = (defpackage.ahdj) r0;
            r0 = r0.c;
            r0 = (java.lang.CharSequence) r0;
            r0 = android.text.TextUtils.isEmpty(r0);
            r1 = 2131887127; // 0x7f120417 float:1.9408852E38 double:1.0532921903E-314;
            if (r0 == 0) goto L_0x0117;
        L_0x0108:
            r14 = r13.a;
            r14 = r14.i;
            r14 = r14.get();
            r14 = (android.content.Context) r14;
            r14 = r14.getString(r1);
            goto L_0x0120;
        L_0x0117:
            r14 = r14.b;
            r14 = (defpackage.ahdj) r14;
            r14 = r14.c;
            if (r14 != 0) goto L_0x0120;
        L_0x011f:
            goto L_0x0108;
        L_0x0120:
            r2 = r14;
            r14 = r13.a;
            r0 = r14.a();
            r1 = 0;
            r3 = "errorMessage";
            defpackage.akcr.a(r2, r3);
            r3 = 0;
            r4 = 0;
            r5 = 0;
            r6 = 25;
            r0 = defpackage.jeu.a(r0, r1, r2, r3, r4, r5, r6);
            r14.a(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.email.EmailPresenter$f.accept(java.lang.Object):void");
        }
    }

    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ EmailPresenter a;

        g(EmailPresenter emailPresenter) {
            this.a = emailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((jbk) this.a.g.get()).e();
            ((jbk) this.a.g.get()).a(-1, false, false);
            EmailPresenter emailPresenter = this.a;
            jeu a = emailPresenter.a();
            Object string = ((Context) this.a.i.get()).getString(R.string.email_save_error);
            akcr.a(string, "context.get().getString(….string.email_save_error)");
            emailPresenter.a(jeu.a(a, null, string, false, false, false, 25));
        }
    }

    public static final class a extends akdq<jeu> {
        private /* synthetic */ Object a;
        private /* synthetic */ EmailPresenter b;

        public a(Object obj, Object obj2, EmailPresenter emailPresenter) {
            this.a = obj;
            this.b = emailPresenter;
            super(obj2);
        }

        public final void a(aken<?> aken, jeu jeu) {
            akcr.b(aken, "property");
            jeu = jeu;
            EmailPresenter emailPresenter = this.b;
            emailPresenter.c();
            String str = "state";
            akcr.b(jeu, str);
            Object obj = (jev) emailPresenter.getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                akcr.b(jeu, str);
                int i = 0;
                Object obj2 = (EmailPresenter.b(jeu.a) && akgb.a(jeu.b)) ? 1 : null;
                obj2 = (jeu.e && !jeu.c && jeu.d && obj2 == null) ? 1 : null;
                if (obj2 != null) {
                    obj2 = emailPresenter.i.get();
                    akcr.a(obj2, "context.get()");
                    jrl.a((Context) obj2, obj.b());
                }
                if ((akcr.a(obj.b().getText().toString(), jeu.a) ^ 1) != 0) {
                    obj.b().setText(jeu.a);
                    obj.b().setSelection(jeu.a.length());
                }
                jrl.a(jeu.b, new i(obj.d().getText()), new j(obj.d()));
                jrl.a(Integer.valueOf((((CharSequence) jeu.b).length() > 0 ? 1 : null) != null ? 0 : 4), new k(obj.d()), new l(obj.d()));
                jrl.a(Boolean.valueOf(jeu.c ^ 1), new m(obj.b()), new n(obj.b()));
                if (jeu.c) {
                    i = 2;
                } else if (EmailPresenter.b(jeu.a) && akgb.a(jeu.b)) {
                    i = 1;
                }
                jrl.a(Integer.valueOf(i), new jes(obj.c()), new o(obj.c()));
            }
            if (jeu.e) {
                emailPresenter.a(jeu.a(emailPresenter.a(), null, null, false, false, false, 15));
            }
            emailPresenter.b();
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ EmailPresenter a;

        b(EmailPresenter emailPresenter) {
            this.a = emailPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            EmailPresenter emailPresenter = this.a;
            if (EmailPresenter.b(emailPresenter.a().a)) {
                emailPresenter.a(jeu.a(emailPresenter.a(), null, null, true, false, false, 27));
                ((isf) emailPresenter.h.get()).a(aaoo.SIGNUP_EMAIL_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
                zln.bindTo$default(emailPresenter, ((ira) emailPresenter.d.get()).b(emailPresenter.a().a).a((ajdw) emailPresenter.a.l()).a((ajfb) new f(emailPresenter), (ajfb) new g(emailPresenter)), emailPresenter, null, null, 6, null);
            } else {
                jeu a = emailPresenter.a();
                Object string = ((Context) emailPresenter.i.get()).getString(R.string.signup_email_invalid);
                akcr.a(string, "context.get().getString(…ing.signup_email_invalid)");
                emailPresenter.a(jeu.a(a, null, string, false, false, false, 29));
            }
            return ajxw.a;
        }
    }

    static final class h extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ EmailPresenter a;

        h(EmailPresenter emailPresenter) {
            this.a = emailPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            EmailPresenter emailPresenter = this.a;
            ((jbw) emailPresenter.c.get()).f(emailPresenter.a().a);
            ((zke) emailPresenter.b.get()).a(new jbh());
            return ajxw.a;
        }
    }

    static final class i extends akcq implements akbk<String> {
        i(CharSequence charSequence) {
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

    static final class j extends akcq implements akbl<CharSequence, ajxw> {
        j(TextView textView) {
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

    static final class k extends akcq implements akbk<Integer> {
        k(TextView textView) {
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

    static final class l extends akcq implements akbl<Integer, ajxw> {
        l(TextView textView) {
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

    static final class m extends akcq implements akbk<Boolean> {
        m(EditText editText) {
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

    static final class n extends akcq implements akbl<Boolean, ajxw> {
        n(EditText editText) {
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

    static final class o extends akcq implements akbl<Integer, ajxw> {
        o(ProgressButton progressButton) {
            super(1, progressButton);
        }

        public final String getName() {
            return "setState";
        }

        public final akej getOwner() {
            return akde.a(ProgressButton.class);
        }

        public final String getSignature() {
            return "setState(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ProgressButton) this.receiver).setState(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    public EmailPresenter(aipn<zke> aipn, zgb zgb, aipn<jbw> aipn2, aipn<ira> aipn3, aipn<iqm> aipn4, aipn<ifs> aipn5, tnj tnj, aipn<iqe> aipn6, aipn<jbk> aipn7, aipn<achb<zjm, zjk>> aipn8, aipn<isf> aipn9, aipn<Context> aipn10) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn2, "store");
        akcr.b(aipn3, "identityApi");
        akcr.b(aipn4, "contactApi");
        akcr.b(aipn5, "permissionHelper");
        akcr.b(tnj, "prefs");
        akcr.b(aipn6, "settingsAnalytics");
        akcr.b(aipn7, "loginSignupAnalytics");
        akcr.b(aipn8, "navigationHost");
        akcr.b(aipn9, "stateTransitionService");
        akcr.b(aipn10, "context");
        this.b = aipn;
        this.c = aipn2;
        this.d = aipn3;
        this.o = aipn4;
        this.p = aipn5;
        this.e = tnj;
        this.f = aipn6;
        this.g = aipn7;
        this.q = aipn8;
        this.h = aipn9;
        this.i = aipn10;
        jeu jeu = new jeu();
        this.k = new a(jeu, jeu, this);
        this.l = new c(this);
        this.m = new b(this);
        this.n = new h(this);
    }

    public static boolean b(String str) {
        akcr.b(str, "email");
        CharSequence charSequence = str;
        return (charSequence.length() > 0 ? 1 : null) != null && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    public final jeu a() {
        return (jeu) this.k.a(this, j[0]);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        a(jeu.a(a(), str, "", false, true, true, 4));
    }

    public final void a(jeu jeu) {
        akcr.b(jeu, "<set-?>");
        this.k.a(this, j[0], jeu);
    }

    /* renamed from: a */
    public final void takeTarget(jev jev) {
        akcr.b(jev, "target");
        super.takeTarget(jev);
        jev.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        jev jev = (jev) getTarget();
        if (jev != null) {
            jev.a().setOnClickListener(new jet(this.n));
            jev.b().addTextChangedListener(this.l);
            jev.c().setOnClickListener(new jet(this.m));
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        jev jev = (jev) getTarget();
        if (jev != null) {
            jev.a().setOnClickListener(null);
            jev.b().removeTextChangedListener(this.l);
            jev.c().setOnClickListener(null);
        }
    }

    public final void dropTarget() {
        Object obj = (jev) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        if (!a().d) {
            jeb c = ((jbw) this.c.get()).c();
            if (b(c.u)) {
                a(c.u);
                return;
            }
            if (((achb) this.q.get()).c()) {
                iqm iqm = (iqm) this.o.get();
                Object obj = this.i.get();
                if (obj != null) {
                    Activity activity = (Activity) obj;
                    Object obj2 = this.p.get();
                    akcr.a(obj2, "permissionHelper.get()");
                    zln.bindTo$default(this, iqm.b(activity, (ifs) obj2, this.a, ifu.REG_EMAIL).a((ajdw) this.a.l()).a((ajfb) new d(this), (ajfb) new e(this)), this, null, null, 6, null);
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        c();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        b();
    }
}
