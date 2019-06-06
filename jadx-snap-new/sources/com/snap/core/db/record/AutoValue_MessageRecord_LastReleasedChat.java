package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastReleasedChat;

final class AutoValue_MessageRecord_LastReleasedChat extends LastReleasedChat {
    private final MessageClientStatus clientStatus;
    private final String key;
    private final Long senderId;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastReleasedChat(String str, Long l, String str2, long j, MessageClientStatus messageClientStatus, Long l2) {
        if (str != null) {
            this.key = str;
            this.senderId = l;
            this.type = str2;
            this.timestamp = j;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l2;
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
        if (obj instanceof LastReleasedChat) {
            LastReleasedChat lastReleasedChat = (LastReleasedChat) obj;
            if (this.key.equals(lastReleasedChat.key())) {
                Long l = this.senderId;
                if (l != null ? !l.equals(lastReleasedChat.senderId()) : lastReleasedChat.senderId() != null) {
                    String str = this.type;
                    if (str != null ? !str.equals(lastReleasedChat.type()) : lastReleasedChat.type() != null) {
                        if (this.timestamp == lastReleasedChat.timestamp()) {
                            MessageClientStatus messageClientStatus = this.clientStatus;
                            if (messageClientStatus != null ? !messageClientStatus.equals(lastReleasedChat.clientStatus()) : lastReleasedChat.clientStatus() != null) {
                                l = this.sequenceNumber;
                                return l != null ? !l.equals(lastReleasedChat.sequenceNumber()) : lastReleasedChat.sequenceNumber() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        Long l = this.senderId;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.type;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        Long l2 = this.sequenceNumber;
        if (l2 != null) {
            i = l2.hashCode();
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
        StringBuilder stringBuilder = new StringBuilder("LastReleasedChat{key=");
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
