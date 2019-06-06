package com.addlive.shared_state.djinni;

public final class Auth {
    final String mMac;
    final String mScopeId;
    final String mToken;

    public Auth(String str, String str2, String str3) {
        this.mScopeId = str;
        this.mToken = str2;
        this.mMac = str3;
    }

    public final String getMac() {
        return this.mMac;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final String getToken() {
        return this.mToken;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Auth{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mToken=");
        stringBuilder.append(this.mToken);
        stringBuilder.append(",mMac=");
        stringBuilder.append(this.mMac);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
