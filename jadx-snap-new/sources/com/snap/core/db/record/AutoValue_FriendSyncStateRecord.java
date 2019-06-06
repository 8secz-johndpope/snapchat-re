package com.snap.core.db.record;

final class AutoValue_FriendSyncStateRecord extends FriendSyncStateRecord {
    private final long _id;
    private final String token;

    AutoValue_FriendSyncStateRecord(long j, String str) {
        this._id = j;
        this.token = str;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendSyncStateRecord) {
            FriendSyncStateRecord friendSyncStateRecord = (FriendSyncStateRecord) obj;
            if (this._id == friendSyncStateRecord._id()) {
                String str = this.token;
                return str != null ? !str.equals(friendSyncStateRecord.token()) : friendSyncStateRecord.token() != null;
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.token;
        return (str == null ? 0 : str.hashCode()) ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendSyncStateRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", token=");
        stringBuilder.append(this.token);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String token() {
        return this.token;
    }
}
