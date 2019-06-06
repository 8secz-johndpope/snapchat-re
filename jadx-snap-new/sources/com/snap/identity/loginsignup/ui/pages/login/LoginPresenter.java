package com.snap.identity.loginsignup.ui.pages.login;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snapchat.android.R;
import defpackage.aamh;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.achb;
import defpackage.achd;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajex;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajwa;
import defpackage.ajxk;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.akgc;
import defpackage.ftl;
import defpackage.iqj;
import defpackage.iql;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jdt;
import defpackage.jdw;
import defpackage.jdz;
import defpackage.jea;
import defpackage.jeb;
import defpackage.jfw;
import defpackage.jfx;
import defpackage.jfy;
import defpackage.jga;
import defpackage.jrk;
import defpackage.jrl;
import defpackage.ojl;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import defpackage.zzr;
import java.util.concurrent.Callable;

public final class LoginPresenter extends zll<jga> implements defpackage.k {
    String a;
    String b;
    String c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    final zfw i = zgb.a(jbv.y.callsite("LoginSignup.LoginPresenter"));
    aipn<achb<zjm, zjk>> j;
    final aipn<Context> k;
    final aipn<jbk> l;
    final aipn<iqj> m;
    final jfy n;
    final aipn<jbw> o;
    final aipn<isf> p;
    private boolean q = true;
    private final z r = new z(this);
    private final l s = new l(this);
    private final akbl<View, ajxw> t = new d(this);
    private final aipn<zke> u;
    private final aipn<jrk> v;
    private final aipn<jea> w;
    private final aipn<ojl> x;
    private final aipn<jdt> y;
    private final aipn<ftl> z;

    static final class a implements OnClickListener {
        private /* synthetic */ LoginPresenter a;

