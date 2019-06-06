package com.snap.ui.view;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import defpackage.ajev;
import defpackage.akdd.e;

final class RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2 implements ajev {
    final /* synthetic */ e $listener;
    final /* synthetic */ RecyclerView $recyclerView;

    RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2(e eVar, RecyclerView recyclerView) {
        this.$listener = eVar;
        this.$recyclerView = recyclerView;
    }

    public final void run() {
        if (((OnScrollListener) this.$listener.a) != null) {
            this.$recyclerView.post(new RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2$$special$$inlined$let$lambda$1(this));
        }
    }
}
