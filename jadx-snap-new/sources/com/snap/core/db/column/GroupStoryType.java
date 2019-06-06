package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum GroupStoryType implements IntegerEnumColumn {
    CUSTOM(0),
    PRIVATE(1),
    GEOFENCE(2),
    MISCHIEF(3);
    
    private final int intValue;

    protected GroupStoryType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
