package com.snap.ui.view.multisnap;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akbk;
import defpackage.akcs;
import defpackage.jxj.b;
import defpackage.jxj.b.a;

final class MultiSnapThumbnailTilesViewController$noCornersRequestOptions$2 extends akcs implements akbk<b> {
    public static final MultiSnapThumbnailTilesViewController$noCornersRequestOptions$2 INSTANCE = new MultiSnapThumbnailTilesViewController$noCornersRequestOptions$2();

    MultiSnapThumbnailTilesViewController$noCornersRequestOptions$2() {
        super(0);
    }

    public final b invoke() {
        return new a().a(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM).b();
    }
}
