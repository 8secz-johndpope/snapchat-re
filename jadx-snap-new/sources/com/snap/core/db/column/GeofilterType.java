package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum GeofilterType implements IntegerEnumColumn {
    STATIC(0),
    DYNAMIC(1);
    
    private final int intValue;

    protected GeofilterType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
