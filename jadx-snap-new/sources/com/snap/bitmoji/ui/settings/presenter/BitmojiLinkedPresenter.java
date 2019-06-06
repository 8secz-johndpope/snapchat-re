package com.snap.bitmoji.ui.settings.presenter;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.brightcove.player.event.EventType;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aabp;
import defpackage.aabq;
import defpackage.aabs;
import defpackage.aaua;
import defpackage.abkq;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.acig;
import defpackage.acio;
import defpackage.acip;
import defpackage.aedh;
import defpackage.afnd;
import defpackage.afyu;
import defpackage.aipn;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfu;
import defpackage.ajvv;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.ddd;
import defpackage.ddg;
import defpackage.ddj;
import defpackage.ddn;
import defpackage.ddq;
import defpackage.dds;
import defpackage.ddt;
import defpackage.ddx;
import defpackage.dfp;
import defpackage.dgp;
import defpackage.dgt;
import defpackage.dhf;
import defpackage.dhg;
import defpackage.dhm;
import defpackage.fth;
import defpackage.gpb;
import defpackage.ieg;
import defpackage.jwl;
import defpackage.jwv;
import defpackage.tnj;
import defpackage.wnr;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.concurrent.atomic.AtomicBoolean;

public final class BitmojiLinkedPresenter extends zll<dhm> implements defpackage.k {
    final ajei a = new ajei();
    final zfw b = zgb.a(ddg.l, "BitmojiLinkedPresenter");
    public LoadingSpinnerView c;
    TextView d;
    final Context e;
    final gpb f;
    final aipn<achb<zjm, zjk>> g;
    final aipn<BitmojiFsnHttpInterface> h;
    final ddt i;
    final dfp j;
    final aipn<ddd> k;
    final aipn<dgp> l;
    final aipn<dgt> m;
    final aipn<tnj> n;
    private final AtomicBoolean o = new AtomicBoolean();
    private SnapImageView p;
    private View q;
    private View r;
    private View s;
    private final ddj t;

    static final class e implements OnClickListener {
        private /* synthetic */ BitmojiLinkedPresenter a;

        e(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final void onClick(View view) {
            BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
            ajvv.a(bitmojiLinkedPresenter.j.c(aaua.SETTINGS, new k(bitmojiLinkedPresenter)), bitmojiLinkedPresenter.a);
        }
    }

    static final class f implements OnClickListener {
        private /* synthetic */ BitmojiLinkedPresenter a;

        f(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final void onClick(View view) {
            BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
            ajvv.a(bitmojiLinkedPresenter.j.a(aaua.SETTINGS, (akbk) new n(bitmojiLinkedPresenter)), bitmojiLinkedPresenter.a);
        }
    }

    static final class g implements OnClickListener {
        private /* synthetic */ BitmojiLinkedPresenter a;

        g(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final void onClick(View view) {
            BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
            zln.bindTo$default(bitmojiLinkedPresenter, ((dgt) bitmojiLinkedPresenter.m.get()).a().a((ajdw) bitmojiLinkedPresenter.b.l()).a((ajfb) new l(bitmojiLinkedPresenter), (ajfb) new m(bitmojiLinkedPresenter)), bitmojiLinkedPresenter, null, null, 6, null);
        }
    }

    static final class h implements OnClickListener {
        private /* synthetic */ BitmojiLinkedPresenter a;

        h(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final void onClick(View view) {
            BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
            zjm zjm = r2;
            zjm zjm2 = new zjm(ddg.l, "unlink_bitmoji_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
            achb achb = (achb) bitmojiLinkedPresenter.g.get();
            Context context = bitmojiLinkedPresenter.e;
            akcr.a((Object) achb, "it");
            zjm zjm3 = zjm;
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.bitmoji_unlink_confirmation).b((int) R.string.bitmoji_unlink_warning).a((int) R.string.bitmoji_unlink_yes_button_text, (akbl) new o(bitmojiLinkedPresenter, zjm3), false), (akbl) new p(bitmojiLinkedPresenter, zjm3), false, null, null, null, 30).a();
            achb.a((achd) a, a.a, null);
        }
    }

    static final class a<T> implements ajfb<Throwable> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class b<T> implements ajfb<ddn> {
        private /* synthetic */ BitmojiLinkedPresenter a;
        private /* synthetic */ defpackage.ddt.a b;

