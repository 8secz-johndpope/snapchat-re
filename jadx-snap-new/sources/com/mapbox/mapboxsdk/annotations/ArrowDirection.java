package com.mapbox.mapboxsdk.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class ArrowDirection {
    static final int BOTTOM = 3;
    static final int LEFT = 0;
    static final int RIGHT = 1;
    static final int TOP = 2;
    private final int value;

    @Retention(RetentionPolicy.SOURCE)
    @interface Value {
    }

    ArrowDirection(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
