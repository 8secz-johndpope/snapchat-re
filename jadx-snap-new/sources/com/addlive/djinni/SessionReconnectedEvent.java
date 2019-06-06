package com.addlive.djinni;

public final class SessionReconnectedEvent {
    final String mScopeId;

    public SessionReconnectedEvent(String str) {
        this.mScopeId = str;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionReconnectedEvent{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
