package com.snap.ui.view.multisnap;

import defpackage.akcr;

public final class MultiSnapThumbnailViewBinding$onBind$3 implements ThumbnailDeletedListener {
    final /* synthetic */ MultiSnapThumbnailViewBinding this$0;

    MultiSnapThumbnailViewBinding$onBind$3(MultiSnapThumbnailViewBinding multiSnapThumbnailViewBinding) {
        this.this$0 = multiSnapThumbnailViewBinding;
    }

    public final void onThumbnailDeleted(String str) {
        akcr.b(str, "segmentKey");
        this.this$0.getEventDispatcher().a(new ThumbnailDeletedEvent(str));
    }
}
