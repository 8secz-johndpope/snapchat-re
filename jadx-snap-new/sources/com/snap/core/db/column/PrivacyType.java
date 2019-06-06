package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum PrivacyType implements IntegerEnumColumn {
    EVERYONE(0),
    FRIENDS(1),
    CUSTOM(2);
    
    private final int intValue;

    protected PrivacyType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
