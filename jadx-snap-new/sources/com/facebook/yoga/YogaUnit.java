package com.facebook.yoga;

public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    final int mIntValue;

    private YogaUnit(int i) {
        this.mIntValue = i;
    }
}
