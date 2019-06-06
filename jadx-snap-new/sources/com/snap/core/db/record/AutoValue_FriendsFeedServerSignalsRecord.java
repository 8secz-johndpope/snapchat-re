package com.snap.core.db.record;

final class AutoValue_FriendsFeedServerSignalsRecord extends FriendsFeedServerSignalsRecord {
    private final long _id;
    private final long feedRowId;
    private final String serverSignals;

    AutoValue_FriendsFeedServerSignalsRecord(long j, long j2, String str) {
        this._id = j;
        this.feedRowId = j2;
        this.serverSignals = str;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendsFeedServerSignalsRecord) {
            FriendsFeedServerSignalsRecord friendsFeedServerSignalsRecord = (FriendsFeedServerSignalsRecord) obj;
            if (this._id == friendsFeedServerSignalsRecord._id() && this.feedRowId == friendsFeedServerSignalsRecord.feedRowId()) {
                String str = this.serverSignals;
                return str != null ? !str.equals(friendsFeedServerSignalsRecord.serverSignals()) : friendsFeedServerSignalsRecord.serverSignals() != null;
            }
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.feedRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.serverSignals;
        return (str == null ? 0 : str.hashCode()) ^ i;
    }

    public final String serverSignals() {
        return this.serverSignals;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsFeedServerSignalsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", serverSignals=");
        stringBuilder.append(this.serverSignals);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
