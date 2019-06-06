package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastMessageWithClientStatus;

final class AutoValue_MessageRecord_LastMessageWithClientStatus extends LastMessageWithClientStatus {
    private final Long Message_senderId;
    private final String chatMessageId;
    private final MessageClientStatus clientStatus;
    private final Long feedRowId;
    private final Long senderId;
    private final String snapId;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastMessageWithClientStatus(Long l, Long l2, String str, String str2, String str3, Long l3, MessageClientStatus messageClientStatus, long j) {
        this.feedRowId = l;
        this.senderId = l2;
        if (str != null) {
            this.chatMessageId = str;
            this.snapId = str2;
            this.type = str3;
            this.Message_senderId = l3;
            this.clientStatus = messageClientStatus;
            this.timestamp = j;
            return;
        }
        throw new NullPointerException("Null chatMessageId");
    }

    public final Long Message_senderId() {
        return this.Message_senderId;
    }

    public final String chatMessageId() {
        return this.chatMessageId;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastMessageWithClientStatus) {
            LastMessageWithClientStatus lastMessageWithClientStatus = (LastMessageWithClientStatus) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastMessageWithClientStatus.feedRowId()) : lastMessageWithClientStatus.feedRowId() != null) {
                l = this.senderId;
                if (l != null ? !l.equals(lastMessageWithClientStatus.senderId()) : lastMessageWithClientStatus.senderId() != null) {
                    if (this.chatMessageId.equals(lastMessageWithClientStatus.chatMessageId())) {
                        String str = this.snapId;
                        if (str != null ? !str.equals(lastMessageWithClientStatus.snapId()) : lastMessageWithClientStatus.snapId() != null) {
                            str = this.type;
                            if (str != null ? !str.equals(lastMessageWithClientStatus.type()) : lastMessageWithClientStatus.type() != null) {
                                l = this.Message_senderId;
                                if (l != null ? !l.equals(lastMessageWithClientStatus.Message_senderId()) : lastMessageWithClientStatus.Message_senderId() != null) {
                                    MessageClientStatus messageClientStatus = this.clientStatus;
                                    if (messageClientStatus != null ? !messageClientStatus.equals(lastMessageWithClientStatus.clientStatus()) : lastMessageWithClientStatus.clientStatus() != null) {
                                        if (this.timestamp == lastMessageWithClientStatus.timestamp()) {
                                            return true;
                                        }
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

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        Long l = this.feedRowId;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.senderId;
        hashCode = (((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ this.chatMessageId.hashCode()) * 1000003;
        String str = this.snapId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.type;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l2 = this.Message_senderId;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        if (messageClientStatus != null) {
            i = messageClientStatus.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        long j = this.timestamp;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LastMessageWithClientStatus{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", chatMessageId=");
        stringBuilder.append(this.chatMessageId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", Message_senderId=");
        stringBuilder.append(this.Message_senderId);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}
