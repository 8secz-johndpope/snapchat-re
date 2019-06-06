package com.snap.identity.loginsignup.ui.pages.forgotpassword.setphone;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
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
import defpackage.ajxt;
import defpackage.ajxw;
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
import defpackage.iqm;
import defpackage.ira;
import defpackage.irs;
import defpackage.isf;
import defpackage.ish;
import defpackage.jad;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jfo;
import defpackage.jfp;
import defpackage.jrl;
import defpackage.jrm;
import defpackage.jrn;
import defpackage.jro;
import defpackage.jui;
import defpackage.juj;
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

public final class ForgotPasswordSetPhonePresenter extends zll<jfp> implements defpackage.k {
    String a = "";
    jrm b = jrn.a();
    boolean c;
    defpackage.ahcb.b d = defpackage.ahcb.b.TEXT;
    boolean e;
    boolean f;
    final Context g;
    final aipn<zke> h;
    final aipn<achb<zjm, zjk>> i;
    final aipn<jbw> j;
    final jui k;
    final aipn<jun> l;
    private final zfw m = zgb.a(jbv.y.callsite(jbv.t.b()));
    private boolean n = true;
    private final aipn<iqm> o;
    private final aipn<ira> p;
    private final aipn<ifs> q;
    private final aipn<isf> r;

    static final class a implements OnClickListener {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        a(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
        }

        public final void onClick(View view) {
            ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
            jrl.a(forgotPasswordSetPhonePresenter.g);
            zjm zjm = new zjm(jbv.y, "choose_request_verify_code_method", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = forgotPasswordSetPhonePresenter.g;
            Object obj = forgotPasswordSetPhonePresenter.i.get();
            akcr.a(obj, "navigationHost.get()");
            defpackage.zgy.a aVar = new defpackage.zgy.a(context, (achb) obj, zjm, false, null, 24);
            String string = forgotPasswordSetPhonePresenter.g.getString(R.string.signup_phone_verification_alert_dialog_verification_title, new Object[]{forgotPasswordSetPhonePresenter.b.c});
            akcr.a((Object) string, "context.getString(R.stri…fyState.inputPhoneNumber)");
            zgy a = defpackage.zgy.a.a(aVar.a(string).b((int) R.string.signup_phone_verification_alert_dialog_verification_description).a((int) R.string.confirm_phone_number_text, (akbl) new i(forgotPasswordSetPhonePresenter), true).a((int) R.string.confirm_phone_number_call, (akbl) new j(forgotPasswordSetPhonePresenter), true), null, false, null, null, null, 31).a();
            ((achb) forgotPasswordSetPhonePresenter.i.get()).a((achd) a, a.a, null);
        }
    }

    static final class c<T> implements ajfb<jeb> {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        c(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            jeb jeb = (jeb) obj;
            this.a.a = jeb.D;
        }
    }

    static final class d<T> implements ajfb<irs> {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        d(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            irs irs = (irs) obj;
            akcr.b(irs, "autofillState");
            this.a.b = jui.a(null, irs.c, irs.b, true, 17);
            ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
            forgotPasswordSetPhonePresenter.f = true;
            forgotPasswordSetPhonePresenter.e = true;
            forgotPasswordSetPhonePresenter.a();
            this.a.e = false;
        }
    }

    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        e(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.f = true;
        }
    }

