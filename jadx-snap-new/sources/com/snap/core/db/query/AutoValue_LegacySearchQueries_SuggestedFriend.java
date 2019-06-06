package com.snap.core.db.query;

import com.snap.core.db.query.LegacySearchQueries.SuggestedFriend;

final class AutoValue_LegacySearchQueries_SuggestedFriend extends SuggestedFriend {
    private final long _id;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String displayName;
    private final String friendmojiCategories;
    private final boolean isAdded;
    private final boolean isHidden;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final boolean storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final String suggestionReason;
    private final String suggestionToken;
    private final String userId;
    private final String username;

    AutoValue_LegacySearchQueries_SuggestedFriend(long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Long l, Long l2, Long l3, Boolean bool, boolean z2, boolean z3, String str7, String str8) {
        String str9 = str;
        this._id = j;
        if (str9 != null) {
            this.username = str9;
            this.userId = str2;
            this.displayName = str3;
            this.bitmojiSelfieId = str4;
            this.bitmojiAvatarId = str5;
            this.friendmojiCategories = str6;
            this.storyMuted = z;
            this.storyRowId = l;
            this.storyLatestExpirationTimestamp = l2;
            this.storyLatestTimestamp = l3;
            this.storyViewed = bool;
            this.isAdded = z2;
            this.isHidden = z3;
            this.suggestionReason = str7;
            this.suggestionToken = str8;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final long _id() {
        return this._id;
    }

    public final String bitmojiAvatarId() {
        return this.bitmojiAvatarId;
    }

    public final String bitmojiSelfieId() {
        return this.bitmojiSelfieId;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SuggestedFriend) {
            SuggestedFriend suggestedFriend = (SuggestedFriend) obj;
            if (this._id == suggestedFriend._id() && this.username.equals(suggestedFriend.username())) {
                String str = this.userId;
                if (str != null ? !str.equals(suggestedFriend.userId()) : suggestedFriend.userId() != null) {
                    str = this.displayName;
                    if (str != null ? !str.equals(suggestedFriend.displayName()) : suggestedFriend.displayName() != null) {
                        str = this.bitmojiSelfieId;
                        if (str != null ? !str.equals(suggestedFriend.bitmojiSelfieId()) : suggestedFriend.bitmojiSelfieId() != null) {
                            str = this.bitmojiAvatarId;
                            if (str != null ? !str.equals(suggestedFriend.bitmojiAvatarId()) : suggestedFriend.bitmojiAvatarId() != null) {
                                str = this.friendmojiCategories;
                                if (str != null ? !str.equals(suggestedFriend.friendmojiCategories()) : suggestedFriend.friendmojiCategories() != null) {
                                    if (this.storyMuted == suggestedFriend.storyMuted()) {
                                        Long l = this.storyRowId;
                                        if (l != null ? !l.equals(suggestedFriend.storyRowId()) : suggestedFriend.storyRowId() != null) {
                                            l = this.storyLatestExpirationTimestamp;
                                            if (l != null ? !l.equals(suggestedFriend.storyLatestExpirationTimestamp()) : suggestedFriend.storyLatestExpirationTimestamp() != null) {
                                                l = this.storyLatestTimestamp;
                                                if (l != null ? !l.equals(suggestedFriend.storyLatestTimestamp()) : suggestedFriend.storyLatestTimestamp() != null) {
                                                    Boolean bool = this.storyViewed;
                                                    if (bool != null ? !bool.equals(suggestedFriend.storyViewed()) : suggestedFriend.storyViewed() != null) {
                                                        if (this.isAdded == suggestedFriend.isAdded() && this.isHidden == suggestedFriend.isHidden()) {
                                                            str = this.suggestionReason;
                                                            if (str != null ? !str.equals(suggestedFriend.suggestionReason()) : suggestedFriend.suggestionReason() != null) {
                                                                str = this.suggestionToken;
                                                                return str != null ? !str.equals(suggestedFriend.suggestionToken()) : suggestedFriend.suggestionToken() != null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final String friendmojiCategories() {
        return this.friendmojiCategories;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.username.hashCode()) * 1000003;
        String str = this.userId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendmojiCategories;
        int i2 = 1231;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.storyMuted ? 1231 : 1237)) * 1000003;
        Long l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        hashCode = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ (this.isAdded ? 1231 : 1237)) * 1000003;
        if (!this.isHidden) {
            i2 = 1237;
        }
        hashCode = (hashCode ^ i2) * 1000003;
        str = this.suggestionReason;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.suggestionToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isAdded() {
        return this.isAdded;
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final boolean storyMuted() {
        return this.storyMuted;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String suggestionReason() {
        return this.suggestionReason;
    }

    public final String suggestionToken() {
        return this.suggestionToken;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SuggestedFriend{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", friendmojiCategories=");
        stringBuilder.append(this.friendmojiCategories);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", isAdded=");
        stringBuilder.append(this.isAdded);
        stringBuilder.append(", isHidden=");
        stringBuilder.append(this.isHidden);
        stringBuilder.append(", suggestionReason=");
        stringBuilder.append(this.suggestionReason);
        stringBuilder.append(", suggestionToken=");
        stringBuilder.append(this.suggestionToken);
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
