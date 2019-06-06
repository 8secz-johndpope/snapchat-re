package com.snap.preview.carousel;

import android.content.Context;
import com.snap.preview.carousel.FiltersCarouselPresenter.aj;
import com.snap.ui.recycling.adapter.LoopingAdapter.LoopingLayoutManager;

public final class FiltersCarouselPresenter$initRecyclerView$$inlined$let$lambda$1$1 extends LoopingLayoutManager {
    private /* synthetic */ aj c;

    FiltersCarouselPresenter$initRecyclerView$$inlined$let$lambda$1$1(Context context, aj ajVar) {
        this.c = ajVar;
        super(context, 0, false);
    }

    public final boolean canScrollHorizontally() {
        if (this.c.b.v) {
            Integer num = (Integer) FiltersCarouselPresenter.a(this.c.b).b.p();
            if (!(num != null && num.intValue() == 0 && this.c.b.w) && super.canScrollHorizontally()) {
                return true;
            }
        }
        return false;
    }
}
