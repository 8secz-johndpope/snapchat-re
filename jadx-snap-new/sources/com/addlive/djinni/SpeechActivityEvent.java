package com.addlive.djinni;

import java.util.ArrayList;

public final class SpeechActivityEvent {
    final ArrayList<Long> mActiveSpeakers;
    final String mScopeId;
    final ArrayList<SpeechActivityInfo> mSpeechActivity;

    public SpeechActivityEvent(String str, ArrayList<SpeechActivityInfo> arrayList, ArrayList<Long> arrayList2) {
        this.mScopeId = str;
        this.mSpeechActivity = arrayList;
        this.mActiveSpeakers = arrayList2;
    }

    public final ArrayList<Long> getActiveSpeakers() {
        return this.mActiveSpeakers;
    }

    public final String getScopeId() {
        return this.mScopeId;
    }

    public final ArrayList<SpeechActivityInfo> getSpeechActivity() {
        return this.mSpeechActivity;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SpeechActivityEvent{mScopeId=");
        stringBuilder.append(this.mScopeId);
        stringBuilder.append(",mSpeechActivity=");
        stringBuilder.append(this.mSpeechActivity);
        stringBuilder.append(",mActiveSpeakers=");
        stringBuilder.append(this.mActiveSpeakers);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
