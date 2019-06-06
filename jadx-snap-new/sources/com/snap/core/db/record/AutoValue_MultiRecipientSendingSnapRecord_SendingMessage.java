package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MultiRecipientSendingSnapRecord.SendingMessage;

final class AutoValue_MultiRecipientSendingSnapRecord_SendingMessage extends SendingMessage {
    private final long _id;
    private final MessageClientStatus clientStatus;
    private final String feedDisplayName;
    private final String messageId;
    private final String recipientsList;
    private final long timestamp;

    AutoValue_MultiRecipientSendingSnapRecord_SendingMessage(long j, String str, String str2, String str3, MessageClientStatus messageClientStatus, long j2) {
        this._id = j;
        if (str != null) {
            this.recipientsList = str;
            if (str2 != null) {
                this.feedDisplayName = str2;
                if (str3 != null) {
                    this.messageId = str3;
                    if (messageClientStatus != null) {
                        this.clientStatus = messageClientStatus;
                        this.timestamp = j2;
                        return;
                    }
                    throw new NullPointerException("Null clientStatus");
                }
                throw new NullPointerException("Null messageId");
            }
            throw new NullPointerException("Null feedDisplayName");
        }
        throw new NullPointerException("Null recipientsList");
    }

    public final long _id() {
        return this._id;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendingMessage) {
            SendingMessage sendingMessage = (SendingMessage) obj;
            return this._id == sendingMessage._id() && this.recipientsList.equals(sendingMessage.recipientsList()) && this.feedDisplayName.equals(sendingMessage.feedDisplayName()) && this.messageId.equals(sendingMessage.messageId()) && this.clientStatus.equals(sendingMessage.clientStatus()) && this.timestamp == sendingMessage.timestamp();
        }
    }

    public final String feedDisplayName() {
        return this.feedDisplayName;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.recipientsList.hashCode()) * 1000003) ^ this.feedDisplayName.hashCode()) * 1000003) ^ this.messageId.hashCode()) * 1000003) ^ this.clientStatus.hashCode()) * 1000003;
        long j2 = this.timestamp;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final String messageId() {
        return this.messageId;
    }

    public final String recipientsList() {
        return this.recipientsList;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SendingMessage{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", recipientsList=");
        stringBuilder.append(this.recipientsList);
        stringBuilder.append(", feedDisplayName=");
        stringBuilder.append(this.feedDisplayName);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
