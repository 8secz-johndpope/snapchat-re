package com.snap.ui.view;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import defpackage.ajcy;
import defpackage.ajda;
import defpackage.akcr;
import defpackage.akdd.e;

final class RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$1 implements ajda {
    final /* synthetic */ e $listener;
    final /* synthetic */ RecyclerView $recyclerView;

    RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$1(RecyclerView recyclerView, e eVar) {
        this.$recyclerView = recyclerView;
        this.$listener = eVar;
    }

    public final void subscribe(final ajcy ajcy) {
        akcr.b(ajcy, "it");
        if (this.$recyclerView.getScrollState() == 0) {
            ajcy.a();
            return;
        }
        this.$listener.a = new OnScrollListener() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                akcr.b(recyclerView, "recyclerView");
                Object obj = ajcy;
                akcr.a(obj, "it");
                if (!obj.isDisposed() && i == 0) {
                    ajcy.a();
                }
            }
        };
        this.$recyclerView.addOnScrollListener((OnScrollListener) this.$listener.a);
    }
}
