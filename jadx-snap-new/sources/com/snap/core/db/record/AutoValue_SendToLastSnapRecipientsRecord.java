package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;

final class AutoValue_SendToLastSnapRecipientsRecord extends SendToLastSnapRecipientsRecord {
    private final long _id;
    private final FeedKind feedKind;
    private final String key;
    private final Long selectionTimestamp;

    AutoValue_SendToLastSnapRecipientsRecord(long j, String str, FeedKind feedKind, Long l) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.feedKind = feedKind;
            this.selectionTimestamp = l;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendToLastSnapRecipientsRecord) {
            SendToLastSnapRecipientsRecord sendToLastSnapRecipientsRecord = (SendToLastSnapRecipientsRecord) obj;
            if (this._id == sendToLastSnapRecipientsRecord._id() && this.key.equals(sendToLastSnapRecipientsRecord.key())) {
                FeedKind feedKind = this.feedKind;
                if (feedKind != null ? !feedKind.equals(sendToLastSnapRecipientsRecord.feedKind()) : sendToLastSnapRecipientsRecord.feedKind() != null) {
                    Long l = this.selectionTimestamp;
                    return l != null ? !l.equals(sendToLastSnapRecipientsRecord.selectionTimestamp()) : sendToLastSnapRecipientsRecord.selectionTimestamp() != null;
                }
            }
        }
    }

    public final FeedKind feedKind() {
        return this.feedKind;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        FeedKind feedKind = this.feedKind;
        int i = 0;
        hashCode = (hashCode ^ (feedKind == null ? 0 : feedKind.hashCode())) * 1000003;
        Long l = this.selectionTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final Long selectionTimestamp() {
        return this.selectionTimestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SendToLastSnapRecipientsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", feedKind=");
        stringBuilder.append(this.feedKind);
        stringBuilder.append(", selectionTimestamp=");
        stringBuilder.append(this.selectionTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
