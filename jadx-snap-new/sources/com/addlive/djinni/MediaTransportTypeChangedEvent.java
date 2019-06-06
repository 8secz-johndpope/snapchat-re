package com.addlive.djinni;

public final class MediaTransportTypeChangedEvent {
    final MediaType mMediaType;
    final String mScopeId;
    final MediaTransportType mTransportType;

    public MediaTransportTypeChangedEvent(String str, MediaType mediaType, MediaTransportType mediaTransportType) {
        this.mScopeId = str;
        this.mMediaType = mediaType;
        this.mTransportType = mediaTransportType;
    }

    public final MediaType getMediaType() {
        return this.mMediaType;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final MediaTransportType getTransportType() {
        return this.mTransportType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaTransportTypeChangedEvent{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mMediaType=");
        stringBuilder.append(this.mMediaType);
        stringBuilder.append(",mTransportType=");
        stringBuilder.append(this.mTransportType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
