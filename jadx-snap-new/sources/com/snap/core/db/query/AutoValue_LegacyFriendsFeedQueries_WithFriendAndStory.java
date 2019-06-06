package com.snap.core.db.query;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory;

final class AutoValue_LegacyFriendsFeedQueries_WithFriendAndStory extends WithFriendAndStory {
    private final long _id;
    private final Long addedTimestamp;
    private final CalendarDate birthday;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final Long clearedTimestamp;
    private final String displayInteractionType;
    private final String displayInteractionUserDisplayName;
    private final String displayInteractionUserUsername;
    private final long displayTimestamp;
    private final String feedDisplayName;
    private final String friendDisplayName;
    private final Long friendRowId;
    private final String friendStoryFirstUnviewedSnapId;
    private final Long friendStoryIsViewed;
    private final Long friendStoryLatestExpirationTimestamp;
    private final long friendStoryLatestTimestamp;
    private final String friendStoryUsername;
    private final String friendUserId;
    private final String friendUsername;
    private final String friendmojiCategories;
    private final Long friendmojiString;
    private final Boolean isOfficial;
    private final String key;
    private final FeedKind kind;
    private final Long lastInteractionTimestamp;
    private final Long lastInteractionUserId;
    private final String lastWriterUsername;
    private final String notViewedSnapId;
    private final long participantsSize;
    private final Long reverseAddedTimestamp;
    private final Float score;
    private final String storyFirstUnviewedSnapId;
    private final String storyId;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final long storyMuted;
    private final Long storyRankingId;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final Long streakExpiration;
    private final Integer streakLength;

