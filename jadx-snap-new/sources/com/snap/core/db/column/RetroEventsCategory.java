package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum RetroEventsCategory implements IntegerEnumColumn {
    SNAPADS(0),
    UNLOCKABLES(1);
    
    private final int intValue;

    protected RetroEventsCategory(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
