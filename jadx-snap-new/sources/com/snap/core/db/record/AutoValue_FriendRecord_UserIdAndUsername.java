package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.UserIdAndUsername;

final class AutoValue_FriendRecord_UserIdAndUsername extends UserIdAndUsername {
    private final String userId;
    private final String username;

    AutoValue_FriendRecord_UserIdAndUsername(String str, String str2) {
        this.userId = str;
        if (str2 != null) {
            this.username = str2;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserIdAndUsername) {
            UserIdAndUsername userIdAndUsername = (UserIdAndUsername) obj;
            String str = this.userId;
            if (str != null ? !str.equals(userIdAndUsername.userId()) : userIdAndUsername.userId() != null) {
                if (this.username.equals(userIdAndUsername.username())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.userId;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.username.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserIdAndUsername{userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
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
