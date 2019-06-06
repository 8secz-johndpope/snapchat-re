package com.snap.commerce.lib.recyclerview.layoutmanager;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import android.support.v7.widget.RecyclerView.State;
import android.util.DisplayMetrics;
import defpackage.akcr;

public final class StoreGridLayoutManager extends GridLayoutManager {
    private final SmoothScroller a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends LinearSmoothScroller {
        private /* synthetic */ Context a;

        b(Context context, Context context2) {
            this.a = context;
            super(context2);
        }

        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            akcr.b(displayMetrics, "displayMetrics");
            return 4.0f / ((float) displayMetrics.densityDpi);
        }
    }

    static {
        a aVar = new a();
    }

    public StoreGridLayoutManager(Context context, int i) {
        akcr.b(context, "context");
        super(context, i);
        this.a = new b(context, context);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        this.a.setTargetPosition(i);
        startSmoothScroll(this.a);
    }
}
