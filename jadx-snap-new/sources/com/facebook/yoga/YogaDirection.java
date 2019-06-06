package com.facebook.yoga;

public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    final int mIntValue;

    private YogaDirection(int i) {
        this.mIntValue = i;
    }
}
