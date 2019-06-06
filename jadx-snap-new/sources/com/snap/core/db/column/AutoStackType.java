package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum AutoStackType implements IntegerEnumColumn {
    UNFILTERED(0),
    INSTASNAP(1),
    MISS_ETIKATE(2),
    GREYSCALE(3),
    SMOOTHING(4),
    SKY_DAYLIGHT(5),
    SKY_SUNSET(6),
    SKY_NIGHT(7),
    UNRECOGNIZED_VALUE(8);
    
    private final int intValue;

    protected AutoStackType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
