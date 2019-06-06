package com.snap.core.db.record;

final class AutoValue_SuggestedFriendRecord extends SuggestedFriendRecord {
    private final long _id;
    private final boolean added;
    private final long friendRowId;
    private final boolean hidden;
    private final String suggestionReason;
    private final String suggestionToken;
    private final String userId;

    AutoValue_SuggestedFriendRecord(long j, long j2, String str, String str2, String str3, boolean z, boolean z2) {
        this._id = j;
        this.friendRowId = j2;
        if (str != null) {
            this.userId = str;
            this.suggestionReason = str2;
            this.suggestionToken = str3;
            this.added = z;
            this.hidden = z2;
            return;
        }
        throw new NullPointerException("Null userId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean added() {
        return this.added;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SuggestedFriendRecord) {
            SuggestedFriendRecord suggestedFriendRecord = (SuggestedFriendRecord) obj;
            if (this._id == suggestedFriendRecord._id() && this.friendRowId == suggestedFriendRecord.friendRowId() && this.userId.equals(suggestedFriendRecord.userId())) {
                String str = this.suggestionReason;
                if (str != null ? !str.equals(suggestedFriendRecord.suggestionReason()) : suggestedFriendRecord.suggestionReason() != null) {
                    str = this.suggestionToken;
                    if (str != null ? !str.equals(suggestedFriendRecord.suggestionToken()) : suggestedFriendRecord.suggestionToken() != null) {
                        return this.added == suggestedFriendRecord.added() && this.hidden == suggestedFriendRecord.hidden();
                    }
                }
            }
        }
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.friendRowId;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.userId.hashCode()) * 1000003;
        String str = this.suggestionReason;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.suggestionToken;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i ^ i2) * 1000003;
        i2 = 1231;
        i = (i ^ (this.added ? 1231 : 1237)) * 1000003;
        if (!this.hidden) {
            i2 = 1237;
        }
        return i ^ i2;
    }

    public final boolean hidden() {
        return this.hidden;
    }

    public final String suggestionReason() {
        return this.suggestionReason;
    }

    public final String suggestionToken() {
        return this.suggestionToken;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SuggestedFriendRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", suggestionReason=");
        stringBuilder.append(this.suggestionReason);
        stringBuilder.append(", suggestionToken=");
        stringBuilder.append(this.suggestionToken);
        stringBuilder.append(", added=");
        stringBuilder.append(this.added);
        stringBuilder.append(", hidden=");
        stringBuilder.append(this.hidden);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }
}