        b(BitmojiLinkedPresenter bitmojiLinkedPresenter, defpackage.ddt.a aVar) {
            this.a = bitmojiLinkedPresenter;
            this.b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            ddn ddn = (ddn) obj;
            String str = EventType.RESPONSE;
            akcr.b(ddn, str);
            BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
            defpackage.ddt.a aVar = this.b;
            akcr.b(ddn, str);
            akcr.b(aVar, "action");
            CharSequence charSequence = ddn.a;
            Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj2 != null) {
                bitmojiLinkedPresenter.a();
                return;
            }
            LoadingSpinnerView loadingSpinnerView = bitmojiLinkedPresenter.c;
            if (loadingSpinnerView == null) {
                akcr.a("bitmojiImageLoadingSpinnerView");
            }
            loadingSpinnerView.setVisibility(8);
            ((tnj) bitmojiLinkedPresenter.n.get()).b().a((fth) ddx.BITMOJI_EDIT_SOURCE, (Enum) aaua.SETTINGS).b();
            String str2 = ddn.a;
            if (str2 != null) {
                bitmojiLinkedPresenter.i.a(aVar, str2, aaua.SETTINGS);
            }
        }
    }

    public static final class d implements defpackage.jxj.a {
        private /* synthetic */ BitmojiLinkedPresenter a;

        d(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final void onFailure(jwl jwl) {
            akcr.b(jwl, "failureReason");
        }

        public final void onImageReady(jwv jwv) {
            akcr.b(jwv, "metrics");
            LoadingSpinnerView loadingSpinnerView = this.a.c;
            if (loadingSpinnerView == null) {
                akcr.a("bitmojiImageLoadingSpinnerView");
            }
            loadingSpinnerView.setVisibility(8);
            BitmojiLinkedPresenter.a(this.a).setVisibility(0);
        }
    }

    static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "userSession");
            String str = abkq.f;
            return str == null ? "" : str;
        }
    }

    static final class j<T> implements ajfb<String> {
        private /* synthetic */ BitmojiLinkedPresenter a;

