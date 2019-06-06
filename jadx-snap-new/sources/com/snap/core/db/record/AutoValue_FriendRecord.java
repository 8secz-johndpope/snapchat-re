package com.snap.core.db.record;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;

final class AutoValue_FriendRecord extends FriendRecord {
    private final long _id;
    private final Long _lastModifiedTimestamp;
    private final Long addedTimestamp;
    private final CalendarDate birthday;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String displayName;
    private final FriendLinkType friendLinkType;
    private final String friendmojiCategories;
    private final Long friendmojiString;
    private final Friendmojis friendmojis;
    private final boolean isFideliusReady;
    private final boolean isOfficial;
    private final boolean isPopular;
    private final Long lastMessageId;
    private final String phone;
    private final Long receivedFromMe;
    private final Long reverseAddedTimestamp;
    private final Long score;
    private final Long sentToMe;
    private final String serverDisplayName;
    private final String snapProId;
    private final boolean storyMuted;
    private final Long streakExpiration;
    private final Integer streakLength;
    private final Long unreadCount;
    private final String userId;
    private final String username;

    AutoValue_FriendRecord(long j, Long l, String str, String str2, String str3, String str4, String str5, Friendmojis friendmojis, String str6, String str7, Long l2, CalendarDate calendarDate, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str8, Integer num, Long l10, FriendLinkType friendLinkType, boolean z, boolean z2, boolean z3, boolean z4, String str9) {
        String str10 = str;
        this._id = j;
        this._lastModifiedTimestamp = l;
        if (str10 != null) {
            this.username = str10;
            this.userId = str2;
            this.displayName = str3;
            this.bitmojiAvatarId = str4;
            this.bitmojiSelfieId = str5;
            this.friendmojis = friendmojis;
            this.friendmojiCategories = str6;
            this.phone = str7;
            this.score = l2;
            this.birthday = calendarDate;
            this.sentToMe = l3;
            this.receivedFromMe = l4;
            this.addedTimestamp = l5;
            this.reverseAddedTimestamp = l6;
            this.lastMessageId = l7;
            this.unreadCount = l8;
            this.friendmojiString = l9;
            this.serverDisplayName = str8;
            this.streakLength = num;
            this.streakExpiration = l10;
            this.friendLinkType = friendLinkType;
            this.storyMuted = z;
            this.isPopular = z2;
            this.isOfficial = z3;
            this.isFideliusReady = z4;
            this.snapProId = str9;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final long _id() {
        return this._id;
    }

    public final Long _lastModifiedTimestamp() {
        return this._lastModifiedTimestamp;
    }

    public final Long addedTimestamp() {
        return this.addedTimestamp;
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
        if (obj instanceof FriendRecord) {
            FriendRecord friendRecord = (FriendRecord) obj;
            if (this._id == friendRecord._id()) {
                Long l = this._lastModifiedTimestamp;
                if (l != null ? !l.equals(friendRecord._lastModifiedTimestamp()) : friendRecord._lastModifiedTimestamp() != null) {
                    if (this.username.equals(friendRecord.username())) {
                        String str = this.userId;
                        if (str != null ? !str.equals(friendRecord.userId()) : friendRecord.userId() != null) {
                            str = this.displayName;
                            if (str != null ? !str.equals(friendRecord.displayName()) : friendRecord.displayName() != null) {
                                str = this.bitmojiAvatarId;
                                if (str != null ? !str.equals(friendRecord.bitmojiAvatarId()) : friendRecord.bitmojiAvatarId() != null) {
                                    str = this.bitmojiSelfieId;
                                    if (str != null ? !str.equals(friendRecord.bitmojiSelfieId()) : friendRecord.bitmojiSelfieId() != null) {
                                        Friendmojis friendmojis = this.friendmojis;
                                        if (friendmojis != null ? !friendmojis.equals(friendRecord.friendmojis()) : friendRecord.friendmojis() != null) {
                                            str = this.friendmojiCategories;
                                            if (str != null ? !str.equals(friendRecord.friendmojiCategories()) : friendRecord.friendmojiCategories() != null) {
                                                str = this.phone;
                                                if (str != null ? !str.equals(friendRecord.phone()) : friendRecord.phone() != null) {
                                                    l = this.score;
                                                    if (l != null ? !l.equals(friendRecord.score()) : friendRecord.score() != null) {
                                                        CalendarDate calendarDate = this.birthday;
                                                        if (calendarDate != null ? !calendarDate.equals(friendRecord.birthday()) : friendRecord.birthday() != null) {
                                                            l = this.sentToMe;
                                                            if (l != null ? !l.equals(friendRecord.sentToMe()) : friendRecord.sentToMe() != null) {
                                                                l = this.receivedFromMe;
                                                                if (l != null ? !l.equals(friendRecord.receivedFromMe()) : friendRecord.receivedFromMe() != null) {
                                                                    l = this.addedTimestamp;
                                                                    if (l != null ? !l.equals(friendRecord.addedTimestamp()) : friendRecord.addedTimestamp() != null) {
                                                                        l = this.reverseAddedTimestamp;
                                                                        if (l != null ? !l.equals(friendRecord.reverseAddedTimestamp()) : friendRecord.reverseAddedTimestamp() != null) {
                                                                            l = this.lastMessageId;
                                                                            if (l != null ? !l.equals(friendRecord.lastMessageId()) : friendRecord.lastMessageId() != null) {
                                                                                l = this.unreadCount;
                                                                                if (l != null ? !l.equals(friendRecord.unreadCount()) : friendRecord.unreadCount() != null) {
                                                                                    l = this.friendmojiString;
                                                                                    if (l != null ? !l.equals(friendRecord.friendmojiString()) : friendRecord.friendmojiString() != null) {
                                                                                        str = this.serverDisplayName;
                                                                                        if (str != null ? !str.equals(friendRecord.serverDisplayName()) : friendRecord.serverDisplayName() != null) {
                                                                                            Integer num = this.streakLength;
                                                                                            if (num != null ? !num.equals(friendRecord.streakLength()) : friendRecord.streakLength() != null) {
                                                                                                l = this.streakExpiration;
                                                                                                if (l != null ? !l.equals(friendRecord.streakExpiration()) : friendRecord.streakExpiration() != null) {
                                                                                                    FriendLinkType friendLinkType = this.friendLinkType;
                                                                                                    if (friendLinkType != null ? !friendLinkType.equals(friendRecord.friendLinkType()) : friendRecord.friendLinkType() != null) {
                                                                                                        if (this.storyMuted == friendRecord.storyMuted() && this.isPopular == friendRecord.isPopular() && this.isOfficial == friendRecord.isOfficial() && this.isFideliusReady == friendRecord.isFideliusReady()) {
                                                                                                            str = this.snapProId;
                                                                                                            return str != null ? !str.equals(friendRecord.snapProId()) : friendRecord.snapProId() != null;
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

    public final Long friendmojiString() {
        return this.friendmojiString;
    }

    public final Friendmojis friendmojis() {
        return this.friendmojis;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this._lastModifiedTimestamp;
        int i2 = 0;
        i = (((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        String str = this.userId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiAvatarId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Friendmojis friendmojis = this.friendmojis;
        i = (i ^ (friendmojis == null ? 0 : friendmojis.hashCode())) * 1000003;
        str = this.friendmojiCategories;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.phone;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.score;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        CalendarDate calendarDate = this.birthday;
        i = (i ^ (calendarDate == null ? 0 : calendarDate.hashCode())) * 1000003;
        l = this.sentToMe;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.receivedFromMe;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.addedTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.reverseAddedTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastMessageId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.unreadCount;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.friendmojiString;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.serverDisplayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.streakLength;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        l = this.streakExpiration;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        int i3 = 1231;
        i = (((((((i ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003) ^ (this.storyMuted ? 1231 : 1237)) * 1000003) ^ (this.isPopular ? 1231 : 1237)) * 1000003) ^ (this.isOfficial ? 1231 : 1237)) * 1000003;
        if (!this.isFideliusReady) {
            i3 = 1237;
        }
        i = (i ^ i3) * 1000003;
        String str2 = this.snapProId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i ^ i2;
    }

    public final boolean isFideliusReady() {
        return this.isFideliusReady;
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    public final boolean isPopular() {
        return this.isPopular;
    }

    public final Long lastMessageId() {
        return this.lastMessageId;
    }

    public final String phone() {
        return this.phone;
    }

    public final Long receivedFromMe() {
        return this.receivedFromMe;
    }

    public final Long reverseAddedTimestamp() {
        return this.reverseAddedTimestamp;
    }

    public final Long score() {
        return this.score;
    }

    public final Long sentToMe() {
        return this.sentToMe;
    }

    public final String serverDisplayName() {
        return this.serverDisplayName;
    }

    public final String snapProId() {
        return this.snapProId;
    }

    public final boolean storyMuted() {
        return this.storyMuted;
    }

    public final Long streakExpiration() {
        return this.streakExpiration;
    }

    public final Integer streakLength() {
        return this.streakLength;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", _lastModifiedTimestamp=");
        stringBuilder.append(this._lastModifiedTimestamp);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", friendmojis=");
        stringBuilder.append(this.friendmojis);
        stringBuilder.append(", friendmojiCategories=");
        stringBuilder.append(this.friendmojiCategories);
        stringBuilder.append(", phone=");
        stringBuilder.append(this.phone);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", birthday=");
        stringBuilder.append(this.birthday);
        stringBuilder.append(", sentToMe=");
        stringBuilder.append(this.sentToMe);
        stringBuilder.append(", receivedFromMe=");
        stringBuilder.append(this.receivedFromMe);
        stringBuilder.append(", addedTimestamp=");
        stringBuilder.append(this.addedTimestamp);
        stringBuilder.append(", reverseAddedTimestamp=");
        stringBuilder.append(this.reverseAddedTimestamp);
        stringBuilder.append(", lastMessageId=");
        stringBuilder.append(this.lastMessageId);
        stringBuilder.append(", unreadCount=");
        stringBuilder.append(this.unreadCount);
        stringBuilder.append(", friendmojiString=");
        stringBuilder.append(this.friendmojiString);
        stringBuilder.append(", serverDisplayName=");
        stringBuilder.append(this.serverDisplayName);
        stringBuilder.append(", streakLength=");
        stringBuilder.append(this.streakLength);
        stringBuilder.append(", streakExpiration=");
        stringBuilder.append(this.streakExpiration);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", isPopular=");
        stringBuilder.append(this.isPopular);
        stringBuilder.append(", isOfficial=");
        stringBuilder.append(this.isOfficial);
        stringBuilder.append(", isFideliusReady=");
        stringBuilder.append(this.isFideliusReady);
        stringBuilder.append(", snapProId=");
        stringBuilder.append(this.snapProId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Long unreadCount() {
        return this.unreadCount;
    }

    public final String userId() {
        return this.userId;
    }

    public final String username() {
        return this.username;
    }
}
