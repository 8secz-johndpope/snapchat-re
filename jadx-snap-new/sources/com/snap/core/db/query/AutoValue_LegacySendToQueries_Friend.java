package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.query.LegacySendToQueries.Friend;

final class AutoValue_LegacySendToQueries_Friend extends Friend {
    private final long _id;
    private final CalendarDate birthday;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String displayName;
    private final FriendLinkType friendLinkType;
    private final String friendmojiCategories;
    private final Friendmojis friendmojis;
    private final String friendmojisToDisplay;
    private final boolean isBest;
    private final boolean isNewFriend;
    private final boolean isOfficial;
    private final boolean isRecent;
    private final Long lastAddFriendTimestamp;
    private final String phoneNumber;
    private final Long streakExpiration;
    private final Integer streakLength;
    private final String userId;
    private final String username;

    static final class Builder extends com.snap.core.db.query.LegacySendToQueries.Friend.Builder {
        private Long _id;
        private CalendarDate birthday;
        private String bitmojiAvatarId;
        private String bitmojiSelfieId;
        private String displayName;
        private FriendLinkType friendLinkType;
        private String friendmojiCategories;
        private Friendmojis friendmojis;
        private String friendmojisToDisplay;
        private Boolean isBest;
        private Boolean isNewFriend;
        private Boolean isOfficial;
        private Boolean isRecent;
        private Long lastAddFriendTimestamp;
        private String phoneNumber;
        private Long streakExpiration;
        private Integer streakLength;
        private String userId;
        private String username;

