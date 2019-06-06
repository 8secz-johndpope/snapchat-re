package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum FriendmojiType implements IntegerEnumColumn {
    MUTABLE(0),
    READ_ONLY(1),
    BLOCKED(2);
    
    private final int intValue;

    protected FriendmojiType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
