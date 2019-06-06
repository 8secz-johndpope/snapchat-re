package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum PersistableUnlockableType implements IntegerEnumColumn {
    FILTER(0),
    LENS(1),
    STICKER_PACK(2),
    CAPTION_STYLE(3),
    PREFETCH_LENS(4);
    
    private final int intValue;

    protected PersistableUnlockableType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
