package com.snap.ui.view.multisnap;

import android.view.animation.Animation;
import defpackage.abtv;
import defpackage.akcr;

public final class MultiSnapThumbnailTileView$animateX$$inlined$apply$lambda$1 extends abtv {
    final /* synthetic */ boolean $toVisible$inlined;
    final /* synthetic */ MultiSnapThumbnailTileView this$0;

    MultiSnapThumbnailTileView$animateX$$inlined$apply$lambda$1(MultiSnapThumbnailTileView multiSnapThumbnailTileView, boolean z) {
        this.this$0 = multiSnapThumbnailTileView;
        this.$toVisible$inlined = z;
    }

    public final void onAnimationEnd(Animation animation) {
        akcr.b(animation, "animation");
        if (this.this$0.prevAnimation == animation) {
            if (!this.$toVisible$inlined) {
                this.this$0.setVisibility(4);
            }
            this.this$0.prevAnimation = null;
        }
    }
}
