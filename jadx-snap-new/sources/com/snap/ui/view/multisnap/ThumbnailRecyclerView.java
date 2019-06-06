package com.snap.ui.view.multisnap;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import defpackage.akcr;

public final class ThumbnailRecyclerView extends RecyclerView {
    private boolean touchEnabled;

    public ThumbnailRecyclerView(Context context) {
        akcr.b(context, "context");
        super(context);
        init();
    }

    public ThumbnailRecyclerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        init();
    }

    public ThumbnailRecyclerView(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        super(context, attributeSet, i);
        init();
    }

    public final boolean getTouchEnabled() {
        return this.touchEnabled;
    }

    public final void init() {
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutParams(new LayoutParams(-2, -2));
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        setItemAnimator(null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "e");
        return !this.touchEnabled;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "e");
        return false;
    }

    public final void recycle() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof MultiSnapThumbnailView)) {
                childAt = null;
            }
            MultiSnapThumbnailView multiSnapThumbnailView = (MultiSnapThumbnailView) childAt;
            if (multiSnapThumbnailView != null) {
                multiSnapThumbnailView.recycle();
            }
        }
    }

    public final void setTouchEnabled(boolean z) {
        this.touchEnabled = z;
    }
}
