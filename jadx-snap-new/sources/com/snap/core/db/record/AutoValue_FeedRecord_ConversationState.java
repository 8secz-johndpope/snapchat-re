package com.snap.core.db.record;

import com.snap.core.db.record.FeedRecord.ConversationState;

final class AutoValue_FeedRecord_ConversationState extends ConversationState {
    private final long _id;
    private final Long clearedTimestamp;
    private final boolean cognacNotificationMuted;
    private final boolean isTemporaryGroup;
    private final String key;
    private final long messageRetentionInMinutes;
    private final long myReceivedSnapReleaseTimestamp;
    private final long mySentSnapReleaseTimestamp;
    private final Boolean notificationMuted;

    AutoValue_FeedRecord_ConversationState(long j, String str, Long l, long j2, long j3, Boolean bool, boolean z, long j4, boolean z2) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.clearedTimestamp = l;
            this.myReceivedSnapReleaseTimestamp = j2;
            this.mySentSnapReleaseTimestamp = j3;
            this.notificationMuted = bool;
            this.cognacNotificationMuted = z;
            this.messageRetentionInMinutes = j4;
            this.isTemporaryGroup = z2;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final Long clearedTimestamp() {
        return this.clearedTimestamp;
    }

    public final boolean cognacNotificationMuted() {
        return this.cognacNotificationMuted;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationState) {
            ConversationState conversationState = (ConversationState) obj;
            if (this._id == conversationState._id() && this.key.equals(conversationState.key())) {
                Long l = this.clearedTimestamp;
                if (l != null ? !l.equals(conversationState.clearedTimestamp()) : conversationState.clearedTimestamp() != null) {
                    if (this.myReceivedSnapReleaseTimestamp == conversationState.myReceivedSnapReleaseTimestamp() && this.mySentSnapReleaseTimestamp == conversationState.mySentSnapReleaseTimestamp()) {
                        Boolean bool = this.notificationMuted;
                        if (bool != null ? !bool.equals(conversationState.notificationMuted()) : conversationState.notificationMuted() != null) {
                            return this.cognacNotificationMuted == conversationState.cognacNotificationMuted() && this.messageRetentionInMinutes == conversationState.messageRetentionInMinutes() && this.isTemporaryGroup == conversationState.isTemporaryGroup();
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        Long l = this.clearedTimestamp;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j2 = this.myReceivedSnapReleaseTimestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.mySentSnapReleaseTimestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Boolean bool = this.notificationMuted;
        if (bool != null) {
            i = bool.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        i = 1231;
        hashCode = (hashCode ^ (this.cognacNotificationMuted ? 1231 : 1237)) * 1000003;
        long j3 = this.messageRetentionInMinutes;
        hashCode = (hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        if (!this.isTemporaryGroup) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final boolean isTemporaryGroup() {
        return this.isTemporaryGroup;
    }

    public final String key() {
        return this.key;
    }

    public final long messageRetentionInMinutes() {
        return this.messageRetentionInMinutes;
    }

    public final long myReceivedSnapReleaseTimestamp() {
        return this.myReceivedSnapReleaseTimestamp;
    }

    public final long mySentSnapReleaseTimestamp() {
        return this.mySentSnapReleaseTimestamp;
    }

    public final Boolean notificationMuted() {
        return this.notificationMuted;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConversationState{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", clearedTimestamp=");
        stringBuilder.append(this.clearedTimestamp);
        stringBuilder.append(", myReceivedSnapReleaseTimestamp=");
        stringBuilder.append(this.myReceivedSnapReleaseTimestamp);
        stringBuilder.append(", mySentSnapReleaseTimestamp=");
        stringBuilder.append(this.mySentSnapReleaseTimestamp);
        stringBuilder.append(", notificationMuted=");
        stringBuilder.append(this.notificationMuted);
        stringBuilder.append(", cognacNotificationMuted=");
        stringBuilder.append(this.cognacNotificationMuted);
        stringBuilder.append(", messageRetentionInMinutes=");
        stringBuilder.append(this.messageRetentionInMinutes);
        stringBuilder.append(", isTemporaryGroup=");
        stringBuilder.append(this.isTemporaryGroup);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
