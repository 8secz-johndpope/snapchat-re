package com.snap.ui.view.multisnap;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akbk;
import defpackage.akcs;
import defpackage.jxj.b;
import defpackage.jxj.b.a;

final class MultiSnapThumbnailTilesViewController$leftCornersOnlyRequestOptions$2 extends akcs implements akbk<b> {
    final /* synthetic */ MultiSnapThumbnailTilesViewController this$0;

    MultiSnapThumbnailTilesViewController$leftCornersOnlyRequestOptions$2(MultiSnapThumbnailTilesViewController multiSnapThumbnailTilesViewController) {
        this.this$0 = multiSnapThumbnailTilesViewController;
        super(0);
    }

    public final b invoke() {
        return new a().a(this.this$0.borderRadius, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, this.this$0.borderRadius).b();
    }
}
