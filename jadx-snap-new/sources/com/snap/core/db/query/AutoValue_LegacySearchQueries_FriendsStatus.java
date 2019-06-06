package com.snap.core.db.query;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LegacySearchQueries.FriendsStatus;

final class AutoValue_LegacySearchQueries_FriendsStatus extends FriendsStatus {
    private final long _id;
    private final FriendLinkType friendLinkType;
    private final String userId;
    private final String username;

    AutoValue_LegacySearchQueries_FriendsStatus(long j, String str, FriendLinkType friendLinkType, String str2) {
        this._id = j;
        if (str != null) {
            this.username = str;
            this.friendLinkType = friendLinkType;
            this.userId = str2;
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
        if (obj instanceof FriendsStatus) {
            FriendsStatus friendsStatus = (FriendsStatus) obj;
            if (this._id == friendsStatus._id() && this.username.equals(friendsStatus.username())) {
                FriendLinkType friendLinkType = this.friendLinkType;
                if (friendLinkType != null ? !friendLinkType.equals(friendsStatus.friendLinkType()) : friendsStatus.friendLinkType() != null) {
                    String str = this.userId;
                    return str != null ? !str.equals(friendsStatus.userId()) : friendsStatus.userId() != null;
                }
            }
        }
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.username.hashCode()) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        int i = 0;
        hashCode = (hashCode ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        String str = this.userId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsStatus{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
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
