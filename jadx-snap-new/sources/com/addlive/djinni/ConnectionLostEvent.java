package com.addlive.djinni;

public final class ConnectionLostEvent {
    final int mErrCode;
    final String mErrMessage;
    final String mScopeId;
    final boolean mWillReconnect;

    public ConnectionLostEvent(String str, int i, String str2, boolean z) {
        this.mScopeId = str;
        this.mErrCode = i;
        this.mErrMessage = str2;
        this.mWillReconnect = z;
    }

    public final int getErrCode() {
        return this.mErrCode;
    }

    public final String getErrMessage() {
        return this.mErrMessage;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final boolean getWillReconnect() {
        return this.mWillReconnect;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionLostEvent{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mErrCode=");
        stringBuilder.append(this.mErrCode);
        stringBuilder.append(",mErrMessage=");
        stringBuilder.append(this.mErrMessage);
        stringBuilder.append(",mWillReconnect=");
        stringBuilder.append(this.mWillReconnect);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
