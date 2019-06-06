package com.snap.core.db.record;

import com.snap.core.db.record.NetworkMessageRecord.UnreleasedMessagesWithType;

final class AutoValue_NetworkMessageRecord_UnreleasedMessagesWithType extends UnreleasedMessagesWithType {
    private final String messageId;
    private final String messageType;

    AutoValue_NetworkMessageRecord_UnreleasedMessagesWithType(String str, String str2) {
        if (str != null) {
            this.messageId = str;
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
        if (obj instanceof UnreleasedMessagesWithType) {
            UnreleasedMessagesWithType unreleasedMessagesWithType = (UnreleasedMessagesWithType) obj;
            return this.messageId.equals(unreleasedMessagesWithType.messageId()) && this.messageType.equals(unreleasedMessagesWithType.messageType());
        }
    }

    public final int hashCode() {
        return ((this.messageId.hashCode() ^ 1000003) * 1000003) ^ this.messageType.hashCode();
    }

    public final String messageId() {
        return this.messageId;
    }

    public final String messageType() {
        return this.messageType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnreleasedMessagesWithType{messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.messageType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
