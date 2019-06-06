package com.snap.core.db.record;

final class AutoValue_FeedItemSyncStateRecord extends FeedItemSyncStateRecord {
    private final long _id;
    private final long feedRowId;

    AutoValue_FeedItemSyncStateRecord(long j, long j2) {
        this._id = j;
        this.feedRowId = j2;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeedItemSyncStateRecord) {
            FeedItemSyncStateRecord feedItemSyncStateRecord = (FeedItemSyncStateRecord) obj;
            return this._id == feedItemSyncStateRecord._id() && this.feedRowId == feedItemSyncStateRecord.feedRowId();
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.feedRowId;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedItemSyncStateRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
