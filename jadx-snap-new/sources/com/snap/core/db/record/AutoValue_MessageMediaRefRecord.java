package com.snap.core.db.record;

final class AutoValue_MessageMediaRefRecord extends MessageMediaRefRecord {
    private final long _id;
    private final long mediaType;
    private final String messageId;
    private final String uri;

    AutoValue_MessageMediaRefRecord(long j, String str, long j2, String str2) {
        this._id = j;
        if (str != null) {
            this.messageId = str;
            this.mediaType = j2;
            if (str2 != null) {
                this.uri = str2;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null messageId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageMediaRefRecord) {
            MessageMediaRefRecord messageMediaRefRecord = (MessageMediaRefRecord) obj;
            return this._id == messageMediaRefRecord._id() && this.messageId.equals(messageMediaRefRecord.messageId()) && this.mediaType == messageMediaRefRecord.mediaType() && this.uri.equals(messageMediaRefRecord.uri());
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.messageId.hashCode()) * 1000003;
        long j2 = this.mediaType;
        return this.uri.hashCode() ^ ((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final long mediaType() {
        return this.mediaType;
    }

    public final String messageId() {
        return this.messageId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageMediaRefRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", mediaType=");
        stringBuilder.append(this.mediaType);
        stringBuilder.append(", uri=");
        stringBuilder.append(this.uri);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String uri() {
        return this.uri;
    }
}
