package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastSentViewedChat;

final class AutoValue_MessageRecord_LastSentViewedChat extends LastSentViewedChat {
    private final MessageClientStatus clientStatus;
    private final Long feedRowId;
    private final String key;
    private final Long lastInteractionTimestamp;
    private final Long senderId;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastSentViewedChat(Long l, String str, Long l2, String str2, long j, Long l3, MessageClientStatus messageClientStatus, Long l4) {
        this.feedRowId = l;
        if (str != null) {
            this.key = str;
            this.senderId = l2;
            this.type = str2;
            this.timestamp = j;
            this.lastInteractionTimestamp = l3;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l4;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastSentViewedChat) {
            LastSentViewedChat lastSentViewedChat = (LastSentViewedChat) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastSentViewedChat.feedRowId()) : lastSentViewedChat.feedRowId() != null) {
                if (this.key.equals(lastSentViewedChat.key())) {
                    l = this.senderId;
                    if (l != null ? !l.equals(lastSentViewedChat.senderId()) : lastSentViewedChat.senderId() != null) {
                        String str = this.type;
                        if (str != null ? !str.equals(lastSentViewedChat.type()) : lastSentViewedChat.type() != null) {
                            if (this.timestamp == lastSentViewedChat.timestamp()) {
                                l = this.lastInteractionTimestamp;
                                if (l != null ? !l.equals(lastSentViewedChat.lastInteractionTimestamp()) : lastSentViewedChat.lastInteractionTimestamp() != null) {
                                    MessageClientStatus messageClientStatus = this.clientStatus;
                                    if (messageClientStatus != null ? !messageClientStatus.equals(lastSentViewedChat.clientStatus()) : lastSentViewedChat.clientStatus() != null) {
                                        l = this.sequenceNumber;
                                        return l != null ? !l.equals(lastSentViewedChat.sequenceNumber()) : lastSentViewedChat.sequenceNumber() != null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        Long l = this.feedRowId;
        int i = 0;
        int hashCode = ((((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        Long l2 = this.senderId;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str = this.type;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        l2 = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        Long l3 = this.sequenceNumber;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LastSentViewedChat{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}
