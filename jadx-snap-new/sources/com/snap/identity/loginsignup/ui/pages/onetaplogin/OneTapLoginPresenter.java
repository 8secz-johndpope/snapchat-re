package com.snap.identity.loginsignup.ui.pages.onetaplogin;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.bitmoji.view.BitmojiSilhouetteView;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aapz;
import defpackage.aaxr;
import defpackage.achb;
import defpackage.achd;
import defpackage.afnd;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.dds;
import defpackage.iqj;
import defpackage.iql;
import defpackage.irc;
import defpackage.isf;
import defpackage.ish;
import defpackage.izl;
import defpackage.jag;
import defpackage.jaz;
import defpackage.jba;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jfy;
import defpackage.jgm;
import defpackage.jgn;
import defpackage.jhj;
import defpackage.jhv;
import defpackage.jhw;
import defpackage.jrl;
import defpackage.ojl;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class OneTapLoginPresenter extends zll<jgn> implements defpackage.k {
    jhj a;
    final zfw b = zgb.a(jbv.y.callsite("OneTapLoginPresenter"));
    boolean c;
    boolean d;
    boolean e;
    final jhv f;
    final Context g;
    final aipn<zke> h;
    final achb<zjm, zjk> i;
    final aipn<jbk> j;
    final aipn<iqj> k;
    final jfy l;
    final aipn<isf> m;
    private final aipn<ojl> n;
    private final aipn<jag> o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ OneTapLoginPresenter a;

        e(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
        }

        public final void onClick(View view) {
            OneTapLoginPresenter.b(this.a);
        }
    }

    static final class f implements OnClickListener {
        private /* synthetic */ OneTapLoginPresenter a;

        f(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
        }

        public final void onClick(View view) {
            OneTapLoginPresenter.b(this.a);
        }
    }

    static final class g implements OnClickListener {
        private /* synthetic */ OneTapLoginPresenter a;

        g(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
        }

        public final void onClick(View view) {
            OneTapLoginPresenter oneTapLoginPresenter = this.a;
            if (oneTapLoginPresenter.a != null) {
                zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(oneTapLoginPresenter.g, oneTapLoginPresenter.i, jbv.d, false, null, 16).a((int) R.string.remove_one_tap_login_account_dialog_title).b((int) R.string.remove_one_tap_login_account_dialog_description).a((int) R.string.remove_one_tap_login_account_dialog_positive_button_label, (akbl) new n(oneTapLoginPresenter), false), (akbl) new o(oneTapLoginPresenter), false, null, null, null, 30).a();
                oneTapLoginPresenter.i.a((achd) a, a.a, null);
            }
        }
    }

    static final class h implements OnClickListener {
        private /* synthetic */ OneTapLoginPresenter a;

        h(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
        }

        public final void onClick(View view) {
            ((zke) this.a.h.get()).a(new jba());
        }
    }

    static final class i implements OnClickListener {
        private /* synthetic */ OneTapLoginPresenter a;

        i(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
        }

        public final void onClick(View view) {
            ((zke) this.a.h.get()).a(new jaz(aapz.USERNAME_PASSWORD_LOGIN));
        }
    }

    static final class b<T> implements ajfb<jhj> {
        private /* synthetic */ OneTapLoginPresenter a;

        b(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jhj) obj;
            OneTapLoginPresenter oneTapLoginPresenter = this.a;
            akcr.a(obj, "it");
            oneTapLoginPresenter.a = obj;
            OneTapLoginPresenter oneTapLoginPresenter2 = this.a;
            oneTapLoginPresenter2.c = true;
            oneTapLoginPresenter2.b();
        }
    }

    static final class j<T> implements aipn<achb<zjm, zjk>> {
        private /* synthetic */ OneTapLoginPresenter a;

        j(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return this.a.i;
        }
    }

    static final class k<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ OneTapLoginPresenter a;
        private /* synthetic */ boolean b;

        /* renamed from: com.snap.identity.loginsignup.ui.pages.onetaplogin.OneTapLoginPresenter$k$3 */
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
                    OneTapLoginPresenter oneTapLoginPresenter = this.a.a;
                    akcr.b(iql, "authResult");
                    oneTapLoginPresenter.l.a(iql);
                    oneTapLoginPresenter.a();
                    oneTapLoginPresenter.d = false;
                    oneTapLoginPresenter.e = true;
                    oneTapLoginPresenter.b();
                } else if (th != null) {
                    OneTapLoginPresenter oneTapLoginPresenter2 = this.a.a;
                    defpackage.jfy.a a = oneTapLoginPresenter2.l.a(th, (akbk) new d(oneTapLoginPresenter2));
                    oneTapLoginPresenter2.d = false;
                    oneTapLoginPresenter2.b();
                    if (a.b) {
                        oneTapLoginPresenter2.a();
                        oneTapLoginPresenter2.a(a.a, new c(oneTapLoginPresenter2));
                        return;
                    }
                    oneTapLoginPresenter2.a(a.a, m.a);
                } else {
                    throw new IllegalStateException("Event did not contain value or throwable");
                }
            }
        }

        k(OneTapLoginPresenter oneTapLoginPresenter, boolean z) {
            this.a = oneTapLoginPresenter;
            this.b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx e;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldLogin");
            if (bool.booleanValue()) {
                ((jbk) this.a.j.get()).k();
                this.a.b();
                defpackage.iqj.a.a a = defpackage.iqj.a.a();
                jhw jhw = OneTapLoginPresenter.a(this.a).c;
                if (jhw == null) {
                    akcr.a();
                }
                defpackage.iqj.a a2 = a.a(jhw.a).c(OneTapLoginPresenter.a(this.a).b).a(this.b).a();
                ((isf) this.a.m.get()).a(aaoo.ONE_TAP_LOGIN_OPERATION_SUBMIT, aaop.USER_PRESSED_BUTTON, ish.LOGIN);
                e = ((iqj) this.a.k.get()).a(a2, (isf) this.a.m.get()).a((ajdw) this.a.b.l()).f(AnonymousClass1.a).g(AnonymousClass2.a).c((ajfb) new AnonymousClass3(this)).e();
            } else {
                OneTapLoginPresenter oneTapLoginPresenter = this.a;
                oneTapLoginPresenter.d = false;
                oneTapLoginPresenter.b();
                e = ajvo.a(ajhn.a);
            }
            return e;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ OneTapLoginPresenter a;

        c(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((zke) this.a.h.get()).a(new izl());
            ((zke) this.a.h.get()).a(new jaz(aapz.USERNAME_PASSWORD_LOGIN));
            return ajxw.a;
        }
    }

    static final class m extends akcs implements akbl<View, ajxw> {
        public static final m a = new m();

        m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbl<View, ajxw> {
        final /* synthetic */ OneTapLoginPresenter a;

        /* renamed from: com.snap.identity.loginsignup.ui.pages.onetaplogin.OneTapLoginPresenter$n$1 */
        static final class AnonymousClass1 implements ajev {
            private /* synthetic */ n a;

            AnonymousClass1(n nVar) {
                this.a = nVar;
            }

            public final void run() {
                ((zke) this.a.a.h.get()).a(new izl());
            }
        }

        n(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((jbk) this.a.j.get()).a(aaxr.REMOVE);
            OneTapLoginPresenter oneTapLoginPresenter = this.a;
            zln.bindTo$default(oneTapLoginPresenter, oneTapLoginPresenter.f.b(OneTapLoginPresenter.a(this.a).a).b((ajdw) this.a.b.f()).a((ajdw) this.a.b.l()).b((ajev) new AnonymousClass1(this)).e(), this.a, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class o extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ OneTapLoginPresenter a;

        o(OneTapLoginPresenter oneTapLoginPresenter) {
            this.a = oneTapLoginPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((jbk) this.a.j.get()).a(aaxr.CANCEL);
            return ajxw.a;
        }
    }

    static final class d extends akcq implements akbk<ajxw> {
        d(OneTapLoginPresenter oneTapLoginPresenter) {
            super(0, oneTapLoginPresenter);
        }

        public final String getName() {
            return "loginWithReactivationConfirmed";
        }

        public final akej getOwner() {
            return akde.a(OneTapLoginPresenter.class);
        }

        public final String getSignature() {
            return "loginWithReactivationConfirmed()V";
        }

        public final /* synthetic */ Object invoke() {
            ((OneTapLoginPresenter) this.receiver).a(true);
            return ajxw.a;
        }
    }

    static final class l extends akcq implements akbl<Integer, ajxw> {
        l(ProgressButton progressButton) {
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

    static {
        a aVar = new a();
    }

    public OneTapLoginPresenter(jhv jhv, Context context, aipn<zke> aipn, achb<zjm, zjk> achb, aipn<jbk> aipn2, aipn<iqj> aipn3, jfy jfy, aipn<isf> aipn4, aipn<ojl> aipn5, aipn<jag> aipn6, zgb zgb) {
        akcr.b(jhv, "oneTapLoginManager");
        akcr.b(context, "context");
        akcr.b(aipn, "eventDispatcher");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn2, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn3, "authApi");
        akcr.b(jfy, "loginResponseHandler");
        akcr.b(aipn4, "stateTransitionService");
        akcr.b(aipn5, "memoriesUserDataController");
        akcr.b(aipn6, "loginSignupCoordinator");
        akcr.b(zgb, "schedulersProvider");
        this.f = jhv;
        this.g = context;
        this.h = aipn;
        this.i = achb;
        this.j = aipn2;
        this.k = aipn3;
        this.l = jfy;
        this.m = aipn4;
        this.n = aipn5;
        this.o = aipn6;
    }

    public static final /* synthetic */ void b(OneTapLoginPresenter oneTapLoginPresenter) {
        if (oneTapLoginPresenter.a != null) {
            ((jag) oneTapLoginPresenter.o.get()).onStartLogin(new jaz(aapz.ONE_TAP_LOGIN));
            oneTapLoginPresenter.a(false);
        }
    }

    private final void c() {
        Uri a;
        jgn jgn = (jgn) getTarget();
        if (jgn == null) {
            akcr.a();
        }
        BitmojiSilhouetteView a2 = jgn.a();
        Object f = new defpackage.jxj.b.a().d(true).b();
        akcr.a(f, "ViewBitmapLoader.Request…setCircular(true).build()");
        a2.setRequestOptions(f);
        jhj jhj = this.a;
        if (jhj == null) {
            akcr.a("oneTapLoginUser");
        }
        jhw jhw = jhj.c;
        if (jhw == null) {
            akcr.a();
        }
        String str = jhw.a;
        if (jhw.a()) {
            String str2 = jhw.b;
            if (str2 == null) {
                akcr.a();
            }
            String str3 = jhw.c;
            if (str3 == null) {
                akcr.a();
            }
            a = dds.a(str2, str3, afnd.REGISTRATION, false, 0, 24);
        } else {
            a = dds.a(jhw.a, 0, 6);
        }
        a2.a(str, a, Integer.valueOf(a2.getResources().getColor(R.color.regular_blue)), jbv.y.getPage());
    }

    private final void d() {
        int i = (this.d || this.e) ? 2 : 1;
        jgn jgn = (jgn) getTarget();
        if (jgn == null) {
            akcr.a();
        }
        ProgressButton b = jgn.b();
        Context context = b.getContext();
        Object[] objArr = new Object[1];
        jhj jhj = this.a;
        if (jhj == null) {
            akcr.a("oneTapLoginUser");
        }
        jhw jhw = jhj.c;
        if (jhw == null) {
            akcr.a();
        }
        objArr[0] = jhw.a;
        Object string = context.getString(R.string.one_tap_login_as, objArr);
        akcr.a(string, "context.getString(R.stri…tokenMetaData!!.username)");
        b.a(1, string);
        jrl.a(Integer.valueOf(i), new jgm(b), new l(b));
    }

    private final void e() {
        jgn jgn = (jgn) getTarget();
        if (jgn == null) {
            akcr.a();
        }
        View h = jgn.h();
        boolean z = (this.d || this.e) ? false : true;
        h.setEnabled(z);
    }

    private final void f() {
        jgn jgn = (jgn) getTarget();
        if (jgn == null) {
            akcr.a();
        }
        View f = jgn.f();
        boolean z = true;
        boolean z2 = (this.d || this.e) ? false : true;
        f.setEnabled(z2);
        jgn = (jgn) getTarget();
        if (jgn == null) {
            akcr.a();
        }
        f = jgn.g();
        if (this.d || this.e) {
            z = false;
        }
        f.setEnabled(z);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        jhv jhv = this.f;
        jhj jhj = this.a;
        if (jhj == null) {
            akcr.a("oneTapLoginUser");
        }
        zln.bindTo$default(this, jhv.c(jhj.a).b((ajdw) this.b.f()).e(), this, null, null, 6, null);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, akbl<? super View, ajxw> akbl) {
        zgy a = new defpackage.zgy.a(this.g, this.i, new zjm(irc.t, "OneTapLoginPresenter", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).b(str).a((int) R.string.signup_ok_button, (akbl) akbl, true).a();
        this.i.a((achd) a, a.a, null);
    }

    /* renamed from: a */
    public final void takeTarget(jgn jgn) {
        akcr.b(jgn, "target");
        super.takeTarget(jgn);
        jgn.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.d = true;
        ojl ojl = (ojl) this.n.get();
        jhj jhj = this.a;
        if (jhj == null) {
            akcr.a("oneTapLoginUser");
        }
        jhw jhw = jhj.c;
        if (jhw == null) {
            akcr.a();
        }
        zln.bindTo$default(this, ojl.a(jhw.a, new j(this)).a((ajdw) this.b.l()).e((ajfc) new k(this, z)).e(), this, null, null, 6, null);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.c) {
            c();
            d();
            e();
            f();
        }
    }

    public final void dropTarget() {
        Object obj = (jgn) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        zln.bindTo$default(this, this.f.a().b((ajdw) this.b.f()).a((ajdw) this.b.l()).c((ajfb) new b(this)).i(), this, null, null, 6, null);
    }
}
