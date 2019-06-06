package com.addlive.djinni;

public final class UserStateChangedEvent {
    final boolean mAudioPublished;
    final boolean mIsConnected;
    final MediaType mMediaType;
    final String mScopeId;
    final long mUserId;
    final boolean mVideoPublished;
    final String mVideoSinkId;

    public UserStateChangedEvent(String str, long j, boolean z, MediaType mediaType, boolean z2, boolean z3, String str2) {
        this.mScopeId = str;
        this.mUserId = j;
        this.mIsConnected = z;
        this.mMediaType = mediaType;
        this.mAudioPublished = z2;
        this.mVideoPublished = z3;
        this.mVideoSinkId = str2;
    }

    public final boolean getAudioPublished() {
        return this.mAudioPublished;
    }

    public final boolean getIsConnected() {
        return this.mIsConnected;
    }

    public final MediaType getMediaType() {
        return this.mMediaType;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final long getUserId() {
        return this.mUserId;
    }

    public final boolean getVideoPublished() {
        return this.mVideoPublished;
    }

    public final String getVideoSinkId() {
        return this.mVideoSinkId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserStateChangedEvent{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mUserId=");
        stringBuilder.append(this.mUserId);
        stringBuilder.append(",mIsConnected=");
        stringBuilder.append(this.mIsConnected);
        stringBuilder.append(",mMediaType=");
        stringBuilder.append(this.mMediaType);
        stringBuilder.append(",mAudioPublished=");
        stringBuilder.append(this.mAudioPublished);
        stringBuilder.append(",mVideoPublished=");
        stringBuilder.append(this.mVideoPublished);
        stringBuilder.append(",mVideoSinkId=");
        stringBuilder.append(this.mVideoSinkId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
