package com.addlive.shared_state.djinni;

public final class StateUpdate {
    final String mData;
    final long mParticipantId;

    public StateUpdate(long j, String str) {
        this.mParticipantId = j;
        this.mData = str;
    }

    public final String getData() {
        return this.mData;
    }

    public final long getParticipantId() {
        return this.mParticipantId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StateUpdate{mParticipantId=");
        stringBuilder.append(this.mParticipantId);
        stringBuilder.append(",mData=");
        stringBuilder.append(this.mData);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
