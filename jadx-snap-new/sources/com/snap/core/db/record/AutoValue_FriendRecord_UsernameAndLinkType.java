package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendRecord.UsernameAndLinkType;

final class AutoValue_FriendRecord_UsernameAndLinkType extends UsernameAndLinkType {
    private final FriendLinkType friendLinkType;
    private final String username;

    AutoValue_FriendRecord_UsernameAndLinkType(String str, FriendLinkType friendLinkType) {
        if (str != null) {
            this.username = str;
            this.friendLinkType = friendLinkType;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UsernameAndLinkType) {
            UsernameAndLinkType usernameAndLinkType = (UsernameAndLinkType) obj;
            if (this.username.equals(usernameAndLinkType.username())) {
                FriendLinkType friendLinkType = this.friendLinkType;
                return friendLinkType != null ? !friendLinkType.equals(usernameAndLinkType.friendLinkType()) : usernameAndLinkType.friendLinkType() != null;
            }
        }
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final int hashCode() {
        int hashCode = (this.username.hashCode() ^ 1000003) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        return hashCode ^ (friendLinkType == null ? 0 : friendLinkType.hashCode());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UsernameAndLinkType{username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}
