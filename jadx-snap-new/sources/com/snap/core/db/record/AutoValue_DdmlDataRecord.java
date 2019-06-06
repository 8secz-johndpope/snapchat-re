package com.snap.core.db.record;

import com.snap.core.db.column.DdmlRecord;

final class AutoValue_DdmlDataRecord extends DdmlDataRecord {
    private final long _id;
    private final String dataId;
    private final DdmlRecord record;
    private final long timestamp;

    AutoValue_DdmlDataRecord(long j, String str, DdmlRecord ddmlRecord, long j2) {
        this._id = j;
        this.dataId = str;
        this.record = ddmlRecord;
        this.timestamp = j2;
    }

    public final long _id() {
        return this._id;
    }

    public final String dataId() {
        return this.dataId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DdmlDataRecord) {
            DdmlDataRecord ddmlDataRecord = (DdmlDataRecord) obj;
            if (this._id == ddmlDataRecord._id()) {
                String str = this.dataId;
                if (str != null ? !str.equals(ddmlDataRecord.dataId()) : ddmlDataRecord.dataId() != null) {
                    DdmlRecord ddmlRecord = this.record;
                    if (ddmlRecord != null ? !ddmlRecord.equals(ddmlDataRecord.record()) : ddmlDataRecord.record() != null) {
                        if (this.timestamp == ddmlDataRecord.timestamp()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.dataId;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        DdmlRecord ddmlRecord = this.record;
        if (ddmlRecord != null) {
            i2 = ddmlRecord.hashCode();
        }
        i = (i ^ i2) * 1000003;
        long j2 = this.timestamp;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final DdmlRecord record() {
        return this.record;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DdmlDataRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", dataId=");
        stringBuilder.append(this.dataId);
        stringBuilder.append(", record=");
        stringBuilder.append(this.record);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
