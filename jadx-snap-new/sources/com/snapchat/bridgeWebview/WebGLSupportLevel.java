package com.snapchat.bridgeWebview;

public enum WebGLSupportLevel {
    UNKNOWN(true, -2),
    NOT_SUPPORTED(false, -1),
    DISABLED(false, 0),
    ENABLED(true, 1);
    
    private final boolean mIsSupported;
    private final int mSupportLevel;

    private WebGLSupportLevel(boolean z, int i) {
        this.mIsSupported = z;
        this.mSupportLevel = i;
    }

    public static WebGLSupportLevel getSupportLevelFromInt(int i) {
        for (WebGLSupportLevel webGLSupportLevel : values()) {
            if (i == webGLSupportLevel.getSupportLevel()) {
                return webGLSupportLevel;
            }
        }
        return UNKNOWN;
    }

    public final int getSupportLevel() {
        return this.mSupportLevel;
    }

    public final boolean isSupported() {
        return this.mIsSupported;
    }
}
