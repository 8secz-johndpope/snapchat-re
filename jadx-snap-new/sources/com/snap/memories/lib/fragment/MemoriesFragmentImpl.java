package com.snap.memories.lib.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.snap.memories.api.MemoriesFragment;
import com.snap.memories.lib.grid.view.MemoriesAllPagesRecyclerView;
import com.snap.memories.lib.meo.MyEyesOnlyStateProvider;
import com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip;
import com.snapchat.android.R;
import defpackage.abmr;
import defpackage.abur;
import defpackage.acgw;
import defpackage.achb;
import defpackage.achi;
import defpackage.achk;
import defpackage.aipx;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdp;
import defpackage.ajdv;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfu;
import defpackage.ajvv;
import defpackage.ajwa;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.igk;
import defpackage.j;
import defpackage.oiy;
import defpackage.ojb;
import defpackage.ojc;
import defpackage.ojj;
import defpackage.ovj;
import defpackage.ovj.ad;
import defpackage.ovj.al;
import defpackage.oyu;
import defpackage.pam;
import defpackage.pao;
import defpackage.pbf;
import defpackage.pft;
import defpackage.pfu;
import defpackage.phk;
import defpackage.pht;
import defpackage.phx;
import defpackage.pia;
import defpackage.pia.k;
import defpackage.pib;
import defpackage.pic;
import defpackage.pkp;
import defpackage.pnt;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkf;
import defpackage.zkq;

public final class MemoriesFragmentImpl extends MemoriesFragment implements zjj, zjq {
    private final ajxe A = ajxh.a(new h(this));
    private final ajei B;
    private boolean C;
    public ajwy<zkq> b;
    public ajwy<pam> c;
    public ajwy<pao> d;
    public ajwy<pib> e;
    public ajwy<pkp> f;
    public ajwy<oiy> g;
    public ajwy<zgb> h;
    public ajwy<phx> i;
    public ajwy<MyEyesOnlyStateProvider> j;
    public ajwy<pnt> k;
    public ajwy<oyu> l;
    public ajwy<pht> m;
    public ajwy<pfu> n;
    public ajwy<pft> o;
    public ajwy<phk> p;
    PagerSlidingTabStrip q;
    abur<View> r;
    final ajwl<Boolean> s;
    final ajxe t = ajxh.a(new d(this));
    final ajwo<ojb> u;
    final ajwo<ojj> v;
    final ajei w;
    private AppBarLayout x;
    private MemoriesAllPagesRecyclerView y;
    private final ajxe z = ajxh.a(new e(this));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class f implements Runnable {
        private /* synthetic */ MemoriesFragmentImpl a;

        f(MemoriesFragmentImpl memoriesFragmentImpl) {
            this.a = memoriesFragmentImpl;
        }

        public final void run() {
            ajwy ajwy = this.a.i;
            if (ajwy == null) {
                akcr.a("dataMigrationController");
            }
            phx phx = (phx) ajwy.get();
            if (phx.a.compareAndSet(false, true)) {
                ovj ovj = (ovj) phx.c.get();
                Object a = ovj.i().a((ajfc) new ad(ovj));
                akcr.a(a, "hasLegacyDatabaseFile()\n…      }\n                }");
                Object e = a.e((ajfc) new al(ovj));
                akcr.a(e, "isDatabaseMigrationRequi…      }\n                }");
                pia pia = (pia) phx.d.get();
                a = ((ovj) pia.e.get()).j().e((ajfc) new k(pia));
                akcr.a(a, "migrationRepository.get(…      }\n                }");
                e = e.b((ajdb) a).a(ajfu.g);
                akcr.a(e, "migrationRepository.get(…       .onErrorComplete()");
                ajej e2 = e.e();
                akcr.a((Object) e2, "performMigrationIfNeeded…             .subscribe()");
                Object obj = phx.b.get();
                akcr.a(obj, "sessionDisposable.get()");
                ajvv.a(e2, (ajei) obj);
            }
            ajwy = this.a.f;
            if (ajwy == null) {
                akcr.a("syncManager");
            }
            ((pkp) ajwy.get()).a();
        }
    }

    public static final class c implements pic {
        final /* synthetic */ MemoriesFragmentImpl a;

        static final class a extends akcs implements akbk<ajxw> {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.a.a.w();
                return ajxw.a;
            }
        }

