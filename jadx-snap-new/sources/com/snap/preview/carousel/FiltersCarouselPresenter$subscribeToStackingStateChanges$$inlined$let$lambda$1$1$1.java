package com.snap.preview.carousel;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.snap.preview.carousel.ui.StackingRecyclerView;

public final class FiltersCarouselPresenter$subscribeToStackingStateChanges$$inlined$let$lambda$1$1$1 extends LinearLayoutManager {
    private /* synthetic */ StackingRecyclerView a;

    FiltersCarouselPresenter$subscribeToStackingStateChanges$$inlined$let$lambda$1$1$1(StackingRecyclerView stackingRecyclerView, Context context) {
        this.a = stackingRecyclerView;
        super(context, 0, false);
    }

    public final boolean canScrollHorizontally() {
        return false;
    }
}
