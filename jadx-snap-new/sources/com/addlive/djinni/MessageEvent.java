package com.addlive.djinni;

public final class MessageEvent {
    final byte[] mData;
    final String mScopeId;
    final long mSrcUserId;

    public MessageEvent(String str, byte[] bArr, long j) {
        this.mScopeId = str;
        this.mData = bArr;
        this.mSrcUserId = j;
    }

    public final byte[] getData() {
        return this.mData;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final long getSrcUserId() {
        return this.mSrcUserId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageEvent{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mData=");
        stringBuilder.append(this.mData);
        stringBuilder.append(",mSrcUserId=");
        stringBuilder.append(this.mSrcUserId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
