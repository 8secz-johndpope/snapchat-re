package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendRecord.UserIdAndLinkType;

final class AutoValue_FriendRecord_UserIdAndLinkType extends UserIdAndLinkType {
    private final FriendLinkType friendLinkType;
    private final String userId;

    AutoValue_FriendRecord_UserIdAndLinkType(String str, FriendLinkType friendLinkType) {
        this.userId = str;
        this.friendLinkType = friendLinkType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserIdAndLinkType) {
            UserIdAndLinkType userIdAndLinkType = (UserIdAndLinkType) obj;
            String str = this.userId;
            if (str != null ? !str.equals(userIdAndLinkType.userId()) : userIdAndLinkType.userId() != null) {
                FriendLinkType friendLinkType = this.friendLinkType;
                return friendLinkType != null ? !friendLinkType.equals(userIdAndLinkType.friendLinkType()) : userIdAndLinkType.friendLinkType() != null;
            }
        }
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i = friendLinkType.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserIdAndLinkType{userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }
}
