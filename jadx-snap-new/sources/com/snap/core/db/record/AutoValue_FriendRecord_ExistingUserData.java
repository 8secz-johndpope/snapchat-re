package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendRecord.ExistingUserData;

final class AutoValue_FriendRecord_ExistingUserData extends ExistingUserData {
    private final long _id;
    private final String displayName;
    private final FriendLinkType friendLinkType;
    private final String userId;
    private final String username;

    AutoValue_FriendRecord_ExistingUserData(long j, String str, String str2, String str3, FriendLinkType friendLinkType) {
        this._id = j;
        this.displayName = str;
        this.userId = str2;
        if (str3 != null) {
            this.username = str3;
            this.friendLinkType = friendLinkType;
            return;
        }
        throw new NullPointerException("Null username");
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
        if (obj instanceof ExistingUserData) {
            ExistingUserData existingUserData = (ExistingUserData) obj;
            if (this._id == existingUserData._id()) {
                String str = this.displayName;
                if (str != null ? !str.equals(existingUserData.displayName()) : existingUserData.displayName() != null) {
                    str = this.userId;
                    if (str != null ? !str.equals(existingUserData.userId()) : existingUserData.userId() != null) {
                        if (this.username.equals(existingUserData.username())) {
                            FriendLinkType friendLinkType = this.friendLinkType;
                            return friendLinkType != null ? !friendLinkType.equals(existingUserData.friendLinkType()) : existingUserData.friendLinkType() != null;
                        }
                    }
                }
            }
        }
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.displayName;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.userId;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i2 = friendLinkType.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExistingUserData{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
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
