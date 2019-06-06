package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum PlaybackSnapType implements IntegerEnumColumn {
    PUBLISHER(1),
    DISCOVER_PUBLIC_USER(2),
    PROMOTED_STORY(3);
    
    private final int intValue;

    protected PlaybackSnapType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
