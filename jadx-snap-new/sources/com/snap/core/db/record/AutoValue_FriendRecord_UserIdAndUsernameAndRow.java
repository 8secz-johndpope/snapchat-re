package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.UserIdAndUsernameAndRow;

final class AutoValue_FriendRecord_UserIdAndUsernameAndRow extends UserIdAndUsernameAndRow {
    private final long _id;
    private final String userId;
    private final String username;

    AutoValue_FriendRecord_UserIdAndUsernameAndRow(String str, String str2, long j) {
        this.userId = str;
        if (str2 != null) {
            this.username = str2;
            this._id = j;
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
        if (obj instanceof UserIdAndUsernameAndRow) {
            UserIdAndUsernameAndRow userIdAndUsernameAndRow = (UserIdAndUsernameAndRow) obj;
            String str = this.userId;
            if (str != null ? !str.equals(userIdAndUsernameAndRow.userId()) : userIdAndUsernameAndRow.userId() != null) {
                return this.username.equals(userIdAndUsernameAndRow.username()) && this._id == userIdAndUsernameAndRow._id();
            }
        }
    }

    public final int hashCode() {
        String str = this.userId;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.username.hashCode()) * 1000003;
        long j = this._id;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserIdAndUsernameAndRow{userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", _id=");
        stringBuilder.append(this._id);
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
