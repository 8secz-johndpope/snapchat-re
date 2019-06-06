package com.facebook.yoga;

public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);
    
    private final int mIntValue;

    private YogaWrap(int i) {
        this.mIntValue = i;
    }
}
