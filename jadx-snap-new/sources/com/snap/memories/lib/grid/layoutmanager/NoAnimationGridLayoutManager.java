package com.snap.memories.lib.grid.layoutmanager;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import defpackage.akcr;

public final class NoAnimationGridLayoutManager extends GridLayoutManager {
    public NoAnimationGridLayoutManager(Context context, int i) {
        akcr.b(context, "context");
        super(context, i);
    }

    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
