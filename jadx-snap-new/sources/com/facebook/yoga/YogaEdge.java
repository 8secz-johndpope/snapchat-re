package com.facebook.yoga;

public enum YogaEdge {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    
    private final int mIntValue;

    private YogaEdge(int i) {
        this.mIntValue = i;
    }
}
