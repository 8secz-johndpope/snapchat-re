package com.snap.ui.view.multisnap;

import defpackage.ajxw;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akcs;

final class MultiSnapThumbnailViewBinding$onBind$$inlined$let$lambda$1 extends akcs implements akbw<String, Integer, ajxw> {
    final /* synthetic */ MultiSnapThumbnailViewBinding this$0;

    MultiSnapThumbnailViewBinding$onBind$$inlined$let$lambda$1(MultiSnapThumbnailViewBinding multiSnapThumbnailViewBinding) {
        this.this$0 = multiSnapThumbnailViewBinding;
        super(2);
    }

    public final void invoke(String str, int i) {
        akcr.b(str, "segmentKey");
        this.this$0.getEventDispatcher().a(new ThumbnailSplitEvent(str, i));
    }
}
