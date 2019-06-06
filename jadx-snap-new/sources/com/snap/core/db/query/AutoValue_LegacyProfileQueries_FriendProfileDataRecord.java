package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LegacyProfileQueries.FriendProfileDataRecord;

final class AutoValue_LegacyProfileQueries_FriendProfileDataRecord extends FriendProfileDataRecord {
    private final Long addedTimestamp;
    private final CalendarDate birthday;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String friendDisplayName;
    private final FriendLinkType friendLinkType;
    private final long friendRowId;
    private final String friendUserId;
    private final String friendUsername;
    private final Long friendmojiString;
    private final Long reverseAddedTimestamp;
    private final Long score;
    private final String serverDisplayName;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final long storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;

    AutoValue_LegacyProfileQueries_FriendProfileDataRecord(long j, String str, String str2, String str3, String str4, Long l, String str5, String str6, CalendarDate calendarDate, Long l2, Long l3, FriendLinkType friendLinkType, Long l4, Long l5, Long l6, Long l7, long j2, Boolean bool) {
        String str7 = str4;
        this.friendRowId = j;
        this.friendUserId = str;
        this.friendDisplayName = str2;
        this.serverDisplayName = str3;
        if (str7 != null) {
            this.friendUsername = str7;
            this.friendmojiString = l;
            this.bitmojiAvatarId = str5;
            this.bitmojiSelfieId = str6;
            this.birthday = calendarDate;
            this.addedTimestamp = l2;
            this.reverseAddedTimestamp = l3;
            this.friendLinkType = friendLinkType;
            this.score = l4;
            this.storyRowId = l5;
            this.storyLatestTimestamp = l6;
            this.storyLatestExpirationTimestamp = l7;
            this.storyMuted = j2;
            this.storyViewed = bool;
            return;
        }
        throw new NullPointerException("Null friendUsername");
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendProfileDataRecord) {
            FriendProfileDataRecord friendProfileDataRecord = (FriendProfileDataRecord) obj;
            if (this.friendRowId == friendProfileDataRecord.friendRowId()) {
                String str = this.friendUserId;
                if (str != null ? !str.equals(friendProfileDataRecord.friendUserId()) : friendProfileDataRecord.friendUserId() != null) {
                    str = this.friendDisplayName;
                    if (str != null ? !str.equals(friendProfileDataRecord.friendDisplayName()) : friendProfileDataRecord.friendDisplayName() != null) {
                        str = this.serverDisplayName;
                        if (str != null ? !str.equals(friendProfileDataRecord.serverDisplayName()) : friendProfileDataRecord.serverDisplayName() != null) {
                            if (this.friendUsername.equals(friendProfileDataRecord.friendUsername())) {
                                Long l = this.friendmojiString;
                                if (l != null ? !l.equals(friendProfileDataRecord.friendmojiString()) : friendProfileDataRecord.friendmojiString() != null) {
                                    str = this.bitmojiAvatarId;
                                    if (str != null ? !str.equals(friendProfileDataRecord.bitmojiAvatarId()) : friendProfileDataRecord.bitmojiAvatarId() != null) {
                                        str = this.bitmojiSelfieId;
                                        if (str != null ? !str.equals(friendProfileDataRecord.bitmojiSelfieId()) : friendProfileDataRecord.bitmojiSelfieId() != null) {
                                            CalendarDate calendarDate = this.birthday;
                                            if (calendarDate != null ? !calendarDate.equals(friendProfileDataRecord.birthday()) : friendProfileDataRecord.birthday() != null) {
                                                l = this.addedTimestamp;
                                                if (l != null ? !l.equals(friendProfileDataRecord.addedTimestamp()) : friendProfileDataRecord.addedTimestamp() != null) {
                                                    l = this.reverseAddedTimestamp;
                                                    if (l != null ? !l.equals(friendProfileDataRecord.reverseAddedTimestamp()) : friendProfileDataRecord.reverseAddedTimestamp() != null) {
                                                        FriendLinkType friendLinkType = this.friendLinkType;
                                                        if (friendLinkType != null ? !friendLinkType.equals(friendProfileDataRecord.friendLinkType()) : friendProfileDataRecord.friendLinkType() != null) {
                                                            l = this.score;
                                                            if (l != null ? !l.equals(friendProfileDataRecord.score()) : friendProfileDataRecord.score() != null) {
                                                                l = this.storyRowId;
                                                                if (l != null ? !l.equals(friendProfileDataRecord.storyRowId()) : friendProfileDataRecord.storyRowId() != null) {
                                                                    l = this.storyLatestTimestamp;
                                                                    if (l != null ? !l.equals(friendProfileDataRecord.storyLatestTimestamp()) : friendProfileDataRecord.storyLatestTimestamp() != null) {
                                                                        l = this.storyLatestExpirationTimestamp;
                                                                        if (l != null ? !l.equals(friendProfileDataRecord.storyLatestExpirationTimestamp()) : friendProfileDataRecord.storyLatestExpirationTimestamp() != null) {
                                                                            if (this.storyMuted == friendProfileDataRecord.storyMuted()) {
                                                                                Boolean bool = this.storyViewed;
                                                                                return bool != null ? !bool.equals(friendProfileDataRecord.storyViewed()) : friendProfileDataRecord.storyViewed() != null;
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

    public final String friendDisplayName() {
        return this.friendDisplayName;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final String friendUserId() {
        return this.friendUserId;
    }

    public final String friendUsername() {
        return this.friendUsername;
    }

    public final Long friendmojiString() {
        return this.friendmojiString;
    }

    public final int hashCode() {
        long j = this.friendRowId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.friendUserId;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendDisplayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.serverDisplayName;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.friendUsername.hashCode()) * 1000003;
        Long l = this.friendmojiString;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.bitmojiAvatarId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CalendarDate calendarDate = this.birthday;
        i = (i ^ (calendarDate == null ? 0 : calendarDate.hashCode())) * 1000003;
        l = this.addedTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.reverseAddedTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        i = (i ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        l = this.score;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyRowId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j2 = this.storyMuted;
        i = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Boolean bool = this.storyViewed;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i ^ i2;
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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendProfileDataRecord{friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", friendUserId=");
        stringBuilder.append(this.friendUserId);
        stringBuilder.append(", friendDisplayName=");
        stringBuilder.append(this.friendDisplayName);
        stringBuilder.append(", serverDisplayName=");
        stringBuilder.append(this.serverDisplayName);
        stringBuilder.append(", friendUsername=");
        stringBuilder.append(this.friendUsername);
        stringBuilder.append(", friendmojiString=");
        stringBuilder.append(this.friendmojiString);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", birthday=");
        stringBuilder.append(this.birthday);
        stringBuilder.append(", addedTimestamp=");
        stringBuilder.append(this.addedTimestamp);
        stringBuilder.append(", reverseAddedTimestamp=");
        stringBuilder.append(this.reverseAddedTimestamp);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
