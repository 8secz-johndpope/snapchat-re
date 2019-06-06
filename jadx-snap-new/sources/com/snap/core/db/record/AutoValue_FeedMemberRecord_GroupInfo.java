package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberRecord.GroupInfo;

final class AutoValue_FeedMemberRecord_GroupInfo extends GroupInfo {
    private final long _id;
    private final String key;

    AutoValue_FeedMemberRecord_GroupInfo(long j, String str) {
        this._id = j;
        if (str != null) {
            this.key = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupInfo) {
            GroupInfo groupInfo = (GroupInfo) obj;
            return this._id == groupInfo._id() && this.key.equals(groupInfo.key());
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.key.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupInfo{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
