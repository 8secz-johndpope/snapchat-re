package com.snapchat.client.graphene;

public final class FlushContext {
    final String mUsername;

    public FlushContext(String str) {
        this.mUsername = str;
    }

    public final String getUsername() {
        return this.mUsername;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlushContext{mUsername=");
        stringBuilder.append(this.mUsername);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
