package com.facebook.yoga;

public enum YogaOverflow {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);
    
    final int mIntValue;

    private YogaOverflow(int i) {
        this.mIntValue = i;
    }
}
