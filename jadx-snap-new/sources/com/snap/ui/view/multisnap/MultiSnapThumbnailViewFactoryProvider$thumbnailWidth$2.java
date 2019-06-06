package com.snap.ui.view.multisnap;

import defpackage.akbk;
import defpackage.akcs;

final class MultiSnapThumbnailViewFactoryProvider$thumbnailWidth$2 extends akcs implements akbk<Integer> {
    final /* synthetic */ MultiSnapThumbnailViewFactoryProvider this$0;

    MultiSnapThumbnailViewFactoryProvider$thumbnailWidth$2(MultiSnapThumbnailViewFactoryProvider multiSnapThumbnailViewFactoryProvider) {
        this.this$0 = multiSnapThumbnailViewFactoryProvider;
        super(0);
    }

    public final int invoke() {
        MultiSnapThumbnailViewFactoryProvider multiSnapThumbnailViewFactoryProvider = this.this$0;
        return multiSnapThumbnailViewFactoryProvider.calculateThumbnailWidth(multiSnapThumbnailViewFactoryProvider.context, this.this$0.getThumbnailHeight());
    }
}
