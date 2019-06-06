package com.snap.ui.view.multisnap;

import com.google.common.base.Optional;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailTileResourceBundle;
import defpackage.ajfc;
import defpackage.akcr;
import defpackage.jwj;
import defpackage.kaz;

final class MultiSnapThumbnailTilesViewController$getCompositeBitmap$1<T, R> implements ajfc<T, R> {
    final /* synthetic */ ThumbnailTileResourceBundle $resourceBundle;

    MultiSnapThumbnailTilesViewController$getCompositeBitmap$1(ThumbnailTileResourceBundle thumbnailTileResourceBundle) {
        this.$resourceBundle = thumbnailTileResourceBundle;
    }

    public final Optional<kaz<jwj>> apply(Optional<kaz<jwj>> optional) {
        akcr.b(optional, "it");
        this.$resourceBundle.setCompositedBitmap((kaz) optional.orNull());
        return optional;
    }
}
