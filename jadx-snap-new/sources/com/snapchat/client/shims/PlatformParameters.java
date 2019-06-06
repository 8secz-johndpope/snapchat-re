package com.snapchat.client.shims;

public final class PlatformParameters {
    final boolean mEnableAsserts;
    final LogLevel mMinLogLevel;

    public PlatformParameters(boolean z, LogLevel logLevel) {
        this.mEnableAsserts = z;
        this.mMinLogLevel = logLevel;
    }

    public final boolean getEnableAsserts() {
        return this.mEnableAsserts;
    }

    public final LogLevel getMinLogLevel() {
        return this.mMinLogLevel;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlatformParameters{mEnableAsserts=");
        stringBuilder.append(this.mEnableAsserts);
        stringBuilder.append(",mMinLogLevel=");
        stringBuilder.append(this.mMinLogLevel);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
