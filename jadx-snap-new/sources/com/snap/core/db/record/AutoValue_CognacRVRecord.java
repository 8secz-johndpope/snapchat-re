package com.snap.core.db.record;

final class AutoValue_CognacRVRecord extends CognacRVRecord {
    private final long _id;
    private final String appId;
    private final String payload;
    private final String requestId;
    private final String slotId;
    private final long timestamp;

    AutoValue_CognacRVRecord(long j, String str, String str2, String str3, long j2, String str4) {
        this._id = j;
        if (str != null) {
            this.requestId = str;
            if (str2 != null) {
                this.appId = str2;
                if (str3 != null) {
                    this.slotId = str3;
                    this.timestamp = j2;
                    this.payload = str4;
                    return;
                }
                throw new NullPointerException("Null slotId");
            }
            throw new NullPointerException("Null appId");
        }
        throw new NullPointerException("Null requestId");
    }

    public final long _id() {
        return this._id;
    }

    public final String appId() {
        return this.appId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CognacRVRecord) {
            CognacRVRecord cognacRVRecord = (CognacRVRecord) obj;
            if (this._id == cognacRVRecord._id() && this.requestId.equals(cognacRVRecord.requestId()) && this.appId.equals(cognacRVRecord.appId()) && this.slotId.equals(cognacRVRecord.slotId()) && this.timestamp == cognacRVRecord.timestamp()) {
                String str = this.payload;
                return str != null ? !str.equals(cognacRVRecord.payload()) : cognacRVRecord.payload() != null;
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.requestId.hashCode()) * 1000003) ^ this.appId.hashCode()) * 1000003) ^ this.slotId.hashCode()) * 1000003;
        long j2 = this.timestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.payload;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public final String payload() {
        return this.payload;
    }

    public final String requestId() {
        return this.requestId;
    }

    public final String slotId() {
        return this.slotId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CognacRVRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", requestId=");
        stringBuilder.append(this.requestId);
        stringBuilder.append(", appId=");
        stringBuilder.append(this.appId);
        stringBuilder.append(", slotId=");
        stringBuilder.append(this.slotId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.payload);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
