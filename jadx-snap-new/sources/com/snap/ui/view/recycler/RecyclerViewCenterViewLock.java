package com.snap.ui.view.recycler;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;

public final class RecyclerViewCenterViewLock extends OnScrollListener {
    private int centerPivot;
    private final akbl<View, ajxw> onCenterViewChangedListener;
    private LinearLayoutManagerCenterViewFinder viewFinder;

    public RecyclerViewCenterViewLock() {
        this(0, null, 3, null);
    }

    public RecyclerViewCenterViewLock(int i, akbl<? super View, ajxw> akbl) {
        this.centerPivot = i;
        this.onCenterViewChangedListener = akbl;
        this.viewFinder = new LinearLayoutManagerCenterViewFinder(this.centerPivot);
    }

    public /* synthetic */ RecyclerViewCenterViewLock(int i, akbl akbl, int i2, akco akco) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            akbl = null;
        }
        this(i, akbl);
    }

    private final View centerViewFor(LinearLayoutManager linearLayoutManager) {
        return this.viewFinder.find(linearLayoutManager);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        akcr.b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int left;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            Object obj = linearLayoutManager.getOrientation() == 0 ? 1 : null;
            if (this.centerPivot == 0) {
                int right;
                if (obj != null) {
                    left = recyclerView.getLeft();
                    right = recyclerView.getRight();
                } else {
                    left = recyclerView.getTop();
                    right = recyclerView.getBottom();
                }
                left = (left + right) / 2;
                if (left != this.centerPivot) {
                    this.centerPivot = left;
                    this.viewFinder = new LinearLayoutManagerCenterViewFinder(this.centerPivot);
                }
            }
            if (i == 0) {
                View centerViewFor = centerViewFor(linearLayoutManager);
                if (centerViewFor != null) {
                    int left2;
                    if (obj != null) {
                        left2 = centerViewFor.getLeft();
                        left = centerViewFor.getRight();
                    } else {
                        left2 = centerViewFor.getTop();
                        left = centerViewFor.getBottom();
                    }
                    left2 = ((left2 + left) / 2) - this.centerPivot;
                    if (obj != null) {
                        recyclerView.smoothScrollBy(left2, 0);
                    } else {
                        recyclerView.smoothScrollBy(0, left2);
                    }
                    akbl akbl = this.onCenterViewChangedListener;
                    if (akbl != null) {
                        akbl.invoke(centerViewFor);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }
}
