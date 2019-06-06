package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastReceivedViewedChat;

final class AutoValue_MessageRecord_LastReceivedViewedChat extends LastReceivedViewedChat {
    private final MessageClientStatus clientStatus;
    private final Long feedRowId;
    private final String key;
    private final Long senderId;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastReceivedViewedChat(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3) {
        this.feedRowId = l;
        if (str != null) {
            this.key = str;
            this.senderId = l2;
            this.type = str2;
            this.timestamp = j;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l3;
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
        if (obj instanceof LastReceivedViewedChat) {
            LastReceivedViewedChat lastReceivedViewedChat = (LastReceivedViewedChat) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastReceivedViewedChat.feedRowId()) : lastReceivedViewedChat.feedRowId() != null) {
                if (this.key.equals(lastReceivedViewedChat.key())) {
                    l = this.senderId;
                    if (l != null ? !l.equals(lastReceivedViewedChat.senderId()) : lastReceivedViewedChat.senderId() != null) {
                        String str = this.type;
                        if (str != null ? !str.equals(lastReceivedViewedChat.type()) : lastReceivedViewedChat.type() != null) {
                            if (this.timestamp == lastReceivedViewedChat.timestamp()) {
                                MessageClientStatus messageClientStatus = this.clientStatus;
                                if (messageClientStatus != null ? !messageClientStatus.equals(lastReceivedViewedChat.clientStatus()) : lastReceivedViewedChat.clientStatus() != null) {
                                    l = this.sequenceNumber;
                                    return l != null ? !l.equals(lastReceivedViewedChat.sequenceNumber()) : lastReceivedViewedChat.sequenceNumber() != null;
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
        StringBuilder stringBuilder = new StringBuilder("LastReceivedViewedChat{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
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
