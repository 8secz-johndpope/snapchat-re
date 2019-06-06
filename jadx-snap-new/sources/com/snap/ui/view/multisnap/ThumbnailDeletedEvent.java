package com.snap.ui.view.multisnap;

import defpackage.akcr;

public final class ThumbnailDeletedEvent extends ThumbnailInteractionEvent {
    public ThumbnailDeletedEvent(String str) {
        akcr.b(str, "segmentKey");
        super(str);
    }
}
