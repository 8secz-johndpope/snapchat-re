package com.snap.ui.view.multisnap;

import defpackage.akcr;

public final class ThumbnailSplitEvent extends ThumbnailInteractionEvent {
    private final int splitAtMs;

    public ThumbnailSplitEvent(String str, int i) {
        akcr.b(str, "segmentKey");
        super(str);
        this.splitAtMs = i;
    }

    public final int getSplitAtMs() {
        return this.splitAtMs;
    }
}
