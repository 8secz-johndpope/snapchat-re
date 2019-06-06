package com.snap.core.db.record;

final class AutoValue_StorySyncStateRecord extends StorySyncStateRecord {
    private final long _id;
    private final String checksum;
    private final String metadata;

    AutoValue_StorySyncStateRecord(long j, String str, String str2) {
        this._id = j;
        this.checksum = str;
        this.metadata = str2;
    }

    public final long _id() {
        return this._id;
    }

    public final String checksum() {
        return this.checksum;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorySyncStateRecord) {
            StorySyncStateRecord storySyncStateRecord = (StorySyncStateRecord) obj;
            if (this._id == storySyncStateRecord._id()) {
                String str = this.checksum;
                if (str != null ? !str.equals(storySyncStateRecord.checksum()) : storySyncStateRecord.checksum() != null) {
                    str = this.metadata;
                    return str != null ? !str.equals(storySyncStateRecord.metadata()) : storySyncStateRecord.metadata() != null;
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.checksum;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.metadata;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i ^ i2;
    }

    public final String metadata() {
        return this.metadata;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySyncStateRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", checksum=");
        stringBuilder.append(this.checksum);
        stringBuilder.append(", metadata=");
        stringBuilder.append(this.metadata);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
