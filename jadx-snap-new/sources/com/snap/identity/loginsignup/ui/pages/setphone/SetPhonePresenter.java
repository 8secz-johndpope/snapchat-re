package com.snap.identity.loginsignup.ui.pages.setphone;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aavk;
import defpackage.aawt;
import defpackage.aaxb;
import defpackage.aaxp;
import defpackage.achb;
import defpackage.ahcd;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.ifs;
import defpackage.ifu;
import defpackage.ilv;
import defpackage.iok;
import defpackage.iqn;
import defpackage.ira;
import defpackage.irr;
import defpackage.irs;
import defpackage.irx;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.jaw;
import defpackage.jax;
import defpackage.jay;
import defpackage.jbg;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jed;
import defpackage.jgs;
import defpackage.jgt;
import defpackage.jrl;
import defpackage.juk;
import defpackage.jun;
import defpackage.juo;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class SetPhonePresenter extends zll<jgt> implements defpackage.k {
    String a;
    String b;
    String c;
    boolean d;
    boolean e;
    final zfw f = zgb.a(jbv.y.callsite(jbv.n.b()));
    boolean g;
    boolean h;
    boolean i;
    final aipn<zke> j;
    final aipn<jbw> k;
    final aipn<ira> l;
    final Context m;
    final jbk n;
    final aipn<isf> o;
    final aipn<jun> p;
    final aipn<achb<zjm, zjk>> q;
    private boolean r = true;
    private final akbl<View, ajxw> s = new b(this);
    private final akbl<View, ajxw> t = new c(this);
    private final akbl<View, ajxw> u = new l(this);
    private final aipn<ifs> v;
    private final aipn<jed> w;

    static final class d<T> implements ajfb<jeb> {
        private /* synthetic */ SetPhonePresenter a;

        d(SetPhonePresenter setPhonePresenter) {
            this.a = setPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jeb jeb = (jeb) obj;
            this.a.e = jeb.K;
            this.a.a();
        }
    }

    static final class e<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ SetPhonePresenter a;

        e(SetPhonePresenter setPhonePresenter) {
            this.a = setPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            jbk jbk = this.a.n;
            long a = bVar.a();
            Object obj2 = ((ahcd) bVar.b).b;
            String str = "response.body.logged";
            akcr.a(obj2, str);
            jbk.a(a, obj2.booleanValue());
            this.a.d = false;
            Object obj3 = ((ahcd) bVar.b).b;
            akcr.a(obj3, str);
            SetPhonePresenter setPhonePresenter;
            if (obj3.booleanValue()) {
                setPhonePresenter = this.a;
                ahcd ahcd = (ahcd) bVar.b;
                jbw jbw = (jbw) setPhonePresenter.k.get();
                String str2 = ahcd.e;
                if (str2 == null) {
                    str2 = "";
                }
                jbw.n(str2);
                if (akcr.a(juk.a, ahcd.d)) {
                    ((jun) setPhonePresenter.p.get()).a(setPhonePresenter.m);
                    ((zke) setPhonePresenter.j.get()).a(new jax(setPhonePresenter.a, setPhonePresenter.b));
                    return;
                }
                ((zke) setPhonePresenter.j.get()).a(new jaw(setPhonePresenter.a, setPhonePresenter.b));
                return;
            }
            setPhonePresenter = this.a;
            String str3 = ((ahcd) bVar.b).a;
            if (str3 == null) {
                str3 = this.a.m.getString(R.string.default_error_try_again_later);
                akcr.a((Object) str3, "context.getString(R.stri…lt_error_try_again_later)");
            }
            setPhonePresenter.c = str3;
            this.a.a();
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ SetPhonePresenter a;

        f(SetPhonePresenter setPhonePresenter) {
            this.a = setPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.n.a(-1, false);
            SetPhonePresenter setPhonePresenter = this.a;
            setPhonePresenter.d = false;
            Object string = setPhonePresenter.m.getString(R.string.default_error_try_again_later);
            akcr.a(string, "context.getString(R.stri…lt_error_try_again_later)");
            setPhonePresenter.c = string;
            this.a.a();
        }
    }

    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            jeb jeb = (jeb) obj;
            akcr.b(jeb, "it");
            return jeb.I;
        }
    }

    static final class h<T> implements ajfb<irs> {
        private /* synthetic */ SetPhonePresenter a;

        h(SetPhonePresenter setPhonePresenter) {
            this.a = setPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            irs irs = (irs) obj;
            akcr.b(irs, "autofillState");
            this.a.a = irs.b;
            if (irs.d == irr.SIM) {
                this.a.n.a(aavk.PHONE_NUMBER);
            }
            this.a.b = irs.c;
            if (irs.e == iqn.SIM || irs.e == iqn.LOCALE) {
                this.a.n.a(aavk.COUNTRY_CODE);
            }
            ((isf) this.a.o.get()).a(aaoo.SIGNUP_SET_PHONE_AUTOFILL_COMPLETE, aaop.INTERNAL_PROCESS, ish.SIGNUP);
            jbk jbk = this.a.n;
            irr irr = irs.d;
            iqn iqn = irs.e;
            String str = this.a.b;
            akcr.b(irr, "phoneSource");
            akcr.b(iqn, "countryCodeSource");
            akcr.b(str, "countryCode");
            irx a = irx.a(str);
            if (!(akgb.a(jbk.b().c().n) || a == irx.INVALID)) {
                String str2 = "is_og";
                String str3 = "phone_source";
                String str4 = "country_source";
                ((ilv) jbk.f.get()).c(iok.SIGNUP_PHONE_COUNTRY_SOURCE.a(str2, false).a(str3, irr.name()).a(str4, iqn.name()), 1);
                String str5 = "country";
                ((ilv) jbk.f.get()).c(iok.SIGNUP_PHONE_SOURCE.a(str2, false).a(str3, irr.name()).a(str5, a.name()), 1);
                ((ilv) jbk.f.get()).c(iok.SIGNUP_COUNTRY_SOURCE.a(str2, false).a(str4, iqn.name()).a(str5, a.name()), 1);
            }
            SetPhonePresenter setPhonePresenter = this.a;
            setPhonePresenter.g = true;
            setPhonePresenter.h = true;
            setPhonePresenter.a();
            this.a.h = false;
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SetPhonePresenter a;

        b(SetPhonePresenter setPhonePresenter) {
            this.a = setPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            zln zln = this.a;
            zln.d = true;
            jbk jbk = zln.n;
            aaxb aaxb = new aaxb();
            aaxb.d(Boolean.valueOf(jbk.m()));
            aaxb.b(jbk.b().c().n);
            aaxb.a(((isc) jbk.g.get()).a());
            jbk.a().a(aaxb);
            ((ilv) jbk.f.get()).c(iok.SIGNUP_PHONE_CODE_SENT.a("is_og", false).a("new_device", 1 ^ jbk.m()), 1);
            jbk jbk2 = zln.n;
            aawt aawt = new aawt();
            aawt.a(aaxp.V2);
            aawt.a(((isc) jbk2.g.get()).a());
            jbk2.a().a(aawt);
            Object p = ((jbw) zln.k.get()).a().p(g.a);
            ((isf) zln.o.get()).a(aaoo.SIGNUP_SET_PHONE_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
            jun jun = (jun) zln.p.get();
            akcr.a(p, "formatObservable");
            jun.a(p, zln.m);
            zln.bindTo$default(zln, ((ira) zln.l.get()).a(zln.a, zln.b, defpackage.ahcb.b.TEXT, defpackage.ahcb.c.REGISTRATION_TYPE).a((ajdw) zln.f.l()).a((ajfb) new e(zln), (ajfb) new f(zln)), zln, null, null, 6, null);
            zln.a();
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SetPhonePresenter a;

        c(SetPhonePresenter setPhonePresenter) {
            this.a = setPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((jun) this.a.p.get()).a(this.a.m);
            SetPhonePresenter setPhonePresenter = this.a;
            ((jbw) setPhonePresenter.k.get()).b(setPhonePresenter.b, setPhonePresenter.a);
            ((zke) setPhonePresenter.j.get()).a(new jbg());
            return ajxw.a;
        }
    }

    static final class l extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SetPhonePresenter a;

        l(SetPhonePresenter setPhonePresenter) {
            this.a = setPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((zke) this.a.j.get()).a(new jay());
            return ajxw.a;
        }
    }

    static final class a extends akcq implements akbw<String, String, ajxw> {
        a(SetPhonePresenter setPhonePresenter) {
            super(2, setPhonePresenter);
        }

        public final String getName() {
            return "onPhonePickerData";
        }

        public final akej getOwner() {
            return akde.a(SetPhonePresenter.class);
        }

        public final String getSignature() {
            return "onPhonePickerData(Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            akcr.b(str, "p1");
            akcr.b(str2, "p2");
            SetPhonePresenter setPhonePresenter = (SetPhonePresenter) this.receiver;
            setPhonePresenter.a = str2;
            setPhonePresenter.b = str;
            setPhonePresenter.c = "";
            setPhonePresenter.a();
            return ajxw.a;
        }
    }

    static final class j extends akcq implements akbk<Integer> {
        j(View view) {
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

    static final class k extends akcq implements akbl<Integer, ajxw> {
        k(View view) {
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

    public SetPhonePresenter(aipn<zke> aipn, aipn<jbw> aipn2, aipn<ifs> aipn3, aipn<ira> aipn4, Context context, aipn<jed> aipn5, jbk jbk, aipn<isf> aipn6, aipn<jun> aipn7, zgb zgb, aipn<achb<zjm, zjk>> aipn8) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "store");
        akcr.b(aipn3, "permissionHelper");
        akcr.b(aipn4, "identityApi");
        akcr.b(context, "context");
        akcr.b(aipn5, "phoneAutofillStateProvider");
        akcr.b(jbk, "loginSignupAnalytics");
        akcr.b(aipn6, "stateTransitionService");
        akcr.b(aipn7, "smsAutofillRetrieverRegistry");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn8, "navigationHost");
        this.j = aipn;
        this.k = aipn2;
        this.v = aipn3;
        this.l = aipn4;
        this.m = context;
        this.w = aipn5;
        this.n = jbk;
        this.o = aipn6;
        this.p = aipn7;
        this.q = aipn8;
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
    }

    private final boolean b() {
        Object obj = (juo.a(this.a) && akgb.a(this.c)) ? 1 : null;
        return this.h && !this.d && this.g && obj == null;
    }

    private final void c() {
        jgt jgt = (jgt) getTarget();
        if (jgt != null) {
            jgt.c().a = new a(this);
            jgt.a().setOnClickListener(new jgs(this.t));
            jgt.d().setOnClickListener(new jgs(this.s));
            jgt.g().setOnClickListener(new jgs(this.u));
        }
    }

    private final void d() {
        jgt jgt = (jgt) getTarget();
        if (jgt != null) {
            jgt.a().setOnClickListener(null);
            jgt.c().a = null;
            jgt.d().setOnClickListener(null);
            jgt.g().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.r) {
            Object obj = (jgt) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                d();
                if (b() && obj.c().isEnabled()) {
                    jrl.a(this.m, obj.c().f);
                }
                int i = 1;
                boolean z = this.d ^ 1;
                if (obj.c().f.isEnabled() != z) {
                    obj.c().f.setEnabled(z);
                }
                if (obj.c().e.isEnabled() != z) {
                    obj.c().e.setEnabled(z);
                }
                if ((akcr.a(obj.c().c, this.b) ^ 1) != 0) {
                    obj.c().b(this.b);
                }
                if ((akcr.a(obj.c().b, this.a) ^ 1) != 0) {
                    obj.c().a(this.a);
                }
                if ((akcr.a(obj.b().getText().toString(), this.c) ^ 1) != 0) {
                    obj.b().setText(this.c);
                }
                int i2 = 8;
                int i3 = (((CharSequence) this.c).length() == 0 ? 1 : null) != null ? 8 : 0;
                if (obj.b().getVisibility() != i3) {
                    obj.b().setVisibility(i3);
                }
                i3 = this.e ? 8 : 0;
                if (obj.a().getVisibility() != i3) {
                    obj.a().setVisibility(i3);
                }
                i3 = this.e ? 0 : 8;
                if (obj.g().getVisibility() != i3) {
                    obj.g().setVisibility(i3);
                }
                if (this.i) {
                    i2 = 0;
                }
                jrl.a(Integer.valueOf(i2), new j(obj.h()), new k(obj.h()));
                if (this.d) {
                    i = 2;
                } else if (!juo.a(this.a)) {
                    i = 0;
                }
                obj.d().setState(i);
                c();
            }
        }
    }

    /* renamed from: a */
    public final void takeTarget(jgt jgt) {
        akcr.b(jgt, "target");
        super.takeTarget(jgt);
        jgt.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jgt) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        jeb c = ((jbw) this.k.get()).c();
        this.a = c.h;
        this.b = c.i;
        zln.bindTo$default(this, ((jbw) this.k.get()).a().a((ajdw) this.f.l()).d((ajfb) new d(this)).l(), this, null, null, 6, null);
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.r = true;
        d();
        ((jun) this.p.get()).a(this.m);
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.r = false;
        c();
        a();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        if (!this.g) {
            Object obj = null;
            if ((((CharSequence) this.a).length() == 0 ? 1 : null) == null) {
                if (this.b.length() == 0) {
                    obj = 1;
                }
                if (obj == null) {
                    this.g = true;
                }
            }
            if (((achb) this.q.get()).c()) {
                ((isf) this.o.get()).a(aaoo.SIGNUP_SET_PHONE_AUTOFILL_START, aaop.INTERNAL_PROCESS, ish.SIGNUP);
                jed jed = (jed) this.w.get();
                Context context = this.m;
                if (context != null) {
                    Activity activity = (Activity) context;
                    Object obj2 = this.v.get();
                    akcr.a(obj2, "permissionHelper.get()");
                    zln.bindTo$default(this, jed.a(activity, (ifs) obj2, this.f, ifu.REG_PHONE_NUMBER, false).a((ajdw) this.f.l()).a((ajfb) new h(this), (ajfb) i.a), this, null, null, 6, null);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }
}
