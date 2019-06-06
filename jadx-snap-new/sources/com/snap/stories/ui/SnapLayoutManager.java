package com.snap.stories.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import com.snapchat.android.R;
import defpackage.akcr;

public final class SnapLayoutManager extends LinearLayoutManager {
    private final int a;
    private final int b;

    public SnapLayoutManager(Context context, int i, int i2) {
        akcr.b(context, "context");
        super(context, 0, false);
        this.a = i;
        this.b = i2;
    }

    public final int getPaddingLeft() {
        return Math.round((((float) this.a) / 2.0f) - (((float) this.b) / 2.0f));
    }

    public final int getPaddingRight() {
        return getPaddingLeft();
    }

    public final void onLayoutChildren(Recycler recycler, State state) {
        super.onLayoutChildren(recycler, state);
        scrollHorizontallyBy(0, recycler, state);
    }

    public final int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        i = super.scrollHorizontallyBy(i, recycler, state);
        float width = ((float) getWidth()) / 2.0f;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt == null) {
                akcr.a();
            }
            float max = Math.max(1.0f, ((Math.min(width, Math.abs(width - (((float) (getDecoratedRight(childAt) + getDecoratedLeft(childAt))) / 2.0f))) * -0.46000004f) / width) + 1.23f);
            childAt.setScaleX(max);
            childAt.setScaleY(max);
            childAt = childAt.findViewById(R.id.overlay);
            if (childAt != null) {
                childAt.setAlpha(1.0f - ((max - 1.0f) / 0.23000002f));
            }
        }
        return i;
    }
}
