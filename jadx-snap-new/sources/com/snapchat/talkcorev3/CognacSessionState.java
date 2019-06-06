package com.snapchat.talkcorev3;

import java.util.HashMap;

public final class CognacSessionState {
    final CognacParticipantState mLocalUser;
    final HashMap<String, CognacParticipantState> mParticipants;

    public CognacSessionState(CognacParticipantState cognacParticipantState, HashMap<String, CognacParticipantState> hashMap) {
        this.mLocalUser = cognacParticipantState;
        this.mParticipants = hashMap;
    }

    public final CognacParticipantState getLocalUser() {
        return this.mLocalUser;
    }

    public final HashMap<String, CognacParticipantState> getParticipants() {
        return this.mParticipants;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CognacSessionState{mLocalUser=");
        stringBuilder.append(this.mLocalUser);
        stringBuilder.append(",mParticipants=");
        stringBuilder.append(this.mParticipants);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
