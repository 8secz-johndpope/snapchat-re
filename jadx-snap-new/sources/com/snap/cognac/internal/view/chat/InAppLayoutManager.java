package com.snap.cognac.internal.view.chat;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

public class InAppLayoutManager extends LinearLayoutManager {
    public InAppLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public final void a() {
        scrollToPosition(getItemCount() - 1);
    }
}
