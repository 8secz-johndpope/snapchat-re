package com.snap.ui.view.multisnap;

import defpackage.akcr;

public final class ThumbnailTrimmedEvent extends ThumbnailInteractionEvent {
    private final int leftTrimTimestampMs;
    private final Integer rightTrimTimestampMs;

    public ThumbnailTrimmedEvent(String str, int i, Integer num) {
        akcr.b(str, "segmentKey");
        super(str);
        this.leftTrimTimestampMs = i;
        this.rightTrimTimestampMs = num;
    }

    public final int getLeftTrimTimestampMs() {
        return this.leftTrimTimestampMs;
    }

    public final Integer getRightTrimTimestampMs() {
        return this.rightTrimTimestampMs;
    }
}
