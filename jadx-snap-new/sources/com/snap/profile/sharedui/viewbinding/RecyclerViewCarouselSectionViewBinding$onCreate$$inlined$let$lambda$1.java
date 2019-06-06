package com.snap.profile.sharedui.viewbinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import defpackage.usc;
import defpackage.uyx;
import defpackage.uzj;

public final class RecyclerViewCarouselSectionViewBinding$onCreate$$inlined$let$lambda$1 extends PagerLayoutManager {
    private /* synthetic */ RecyclerView a;
    private /* synthetic */ uyx b;

    public RecyclerViewCarouselSectionViewBinding$onCreate$$inlined$let$lambda$1(RecyclerView recyclerView, Context context, int i, int i2, uyx uyx) {
        this.a = recyclerView;
        this.b = uyx;
        super(context, i, i2);
    }

    public final boolean canScrollHorizontally() {
        uzj uzj = (uzj) this.b.getModel();
        return super.canScrollHorizontally() && (uzj == null || uzj.b == usc.IDENTITY);
    }
}
