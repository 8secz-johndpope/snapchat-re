package com.snap.core.db.query;

import com.snap.core.db.query.LegacyFriendsFeedSuggestedFriendQueries.WithDisplayInfo;

final class AutoValue_LegacyFriendsFeedSuggestedFriendQueries_WithDisplayInfo extends WithDisplayInfo {
    private final long _id;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String displayName;
    private final Boolean isAdded;
    private final Boolean isHidden;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final String suggestionReason;
    private final String suggestionToken;
    private final String userId;
    private final String username;

    AutoValue_LegacyFriendsFeedSuggestedFriendQueries_WithDisplayInfo(long j, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, Long l, Boolean bool3, Long l2, Long l3) {
        this._id = j;
        if (str != null) {
            this.username = str;
            this.userId = str2;
            this.displayName = str3;
            this.bitmojiSelfieId = str4;
            this.bitmojiAvatarId = str5;
            this.isAdded = bool;
            this.isHidden = bool2;
            this.suggestionReason = str6;
            this.suggestionToken = str7;
            this.storyRowId = l;
            this.storyViewed = bool3;
            this.storyLatestTimestamp = l2;
            this.storyLatestExpirationTimestamp = l3;
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
        if (obj instanceof WithDisplayInfo) {
            WithDisplayInfo withDisplayInfo = (WithDisplayInfo) obj;
            if (this._id == withDisplayInfo._id() && this.username.equals(withDisplayInfo.username())) {
                String str = this.userId;
                if (str != null ? !str.equals(withDisplayInfo.userId()) : withDisplayInfo.userId() != null) {
                    str = this.displayName;
                    if (str != null ? !str.equals(withDisplayInfo.displayName()) : withDisplayInfo.displayName() != null) {
                        str = this.bitmojiSelfieId;
                        if (str != null ? !str.equals(withDisplayInfo.bitmojiSelfieId()) : withDisplayInfo.bitmojiSelfieId() != null) {
                            str = this.bitmojiAvatarId;
                            if (str != null ? !str.equals(withDisplayInfo.bitmojiAvatarId()) : withDisplayInfo.bitmojiAvatarId() != null) {
                                Boolean bool = this.isAdded;
                                if (bool != null ? !bool.equals(withDisplayInfo.isAdded()) : withDisplayInfo.isAdded() != null) {
                                    bool = this.isHidden;
                                    if (bool != null ? !bool.equals(withDisplayInfo.isHidden()) : withDisplayInfo.isHidden() != null) {
                                        str = this.suggestionReason;
                                        if (str != null ? !str.equals(withDisplayInfo.suggestionReason()) : withDisplayInfo.suggestionReason() != null) {
                                            str = this.suggestionToken;
                                            if (str != null ? !str.equals(withDisplayInfo.suggestionToken()) : withDisplayInfo.suggestionToken() != null) {
                                                Long l = this.storyRowId;
                                                if (l != null ? !l.equals(withDisplayInfo.storyRowId()) : withDisplayInfo.storyRowId() != null) {
                                                    bool = this.storyViewed;
                                                    if (bool != null ? !bool.equals(withDisplayInfo.storyViewed()) : withDisplayInfo.storyViewed() != null) {
                                                        l = this.storyLatestTimestamp;
                                                        if (l != null ? !l.equals(withDisplayInfo.storyLatestTimestamp()) : withDisplayInfo.storyLatestTimestamp() != null) {
                                                            l = this.storyLatestExpirationTimestamp;
                                                            return l != null ? !l.equals(withDisplayInfo.storyLatestExpirationTimestamp()) : withDisplayInfo.storyLatestExpirationTimestamp() != null;
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
        Boolean bool = this.isAdded;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        bool = this.isHidden;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.suggestionReason;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.suggestionToken;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.storyLatestExpirationTimestamp;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isAdded() {
        return this.isAdded;
    }

    public final Boolean isHidden() {
        return this.isHidden;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
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
        StringBuilder stringBuilder = new StringBuilder("WithDisplayInfo{_id=");
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
        stringBuilder.append(", isAdded=");
        stringBuilder.append(this.isAdded);
        stringBuilder.append(", isHidden=");
        stringBuilder.append(this.isHidden);
        stringBuilder.append(", suggestionReason=");
        stringBuilder.append(this.suggestionReason);
        stringBuilder.append(", suggestionToken=");
        stringBuilder.append(this.suggestionToken);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
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
