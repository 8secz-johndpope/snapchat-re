package com.snap.core.db.record;

final class AutoValue_CognacLocalStorageRecord extends CognacLocalStorageRecord {
    private final long _id;
    private final String appId;
    private final String key;
    private final String value;

    AutoValue_CognacLocalStorageRecord(long j, String str, String str2, String str3) {
        this._id = j;
        if (str != null) {
            this.appId = str;
            if (str2 != null) {
                this.key = str2;
                if (str3 != null) {
                    this.value = str3;
                    return;
                }
                throw new NullPointerException("Null value");
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null appId");
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
        if (obj instanceof CognacLocalStorageRecord) {
            CognacLocalStorageRecord cognacLocalStorageRecord = (CognacLocalStorageRecord) obj;
            return this._id == cognacLocalStorageRecord._id() && this.appId.equals(cognacLocalStorageRecord.appId()) && this.key.equals(cognacLocalStorageRecord.key()) && this.value.equals(cognacLocalStorageRecord.value());
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.value.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.appId.hashCode()) * 1000003) ^ this.key.hashCode()) * 1000003);
    }

    public final String key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CognacLocalStorageRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", appId=");
        stringBuilder.append(this.appId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String value() {
        return this.value;
    }
}
