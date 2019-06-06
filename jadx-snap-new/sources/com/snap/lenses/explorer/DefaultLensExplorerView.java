package com.snap.lenses.explorer;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;
import defpackage.absj;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
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
import defpackage.ide;
import defpackage.mqs;
import defpackage.zfw;
import defpackage.zgb;
import java.util.Collection;

public final class DefaultLensExplorerView extends CoordinatorLayout implements mqs {
    public ide f;
    public zgb g;
    public ajdp<defpackage.mpy.d> h;
    public ajdp<defpackage.mpy.d> i;
    public ajdp<ajxw> j;
    View k;
    View l;
    public final ajei m;
    private final ajxe n;

    public static final class a<T> implements ajfl<defpackage.mpy.d> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            defpackage.mpy.d dVar = (defpackage.mpy.d) obj;
            akcr.b(dVar, "it");
            return !((Collection) dVar.a).isEmpty();
        }
    }

    public static final class b<T, R> implements ajfc<T, ajdt<U>> {
        private /* synthetic */ DefaultLensExplorerView a;

        public b(DefaultLensExplorerView defaultLensExplorerView) {
            this.a = defaultLensExplorerView;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((defpackage.mpy.d) obj, "it");
            return this.a.a();
        }
    }

    public static final class c<T> implements ajfb<defpackage.mpy.d> {
        private /* synthetic */ DefaultLensExplorerView a;

        public c(DefaultLensExplorerView defaultLensExplorerView) {
            this.a = defaultLensExplorerView;
        }

        public final /* synthetic */ void accept(Object obj) {
            View view = this.a.k;
            if (view == null) {
                akcr.a("loadingSpinner");
            }
            view.setVisibility(8);
        }
    }

    public static final class d<T> implements ajfl<defpackage.mpy.d> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            defpackage.mpy.d dVar = (defpackage.mpy.d) obj;
            akcr.b(dVar, "it");
            return !((Collection) dVar.a).isEmpty();
        }
    }

    public static final class e<T, R> implements ajfc<T, ajdt<U>> {
        private /* synthetic */ DefaultLensExplorerView a;

        public e(DefaultLensExplorerView defaultLensExplorerView) {
            this.a = defaultLensExplorerView;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((defpackage.mpy.d) obj, "it");
            return this.a.a();
        }
    }

    public static final class f<T> implements ajfb<defpackage.mpy.d> {
        private /* synthetic */ DefaultLensExplorerView a;

        public f(DefaultLensExplorerView defaultLensExplorerView) {
            this.a = defaultLensExplorerView;
        }

        public final /* synthetic */ void accept(Object obj) {
            View view = this.a.l;
            if (view == null) {
                akcr.a("communityLensesHeader");
            }
            view.setVisibility(0);
        }
    }

    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ DefaultLensExplorerView a;

        g(DefaultLensExplorerView defaultLensExplorerView) {
            this.a = defaultLensExplorerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.g == null) {
                akcr.a("schedulersProvider");
            }
            ide ide = this.a.f;
            if (ide == null) {
                akcr.a("attributedFeature");
            }
            return zgb.a(ide, "DefaultLensExplorerView");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultLensExplorerView.class), "qualifiedSchedulers", "getQualifiedSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public DefaultLensExplorerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultLensExplorerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.n = ajxh.a(new g(this));
        this.m = new ajei();
    }

    public final ajdp<ajxw> a() {
        ajdp ajdp = this.j;
        if (ajdp == null) {
            akcr.a("showWhen");
        }
        return ajdp;
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        akcr.b(view, "child");
        if (view.getId() == R.id.lens_explorer_community_feed_view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                view.measure(CoordinatorLayout.getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), CoordinatorLayout.getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, getMeasuredHeight()));
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        super.a(view, i, i2, i3, i4);
    }

    public final /* synthetic */ void accept(Object obj) {
        akcr.b((defpackage.mqs.a) obj, MapboxEvent.KEY_MODEL);
    }

    public final zfw b() {
        return (zfw) this.n.b();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.lenses_explorer_loading_spinner);
        akcr.a(findViewById, "findViewById(R.id.lenses_explorer_loading_spinner)");
        this.k = findViewById;
        findViewById = findViewById(R.id.lenses_explorer_community_header);
        akcr.a(findViewById, "findViewById(R.id.lenses…xplorer_community_header)");
        this.l = findViewById;
        absj.a().b(findViewById(R.id.container));
        absj.a().a(findViewById(R.id.background));
    }
}
