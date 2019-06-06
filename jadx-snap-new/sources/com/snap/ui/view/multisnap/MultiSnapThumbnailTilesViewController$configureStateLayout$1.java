package com.snap.ui.view.multisnap;

import com.google.common.base.Optional;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailTileResourceBundle;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajfc;
import defpackage.ajxm;
import defpackage.akcr;
import defpackage.jwj;
import defpackage.kaz;

final class MultiSnapThumbnailTilesViewController$configureStateLayout$1<T, R> implements ajfc<ajxm<? extends ThumbnailTileResourceBundle, ? extends MultiSnapThumbnailTileView>, ajdb> {
    final /* synthetic */ ThumbnailComposingOperation $composingOperation;
    final /* synthetic */ boolean $shouldUseCompositedBitmap;
    final /* synthetic */ MultiSnapThumbnailTilesViewController this$0;

    MultiSnapThumbnailTilesViewController$configureStateLayout$1(MultiSnapThumbnailTilesViewController multiSnapThumbnailTilesViewController, ThumbnailComposingOperation thumbnailComposingOperation, boolean z) {
        this.this$0 = multiSnapThumbnailTilesViewController;
        this.$composingOperation = thumbnailComposingOperation;
        this.$shouldUseCompositedBitmap = z;
    }

    public final ajcx apply(ajxm<ThumbnailTileResourceBundle, MultiSnapThumbnailTileView> ajxm) {
        akcr.b(ajxm, "<name for destructuring parameter 0>");
        ThumbnailTileResourceBundle thumbnailTileResourceBundle = (ThumbnailTileResourceBundle) ajxm.a;
        final MultiSnapThumbnailTileView multiSnapThumbnailTileView = (MultiSnapThumbnailTileView) ajxm.b;
        return this.this$0.getCompositeBitmap(thumbnailTileResourceBundle, this.$composingOperation, this.$shouldUseCompositedBitmap).a((ajdw) this.this$0.schedulers.l()).f(new ajfc<T, R>() {
            public final void apply(Optional<kaz<jwj>> optional) {
                akcr.b(optional, "it");
                multiSnapThumbnailTileView.setImage((kaz) optional.orNull());
            }
        }).e();
    }
}
