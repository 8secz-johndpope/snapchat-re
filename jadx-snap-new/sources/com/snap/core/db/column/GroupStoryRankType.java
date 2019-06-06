package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum GroupStoryRankType implements IntegerEnumColumn {
    RANK_CUSTOM(0),
    RANK_GEOFENCE_1D(1),
    RANK_GEOFENCE_2D(2);
    
    private final int intValue;

    protected GroupStoryRankType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
