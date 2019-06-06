package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;

public enum WeatherForecastType implements IntegerEnumColumn {
    HOURLY(0),
    DAILY_DAY(1),
    DAILY_NIGHT(2);
    
    private final int intValue;

    protected WeatherForecastType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
