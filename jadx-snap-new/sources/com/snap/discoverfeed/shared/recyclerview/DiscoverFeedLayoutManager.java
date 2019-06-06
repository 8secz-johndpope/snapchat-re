package com.snap.discoverfeed.shared.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import defpackage.akcr;

public final class DiscoverFeedLayoutManager extends FixedSpanStaggeredGridLayoutManager {
    public DiscoverFeedLayoutManager(int i, int i2) {
        super(i, i2);
    }

    public final boolean onRequestChildFocus(RecyclerView recyclerView, State state, View view, View view2) {
        akcr.b(recyclerView, "parent");
        akcr.b(view, "child");
        akcr.b(view2, "focused");
        return true;
    }
}
