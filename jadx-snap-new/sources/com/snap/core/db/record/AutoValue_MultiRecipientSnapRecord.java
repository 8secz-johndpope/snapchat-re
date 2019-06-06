package com.snap.core.db.record;

import com.snap.core.model.MessageRecipient;
import java.util.List;

final class AutoValue_MultiRecipientSnapRecord extends MultiRecipientSnapRecord {
    private final long _id;
    private final String displayInteractionType;
    private final String displayName;
    private final String key;
    private final Long lastInteractionTimestamp;
    private final List<MessageRecipient> recipients;

    AutoValue_MultiRecipientSnapRecord(long j, String str, String str2, String str3, Long l, List<MessageRecipient> list) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.displayName = str2;
            this.displayInteractionType = str3;
            this.lastInteractionTimestamp = l;
            this.recipients = list;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiRecipientSnapRecord) {
            MultiRecipientSnapRecord multiRecipientSnapRecord = (MultiRecipientSnapRecord) obj;
            if (this._id == multiRecipientSnapRecord._id() && this.key.equals(multiRecipientSnapRecord.key())) {
                String str = this.displayName;
                if (str != null ? !str.equals(multiRecipientSnapRecord.displayName()) : multiRecipientSnapRecord.displayName() != null) {
                    str = this.displayInteractionType;
                    if (str != null ? !str.equals(multiRecipientSnapRecord.displayInteractionType()) : multiRecipientSnapRecord.displayInteractionType() != null) {
                        Long l = this.lastInteractionTimestamp;
                        if (l != null ? !l.equals(multiRecipientSnapRecord.lastInteractionTimestamp()) : multiRecipientSnapRecord.lastInteractionTimestamp() != null) {
                            List list = this.recipients;
                            return list != null ? !list.equals(multiRecipientSnapRecord.recipients()) : multiRecipientSnapRecord.recipients() != null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.displayName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayInteractionType;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        List list = this.recipients;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final List<MessageRecipient> recipients() {
        return this.recipients;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiRecipientSnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", recipients=");
        stringBuilder.append(this.recipients);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
