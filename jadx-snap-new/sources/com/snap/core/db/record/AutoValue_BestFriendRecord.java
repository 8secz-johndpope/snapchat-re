package com.snap.core.db.record;

final class AutoValue_BestFriendRecord extends BestFriendRecord {
    private final long _id;
    private final long friendRowId;

    AutoValue_BestFriendRecord(long j, long j2) {
        this._id = j;
        this.friendRowId = j2;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BestFriendRecord) {
            BestFriendRecord bestFriendRecord = (BestFriendRecord) obj;
            return this._id == bestFriendRecord._id() && this.friendRowId == bestFriendRecord.friendRowId();
        }
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.friendRowId;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BestFriendRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
