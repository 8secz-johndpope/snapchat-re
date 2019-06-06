package com.snapchat.client.grpc;

public final class AuthContext {
    final String mToken;

    public AuthContext(String str) {
        this.mToken = str;
    }

    public final String getToken() {
        return this.mToken;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AuthContext{mToken=");
        stringBuilder.append(this.mToken);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
