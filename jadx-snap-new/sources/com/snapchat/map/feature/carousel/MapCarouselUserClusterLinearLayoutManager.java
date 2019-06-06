package com.snapchat.map.feature.carousel;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;

public class MapCarouselUserClusterLinearLayoutManager extends LinearLayoutManager {
    public MapCarouselUserClusterLinearLayoutManager(Context context) {
        super(context);
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception unused) {
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
