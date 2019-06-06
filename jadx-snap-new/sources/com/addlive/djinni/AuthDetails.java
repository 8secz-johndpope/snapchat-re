package com.addlive.djinni;

public final class AuthDetails {
    final long mExpires;
    final String mMac;
    final String mSalt;
    final String mSignature;
    final String mToken;
    final long mUserId;

    public AuthDetails(long j, long j2, String str, String str2, String str3, String str4) {
        this.mUserId = j;
        this.mExpires = j2;
        this.mSalt = str;
        this.mSignature = str2;
        this.mToken = str3;
        this.mMac = str4;
    }

    public final long getExpires() {
        return this.mExpires;
    }

    public final String getMac() {
        return this.mMac;
    }

    public final String getSalt() {
        return this.mSalt;
    }

    public final String getSignature() {
        return this.mSignature;
    }

    public final String getToken() {
        return this.mToken;
    }

    public final long getUserId() {
        return this.mUserId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AuthDetails{mUserId=");
        stringBuilder.append(this.mUserId);
        stringBuilder.append(",mExpires=");
        stringBuilder.append(this.mExpires);
        stringBuilder.append(",mSalt=");
        stringBuilder.append(this.mSalt);
        stringBuilder.append(",mSignature=");
        stringBuilder.append(this.mSignature);
        stringBuilder.append(",mToken=");
        stringBuilder.append(this.mToken);
        stringBuilder.append(",mMac=");
        stringBuilder.append(this.mMac);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
