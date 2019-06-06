package com.snap.core.db.query;

import com.snap.core.db.query.LegacyAddedMeFriendsQueries.WithDisplayInfo;

final class AutoValue_LegacyAddedMeFriendsQueries_WithDisplayInfo extends WithDisplayInfo {
    private final long _id;
    private final String addSource;
    private final Long addedTimestamp;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String displayName;
    private final boolean hasViewed;
    private final boolean isAdded;
    private final boolean isIgnored;
    private final Long reverseAddedTimestamp;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final String userId;
    private final String username;

    AutoValue_LegacyAddedMeFriendsQueries_WithDisplayInfo(long j, String str, String str2, String str3, String str4, String str5, Long l, Long l2, boolean z, boolean z2, String str6, Long l3, Boolean bool, Long l4, Long l5, boolean z3) {
        String str7 = str;
        this._id = j;
        if (str7 != null) {
            this.username = str7;
            this.userId = str2;
            this.displayName = str3;
            this.bitmojiSelfieId = str4;
            this.bitmojiAvatarId = str5;
            this.addedTimestamp = l;
            this.reverseAddedTimestamp = l2;
            this.isAdded = z;
            this.isIgnored = z2;
            this.addSource = str6;
            this.storyRowId = l3;
            this.storyViewed = bool;
            this.storyLatestTimestamp = l4;
            this.storyLatestExpirationTimestamp = l5;
            this.hasViewed = z3;
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

    public final Long addedTimestamp() {
        return this.addedTimestamp;
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
                                Long l = this.addedTimestamp;
                                if (l != null ? !l.equals(withDisplayInfo.addedTimestamp()) : withDisplayInfo.addedTimestamp() != null) {
                                    l = this.reverseAddedTimestamp;
                                    if (l != null ? !l.equals(withDisplayInfo.reverseAddedTimestamp()) : withDisplayInfo.reverseAddedTimestamp() != null) {
                                        if (this.isAdded == withDisplayInfo.isAdded() && this.isIgnored == withDisplayInfo.isIgnored()) {
                                            str = this.addSource;
                                            if (str != null ? !str.equals(withDisplayInfo.addSource()) : withDisplayInfo.addSource() != null) {
                                                l = this.storyRowId;
                                                if (l != null ? !l.equals(withDisplayInfo.storyRowId()) : withDisplayInfo.storyRowId() != null) {
                                                    Boolean bool = this.storyViewed;
                                                    if (bool != null ? !bool.equals(withDisplayInfo.storyViewed()) : withDisplayInfo.storyViewed() != null) {
                                                        l = this.storyLatestTimestamp;
                                                        if (l != null ? !l.equals(withDisplayInfo.storyLatestTimestamp()) : withDisplayInfo.storyLatestTimestamp() != null) {
                                                            l = this.storyLatestExpirationTimestamp;
                                                            if (l != null ? !l.equals(withDisplayInfo.storyLatestExpirationTimestamp()) : withDisplayInfo.storyLatestExpirationTimestamp() != null) {
                                                                if (this.hasViewed == withDisplayInfo.hasViewed()) {
                                                                    return true;
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
        return false;
    }

    public final boolean hasViewed() {
        return this.hasViewed;
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
        int i2 = 1231;
        hashCode = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.isAdded ? 1231 : 1237)) * 1000003) ^ (this.isIgnored ? 1231 : 1237)) * 1000003;
        str = this.addSource;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        if (!this.hasViewed) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    public final boolean isAdded() {
        return this.isAdded;
    }

    public final boolean isIgnored() {
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
        stringBuilder.append(", isAdded=");
        stringBuilder.append(this.isAdded);
        stringBuilder.append(", isIgnored=");
        stringBuilder.append(this.isIgnored);
        stringBuilder.append(", addSource=");
        stringBuilder.append(this.addSource);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", hasViewed=");
        stringBuilder.append(this.hasViewed);
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
