package com.snap.ui.ptr;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.FixedItemSizeLinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.AsyncPresenterFragment;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.PullToRefreshLayout;
import defpackage.abgc;
import defpackage.ablk;
import defpackage.achi;
import defpackage.ajdp;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajwl;
import defpackage.ajwy;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.fxj;
import defpackage.zic;
import defpackage.zig;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkr;
import defpackage.zlk;
import defpackage.zll;
import defpackage.zlo;
import defpackage.zlp;
import defpackage.zlq;
import defpackage.zlr;
import defpackage.zls;
import defpackage.zlt;
import defpackage.zlu;
import java.lang.ref.WeakReference;

public abstract class NeonPullToRefreshFragment<TPresenter extends zll<zlk>> extends AsyncPresenterFragment<TPresenter> implements zlk {
    public ajwy<fxj> A;
    private View a;
    private final ajwl<Integer> b;
    private final ajwl<Float> c;
    protected zlt v;
    public zkr w;
    Rect x;
    public ajwy<zig> y;
    public ajwy<ablk> z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class j<T> implements ajfb<Rect> {
        private /* synthetic */ NeonPullToRefreshFragment a;
        private /* synthetic */ View b;

        j(NeonPullToRefreshFragment neonPullToRefreshFragment, View view) {
            this.a = neonPullToRefreshFragment;
            this.b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            Object findViewById = this.b.findViewById(R.id.placeholder_content);
            akcr.a(findViewById, "contentView");
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = rect.top + this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.neon_header_height);
                findViewById.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final class b implements defpackage.zlo.c {
        private final WeakReference<NeonPullToRefreshFragment<? extends zll<zlk>>> a;

        public b(NeonPullToRefreshFragment<? extends zll<zlk>> neonPullToRefreshFragment) {
            akcr.b(neonPullToRefreshFragment, "_fragment");
            this.a = new WeakReference(neonPullToRefreshFragment);
        }

        public final boolean a() {
            NeonPullToRefreshFragment neonPullToRefreshFragment = (NeonPullToRefreshFragment) this.a.get();
            return neonPullToRefreshFragment != null ? neonPullToRefreshFragment.j() : false;
        }
    }

    static final class g<T> implements ajfb<Rect> {
        private /* synthetic */ NeonPullToRefreshFragment a;

        g(NeonPullToRefreshFragment neonPullToRefreshFragment) {
            this.a = neonPullToRefreshFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View b = NeonPullToRefreshFragment.b(this.a);
            LayoutParams layoutParams = NeonPullToRefreshFragment.b(this.a).getLayoutParams();
            layoutParams.height = this.a.getResources().getDimensionPixelSize(R.dimen.neon_header_gradient_height) + rect.top;
            b.setLayoutParams(layoutParams);
        }
    }

    static final class h<T> implements ajfb<Rect> {
        private /* synthetic */ NeonPullToRefreshFragment a;
        private /* synthetic */ View b;

        h(NeonPullToRefreshFragment neonPullToRefreshFragment, View view) {
            this.a = neonPullToRefreshFragment;
            this.b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            if (rect.top > 0) {
                Rect rect2;
                Rect rect3 = this.a.x;
                if (rect3 != null) {
                    rect3.left = rect.left;
                    rect3.right = rect.right;
                    rect3.bottom = rect.bottom;
                }
                if (this.a.x == null) {
                    NeonPullToRefreshFragment neonPullToRefreshFragment = this.a;
                    rect2 = new Rect(rect);
                    rect2.top += this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.neon_header_height);
                    neonPullToRefreshFragment.x = rect2;
                }
                zlt zlt = this.a.v;
                if (zlt != null) {
                    rect2 = this.a.x;
                    if (rect2 == null) {
                        akcr.a();
                    }
                    zlt.a(rect2);
                }
            }
            Object findViewById = this.b.findViewById(R.id.navbar_inset);
            akcr.a(findViewById, "insetView");
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.height = rect.bottom;
                findViewById.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    static final class i<T> implements ajfb<Integer> {
        private /* synthetic */ NeonPullToRefreshFragment a;

        i(NeonPullToRefreshFragment neonPullToRefreshFragment) {
            this.a = neonPullToRefreshFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            View b = NeonPullToRefreshFragment.b(this.a);
            NeonPullToRefreshFragment neonPullToRefreshFragment = this.a;
            akcr.a(obj, "it");
            b.setAlpha(neonPullToRefreshFragment.a(obj.intValue()));
            View b2 = NeonPullToRefreshFragment.b(this.a);
            b2.setVisibility(b2.getAlpha() > MapboxConstants.MINIMUM_ZOOM ? 0 : 4);
        }
    }

    static final class e extends akcq implements akbl<Float, ajxw> {
        e(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Float.valueOf(((Number) obj).floatValue()));
            return ajxw.a;
        }
    }

    static final class f extends akcq implements akbl<Integer, ajxw> {
        f(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Integer.valueOf(((Number) obj).intValue()));
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbl<Float, ajxw> {
        c(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Float.valueOf(((Number) obj).floatValue()));
            return ajxw.a;
        }
    }

    static final class d extends akcq implements akbl<Integer, ajxw> {
        d(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Integer.valueOf(((Number) obj).intValue()));
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public NeonPullToRefreshFragment() {
        Object i = ajwl.i(Integer.valueOf(0));
        akcr.a(i, "BehaviorSubject.createDefault(0)");
        this.b = i;
        i = ajwl.i(Float.valueOf(MapboxConstants.MINIMUM_ZOOM));
        akcr.a(i, "BehaviorSubject.createDefault(0f)");
        this.c = i;
    }

    private final void a(boolean z) {
        View view;
        if (this.v != null) {
            View view2 = getView();
            if (view2 != null) {
                view2.setBackground(null);
            }
            zlt zlt = this.v;
            if (zlt != null) {
                zlt.a(z);
            }
        } else if (z) {
            view = getView();
            if (view != null) {
                view.setBackgroundColor(ContextCompat.getColor(getContext(), h()));
            }
        } else {
            view = getView();
            if (view != null) {
                view.setBackground(null);
            }
        }
    }

    public final int R_() {
        return R.layout.neon_ptr_fragment;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(int i) {
        float f = (float) i;
        View view = this.a;
        if (view == null) {
            akcr.a("topGradient");
        }
        return Math.min(f / ((float) view.getHeight()), 1.0f);
    }

    public void a(View view) {
        zlu zlu;
        akcr.b(view, "view");
        ajwy ajwy = this.A;
        if (ajwy == null) {
            akcr.a("v11Configuration");
        }
        Object obj = (Boolean) ((fxj) ajwy.get()).a().b();
        Object findViewById = view.findViewById(R.id.neon_header_top_gradient);
        akcr.a(findViewById, "view.findViewById(R.id.neon_header_top_gradient)");
        this.a = findViewById;
        akcr.a(obj, "isV11");
        if (obj.booleanValue()) {
            View view2 = this.a;
            if (view2 == null) {
                akcr.a("topGradient");
            }
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                ((FrameLayout.LayoutParams) layoutParams).topMargin = getResources().getDimensionPixelSize(R.dimen.v11_header_height);
                findViewById = view.findViewById(R.id.v11_header_overlay);
                akcr.a(findViewById, "view.findViewById<View>(R.id.v11_header_overlay)");
                findViewById.setVisibility(0);
            } else {
                throw new ajxt("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new FixedItemSizeLinearLayoutManager(super.getActivity(), 1, false));
        }
        ajwy ajwy2 = this.z;
        if (ajwy2 == null) {
            akcr.a("perfMonitorConfig");
        }
        if (((ablk) ajwy2.get()).a(new abgc()) && recyclerView != null) {
            ajwy ajwy3 = this.y;
            if (ajwy3 == null) {
                akcr.a("scrollPerfLogger");
            }
            recyclerView.addOnScrollListener(new zic(ajwy3, i().d()));
        }
        b bVar = new b(this);
        if (obj.booleanValue()) {
            zlu = new zlu((PullToRefreshLayout) view.findViewById(R.id.ptr_container));
            zlu.a((defpackage.zlu.b) new zlr(new c(this.c)));
            zlu.a((defpackage.zlu.c) new zls(new d(this.b)));
        } else {
            zlu = new zlo((PullToRefreshLayout) view.findViewById(R.id.ptr_container), h());
            zlu.a((defpackage.zlo.c) bVar);
            zlu.a((defpackage.zlo.b) new zlp(new e(this.c)));
            zlu.a((defpackage.zlo.d) new zlq(new f(this.b)));
        }
        this.v = zlu;
        if (view.getBackground() != null) {
            view.setBackground(null);
            zlt zlt = this.v;
            if (zlt != null) {
                zlt.a(true);
            }
        }
        zkr zkr = this.w;
        String str = "windowRectObserver";
        if (zkr == null) {
            akcr.a(str);
        }
        ajej f = zkr.a().c(1).f((ajfb) new g(this));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        zkr = this.w;
        if (zkr == null) {
            akcr.a(str);
        }
        ScopedFragment.a((ScopedFragment) this, zkr.a().f((ajfb) new h(this, view)), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        ScopedFragment.a((ScopedFragment) this, m().f((ajfb) new i(this)), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }

    public void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        a(true);
    }

    public final void b(View view) {
        akcr.b(view, "placeholderView");
        zkr zkr = this.w;
        if (zkr == null) {
            akcr.a("windowRectObserver");
        }
        ScopedFragment.a((ScopedFragment) this, zkr.a().c(1).f((ajfb) new j(this, view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }

    public void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.c(achi);
        if (achi.l) {
            if (akcr.a((zjm) achi.a.e(), i())) {
                a(false);
                return;
            }
            a(true);
        }
    }

    public final RecyclerView d() {
        View view = getView();
        return view != null ? (RecyclerView) view.findViewById(R.id.recycler_view) : null;
    }

    public void d(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.d(achi);
        if (akcr.a((zjm) achi.e.e(), i())) {
            a(true);
        }
    }

    public final Activity e() {
        return super.getActivity();
    }

    public abstract int h();

    public abstract zjm i();

    /* Access modifiers changed, original: protected */
    public boolean j() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final ajdp<Float> l() {
        Object f = this.c.f();
        akcr.a(f, "ptrOffsetSubject.hide()");
        return f;
    }

    /* Access modifiers changed, original: protected|final */
    public final ajdp<Integer> m() {
        Object f = this.b.f();
        akcr.a(f, "recyclerViewScrollSubject.hide()");
        return f;
    }

    public final void n() {
        zlt zlt = this.v;
        if (zlt != null) {
            zlt.e();
        }
    }

    public void onDetach() {
        zll zll = (zll) this.t;
        if (zll != null) {
            zll.dropTarget();
        }
        super.onDetach();
    }
}
