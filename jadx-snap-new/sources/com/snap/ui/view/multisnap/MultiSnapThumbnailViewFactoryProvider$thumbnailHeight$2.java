package com.snap.ui.view.multisnap;

import com.snapchat.android.R;
import defpackage.akbk;
import defpackage.akcs;

final class MultiSnapThumbnailViewFactoryProvider$thumbnailHeight$2 extends akcs implements akbk<Integer> {
    final /* synthetic */ MultiSnapThumbnailViewFactoryProvider this$0;

    MultiSnapThumbnailViewFactoryProvider$thumbnailHeight$2(MultiSnapThumbnailViewFactoryProvider multiSnapThumbnailViewFactoryProvider) {
        this.this$0 = multiSnapThumbnailViewFactoryProvider;
        super(0);
    }

    public final int invoke() {
        return this.this$0.context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_height);
    }
}
