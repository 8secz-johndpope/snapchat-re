package com.addlive.djinni;

public final class ConnectionDescriptor {
    final long mAppId;
    final AuthDetails mAuthDetails;
    final boolean mAutoPublishAudio;
    final boolean mAutoPublishVideo;
    final boolean mIsGroup;
    final String mScopeId;
    final String mUrl;
    final VideoStreamDescriptor mVideoStream;

    public ConnectionDescriptor(VideoStreamDescriptor videoStreamDescriptor, AuthDetails authDetails, boolean z, boolean z2, long j, String str, String str2, boolean z3) {
        this.mVideoStream = videoStreamDescriptor;
        this.mAuthDetails = authDetails;
        this.mAutoPublishVideo = z;
        this.mAutoPublishAudio = z2;
        this.mAppId = j;
        this.mScopeId = str;
        this.mUrl = str2;
        this.mIsGroup = z3;
    }

    public final long getAppId() {
        return this.mAppId;
    }

    public final AuthDetails getAuthDetails() {
        return this.mAuthDetails;
    }

    public final boolean getAutoPublishAudio() {
        return this.mAutoPublishAudio;
    }

    public final boolean getAutoPublishVideo() {
        return this.mAutoPublishVideo;
    }

    public final boolean getIsGroup() {
        return this.mIsGroup;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final String getUrl() {
        return this.mUrl;
    }

    public final VideoStreamDescriptor getVideoStream() {
        return this.mVideoStream;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionDescriptor{mVideoStream=");
        stringBuilder.append(this.mVideoStream);
        stringBuilder.append(",mAuthDetails=");
        stringBuilder.append(this.mAuthDetails);
        stringBuilder.append(",mAutoPublishVideo=");
        stringBuilder.append(this.mAutoPublishVideo);
        stringBuilder.append(",mAutoPublishAudio=");
        stringBuilder.append(this.mAutoPublishAudio);
        stringBuilder.append(",mAppId=");
        stringBuilder.append(this.mAppId);
        stringBuilder.append(",mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mUrl=");
        stringBuilder.append(this.mUrl);
        stringBuilder.append(",mIsGroup=");
        stringBuilder.append(this.mIsGroup);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
