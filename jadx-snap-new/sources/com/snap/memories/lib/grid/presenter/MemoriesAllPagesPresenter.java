package com.snap.memories.lib.grid.presenter;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import com.snap.memories.lib.grid.view.MemoriesAllPagesRecyclerView;
import com.snap.spectacles.api.SpectaclesLifeCycleAwareStatusBarPresenterInterface;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajws;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.ajyl;
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
import defpackage.oyz;
import defpackage.ozm;
import defpackage.pbc;
import defpackage.pbr;
import defpackage.pcw;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zlx;
import defpackage.zmh;
import defpackage.zms;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class MemoriesAllPagesPresenter extends zll<pbc> implements k {
    private zms a;
    private zmh b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final ajxe d;
    private final OnScrollListener e;
    private final zkf f;
    private final pcw g;
    private final pbr h;
    private final ajwy<fxi> i;
    private final ajwy<ozm> j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class c extends OnScrollListener {
        private /* synthetic */ MemoriesAllPagesPresenter a;

        c(MemoriesAllPagesPresenter memoriesAllPagesPresenter) {
            this.a = memoriesAllPagesPresenter;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            if (i == 2) {
                pbc pbc = (pbc) this.a.getTarget();
                if (pbc != null) {
                    ajws b = pbc.b();
                    if (b != null) {
                        b.a((Object) ajxw.a);
                    }
                }
            }
        }
    }

    static final class e<T> implements ajfb<Set<? extends olj>> {
        private /* synthetic */ pbc a;

        e(pbc pbc) {
            this.a = pbc;
        }

        public final /* synthetic */ void accept(Object obj) {
            Set set = (Set) obj;
            LayoutManager layoutManager = this.a.a().getLayoutManager();
            if (!(layoutManager instanceof b)) {
                layoutManager = null;
            }
            b bVar = (b) layoutManager;
            if (bVar != null) {
                bVar.a = set.isEmpty();
            }
        }
    }

    static final class b extends LinearLayoutManager {
        boolean a = true;

        public b(Context context) {
            akcr.b(context, "context");
            super(context, 0, false);
        }

        public final boolean canScrollHorizontally() {
            return this.a;
        }

        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ oiy b;

        d(zgb zgb, oiy oiy) {
            this.a = zgb;
            this.b = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("MemoriesAllPagesPresenter"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(MemoriesAllPagesPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public MemoriesAllPagesPresenter(oiy oiy, zkf zkf, pcw pcw, pbr pbr, zgb zgb, ajwy<fxi> ajwy, ajwy<ozm> ajwy2) {
        akcr.b(oiy, "memoriesFeature");
        akcr.b(zkf, "bus");
        akcr.b(pcw, "bindingContext");
        akcr.b(pbr, "sectionController");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "lowEndDeviceConfiguration");
        akcr.b(ajwy2, "multiSelectController");
        this.f = zkf;
        this.g = pcw;
        this.h = pbr;
        this.i = ajwy;
        this.j = ajwy2;
        this.d = ajxh.a(new d(zgb, oiy));
        this.e = new c(this);
    }

    private final zfw a() {
        return (zfw) this.d.b();
    }

    /* renamed from: a */
    public final void takeTarget(pbc pbc) {
        akcr.b(pbc, "target");
        super.takeTarget(pbc);
        this.a = new zms((zlx) this.g, oyz.class);
        pbc.getLifecycle().a(this);
        SpectaclesLifeCycleAwareStatusBarPresenterInterface spectaclesLifeCycleAwareStatusBarPresenterInterface = (SpectaclesLifeCycleAwareStatusBarPresenterInterface) this.g.g.get();
        j lifecycle = pbc.getLifecycle();
        akcr.a((Object) lifecycle, "target.lifecycle");
        spectaclesLifeCycleAwareStatusBarPresenterInterface.a(lifecycle);
        zln.bindTo$default(this, ((ozm) this.j.get()).c().a((ajdw) a().l()).f((ajfb) new e(pbc)), this, null, null, 6, null);
    }

    public final void dropTarget() {
        pbc pbc = (pbc) getTarget();
        if (pbc != null) {
            j lifecycle = pbc.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        ((SpectaclesLifeCycleAwareStatusBarPresenterInterface) this.g.g.get()).a();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.c.compareAndSet(false, true)) {
            pbc pbc = (pbc) getTarget();
            if (pbc != null) {
                MemoriesAllPagesRecyclerView a = pbc.a();
                if (((fxi) this.i.get()).c) {
                    a.setItemAnimator(null);
                }
                Object context = a.getContext();
                akcr.a(context, "context");
                a.setLayoutManager(new b(context));
                a.setItemAnimator(null);
                a.setHasFixedSize(true);
                new PagerSnapHelper().attachToRecyclerView(a);
                zms zms = this.a;
                if (zms == null) {
                    akcr.a("viewFactory");
                }
                zke a2 = this.f.a();
                akcr.a((Object) a2, "bus.eventDispatcher");
                this.b = new zmh(zms, a2, (ajdw) a().b(), (ajdw) a().l(), ajyl.a(this.h), 32);
                zmh zmh = this.b;
                String str = "sectionAdapter";
                if (zmh == null) {
                    akcr.a(str);
                }
                a.setAdapter(zmh);
                zmh = this.b;
                if (zmh == null) {
                    akcr.a(str);
                }
                zln.bindTo$default(this, zmh.e(), this, null, null, 6, null);
                a.addOnScrollListener(this.e);
            }
        }
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
    }
}
