package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.DisplayInfo;

final class AutoValue_FriendRecord_DisplayInfo extends DisplayInfo {
    private final long _id;
    private final Long addedTimestamp;
    private final String displayName;
    private final Long reverseAddedTimestamp;
    private final String userId;
    private final String username;

    AutoValue_FriendRecord_DisplayInfo(long j, String str, String str2, String str3, Long l, Long l2) {
        this._id = j;
        this.userId = str;
        if (str2 != null) {
            this.username = str2;
            this.displayName = str3;
            this.addedTimestamp = l;
            this.reverseAddedTimestamp = l2;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final long _id() {
        return this._id;
    }

    public final Long addedTimestamp() {
        return this.addedTimestamp;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DisplayInfo) {
            DisplayInfo displayInfo = (DisplayInfo) obj;
            if (this._id == displayInfo._id()) {
                String str = this.userId;
                if (str != null ? !str.equals(displayInfo.userId()) : displayInfo.userId() != null) {
                    if (this.username.equals(displayInfo.username())) {
                        str = this.displayName;
                        if (str != null ? !str.equals(displayInfo.displayName()) : displayInfo.displayName() != null) {
                            Long l = this.addedTimestamp;
                            if (l != null ? !l.equals(displayInfo.addedTimestamp()) : displayInfo.addedTimestamp() != null) {
                                l = this.reverseAddedTimestamp;
                                return l != null ? !l.equals(displayInfo.reverseAddedTimestamp()) : displayInfo.reverseAddedTimestamp() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.userId;
        int i2 = 0;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        str = this.displayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.addedTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.reverseAddedTimestamp;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final Long reverseAddedTimestamp() {
        return this.reverseAddedTimestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisplayInfo{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", addedTimestamp=");
        stringBuilder.append(this.addedTimestamp);
        stringBuilder.append(", reverseAddedTimestamp=");
        stringBuilder.append(this.reverseAddedTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }

    public final String username() {
        return this.username;
    }
}
