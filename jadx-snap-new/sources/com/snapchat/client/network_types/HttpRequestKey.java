package com.snapchat.client.network_types;

public final class HttpRequestKey {
    final long mKey;

    public HttpRequestKey(long j) {
        this.mKey = j;
    }

    public final long getKey() {
        return this.mKey;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpRequestKey{mKey=");
        stringBuilder.append(this.mKey);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
