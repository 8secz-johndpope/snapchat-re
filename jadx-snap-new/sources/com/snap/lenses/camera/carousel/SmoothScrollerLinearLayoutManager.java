package com.snap.lenses.camera.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import android.support.v7.widget.RecyclerView.State;
import android.util.DisplayMetrics;
import android.view.View;
import defpackage.akbk;
import defpackage.akcr;

public final class SmoothScrollerLinearLayoutManager extends LinearLayoutManager {
    boolean a = true;
    boolean b;
    private final SmoothScroller c;
    private final akbk<Integer> d;

    public static final class a extends LinearSmoothScroller {
        private /* synthetic */ SmoothScrollerLinearLayoutManager a;
        private /* synthetic */ akbk b;
        private /* synthetic */ LinearLayoutManager c;
        private /* synthetic */ Context d;

        a(SmoothScrollerLinearLayoutManager smoothScrollerLinearLayoutManager, akbk akbk, LinearLayoutManager linearLayoutManager, Context context, Context context2) {
            this.a = smoothScrollerLinearLayoutManager;
            this.b = akbk;
            this.c = linearLayoutManager;
            this.d = context;
            super(context2);
        }

        public final int calculateDxToMakeVisible(View view, int i) {
            akcr.b(view, "view");
            return super.calculateDxToMakeVisible(view, i) + ((Number) this.b.invoke()).intValue();
        }

        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            akcr.b(displayMetrics, "displayMetrics");
            return 50.0f / ((float) displayMetrics.densityDpi);
        }

        public final PointF computeScrollVectorForPosition(int i) {
            return this.c.computeScrollVectorForPosition(i);
        }

        public final int getHorizontalSnapPreference() {
            return -1;
        }

        public final void onStart() {
            super.onStart();
            this.a.b = true;
        }

        public final void onStop() {
            super.onStop();
            this.a.b = false;
        }
    }

    public SmoothScrollerLinearLayoutManager(Context context, int i, boolean z, akbk<Integer> akbk) {
        akcr.b(context, "context");
        akcr.b(akbk, "offsetCalculator");
        super(context, i, z);
        this.d = akbk;
        this.c = new a(this, this.d, this, context, context);
    }

    public final boolean canScrollHorizontally() {
        return this.a && super.canScrollHorizontally();
    }

    public final void scrollToPosition(int i) {
        scrollToPositionWithOffset(i, 0);
    }

    public final void scrollToPositionWithOffset(int i, int i2) {
        super.scrollToPositionWithOffset(i, i2 + ((Number) this.d.invoke()).intValue());
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        akcr.b(recyclerView, "recyclerView");
        akcr.b(state, "state");
        this.c.setTargetPosition(i);
        startSmoothScroll(this.c);
    }
}
