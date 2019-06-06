package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum DynamicSnapSource implements IntegerEnumColumn {
    PUBLIC_USER(0),
    OUR_STORY(1);
    
    private final int intValue;

    protected DynamicSnapSource(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
