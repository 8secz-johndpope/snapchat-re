package com.addlive.djinni;

public final class SpeechActivityInfo {
    final int mActivity;
    final long mUserId;

    public SpeechActivityInfo(long j, int i) {
        this.mUserId = j;
        this.mActivity = i;
    }

    public final int getActivity() {
        return this.mActivity;
    }

    public final long getUserId() {
        return this.mUserId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SpeechActivityInfo{mUserId=");
        stringBuilder.append(this.mUserId);
        stringBuilder.append(",mActivity=");
        stringBuilder.append(this.mActivity);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
