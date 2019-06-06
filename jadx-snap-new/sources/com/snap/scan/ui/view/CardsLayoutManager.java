package com.snap.scan.ui.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.State;
import defpackage.akcr;

public final class CardsLayoutManager extends LinearLayoutManager {
    private final Context a;

    public static final class a extends LinearSmoothScroller {
        private /* synthetic */ CardsLayoutManager a;

        a(CardsLayoutManager cardsLayoutManager, Context context) {
            this.a = cardsLayoutManager;
            super(context);
        }

        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    public CardsLayoutManager(Context context) {
        akcr.b(context, "context");
        super(context, 1, false);
        this.a = context;
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        akcr.b(recyclerView, "recyclerView");
        a aVar = new a(this, this.a);
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
