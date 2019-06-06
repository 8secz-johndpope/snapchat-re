package com.snap.core.db.record;

final class AutoValue_LensStatisticsStorageRecord extends LensStatisticsStorageRecord {
    private final long _id;
    private final int impressionCount;
    private final String lensId;

    AutoValue_LensStatisticsStorageRecord(long j, String str, int i) {
        this._id = j;
        if (str != null) {
            this.lensId = str;
            this.impressionCount = i;
            return;
        }
        throw new NullPointerException("Null lensId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LensStatisticsStorageRecord) {
            LensStatisticsStorageRecord lensStatisticsStorageRecord = (LensStatisticsStorageRecord) obj;
            return this._id == lensStatisticsStorageRecord._id() && this.lensId.equals(lensStatisticsStorageRecord.lensId()) && this.impressionCount == lensStatisticsStorageRecord.impressionCount();
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.impressionCount ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.lensId.hashCode()) * 1000003);
    }

    public final int impressionCount() {
        return this.impressionCount;
    }

    public final String lensId() {
        return this.lensId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensStatisticsStorageRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", lensId=");
        stringBuilder.append(this.lensId);
        stringBuilder.append(", impressionCount=");
        stringBuilder.append(this.impressionCount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
