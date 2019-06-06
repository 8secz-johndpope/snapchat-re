package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.RowIdAndViewedRecord;

final class AutoValue_StorySnapRecord_RowIdAndViewedRecord extends RowIdAndViewedRecord {
    private final long _id;
    private final Boolean viewed;

    AutoValue_StorySnapRecord_RowIdAndViewedRecord(long j, Boolean bool) {
        this._id = j;
        this.viewed = bool;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RowIdAndViewedRecord) {
            RowIdAndViewedRecord rowIdAndViewedRecord = (RowIdAndViewedRecord) obj;
            if (this._id == rowIdAndViewedRecord._id()) {
                Boolean bool = this.viewed;
                return bool != null ? !bool.equals(rowIdAndViewedRecord.viewed()) : rowIdAndViewedRecord.viewed() != null;
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Boolean bool = this.viewed;
        return (bool == null ? 0 : bool.hashCode()) ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RowIdAndViewedRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Boolean viewed() {
        return this.viewed;
    }
}
