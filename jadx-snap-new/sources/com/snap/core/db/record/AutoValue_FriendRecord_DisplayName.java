package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.DisplayName;

final class AutoValue_FriendRecord_DisplayName extends DisplayName {
    private final long _id;
    private final String displayName;

    AutoValue_FriendRecord_DisplayName(long j, String str) {
        this._id = j;
        this.displayName = str;
    }

    public final long _id() {
        return this._id;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DisplayName) {
            DisplayName displayName = (DisplayName) obj;
            if (this._id == displayName._id()) {
                String str = this.displayName;
                return str != null ? !str.equals(displayName.displayName()) : displayName.displayName() != null;
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.displayName;
        return (str == null ? 0 : str.hashCode()) ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisplayName{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
