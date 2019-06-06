package com.looksery.sdk.domain;

public class ScreenZoneInfo {
    private final float mBottomLeftX;
    private final float mBottomLeftY;
    private final boolean mIsEnabled;
    private final ScreenZone mScreenZone;
    private final float mTopRightX;
    private final float mTopRightY;

    public ScreenZoneInfo(ScreenZone screenZone, boolean z, float f, float f2, float f3, float f4) {
        this.mScreenZone = screenZone;
        this.mIsEnabled = z;
        this.mBottomLeftX = f;
        this.mBottomLeftY = f2;
        this.mTopRightX = f3;
        this.mTopRightY = f4;
    }

    public float getBottomLeftX() {
        return this.mBottomLeftX;
    }

    public float getBottomLeftY() {
        return this.mBottomLeftY;
    }

    public ScreenZone getScreenZone() {
        return this.mScreenZone;
    }

    public float getTopRightX() {
        return this.mTopRightX;
    }

    public float getTopRightY() {
        return this.mTopRightY;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }
}
