package com.snapchat.talkcorev3;

public final class SpeechActivity {
    final float mActivity;
    final String mUsername;

    public SpeechActivity(String str, float f) {
        this.mUsername = str;
        this.mActivity = f;
    }

    public final float getActivity() {
        return this.mActivity;
    }

    public final String getUsername() {
        return this.mUsername;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SpeechActivity{mUsername=");
        stringBuilder.append(this.mUsername);
        stringBuilder.append(",mActivity=");
        stringBuilder.append(this.mActivity);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
