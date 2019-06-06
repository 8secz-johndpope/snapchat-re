package com.facebook.yoga;

public enum YogaDimension {
    WIDTH(0),
    HEIGHT(1);
    
    private final int mIntValue;

    private YogaDimension(int i) {
        this.mIntValue = i;
    }
}
