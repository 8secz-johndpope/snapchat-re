package com.snap.identity.ui.settings.passwordvalidation;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achd;
import defpackage.ahcj;
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
import defpackage.akxa;
import defpackage.ira;
import defpackage.itv;
import defpackage.j;
import defpackage.jnp;
import defpackage.jnt;
import defpackage.jof;
import defpackage.jog;
import defpackage.joh;
import defpackage.joi;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import defpackage.zpj;

public final class PasswordValidationPresenter extends zll<joi> implements k {
    String a;
    String b;
    boolean c;
    boolean d = true;
    boolean e = true;
    boolean f;
    final aipn<Context> g;
    final aipn<ira> h;
    final aipn<zgb> i;
    final aipn<jof> j;
    final aipn<jnp> k;
    final aipn<achb<zjm, zjk>> l;
    private boolean m;
    private boolean n = true;
    private final ajxe o = ajxh.a(new h(this));
    private final akbl<View, ajxw> p = new c(this);
    private final akbl<View, ajxw> q = new e(this);
    private final akbl<View, ajxw> r = new f(this);
    private final g s = new g(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class g implements TextWatcher {
        private /* synthetic */ PasswordValidationPresenter a;

        g(PasswordValidationPresenter passwordValidationPresenter) {
            this.a = passwordValidationPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PasswordValidationPresenter passwordValidationPresenter = this.a;
            passwordValidationPresenter.a = String.valueOf(charSequence);
            passwordValidationPresenter.b = "";
            passwordValidationPresenter.b();
        }
    }

    static final class d<T> implements ajfb<jnt> {
        private /* synthetic */ PasswordValidationPresenter a;

        d(PasswordValidationPresenter passwordValidationPresenter) {
            this.a = passwordValidationPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jnt jnt = (jnt) obj;
            this.a.f = jnt.a;
            if (this.a.f) {
                ((achb) this.a.l.get()).a(false);
            }
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ PasswordValidationPresenter a;

        c(PasswordValidationPresenter passwordValidationPresenter) {
            this.a = passwordValidationPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            PasswordValidationPresenter passwordValidationPresenter = this.a;
            passwordValidationPresenter.a(true);
            zln.bindTo$default(passwordValidationPresenter, ((ira) passwordValidationPresenter.h.get()).c(passwordValidationPresenter.a).a((ajdw) passwordValidationPresenter.a().l()).e((ajfb) new joh(new b(passwordValidationPresenter))), passwordValidationPresenter, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ PasswordValidationPresenter a;

        e(PasswordValidationPresenter passwordValidationPresenter) {
            this.a = passwordValidationPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            PasswordValidationPresenter passwordValidationPresenter = this.a;
            jnp jnp = (jnp) passwordValidationPresenter.k.get();
            Context context = (Context) jnp.f.get();
            Activity activity = (Activity) (!(context instanceof Activity) ? null : context);
            View currentFocus = activity != null ? activity.getCurrentFocus() : null;
            if (!(context == null || currentFocus == null)) {
                zpj.a(context, currentFocus.getWindowToken());
            }
            Object obj2 = jnp.f.get();
            akcr.a(obj2, "context.get()");
            Context context2 = (Context) obj2;
            obj2 = jnp.c.get();
            akcr.a(obj2, "navigationHost.get()");
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context2, (achb) obj2, jnp.b, false, null, 24).b((int) R.string.settings_forgot_password_dialog_description).a((int) R.string.settings_forgot_password_dialog_phone, (akbl) new defpackage.jnp.a(jnp), false).a((int) R.string.settings_forgot_password_dialog_email, (akbl) new defpackage.jnp.b(jnp), false), null, false, null, null, null, 31).a();
            ((achb) jnp.c.get()).a((achd) a, a.a, null);
            zln.bindTo$default(passwordValidationPresenter, jnp.a.a((ajdw) passwordValidationPresenter.a().l()).f((ajfb) new d(passwordValidationPresenter)), passwordValidationPresenter, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ PasswordValidationPresenter a;

        f(PasswordValidationPresenter passwordValidationPresenter) {
            this.a = passwordValidationPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            PasswordValidationPresenter passwordValidationPresenter = this.a;
            String str = "";
            passwordValidationPresenter.a = str;
            passwordValidationPresenter.b = str;
            passwordValidationPresenter.b();
            return ajxw.a;
        }
    }

    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ PasswordValidationPresenter a;

        h(PasswordValidationPresenter passwordValidationPresenter) {
            this.a = passwordValidationPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.i.get();
            return zgb.a(itv.c.callsite("PasswordValidationPresenter"));
        }
    }

    static final class b extends akcq implements akbl<akxa<ahcj>, ajxw> {
        b(PasswordValidationPresenter passwordValidationPresenter) {
            super(1, passwordValidationPresenter);
        }

        public final String getName() {
            return "onReauthResponse";
        }

        public final akej getOwner() {
            return akde.a(PasswordValidationPresenter.class);
        }

        public final String getSignature() {
            return "onReauthResponse(Lretrofit2/adapter/rxjava2/Result;)V";
        }

        /* JADX WARNING: Missing block: B:9:0x002b, code skipped:
            if (r3 == null) goto L_0x002d;
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (defpackage.akxa) r3;
            r0 = "p1";
            defpackage.akcr.b(r3, r0);
            r0 = r2.receiver;
            r0 = (com.snap.identity.ui.settings.passwordvalidation.PasswordValidationPresenter) r0;
            r1 = 0;
            r0.a(r1);
            r1 = r3.a();
            if (r1 == 0) goto L_0x003f;
        L_0x0015:
            r1 = r1.e();
            if (r1 != 0) goto L_0x003f;
        L_0x001b:
            r3 = r3.a();
            if (r3 == 0) goto L_0x002d;
        L_0x0021:
            r3 = r3.f();
            r3 = (defpackage.ahcj) r3;
            if (r3 == 0) goto L_0x002d;
        L_0x0029:
            r3 = r3.a;
            if (r3 != 0) goto L_0x0059;
        L_0x002d:
            r3 = r0.g;
            r3 = r3.get();
            r3 = (android.content.Context) r3;
            r1 = 2131888819; // 0x7f120ab3 float:1.9412284E38 double:1.053293026E-314;
            r3 = r3.getString(r1);
            r1 = "context.get().getString(…ssword_validation_failed)";
            goto L_0x0056;
        L_0x003f:
            r3 = r3.c();
            if (r3 == 0) goto L_0x005f;
        L_0x0045:
            r3 = r0.g;
            r3 = r3.get();
            r3 = (android.content.Context) r3;
            r1 = 2131887036; // 0x7f1203bc float:1.9408668E38 double:1.0532921453E-314;
            r3 = r3.getString(r1);
            r1 = "context.get().getString(…lt_error_try_again_later)";
        L_0x0056:
            defpackage.akcr.a(r3, r1);
        L_0x0059:
            r0.b = r3;
            r0.b();
            goto L_0x007f;
        L_0x005f:
            r3 = 1;
            r0.f = r3;
            r1 = r0.d;
            if (r1 == 0) goto L_0x0072;
        L_0x0066:
            r0 = r0.l;
            r0 = r0.get();
            r0 = (defpackage.achb) r0;
            r0.a(r3);
            goto L_0x007f;
        L_0x0072:
            r1 = r0.j;
            r1 = r1.get();
            r1 = (defpackage.jof) r1;
            r1.a(r3);
            r0.c = r3;
        L_0x007f:
            r3 = defpackage.ajxw.a;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.passwordvalidation.PasswordValidationPresenter$b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(PasswordValidationPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public PasswordValidationPresenter(aipn<Context> aipn, aipn<ira> aipn2, aipn<zgb> aipn3, aipn<jof> aipn4, aipn<jnp> aipn5, aipn<achb<zjm, zjk>> aipn6) {
        akcr.b(aipn, "context");
        akcr.b(aipn2, "identityApi");
        akcr.b(aipn3, "schedulersProvider");
        akcr.b(aipn4, "passwordValidationHelper");
        akcr.b(aipn5, "settingsForgotPasswordHelper");
        akcr.b(aipn6, "navigationHost");
        this.g = aipn;
        this.h = aipn2;
        this.i = aipn3;
        this.j = aipn4;
        this.k = aipn5;
        this.l = aipn6;
        String str = "";
        this.a = str;
        this.b = str;
    }

    private final void c() {
        Object obj = (joi) getTarget();
        if (obj != null) {
            akcr.a(obj, "target?: return");
            obj.f().setOnClickListener(null);
            obj.g().setOnClickListener(null);
            obj.d().setOnClickListener(null);
            obj.a().removeTextChangedListener(this.s);
        }
    }

    private final void d() {
        Object obj = (joi) getTarget();
        if (obj != null) {
            akcr.a(obj, "target?: return");
            obj.a().addTextChangedListener(this.s);
            obj.f().setOnClickListener(new jog(this.q));
            obj.g().setOnClickListener(new jog(this.p));
            obj.d().setOnClickListener(new jog(this.r));
        }
    }

    private final int e() {
        return this.m ? 1 : ((akgb.a((CharSequence) this.a) ^ 1) == 0 || !akgb.a(this.b)) ? 2 : 0;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.o.b();
    }

    /* renamed from: a */
    public final void takeTarget(joi joi) {
        akcr.b(joi, "target");
        super.takeTarget(joi);
        joi.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.m = z;
        b();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.n) {
            Object obj = (joi) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                c();
                int i = 8;
                if (akgb.a(this.b)) {
                    obj.b().setVisibility(8);
                    obj.d().setVisibility(8);
                } else {
                    obj.b().setVisibility(0);
                    obj.d().setVisibility(0);
                }
                if (obj.a().isEnabled() != (this.m ^ 1)) {
                    obj.a().setEnabled(this.m ^ 1);
                }
                if ((akcr.a(obj.a().getText().toString(), this.a) ^ 1) != 0) {
                    obj.a().setText(this.a);
                }
                if ((akcr.a(obj.b().getText().toString(), this.b) ^ 1) != 0) {
                    obj.b().setText(this.b);
                }
                TextView f = obj.f();
                if (this.e) {
                    i = 0;
                }
                f.setVisibility(i);
                obj.g().setState(e());
                d();
            }
        }
    }

    public final void dropTarget() {
        joi joi = (joi) getTarget();
        if (joi != null) {
            j lifecycle = joi.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onTargetDestroy() {
        if (!this.c) {
            ((jof) this.j.get()).a(this.f);
            this.c = true;
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        this.n = true;
        c();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        this.n = false;
        b();
    }
}
