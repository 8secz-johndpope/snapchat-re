package com.snapchat.talkcorev3;

import java.util.HashMap;

public final class SessionState {
    final String mCaller;
    final Media mCallingMedia;
    final boolean mConnecting;
    final ParticipantState mLocalUser;
    final HashMap<String, ParticipantState> mParticipants;

    public SessionState(ParticipantState participantState, boolean z, String str, Media media, HashMap<String, ParticipantState> hashMap) {
        this.mLocalUser = participantState;
        this.mConnecting = z;
        this.mCaller = str;
        this.mCallingMedia = media;
        this.mParticipants = hashMap;
    }

    public final String getCaller() {
        return this.mCaller;
    }

    public final Media getCallingMedia() {
        return this.mCallingMedia;
    }

    public final boolean getConnecting() {
        return this.mConnecting;
    }

    public final ParticipantState getLocalUser() {
        return this.mLocalUser;
    }

    public final HashMap<String, ParticipantState> getParticipants() {
        return this.mParticipants;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SessionState{mLocalUser=");
        stringBuilder.append(this.mLocalUser);
        stringBuilder.append(",mConnecting=");
        stringBuilder.append(this.mConnecting);
        stringBuilder.append(",mCaller=");
        stringBuilder.append(this.mCaller);
        stringBuilder.append(",mCallingMedia=");
        stringBuilder.append(this.mCallingMedia);
        stringBuilder.append(",mParticipants=");
        stringBuilder.append(this.mParticipants);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
