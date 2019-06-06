package com.snap.ui.view;

import android.support.v7.widget.RecyclerView.OnScrollListener;

final class RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2$$special$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2 this$0;

    RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2$$special$$inlined$let$lambda$1(RecyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2 recyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2) {
        this.this$0 = recyclerViewIsIdleSingleKt$recyclerViewIsIdleCompletable$2;
    }

    public final void run() {
        this.this$0.$recyclerView.removeOnScrollListener((OnScrollListener) this.this$0.$listener.a);
    }
}