        j(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            CharSequence charSequence = str;
            obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj == null) {
                BitmojiLinkedPresenter.a(this.a).setImageUri(dds.a(str, ddq.a(), afnd.PROFILE, false, 2, 8), ddg.l.getPage());
            }
        }
    }

    static final class l<T> implements ajfb<afyu> {
        private /* synthetic */ BitmojiLinkedPresenter a;

        l(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            achb achb = (achb) this.a.g.get();
            achd zjf = new zjf(ddg.a, ((dgp) this.a.l.get()).b(aaua.SETTINGS), acgv.a().a(ddg.c).a());
            acgu acgu = ddg.b;
            akcr.a((Object) acgu, "BitmojiFeature.BITMOJI_SETTINGS_PRESENT_DEFAULT");
            achb.a(zjf, acgu, null);
        }
    }

    static final class m<T> implements ajfb<Throwable> {
        private /* synthetic */ BitmojiLinkedPresenter a;

        m(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ieg.a(this.a.e.getString(R.string.bitmoji_error_toast_text), true, 0);
        }
    }

    static final class q<T, R> implements ajfc<abkq, ajdb> {
        private /* synthetic */ BitmojiLinkedPresenter a;

        q(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return this.a.f.a(new abkq(abkq.a, abkq.b, abkq.c, abkq.d, abkq.e, null, abkq.g, abkq.h, abkq.i, abkq.j, abkq.k, null, abkq.m, abkq.n, abkq.o, abkq.p));
        }
    }

    static final class r implements ajev {
        public static final r a = new r();

        r() {
        }

        public final void run() {
        }
    }

    static final class s<T> implements ajfb<Throwable> {
        public static final s a = new s();

        s() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class t<T> implements ajfb<Throwable> {
        public static final t a = new t();

        t() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class k extends akcs implements akbk<ajxw> {
        private /* synthetic */ BitmojiLinkedPresenter a;

        k(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a(defpackage.ddt.a.CHANGE_OUTFIT);
            return ajxw.a;
        }
    }

    static final class n extends akcs implements akbk<ajxw> {
        private /* synthetic */ BitmojiLinkedPresenter a;

        n(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            this.a = bitmojiLinkedPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a(defpackage.ddt.a.EDIT);
            return ajxw.a;
        }
    }

    static final class o extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BitmojiLinkedPresenter a;
        private /* synthetic */ zjm b;

        o(BitmojiLinkedPresenter bitmojiLinkedPresenter, zjm zjm) {
            this.a = bitmojiLinkedPresenter;
            this.b = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
            TextView textView = bitmojiLinkedPresenter.d;
            if (textView == null) {
                akcr.a("bitmojiUnlinkButton");
            }
            textView.setText(R.string.bitmoji_unlinking);
            BitmojiLinkedPresenter bitmojiLinkedPresenter2 = bitmojiLinkedPresenter;
            zln.bindTo$default(bitmojiLinkedPresenter, ((BitmojiFsnHttpInterface) bitmojiLinkedPresenter.h.get()).getBitmojiUnlinkRequest(new aedh()).b((ajdw) bitmojiLinkedPresenter.b.g()).a((ajdw) bitmojiLinkedPresenter.b.l()).d((ajfb) t.a).a((ajfb) new dhg(new u(bitmojiLinkedPresenter2)), (ajfb) new dhg(new v(bitmojiLinkedPresenter2))), bitmojiLinkedPresenter, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class p extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BitmojiLinkedPresenter a;
        private /* synthetic */ zjm b;

        p(BitmojiLinkedPresenter bitmojiLinkedPresenter, zjm zjm) {
            this.a = bitmojiLinkedPresenter;
            this.b = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            dhm dhm = (dhm) this.a.getTarget();
            if (dhm != null) {
                aaua g = dhm.g();
                if (g != null) {
                    ((ddd) this.a.k.get()).a(g, aabs.CANCELLED);
                }
            }
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbl<Throwable, ajxw> {
        c(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            super(1, bitmojiLinkedPresenter);
        }

        public final String getName() {
            return "onBitmojiRequestTokenFailure";
        }

        public final akej getOwner() {
            return akde.a(BitmojiLinkedPresenter.class);
        }

        public final String getSignature() {
            return "onBitmojiRequestTokenFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((BitmojiLinkedPresenter) this.receiver).a();
            return ajxw.a;
        }
    }

    static final class u extends akcq implements akbl<akxa<akhw>, ajxw> {
        u(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            super(1, bitmojiLinkedPresenter);
        }

        public final String getName() {
            return "onUnlinkResponseSuccess";
        }

        public final akej getOwner() {
            return akde.a(BitmojiLinkedPresenter.class);
        }

        public final String getSignature() {
            return "onUnlinkResponseSuccess(Lretrofit2/adapter/rxjava2/Result;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((akxa) obj, "p1");
            zln zln = (BitmojiLinkedPresenter) this.receiver;
            dhm dhm = (dhm) zln.getTarget();
            if (dhm != null) {
                aaua g = dhm.g();
                if (g != null) {
                    ((ddd) zln.k.get()).a(g, aabs.SUCCESS);
                }
            }
            zln.bindTo$default(zln, zln.f.c().c(1).a((ajfc) new q(zln), false).b((ajdw) zln.b.g()).a((ajdw) zln.b.h()).a((ajev) r.a, (ajfb) s.a), zln, null, null, 6, null);
            zjf zjf = new zjf(ddg.a, ((dgp) zln.l.get()).c(aaua.SETTINGS), acgv.a().a(ddg.c).a());
            achb achb = (achb) zln.g.get();
            acig[] acigArr = new acig[2];
            acigArr[0] = new acio(wnr.a, false);
            obj = zln.g.get();
            akcr.a(obj, "navigationHost.get()");
            achb achb2 = (achb) obj;
            achd achd = zjf;
            Object obj2 = ddg.b;
            akcr.a(obj2, "BitmojiFeature.BITMOJI_SETTINGS_PRESENT_DEFAULT");
            acigArr[1] = new acip(achb2, achd, obj2);
            achb.a((acig) defpackage.acie.a.a(acigArr, null));
            return ajxw.a;
        }
    }

    static final class v extends akcq implements akbl<Throwable, ajxw> {
        v(BitmojiLinkedPresenter bitmojiLinkedPresenter) {
            super(1, bitmojiLinkedPresenter);
        }

        public final String getName() {
            return "onUnlinkResponseFailure";
        }

        public final akej getOwner() {
            return akde.a(BitmojiLinkedPresenter.class);
        }

        public final String getSignature() {
            return "onUnlinkResponseFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            BitmojiLinkedPresenter bitmojiLinkedPresenter = (BitmojiLinkedPresenter) this.receiver;
            dhm dhm = (dhm) bitmojiLinkedPresenter.getTarget();
            if (dhm != null) {
                aaua g = dhm.g();
                if (g != null) {
                    ((ddd) bitmojiLinkedPresenter.k.get()).a(g, aabs.FAILED);
                }
            }
            TextView textView = bitmojiLinkedPresenter.d;
            if (textView == null) {
                akcr.a("bitmojiUnlinkButton");
            }
            textView.setText(R.string.bitmoji_unlink_mine);
            ieg.a("Something went wrong", true, 0);
            return ajxw.a;
        }
    }

    public BitmojiLinkedPresenter(Context context, gpb gpb, aipn<achb<zjm, zjk>> aipn, aipn<BitmojiFsnHttpInterface> aipn2, ddt ddt, dfp dfp, zgb zgb, aipn<ddd> aipn3, aipn<dgp> aipn4, aipn<dgt> aipn5, aipn<tnj> aipn6, ddj ddj) {
        akcr.b(context, "context");
        akcr.b(gpb, "userAuthStore");
        akcr.b(aipn, "navigationHost");
        akcr.b(aipn2, "bitmojiFsnHttpInterface");
        akcr.b(ddt, "bitmojiUtils");
        akcr.b(dfp, "avatarBuilderGateway");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn3, "bitmojiEventsAnalytics");
        akcr.b(aipn4, "bitmojiFragmentFactory");
        akcr.b(aipn5, "bitmojiTemplateManager");
        akcr.b(aipn6, "preferences");
        akcr.b(ddj, "bitmojiLinkageDelegate");
        this.e = context;
        this.f = gpb;
        this.g = aipn;
        this.h = aipn2;
        this.i = ddt;
        this.j = dfp;
        this.k = aipn3;
        this.l = aipn4;
        this.m = aipn5;
        this.n = aipn6;
        this.t = ddj;
    }

    public final void a() {
        LoadingSpinnerView loadingSpinnerView = this.c;
        if (loadingSpinnerView == null) {
            akcr.a("bitmojiImageLoadingSpinnerView");
        }
        loadingSpinnerView.setVisibility(8);
        this.t.b();
    }

    public final void a(defpackage.ddt.a aVar) {
        akcr.b(aVar, "action");
        boolean a = this.i.a();
        int i = dhf.a[aVar.ordinal()];
        if (i == 1) {
            ((ddd) this.k.get()).a(aabp.BITMOJI_APP, aabq.AVATAR, a, aaua.SETTINGS);
        } else if (i == 2) {
            ((ddd) this.k.get()).c(aaua.SETTINGS);
        } else {
            throw new IllegalArgumentException("Only Edit Avatar or ChangeOutfit is supported");
        }
        if (a) {
            LoadingSpinnerView loadingSpinnerView = this.c;
            if (loadingSpinnerView == null) {
                akcr.a("bitmojiImageLoadingSpinnerView");
            }
            loadingSpinnerView.setVisibility(0);
            akcr.a(zln.bindTo$default(this, this.t.a().d((ajfb) a.a).a((ajfb) new b(this, aVar), (ajfb) new dhg(new c(this))), this, null, null, 6, null), "bitmojiLinkageDelegate.r…            .bindTo(this)");
            return;
        }
        this.i.b();
    }

    /* renamed from: a */
    public final void takeTarget(dhm dhm) {
        akcr.b(dhm, "target");
        super.takeTarget(dhm);
        dhm.getLifecycle().a(this);
    }

    public final void dropTarget() {
        dhm dhm = (dhm) getTarget();
        if (dhm != null) {
            defpackage.j lifecycle = dhm.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onFragmentDestroy() {
        this.a.dispose();
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        dhm dhm = (dhm) getTarget();
        if (dhm != null) {
            aaua g = dhm.g();
            if (g != null) {
                ((ddd) this.k.get()).a(g, true);
            }
        }
        if (this.o.compareAndSet(false, true)) {
            Object obj = (dhm) getTarget();
            if (obj != null) {
                akcr.a(obj, "it");
                this.c = obj.e();
                SnapImageView a = obj.a();
                a.setRequestListener(new d(this));
                this.p = a;
                ajej f = this.f.c().b((ajdw) this.b.h()).a((ajdw) this.b.l()).p(i.a).j(ajfu.a).f((ajfb) new j(this));
                akcr.a((Object) f, "userAuthStore.observeUse…      }\n                }");
                ajvv.a(f, this.a);
                View b = obj.b();
                b.setOnClickListener(new e(this));
                this.q = b;
                b = obj.c();
                b.setOnClickListener(new f(this));
                this.r = b;
                b = obj.d();
                b.setOnClickListener(new g(this));
                this.s = b;
                TextView f2 = obj.f();
                f2.setOnClickListener(new h(this));
                this.d = f2;
            }
        }
    }
}
