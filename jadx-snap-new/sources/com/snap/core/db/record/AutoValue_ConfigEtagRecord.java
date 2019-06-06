package com.snap.core.db.record;

final class AutoValue_ConfigEtagRecord extends ConfigEtagRecord {
    private final long _id;
    private final String etag;

    AutoValue_ConfigEtagRecord(long j, String str) {
        this._id = j;
        if (str != null) {
            this.etag = str;
            return;
        }
        throw new NullPointerException("Null etag");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigEtagRecord) {
            ConfigEtagRecord configEtagRecord = (ConfigEtagRecord) obj;
            return this._id == configEtagRecord._id() && this.etag.equals(configEtagRecord.etag());
        }
    }

    public final String etag() {
        return this.etag;
    }

    public final int hashCode() {
        long j = this._id;
        return this.etag.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConfigEtagRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", etag=");
        stringBuilder.append(this.etag);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
