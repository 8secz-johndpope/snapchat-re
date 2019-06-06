package com.snapchat.talkcorev3;

import java.util.ArrayList;
import java.util.HashMap;

public final class ChatMessage {
    final String mConversationId;
    final HashMap<String, Integer> mExtendedPresences;
    final HashMap<String, Boolean> mLegacyPresences;
    final HashMap<String, ArrayList<String>> mPresencesMetadata;
    final String mRemoteUsername;
    final long mTimestampMs;

    public ChatMessage(String str, String str2, long j, HashMap<String, Boolean> hashMap, HashMap<String, Integer> hashMap2, HashMap<String, ArrayList<String>> hashMap3) {
        this.mRemoteUsername = str;
        this.mConversationId = str2;
        this.mTimestampMs = j;
        this.mLegacyPresences = hashMap;
        this.mExtendedPresences = hashMap2;
        this.mPresencesMetadata = hashMap3;
    }

    public final String getConversationId() {
        return this.mConversationId;
    }

    public final HashMap<String, Integer> getExtendedPresences() {
        return this.mExtendedPresences;
    }

    public final HashMap<String, Boolean> getLegacyPresences() {
        return this.mLegacyPresences;
    }

    public final HashMap<String, ArrayList<String>> getPresencesMetadata() {
        return this.mPresencesMetadata;
    }

    public final String getRemoteUsername() {
        return this.mRemoteUsername;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChatMessage{mRemoteUsername=");
        stringBuilder.append(this.mRemoteUsername);
        stringBuilder.append(",mConversationId=");
        stringBuilder.append(this.mConversationId);
        stringBuilder.append(",mTimestampMs=");
        stringBuilder.append(this.mTimestampMs);
        stringBuilder.append(",mLegacyPresences=");
        stringBuilder.append(this.mLegacyPresences);
        stringBuilder.append(",mExtendedPresences=");
        stringBuilder.append(this.mExtendedPresences);
        stringBuilder.append(",mPresencesMetadata=");
        stringBuilder.append(this.mPresencesMetadata);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
