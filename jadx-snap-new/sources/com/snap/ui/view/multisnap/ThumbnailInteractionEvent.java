package com.snap.ui.view.multisnap;

import defpackage.akcr;

public abstract class ThumbnailInteractionEvent {
    private final String segmentKey;

    public ThumbnailInteractionEvent(String str) {
        akcr.b(str, "segmentKey");
        this.segmentKey = str;
    }

    public final String getSegmentKey() {
        return this.segmentKey;
    }
}
