package com.snapchat.client.learned_search;

public final class BitmojiApiResponse {
    final String mRemoteModelUrl;
    final Integer mRemoteModelVersion;
    final boolean mShouldUpdate;

    public BitmojiApiResponse(boolean z, String str, Integer num) {
        this.mShouldUpdate = z;
        this.mRemoteModelUrl = str;
        this.mRemoteModelVersion = num;
    }

    public final String getRemoteModelUrl() {
        return this.mRemoteModelUrl;
    }

    public final Integer getRemoteModelVersion() {
        return this.mRemoteModelVersion;
    }

    public final boolean getShouldUpdate() {
        return this.mShouldUpdate;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BitmojiApiResponse{mShouldUpdate=");
        stringBuilder.append(this.mShouldUpdate);
        stringBuilder.append(",mRemoteModelUrl=");
        stringBuilder.append(this.mRemoteModelUrl);
        stringBuilder.append(",mRemoteModelVersion=");
        stringBuilder.append(this.mRemoteModelVersion);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
