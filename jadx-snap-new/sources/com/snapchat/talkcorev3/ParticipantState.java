package com.snapchat.talkcorev3;

public final class ParticipantState {
    final CallingState mCallingState;
    final MediaIssueType mMediaIssue;
    final boolean mPresent;
    final Media mPublishedMedia;
    final TypingState mTypingState;
    final boolean mVideoFlowing;
    final String mVideoSinkId;

    public ParticipantState(boolean z, TypingState typingState, CallingState callingState, Media media, String str, MediaIssueType mediaIssueType, boolean z2) {
        this.mPresent = z;
        this.mTypingState = typingState;
        this.mCallingState = callingState;
        this.mPublishedMedia = media;
        this.mVideoSinkId = str;
        this.mMediaIssue = mediaIssueType;
        this.mVideoFlowing = z2;
    }

    public final CallingState getCallingState() {
        return this.mCallingState;
    }

    public final MediaIssueType getMediaIssue() {
        return this.mMediaIssue;
    }

    public final boolean getPresent() {
        return this.mPresent;
    }

    public final Media getPublishedMedia() {
        return this.mPublishedMedia;
    }

    public final TypingState getTypingState() {
        return this.mTypingState;
    }

    public final boolean getVideoFlowing() {
        return this.mVideoFlowing;
    }

    public final String getVideoSinkId() {
        return this.mVideoSinkId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParticipantState{mPresent=");
        stringBuilder.append(this.mPresent);
        stringBuilder.append(",mTypingState=");
        stringBuilder.append(this.mTypingState);
        stringBuilder.append(",mCallingState=");
        stringBuilder.append(this.mCallingState);
        stringBuilder.append(",mPublishedMedia=");
        stringBuilder.append(this.mPublishedMedia);
        stringBuilder.append(",mVideoSinkId=");
        stringBuilder.append(this.mVideoSinkId);
        stringBuilder.append(",mMediaIssue=");
        stringBuilder.append(this.mMediaIssue);
        stringBuilder.append(",mVideoFlowing=");
        stringBuilder.append(this.mVideoFlowing);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
