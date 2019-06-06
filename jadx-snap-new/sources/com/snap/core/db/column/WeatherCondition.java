package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum WeatherCondition implements IntegerEnumColumn {
    UNKNOWN(0),
    CLEAR_NIGHT(1),
    CLOUDY(2),
    HAIL(3),
    LIGHTNING(4),
    LOW_VISIBILITY(5),
    PARTIAL_CLOUDY(6),
    PARTIAL_CLOUDY_NIGHT(7),
    RAINY(8),
    SNOW(9),
    SUNNY(10),
    WINDY(11),
    HOT(12),
    COLD(13);
    
    private final int intValue;

    protected WeatherCondition(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
