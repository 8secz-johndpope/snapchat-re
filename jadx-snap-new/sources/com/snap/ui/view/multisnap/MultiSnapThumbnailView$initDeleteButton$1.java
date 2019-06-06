package com.snap.ui.view.multisnap;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akcr;

final class MultiSnapThumbnailView$initDeleteButton$1 implements OnTouchListener {
    final /* synthetic */ MultiSnapThumbnailView this$0;

    MultiSnapThumbnailView$initDeleteButton$1(MultiSnapThumbnailView multiSnapThumbnailView) {
        this.this$0 = multiSnapThumbnailView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        akcr.a((Object) motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            this.this$0.setDeleting(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.this$0.setDeleting(false);
            if (motionEvent.getX() >= MapboxConstants.MINIMUM_ZOOM) {
                float x = motionEvent.getX();
                akcr.a((Object) view, "view");
                if (x < ((float) view.getWidth()) && motionEvent.getY() >= MapboxConstants.MINIMUM_ZOOM && motionEvent.getY() < ((float) view.getHeight())) {
                    ThumbnailDeletedListener access$getDeletedListener$p = this.this$0.deletedListener;
                    if (!(access$getDeletedListener$p == null || this.this$0.getEndingTimestamp() == null)) {
                        access$getDeletedListener$p.onThumbnailDeleted(this.this$0.getSegmentKey());
                    }
                }
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            view.performClick();
        }
        return false;
    }
}
