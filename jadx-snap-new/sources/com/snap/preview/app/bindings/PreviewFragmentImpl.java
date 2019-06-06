package com.snap.preview.app.bindings;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import com.snap.preview.api.PreviewFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.view.ViewFinder;
import com.snap.ui.view.surfaceview.SurfaceViewManager;
import defpackage.aauu;
import defpackage.abll;
import defpackage.abyi;
import defpackage.achb;
import defpackage.achg;
import defpackage.achi;
import defpackage.acih;
import defpackage.aipy;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajde;
import defpackage.ajdp;
import defpackage.ajdv;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajex;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajvs;
import defpackage.ajvv;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.akux;
import defpackage.dnh;
import defpackage.ftl;
import defpackage.gcn;
import defpackage.ihl;
import defpackage.ily;
import defpackage.ilz;
import defpackage.ipc;
import defpackage.tob;
import defpackage.toc;
import defpackage.toq;
import defpackage.tpd;
import defpackage.tpf;
import defpackage.tpk;
import defpackage.tpl;
import defpackage.tps;
import defpackage.tpy;
import defpackage.tqb;
import defpackage.tqc;
import defpackage.tqd;
import defpackage.tqe;
import defpackage.tqf;
import defpackage.tqg;
import defpackage.tre;
import defpackage.trf;
import defpackage.trp;
import defpackage.tvd;
import defpackage.twb;
import defpackage.twc;
import defpackage.twd;
import defpackage.tzg;
import defpackage.tzk;
import defpackage.uaq;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgo;
import defpackage.zjj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkf;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.greenrobot.eventbus.ThreadMode;

public final class PreviewFragmentImpl extends PreviewFragment implements zjj, zjq {
    public zgb A;
    public zkf B;
    public toq C;
    public ftl D;
    public SurfaceViewManager E;
    public ajwy<tpy> F;
    public tre G;
    public final AtomicReference<tpy> H;
    private final ajwl<tqb> I;
    private final ajwl<tqg> J;
    private final ajwl<tqe> K;
    private final ajwl<tqc> L;
    private final ajwl<tqf> M;
    private final ajei N = new ajei();
    private final ajei O = new ajei();
    private final ajwo<Boolean> P;
    private final ajwo<Boolean> Q;
    private final ajwo<Boolean> R;
    private final ajwo<ajxw> S;
    private final ajwo<Integer> T;
    private final ajwo<Boolean> V;
    private final ajwo<Boolean> W;
    private final ajvs<tps> X;
    private final ajwo<tqd> Y;
    private final ajwo<tzk> Z;
    final ajwo<ajxw> a;
    private final ajwl<Boolean> aa;
    private final ajwo<ajxw> ab;
    private final ajdp<tqg> ac;
    private final ajdp<tqe> ad;
    private final ajdp<tqc> ae;
    private final ajdp<tqf> af;
    private final ajdp<tqb> ag;
    private final ajdp<ajxw> ah;
    private final ajxe ai;
    private final ajxe aj;
    private tpl ak;
    private View al;
    private ViewFinder am;
    private AtomicBoolean an;
    private AtomicBoolean ao;
    private long ap;
    final ajei b = new ajei();
    final ajwo<ajxw> c;
    final ajwo<ajxw> d;
    final ajwo<ajxw> e;
    final ajwl<Boolean> f;
    final ajwo<ajxw> g;
    final ajwo<tpd> h;
    final ajwo<ajxw> i;
    final ajwo<MotionEvent> j;
    final ajwl<uaq> k;
    final ajwl<Boolean> l;
    final ajwl<tpk> m;
    final tzg n;
    final ajwl<Boolean> o;
    final ajwl<Boolean> p;
    final ajdp<Boolean> q;
    public defpackage.tqx.a r;
    public defpackage.trf.a s;
    public defpackage.txh.a.a t;
    public defpackage.tqo.a.a u;
    public defpackage.tra.a.a v;
    public achb<zjm, zjk> w;
    public tvd x;
    public toc y;
    public twd z;

    static final class q extends akcs implements akbk<zfw> {
        private /* synthetic */ PreviewFragmentImpl a;

