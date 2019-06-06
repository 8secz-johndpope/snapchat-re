package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.FriendId;

final class AutoValue_FriendRecord_FriendId extends FriendId {
    private final long _id;
    private final String username;

    AutoValue_FriendRecord_FriendId(long j, String str) {
        this._id = j;
        if (str != null) {
            this.username = str;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendId) {
            FriendId friendId = (FriendId) obj;
            return this._id == friendId._id() && this.username.equals(friendId.username());
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.username.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendId{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}
