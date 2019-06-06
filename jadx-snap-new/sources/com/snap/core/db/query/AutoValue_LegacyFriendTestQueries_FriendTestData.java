package com.snap.core.db.query;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LegacyFriendTestQueries.FriendTestData;

final class AutoValue_LegacyFriendTestQueries_FriendTestData extends FriendTestData {
    private final long _id;
    private final FriendLinkType friendLinkType;
    private final String userId;
    private final String username;

    AutoValue_LegacyFriendTestQueries_FriendTestData(String str, String str2, long j, FriendLinkType friendLinkType) {
        this.userId = str;
        if (str2 != null) {
            this.username = str2;
            this._id = j;
            this.friendLinkType = friendLinkType;
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
        if (obj instanceof FriendTestData) {
            FriendTestData friendTestData = (FriendTestData) obj;
            String str = this.userId;
            if (str != null ? !str.equals(friendTestData.userId()) : friendTestData.userId() != null) {
                if (this.username.equals(friendTestData.username()) && this._id == friendTestData._id()) {
                    FriendLinkType friendLinkType = this.friendLinkType;
                    return friendLinkType != null ? !friendLinkType.equals(friendTestData.friendLinkType()) : friendTestData.friendLinkType() != null;
                }
            }
        }
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.username.hashCode()) * 1000003;
        long j = this._id;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i = friendLinkType.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendTestData{userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", _id=");
        stringBuilder.append(this._id);
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
