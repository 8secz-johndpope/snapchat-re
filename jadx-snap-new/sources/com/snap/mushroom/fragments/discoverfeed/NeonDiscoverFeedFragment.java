package com.snap.mushroom.fragments.discoverfeed;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.ptr.NeonPullToRefreshFragment;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.PullToRefreshLayout;
import defpackage.achb;
import defpackage.achg;
import defpackage.achi;
import defpackage.achr;
import defpackage.aciv;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajwy;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.dnh;
import defpackage.fv;
import defpackage.goz;
import defpackage.hbn;
import defpackage.hbw;
import defpackage.hgm;
import defpackage.hgm.aw;
import defpackage.hhk;
import defpackage.hhn;
import defpackage.hhu;
import defpackage.hkm;
import defpackage.hnm;
import defpackage.hnn;
import defpackage.hno;
import defpackage.hny;
import defpackage.hpu;
import defpackage.hqt;
import defpackage.hsa;
import defpackage.hse;
import defpackage.htc;
import defpackage.ide;
import defpackage.ihh;
import defpackage.ipt;
import defpackage.pql;
import defpackage.rco;
import defpackage.rvt;
import defpackage.ssm;
import defpackage.upp;
import defpackage.zhm;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkr;
import defpackage.zlt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class NeonDiscoverFeedFragment extends NeonPullToRefreshFragment<hse> implements zjq {
    private RecyclerView B;
    private View C;
    private View D;
    private hqt E;
    private achg F;
    private ajej G;
    private final ide H = hbn.f;
    private boolean I;
    public aipn<hse> a;
    public ajwy<hsa> b;
    public ipt c;
    public hhk d;
    public hbw e;
    public hhu f;
    public hno g;
    public hhn h;
    public achb<zjm, zjk> i;
    public ihh j;
    public htc k;
    public hpu l;
    public goz m;
    public rco n;
    ajei o = new ajei();
    View p;
    final List<View> q = new ArrayList();
    Rect r;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<V> implements Callable<T> {
        private /* synthetic */ NeonDiscoverFeedFragment a;

        b(NeonDiscoverFeedFragment neonDiscoverFeedFragment) {
            this.a = neonDiscoverFeedFragment;
        }

        private hse a() {
            aipn aipn = this.a.a;
            if (aipn == null) {
                akcr.a("presenterLazy");
            }
            Object obj = (hse) aipn.get();
            ajwy ajwy = this.a.b;
            if (ajwy == null) {
                akcr.a("mDiscoverFeedEventHandlerProvider");
            }
            hsa hsa = (hsa) ajwy.get();
            this.a.o.a((ajej) hsa);
            akcr.a(obj, "presenter");
            hsa.a(obj, obj.h, this.a.q);
            obj.g();
            return obj;
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ NeonDiscoverFeedFragment a;
        private /* synthetic */ View b;

        c(NeonDiscoverFeedFragment neonDiscoverFeedFragment, View view) {
            this.a = neonDiscoverFeedFragment;
            this.b = view;
        }

        public final void onClick(View view) {
            NeonDiscoverFeedFragment.b(this.a);
        }
    }

    static final class j implements OnClickListener {
        private /* synthetic */ NeonDiscoverFeedFragment a;

        j(NeonDiscoverFeedFragment neonDiscoverFeedFragment) {
            this.a = neonDiscoverFeedFragment;
        }

        public final void onClick(View view) {
            NeonDiscoverFeedFragment.b(this.a);
        }
    }

    static final class d<T> implements ajfb<Optional<hkm>> {
        private /* synthetic */ NeonDiscoverFeedFragment a;

        d(NeonDiscoverFeedFragment neonDiscoverFeedFragment) {
            this.a = neonDiscoverFeedFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.n();
            this.a.a(defpackage.hhk.a.ON_REFRESH_COMPLETE);
        }
    }

    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ NeonDiscoverFeedFragment a;

        e(NeonDiscoverFeedFragment neonDiscoverFeedFragment) {
            this.a = neonDiscoverFeedFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.n();
            this.a.a(defpackage.hhk.a.ON_REFRESH_COMPLETE);
        }
    }

    static final class f<T> implements ajfl<Rect> {
        private /* synthetic */ NeonDiscoverFeedFragment a;
        private /* synthetic */ View b;

        f(NeonDiscoverFeedFragment neonDiscoverFeedFragment, View view) {
            this.a = neonDiscoverFeedFragment;
            this.b = view;
        }

        public final /* synthetic */ boolean test(Object obj) {
            obj = (Rect) obj;
            akcr.b(obj, "rect");
            return akcr.a(obj, this.a.r) ^ 1;
        }
    }

    static final class g<T> implements ajfb<Rect> {
        private /* synthetic */ NeonDiscoverFeedFragment a;
        private /* synthetic */ View b;

        g(NeonDiscoverFeedFragment neonDiscoverFeedFragment, View view) {
            this.a = neonDiscoverFeedFragment;
            this.b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            this.a.r = new Rect(rect);
            View a = NeonDiscoverFeedFragment.a(this.a);
            LayoutParams layoutParams = NeonDiscoverFeedFragment.a(this.a).getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = rect.bottom;
                a.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    static final class h<T> implements ajfl<Float> {
        private /* synthetic */ NeonDiscoverFeedFragment a;
        private /* synthetic */ View b;

        h(NeonDiscoverFeedFragment neonDiscoverFeedFragment, View view) {
            this.a = neonDiscoverFeedFragment;
            this.b = view;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((Float) obj, "it");
            View view = this.a.p;
            return view == null || view.getHeight() != 0;
        }
    }

    static final class i<T> implements ajfb<Float> {
        private /* synthetic */ NeonDiscoverFeedFragment a;
        private /* synthetic */ View b;

        i(NeonDiscoverFeedFragment neonDiscoverFeedFragment, View view) {
            this.a = neonDiscoverFeedFragment;
            this.b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Float f = (Float) obj;
            View view = this.a.p;
            if (view != null) {
                view.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, 1.0f - (f.floatValue() / ((float) view.getHeight()))));
            }
        }
    }

    static final class k<T> implements ajfb<ajxm<? extends Long, ? extends String>> {
        private /* synthetic */ NeonDiscoverFeedFragment a;

        k(NeonDiscoverFeedFragment neonDiscoverFeedFragment) {
            this.a = neonDiscoverFeedFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            hhu hhu = this.a.f;
            if (hhu == null) {
                akcr.a("mStoriesAnalytics");
            }
            hhu.G_();
        }
    }

    static {
        a aVar = new a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x00cb in {5, 8, 11, 14, 20, 23, 25, 26, 28} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final java.util.List<android.view.View> c(android.view.View r6) {
        /*
        r5 = this;
        r0 = r5.c;	 Catch:{ all -> 0x00c9 }
        r1 = "hovaController";
        if (r0 != 0) goto L_0x0009;
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x00c9 }
        r2 = 2131429258; // 0x7f0b078a float:1.8480184E38 double:1.053065973E-314;	 Catch:{ all -> 0x00c9 }
        r3 = defpackage.hbn.a;	 Catch:{ all -> 0x00c9 }
        r0 = r0.a(r2, r3);	 Catch:{ all -> 0x00c9 }
        if (r0 != 0) goto L_0x0017;	 Catch:{ all -> 0x00c9 }
        defpackage.akcr.a();	 Catch:{ all -> 0x00c9 }
        r5.p = r0;	 Catch:{ all -> 0x00c9 }
        r0 = 2131429262; // 0x7f0b078e float:1.8480192E38 double:1.053065975E-314;	 Catch:{ all -> 0x00c9 }
        r0 = r6.findViewById(r0);	 Catch:{ all -> 0x00c9 }
        r2 = "view.findViewById(com.sn…neon_header_top_gradient)";	 Catch:{ all -> 0x00c9 }
        defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x00c9 }
        r5.C = r0;	 Catch:{ all -> 0x00c9 }
        r0 = 2131429251; // 0x7f0b0783 float:1.848017E38 double:1.0530659695E-314;	 Catch:{ all -> 0x00c9 }
        r0 = r6.findViewById(r0);	 Catch:{ all -> 0x00c9 }
        r2 = "view.findViewById(com.sn….id.neon_bottom_gradient)";	 Catch:{ all -> 0x00c9 }
        defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x00c9 }
        r5.D = r0;	 Catch:{ all -> 0x00c9 }
        r0 = r5.c;	 Catch:{ all -> 0x00c9 }
        if (r0 != 0) goto L_0x003c;	 Catch:{ all -> 0x00c9 }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x00c9 }
        r2 = 2131428264; // 0x7f0b03a8 float:1.8478168E38 double:1.053065482E-314;	 Catch:{ all -> 0x00c9 }
        r3 = defpackage.hbn.a;	 Catch:{ all -> 0x00c9 }
        r0 = r0.a(r2, r3);	 Catch:{ all -> 0x00c9 }
        if (r0 != 0) goto L_0x004a;	 Catch:{ all -> 0x00c9 }
        defpackage.akcr.a();	 Catch:{ all -> 0x00c9 }
        r2 = new com.snap.mushroom.fragments.discoverfeed.NeonDiscoverFeedFragment$c;	 Catch:{ all -> 0x00c9 }
        r2.<init>(r5, r6);	 Catch:{ all -> 0x00c9 }
        r2 = (android.view.View.OnClickListener) r2;	 Catch:{ all -> 0x00c9 }
        r0.setOnClickListener(r2);	 Catch:{ all -> 0x00c9 }
        r6 = 6;	 Catch:{ all -> 0x00c9 }
        r6 = new java.lang.Integer[r6];	 Catch:{ all -> 0x00c9 }
        r2 = 0;	 Catch:{ all -> 0x00c9 }
        r3 = 2131427700; // 0x7f0b0174 float:1.8477024E38 double:1.053065203E-314;	 Catch:{ all -> 0x00c9 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00c9 }
        r6[r2] = r3;	 Catch:{ all -> 0x00c9 }
        r2 = 1;	 Catch:{ all -> 0x00c9 }
        r3 = 2131428415; // 0x7f0b043f float:1.8478474E38 double:1.0530655564E-314;	 Catch:{ all -> 0x00c9 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00c9 }
        r6[r2] = r3;	 Catch:{ all -> 0x00c9 }
        r2 = 2;	 Catch:{ all -> 0x00c9 }
        r3 = 2131428648; // 0x7f0b0528 float:1.8478946E38 double:1.0530656715E-314;	 Catch:{ all -> 0x00c9 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00c9 }
        r6[r2] = r3;	 Catch:{ all -> 0x00c9 }
        r2 = 3;	 Catch:{ all -> 0x00c9 }
        r3 = 2131429261; // 0x7f0b078d float:1.848019E38 double:1.0530659744E-314;	 Catch:{ all -> 0x00c9 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00c9 }
        r6[r2] = r3;	 Catch:{ all -> 0x00c9 }
        r2 = 4;	 Catch:{ all -> 0x00c9 }
        r3 = 2131429254; // 0x7f0b0786 float:1.8480176E38 double:1.053065971E-314;	 Catch:{ all -> 0x00c9 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00c9 }
        r6[r2] = r3;	 Catch:{ all -> 0x00c9 }
        r2 = 5;	 Catch:{ all -> 0x00c9 }
        r3 = 2131429250; // 0x7f0b0782 float:1.8480167E38 double:1.053065969E-314;	 Catch:{ all -> 0x00c9 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00c9 }
        r6[r2] = r3;	 Catch:{ all -> 0x00c9 }
        r6 = defpackage.ajym.b(r6);	 Catch:{ all -> 0x00c9 }
        r2 = r5.q;	 Catch:{ all -> 0x00c9 }
        r2.add(r0);	 Catch:{ all -> 0x00c9 }
        r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x00c9 }
        r6 = r6.iterator();	 Catch:{ all -> 0x00c9 }
        r0 = r6.hasNext();	 Catch:{ all -> 0x00c9 }
        if (r0 == 0) goto L_0x00c8;	 Catch:{ all -> 0x00c9 }
        r0 = r6.next();	 Catch:{ all -> 0x00c9 }
        r0 = (java.lang.Number) r0;	 Catch:{ all -> 0x00c9 }
        r0 = r0.intValue();	 Catch:{ all -> 0x00c9 }
        r3 = r5.c;	 Catch:{ all -> 0x00c9 }
        if (r3 != 0) goto L_0x00b9;	 Catch:{ all -> 0x00c9 }
        defpackage.akcr.a(r1);	 Catch:{ all -> 0x00c9 }
        r4 = defpackage.hbn.a;	 Catch:{ all -> 0x00c9 }
        r0 = r3.a(r0, r4);	 Catch:{ all -> 0x00c9 }
        if (r0 != 0) goto L_0x00c4;	 Catch:{ all -> 0x00c9 }
        defpackage.akcr.a();	 Catch:{ all -> 0x00c9 }
        r2.add(r0);	 Catch:{ all -> 0x00c9 }
        goto L_0x00a2;
        return r2;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.fragments.discoverfeed.NeonDiscoverFeedFragment.c(android.view.View):java.util.List");
    }

    public final long S_() {
        return 0;
    }

    public final void a(View view) {
        akcr.b(view, "view");
        super.a(view);
        c(view);
        zkr zkr = this.w;
        if (zkr == null) {
            akcr.a("windowRectObserver");
        }
        ScopedFragment.a((ScopedFragment) this, zkr.a().a((ajfl) new f(this, view)).f((ajfb) new g(this, view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        ScopedFragment.a((ScopedFragment) this, l().a((ajfl) new h(this, view)).f((ajfb) new i(this, view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        Object findViewById = view.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        this.B = (RecyclerView) findViewById.findViewById(R.id.recycler_view);
        Activity e = e();
        if (e != null) {
            hqt hqt = new hqt(e);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = hqt.getResources().getDimensionPixelOffset(R.dimen.discover_scroll_up_button_margin);
            layoutParams.gravity = 81;
            hqt.setLayoutParams(layoutParams);
            this.E = hqt;
            view = getView();
            if (view != null) {
                ((ViewGroup) view).addView(this.E);
                hqt hqt2 = this.E;
                if (hqt2 != null) {
                    hqt2.a(this.B);
                }
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final void a(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        akcr.b(view, "contentView");
        akcr.b(layoutInflater, "inflater");
        akcr.b(viewGroup, "container");
        a(defpackage.hhk.a.ON_CREATE_VIEW);
        layoutInflater.inflate(R.layout.bottom_black_gradient_view, (ViewGroup) view, true);
        super.a(view, layoutInflater, viewGroup);
    }

    /* Access modifiers changed, original: final */
    public final void a(defpackage.hhk.a aVar) {
        hhn hhn = this.h;
        if (hhn == null) {
            akcr.a("fragmentTracker");
        }
        hhn.a(aVar);
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        ipt ipt = this.c;
        if (ipt == null) {
            akcr.a("hovaController");
        }
        View a = ipt.a(R.id.discoverfeed_icon_container, hbn.a);
        if (a != null) {
            a.setOnClickListener(new j(this));
        }
        hqt hqt = this.E;
        if (hqt != null) {
            hqt.b();
        }
        a = this.p;
        if (a != null) {
            a.setAlpha(1.0f);
        }
        a(akcr.a(((zjm) achi.e.e()).b(), hbn.b.b()) ? defpackage.hhk.a.ON_NAVIGATE_FROM_PIVOT_PAGE : defpackage.hhk.a.ON_VISIBLE);
        htc htc = this.k;
        if (htc == null) {
            akcr.a("mDfTeamSnapchatTooltip");
        }
        RecyclerView recyclerView = this.B;
        View view = getView();
        if (!(recyclerView == null || view == null)) {
            htc.g = true;
            htc.e = recyclerView;
            if (view instanceof ViewGroup) {
                htc.d = (ViewGroup) view;
            }
            htc.c();
        }
        if (this.G != null) {
            ajej ajej = this.G;
            if (ajej == null) {
                akcr.a();
            }
            if (!ajej.isDisposed()) {
                return;
            }
        }
        goz goz = this.m;
        if (goz == null) {
            akcr.a("screenshotWatchman");
        }
        this.G = goz.a().a((ajdw) k().f()).f((ajfb) new k(this));
    }

    public final ajdx<hse> b() {
        Object c = ajdx.c((Callable) new b(this));
        akcr.a(c, "Single.fromCallable {\n  …presenter\n        }\n    }");
        return c;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        ipt ipt = this.c;
        if (ipt == null) {
            akcr.a("hovaController");
        }
        View a = ipt.a(R.id.discoverfeed_icon_container, hbn.a);
        if (a != null) {
            a.setOnClickListener(null);
        }
        a(akcr.a(((zjm) achi.f.e()).b(), hbn.b.b()) ? defpackage.hhk.a.ON_NAVIGATE_TO_PIVOT_PAGE : defpackage.hhk.a.ON_HIDDEN);
        hqt hqt = this.E;
        if (hqt != null) {
            hqt.a();
        }
        a = this.p;
        if (a != null) {
            a.setAlpha(1.0f);
        }
        htc htc = this.k;
        if (htc == null) {
            akcr.a("mDfTeamSnapchatTooltip");
        }
        htc.g = false;
        RecyclerView recyclerView = htc.e;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(htc.k);
        }
        recyclerView = htc.a();
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(htc.k);
        }
        recyclerView = htc.a();
        if (recyclerView != null) {
            AdapterDataObserver adapterDataObserver = htc.m;
            if (htc.h) {
                Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    htc.h = false;
                    try {
                        adapter.unregisterAdapterDataObserver(adapterDataObserver);
                    } catch (IllegalStateException unused) {
                    }
                }
            }
        }
        ViewGroup viewGroup = htc.d;
        if (viewGroup instanceof PullToRefreshLayout) {
            ((PullToRefreshLayout) viewGroup).b(htc.l);
        }
        htc.d();
        viewGroup = htc.d;
        if (viewGroup != null) {
            viewGroup.removeView(htc.c);
        }
        htc.c = null;
        htc.e = null;
        htc.d = null;
        htc.i.a();
        Object obj = (zjm) achi.f.e();
        if (!(akcr.a(obj, ssm.a) || akcr.a(obj, dnh.c) || akcr.a(obj, pql.a))) {
            akcr.a(obj, "destinationPage");
            if (!(upp.a(obj) || obj.b)) {
                RecyclerView d = d();
                if (d != null) {
                    d.scrollToPosition(0);
                }
                zlt zlt = this.v;
                if (zlt != null) {
                    zlt.a();
                }
            }
        }
        ajej ajej = this.G;
        if (ajej != null) {
            ajej.dispose();
        }
    }

    public final ide c() {
        return this.H;
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.c(achi);
        if (achi.b == achr.RIGHT_TO_LEFT) {
            int i = rvt.a[achi.g.ordinal()];
            hse hse;
            if (i != 1) {
                if (i == 2 && this.I) {
                    this.I = false;
                    hse = (hse) this.t;
                    if (hse != null) {
                        hse.z.a();
                        hse.z.d();
                    }
                }
            } else if (achi.l) {
                this.I = true;
                hse = (hse) this.t;
                if (hse != null) {
                    hse.z.c();
                    hse.z.b();
                }
            }
        }
    }

    public final int h() {
        return R.color.regular_purple;
    }

    public final zjm i() {
        return hbn.a;
    }

    public final boolean j() {
        a(defpackage.hhk.a.ON_REFRESH_START);
        hse hse = (hse) this.t;
        if (hse != null) {
            hse.e.a(Boolean.TRUE);
            hse.h();
            Object d = hse.t.a().b((ajdw) hse.q.i()).a((ajdw) hse.q.l()).d((ajfc) new defpackage.hse.f(hse));
            akcr.a(d, "tabSectionsConfig.getSec…essary)\n                }");
            Object a = d.b((ajdw) hse.q.g()).a((ajdw) hse.q.l());
            akcr.a(a, "forceRefreshInternal()\n …(schedulers.mainThread())");
            a.a((ajdw) k().l()).a((ajfb) new d(this), (ajfb) new e(this));
        }
        return true;
    }

    public final void n_() {
        super.n_();
        rco rco = this.n;
        String str = "friendStoryTeachingClickListener";
        if (rco == null) {
            akcr.a(str);
        }
        if (rco.a) {
            a(defpackage.hhk.a.ON_NAVIGATE_TO_FROM_TEACHING);
            rco = this.n;
            if (rco == null) {
                akcr.a(str);
            }
            rco.a = false;
        } else {
            a(defpackage.hhk.a.ON_NAVIGATE_TO);
        }
        hno hno = this.g;
        if (hno == null) {
            akcr.a("performanceAnalytics");
        }
        hno.e();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        hhu hhu = this.f;
        if (hhu == null) {
            akcr.a("mStoriesAnalytics");
        }
        hhk hhk = this.d;
        if (hhk == null) {
            akcr.a("mDiscoverFeedFragmentTracker");
        }
        hnm hnm = new hnm(hhu, hhk);
        Object f = hnm.a.b().f((ajfb) new hnn(new defpackage.hnm.a(hnm)));
        akcr.a(f, "mDiscoverFeedFragmentTra…s::handleLifecycleEvents)");
        hnm.b = f;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hhn hhn = this.h;
        if (hhn == null) {
            akcr.a("fragmentTracker");
        }
        fv fvVar = this;
        akcr.b(fvVar, "bound");
        if (hhn.b != null) {
            hhn.dispose();
            hhn.a = false;
        }
        hhn.b = fvVar;
    }

    public final void onDestroy() {
        super.onDestroy();
        a(defpackage.hhk.a.ON_DESTROY);
        hhn hhn = this.h;
        if (hhn == null) {
            akcr.a("fragmentTracker");
        }
        hhn.dispose();
        hno hno = this.g;
        if (hno == null) {
            akcr.a("performanceAnalytics");
        }
        hno.c();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        hse hse = (hse) this.t;
        if (hse != null) {
            RecyclerView recyclerView = hse.m;
            if (recyclerView != null) {
                recyclerView.setAdapter(null);
            }
            hse.m = null;
            hse.l.set(false);
            hse.i = null;
            hse.g.a();
            hgm b = hse.b();
            b.a().f().a((Runnable) new aw(b));
        }
        this.B = null;
        this.o.a();
        a(defpackage.hhk.a.ON_VIEW_DESTROYED);
    }

    public final void onPause() {
        super.onPause();
        a(defpackage.hhk.a.ON_PAUSE);
        hbw hbw = this.e;
        if (hbw == null) {
            akcr.a("mInteractionStore");
        }
        hbw.E_();
        hno hno = this.g;
        if (hno == null) {
            akcr.a("performanceAnalytics");
        }
        hno.a();
        hse hse = (hse) this.t;
        if (hse != null) {
            ((hny) hse.r.get()).d();
        }
        achb achb = this.i;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        Object peekFirst = achb.g().peekFirst();
        akcr.a(peekFirst, "navigationHost.pageStack.peekFirst()");
        this.F = ((aciv) peekFirst).e();
    }

    public final void onResume() {
        super.onResume();
        achg achg = this.F;
        a(akcr.a(achg != null ? achg.c() : null, zhm.a.b()) ? defpackage.hhk.a.ON_RESUME_FROM_ACTION_MENU : defpackage.hhk.a.ON_RESUME);
        hno hno = this.g;
        if (hno == null) {
            akcr.a("performanceAnalytics");
        }
        hno.b();
    }

    public final void onStop() {
        super.onStop();
        a(defpackage.hhk.a.ON_STOP);
    }

    public final void q_() {
        super.q_();
        a(defpackage.hhk.a.ON_NAVIGATE_AWAY);
    }
}