        q(PreviewFragmentImpl previewFragmentImpl) {
            this.a = previewFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.A == null) {
                akcr.a("schedulersProvider");
            }
            toc toc = this.a.y;
            if (toc == null) {
                akcr.a("previewFeature");
            }
            return zgb.a(toc.callsite("PreviewFragmentImpl"));
        }
    }

    static final class c extends akcs implements akbk<trf> {
        private /* synthetic */ PreviewFragmentImpl a;

        c(PreviewFragmentImpl previewFragmentImpl) {
            this.a = previewFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            defpackage.trf.a aVar = this.a.s;
            if (aVar == null) {
                akcr.a("coreComponentBuilder");
            }
            return aVar.a(PreviewFragmentImpl.b(this.a)).a();
        }
    }

    static final class b implements Runnable {
        private /* synthetic */ PreviewFragmentImpl a;
        private /* synthetic */ Context b;

        b(PreviewFragmentImpl previewFragmentImpl, Context context) {
            this.a = previewFragmentImpl;
            this.b = context;
        }

        public final void run() {
            this.a.m().a("PLAYER_COMPONENT_BEGIN");
            defpackage.txh.a.a aVar = this.a.t;
            if (aVar == null) {
                akcr.a("playerComponentBuilder");
            }
            aVar = aVar.b((ajdv) this.a.d);
            ajdp f = this.a.p.f();
            akcr.a((Object) f, "navigatingToNonCameraPageSubject.hide()");
            aVar = aVar.a(f);
            f = this.a.o.f();
            akcr.a((Object) f, "previewVisibilityStateObservable.hide()");
            aVar = aVar.b(f).a((ajdv) this.a.e).a(this.b);
            tre tre = this.a.G;
            if (tre == null) {
                akcr.a("configPreloader");
            }
            ajvv.a(aVar.a(tre.a).a().a().start(), this.a.b);
        }
    }

    static final class l<T1, T2, R> implements ajex<ajxw, ajxw, ajxw> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            ajxw ajxw = (ajxw) obj2;
            akcr.b((ajxw) obj, "<anonymous parameter 0>");
            akcr.b(ajxw, "<anonymous parameter 1>");
            return ajxw.a;
        }
    }

    static final class m<T> implements ajfb<ajxw> {
        private /* synthetic */ PreviewFragmentImpl a;
        private /* synthetic */ ViewFinder b;
        private /* synthetic */ ajei c;

        m(PreviewFragmentImpl previewFragmentImpl, ViewFinder viewFinder, ajei ajei) {
            this.a = previewFragmentImpl;
            this.b = viewFinder;
            this.c = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            twd.a(this.a.m(), twb.CAMERA_CREATION_DONE, null, 6);
            defpackage.tra.a.a aVar = this.a.v;
            if (aVar == null) {
                akcr.a("preloadComponentBuilder");
            }
            aVar = aVar.a(PreviewFragmentImpl.a(this.a)).a(this.a.o()).a(this.b).a(PreviewFragmentImpl.b(this.a));
            Object f = this.a.m.f();
            akcr.a(f, "sendToDataSubject.hide()");
            aVar = aVar.h(f);
            f = this.a.j.f();
            akcr.a(f, "gestureEventSubject.hide()");
            aVar = aVar.g(f).a(this.a.n);
            f = this.a.h.f();
            akcr.a(f, "previewControlEventSubject.hide()");
            aVar = aVar.f(f);
            f = this.a.l.f();
            akcr.a(f, "hideSendAndDiscardButtonsEventSubject.hide()");
            aVar = aVar.e(f);
            f = this.a.i.f();
            akcr.a(f, "scrollInFilterEventSubject.hide()");
            aVar = aVar.d(f).a((ajdv) this.a.i);
            ajdp f2 = this.a.k.f();
            akcr.a((Object) f2, "tooltipVisibilitySubject.hide()");
            ajvv.a(aVar.c(f2).b(this.a.q).a((ajdp) this.a.g).c((ajdv) this.a.e).b((ajdv) this.a.f).a().a().start(), this.c);
            this.a.a.a(ajxw.a);
            this.a.w();
        }
    }

    static final class n<T> implements ajfb<ajxw> {
        private /* synthetic */ PreviewFragmentImpl a;

        n(PreviewFragmentImpl previewFragmentImpl) {
            this.a = previewFragmentImpl;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.p();
        }
    }

    static final class o<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            boolean z = ((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    static final class p<T> implements ajfb<Boolean> {
        private /* synthetic */ PreviewFragmentImpl a;

        p(PreviewFragmentImpl previewFragmentImpl) {
            this.a = previewFragmentImpl;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.o.a((Boolean) obj);
        }
    }

    static final class a implements OnDrawListener {
        final ViewTreeObserver a;
        private boolean b;
        private final zfw c;
        private final akbk<ajxw> d;

        static final class a implements Runnable {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            public final void run() {
                this.a.a.removeOnDrawListener(this.a);
            }
        }

        public a(zfw zfw, ViewTreeObserver viewTreeObserver, akbk<ajxw> akbk) {
            akcr.b(zfw, "schedulers");
            akcr.b(viewTreeObserver, "viewTreeObserver");
            akcr.b(akbk, "callback");
            this.c = zfw;
            this.a = viewTreeObserver;
            this.d = akbk;
            this.b = true;
        }

        public a(zfw zfw, ViewTreeObserver viewTreeObserver, final List<? extends abll> list) {
            akcr.b(zfw, "schedulers");
            akcr.b(viewTreeObserver, "viewTreeObserver");
            akcr.b(list, "timers");
            this(zfw, viewTreeObserver, (akbk) new akbk<ajxw>() {
                public final /* synthetic */ Object invoke() {
                    for (abll a : list) {
                        a.a();
                    }
                    return ajxw.a;
                }
            });
        }

        public final void onDraw() {
            if (this.b) {
                this.b = false;
                this.d.invoke();
                this.c.l().a((Runnable) new a(this));
            }
        }
    }

    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ PreviewFragmentImpl a;

        d(PreviewFragmentImpl previewFragmentImpl) {
            this.a = previewFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.c.a(ajxw.a);
            this.a.m().b.a(defpackage.ablu.e.PREVIEW_UI_VISIBLE);
            return ajxw.a;
        }
    }

    static final class e<T> implements ajfl<Boolean> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return !bool.booleanValue();
        }
    }

    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ PreviewFragmentImpl a;

        f(PreviewFragmentImpl previewFragmentImpl) {
            this.a = previewFragmentImpl;
        }

        public final /* synthetic */ void accept(Object obj) {
            twd.a(this.a.m(), twb.PREVIEW_HIDDEN_ON_DECK, null, 6);
            ViewTreeObserver viewTreeObserver = PreviewFragmentImpl.a(this.a).getViewTreeObserver();
            zfw n = this.a.n();
            akcr.a((Object) viewTreeObserver, "viewTreeObserver");
            viewTreeObserver.addOnDrawListener(new a(n, viewTreeObserver, this.a.m().b(twb.FRAME_RENDERED_AFTER_PREVIEW_HIDDEN)));
        }
    }

    static final class g<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        final /* synthetic */ PreviewFragmentImpl a;
        final /* synthetic */ acih b;

        g(PreviewFragmentImpl previewFragmentImpl, acih acih) {
            this.a = previewFragmentImpl;
            this.b = acih;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "mediaPackageList");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ g a;

                public final void run() {
                    this.a.a.l().i = ((tpf) this.a.b).e;
                    tvd l = this.a.a.l();
                    gcn gcn = ((tpf) this.a.b).b;
                    akcr.b(gcn, "mediaOrigin");
                    l.a().a(gcn.sourceType);
                    l.k = gcn;
                    l = this.a.a.l();
                    List list = list;
                    String str = "mediaPackageList";
                    akcr.a((Object) list, str);
                    l.a(list);
                    Object obj = list;
                    akcr.a(obj, str);
                    abyi abyi = (abyi) ajyu.g((List) obj);
                    if (abyi != null) {
                        this.a.a.l().j.d = abyi.e.h;
                    }
                }
            });
        }
    }

    static final class j implements ajev {
        public static final j a = new j();

        j() {
        }

        public final void run() {
        }
    }

    static final class h<T> implements ajfb<Throwable> {
        private /* synthetic */ PreviewFragmentImpl a;
        private /* synthetic */ acih b;

        h(PreviewFragmentImpl previewFragmentImpl, acih acih) {
            this.a = previewFragmentImpl;
            this.b = acih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.p();
        }
    }

    static final class i<T> implements ajfb<tpk> {
        private /* synthetic */ PreviewFragmentImpl a;
        private /* synthetic */ acih b;

        i(PreviewFragmentImpl previewFragmentImpl, acih acih) {
            this.a = previewFragmentImpl;
            this.b = acih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.m.a((tpk) obj);
        }
    }

    static final class k extends akcs implements akbl<ily, ilz> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ily ily = (ily) obj;
            akcr.b(ily, "it");
            return ily.a(twc.EXIT_TYPE.name(), (Enum) aauu.SYSTEM_BACK);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(PreviewFragmentImpl.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(PreviewFragmentImpl.class), "coreComponent", "getCoreComponent()Lcom/snap/preview/app/bindings/PreviewCoreComponent;")};
    }

    public PreviewFragmentImpl() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<PreviewAbandonedEvent>()");
        this.I = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<PreviewSendEvent>()");
        this.J = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<PreviewPostEvent>()");
        this.K = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<PreviewBottomPanelEvent>()");
        this.L = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<PreviewSaveEvent>()");
        this.M = ajwl;
        ajwl = new ajwo();
        String str = "PublishSubject.create<Unit>()";
        akcr.a(ajwl, str);
        this.a = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.c = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.d = ajwl;
        ajwl = new ajwo();
        String str2 = "PublishSubject.create<Boolean>()";
        akcr.a(ajwl, str2);
        this.P = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str2);
        this.Q = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str2);
        this.R = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.e = ajwl;
        ajwl = ajwl.i(Boolean.FALSE);
        String str3 = "BehaviorSubject.createDefault(false)";
        akcr.a(ajwl, str3);
        this.f = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.S = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.g = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<Int>()");
        this.T = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<PreviewControlEvent>()");
        this.h = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str2);
        this.V = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str2);
        this.W = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.i = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<MotionEvent>()");
        this.j = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<TooltipVisibilityData>()");
        this.k = ajwl;
        ajwl = new ajvs();
        akcr.a(ajwl, "PublishProcessor.create<SegmentSwitchEvent>()");
        this.X = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<PreviewMediaPlayerEvent>()");
        this.Y = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<OverlayEvent>()");
        this.Z = ajwl;
        ajwl = ajwl.i(Boolean.FALSE);
        akcr.a(ajwl, str3);
        this.aa = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.ab = ajwl;
        ajwl = new ajwl();
        str = "BehaviorSubject.create<Boolean>()";
        akcr.a(ajwl, str);
        this.l = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<PreviewSendToData>()");
        this.m = ajwl;
        this.n = new tzg();
        ajwl = new ajwl();
        akcr.a(ajwl, str);
        this.o = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, str);
        this.p = ajwl;
        ajwl = this.J.f();
        akcr.a(ajwl, "sendEventSubject.hide()");
        this.ac = ajwl;
        ajwl = this.K.f();
        akcr.a(ajwl, "postEventSubject.hide()");
        this.ad = ajwl;
        ajwl = this.L.f();
        akcr.a(ajwl, "bottomPanelEventSubject.hide()");
        this.ae = ajwl;
        ajwl = this.M.f();
        akcr.a(ajwl, "saveEventSubject.hide()");
        this.af = ajwl;
        ajwl = this.I.f();
        akcr.a(ajwl, "abandonedEventSubject.hide()");
        this.ag = ajwl;
        ajwl = this.a.f();
        akcr.a(ajwl, "previewReadySubject.hide()");
        this.ah = ajwl;
        ajwl = this.o.f();
        akcr.a(ajwl, "previewVisibilityStateObservable.hide()");
        this.q = ajwl;
        this.ai = ajxh.a(new q(this));
        this.H = new AtomicReference();
        this.aj = ajxh.a(new c(this));
        this.an = new AtomicBoolean(false);
        this.ao = new AtomicBoolean(false);
        this.ap = new ihl().a();
    }

    private static aipy b(Activity activity) {
        if (activity instanceof aipy) {
            return (aipy) activity;
        }
        Application application = activity.getApplication();
        if (!(application instanceof aipy)) {
            application = null;
        }
        aipy aipy = (aipy) application;
        if (aipy != null) {
            return aipy;
        }
        throw new IllegalArgumentException("No injector was found");
    }

    private final void e(achi<zjm, zjk> achi) {
        Object obj = (zjm) achi.f.e();
        boolean z = achi.j;
        boolean z2 = false;
        obj = (akcr.a(obj, dnh.a) || akcr.a(obj, dnh.c)) ? 1 : null;
        if (obj == null || !z) {
            z2 = true;
        }
        this.p.a(Boolean.valueOf(z2));
        this.Q.a(Boolean.FALSE);
    }

    private final boolean q() {
        if (akcr.a((Boolean) this.f.p(), Boolean.TRUE)) {
            this.o.a(Boolean.TRUE);
            return false;
        }
        twd twd = this.z;
        if (twd == null) {
            akcr.a("previewMetricsPlugin");
        }
        twd.a(twd, twb.REQUEST_HIDE_PREVIEW, null, 6);
        return true;
    }

    public final long S_() {
        return -1;
    }

    public final void a(achi<zjm, zjk> achi, defpackage.acix.a aVar) {
        akcr.b(achi, "navigationEvent");
        akcr.b(aVar, "pageStateTransition");
        int i = trp.a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                b((achi) achi);
            }
            return;
        }
        a_(achi);
    }

    public final void a(acih acih) {
        Object obj;
        if (acih instanceof tpf) {
            ScopedFragment.a((ScopedFragment) this, ((tpf) acih).a.b((ajdw) n().h()).e((ajfc) new g(this, acih)).a((ajdw) n().l()).a((ajev) j.a, (ajfb) new h(this, acih)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY);
            ScopedFragment.a((ScopedFragment) this, ((tpf) acih).c.f((ajfb) new i(this, acih)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY);
            tvd tvd = this.x;
            String str = "previewDataSource";
            if (tvd == null) {
                akcr.a(str);
            }
            tob tob = ((tpf) acih).d;
            akcr.b(tob, "<set-?>");
            tvd.j = tob;
            tvd = this.x;
            if (tvd == null) {
                akcr.a(str);
            }
            tvd.h = ((tpf) acih).f;
        }
        defpackage.tqo.a.a aVar = this.u;
        if (aVar == null) {
            akcr.a("activationComponentBuilder");
        }
        View view = this.al;
        if (view == null) {
            akcr.a("rootView");
        }
        aVar = aVar.a(view).a(o());
        ViewFinder viewFinder = this.am;
        if (viewFinder == null) {
            akcr.a("viewFinder");
        }
        aVar = aVar.a(viewFinder);
        tpy tpy = (tpy) this.H.get();
        if (tpy == null) {
            ajwy ajwy = this.F;
            if (ajwy == null) {
                akcr.a("previewToolInflatorProvider");
            }
            obj = ajwy.get();
            akcr.a(obj, "previewToolInflatorProvider.get()");
            tpy = (tpy) obj;
        }
        aVar = aVar.a(tpy);
        obj = this.d.f();
        akcr.a(obj, "playerFirstFrameSubject.hide()");
        aVar = aVar.o(obj).a(this.ap);
        obj = this.c.f();
        akcr.a(obj, "uiFirstFrameSubject.hide()");
        aVar = aVar.p(obj);
        obj = this.R.f();
        akcr.a(obj, "showDiscardHintSubject.hide()");
        aVar = aVar.q(obj).m((ajdv) this.R);
        obj = this.aa.f();
        akcr.a(obj, "isEditingSubject.hide()");
        aVar = aVar.n(obj).l((ajdv) this.aa);
        ajdp f = this.ab.f();
        akcr.a((Object) f, "appIsPausedSubject.hide()");
        aVar = aVar.m(f);
        f = this.V.f();
        akcr.a((Object) f, "animationFadeInOutSubject.hide()");
        aVar = aVar.l(f).j((ajdv) this.V);
        f = this.h.f();
        akcr.a((Object) f, "previewControlEventSubject.hide()");
        aVar = aVar.i(f).k((ajdv) this.h);
        f = this.j.f();
        akcr.a((Object) f, "gestureEventSubject.hide()");
        aVar = aVar.j(f).f((ajdv) this.j).i((ajdv) this.e).h((ajdv) this.f);
        f = this.T.f();
        akcr.a((Object) f, "statusAndNavBarVisibilityChangeSubject.hide()");
        aVar = aVar.k(f).g((ajdv) this.T);
        f = this.W.f();
        akcr.a((Object) f, "hideSendButtonEventSubject.hide()");
        aVar = aVar.h(f).e((ajdv) this.W);
        f = this.l.f();
        akcr.a((Object) f, "hideSendAndDiscardButtonsEventSubject.hide()");
        aVar = aVar.g(f).d((ajdv) this.l);
        f = this.m.f();
        akcr.a((Object) f, "sendToDataSubject.hide()");
        aVar = aVar.f(f).c((ajdv) this.k);
        tpl tpl = this.ak;
        if (tpl == null) {
            akcr.a("previewStartUpConfig");
        }
        aVar = aVar.a(tpl);
        f = this.o.f();
        akcr.a((Object) f, "previewVisibilityStateObservable.hide()");
        aVar = aVar.e(f);
        f = this.S.f();
        akcr.a((Object) f, "logEventsSubject.hide()");
        aVar = aVar.d(f);
        ajde e = this.X.e();
        akcr.a((Object) e, "segmentSwitchProcessor.onBackpressureDrop()");
        aVar = aVar.a(e).a((akux) this.X);
        f = this.Y.f();
        akcr.a((Object) f, "mediaPlayerEventSubject.hide()");
        aVar = aVar.c(f).b((ajdv) this.Y);
        f = this.Z.f();
        akcr.a((Object) f, "overlayEventSubject.hide()");
        aVar = aVar.b(f).a((ajdv) this.Z);
        f = this.Q.f();
        akcr.a((Object) f, "deckVisibleSubject.hide()");
        aVar = aVar.a(f).a(this.n);
        tre tre = this.G;
        if (tre == null) {
            akcr.a("configPreloader");
        }
        ajvv.a(aVar.a(tre.a).a().d().start(), this.N);
        twd twd = this.z;
        if (twd == null) {
            akcr.a("previewMetricsPlugin");
        }
        twd.b.a(defpackage.ablu.e.PREVIEW_FINISH_PREPARATION);
        twd.a.c((ily) ipc.PREVIEW_FINISH_PREPARATION, 1);
        this.O.dispose();
    }

    public final void a(Activity activity) {
        synchronized (this.an) {
            if (this.an.getAndSet(true)) {
                return;
            }
            b(activity).c().a(this);
        }
    }

    public final void a(Context context) {
        if (!this.ao.get()) {
            synchronized (this.ao) {
                if (this.ao.getAndSet(true)) {
                    return;
                }
                this.o.a(Boolean.TRUE);
                ajej a = n().h().a((Runnable) new b(this, context));
                akcr.a((Object) a, "schedulers.userInteracti…          }\n            }");
                ajvv.a(a, this.N);
            }
        }
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        this.Q.a(Boolean.TRUE);
    }

    public final ajdp<tqg> b() {
        return this.ac;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        e(achi);
    }

    public final boolean d() {
        return false;
    }

    public final ajdp<tqe> h() {
        return this.ad;
    }

    public final ajdp<tqc> i() {
        return this.ae;
    }

    public final ajdp<Boolean> j() {
        return this.q;
    }

    public final ajdp<ajxw> k() {
        return this.ah;
    }

    public final tvd l() {
        tvd tvd = this.x;
        if (tvd == null) {
            akcr.a("previewDataSource");
        }
        return tvd;
    }

    public final twd m() {
        twd twd = this.z;
        if (twd == null) {
            akcr.a("previewMetricsPlugin");
        }
        return twd;
    }

    public final zfw n() {
        return (zfw) this.ai.b();
    }

    /* Access modifiers changed, original: final */
    public final trf o() {
        return (trf) this.aj.b();
    }

    public final boolean o_() {
        twd twd = this.z;
        if (twd == null) {
            akcr.a("previewMetricsPlugin");
        }
        twd.a(twd, twb.EXIT_PREVIEW_GESTURE, k.a, 2);
        toq toq = this.C;
        if (toq == null) {
            akcr.a("backPressHandler");
        }
        if (!toq.a()) {
            p();
        }
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        Object activity = getActivity();
        if (activity == null) {
            akcr.a();
        }
        akcr.a(activity, "activity!!");
        a((Activity) activity);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onBottomPanelEvent(tqc tqc) {
        akcr.b(tqc, "event");
        if (q()) {
            this.L.a((Object) tqc);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:86:0x0215 in {2, 11, 18, 21, 24, 28, 31, 34, 37, 40, 43, 48, 53, 56, 59, 62, 67, 72, 73, 76, 78, 81, 83, 85} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
        r4 = this;
        r7 = "inflater";
        defpackage.akcr.b(r5, r7);
        r7 = r4.z;
        if (r7 != 0) goto L_0x000e;
        r0 = "previewMetricsPlugin";
        defpackage.akcr.a(r0);
        r7 = r7.c;
        r0 = defpackage.zgo.a();
        r7.b = r0;
        r0 = r7.d;
        r0 = r0.b();
        r7.c = r0;
        r7 = r4.getContext();	 Catch:{ all -> 0x0213 }
        r4.a(r7);	 Catch:{ all -> 0x0213 }
        r7 = 2131559170; // 0x7f0d0302 float:1.8743676E38 double:1.053130158E-314;	 Catch:{ all -> 0x0213 }
        r0 = 0;	 Catch:{ all -> 0x0213 }
        r5 = r5.inflate(r7, r6, r0);	 Catch:{ all -> 0x0213 }
        if (r5 == 0) goto L_0x020b;	 Catch:{ all -> 0x0213 }
        r5 = (android.widget.FrameLayout) r5;	 Catch:{ all -> 0x0213 }
        r5 = (android.view.View) r5;	 Catch:{ all -> 0x0213 }
        r4.al = r5;	 Catch:{ all -> 0x0213 }
        r5 = new com.snap.ui.view.ViewFinder;	 Catch:{ all -> 0x0213 }
        r6 = 1;	 Catch:{ all -> 0x0213 }
        r6 = new android.view.View[r6];	 Catch:{ all -> 0x0213 }
        r7 = r4.al;	 Catch:{ all -> 0x0213 }
        r1 = "rootView";
        if (r7 != 0) goto L_0x0043;
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x0213 }
        r6[r0] = r7;	 Catch:{ all -> 0x0213 }
        r5.<init>(r6);	 Catch:{ all -> 0x0213 }
        r4.am = r5;	 Catch:{ all -> 0x0213 }
        r5 = r4.N;	 Catch:{ all -> 0x0209 }
        r6 = r4.am;	 Catch:{ all -> 0x0209 }
        r7 = "viewFinder";
        if (r6 != 0) goto L_0x0055;
        defpackage.akcr.a(r7);	 Catch:{ all -> 0x0209 }
        r0 = "compositeDisposable";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x0209 }
        defpackage.akcr.b(r6, r7);	 Catch:{ all -> 0x0209 }
        r7 = r4.getArguments();	 Catch:{ all -> 0x0209 }
        if (r7 != 0) goto L_0x0066;	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0209 }
        r0 = "arguments!!";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r7, r0);	 Catch:{ all -> 0x0209 }
        r0 = "bundle";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x0209 }
        r0 = defpackage.ebp.a.a(r7);	 Catch:{ all -> 0x0209 }
        r2 = "PREVIEW_FLAVOR";	 Catch:{ all -> 0x0209 }
        r2 = r7.get(r2);	 Catch:{ all -> 0x0209 }
        r3 = defpackage.tod.MAIN;	 Catch:{ all -> 0x0209 }
        r3 = r3.name();	 Catch:{ all -> 0x0209 }
        r3 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0209 }
        if (r3 == 0) goto L_0x008e;	 Catch:{ all -> 0x0209 }
        r7 = new tpl$b$f;	 Catch:{ all -> 0x0209 }
        r7.<init>();	 Catch:{ all -> 0x0209 }
        r7 = (defpackage.tpl.b) r7;	 Catch:{ all -> 0x0209 }
        goto L_0x00e8;	 Catch:{ all -> 0x0209 }
        r3 = defpackage.tod.FEED;	 Catch:{ all -> 0x0209 }
        r3 = r3.name();	 Catch:{ all -> 0x0209 }
        r3 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0209 }
        if (r3 == 0) goto L_0x00a0;	 Catch:{ all -> 0x0209 }
        r7 = new tpl$b$d;	 Catch:{ all -> 0x0209 }
        r7.<init>();	 Catch:{ all -> 0x0209 }
        goto L_0x008b;	 Catch:{ all -> 0x0209 }
        r3 = defpackage.tod.GALLERY;	 Catch:{ all -> 0x0209 }
        r3 = r3.name();	 Catch:{ all -> 0x0209 }
        r3 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0209 }
        if (r3 == 0) goto L_0x00b2;	 Catch:{ all -> 0x0209 }
        r7 = new tpl$b$e;	 Catch:{ all -> 0x0209 }
        r7.<init>();	 Catch:{ all -> 0x0209 }
        goto L_0x008b;	 Catch:{ all -> 0x0209 }
        r3 = defpackage.tod.DISCOVER;	 Catch:{ all -> 0x0209 }
        r3 = r3.name();	 Catch:{ all -> 0x0209 }
        r3 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0209 }
        if (r3 == 0) goto L_0x00c4;	 Catch:{ all -> 0x0209 }
        r7 = new tpl$b$b;	 Catch:{ all -> 0x0209 }
        r7.<init>();	 Catch:{ all -> 0x0209 }
        goto L_0x008b;	 Catch:{ all -> 0x0209 }
        r3 = defpackage.tod.CHAT_GALLERY;	 Catch:{ all -> 0x0209 }
        r3 = r3.name();	 Catch:{ all -> 0x0209 }
        r3 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0209 }
        if (r3 == 0) goto L_0x00d6;	 Catch:{ all -> 0x0209 }
        r7 = new tpl$b$a;	 Catch:{ all -> 0x0209 }
        r7.<init>();	 Catch:{ all -> 0x0209 }
        goto L_0x008b;	 Catch:{ all -> 0x0209 }
        r3 = defpackage.tod.EXT_SHARE;	 Catch:{ all -> 0x0209 }
        r3 = r3.name();	 Catch:{ all -> 0x0209 }
        r2 = defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0209 }
        if (r2 == 0) goto L_0x01ed;	 Catch:{ all -> 0x0209 }
        r7 = new tpl$b$c;	 Catch:{ all -> 0x0209 }
        r7.<init>();	 Catch:{ all -> 0x0209 }
        goto L_0x008b;	 Catch:{ all -> 0x0209 }
        r2 = new tpl;	 Catch:{ all -> 0x0209 }
        r2.<init>(r0, r7);	 Catch:{ all -> 0x0209 }
        r4.ak = r2;	 Catch:{ all -> 0x0209 }
        r7 = r4.x;	 Catch:{ all -> 0x0209 }
        if (r7 != 0) goto L_0x00f8;	 Catch:{ all -> 0x0209 }
        r0 = "previewDataSource";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r0);	 Catch:{ all -> 0x0209 }
        r0 = r4.ak;	 Catch:{ all -> 0x0209 }
        r2 = "previewStartUpConfig";
        if (r0 != 0) goto L_0x0101;
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x0209 }
        r3 = "<set-?>";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.b(r0, r3);	 Catch:{ all -> 0x0209 }
        r7.l = r0;	 Catch:{ all -> 0x0209 }
        r7 = r4.r;	 Catch:{ all -> 0x0209 }
        r0 = "enterPreviewAnimationComponentBuilder";
        if (r7 != 0) goto L_0x0111;
        defpackage.akcr.a(r0);	 Catch:{ all -> 0x0209 }
        r3 = 2131428540; // 0x7f0b04bc float:1.8478727E38 double:1.053065618E-314;	 Catch:{ all -> 0x0209 }
        r3 = r6.findViewById(r3);	 Catch:{ all -> 0x0209 }
        if (r3 != 0) goto L_0x011d;	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0209 }
        r3 = (android.view.ViewStub) r3;	 Catch:{ all -> 0x0209 }
        r7 = r7.a(r3);	 Catch:{ all -> 0x0209 }
        r3 = r4.ak;	 Catch:{ all -> 0x0209 }
        if (r3 != 0) goto L_0x012a;	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r2);	 Catch:{ all -> 0x0209 }
        r7 = r7.a(r3);	 Catch:{ all -> 0x0209 }
        r2 = r4.r;	 Catch:{ all -> 0x0209 }
        if (r2 != 0) goto L_0x0135;	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r0);	 Catch:{ all -> 0x0209 }
        r0 = r2.d;	 Catch:{ all -> 0x0209 }
        r7 = r7.a(r0);	 Catch:{ all -> 0x0209 }
        r7 = r7.a();	 Catch:{ all -> 0x0209 }
        r7 = r7.a();	 Catch:{ all -> 0x0209 }
        r7 = r7.start();	 Catch:{ all -> 0x0209 }
        r0 = "enterPreviewAnimationCom…\n                .start()";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r7, r0);	 Catch:{ all -> 0x0209 }
        r0 = r4.O;	 Catch:{ all -> 0x0209 }
        defpackage.ajvv.a(r7, r0);	 Catch:{ all -> 0x0209 }
        r7 = r4.d;	 Catch:{ all -> 0x0209 }
        r7 = (defpackage.ajdt) r7;	 Catch:{ all -> 0x0209 }
        r0 = r4.c;	 Catch:{ all -> 0x0209 }
        r0 = (defpackage.ajdt) r0;	 Catch:{ all -> 0x0209 }
        r2 = com.snap.preview.app.bindings.PreviewFragmentImpl.l.a;	 Catch:{ all -> 0x0209 }
        r2 = (defpackage.ajex) r2;	 Catch:{ all -> 0x0209 }
        r7 = defpackage.ajdp.a(r7, r0, r2);	 Catch:{ all -> 0x0209 }
        r7 = r7.d();	 Catch:{ all -> 0x0209 }
        r0 = r4.n();	 Catch:{ all -> 0x0209 }
        r0 = r0.b();	 Catch:{ all -> 0x0209 }
        r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x0209 }
        r7 = r7.a(r0);	 Catch:{ all -> 0x0209 }
        r0 = new com.snap.preview.app.bindings.PreviewFragmentImpl$m;	 Catch:{ all -> 0x0209 }
        r0.<init>(r4, r6, r5);	 Catch:{ all -> 0x0209 }
        r0 = (defpackage.ajfb) r0;	 Catch:{ all -> 0x0209 }
        r6 = r7.d(r0);	 Catch:{ all -> 0x0209 }
        r7 = "Observable.combineLatest…      }\n                }";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x0209 }
        defpackage.ajvv.a(r6, r5);	 Catch:{ all -> 0x0209 }
        r6 = r4.e;	 Catch:{ all -> 0x0209 }
        r7 = r4.n();	 Catch:{ all -> 0x0209 }
        r7 = r7.l();	 Catch:{ all -> 0x0209 }
        r7 = (defpackage.zfr) r7;	 Catch:{ all -> 0x0209 }
        r7 = (defpackage.ajdw) r7;	 Catch:{ all -> 0x0209 }
        r6 = r6.a(r7);	 Catch:{ all -> 0x0209 }
        r7 = new com.snap.preview.app.bindings.PreviewFragmentImpl$n;	 Catch:{ all -> 0x0209 }
        r7.<init>(r4);	 Catch:{ all -> 0x0209 }
        r7 = (defpackage.ajfb) r7;	 Catch:{ all -> 0x0209 }
        r6 = r6.f(r7);	 Catch:{ all -> 0x0209 }
        r7 = "exitPreviewRequestSubjec…bscribe { exitPreview() }";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x0209 }
        defpackage.ajvv.a(r6, r5);	 Catch:{ all -> 0x0209 }
        r6 = r4.P;	 Catch:{ all -> 0x0209 }
        r6 = (defpackage.ajdt) r6;	 Catch:{ all -> 0x0209 }
        r7 = r4.Q;	 Catch:{ all -> 0x0209 }
        r7 = (defpackage.ajdt) r7;	 Catch:{ all -> 0x0209 }
        r0 = com.snap.preview.app.bindings.PreviewFragmentImpl.o.a;	 Catch:{ all -> 0x0209 }
        r0 = (defpackage.ajex) r0;	 Catch:{ all -> 0x0209 }
        r6 = defpackage.ajdp.a(r6, r7, r0);	 Catch:{ all -> 0x0209 }
        r7 = new com.snap.preview.app.bindings.PreviewFragmentImpl$p;	 Catch:{ all -> 0x0209 }
        r7.<init>(r4);	 Catch:{ all -> 0x0209 }
        r7 = (defpackage.ajfb) r7;	 Catch:{ all -> 0x0209 }
        r6 = r6.f(r7);	 Catch:{ all -> 0x0209 }
        r7 = "Observable.combineLatest…teObservable.onNext(it) }";	 Catch:{ all -> 0x0209 }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x0209 }
        defpackage.ajvv.a(r6, r5);	 Catch:{ all -> 0x0209 }
        r6 = r4.B;	 Catch:{ all -> 0x01eb }
        if (r6 != 0) goto L_0x01d7;	 Catch:{ all -> 0x01eb }
        r7 = "rxBus";	 Catch:{ all -> 0x01eb }
        defpackage.akcr.a(r7);	 Catch:{ all -> 0x01eb }
        r6 = r6.a(r4);	 Catch:{ all -> 0x01eb }
        r7 = "rxBus.subscribe(this)";	 Catch:{ all -> 0x01eb }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x01eb }
        defpackage.ajvv.a(r6, r5);	 Catch:{ all -> 0x01eb }
        r5 = r4.al;	 Catch:{ all -> 0x0213 }
        if (r5 != 0) goto L_0x01ea;	 Catch:{ all -> 0x0213 }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x0213 }
        return r5;
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0209 }
        r5 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0209 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0209 }
        r0 = "unexpected value ";	 Catch:{ all -> 0x0209 }
        r6.<init>(r0);	 Catch:{ all -> 0x0209 }
        r0 = "MEDIA_TYPE";	 Catch:{ all -> 0x0209 }
        r7 = r7.get(r0);	 Catch:{ all -> 0x0209 }
        r6.append(r7);	 Catch:{ all -> 0x0209 }
        r6 = r6.toString();	 Catch:{ all -> 0x0209 }
        r5.<init>(r6);	 Catch:{ all -> 0x0209 }
        r5 = (java.lang.Throwable) r5;	 Catch:{ all -> 0x0209 }
        throw r5;	 Catch:{ all -> 0x0209 }
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0213 }
        r5 = new ajxt;	 Catch:{ all -> 0x0213 }
        r6 = "null cannot be cast to non-null type android.widget.FrameLayout";	 Catch:{ all -> 0x0213 }
        r5.<init>(r6);	 Catch:{ all -> 0x0213 }
        throw r5;	 Catch:{ all -> 0x0213 }
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.app.bindings.PreviewFragmentImpl.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        this.g.a(ajxw.a);
        this.S.a(ajxw.a);
        this.o.a(Boolean.FALSE);
        this.b.dispose();
        this.N.dispose();
        super.onDestroyView();
        twd twd = this.z;
        if (twd == null) {
            akcr.a("previewMetricsPlugin");
        }
        zgo.a(twd.c.b);
    }

    public final void onPause() {
        this.ab.a(ajxw.a);
        super.onPause();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPreviewPostEvent(tqe tqe) {
        akcr.b(tqe, "event");
        if (q()) {
            this.K.a((Object) tqe);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPreviewSaveEvent(tqf tqf) {
        akcr.b(tqf, "event");
        this.M.a((Object) tqf);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPreviewSendEvent(tqg tqg) {
        akcr.b(tqg, "event");
        if (q()) {
            this.J.a((Object) tqg);
        }
    }

    public final void onStart() {
        super.onStart();
        this.P.a(Boolean.TRUE);
    }

    public final void onStop() {
        super.onStop();
        this.P.a(Boolean.FALSE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        view = this.al;
        if (view == null) {
            akcr.a("rootView");
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        zfw n = n();
        akcr.a((Object) viewTreeObserver, "viewTreeObserver");
        viewTreeObserver.addOnDrawListener(new a(n, viewTreeObserver, (akbk) new d(this)));
        ajej f = this.Q.a((ajfl) e.a).f((ajfb) new f(this));
        akcr.a((Object) f, "deckVisibleSubject.filte…)\n            }\n        }");
        ajvv.a(f, this.N);
    }

    /* Access modifiers changed, original: final */
    public final void p() {
        if (q()) {
            defpackage.dnk.c cVar = defpackage.dnk.c.a;
            achb achb = this.w;
            if (achb == null) {
                akcr.a("navigationHost");
            }
            achb.a((achg) toc.a, true, false, (acih) cVar);
        }
    }

    public final void q_() {
        this.I.a(new tqb());
    }
}