    AutoValue_LegacyFriendsFeedQueries_WithFriendAndStory(long j, String str, long j2, Long l, long j3, String str2, String str3, Long l2, Long l3, FeedKind feedKind, String str4, Long l4, String str5, String str6, String str7, String str8, Long l5, Integer num, Long l6, String str9, String str10, CalendarDate calendarDate, Long l7, Long l8, Boolean bool, long j4, Long l9, String str11, String str12, Boolean bool2, Long l10, Long l11, Long l12, String str13, Long l13, long j5, Long l14, String str14, String str15, String str16, String str17, Float f) {
        FeedKind feedKind2 = feedKind;
        String str18 = str4;
        String str19 = str13;
        String str20 = str14;
        this._id = j;
        this.feedDisplayName = str;
        this.participantsSize = j2;
        this.lastInteractionTimestamp = l;
        this.displayTimestamp = j3;
        this.displayInteractionType = str2;
        this.notViewedSnapId = str3;
        this.lastInteractionUserId = l2;
        this.clearedTimestamp = l3;
        if (feedKind2 != null) {
            this.kind = feedKind2;
            if (str18 != null) {
                this.key = str18;
                this.friendRowId = l4;
                this.friendUserId = str5;
                this.friendmojiCategories = str6;
                this.friendDisplayName = str7;
                this.friendUsername = str8;
                this.friendmojiString = l5;
                this.streakLength = num;
                this.streakExpiration = l6;
                this.bitmojiAvatarId = str9;
                this.bitmojiSelfieId = str10;
                this.birthday = calendarDate;
                this.addedTimestamp = l7;
                this.reverseAddedTimestamp = l8;
                this.isOfficial = bool;
                this.storyMuted = j4;
                this.storyRowId = l9;
                this.storyId = str11;
                this.storyFirstUnviewedSnapId = str12;
                this.storyViewed = bool2;
                this.storyLatestTimestamp = l10;
                this.storyLatestExpirationTimestamp = l11;
                this.storyRankingId = l12;
                if (str19 != null) {
                    this.friendStoryUsername = str19;
                    this.friendStoryIsViewed = l13;
                    this.friendStoryLatestTimestamp = j5;
                    this.friendStoryLatestExpirationTimestamp = l14;
                    if (str20 != null) {
                        this.friendStoryFirstUnviewedSnapId = str20;
                        this.displayInteractionUserDisplayName = str15;
                        this.displayInteractionUserUsername = str16;
                        this.lastWriterUsername = str17;
                        this.score = f;
                        return;
                    }
                    throw new NullPointerException("Null friendStoryFirstUnviewedSnapId");
                }
                throw new NullPointerException("Null friendStoryUsername");
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null kind");
    }

    public final long _id() {
        return this._id;
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

    public final Long clearedTimestamp() {
        return this.clearedTimestamp;
    }

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final String displayInteractionUserDisplayName() {
        return this.displayInteractionUserDisplayName;
    }

    public final String displayInteractionUserUsername() {
        return this.displayInteractionUserUsername;
    }

    public final long displayTimestamp() {
        return this.displayTimestamp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WithFriendAndStory) {
            WithFriendAndStory withFriendAndStory = (WithFriendAndStory) obj;
            if (this._id == withFriendAndStory._id()) {
                String str = this.feedDisplayName;
                if (str != null ? !str.equals(withFriendAndStory.feedDisplayName()) : withFriendAndStory.feedDisplayName() != null) {
                    if (this.participantsSize == withFriendAndStory.participantsSize()) {
                        Long l = this.lastInteractionTimestamp;
                        if (l != null ? !l.equals(withFriendAndStory.lastInteractionTimestamp()) : withFriendAndStory.lastInteractionTimestamp() != null) {
                            if (this.displayTimestamp == withFriendAndStory.displayTimestamp()) {
                                str = this.displayInteractionType;
                                if (str != null ? !str.equals(withFriendAndStory.displayInteractionType()) : withFriendAndStory.displayInteractionType() != null) {
                                    str = this.notViewedSnapId;
                                    if (str != null ? !str.equals(withFriendAndStory.notViewedSnapId()) : withFriendAndStory.notViewedSnapId() != null) {
                                        l = this.lastInteractionUserId;
                                        if (l != null ? !l.equals(withFriendAndStory.lastInteractionUserId()) : withFriendAndStory.lastInteractionUserId() != null) {
                                            l = this.clearedTimestamp;
                                            if (l != null ? !l.equals(withFriendAndStory.clearedTimestamp()) : withFriendAndStory.clearedTimestamp() != null) {
                                                if (this.kind.equals(withFriendAndStory.kind()) && this.key.equals(withFriendAndStory.key())) {
                                                    l = this.friendRowId;
                                                    if (l != null ? !l.equals(withFriendAndStory.friendRowId()) : withFriendAndStory.friendRowId() != null) {
                                                        str = this.friendUserId;
                                                        if (str != null ? !str.equals(withFriendAndStory.friendUserId()) : withFriendAndStory.friendUserId() != null) {
                                                            str = this.friendmojiCategories;
                                                            if (str != null ? !str.equals(withFriendAndStory.friendmojiCategories()) : withFriendAndStory.friendmojiCategories() != null) {
                                                                str = this.friendDisplayName;
                                                                if (str != null ? !str.equals(withFriendAndStory.friendDisplayName()) : withFriendAndStory.friendDisplayName() != null) {
                                                                    str = this.friendUsername;
                                                                    if (str != null ? !str.equals(withFriendAndStory.friendUsername()) : withFriendAndStory.friendUsername() != null) {
                                                                        l = this.friendmojiString;
                                                                        if (l != null ? !l.equals(withFriendAndStory.friendmojiString()) : withFriendAndStory.friendmojiString() != null) {
                                                                            Integer num = this.streakLength;
                                                                            if (num != null ? !num.equals(withFriendAndStory.streakLength()) : withFriendAndStory.streakLength() != null) {
                                                                                l = this.streakExpiration;
                                                                                if (l != null ? !l.equals(withFriendAndStory.streakExpiration()) : withFriendAndStory.streakExpiration() != null) {
                                                                                    str = this.bitmojiAvatarId;
                                                                                    if (str != null ? !str.equals(withFriendAndStory.bitmojiAvatarId()) : withFriendAndStory.bitmojiAvatarId() != null) {
                                                                                        str = this.bitmojiSelfieId;
                                                                                        if (str != null ? !str.equals(withFriendAndStory.bitmojiSelfieId()) : withFriendAndStory.bitmojiSelfieId() != null) {
                                                                                            CalendarDate calendarDate = this.birthday;
                                                                                            if (calendarDate != null ? !calendarDate.equals(withFriendAndStory.birthday()) : withFriendAndStory.birthday() != null) {
                                                                                                l = this.addedTimestamp;
                                                                                                if (l != null ? !l.equals(withFriendAndStory.addedTimestamp()) : withFriendAndStory.addedTimestamp() != null) {
                                                                                                    l = this.reverseAddedTimestamp;
                                                                                                    if (l != null ? !l.equals(withFriendAndStory.reverseAddedTimestamp()) : withFriendAndStory.reverseAddedTimestamp() != null) {
                                                                                                        Boolean bool = this.isOfficial;
                                                                                                        if (bool != null ? !bool.equals(withFriendAndStory.isOfficial()) : withFriendAndStory.isOfficial() != null) {
                                                                                                            if (this.storyMuted == withFriendAndStory.storyMuted()) {
                                                                                                                l = this.storyRowId;
                                                                                                                if (l != null ? !l.equals(withFriendAndStory.storyRowId()) : withFriendAndStory.storyRowId() != null) {
                                                                                                                    str = this.storyId;
                                                                                                                    if (str != null ? !str.equals(withFriendAndStory.storyId()) : withFriendAndStory.storyId() != null) {
                                                                                                                        str = this.storyFirstUnviewedSnapId;
                                                                                                                        if (str != null ? !str.equals(withFriendAndStory.storyFirstUnviewedSnapId()) : withFriendAndStory.storyFirstUnviewedSnapId() != null) {
                                                                                                                            bool = this.storyViewed;
                                                                                                                            if (bool != null ? !bool.equals(withFriendAndStory.storyViewed()) : withFriendAndStory.storyViewed() != null) {
                                                                                                                                l = this.storyLatestTimestamp;
                                                                                                                                if (l != null ? !l.equals(withFriendAndStory.storyLatestTimestamp()) : withFriendAndStory.storyLatestTimestamp() != null) {
                                                                                                                                    l = this.storyLatestExpirationTimestamp;
                                                                                                                                    if (l != null ? !l.equals(withFriendAndStory.storyLatestExpirationTimestamp()) : withFriendAndStory.storyLatestExpirationTimestamp() != null) {
                                                                                                                                        l = this.storyRankingId;
                                                                                                                                        if (l != null ? !l.equals(withFriendAndStory.storyRankingId()) : withFriendAndStory.storyRankingId() != null) {
                                                                                                                                            if (this.friendStoryUsername.equals(withFriendAndStory.friendStoryUsername())) {
                                                                                                                                                l = this.friendStoryIsViewed;
                                                                                                                                                if (l != null ? !l.equals(withFriendAndStory.friendStoryIsViewed()) : withFriendAndStory.friendStoryIsViewed() != null) {
                                                                                                                                                    if (this.friendStoryLatestTimestamp == withFriendAndStory.friendStoryLatestTimestamp()) {
                                                                                                                                                        l = this.friendStoryLatestExpirationTimestamp;
                                                                                                                                                        if (l != null ? !l.equals(withFriendAndStory.friendStoryLatestExpirationTimestamp()) : withFriendAndStory.friendStoryLatestExpirationTimestamp() != null) {
                                                                                                                                                            if (this.friendStoryFirstUnviewedSnapId.equals(withFriendAndStory.friendStoryFirstUnviewedSnapId())) {
                                                                                                                                                                str = this.displayInteractionUserDisplayName;
                                                                                                                                                                if (str != null ? !str.equals(withFriendAndStory.displayInteractionUserDisplayName()) : withFriendAndStory.displayInteractionUserDisplayName() != null) {
                                                                                                                                                                    str = this.displayInteractionUserUsername;
                                                                                                                                                                    if (str != null ? !str.equals(withFriendAndStory.displayInteractionUserUsername()) : withFriendAndStory.displayInteractionUserUsername() != null) {
                                                                                                                                                                        str = this.lastWriterUsername;
                                                                                                                                                                        if (str != null ? !str.equals(withFriendAndStory.lastWriterUsername()) : withFriendAndStory.lastWriterUsername() != null) {
                                                                                                                                                                            Float f = this.score;
                                                                                                                                                                            return f != null ? !f.equals(withFriendAndStory.score()) : withFriendAndStory.score() != null;
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

    public final String friendDisplayName() {
        return this.friendDisplayName;
    }

    public final Long friendRowId() {
        return this.friendRowId;
    }

    public final String friendStoryFirstUnviewedSnapId() {
        return this.friendStoryFirstUnviewedSnapId;
    }

    public final Long friendStoryIsViewed() {
        return this.friendStoryIsViewed;
    }

    public final Long friendStoryLatestExpirationTimestamp() {
        return this.friendStoryLatestExpirationTimestamp;
    }

    public final long friendStoryLatestTimestamp() {
        return this.friendStoryLatestTimestamp;
    }

    public final String friendStoryUsername() {
        return this.friendStoryUsername;
    }

    public final String friendUserId() {
        return this.friendUserId;
    }

    public final String friendUsername() {
        return this.friendUsername;
    }

    public final String friendmojiCategories() {
        return this.friendmojiCategories;
    }

    public final Long friendmojiString() {
        return this.friendmojiString;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.feedDisplayName;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.participantsSize;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.lastInteractionTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        j2 = this.displayTimestamp;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        str = this.displayInteractionType;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.notViewedSnapId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.lastInteractionUserId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.clearedTimestamp;
        i = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003) ^ this.key.hashCode()) * 1000003;
        l = this.friendRowId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.friendUserId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendmojiCategories;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendDisplayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendUsername;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.friendmojiString;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Integer num = this.streakLength;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        l = this.streakExpiration;
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
        Boolean bool = this.isOfficial;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        j2 = this.storyMuted;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        l = this.storyRowId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.storyId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.storyFirstUnviewedSnapId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.storyViewed;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyRankingId;
        i = (((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.friendStoryUsername.hashCode()) * 1000003;
        l = this.friendStoryIsViewed;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        j2 = this.friendStoryLatestTimestamp;
        i = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l2 = this.friendStoryLatestExpirationTimestamp;
        i = (((i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ this.friendStoryFirstUnviewedSnapId.hashCode()) * 1000003;
        String str2 = this.displayInteractionUserDisplayName;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.displayInteractionUserUsername;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.lastWriterUsername;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Float f = this.score;
        if (f != null) {
            i2 = f.hashCode();
        }
        return i ^ i2;
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

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final Long lastInteractionUserId() {
        return this.lastInteractionUserId;
    }

    public final String lastWriterUsername() {
        return this.lastWriterUsername;
    }

    public final String notViewedSnapId() {
        return this.notViewedSnapId;
    }

    public final long participantsSize() {
        return this.participantsSize;
    }

    public final Long reverseAddedTimestamp() {
        return this.reverseAddedTimestamp;
    }

    public final Float score() {
        return this.score;
    }

    public final String storyFirstUnviewedSnapId() {
        return this.storyFirstUnviewedSnapId;
    }

    public final String storyId() {
        return this.storyId;
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

    public final Long storyRankingId() {
        return this.storyRankingId;
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
        StringBuilder stringBuilder = new StringBuilder("WithFriendAndStory{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedDisplayName=");
        stringBuilder.append(this.feedDisplayName);
        stringBuilder.append(", participantsSize=");
        stringBuilder.append(this.participantsSize);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", displayTimestamp=");
        stringBuilder.append(this.displayTimestamp);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append(", notViewedSnapId=");
        stringBuilder.append(this.notViewedSnapId);
        stringBuilder.append(", lastInteractionUserId=");
        stringBuilder.append(this.lastInteractionUserId);
        stringBuilder.append(", clearedTimestamp=");
        stringBuilder.append(this.clearedTimestamp);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", friendUserId=");
        stringBuilder.append(this.friendUserId);
        stringBuilder.append(", friendmojiCategories=");
        stringBuilder.append(this.friendmojiCategories);
        stringBuilder.append(", friendDisplayName=");
        stringBuilder.append(this.friendDisplayName);
        stringBuilder.append(", friendUsername=");
        stringBuilder.append(this.friendUsername);
        stringBuilder.append(", friendmojiString=");
        stringBuilder.append(this.friendmojiString);
        stringBuilder.append(", streakLength=");
        stringBuilder.append(this.streakLength);
        stringBuilder.append(", streakExpiration=");
        stringBuilder.append(this.streakExpiration);
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
        stringBuilder.append(", isOfficial=");
        stringBuilder.append(this.isOfficial);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyFirstUnviewedSnapId=");
        stringBuilder.append(this.storyFirstUnviewedSnapId);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyRankingId=");
        stringBuilder.append(this.storyRankingId);
        stringBuilder.append(", friendStoryUsername=");
        stringBuilder.append(this.friendStoryUsername);
        stringBuilder.append(", friendStoryIsViewed=");
        stringBuilder.append(this.friendStoryIsViewed);
        stringBuilder.append(", friendStoryLatestTimestamp=");
        stringBuilder.append(this.friendStoryLatestTimestamp);
        stringBuilder.append(", friendStoryLatestExpirationTimestamp=");
        stringBuilder.append(this.friendStoryLatestExpirationTimestamp);
        stringBuilder.append(", friendStoryFirstUnviewedSnapId=");
        stringBuilder.append(this.friendStoryFirstUnviewedSnapId);
        stringBuilder.append(", displayInteractionUserDisplayName=");
        stringBuilder.append(this.displayInteractionUserDisplayName);
        stringBuilder.append(", displayInteractionUserUsername=");
        stringBuilder.append(this.displayInteractionUserUsername);
        stringBuilder.append(", lastWriterUsername=");
        stringBuilder.append(this.lastWriterUsername);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