        c(MemoriesFragmentImpl memoriesFragmentImpl) {
            this.a = memoriesFragmentImpl;
        }

        public final View a() {
            MemoriesFragmentImpl.b(this.a).setVisibility(8);
            MemoriesFragmentImpl.a(this.a).setVisibility(8);
            abur abur = this.a.r;
            if (abur != null) {
                View a = abur.a();
                if (a != null) {
                    return a;
                }
            }
            throw new IllegalStateException("Attempting to block memories after lazyBlockingUi was disposed of.");
        }

        public final void a(View view) {
            ajwy ajwy;
            if (view != null) {
                view.setVisibility(8);
                View view2 = this.a.getView();
                if (!(view2 instanceof ViewGroup)) {
                    view2 = null;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            if (view == null) {
                ajwy = this.a.p;
                if (ajwy == null) {
                    akcr.a("loadCompleteMetricsManager");
                }
                phk phk = (phk) ajwy.get();
                akbk aVar = new a(this);
                akcr.b(aVar, "loadCompleteAction");
                phk.a = aVar;
            }
            MemoriesFragmentImpl memoriesFragmentImpl = this.a;
            memoriesFragmentImpl.r = null;
            MemoriesFragmentImpl.b(memoriesFragmentImpl).setVisibility(0);
            MemoriesFragmentImpl.a(this.a).setVisibility(0);
            ajwy = this.a.e;
            if (ajwy == null) {
                akcr.a("migrationBlockingPresenter");
            }
            ((pib) ajwy.get()).dropTarget();
            ajwy = this.a.c;
            if (ajwy == null) {
                akcr.a("gridPresenter");
            }
            ((pam) ajwy.get()).takeTarget((pbf) this.a.t.b());
            ajwy = this.a.d;
            if (ajwy == null) {
                akcr.a("tabsPresenter");
            }
            ((pao) ajwy.get()).takeTarget(ajxw.a);
            ((oyu) this.a.g().get()).c.a((ajdv) this.a.u);
            ((oyu) this.a.g().get()).d.a((ajdv) this.a.v);
            ajwy = this.a.n;
            if (ajwy == null) {
                akcr.a("memoriesLifecycleProvider");
            }
            pfu pfu = (pfu) ajwy.get();
            MemoriesAllPagesRecyclerView b = MemoriesFragmentImpl.b(this.a);
            akcr.b(b, "recyclerView");
            if (pfu.d == null) {
                abmr.a();
                pfu.d = b;
                b.addOnScrollListener(pfu.a());
                RecyclerView recyclerView = b;
                int a = pfu.a(recyclerView.getLayoutManager());
                if (a < 0) {
                    pfu.e = new defpackage.pfu.c(pfu, recyclerView);
                    recyclerView.addOnLayoutChangeListener(pfu.e);
                } else {
                    pfu.a(a);
                }
                Object j = pfu.f.a.j(ajfu.a);
                akcr.a(j, "subject.distinctUntilChanged()");
                ajej f = ajwa.a(j, pfu.b).f((ajfb) new defpackage.pfu.d(pfu));
                akcr.a((Object) f, "Observables.combineLates…wModel)\n                }");
                ajvv.a(f, pfu.a);
            }
            ajvv.a((ajej) pfu, this.a.w);
        }
    }

    static final class g<T extends View> implements defpackage.abur.a<T> {
        public static final g a = new g();

        g() {
        }

        public final void onViewInflated(View view) {
            akcr.b(view, "it");
        }
    }

    public static final class b implements pbf {
        private final ajwl<Boolean> a;
        private final ajwy<zkq> b;
        private /* synthetic */ MemoriesFragmentImpl c;
        private /* synthetic */ MemoriesFragmentImpl d;

        b(MemoriesFragmentImpl memoriesFragmentImpl, MemoriesFragmentImpl memoriesFragmentImpl2) {
            this.c = memoriesFragmentImpl;
            this.d = memoriesFragmentImpl2;
            this.a = memoriesFragmentImpl.s;
            ajwy ajwy = memoriesFragmentImpl.b;
            if (ajwy == null) {
                akcr.a("insetsDetector");
            }
            this.b = ajwy;
        }

        public final AppBarLayout a() {
            return MemoriesFragmentImpl.a(this.c);
        }

        public final PagerSlidingTabStrip b() {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.c.q;
            if (pagerSlidingTabStrip == null) {
                akcr.a("gridTabNavigationBar");
            }
            return pagerSlidingTabStrip;
        }

        public final MemoriesAllPagesRecyclerView c() {
            return MemoriesFragmentImpl.b(this.c);
        }

        public final /* bridge */ /* synthetic */ ajdp d() {
            return this.a;
        }

        public final ajwy<zkq> e() {
            return this.b;
        }

        public final j getLifecycle() {
            Object lifecycle = this.d.getLifecycle();
            akcr.a(lifecycle, "self.lifecycle");
            return lifecycle;
        }
    }

    static final class d extends akcs implements akbk<pbf> {
        private /* synthetic */ MemoriesFragmentImpl a;

        d(MemoriesFragmentImpl memoriesFragmentImpl) {
            this.a = memoriesFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            MemoriesFragmentImpl memoriesFragmentImpl = this.a;
            return new b(memoriesFragmentImpl, memoriesFragmentImpl);
        }
    }

    static final class e extends akcs implements akbk<pic> {
        private /* synthetic */ MemoriesFragmentImpl a;

        e(MemoriesFragmentImpl memoriesFragmentImpl) {
            this.a = memoriesFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new c(this.a);
        }
    }

    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ MemoriesFragmentImpl a;

        h(MemoriesFragmentImpl memoriesFragmentImpl) {
            this.a = memoriesFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.h;
            if (ajwy == null) {
                akcr.a("schedulersProvider");
            }
            ajwy.get();
            ajwy = this.a.g;
            if (ajwy == null) {
                akcr.a("attributedFeature");
            }
            return zgb.a(((oiy) ajwy.get()).callsite("MemoriesFragmentImpl"));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(MemoriesFragmentImpl.class), "gridPresenterTarget", "getGridPresenterTarget()Lcom/snap/memories/lib/grid/presentertarget/MemoriesGridPresenterTarget;"), new akdc(akde.a(MemoriesFragmentImpl.class), "migrationTarget", "getMigrationTarget()Lcom/snap/memories/lib/migration/MigrationBlockingViewTarget;"), new akdc(akde.a(MemoriesFragmentImpl.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        a aVar = new a();
    }

    public MemoriesFragmentImpl() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.s = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<MemoriesEditEvent>()");
        this.u = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<MemoriesSendEvent>()");
        this.v = ajwl;
        this.w = new ajei();
        this.B = new ajei();
    }

    public static final /* synthetic */ AppBarLayout a(MemoriesFragmentImpl memoriesFragmentImpl) {
        AppBarLayout appBarLayout = memoriesFragmentImpl.x;
        if (appBarLayout == null) {
            akcr.a("gridHeader");
        }
        return appBarLayout;
    }

    private final void h() {
        if (!this.C) {
            this.C = true;
            i();
        }
    }

    private final void i() {
        ajwy ajwy = this.o;
        if (ajwy == null) {
            akcr.a("fragmentStateDispatcher");
        }
        ((pft) ajwy.get()).a(this);
        ajwy = this.m;
        if (ajwy == null) {
            akcr.a("sessionMetricsManager");
        }
        ((pht) ajwy.get()).a();
        ajwy = this.l;
        if (ajwy == null) {
            akcr.a("memoriesBusEventHandler");
        }
        ajvv.a(((oyu) ajwy.get()).c(), this.B);
    }

    private final void j() {
        if (this.C) {
            this.C = false;
            k();
        }
    }

    private final void k() {
        ajwy ajwy = this.o;
        if (ajwy == null) {
            akcr.a("fragmentStateDispatcher");
        }
        ((pft) ajwy.get()).b(this);
        ajwy = this.m;
        if (ajwy == null) {
            akcr.a("sessionMetricsManager");
        }
        ((pht) ajwy.get()).b();
        this.B.a();
    }

    public final long S_() {
        return MemoriesFragment.a;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        this.s.a(Boolean.TRUE);
        h();
    }

    public final ajdp<ojb> b() {
        return this.u;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        if (achi.d == acgw.DISMISS && akcr.a((zjm) achi.e.e(), ojc.a)) {
            j();
        }
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.c(achi);
        if (achi.l && akcr.a((zjm) achi.e.e(), ojc.a) && achi.d == acgw.DISMISS) {
            this.s.a(Boolean.FALSE);
        }
    }

    public final void d(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.d(achi);
        if (akcr.a((zjm) achi.e.e(), ojc.a) && achi.d == acgw.DISMISS) {
            this.s.a(Boolean.TRUE);
        }
    }

    public final boolean d() {
        return false;
    }

    public final ajdp<ojj> f() {
        return this.v;
    }

    public final ajwy<oyu> g() {
        ajwy ajwy = this.l;
        if (ajwy == null) {
            akcr.a("memoriesBusEventHandler");
        }
        return ajwy;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        aipx.a(this);
        ((zfw) this.A.b()).b().a((Runnable) new f(this));
        ajwy ajwy = this.k;
        if (ajwy == null) {
            akcr.a("snapsClustersVariablesProvider");
        }
        pnt pnt = (pnt) ajwy.get();
        ajej e = ajcx.a((ajev) new defpackage.pnt.d(pnt)).b((ajdw) ((zfw) pnt.a.b()).i()).e();
        akcr.a((Object) e, "Completable.fromAction {…             .subscribe()");
        ajvv.a(e, this.w);
        ajwy = this.e;
        if (ajwy == null) {
            akcr.a("migrationBlockingPresenter");
        }
        ((pib) ajwy.get()).takeTarget((pic) this.z.b());
        ajwy = this.j;
        if (ajwy == null) {
            akcr.a("myEyesOnlyStateProvider");
        }
        MyEyesOnlyStateProvider myEyesOnlyStateProvider = (MyEyesOnlyStateProvider) ajwy.get();
        Object lifecycle = getLifecycle();
        String str = "lifecycle";
        akcr.a(lifecycle, str);
        akcr.b(lifecycle, str);
        myEyesOnlyStateProvider.b = lifecycle;
        j jVar = myEyesOnlyStateProvider.b;
        if (jVar != null) {
            jVar.a(myEyesOnlyStateProvider);
        }
        ((achb) myEyesOnlyStateProvider.h.get()).a((achk) myEyesOnlyStateProvider);
        igk.a(((zkf) myEyesOnlyStateProvider.i.get()).a(myEyesOnlyStateProvider), myEyesOnlyStateProvider.a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.memories_fragment, viewGroup, false);
        if (inflate != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            Object findViewById = viewGroup2.findViewById(R.id.memories_grid_header);
            akcr.a(findViewById, "view.findViewById(R.id.memories_grid_header)");
            this.x = (AppBarLayout) findViewById;
            findViewById = viewGroup2.findViewById(R.id.memories_grid_tab_navigation);
            akcr.a(findViewById, "view.findViewById(R.id.m…ries_grid_tab_navigation)");
            this.q = (PagerSlidingTabStrip) findViewById;
            findViewById = viewGroup2.findViewById(R.id.memories_grid_pages);
            akcr.a(findViewById, "view.findViewById(R.id.memories_grid_pages)");
            this.y = (MemoriesAllPagesRecyclerView) findViewById;
            findViewById = viewGroup2.findViewById(R.id.blocking_progress_view);
            akcr.a(findViewById, "view.findViewById(R.id.blocking_progress_view)");
            this.r = new abur((ViewStub) findViewById, (int) R.id.memories_loading_view_container, (defpackage.abur.a) g.a);
            return viewGroup2;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onDetach() {
        this.w.a();
        ajwy ajwy = this.c;
        if (ajwy == null) {
            akcr.a("gridPresenter");
        }
        ((pam) ajwy.get()).dropTarget();
        ajwy = this.d;
        if (ajwy == null) {
            akcr.a("tabsPresenter");
        }
        ((pao) ajwy.get()).dropTarget();
        ajwy = this.j;
        if (ajwy == null) {
            akcr.a("myEyesOnlyStateProvider");
        }
        MyEyesOnlyStateProvider myEyesOnlyStateProvider = (MyEyesOnlyStateProvider) ajwy.get();
        j jVar = myEyesOnlyStateProvider.b;
        if (jVar != null) {
            jVar.b(myEyesOnlyStateProvider);
        }
        ((achb) myEyesOnlyStateProvider.h.get()).b((achk) myEyesOnlyStateProvider);
        myEyesOnlyStateProvider.a.a();
        ajwy = this.p;
        if (ajwy == null) {
            akcr.a("loadCompleteMetricsManager");
        }
        ((phk) ajwy.get()).a = null;
        super.onDetach();
    }

    public final void onPause() {
        super.onPause();
        j();
    }

    public final void onResume() {
        super.onResume();
        h();
    }
}
