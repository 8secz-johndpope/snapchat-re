package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.query.LegacySendToQueries.Recent;

final class AutoValue_LegacySendToQueries_Recent extends Recent {
    private final long _id;
    private final CalendarDate birthday;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String feedDisplayName;
    private final String fitScreenParticipantString;
    private final String friendDisplayName;
    private final FriendLinkType friendLinkType;
    private final Long friendRowId;
    private final String friendmojiCategories;
    private final Friendmojis friendmojis;
    private final String friendmojisToDisplay;
    private final Boolean isOfficial;
    private final String key;
    private final FeedKind kind;
    private final Long lastAddFriendTimestamp;
    private final long lastInteractionTimestamp;
    private final String participantString;
    private final Long streakExpiration;
    private final Integer streakLength;
    private final String userId;
    private final String username;

    static final class Builder extends com.snap.core.db.query.LegacySendToQueries.Recent.Builder {
        private Long _id;
        private CalendarDate birthday;
        private String bitmojiAvatarId;
        private String bitmojiSelfieId;
        private String feedDisplayName;
        private String fitScreenParticipantString;
        private String friendDisplayName;
        private FriendLinkType friendLinkType;
        private Long friendRowId;
        private String friendmojiCategories;
        private Friendmojis friendmojis;
        private String friendmojisToDisplay;
        private Boolean isOfficial;
        private String key;
        private FeedKind kind;
        private Long lastAddFriendTimestamp;
        private Long lastInteractionTimestamp;
        private String participantString;
        private Long streakExpiration;
        private Integer streakLength;
        private String userId;
        private String username;

