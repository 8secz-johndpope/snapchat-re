package com.snap.stickers.ui.pages;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.view.ViewGroup;
import defpackage.yao;

public final class CustomStickersPage$gridLayoutManager$1 extends GridLayoutManager {
    private /* synthetic */ yao a;
    private /* synthetic */ ViewGroup b;

    public CustomStickersPage$gridLayoutManager$1(ViewGroup viewGroup, Context context, int i) {
        this.a = viewGroup;
        this.b = context;
        super((Context) i, 4, 1, false);
    }

    public final boolean canScrollVertically() {
        return !this.a.c;
    }
}
