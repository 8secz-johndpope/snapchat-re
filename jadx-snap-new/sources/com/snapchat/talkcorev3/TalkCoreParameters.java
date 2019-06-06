package com.snapchat.talkcorev3;

public final class TalkCoreParameters {
    final int mCognacSpeakingTimeoutMs;
    final int mConnectingTimeoutMs;
    final String mCspmEventFilePath;
    final int mDelayBeforeReconnectMs;
    final String mDeviceName;
    final boolean mIsDebugOrMaster;
    final String mLocalUsername;
    final int mMaxReconnectTimeoutMs;
    final int mPresenceBroadcastIntervalMs;
    final PresenceTransportType mPresenceTransportType;
    final int mPushRepeatIntervalMs;
    final int mRingingTimeoutMs;
    final int mTimeoutBeforeReportingMissedCallMs;
    final int mTypingCancelTimeoutMs;
    final int mTypingPauseTimeoutMs;
    final int mUserExpireTimeoutMs;

    public TalkCoreParameters(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, PresenceTransportType presenceTransportType, int i11) {
        this.mLocalUsername = str;
        this.mDeviceName = str2;
        this.mCspmEventFilePath = str3;
        this.mUserExpireTimeoutMs = i;
        this.mPresenceBroadcastIntervalMs = i2;
        this.mRingingTimeoutMs = i3;
        this.mConnectingTimeoutMs = i4;
        this.mMaxReconnectTimeoutMs = i5;
        this.mDelayBeforeReconnectMs = i6;
        this.mTimeoutBeforeReportingMissedCallMs = i7;
        this.mTypingPauseTimeoutMs = i8;
        this.mTypingCancelTimeoutMs = i9;
        this.mCognacSpeakingTimeoutMs = i10;
        this.mIsDebugOrMaster = z;
        this.mPresenceTransportType = presenceTransportType;
        this.mPushRepeatIntervalMs = i11;
    }

    public final int getCognacSpeakingTimeoutMs() {
        return this.mCognacSpeakingTimeoutMs;
    }

    public final int getConnectingTimeoutMs() {
        return this.mConnectingTimeoutMs;
    }

    public final String getCspmEventFilePath() {
        return this.mCspmEventFilePath;
    }

    public final int getDelayBeforeReconnectMs() {
        return this.mDelayBeforeReconnectMs;
    }

    public final String getDeviceName() {
        return this.mDeviceName;
    }

    public final boolean getIsDebugOrMaster() {
        return this.mIsDebugOrMaster;
    }

    public final String getLocalUsername() {
        return this.mLocalUsername;
    }

    public final int getMaxReconnectTimeoutMs() {
        return this.mMaxReconnectTimeoutMs;
    }

    public final int getPresenceBroadcastIntervalMs() {
        return this.mPresenceBroadcastIntervalMs;
    }

    public final PresenceTransportType getPresenceTransportType() {
        return this.mPresenceTransportType;
    }

    public final int getPushRepeatIntervalMs() {
        return this.mPushRepeatIntervalMs;
    }

    public final int getRingingTimeoutMs() {
        return this.mRingingTimeoutMs;
    }

    public final int getTimeoutBeforeReportingMissedCallMs() {
        return this.mTimeoutBeforeReportingMissedCallMs;
    }

    public final int getTypingCancelTimeoutMs() {
        return this.mTypingCancelTimeoutMs;
    }

    public final int getTypingPauseTimeoutMs() {
        return this.mTypingPauseTimeoutMs;
    }

    public final int getUserExpireTimeoutMs() {
        return this.mUserExpireTimeoutMs;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TalkCoreParameters{mLocalUsername=");
        stringBuilder.append(this.mLocalUsername);
        stringBuilder.append(",mDeviceName=");
        stringBuilder.append(this.mDeviceName);
        stringBuilder.append(",mCspmEventFilePath=");
        stringBuilder.append(this.mCspmEventFilePath);
        stringBuilder.append(",mUserExpireTimeoutMs=");
        stringBuilder.append(this.mUserExpireTimeoutMs);
        stringBuilder.append(",mPresenceBroadcastIntervalMs=");
        stringBuilder.append(this.mPresenceBroadcastIntervalMs);
        stringBuilder.append(",mRingingTimeoutMs=");
        stringBuilder.append(this.mRingingTimeoutMs);
        stringBuilder.append(",mConnectingTimeoutMs=");
        stringBuilder.append(this.mConnectingTimeoutMs);
        stringBuilder.append(",mMaxReconnectTimeoutMs=");
        stringBuilder.append(this.mMaxReconnectTimeoutMs);
        stringBuilder.append(",mDelayBeforeReconnectMs=");
        stringBuilder.append(this.mDelayBeforeReconnectMs);
        stringBuilder.append(",mTimeoutBeforeReportingMissedCallMs=");
        stringBuilder.append(this.mTimeoutBeforeReportingMissedCallMs);
        stringBuilder.append(",mTypingPauseTimeoutMs=");
        stringBuilder.append(this.mTypingPauseTimeoutMs);
        stringBuilder.append(",mTypingCancelTimeoutMs=");
        stringBuilder.append(this.mTypingCancelTimeoutMs);
        stringBuilder.append(",mCognacSpeakingTimeoutMs=");
        stringBuilder.append(this.mCognacSpeakingTimeoutMs);
        stringBuilder.append(",mIsDebugOrMaster=");
        stringBuilder.append(this.mIsDebugOrMaster);
        stringBuilder.append(",mPresenceTransportType=");
        stringBuilder.append(this.mPresenceTransportType);
        stringBuilder.append(",mPushRepeatIntervalMs=");
        stringBuilder.append(this.mPushRepeatIntervalMs);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
