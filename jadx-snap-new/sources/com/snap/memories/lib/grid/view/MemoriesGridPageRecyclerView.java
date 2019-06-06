package com.snap.memories.lib.grid.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.akcr;

public final class MemoriesGridPageRecyclerView extends RecyclerView {
    public MemoriesGridPageRecyclerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        boolean dispatchNestedScroll = super.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        return (i2 != 0 || i4 >= 0) ? dispatchNestedScroll : false;
    }
}
