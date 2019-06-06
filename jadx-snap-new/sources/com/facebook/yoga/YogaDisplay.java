package com.facebook.yoga;

public enum YogaDisplay {
    FLEX(0),
    NONE(1);
    
    private final int mIntValue;

    private YogaDisplay(int i) {
        this.mIntValue = i;
    }
}
