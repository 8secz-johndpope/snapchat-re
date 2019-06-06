package com.snap.ui.view.multisnap;

import defpackage.akcr;

public final class ThumbnailTouchEvent extends ThumbnailInteractionEvent {
    public ThumbnailTouchEvent(String str) {
        akcr.b(str, "segmentKey");
        super(str);
    }
}
