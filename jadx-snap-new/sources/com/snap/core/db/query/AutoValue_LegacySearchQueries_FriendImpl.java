package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LegacySearchQueries.FriendImpl;

final class AutoValue_LegacySearchQueries_FriendImpl extends FriendImpl {
    private final long _id;
    private final CalendarDate birthday;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String displayInteractionType;
    private final String displayName;
    private final Long feedRowId;
    private final FriendLinkType friendLinkType;
    private final String friendmojiCategories;
    private final boolean isOfficial;
    private final boolean isPopular;
    private final Long lastAddFriendTimestamp;
    private final Long score;
    private final String snapProId;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final boolean storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final Long streakExpiration;
    private final Integer streakLength;
    private final String userId;
    private final String username;

    AutoValue_LegacySearchQueries_FriendImpl(long j, String str, String str2, String str3, Long l, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l2, CalendarDate calendarDate, Long l3, Long l4, String str7, Long l5, Boolean bool, Long l6, Long l7, boolean z, boolean z2, boolean z3, String str8) {
        String str9 = str3;
        this._id = j;
        this.userId = str;
        this.displayName = str2;
        if (str9 != null) {
            this.username = str9;
            this.score = l;
            this.friendmojiCategories = str4;
            this.streakLength = num;
            this.friendLinkType = friendLinkType;
            this.bitmojiAvatarId = str5;
            this.bitmojiSelfieId = str6;
            this.lastAddFriendTimestamp = l2;
            this.birthday = calendarDate;
            this.streakExpiration = l3;
            this.feedRowId = l4;
            this.displayInteractionType = str7;
            this.storyRowId = l5;
            this.storyViewed = bool;
            this.storyLatestExpirationTimestamp = l6;
            this.storyLatestTimestamp = l7;
            this.storyMuted = z;
            this.isPopular = z2;
            this.isOfficial = z3;
            this.snapProId = str8;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final long _id() {
        return this._id;
    }

    public final CalendarDate birthday() {
        return this.birthday;
    }

    public final String bitmojiAvatarId() {
        return this.bitmojiAvatarId;
    }

    public final String bitmojiSelfieId() {
        return this.bitmojiSelfieId;
    }

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendImpl) {
            FriendImpl friendImpl = (FriendImpl) obj;
            if (this._id == friendImpl._id()) {
                String str = this.userId;
                if (str != null ? !str.equals(friendImpl.userId()) : friendImpl.userId() != null) {
                    str = this.displayName;
                    if (str != null ? !str.equals(friendImpl.displayName()) : friendImpl.displayName() != null) {
                        if (this.username.equals(friendImpl.username())) {
                            Long l = this.score;
                            if (l != null ? !l.equals(friendImpl.score()) : friendImpl.score() != null) {
                                str = this.friendmojiCategories;
                                if (str != null ? !str.equals(friendImpl.friendmojiCategories()) : friendImpl.friendmojiCategories() != null) {
                                    Integer num = this.streakLength;
                                    if (num != null ? !num.equals(friendImpl.streakLength()) : friendImpl.streakLength() != null) {
                                        FriendLinkType friendLinkType = this.friendLinkType;
                                        if (friendLinkType != null ? !friendLinkType.equals(friendImpl.friendLinkType()) : friendImpl.friendLinkType() != null) {
                                            str = this.bitmojiAvatarId;
                                            if (str != null ? !str.equals(friendImpl.bitmojiAvatarId()) : friendImpl.bitmojiAvatarId() != null) {
                                                str = this.bitmojiSelfieId;
                                                if (str != null ? !str.equals(friendImpl.bitmojiSelfieId()) : friendImpl.bitmojiSelfieId() != null) {
                                                    l = this.lastAddFriendTimestamp;
                                                    if (l != null ? !l.equals(friendImpl.lastAddFriendTimestamp()) : friendImpl.lastAddFriendTimestamp() != null) {
                                                        CalendarDate calendarDate = this.birthday;
                                                        if (calendarDate != null ? !calendarDate.equals(friendImpl.birthday()) : friendImpl.birthday() != null) {
                                                            l = this.streakExpiration;
                                                            if (l != null ? !l.equals(friendImpl.streakExpiration()) : friendImpl.streakExpiration() != null) {
                                                                l = this.feedRowId;
                                                                if (l != null ? !l.equals(friendImpl.feedRowId()) : friendImpl.feedRowId() != null) {
                                                                    str = this.displayInteractionType;
                                                                    if (str != null ? !str.equals(friendImpl.displayInteractionType()) : friendImpl.displayInteractionType() != null) {
                                                                        l = this.storyRowId;
                                                                        if (l != null ? !l.equals(friendImpl.storyRowId()) : friendImpl.storyRowId() != null) {
                                                                            Boolean bool = this.storyViewed;
                                                                            if (bool != null ? !bool.equals(friendImpl.storyViewed()) : friendImpl.storyViewed() != null) {
                                                                                l = this.storyLatestExpirationTimestamp;
                                                                                if (l != null ? !l.equals(friendImpl.storyLatestExpirationTimestamp()) : friendImpl.storyLatestExpirationTimestamp() != null) {
                                                                                    l = this.storyLatestTimestamp;
                                                                                    if (l != null ? !l.equals(friendImpl.storyLatestTimestamp()) : friendImpl.storyLatestTimestamp() != null) {
                                                                                        if (this.storyMuted == friendImpl.storyMuted() && this.isPopular == friendImpl.isPopular() && this.isOfficial == friendImpl.isOfficial()) {
                                                                                            str = this.snapProId;
                                                                                            return str != null ? !str.equals(friendImpl.snapProId()) : friendImpl.snapProId() != null;
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
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final String friendmojiCategories() {
        return this.friendmojiCategories;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.userId;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        Long l = this.score;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.friendmojiCategories;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.streakLength;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        i = (i ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        str = this.bitmojiAvatarId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.lastAddFriendTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        CalendarDate calendarDate = this.birthday;
        i = (i ^ (calendarDate == null ? 0 : calendarDate.hashCode())) * 1000003;
        l = this.streakExpiration;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.feedRowId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.displayInteractionType;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.storyRowId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        int i3 = 1231;
        i = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.storyMuted ? 1231 : 1237)) * 1000003) ^ (this.isPopular ? 1231 : 1237)) * 1000003;
        if (!this.isOfficial) {
            i3 = 1237;
        }
        i = (i ^ i3) * 1000003;
        String str2 = this.snapProId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i ^ i2;
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    public final boolean isPopular() {
        return this.isPopular;
    }

    public final Long lastAddFriendTimestamp() {
        return this.lastAddFriendTimestamp;
    }

    public final Long score() {
        return this.score;
    }

    public final String snapProId() {
        return this.snapProId;
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

    public final Long streakExpiration() {
        return this.streakExpiration;
    }

    public final Integer streakLength() {
        return this.streakLength;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendImpl{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", friendmojiCategories=");
        stringBuilder.append(this.friendmojiCategories);
        stringBuilder.append(", streakLength=");
        stringBuilder.append(this.streakLength);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", lastAddFriendTimestamp=");
        stringBuilder.append(this.lastAddFriendTimestamp);
        stringBuilder.append(", birthday=");
        stringBuilder.append(this.birthday);
        stringBuilder.append(", streakExpiration=");
        stringBuilder.append(this.streakExpiration);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", isPopular=");
        stringBuilder.append(this.isPopular);
        stringBuilder.append(", isOfficial=");
        stringBuilder.append(this.isOfficial);
        stringBuilder.append(", snapProId=");
        stringBuilder.append(this.snapProId);
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
