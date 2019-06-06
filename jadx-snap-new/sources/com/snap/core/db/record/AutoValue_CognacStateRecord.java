package com.snap.core.db.record;

final class AutoValue_CognacStateRecord extends CognacStateRecord {
    private final long _id;
    private final String conversationId;
    private final long lastInteractionTimestamp;

    AutoValue_CognacStateRecord(long j, String str, long j2) {
        this._id = j;
        if (str != null) {
            this.conversationId = str;
            this.lastInteractionTimestamp = j2;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final long _id() {
        return this._id;
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CognacStateRecord) {
            CognacStateRecord cognacStateRecord = (CognacStateRecord) obj;
            return this._id == cognacStateRecord._id() && this.conversationId.equals(cognacStateRecord.conversationId()) && this.lastInteractionTimestamp == cognacStateRecord.lastInteractionTimestamp();
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.conversationId.hashCode()) * 1000003;
        long j2 = this.lastInteractionTimestamp;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CognacStateRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
