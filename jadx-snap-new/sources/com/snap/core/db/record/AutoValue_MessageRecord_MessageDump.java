package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.MessageDump;

final class AutoValue_MessageRecord_MessageDump extends MessageDump {
    private final long _id;
    private final MessageClientStatus clientStatus;
    private final String conversationKey;
    private final String key;
    private final boolean released;
    private final String senderUsername;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_MessageDump(String str, long j, String str2, long j2, String str3, MessageClientStatus messageClientStatus, Long l, String str4, boolean z) {
        this.conversationKey = str;
        this._id = j;
        if (str2 != null) {
            this.key = str2;
            this.timestamp = j2;
            this.senderUsername = str3;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l;
            this.type = str4;
            this.released = z;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final String conversationKey() {
        return this.conversationKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageDump) {
            MessageDump messageDump = (MessageDump) obj;
            String str = this.conversationKey;
            if (str != null ? !str.equals(messageDump.conversationKey()) : messageDump.conversationKey() != null) {
                if (this._id == messageDump._id() && this.key.equals(messageDump.key()) && this.timestamp == messageDump.timestamp()) {
                    str = this.senderUsername;
                    if (str != null ? !str.equals(messageDump.senderUsername()) : messageDump.senderUsername() != null) {
                        MessageClientStatus messageClientStatus = this.clientStatus;
                        if (messageClientStatus != null ? !messageClientStatus.equals(messageDump.clientStatus()) : messageDump.clientStatus() != null) {
                            Long l = this.sequenceNumber;
                            if (l != null ? !l.equals(messageDump.sequenceNumber()) : messageDump.sequenceNumber() != null) {
                                str = this.type;
                                if (str != null ? !str.equals(messageDump.type()) : messageDump.type() != null) {
                                    if (this.released == messageDump.released()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.conversationKey;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        long j = this._id;
        hashCode = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.key.hashCode()) * 1000003;
        j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.senderUsername;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        Long l = this.sequenceNumber;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.released ? 1231 : 1237);
    }

    public final String key() {
        return this.key;
    }

    public final boolean released() {
        return this.released;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageDump{conversationKey=");
        stringBuilder.append(this.conversationKey);
        stringBuilder.append(", _id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}
