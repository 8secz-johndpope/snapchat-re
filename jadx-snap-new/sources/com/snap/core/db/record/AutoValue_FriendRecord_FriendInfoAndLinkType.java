package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendRecord.FriendInfoAndLinkType;

final class AutoValue_FriendRecord_FriendInfoAndLinkType extends FriendInfoAndLinkType {
    private final String displayName;
    private final FriendLinkType friendLinkType;
    private final String userId;
    private final String username;

    AutoValue_FriendRecord_FriendInfoAndLinkType(String str, String str2, String str3, FriendLinkType friendLinkType) {
        this.userId = str;
        if (str2 != null) {
            this.username = str2;
            this.displayName = str3;
            this.friendLinkType = friendLinkType;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendInfoAndLinkType) {
            FriendInfoAndLinkType friendInfoAndLinkType = (FriendInfoAndLinkType) obj;
            String str = this.userId;
            if (str != null ? !str.equals(friendInfoAndLinkType.userId()) : friendInfoAndLinkType.userId() != null) {
                if (this.username.equals(friendInfoAndLinkType.username())) {
                    str = this.displayName;
                    if (str != null ? !str.equals(friendInfoAndLinkType.displayName()) : friendInfoAndLinkType.displayName() != null) {
                        FriendLinkType friendLinkType = this.friendLinkType;
                        return friendLinkType != null ? !friendLinkType.equals(friendInfoAndLinkType.friendLinkType()) : friendInfoAndLinkType.friendLinkType() != null;
                    }
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
        String str2 = this.displayName;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i = friendLinkType.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendInfoAndLinkType{userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
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
