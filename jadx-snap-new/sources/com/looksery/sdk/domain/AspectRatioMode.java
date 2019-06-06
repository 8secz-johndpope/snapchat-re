package com.looksery.sdk.domain;

public enum AspectRatioMode {
    NONE(-1),
    STRETCH_TO_FILL(0),
    PRESERVE_TO_FIT(1),
    PRESERVE_TO_FILL(2),
    PRESERVE_TO_FIT_WIDTH(3);
    
    private final int mValue;

    private AspectRatioMode(int i) {
        this.mValue = i;
    }

    public final int getValue() {
        return this.mValue;
    }
}
