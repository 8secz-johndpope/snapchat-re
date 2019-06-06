package com.snapchat.talkcorev3;

public final class CognacParticipantState {
    final boolean mPresent;
    final Media mPublishedMedia;
    final boolean mSpeaking;

    public CognacParticipantState(boolean z, boolean z2, Media media) {
        this.mPresent = z;
        this.mSpeaking = z2;
        this.mPublishedMedia = media;
    }

    public final boolean getPresent() {
        return this.mPresent;
    }

    public final Media getPublishedMedia() {
        return this.mPublishedMedia;
    }

    public final boolean getSpeaking() {
        return this.mSpeaking;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CognacParticipantState{mPresent=");
        stringBuilder.append(this.mPresent);
        stringBuilder.append(",mSpeaking=");
        stringBuilder.append(this.mSpeaking);
        stringBuilder.append(",mPublishedMedia=");
        stringBuilder.append(this.mPublishedMedia);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
