package com.addlive.djinni;

public final class VideoStreamDescriptor {
    final int mMaxBitRate;
    final int mMaxFps;
    final int mMaxHeight;
    final int mMaxWidth;
    final boolean mPublish;
    final boolean mReceive;
    final boolean mUseAdaptation;

    public VideoStreamDescriptor(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
        this.mMaxBitRate = i3;
        this.mMaxFps = i4;
        this.mPublish = z;
        this.mReceive = z2;
        this.mUseAdaptation = z3;
    }

    public final int getMaxBitRate() {
        return this.mMaxBitRate;
    }

    public final int getMaxFps() {
        return this.mMaxFps;
    }

    public final int getMaxHeight() {
        return this.mMaxHeight;
    }

    public final int getMaxWidth() {
        return this.mMaxWidth;
    }

    public final boolean getPublish() {
        return this.mPublish;
    }

    public final boolean getReceive() {
        return this.mReceive;
    }

    public final boolean getUseAdaptation() {
        return this.mUseAdaptation;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VideoStreamDescriptor{mMaxWidth=");
        stringBuilder.append(this.mMaxWidth);
        stringBuilder.append(",mMaxHeight=");
        stringBuilder.append(this.mMaxHeight);
        stringBuilder.append(",mMaxBitRate=");
        stringBuilder.append(this.mMaxBitRate);
        stringBuilder.append(",mMaxFps=");
        stringBuilder.append(this.mMaxFps);
        stringBuilder.append(",mPublish=");
        stringBuilder.append(this.mPublish);
        stringBuilder.append(",mReceive=");
        stringBuilder.append(this.mReceive);
        stringBuilder.append(",mUseAdaptation=");
        stringBuilder.append(this.mUseAdaptation);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
