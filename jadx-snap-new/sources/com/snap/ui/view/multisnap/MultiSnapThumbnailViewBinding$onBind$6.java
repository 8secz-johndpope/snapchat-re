package com.snap.ui.view.multisnap;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import defpackage.akcr;

final class MultiSnapThumbnailViewBinding$onBind$6 implements OnTouchListener {
    final /* synthetic */ MultiSnapThumbnailViewModel $model;
    final /* synthetic */ MultiSnapThumbnailViewBinding this$0;

    MultiSnapThumbnailViewBinding$onBind$6(MultiSnapThumbnailViewBinding multiSnapThumbnailViewBinding, MultiSnapThumbnailViewModel multiSnapThumbnailViewModel) {
        this.this$0 = multiSnapThumbnailViewBinding;
        this.$model = multiSnapThumbnailViewModel;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        akcr.a((Object) motionEvent, "event");
        if (motionEvent.getAction() == 1) {
            this.this$0.getEventDispatcher().a(new ThumbnailTouchEvent(this.$model.getThumbnailKey()));
        }
        return false;
    }
}
