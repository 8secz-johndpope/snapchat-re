package com.snap.memories.lib.grid.presenter;

import com.snap.ui.view.viewpagerindicator.PagerSlidingTabSource;
import com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fxi;
import defpackage.j;
import defpackage.k;
import defpackage.oiy;
import defpackage.olj;
import defpackage.ozm;
import defpackage.pan;
import defpackage.pao;
import defpackage.pbg;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmy;
import defpackage.znh;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class MemoriesGridTabNavigationPresenter extends zll<pbg> implements k {
    List<? extends PagerSlidingTabSource> a;
    final pao b;
    final oiy c;
    final ajwy<ozm> d;
    private final ajxe e;
    private final AtomicBoolean f = new AtomicBoolean();
    private final ajwy<fxi> g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c<T> implements ajfb<znh<zmy>> {
        private /* synthetic */ MemoriesGridTabNavigationPresenter a;

        c(MemoriesGridTabNavigationPresenter memoriesGridTabNavigationPresenter) {
            this.a = memoriesGridTabNavigationPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            List a = this.a.b.a();
            if ((akcr.a((Object) a, this.a.a) ^ 1) != 0) {
                MemoriesGridTabNavigationPresenter memoriesGridTabNavigationPresenter = this.a;
                memoriesGridTabNavigationPresenter.a = a;
                memoriesGridTabNavigationPresenter.a(a);
            }
        }
    }

    static final class d<T> implements ajfb<Set<? extends olj>> {
        private /* synthetic */ MemoriesGridTabNavigationPresenter a;
        private /* synthetic */ pbg b;

        d(MemoriesGridTabNavigationPresenter memoriesGridTabNavigationPresenter, pbg pbg) {
            this.a = memoriesGridTabNavigationPresenter;
            this.b = pbg;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.a().setClickable(((ozm) this.a.d.get()).a() ^ 1);
        }
    }

    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ MemoriesGridTabNavigationPresenter a;
        private /* synthetic */ zgb b;

        b(MemoriesGridTabNavigationPresenter memoriesGridTabNavigationPresenter, zgb zgb) {
            this.a = memoriesGridTabNavigationPresenter;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.c.callsite("MemoriesGridTabNavigationPresenter"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(MemoriesGridTabNavigationPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public MemoriesGridTabNavigationPresenter(pao pao, oiy oiy, zgb zgb, ajwy<fxi> ajwy, ajwy<ozm> ajwy2) {
        akcr.b(pao, "tabsPresenter");
        akcr.b(oiy, "memoriesFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "lowEndDeviceConfiguration");
        akcr.b(ajwy2, "multiSelectController");
        this.b = pao;
        this.c = oiy;
        this.g = ajwy;
        this.d = ajwy2;
        this.e = ajxh.a(new b(this, zgb));
    }

    /* Access modifiers changed, original: final */
    public final void a(List<? extends PagerSlidingTabSource> list) {
        pbg pbg = (pbg) getTarget();
        if (pbg != null) {
            if (((fxi) this.g.get()).c) {
                pbg.b().setItemAnimator(null);
            }
            PagerSlidingTabStrip a = pbg.a();
            a.setTabSourceProvider(new pan(list));
            a.setRecyclerView(pbg.b());
            a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void takeTarget(pbg pbg) {
        akcr.b(pbg, "target");
        super.takeTarget(pbg);
        pbg.getLifecycle().a(this);
        zln zln = this;
        zln.bindTo$default(this, this.b.a.f((ajfb) new c(this)), zln, null, null, 6, null);
        zln.bindTo$default(this, ((ozm) this.d.get()).c().a((ajdw) ((zfw) this.e.b()).l()).f((ajfb) new d(this, pbg)), zln, null, null, 6, null);
    }

    public final void dropTarget() {
        pbg pbg = (pbg) getTarget();
        if (pbg != null) {
            j lifecycle = pbg.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.f.compareAndSet(false, true) && !this.b.a().isEmpty()) {
            List a = this.b.a();
            this.a = a;
            a(a);
        }
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
    }
}
