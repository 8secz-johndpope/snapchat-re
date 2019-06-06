package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.query.LegacyProfileQueries.MemberForGroup;

final class AutoValue_LegacyProfileQueries_MemberForGroup extends MemberForGroup {
    private final Long addedTimestamp;
    private final CalendarDate birthday;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final Integer color;
    private final String displayName;
    private final FriendLinkType friendLinkType;
    private final long friendRowId;
    private final Friendmojis friendmojis;
    private final Long joinedTimestamp;
    private final Long reverseAddedTimestamp;
    private final Long score;
    private final String serverDisplayName;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final long storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final Long streakExpiration;
    private final Integer streakLength;
    private final String userId;
    private final String username;

    AutoValue_LegacyProfileQueries_MemberForGroup(Integer num, Long l, long j, String str, String str2, String str3, String str4, String str5, String str6, Long l2, FriendLinkType friendLinkType, Friendmojis friendmojis, Integer num2, Long l3, CalendarDate calendarDate, Long l4, Long l5, Long l6, Long l7, Long l8, Boolean bool, long j2) {
        String str7 = str4;
        this.color = num;
        this.joinedTimestamp = l;
        this.friendRowId = j;
        this.userId = str;
        this.displayName = str2;
        this.serverDisplayName = str3;
        if (str7 != null) {
            this.username = str7;
            this.bitmojiAvatarId = str5;
            this.bitmojiSelfieId = str6;
            this.score = l2;
            this.friendLinkType = friendLinkType;
            this.friendmojis = friendmojis;
            this.streakLength = num2;
            this.streakExpiration = l3;
            this.birthday = calendarDate;
            this.addedTimestamp = l4;
            this.reverseAddedTimestamp = l5;
            this.storyRowId = l6;
            this.storyLatestTimestamp = l7;
            this.storyLatestExpirationTimestamp = l8;
            this.storyViewed = bool;
            this.storyMuted = j2;
            return;
        }
        throw new NullPointerException("Null username");
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

    public final Integer color() {
        return this.color;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MemberForGroup) {
            MemberForGroup memberForGroup = (MemberForGroup) obj;
            Integer num = this.color;
            if (num != null ? !num.equals(memberForGroup.color()) : memberForGroup.color() != null) {
                Long l = this.joinedTimestamp;
                if (l != null ? !l.equals(memberForGroup.joinedTimestamp()) : memberForGroup.joinedTimestamp() != null) {
                    if (this.friendRowId == memberForGroup.friendRowId()) {
                        String str = this.userId;
                        if (str != null ? !str.equals(memberForGroup.userId()) : memberForGroup.userId() != null) {
                            str = this.displayName;
                            if (str != null ? !str.equals(memberForGroup.displayName()) : memberForGroup.displayName() != null) {
                                str = this.serverDisplayName;
                                if (str != null ? !str.equals(memberForGroup.serverDisplayName()) : memberForGroup.serverDisplayName() != null) {
                                    if (this.username.equals(memberForGroup.username())) {
                                        str = this.bitmojiAvatarId;
                                        if (str != null ? !str.equals(memberForGroup.bitmojiAvatarId()) : memberForGroup.bitmojiAvatarId() != null) {
                                            str = this.bitmojiSelfieId;
                                            if (str != null ? !str.equals(memberForGroup.bitmojiSelfieId()) : memberForGroup.bitmojiSelfieId() != null) {
                                                l = this.score;
                                                if (l != null ? !l.equals(memberForGroup.score()) : memberForGroup.score() != null) {
                                                    FriendLinkType friendLinkType = this.friendLinkType;
                                                    if (friendLinkType != null ? !friendLinkType.equals(memberForGroup.friendLinkType()) : memberForGroup.friendLinkType() != null) {
                                                        Friendmojis friendmojis = this.friendmojis;
                                                        if (friendmojis != null ? !friendmojis.equals(memberForGroup.friendmojis()) : memberForGroup.friendmojis() != null) {
                                                            num = this.streakLength;
                                                            if (num != null ? !num.equals(memberForGroup.streakLength()) : memberForGroup.streakLength() != null) {
                                                                l = this.streakExpiration;
                                                                if (l != null ? !l.equals(memberForGroup.streakExpiration()) : memberForGroup.streakExpiration() != null) {
                                                                    CalendarDate calendarDate = this.birthday;
                                                                    if (calendarDate != null ? !calendarDate.equals(memberForGroup.birthday()) : memberForGroup.birthday() != null) {
                                                                        l = this.addedTimestamp;
                                                                        if (l != null ? !l.equals(memberForGroup.addedTimestamp()) : memberForGroup.addedTimestamp() != null) {
                                                                            l = this.reverseAddedTimestamp;
                                                                            if (l != null ? !l.equals(memberForGroup.reverseAddedTimestamp()) : memberForGroup.reverseAddedTimestamp() != null) {
                                                                                l = this.storyRowId;
                                                                                if (l != null ? !l.equals(memberForGroup.storyRowId()) : memberForGroup.storyRowId() != null) {
                                                                                    l = this.storyLatestTimestamp;
                                                                                    if (l != null ? !l.equals(memberForGroup.storyLatestTimestamp()) : memberForGroup.storyLatestTimestamp() != null) {
                                                                                        l = this.storyLatestExpirationTimestamp;
                                                                                        if (l != null ? !l.equals(memberForGroup.storyLatestExpirationTimestamp()) : memberForGroup.storyLatestExpirationTimestamp() != null) {
                                                                                            Boolean bool = this.storyViewed;
                                                                                            if (bool != null ? !bool.equals(memberForGroup.storyViewed()) : memberForGroup.storyViewed() != null) {
                                                                                                if (this.storyMuted == memberForGroup.storyMuted()) {
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

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final Friendmojis friendmojis() {
        return this.friendmojis;
    }

    public final int hashCode() {
        Integer num = this.color;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        Long l = this.joinedTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j = this.friendRowId;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str = this.userId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.serverDisplayName;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        str = this.bitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.score;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        hashCode = (hashCode ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        Friendmojis friendmojis = this.friendmojis;
        hashCode = (hashCode ^ (friendmojis == null ? 0 : friendmojis.hashCode())) * 1000003;
        Integer num2 = this.streakLength;
        hashCode = (hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        l = this.streakExpiration;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        CalendarDate calendarDate = this.birthday;
        hashCode = (hashCode ^ (calendarDate == null ? 0 : calendarDate.hashCode())) * 1000003;
        l = this.addedTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.reverseAddedTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        if (bool != null) {
            i = bool.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        long j2 = this.storyMuted;
        return hashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final Long joinedTimestamp() {
        return this.joinedTimestamp;
    }

    public final Long reverseAddedTimestamp() {
        return this.reverseAddedTimestamp;
    }

    public final Long score() {
        return this.score;
    }

    public final String serverDisplayName() {
        return this.serverDisplayName;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final long storyMuted() {
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
        StringBuilder stringBuilder = new StringBuilder("MemberForGroup{color=");
        stringBuilder.append(this.color);
        stringBuilder.append(", joinedTimestamp=");
        stringBuilder.append(this.joinedTimestamp);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", serverDisplayName=");
        stringBuilder.append(this.serverDisplayName);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", friendmojis=");
        stringBuilder.append(this.friendmojis);
        stringBuilder.append(", streakLength=");
        stringBuilder.append(this.streakLength);
        stringBuilder.append(", streakExpiration=");
        stringBuilder.append(this.streakExpiration);
        stringBuilder.append(", birthday=");
        stringBuilder.append(this.birthday);
        stringBuilder.append(", addedTimestamp=");
        stringBuilder.append(this.addedTimestamp);
        stringBuilder.append(", reverseAddedTimestamp=");
        stringBuilder.append(this.reverseAddedTimestamp);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
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
