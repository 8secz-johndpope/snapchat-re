package com.snap.core.db.record;

import com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessage;

final class AutoValue_NetworkMessageRecord_UnreleasedMessage extends UnreleasedMessage {
    private final Long lastInteractionTimestamp;
    private final String messageId;
    private final String messageType;
    private final long senderId;
    private final Long sequenceNumber;

    AutoValue_NetworkMessageRecord_UnreleasedMessage(String str, long j, Long l, Long l2, String str2) {
        if (str != null) {
            this.messageId = str;
            this.senderId = j;
            this.sequenceNumber = l;
            this.lastInteractionTimestamp = l2;
            if (str2 != null) {
                this.messageType = str2;
                return;
            }
            throw new NullPointerException("Null messageType");
        }
        throw new NullPointerException("Null messageId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UnreleasedMessage) {
            UnreleasedMessage unreleasedMessage = (UnreleasedMessage) obj;
            if (this.messageId.equals(unreleasedMessage.messageId()) && this.senderId == unreleasedMessage.senderId()) {
                Long l = this.sequenceNumber;
                if (l != null ? !l.equals(unreleasedMessage.sequenceNumber()) : unreleasedMessage.sequenceNumber() != null) {
                    l = this.lastInteractionTimestamp;
                    if (l != null ? !l.equals(unreleasedMessage.lastInteractionTimestamp()) : unreleasedMessage.lastInteractionTimestamp() != null) {
                        if (this.messageType.equals(unreleasedMessage.messageType())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.messageId.hashCode() ^ 1000003) * 1000003;
        long j = this.senderId;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.sequenceNumber;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastInteractionTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.messageType.hashCode();
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final String messageId() {
        return this.messageId;
    }

    public final String messageType() {
        return this.messageType;
    }

    public final long senderId() {
        return this.senderId;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnreleasedMessage{messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.messageType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
