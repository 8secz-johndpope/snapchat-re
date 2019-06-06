package com.snapchat.talkcorev3;

public final class TypingParticipant {
    final TypingState mTypingState;
    final String mUsername;

    public TypingParticipant(String str, TypingState typingState) {
        this.mUsername = str;
        this.mTypingState = typingState;
    }

    public final TypingState getTypingState() {
        return this.mTypingState;
    }

    public final String getUsername() {
        return this.mUsername;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TypingParticipant{mUsername=");
        stringBuilder.append(this.mUsername);
        stringBuilder.append(",mTypingState=");
        stringBuilder.append(this.mTypingState);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