        Builder() {
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder _id(long j) {
            this._id = Long.valueOf(j);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder birthday(CalendarDate calendarDate) {
            this.birthday = calendarDate;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder bitmojiAvatarId(String str) {
            this.bitmojiAvatarId = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder bitmojiSelfieId(String str) {
            this.bitmojiSelfieId = str;
            return this;
        }

        public final Friend build() {
            StringBuilder stringBuilder;
            String str = "";
            if (this._id == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" _id");
                str = stringBuilder.toString();
            }
            if (this.username == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" username");
                str = stringBuilder.toString();
            }
            if (this.isOfficial == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isOfficial");
                str = stringBuilder.toString();
            }
            if (this.isNewFriend == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isNewFriend");
                str = stringBuilder.toString();
            }
            if (this.isRecent == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isRecent");
                str = stringBuilder.toString();
            }
            if (this.isBest == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isBest");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_LegacySendToQueries_Friend(this._id.longValue(), this.userId, this.displayName, this.username, this.friendmojis, this.friendmojiCategories, this.streakLength, this.friendLinkType, this.bitmojiAvatarId, this.bitmojiSelfieId, this.lastAddFriendTimestamp, this.birthday, this.streakExpiration, this.isOfficial.booleanValue(), this.friendmojisToDisplay, this.phoneNumber, this.isNewFriend.booleanValue(), this.isRecent.booleanValue(), this.isBest.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder displayName(String str) {
            this.displayName = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder friendLinkType(FriendLinkType friendLinkType) {
            this.friendLinkType = friendLinkType;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder friendmojiCategories(String str) {
            this.friendmojiCategories = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder friendmojis(Friendmojis friendmojis) {
            this.friendmojis = friendmojis;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder friendmojisToDisplay(String str) {
            this.friendmojisToDisplay = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder isBest(boolean z) {
            this.isBest = Boolean.valueOf(z);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder isNewFriend(boolean z) {
            this.isNewFriend = Boolean.valueOf(z);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder isOfficial(boolean z) {
            this.isOfficial = Boolean.valueOf(z);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder isRecent(boolean z) {
            this.isRecent = Boolean.valueOf(z);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder lastAddFriendTimestamp(Long l) {
            this.lastAddFriendTimestamp = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder phoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder streakExpiration(Long l) {
            this.streakExpiration = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder streakLength(Integer num) {
            this.streakLength = num;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder userId(String str) {
            this.userId = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Friend.Builder username(String str) {
            if (str != null) {
                this.username = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }
    }

    private AutoValue_LegacySendToQueries_Friend(long j, String str, String str2, String str3, Friendmojis friendmojis, String str4, Integer num, FriendLinkType friendLinkType, String str5, String str6, Long l, CalendarDate calendarDate, Long l2, boolean z, String str7, String str8, boolean z2, boolean z3, boolean z4) {
        this._id = j;
        this.userId = str;
        this.displayName = str2;
        this.username = str3;
        this.friendmojis = friendmojis;
        this.friendmojiCategories = str4;
        this.streakLength = num;
        this.friendLinkType = friendLinkType;
        this.bitmojiAvatarId = str5;
        this.bitmojiSelfieId = str6;
        this.lastAddFriendTimestamp = l;
        this.birthday = calendarDate;
        this.streakExpiration = l2;
        this.isOfficial = z;
        this.friendmojisToDisplay = str7;
        this.phoneNumber = str8;
        this.isNewFriend = z2;
        this.isRecent = z3;
        this.isBest = z4;
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

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Friend) {
            Friend friend = (Friend) obj;
            if (this._id == friend._id()) {
                String str = this.userId;
                if (str != null ? !str.equals(friend.userId()) : friend.userId() != null) {
                    str = this.displayName;
                    if (str != null ? !str.equals(friend.displayName()) : friend.displayName() != null) {
                        if (this.username.equals(friend.username())) {
                            Friendmojis friendmojis = this.friendmojis;
                            if (friendmojis != null ? !friendmojis.equals(friend.friendmojis()) : friend.friendmojis() != null) {
                                str = this.friendmojiCategories;
                                if (str != null ? !str.equals(friend.friendmojiCategories()) : friend.friendmojiCategories() != null) {
                                    Integer num = this.streakLength;
                                    if (num != null ? !num.equals(friend.streakLength()) : friend.streakLength() != null) {
                                        FriendLinkType friendLinkType = this.friendLinkType;
                                        if (friendLinkType != null ? !friendLinkType.equals(friend.friendLinkType()) : friend.friendLinkType() != null) {
                                            str = this.bitmojiAvatarId;
                                            if (str != null ? !str.equals(friend.bitmojiAvatarId()) : friend.bitmojiAvatarId() != null) {
                                                str = this.bitmojiSelfieId;
                                                if (str != null ? !str.equals(friend.bitmojiSelfieId()) : friend.bitmojiSelfieId() != null) {
                                                    Long l = this.lastAddFriendTimestamp;
                                                    if (l != null ? !l.equals(friend.lastAddFriendTimestamp()) : friend.lastAddFriendTimestamp() != null) {
                                                        CalendarDate calendarDate = this.birthday;
                                                        if (calendarDate != null ? !calendarDate.equals(friend.birthday()) : friend.birthday() != null) {
                                                            l = this.streakExpiration;
                                                            if (l != null ? !l.equals(friend.streakExpiration()) : friend.streakExpiration() != null) {
                                                                if (this.isOfficial == friend.isOfficial()) {
                                                                    str = this.friendmojisToDisplay;
                                                                    if (str != null ? !str.equals(friend.friendmojisToDisplay()) : friend.friendmojisToDisplay() != null) {
                                                                        str = this.phoneNumber;
                                                                        if (str != null ? !str.equals(friend.phoneNumber()) : friend.phoneNumber() != null) {
                                                                            return this.isNewFriend == friend.isNewFriend() && this.isRecent == friend.isRecent() && this.isBest == friend.isBest();
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

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final String friendmojiCategories() {
        return this.friendmojiCategories;
    }

    public final Friendmojis friendmojis() {
        return this.friendmojis;
    }

    public final String friendmojisToDisplay() {
        return this.friendmojisToDisplay;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.userId;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        Friendmojis friendmojis = this.friendmojis;
        i = (i ^ (friendmojis == null ? 0 : friendmojis.hashCode())) * 1000003;
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
        Long l = this.lastAddFriendTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        CalendarDate calendarDate = this.birthday;
        i = (i ^ (calendarDate == null ? 0 : calendarDate.hashCode())) * 1000003;
        l = this.streakExpiration;
        int i3 = 1231;
        i = (((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.isOfficial ? 1231 : 1237)) * 1000003;
        str = this.friendmojisToDisplay;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.phoneNumber;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (((((i ^ i2) * 1000003) ^ (this.isNewFriend ? 1231 : 1237)) * 1000003) ^ (this.isRecent ? 1231 : 1237)) * 1000003;
        if (!this.isBest) {
            i3 = 1237;
        }
        return i ^ i3;
    }

    public final boolean isBest() {
        return this.isBest;
    }

    public final boolean isNewFriend() {
        return this.isNewFriend;
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    public final boolean isRecent() {
        return this.isRecent;
    }

    public final Long lastAddFriendTimestamp() {
        return this.lastAddFriendTimestamp;
    }

    public final String phoneNumber() {
        return this.phoneNumber;
    }

    public final Long streakExpiration() {
        return this.streakExpiration;
    }

    public final Integer streakLength() {
        return this.streakLength;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Friend{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", friendmojis=");
        stringBuilder.append(this.friendmojis);
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
        stringBuilder.append(", isOfficial=");
        stringBuilder.append(this.isOfficial);
        stringBuilder.append(", friendmojisToDisplay=");
        stringBuilder.append(this.friendmojisToDisplay);
        stringBuilder.append(", phoneNumber=");
        stringBuilder.append(this.phoneNumber);
        stringBuilder.append(", isNewFriend=");
        stringBuilder.append(this.isNewFriend);
        stringBuilder.append(", isRecent=");
        stringBuilder.append(this.isRecent);
        stringBuilder.append(", isBest=");
        stringBuilder.append(this.isBest);
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
