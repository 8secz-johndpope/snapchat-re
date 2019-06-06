package com.snapchat.talkcorev3;

public final class CognacParticipant {
    final String mCognacId;
    final String mUsername;

    public CognacParticipant(String str, String str2) {
        this.mUsername = str;
        this.mCognacId = str2;
    }

    public final String getCognacId() {
        return this.mCognacId;
    }

    public final String getUsername() {
        return this.mUsername;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CognacParticipant{mUsername=");
        stringBuilder.append(this.mUsername);
        stringBuilder.append(",mCognacId=");
        stringBuilder.append(this.mCognacId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
