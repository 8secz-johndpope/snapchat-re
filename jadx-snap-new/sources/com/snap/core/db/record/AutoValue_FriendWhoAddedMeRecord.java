package com.snap.core.db.record;

final class AutoValue_FriendWhoAddedMeRecord extends FriendWhoAddedMeRecord {
    private final long _id;
    private final String addSource;
    private final boolean added;
    private final long friendRowId;
    private final boolean hasViewed;
    private final boolean ignored;
    private final String userId;

    AutoValue_FriendWhoAddedMeRecord(long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3) {
        this._id = j;
        this.friendRowId = j2;
        if (str != null) {
            this.userId = str;
            this.addSource = str2;
            this.added = z;
            this.ignored = z2;
            this.hasViewed = z3;
            return;
        }
        throw new NullPointerException("Null userId");
    }

    public final long _id() {
        return this._id;
    }

    public final String addSource() {
        return this.addSource;
    }

    public final boolean added() {
        return this.added;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendWhoAddedMeRecord) {
            FriendWhoAddedMeRecord friendWhoAddedMeRecord = (FriendWhoAddedMeRecord) obj;
            if (this._id == friendWhoAddedMeRecord._id() && this.friendRowId == friendWhoAddedMeRecord.friendRowId() && this.userId.equals(friendWhoAddedMeRecord.userId())) {
                String str = this.addSource;
                if (str != null ? !str.equals(friendWhoAddedMeRecord.addSource()) : friendWhoAddedMeRecord.addSource() != null) {
                    return this.added == friendWhoAddedMeRecord.added() && this.ignored == friendWhoAddedMeRecord.ignored() && this.hasViewed == friendWhoAddedMeRecord.hasViewed();
                }
            }
        }
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final boolean hasViewed() {
        return this.hasViewed;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.friendRowId;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.userId.hashCode()) * 1000003;
        String str = this.addSource;
        int i2 = 1231;
        i = (((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.added ? 1231 : 1237)) * 1000003) ^ (this.ignored ? 1231 : 1237)) * 1000003;
        if (!this.hasViewed) {
            i2 = 1237;
        }
        return i ^ i2;
    }

    public final boolean ignored() {
        return this.ignored;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendWhoAddedMeRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", addSource=");
        stringBuilder.append(this.addSource);
        stringBuilder.append(", added=");
        stringBuilder.append(this.added);
        stringBuilder.append(", ignored=");
        stringBuilder.append(this.ignored);
        stringBuilder.append(", hasViewed=");
        stringBuilder.append(this.hasViewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }
}
