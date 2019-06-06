package com.snap.core.db.record;

import com.snap.core.db.column.UpdateStatus;

final class AutoValue_PendingSnapRecord extends PendingSnapRecord {
    private final long _id;
    private final long feedRowId;
    private final String snapId;
    private final long timestamp;
    private final UpdateStatus updateStatus;

    AutoValue_PendingSnapRecord(long j, long j2, String str, long j3, UpdateStatus updateStatus) {
        this._id = j;
        this.feedRowId = j2;
        if (str != null) {
            this.snapId = str;
            this.timestamp = j3;
            if (updateStatus != null) {
                this.updateStatus = updateStatus;
                return;
            }
            throw new NullPointerException("Null updateStatus");
        }
        throw new NullPointerException("Null snapId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PendingSnapRecord) {
            PendingSnapRecord pendingSnapRecord = (PendingSnapRecord) obj;
            return this._id == pendingSnapRecord._id() && this.feedRowId == pendingSnapRecord.feedRowId() && this.snapId.equals(pendingSnapRecord.snapId()) && this.timestamp == pendingSnapRecord.timestamp() && this.updateStatus.equals(pendingSnapRecord.updateStatus());
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.feedRowId;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        j2 = this.timestamp;
        return this.updateStatus.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PendingSnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", updateStatus=");
        stringBuilder.append(this.updateStatus);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final UpdateStatus updateStatus() {
        return this.updateStatus;
    }
}
