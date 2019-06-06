package com.snapchat.talkcorev3;

import java.util.ArrayList;
import java.util.HashMap;

public final class PresenceMessage {
    final String mConversationId;
    final HashMap<String, Integer> mExtendedPresences;
    final HashMap<String, Boolean> mLegacyPresences;
    final HashMap<String, ArrayList<String>> mPresencesMetadata;
    final ArrayList<String> mRecipients;

    public PresenceMessage(String str, ArrayList<String> arrayList, HashMap<String, Boolean> hashMap, HashMap<String, Integer> hashMap2, HashMap<String, ArrayList<String>> hashMap3) {
        this.mConversationId = str;
        this.mRecipients = arrayList;
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

    public final ArrayList<String> getRecipients() {
        return this.mRecipients;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PresenceMessage{mConversationId=");
        stringBuilder.append(this.mConversationId);
        stringBuilder.append(",mRecipients=");
        stringBuilder.append(this.mRecipients);
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
