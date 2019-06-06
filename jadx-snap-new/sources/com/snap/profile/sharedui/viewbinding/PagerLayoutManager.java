package com.snap.profile.sharedui.viewbinding;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import defpackage.akcr;

public class PagerLayoutManager extends LinearLayoutManager {
    private final int a;
    private final int b;

    public PagerLayoutManager(Context context, int i, int i2) {
        akcr.b(context, "context");
        super(context, 0, false);
        this.a = i;
        this.b = i2;
    }

    public int getPaddingLeft() {
        return Math.round((((float) this.a) / 2.0f) - (((float) this.b) / 2.0f));
    }

    public int getPaddingRight() {
        return getPaddingLeft();
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        super.onLayoutChildren(recycler, state);
        scrollHorizontallyBy(0, recycler, state);
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        i = super.scrollHorizontallyBy(i, recycler, state);
        float width = ((float) getWidth()) / 2.0f;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt == null) {
                akcr.a();
            }
            float max = Math.max(0.6f, ((Math.min(width, Math.abs(width - (((float) (getDecoratedRight(childAt) + getDecoratedLeft(childAt))) / 2.0f))) * -0.79999995f) / width) + 1.0f);
            childAt.setScaleX(max);
            childAt.setScaleY(max);
            childAt.setAlpha((max - 0.6f) / 0.39999998f);
        }
        return i;
    }
}