        Builder() {
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder _id(long j) {
            this._id = Long.valueOf(j);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder birthday(CalendarDate calendarDate) {
            this.birthday = calendarDate;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder bitmojiAvatarId(String str) {
            this.bitmojiAvatarId = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder bitmojiSelfieId(String str) {
            this.bitmojiSelfieId = str;
            return this;
        }

        public final Recent build() {
            StringBuilder stringBuilder;
            String str = "";
            if (this._id == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" _id");
                str = stringBuilder.toString();
            }
            if (this.key == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" key");
                str = stringBuilder.toString();
            }
            if (this.kind == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" kind");
                str = stringBuilder.toString();
            }
            if (this.lastInteractionTimestamp == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lastInteractionTimestamp");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_LegacySendToQueries_Recent(this._id.longValue(), this.key, this.feedDisplayName, this.kind, this.lastInteractionTimestamp.longValue(), this.lastAddFriendTimestamp, this.friendmojis, this.friendmojiCategories, this.friendRowId, this.userId, this.username, this.friendDisplayName, this.streakLength, this.streakExpiration, this.birthday, this.friendLinkType, this.bitmojiAvatarId, this.bitmojiSelfieId, this.isOfficial, this.participantString, this.fitScreenParticipantString, this.friendmojisToDisplay);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder feedDisplayName(String str) {
            this.feedDisplayName = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder fitScreenParticipantString(String str) {
            this.fitScreenParticipantString = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder friendDisplayName(String str) {
            this.friendDisplayName = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder friendLinkType(FriendLinkType friendLinkType) {
            this.friendLinkType = friendLinkType;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder friendRowId(Long l) {
            this.friendRowId = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder friendmojiCategories(String str) {
            this.friendmojiCategories = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder friendmojis(Friendmojis friendmojis) {
            this.friendmojis = friendmojis;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder friendmojisToDisplay(String str) {
            this.friendmojisToDisplay = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder isOfficial(Boolean bool) {
            this.isOfficial = bool;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder key(String str) {
            if (str != null) {
                this.key = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder kind(FeedKind feedKind) {
            if (feedKind != null) {
                this.kind = feedKind;
                return this;
            }
            throw new NullPointerException("Null kind");
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder lastAddFriendTimestamp(Long l) {
            this.lastAddFriendTimestamp = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder lastInteractionTimestamp(long j) {
            this.lastInteractionTimestamp = Long.valueOf(j);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder participantString(String str) {
            this.participantString = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder streakExpiration(Long l) {
            this.streakExpiration = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder streakLength(Integer num) {
            this.streakLength = num;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder userId(String str) {
            this.userId = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.Recent.Builder username(String str) {
            this.username = str;
            return this;
        }
    }

    private AutoValue_LegacySendToQueries_Recent(long j, String str, String str2, FeedKind feedKind, long j2, Long l, Friendmojis friendmojis, String str3, Long l2, String str4, String str5, String str6, Integer num, Long l3, CalendarDate calendarDate, FriendLinkType friendLinkType, String str7, String str8, Boolean bool, String str9, String str10, String str11) {
        this._id = j;
        this.key = str;
        this.feedDisplayName = str2;
        this.kind = feedKind;
        this.lastInteractionTimestamp = j2;
        this.lastAddFriendTimestamp = l;
        this.friendmojis = friendmojis;
        this.friendmojiCategories = str3;
        this.friendRowId = l2;
        this.userId = str4;
        this.username = str5;
        this.friendDisplayName = str6;
        this.streakLength = num;
        this.streakExpiration = l3;
        this.birthday = calendarDate;
        this.friendLinkType = friendLinkType;
        this.bitmojiAvatarId = str7;
        this.bitmojiSelfieId = str8;
        this.isOfficial = bool;
        this.participantString = str9;
        this.fitScreenParticipantString = str10;
        this.friendmojisToDisplay = str11;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Recent) {
            Recent recent = (Recent) obj;
            if (this._id == recent._id() && this.key.equals(recent.key())) {
                String str = this.feedDisplayName;
                if (str != null ? !str.equals(recent.feedDisplayName()) : recent.feedDisplayName() != null) {
                    if (this.kind.equals(recent.kind()) && this.lastInteractionTimestamp == recent.lastInteractionTimestamp()) {
                        Long l = this.lastAddFriendTimestamp;
                        if (l != null ? !l.equals(recent.lastAddFriendTimestamp()) : recent.lastAddFriendTimestamp() != null) {
                            Friendmojis friendmojis = this.friendmojis;
                            if (friendmojis != null ? !friendmojis.equals(recent.friendmojis()) : recent.friendmojis() != null) {
                                str = this.friendmojiCategories;
                                if (str != null ? !str.equals(recent.friendmojiCategories()) : recent.friendmojiCategories() != null) {
                                    l = this.friendRowId;
                                    if (l != null ? !l.equals(recent.friendRowId()) : recent.friendRowId() != null) {
                                        str = this.userId;
                                        if (str != null ? !str.equals(recent.userId()) : recent.userId() != null) {
                                            str = this.username;
                                            if (str != null ? !str.equals(recent.username()) : recent.username() != null) {
                                                str = this.friendDisplayName;
                                                if (str != null ? !str.equals(recent.friendDisplayName()) : recent.friendDisplayName() != null) {
                                                    Integer num = this.streakLength;
                                                    if (num != null ? !num.equals(recent.streakLength()) : recent.streakLength() != null) {
                                                        l = this.streakExpiration;
                                                        if (l != null ? !l.equals(recent.streakExpiration()) : recent.streakExpiration() != null) {
                                                            CalendarDate calendarDate = this.birthday;
                                                            if (calendarDate != null ? !calendarDate.equals(recent.birthday()) : recent.birthday() != null) {
                                                                FriendLinkType friendLinkType = this.friendLinkType;
                                                                if (friendLinkType != null ? !friendLinkType.equals(recent.friendLinkType()) : recent.friendLinkType() != null) {
                                                                    str = this.bitmojiAvatarId;
                                                                    if (str != null ? !str.equals(recent.bitmojiAvatarId()) : recent.bitmojiAvatarId() != null) {
                                                                        str = this.bitmojiSelfieId;
                                                                        if (str != null ? !str.equals(recent.bitmojiSelfieId()) : recent.bitmojiSelfieId() != null) {
                                                                            Boolean bool = this.isOfficial;
                                                                            if (bool != null ? !bool.equals(recent.isOfficial()) : recent.isOfficial() != null) {
                                                                                str = this.participantString;
                                                                                if (str != null ? !str.equals(recent.participantString()) : recent.participantString() != null) {
                                                                                    str = this.fitScreenParticipantString;
                                                                                    if (str != null ? !str.equals(recent.fitScreenParticipantString()) : recent.fitScreenParticipantString() != null) {
                                                                                        str = this.friendmojisToDisplay;
                                                                                        return str != null ? !str.equals(recent.friendmojisToDisplay()) : recent.friendmojisToDisplay() != null;
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

    public final String feedDisplayName() {
        return this.feedDisplayName;
    }

    public final String fitScreenParticipantString() {
        return this.fitScreenParticipantString;
    }

    public final String friendDisplayName() {
        return this.friendDisplayName;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final Long friendRowId() {
        return this.friendRowId;
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
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.feedDisplayName;
        int i = 0;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003;
        long j2 = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l = this.lastAddFriendTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Friendmojis friendmojis = this.friendmojis;
        hashCode = (hashCode ^ (friendmojis == null ? 0 : friendmojis.hashCode())) * 1000003;
        String str2 = this.friendmojiCategories;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        l = this.friendRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str2 = this.userId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.username;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.friendDisplayName;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Integer num = this.streakLength;
        hashCode = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        l = this.streakExpiration;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        CalendarDate calendarDate = this.birthday;
        hashCode = (hashCode ^ (calendarDate == null ? 0 : calendarDate.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        hashCode = (hashCode ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        str2 = this.bitmojiAvatarId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.bitmojiSelfieId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.isOfficial;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str2 = this.participantString;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.fitScreenParticipantString;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.friendmojisToDisplay;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isOfficial() {
        return this.isOfficial;
    }

    public final String key() {
        return this.key;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final Long lastAddFriendTimestamp() {
        return this.lastAddFriendTimestamp;
    }

    public final long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final String participantString() {
        return this.participantString;
    }

    public final Long streakExpiration() {
        return this.streakExpiration;
    }

    public final Integer streakLength() {
        return this.streakLength;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Recent{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", feedDisplayName=");
        stringBuilder.append(this.feedDisplayName);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", lastAddFriendTimestamp=");
        stringBuilder.append(this.lastAddFriendTimestamp);
        stringBuilder.append(", friendmojis=");
        stringBuilder.append(this.friendmojis);
        stringBuilder.append(", friendmojiCategories=");
        stringBuilder.append(this.friendmojiCategories);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", friendDisplayName=");
        stringBuilder.append(this.friendDisplayName);
        stringBuilder.append(", streakLength=");
        stringBuilder.append(this.streakLength);
        stringBuilder.append(", streakExpiration=");
        stringBuilder.append(this.streakExpiration);
        stringBuilder.append(", birthday=");
        stringBuilder.append(this.birthday);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", isOfficial=");
        stringBuilder.append(this.isOfficial);
        stringBuilder.append(", participantString=");
        stringBuilder.append(this.participantString);
        stringBuilder.append(", fitScreenParticipantString=");
        stringBuilder.append(this.fitScreenParticipantString);
        stringBuilder.append(", friendmojisToDisplay=");
        stringBuilder.append(this.friendmojisToDisplay);
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