        a(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final void onClick(View view) {
            defpackage.zgy.a a;
            LoginPresenter loginPresenter = this.a;
            jrl.a((Context) loginPresenter.k.get());
            String str = "navigationHost.get()";
            String str2 = "context.get()";
            Object obj;
            if (akgb.a(loginPresenter.a)) {
                zjm zjm = new zjm(jbv.y, "forgot_password_empty_user_name", false, false, true, false, null, false, false, false, false, null, 4076);
                Object obj2 = loginPresenter.k.get();
                akcr.a(obj2, str2);
                Context context = (Context) obj2;
                obj = loginPresenter.j.get();
                akcr.a(obj, str);
                a = new defpackage.zgy.a(context, (achb) obj, zjm, false, null, 24).b((int) R.string.reset_password_empty_username).a((int) R.string.okay, (akbl) i.a, true);
            } else {
                ((jbw) loginPresenter.o.get()).m(((jbw) loginPresenter.o.get()).i());
                jbk jbk = (jbk) loginPresenter.l.get();
                zzr zzr = new zzr();
                zzr.a(Boolean.valueOf(jbk.m()));
                zzr.a(jbk.b().c().c);
                zzr.b(((isc) jbk.g.get()).a());
                jbk.a().a(zzr);
                zjm zjm2 = new zjm(jbv.y, "forgot_password_choose_method", false, false, true, false, null, false, false, false, false, null, 4076);
                Object obj3 = loginPresenter.k.get();
                akcr.a(obj3, str2);
                Context context2 = (Context) obj3;
                obj = loginPresenter.j.get();
                akcr.a(obj, str);
                a = defpackage.zgy.a.a(new defpackage.zgy.a(context2, (achb) obj, zjm2, false, null, 24).b((int) R.string.reset_password_choice).a((int) R.string.reset_password_text, (akbl) new w(loginPresenter), true).a((int) R.string.reset_password_email, (akbl) new x(loginPresenter), true), null, false, null, null, null, 31);
            }
            zgy a2 = a.a();
            ((achb) loginPresenter.j.get()).a((achd) a2, a2.a, null);
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ LoginPresenter a;

        b(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final void onClick(View view) {
            LoginPresenter.a(this.a, false);
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ LoginPresenter a;

        c(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final void onClick(View view) {
            LoginPresenter.a(this.a, true);
        }
    }

    public static final class l implements TextWatcher {
        private /* synthetic */ LoginPresenter a;

        l(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.a(String.valueOf(charSequence));
        }
    }

    public static final class z implements TextWatcher {
        private /* synthetic */ LoginPresenter a;

        z(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LoginPresenter loginPresenter = this.a;
            String valueOf = String.valueOf(charSequence);
            if (valueOf != null) {
                loginPresenter.a = akgc.b(valueOf).toString();
                loginPresenter.c = "";
                loginPresenter.a();
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    static final class e<T1, T2, R> implements ajex<jeb, jdz, ajxm<? extends String, ? extends String>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            jeb jeb = (jeb) obj;
            jdz jdz = (jdz) obj2;
            akcr.b(jeb, "session");
            akcr.b(jdz, "persistentSession");
            return new ajxm(jeb.a, jdz.c);
        }
    }

    static final class f<T> implements ajfb<ajxm<? extends String, ? extends String>> {
        private /* synthetic */ LoginPresenter a;

        f(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "usernames");
            LoginPresenter loginPresenter = this.a;
            String str = (String) ajxm.a;
            String str2 = (String) ajxm.b;
            if ((akgb.a(loginPresenter.a) ^ 1) != 0) {
                str = loginPresenter.a;
            } else if ((akgb.a(str) ^ 1) == 0) {
                str = (akgb.a((CharSequence) str2) ^ 1) != 0 ? str2 : "";
            }
            loginPresenter.a = str;
            loginPresenter.a();
        }
    }

    static final class g<T> implements ajfb<ajxm<? extends Boolean, ? extends defpackage.jdw.a>> {
        private /* synthetic */ LoginPresenter a;

        g(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            LoginPresenter loginPresenter = this.a;
            defpackage.jdw.a aVar = (defpackage.jdw.a) ajxm.b;
            boolean z = false;
            if (aVar != null) {
                int i = jfw.a[aVar.ordinal()];
                if (i == 1) {
                    obj = ajxm.a;
                    akcr.a(obj, "it.first");
                    z = ((Boolean) obj).booleanValue();
                } else if (i == 2) {
                    z = true;
                } else if (i != 3) {
                    throw new ajxk();
                }
            }
            loginPresenter.h = z;
        }
    }

    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class k<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ LoginPresenter a;
        private /* synthetic */ boolean b;

        /* renamed from: com.snap.identity.loginsignup.ui.pages.login.LoginPresenter$k$3 */
        static final class AnonymousClass3<T> implements ajfb<ajxm<? extends iql, ? extends Throwable>> {
            private /* synthetic */ k a;

            AnonymousClass3(k kVar) {
                this.a = kVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                ajxm ajxm = (ajxm) obj;
                iql iql = (iql) ajxm.a;
                Throwable th = (Throwable) ajxm.b;
                if (iql != null) {
                    LoginPresenter loginPresenter = this.a.a;
                    loginPresenter.n.a(iql);
                    loginPresenter.d = false;
                    loginPresenter.e = true;
                    loginPresenter.a();
                } else if (th != null) {
                    LoginPresenter loginPresenter2 = this.a.a;
                    loginPresenter2.c = loginPresenter2.n.a(th, (akbk) new j(loginPresenter2)).a;
                    loginPresenter2.d = false;
                    loginPresenter2.a();
                } else {
                    throw new IllegalStateException("Event did not contain value or throwable");
                }
            }
        }

        k(LoginPresenter loginPresenter, boolean z) {
            this.a = loginPresenter;
            this.b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx e;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldLogin");
            if (bool.booleanValue()) {
                ((jbk) this.a.l.get()).k();
                ((isf) this.a.p.get()).a(aaoo.LOGIN_OPERATION_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
                this.a.a();
                e = ((iqj) this.a.m.get()).a(defpackage.iqj.a.a().a(this.a.a).b(this.a.b).a(this.b).a(), (isf) this.a.p.get()).a((ajdw) this.a.i.l()).f(AnonymousClass1.a).g(AnonymousClass2.a).c((ajfb) new AnonymousClass3(this)).e();
            } else {
                LoginPresenter loginPresenter = this.a;
                loginPresenter.d = false;
                loginPresenter.a();
                e = ajvo.a(ajhn.a);
            }
            return e;
        }
    }

    static final class y<T> implements ajfb<Boolean> {
        private /* synthetic */ LoginPresenter a;

        y(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, Property.VISIBLE);
            if (obj.booleanValue()) {
                this.a.a();
            }
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginPresenter a;

        d(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.a(false);
            return ajxw.a;
        }
    }

    static final class i extends akcs implements akbl<View, ajxw> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginPresenter a;

        w(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            LoginPresenter.a(this.a, aamh.PHONE);
            return ajxw.a;
        }
    }

    static final class x extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ LoginPresenter a;

        x(LoginPresenter loginPresenter) {
            this.a = loginPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            LoginPresenter.a(this.a, aamh.EMAIL);
            return ajxw.a;
        }
    }

    static final class j extends akcq implements akbk<ajxw> {
        j(LoginPresenter loginPresenter) {
            super(0, loginPresenter);
        }

        public final String getName() {
            return "loginWithReactivationConfirmed";
        }

        public final akej getOwner() {
            return akde.a(LoginPresenter.class);
        }

        public final String getSignature() {
            return "loginWithReactivationConfirmed()V";
        }

        public final /* synthetic */ Object invoke() {
            ((LoginPresenter) this.receiver).a(true);
            return ajxw.a;
        }
    }

    static final class m extends akcq implements akbk<Integer> {
        m(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class n extends akcq implements akbl<Integer, ajxw> {
        n(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setInputType";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setInputType(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setInputType(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class o extends akcq implements akbl<Integer, ajxw> {
        o(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class p extends akcq implements akbk<Integer> {
        p(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class q extends akcq implements akbl<Integer, ajxw> {
        q(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class r extends akcq implements akbk<Integer> {
        r(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class s extends akcq implements akbl<Integer, ajxw> {
        s(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class t extends akcq implements akbk<Integer> {
        t(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class u extends akcq implements akbl<Integer, ajxw> {
        u(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class v extends akcq implements akbk<Integer> {
        v(EditText editText) {
            super(0, editText);
        }

        public final String getName() {
            return "getInputType";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "getInputType()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((EditText) this.receiver).getInputType());
        }
    }

    public LoginPresenter(aipn<zke> aipn, aipn<achb<zjm, zjk>> aipn2, aipn<Context> aipn3, aipn<jrk> aipn4, aipn<jbk> aipn5, aipn<iqj> aipn6, jfy jfy, aipn<jbw> aipn7, aipn<jea> aipn8, aipn<isf> aipn9, aipn<ojl> aipn10, aipn<jdt> aipn11, aipn<ftl> aipn12, zgb zgb) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "navigationHost");
        akcr.b(aipn3, "context");
        akcr.b(aipn4, "intentFactory");
        akcr.b(aipn5, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn6, "authApi");
        akcr.b(jfy, "loginResponseHandler");
        akcr.b(aipn7, "store");
        akcr.b(aipn8, "persistentSessionService");
        akcr.b(aipn9, "stateTransitionService");
        akcr.b(aipn10, "memoriesUserDataController");
        akcr.b(aipn11, "showHideLookup");
        akcr.b(aipn12, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        this.u = aipn;
        this.j = aipn2;
        this.k = aipn3;
        this.v = aipn4;
        this.l = aipn5;
        this.m = aipn6;
        this.n = jfy;
        this.o = aipn7;
        this.w = aipn8;
        this.p = aipn9;
        this.x = aipn10;
        this.y = aipn11;
        this.z = aipn12;
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
    }

    private final boolean b() {
        return (!this.f || this.d || this.g) ? false : true;
    }

    private final void c() {
        jga jga = (jga) getTarget();
        if (jga != null) {
            jga.a().addTextChangedListener(this.r);
            jga.b().addTextChangedListener(this.s);
            jga.d().setOnClickListener(new jfx(this.t));
            jga.f().setOnClickListener(new a(this));
            jga.h().setOnClickListener(new b(this));
            jga.g().setOnClickListener(new c(this));
        }
    }

    private final void d() {
        jga jga = (jga) getTarget();
        if (jga != null) {
            jga.a().removeTextChangedListener(this.r);
            jga.b().removeTextChangedListener(this.s);
            jga.d().setOnClickListener(null);
            jga.f().setOnClickListener(null);
            jga.h().setOnClickListener(null);
            jga.g().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        Object obj = (jga) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            if (obj.I_()) {
                akbk pVar;
                q qVar;
                Object obj2 = this.a;
                int i = 0;
                boolean z = (this.d || this.e) ? false : true;
                Object obj3 = this.b;
                Object obj4 = this.c;
                CharSequence charSequence = (CharSequence) obj4;
                int i2 = (akgb.a(charSequence) ^ 1) != 0 ? 0 : 8;
                CharSequence charSequence2 = (CharSequence) obj2;
                Object obj5 = ((akgb.a(charSequence2) ^ 1) == 0 || (akgb.a((CharSequence) obj3) ^ 1) == 0) ? null : 1;
                int i3 = (this.d || this.e) ? 2 : obj5 != null ? 1 : 0;
                d();
                if ((akcr.a(obj.a().getText().toString(), obj2) ^ 1) != 0) {
                    obj.a().setText(charSequence2);
                }
                if ((akcr.a(obj.b().getText().toString(), obj3) ^ 1) != 0) {
                    obj.b().setText((CharSequence) obj3);
                }
                if (obj.a().isEnabled() != z) {
                    obj.a().setEnabled(z);
                }
                if (obj.b().isEnabled() != z) {
                    obj.b().setEnabled(z);
                }
                if (b()) {
                    obj2 = this.k.get();
                    akcr.a(obj2, "context.get()");
                    jrl.a((Context) obj2, obj.a());
                }
                if ((akcr.a(obj.c().getText().toString(), obj4) ^ 1) != 0) {
                    obj.c().setText(charSequence);
                }
                if (obj.c().getVisibility() != i2) {
                    obj.c().setVisibility(i2);
                }
                if (this.h) {
                    jrl.a(Integer.valueOf(this.q ? 0 : 8), new m(obj.h()), new o(obj.h()));
                    if (this.q) {
                        i = 8;
                    }
                    obj2 = Integer.valueOf(i);
                    pVar = new p(obj.g());
                    qVar = new q(obj.g());
                } else {
                    jrl.a(Integer.valueOf(8), new r(obj.h()), new s(obj.h()));
                    obj2 = Integer.valueOf(8);
                    pVar = new t(obj.g());
                    qVar = new u(obj.g());
                }
                jrl.a(obj2, pVar, qVar);
                jrl.a(Integer.valueOf(this.q ? 129 : 145), new v(obj.b()), new n(obj.b()));
                obj.d().setState(i3);
                c();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        this.b = str;
        this.c = "";
        a();
    }

    /* renamed from: a */
    public final void takeTarget(jga jga) {
        akcr.b(jga, "target");
        super.takeTarget(jga);
        jga.getLifecycle().a(this);
        zln.bindTo$default(this, jga.J_().a((ajdw) this.i.l()).f((ajfb) new y(this)), this, null, null, 6, null);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.d = true;
        zln.bindTo$default(this, ((ojl) this.x.get()).a(this.a, this.j).a((ajdw) this.i.l()).e((ajfc) new k(this, z)).a((ajdw) this.i.l()).e(), this, null, null, 6, null);
    }

    public final void dropTarget() {
        Object obj = (jga) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        zln zln = this;
        zln.bindTo$default(this, ajdp.a((ajdt) ((jbw) this.o.get()).a(), (ajdt) ((jea) this.w.get()).b().i(), (ajex) e.a).a((ajdw) this.i.l()).b((ajdw) this.i.h()).f((ajfb) new f(this)), zln, null, null, 6, null);
        jdt jdt = (jdt) this.y.get();
        Object b = ajdx.c((Callable) new defpackage.jdt.b(jdt)).b((ajdw) jdt.a.f());
        akcr.a(b, "Single.fromCallable { ex…scribeOn(schedulers.io())");
        b = b.i();
        akcr.a(b, "showHideLookup.get().sho…owToggle().toObservable()");
        Object v = ((ftl) this.z.get()).v(jdw.SHOW_HIDE_TOGGLE);
        akcr.a(v, "configProvider.get().obs…tionKey.SHOW_HIDE_TOGGLE)");
        zln.bindTo$default(this, ajwa.b(b, v).a((ajdw) this.i.l()).a((ajfb) new g(this), (ajfb) h.a), zln, null, null, 6, null);
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onEnd() {
        ((jbw) this.o.get()).a(this.a);
    }
}
