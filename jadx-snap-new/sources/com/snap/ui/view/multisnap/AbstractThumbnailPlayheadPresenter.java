package com.snap.ui.view.multisnap;

import defpackage.ajxw;
import defpackage.akbw;
import defpackage.zll;

public abstract class AbstractThumbnailPlayheadPresenter extends zll<MultiSnapThumbnailView> {
    private akbw<? super String, ? super Integer, ajxw> thumbnailSplitListener;

    public void dropTarget() {
        super.dropTarget();
        this.thumbnailSplitListener = null;
    }

    public final akbw<String, Integer, ajxw> getThumbnailSplitListener() {
        return this.thumbnailSplitListener;
    }

    public final void setThumbnailSplitListener(akbw<? super String, ? super Integer, ajxw> akbw) {
        this.thumbnailSplitListener = akbw;
    }
}
