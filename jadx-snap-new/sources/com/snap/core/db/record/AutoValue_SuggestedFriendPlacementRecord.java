package com.snap.core.db.record;

import com.snap.core.db.column.FriendSuggestionPlacement;

final class AutoValue_SuggestedFriendPlacementRecord extends SuggestedFriendPlacementRecord {
    private final long _id;
    private final long friendRowId;
    private final FriendSuggestionPlacement suggestionPlacement;

    AutoValue_SuggestedFriendPlacementRecord(long j, FriendSuggestionPlacement friendSuggestionPlacement, long j2) {
        this._id = j;
        this.suggestionPlacement = friendSuggestionPlacement;
        this.friendRowId = j2;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SuggestedFriendPlacementRecord) {
            SuggestedFriendPlacementRecord suggestedFriendPlacementRecord = (SuggestedFriendPlacementRecord) obj;
            if (this._id == suggestedFriendPlacementRecord._id()) {
                FriendSuggestionPlacement friendSuggestionPlacement = this.suggestionPlacement;
                if (friendSuggestionPlacement != null ? !friendSuggestionPlacement.equals(suggestedFriendPlacementRecord.suggestionPlacement()) : suggestedFriendPlacementRecord.suggestionPlacement() != null) {
                    if (this.friendRowId == suggestedFriendPlacementRecord.friendRowId()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        FriendSuggestionPlacement friendSuggestionPlacement = this.suggestionPlacement;
        i = (i ^ (friendSuggestionPlacement == null ? 0 : friendSuggestionPlacement.hashCode())) * 1000003;
        long j2 = this.friendRowId;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final FriendSuggestionPlacement suggestionPlacement() {
        return this.suggestionPlacement;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SuggestedFriendPlacementRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", suggestionPlacement=");
        stringBuilder.append(this.suggestionPlacement);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
