package com.addlive.shared_state.djinni;

public final class TestAuth {
    final String mHost;
    final String mKey;
    final long mParticipantId;
    final short mPort;

    public TestAuth(long j, String str, String str2, short s) {
        this.mParticipantId = j;
        this.mKey = str;
        this.mHost = str2;
        this.mPort = s;
    }

    public final String getHost() {
        return this.mHost;
    }

    public final String getKey() {
        return this.mKey;
    }

    public final long getParticipantId() {
        return this.mParticipantId;
    }

    public final short getPort() {
        return this.mPort;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TestAuth{mParticipantId=");
        stringBuilder.append(this.mParticipantId);
        stringBuilder.append(",mKey=");
        stringBuilder.append(this.mKey);
        stringBuilder.append(",mHost=");
        stringBuilder.append(this.mHost);
        stringBuilder.append(",mPort=");
        stringBuilder.append(this.mPort);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
