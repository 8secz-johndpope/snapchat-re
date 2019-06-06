package com.snap.core.db.record;

import defpackage.adsy;

final class AutoValue_DdmlModelRecord extends DdmlModelRecord {
    private final long _id;
    private final String applicationId;
    private final String modelId;
    private final adsy modelSpecAndParams;
    private final long timestamp;

    AutoValue_DdmlModelRecord(long j, String str, String str2, adsy adsy, long j2) {
        this._id = j;
        if (str != null) {
            this.applicationId = str;
            if (str2 != null) {
                this.modelId = str2;
                if (adsy != null) {
                    this.modelSpecAndParams = adsy;
                    this.timestamp = j2;
                    return;
                }
                throw new NullPointerException("Null modelSpecAndParams");
            }
            throw new NullPointerException("Null modelId");
        }
        throw new NullPointerException("Null applicationId");
    }

    public final long _id() {
        return this._id;
    }

    public final String applicationId() {
        return this.applicationId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DdmlModelRecord) {
            DdmlModelRecord ddmlModelRecord = (DdmlModelRecord) obj;
            return this._id == ddmlModelRecord._id() && this.applicationId.equals(ddmlModelRecord.applicationId()) && this.modelId.equals(ddmlModelRecord.modelId()) && this.modelSpecAndParams.equals(ddmlModelRecord.modelSpecAndParams()) && this.timestamp == ddmlModelRecord.timestamp();
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.applicationId.hashCode()) * 1000003) ^ this.modelId.hashCode()) * 1000003) ^ this.modelSpecAndParams.hashCode()) * 1000003;
        long j2 = this.timestamp;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final String modelId() {
        return this.modelId;
    }

    public final adsy modelSpecAndParams() {
        return this.modelSpecAndParams;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DdmlModelRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", applicationId=");
        stringBuilder.append(this.applicationId);
        stringBuilder.append(", modelId=");
        stringBuilder.append(this.modelId);
        stringBuilder.append(", modelSpecAndParams=");
        stringBuilder.append(this.modelSpecAndParams);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
