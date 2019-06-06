package com.addlive.djinni;

public final class DecoderConfig {
    final String mMimeType;

    public DecoderConfig(String str) {
        this.mMimeType = str;
    }

    public final String getMimeType() {
        return this.mMimeType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DecoderConfig{mMimeType=");
        stringBuilder.append(this.mMimeType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
