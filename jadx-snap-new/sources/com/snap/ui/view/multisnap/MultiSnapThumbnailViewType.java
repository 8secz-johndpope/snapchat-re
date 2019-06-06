package com.snap.ui.view.multisnap;

import defpackage.zlw;
import defpackage.zmd;

public enum MultiSnapThumbnailViewType implements zlw {
    THUMBNAIL_VIEW(0, MultiSnapThumbnailViewBinding.class);
    
    private final int layoutId;
    private final Class<? extends zmd<?>> viewBindingClass;

    protected MultiSnapThumbnailViewType(int i, Class<? extends zmd<?>> cls) {
        this.layoutId = i;
        this.viewBindingClass = cls;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final Class<? extends zmd<?>> getViewBindingClass() {
        return this.viewBindingClass;
    }
}
