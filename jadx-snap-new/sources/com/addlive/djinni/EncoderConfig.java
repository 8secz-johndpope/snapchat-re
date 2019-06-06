package com.addlive.djinni;

public final class EncoderConfig {
    final int mHeight;
    final int mInitialBitrateKbps;
    final int mInitialFrameRate;
    final String mMimeType;
    final int mWidth;

    public EncoderConfig(String str, int i, int i2, int i3, int i4) {
        this.mMimeType = str;
        this.mInitialBitrateKbps = i;
        this.mInitialFrameRate = i2;
        this.mWidth = i3;
        this.mHeight = i4;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final int getInitialBitrateKbps() {
        return this.mInitialBitrateKbps;
    }

    public final int getInitialFrameRate() {
        return this.mInitialFrameRate;
    }

    public final String getMimeType() {
        return this.mMimeType;
    }

    public final int getWidth() {
        return this.mWidth;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EncoderConfig{mMimeType=");
        stringBuilder.append(this.mMimeType);
        stringBuilder.append(",mInitialBitrateKbps=");
        stringBuilder.append(this.mInitialBitrateKbps);
        stringBuilder.append(",mInitialFrameRate=");
        stringBuilder.append(this.mInitialFrameRate);
        stringBuilder.append(",mWidth=");
        stringBuilder.append(this.mWidth);
        stringBuilder.append(",mHeight=");
        stringBuilder.append(this.mHeight);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
