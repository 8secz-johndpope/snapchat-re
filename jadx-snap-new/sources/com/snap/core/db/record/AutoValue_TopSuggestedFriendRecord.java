package com.snap.core.db.record;

import com.snap.core.db.column.FriendSuggestionPlacement;

final class AutoValue_TopSuggestedFriendRecord extends TopSuggestedFriendRecord {
    private final long _id;
    private final long priority;
    private final FriendSuggestionPlacement suggestionPlacement;
    private final String userId;

    AutoValue_TopSuggestedFriendRecord(long j, String str, FriendSuggestionPlacement friendSuggestionPlacement, long j2) {
        this._id = j;
        if (str != null) {
            this.userId = str;
            this.suggestionPlacement = friendSuggestionPlacement;
            this.priority = j2;
            return;
        }
        throw new NullPointerException("Null userId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TopSuggestedFriendRecord) {
            TopSuggestedFriendRecord topSuggestedFriendRecord = (TopSuggestedFriendRecord) obj;
            if (this._id == topSuggestedFriendRecord._id() && this.userId.equals(topSuggestedFriendRecord.userId())) {
                FriendSuggestionPlacement friendSuggestionPlacement = this.suggestionPlacement;
                if (friendSuggestionPlacement != null ? !friendSuggestionPlacement.equals(topSuggestedFriendRecord.suggestionPlacement()) : topSuggestedFriendRecord.suggestionPlacement() != null) {
                    if (this.priority == topSuggestedFriendRecord.priority()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.userId.hashCode()) * 1000003;
        FriendSuggestionPlacement friendSuggestionPlacement = this.suggestionPlacement;
        hashCode = (hashCode ^ (friendSuggestionPlacement == null ? 0 : friendSuggestionPlacement.hashCode())) * 1000003;
        long j2 = this.priority;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final long priority() {
        return this.priority;
    }

    public final FriendSuggestionPlacement suggestionPlacement() {
        return this.suggestionPlacement;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TopSuggestedFriendRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", suggestionPlacement=");
        stringBuilder.append(this.suggestionPlacement);
        stringBuilder.append(", priority=");
        stringBuilder.append(this.priority);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }
}
