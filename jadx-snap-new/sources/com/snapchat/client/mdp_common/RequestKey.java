package com.snapchat.client.mdp_common;

public final class RequestKey {
    final String mKey;

    public RequestKey(String str) {
        this.mKey = str;
    }

    public final String getKey() {
        return this.mKey;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestKey{mKey=");
        stringBuilder.append(this.mKey);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
