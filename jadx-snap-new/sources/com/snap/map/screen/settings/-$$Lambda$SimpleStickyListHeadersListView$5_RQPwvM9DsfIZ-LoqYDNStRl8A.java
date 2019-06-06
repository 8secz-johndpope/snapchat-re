package com.snap.map.screen.settings;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SimpleStickyListHeadersListView$5_RQPwvM9DsfIZ-LoqYDNStRl8A implements OnTouchListener {
    private final /* synthetic */ SimpleStickyListHeadersListView f$0;
    private final /* synthetic */ OnTouchListener f$1;

    public /* synthetic */ -$$Lambda$SimpleStickyListHeadersListView$5_RQPwvM9DsfIZ-LoqYDNStRl8A(SimpleStickyListHeadersListView simpleStickyListHeadersListView, OnTouchListener onTouchListener) {
        this.f$0 = simpleStickyListHeadersListView;
        this.f$1 = onTouchListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f$0.a(this.f$1, view, motionEvent);
    }
}
