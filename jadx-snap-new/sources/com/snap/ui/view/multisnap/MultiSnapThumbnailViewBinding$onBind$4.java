package com.snap.ui.view.multisnap;

import defpackage.ajxw;
import defpackage.akca;
import defpackage.akcr;
import defpackage.akcs;

final class MultiSnapThumbnailViewBinding$onBind$4 extends akcs implements akca<String, Integer, Integer, ajxw> {
    final /* synthetic */ MultiSnapThumbnailViewBinding this$0;

    MultiSnapThumbnailViewBinding$onBind$4(MultiSnapThumbnailViewBinding multiSnapThumbnailViewBinding) {
        this.this$0 = multiSnapThumbnailViewBinding;
        super(3);
    }

    public final void invoke(String str, int i, Integer num) {
        akcr.b(str, "segmentKey");
        this.this$0.getEventDispatcher().a(new ThumbnailTrimmedEvent(str, i, num));
    }
}
