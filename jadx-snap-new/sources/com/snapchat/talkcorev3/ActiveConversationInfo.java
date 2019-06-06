package com.snapchat.talkcorev3;

import java.util.ArrayList;

public final class ActiveConversationInfo {
    final Media mCallMedia;
    final ArrayList<String> mCallParticipants;
    final String mCaller;
    final boolean mCalling;
    final ArrayList<CognacParticipant> mCognacParticipants;
    final ArrayList<TypingParticipant> mTypingParticipants;

    public ActiveConversationInfo(boolean z, String str, Media media, ArrayList<String> arrayList, ArrayList<TypingParticipant> arrayList2, ArrayList<CognacParticipant> arrayList3) {
        this.mCalling = z;
        this.mCaller = str;
        this.mCallMedia = media;
        this.mCallParticipants = arrayList;
        this.mTypingParticipants = arrayList2;
        this.mCognacParticipants = arrayList3;
    }

    public final Media getCallMedia() {
        return this.mCallMedia;
    }

    public final ArrayList<String> getCallParticipants() {
        return this.mCallParticipants;
    }

    public final String getCaller() {
        return this.mCaller;
    }

    public final boolean getCalling() {
        return this.mCalling;
    }

    public final ArrayList<CognacParticipant> getCognacParticipants() {
        return this.mCognacParticipants;
    }

    public final ArrayList<TypingParticipant> getTypingParticipants() {
        return this.mTypingParticipants;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActiveConversationInfo{mCalling=");
        stringBuilder.append(this.mCalling);
        stringBuilder.append(",mCaller=");
        stringBuilder.append(this.mCaller);
        stringBuilder.append(",mCallMedia=");
        stringBuilder.append(this.mCallMedia);
        stringBuilder.append(",mCallParticipants=");
        stringBuilder.append(this.mCallParticipants);
        stringBuilder.append(",mTypingParticipants=");
        stringBuilder.append(this.mTypingParticipants);
        stringBuilder.append(",mCognacParticipants=");
        stringBuilder.append(this.mCognacParticipants);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
