package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum FeedKind implements IntegerEnumColumn {
    DIRECT(0),
    GROUP(1);
    
    private final int intValue;

    protected FeedKind(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