    static final class f<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        f(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
            ahcd ahcd = (ahcd) bVar.b;
            Object obj2 = ahcd.b;
            akcr.a(obj2, "resp.logged");
            if (obj2.booleanValue()) {
                String str = ahcd.g;
                if (str != null) {
                    boolean z = true;
                    if ((akgb.a(str) ^ 1) == 1) {
                        jui jui = forgotPasswordSetPhonePresenter.k;
                        jrm jrm = forgotPasswordSetPhonePresenter.b;
                        String str2 = ahcd.a;
                        akcr.a((Object) str2, "resp.message");
                        forgotPasswordSetPhonePresenter.b = jui.a(jrm, str2);
                        if (forgotPasswordSetPhonePresenter.d != defpackage.ahcb.b.CALL) {
                            z = false;
                        }
                        forgotPasswordSetPhonePresenter.c = z;
                        jbw jbw = (jbw) forgotPasswordSetPhonePresenter.j.get();
                        String str3 = ahcd.e;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jbw.n(str3);
                        forgotPasswordSetPhonePresenter.a();
                        zke zke = (zke) forgotPasswordSetPhonePresenter.h.get();
                        obj = ahcd.g;
                        akcr.a(obj, "resp.preAuthToken");
                        zke.a(new jad(obj, forgotPasswordSetPhonePresenter.b.e, forgotPasswordSetPhonePresenter.b.f, forgotPasswordSetPhonePresenter.d));
                        return;
                    }
                }
            }
            String str4 = ahcd.a;
            if (str4 == null) {
                str4 = forgotPasswordSetPhonePresenter.g.getString(R.string.default_error_try_again_later);
                akcr.a((Object) str4, "context.getString(R.stri…lt_error_try_again_later)");
            }
            forgotPasswordSetPhonePresenter.a(str4);
        }
    }

    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        g(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = this.a;
            String string = forgotPasswordSetPhonePresenter.g.getString(R.string.default_error_try_again_later);
            akcr.a((Object) string, "context.getString(R.stri…lt_error_try_again_later)");
            forgotPasswordSetPhonePresenter.a(string);
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

    static final class i extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        i(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ForgotPasswordSetPhonePresenter.a(this.a, defpackage.ahcb.b.TEXT);
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ForgotPasswordSetPhonePresenter a;

        j(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            this.a = forgotPasswordSetPhonePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ForgotPasswordSetPhonePresenter.a(this.a, defpackage.ahcb.b.CALL);
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

    static final class b extends akcq implements akbw<String, String, ajxw> {
        b(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter) {
            super(2, forgotPasswordSetPhonePresenter);
        }

        public final String getName() {
            return "onPhonePickerData";
        }

        public final akej getOwner() {
            return akde.a(ForgotPasswordSetPhonePresenter.class);
        }

        public final String getSignature() {
            return "onPhonePickerData(Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            akcr.b(str, "p1");
            akcr.b(str2, "p2");
            ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter = (ForgotPasswordSetPhonePresenter) this.receiver;
            forgotPasswordSetPhonePresenter.b = jui.a(forgotPasswordSetPhonePresenter.b, str2, str);
            forgotPasswordSetPhonePresenter.a();
            return ajxw.a;
        }
    }

    public ForgotPasswordSetPhonePresenter(Context context, aipn<zke> aipn, aipn<achb<zjm, zjk>> aipn2, aipn<jbw> aipn3, aipn<iqm> aipn4, aipn<ira> aipn5, aipn<ifs> aipn6, jui jui, aipn<jun> aipn7, aipn<isf> aipn8, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "navigationHost");
        akcr.b(aipn3, "store");
        akcr.b(aipn4, "contactApi");
        akcr.b(aipn5, "identityApi");
        akcr.b(aipn6, "permissionHelper");
        akcr.b(jui, "reducers");
        akcr.b(aipn7, "smsAutofillRetrieverRegistry");
        akcr.b(aipn8, "stateTransitionService");
        akcr.b(zgb, "schedulersProvider");
        this.g = context;
        this.h = aipn;
        this.i = aipn2;
        this.j = aipn3;
        this.o = aipn4;
        this.p = aipn5;
        this.q = aipn6;
        this.k = jui;
        this.l = aipn7;
        this.r = aipn8;
    }

    public static final /* synthetic */ void a(ForgotPasswordSetPhonePresenter forgotPasswordSetPhonePresenter, defpackage.ahcb.b bVar) {
        forgotPasswordSetPhonePresenter.b = jui.a(forgotPasswordSetPhonePresenter.b);
        forgotPasswordSetPhonePresenter.d = bVar;
        forgotPasswordSetPhonePresenter.a();
        if (bVar == defpackage.ahcb.b.TEXT) {
            Object p = ((jbw) forgotPasswordSetPhonePresenter.j.get()).a().p(h.a);
            jun jun = (jun) forgotPasswordSetPhonePresenter.l.get();
            akcr.a(p, "formatObservable");
            jun.a(p, forgotPasswordSetPhonePresenter.g);
        }
        ((isf) forgotPasswordSetPhonePresenter.r.get()).a(aaoo.FORGOT_PASSWORD_SET_PHONE_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
        zln.bindTo$default(forgotPasswordSetPhonePresenter, ((ira) forgotPasswordSetPhonePresenter.p.get()).a(forgotPasswordSetPhonePresenter.b.c, forgotPasswordSetPhonePresenter.b.d, forgotPasswordSetPhonePresenter.a, bVar, null).a((ajdw) forgotPasswordSetPhonePresenter.m.l()).a((ajfb) new f(forgotPasswordSetPhonePresenter), (ajfb) new g(forgotPasswordSetPhonePresenter)), forgotPasswordSetPhonePresenter, null, null, 6, null);
    }

    private final boolean b() {
        Object obj = (juo.a(this.b.c) && akgb.a(this.b.j) && akgb.a(this.b.k)) ? 1 : null;
        return this.e && !this.b.h && this.f && obj == null;
    }

    private final void c() {
        jfp jfp = (jfp) getTarget();
        if (jfp != null) {
            jfp.a().a = new b(this);
            jfp.c().setOnClickListener(new a(this));
        }
    }

    private final void d() {
        jfp jfp = (jfp) getTarget();
        if (jfp != null) {
            jfp.a().a = null;
            jfp.c().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.n) {
            Object obj = (jfp) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                d();
                jro a = juj.a(this.b);
                if (b() && obj.a().isEnabled()) {
                    jrl.a(this.g, obj.a().f);
                }
                if ((akcr.a(obj.a().b, a.h) ^ 1) != 0) {
                    obj.a().a(a.h);
                }
                if ((akcr.a(obj.a().c, a.i) ^ 1) != 0) {
                    obj.a().b(a.i);
                }
                boolean z = this.b.h ^ 1;
                if (obj.a().isEnabled() != z) {
                    obj.a().setEnabled(z);
                }
                if ((akcr.a(obj.b().getText().toString(), a.f) ^ 1) != 0) {
                    if ((akgb.a(a.f) ^ 1) != 0) {
                        obj.b().setVisibility(0);
                    } else {
                        obj.b().setVisibility(8);
                    }
                    obj.b().setText(a.f);
                }
                if (this.c) {
                    this.c = false;
                    Toast.makeText(this.g, R.string.confirm_phone_number_calling, 1).show();
                }
                int i = jfo.a[a.b.ordinal()];
                int i2 = 2;
                if (i == 1) {
                    i2 = 1;
                } else if (i != 2) {
                    i2 = 0;
                }
                obj.c().setState(i2);
                c();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        String str2;
        jrl.a(this.g);
        zjm zjm = new zjm(jbv.y, "request_verify_code_failure", false, false, true, false, null, false, false, false, false, null, 4076);
        Object string = this.g.getString(R.string.request_verify_code_prelogin_failure, new Object[]{"https://accounts.snapchat.com/accounts/password_reset_request"});
        akcr.a(string, "context.getString(R.stri…ure, FORGOT_PASSWORD_URL)");
        akcr.b(string, "source");
        if (VERSION.SDK_INT >= 24) {
            string = Html.fromHtml(string, 0, null, null);
            str2 = "Html.fromHtml(source, FR…_MODE_LEGACY, null, null)";
        } else {
            string = Html.fromHtml(string);
            str2 = "Html.fromHtml(source)";
        }
        akcr.a(string, str2);
        Object obj = string;
        Context context = this.g;
        string = this.i.get();
        akcr.a(string, "navigationHost.get()");
        zgy a = new defpackage.zgy.a(context, (achb) string, zjm, false, null, 24).a((int) R.string.forgot_password_phone_error_title).a((CharSequence) obj).a((int) R.string.okay, (akbl) k.a, true).a();
        ((achb) this.i.get()).a((achd) a, a.a, null);
        this.b = this.k.b(this.b, str);
        a();
    }

    /* renamed from: a */
    public final void takeTarget(jfp jfp) {
        akcr.b(jfp, "target");
        super.takeTarget(jfp);
        jfp.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jfp) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        zln zln = this;
        zln.bindTo$default(this, ((jbw) this.j.get()).a().a((ajdw) this.m.l()).f((ajfb) new c(this)), zln, null, null, 6, null);
        iqm iqm = (iqm) this.o.get();
        Context context = this.g;
        if (context != null) {
            Activity activity = (Activity) context;
            Object obj = this.q.get();
            akcr.a(obj, "permissionHelper.get()");
            zln.bindTo$default(this, iqm.a(activity, (ifs) obj, this.m, ifu.REG_PHONE_NUMBER).a((ajdw) this.m.l()).a((ajfb) new d(this), (ajfb) new e(this)), zln, null, null, 6, null);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.app.Activity");
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.n = true;
        d();
        ((jun) this.l.get()).a(this.g);
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.n = false;
        c();
        a();
    }
}
