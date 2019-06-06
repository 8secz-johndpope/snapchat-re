package com.snap.core.db.query;

import com.snap.core.db.query.LegacyAddFriendsSearchQueries.WithDisplayInfo;

final class AutoValue_LegacyAddFriendsSearchQueries_WithDisplayInfo extends WithDisplayInfo {
    private final long _id;
    private final String addSource;
    private final Boolean addedMe_isAdded;
    private final Long addedTimestamp;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final Boolean contact_isAdded;
    private final String displayName;
    private final Boolean friendRequestViewed;
    private final Boolean isHidden;
    private final Boolean isIgnored;
    private final Long reverseAddedTimestamp;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final Boolean suggested_isAdded;
    private final String suggestionReason;
    private final String suggestionToken;
    private final String userId;
    private final String username;

    AutoValue_LegacyAddFriendsSearchQueries_WithDisplayInfo(long j, String str, String str2, String str3, String str4, String str5, Long l, Long l2, Boolean bool, Boolean bool2, String str6, Boolean bool3, Boolean bool4, String str7, String str8, Boolean bool5, Long l3, Boolean bool6, Long l4, Long l5, Boolean bool7) {
        String str9 = str;
        this._id = j;
        if (str9 != null) {
            this.username = str9;
            this.userId = str2;
            this.displayName = str3;
            this.bitmojiSelfieId = str4;
            this.bitmojiAvatarId = str5;
            this.addedTimestamp = l;
            this.reverseAddedTimestamp = l2;
            this.addedMe_isAdded = bool;
            this.isIgnored = bool2;
            this.addSource = str6;
            this.suggested_isAdded = bool3;
            this.isHidden = bool4;
            this.suggestionReason = str7;
            this.suggestionToken = str8;
            this.contact_isAdded = bool5;
            this.storyRowId = l3;
            this.storyViewed = bool6;
            this.storyLatestTimestamp = l4;
            this.storyLatestExpirationTimestamp = l5;
            this.friendRequestViewed = bool7;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final long _id() {
        return this._id;
    }

    public final String addSource() {
        return this.addSource;
    }

    public final Boolean addedMe_isAdded() {
        return this.addedMe_isAdded;
    }

    public final Long addedTimestamp() {
        return this.addedTimestamp;
    }

    public final String bitmojiAvatarId() {
        return this.bitmojiAvatarId;
    }

    public final String bitmojiSelfieId() {
        return this.bitmojiSelfieId;
    }

    public final Boolean contact_isAdded() {
        return this.contact_isAdded;
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
                                Long l = this.addedTimestamp;
                                if (l != null ? !l.equals(withDisplayInfo.addedTimestamp()) : withDisplayInfo.addedTimestamp() != null) {
                                    l = this.reverseAddedTimestamp;
                                    if (l != null ? !l.equals(withDisplayInfo.reverseAddedTimestamp()) : withDisplayInfo.reverseAddedTimestamp() != null) {
                                        Boolean bool = this.addedMe_isAdded;
                                        if (bool != null ? !bool.equals(withDisplayInfo.addedMe_isAdded()) : withDisplayInfo.addedMe_isAdded() != null) {
                                            bool = this.isIgnored;
                                            if (bool != null ? !bool.equals(withDisplayInfo.isIgnored()) : withDisplayInfo.isIgnored() != null) {
                                                str = this.addSource;
                                                if (str != null ? !str.equals(withDisplayInfo.addSource()) : withDisplayInfo.addSource() != null) {
                                                    bool = this.suggested_isAdded;
                                                    if (bool != null ? !bool.equals(withDisplayInfo.suggested_isAdded()) : withDisplayInfo.suggested_isAdded() != null) {
                                                        bool = this.isHidden;
                                                        if (bool != null ? !bool.equals(withDisplayInfo.isHidden()) : withDisplayInfo.isHidden() != null) {
                                                            str = this.suggestionReason;
                                                            if (str != null ? !str.equals(withDisplayInfo.suggestionReason()) : withDisplayInfo.suggestionReason() != null) {
                                                                str = this.suggestionToken;
                                                                if (str != null ? !str.equals(withDisplayInfo.suggestionToken()) : withDisplayInfo.suggestionToken() != null) {
                                                                    bool = this.contact_isAdded;
                                                                    if (bool != null ? !bool.equals(withDisplayInfo.contact_isAdded()) : withDisplayInfo.contact_isAdded() != null) {
                                                                        l = this.storyRowId;
                                                                        if (l != null ? !l.equals(withDisplayInfo.storyRowId()) : withDisplayInfo.storyRowId() != null) {
                                                                            bool = this.storyViewed;
                                                                            if (bool != null ? !bool.equals(withDisplayInfo.storyViewed()) : withDisplayInfo.storyViewed() != null) {
                                                                                l = this.storyLatestTimestamp;
                                                                                if (l != null ? !l.equals(withDisplayInfo.storyLatestTimestamp()) : withDisplayInfo.storyLatestTimestamp() != null) {
                                                                                    l = this.storyLatestExpirationTimestamp;
                                                                                    if (l != null ? !l.equals(withDisplayInfo.storyLatestExpirationTimestamp()) : withDisplayInfo.storyLatestExpirationTimestamp() != null) {
                                                                                        bool = this.friendRequestViewed;
                                                                                        return bool != null ? !bool.equals(withDisplayInfo.friendRequestViewed()) : withDisplayInfo.friendRequestViewed() != null;
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
                        }
                    }
                }
            }
        }
    }

    public final Boolean friendRequestViewed() {
        return this.friendRequestViewed;
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
        Long l = this.addedTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.reverseAddedTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.addedMe_isAdded;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        bool = this.isIgnored;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.addSource;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.suggested_isAdded;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        bool = this.isHidden;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.suggestionReason;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.suggestionToken;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.contact_isAdded;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool2 = this.friendRequestViewed;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isHidden() {
        return this.isHidden;
    }

    public final Boolean isIgnored() {
        return this.isIgnored;
    }

    public final Long reverseAddedTimestamp() {
        return this.reverseAddedTimestamp;
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

    public final Boolean suggested_isAdded() {
        return this.suggested_isAdded;
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
        stringBuilder.append(", addedTimestamp=");
        stringBuilder.append(this.addedTimestamp);
        stringBuilder.append(", reverseAddedTimestamp=");
        stringBuilder.append(this.reverseAddedTimestamp);
        stringBuilder.append(", addedMe_isAdded=");
        stringBuilder.append(this.addedMe_isAdded);
        stringBuilder.append(", isIgnored=");
        stringBuilder.append(this.isIgnored);
        stringBuilder.append(", addSource=");
        stringBuilder.append(this.addSource);
        stringBuilder.append(", suggested_isAdded=");
        stringBuilder.append(this.suggested_isAdded);
        stringBuilder.append(", isHidden=");
        stringBuilder.append(this.isHidden);
        stringBuilder.append(", suggestionReason=");
        stringBuilder.append(this.suggestionReason);
        stringBuilder.append(", suggestionToken=");
        stringBuilder.append(this.suggestionToken);
        stringBuilder.append(", contact_isAdded=");
        stringBuilder.append(this.contact_isAdded);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", friendRequestViewed=");
        stringBuilder.append(this.friendRequestViewed);
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
