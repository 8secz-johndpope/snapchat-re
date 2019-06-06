package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.UserScore;

final class AutoValue_FriendRecord_UserScore extends UserScore {
    private final long _id;
    private final Long score;
    private final String userId;

    AutoValue_FriendRecord_UserScore(long j, Long l, String str) {
        this._id = j;
        this.score = l;
        this.userId = str;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserScore) {
            UserScore userScore = (UserScore) obj;
            if (this._id == userScore._id()) {
                Long l = this.score;
                if (l != null ? !l.equals(userScore.score()) : userScore.score() != null) {
                    String str = this.userId;
                    return str != null ? !str.equals(userScore.userId()) : userScore.userId() != null;
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this.score;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.userId;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i ^ i2;
    }

    public final Long score() {
        return this.score;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserScore{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }
}
