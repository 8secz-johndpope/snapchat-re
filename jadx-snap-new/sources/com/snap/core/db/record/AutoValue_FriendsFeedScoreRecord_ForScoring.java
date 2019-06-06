package com.snap.core.db.record;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendsFeedScoreRecord.ForScoring;

final class AutoValue_FriendsFeedScoreRecord_ForScoring extends ForScoring {
    private final long _id;
    private final Long addedTimestamp;
    private final CalendarDate birthday;
    private final String displayInteractionType;
    private final String feedKey;
    private final FriendLinkType friendLinkType;
    private final Long friendRowId;
    private final FeedKind kind;
    private final Long lastInteractionTimestamp;
    private final Long lastReadTimestamp;
    private final Float prevInteractionAgeSecs;
    private final Float prevScore;
    private final Long reverseAddedTimestamp;
    private final String serverSignals;
    private final Long storyLatestTimestamp;
    private final long storySkipCount;
    private final Boolean storyViewed;
    private final Long streakExpiration;
    private final Integer streakLength;
    private final String username;

    AutoValue_FriendsFeedScoreRecord_ForScoring(long j, String str, Long l, Long l2, long j2, String str2, FeedKind feedKind, Long l3, Integer num, Long l4, String str3, FriendLinkType friendLinkType, Long l5, Long l6, CalendarDate calendarDate, Float f, Float f2, String str4, Boolean bool, Long l7) {
        String str5 = str;
        FeedKind feedKind2 = feedKind;
        this._id = j;
        if (str5 != null) {
            this.feedKey = str5;
            this.friendRowId = l;
            this.lastInteractionTimestamp = l2;
            this.storySkipCount = j2;
            this.displayInteractionType = str2;
            if (feedKind2 != null) {
                this.kind = feedKind2;
                this.lastReadTimestamp = l3;
                this.streakLength = num;
                this.streakExpiration = l4;
                this.username = str3;
                this.friendLinkType = friendLinkType;
                this.addedTimestamp = l5;
                this.reverseAddedTimestamp = l6;
                this.birthday = calendarDate;
                this.prevScore = f;
                this.prevInteractionAgeSecs = f2;
                this.serverSignals = str4;
                this.storyViewed = bool;
                this.storyLatestTimestamp = l7;
                return;
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null feedKey");
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

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ForScoring) {
            ForScoring forScoring = (ForScoring) obj;
            if (this._id == forScoring._id() && this.feedKey.equals(forScoring.feedKey())) {
                Long l = this.friendRowId;
                if (l != null ? !l.equals(forScoring.friendRowId()) : forScoring.friendRowId() != null) {
                    l = this.lastInteractionTimestamp;
                    if (l != null ? !l.equals(forScoring.lastInteractionTimestamp()) : forScoring.lastInteractionTimestamp() != null) {
                        if (this.storySkipCount == forScoring.storySkipCount()) {
                            String str = this.displayInteractionType;
                            if (str != null ? !str.equals(forScoring.displayInteractionType()) : forScoring.displayInteractionType() != null) {
                                if (this.kind.equals(forScoring.kind())) {
                                    l = this.lastReadTimestamp;
                                    if (l != null ? !l.equals(forScoring.lastReadTimestamp()) : forScoring.lastReadTimestamp() != null) {
                                        Integer num = this.streakLength;
                                        if (num != null ? !num.equals(forScoring.streakLength()) : forScoring.streakLength() != null) {
                                            l = this.streakExpiration;
                                            if (l != null ? !l.equals(forScoring.streakExpiration()) : forScoring.streakExpiration() != null) {
                                                str = this.username;
                                                if (str != null ? !str.equals(forScoring.username()) : forScoring.username() != null) {
                                                    FriendLinkType friendLinkType = this.friendLinkType;
                                                    if (friendLinkType != null ? !friendLinkType.equals(forScoring.friendLinkType()) : forScoring.friendLinkType() != null) {
                                                        l = this.addedTimestamp;
                                                        if (l != null ? !l.equals(forScoring.addedTimestamp()) : forScoring.addedTimestamp() != null) {
                                                            l = this.reverseAddedTimestamp;
                                                            if (l != null ? !l.equals(forScoring.reverseAddedTimestamp()) : forScoring.reverseAddedTimestamp() != null) {
                                                                CalendarDate calendarDate = this.birthday;
                                                                if (calendarDate != null ? !calendarDate.equals(forScoring.birthday()) : forScoring.birthday() != null) {
                                                                    Float f = this.prevScore;
                                                                    if (f != null ? !f.equals(forScoring.prevScore()) : forScoring.prevScore() != null) {
                                                                        f = this.prevInteractionAgeSecs;
                                                                        if (f != null ? !f.equals(forScoring.prevInteractionAgeSecs()) : forScoring.prevInteractionAgeSecs() != null) {
                                                                            str = this.serverSignals;
                                                                            if (str != null ? !str.equals(forScoring.serverSignals()) : forScoring.serverSignals() != null) {
                                                                                Boolean bool = this.storyViewed;
                                                                                if (bool != null ? !bool.equals(forScoring.storyViewed()) : forScoring.storyViewed() != null) {
                                                                                    l = this.storyLatestTimestamp;
                                                                                    return l != null ? !l.equals(forScoring.storyLatestTimestamp()) : forScoring.storyLatestTimestamp() != null;
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

    public final String feedKey() {
        return this.feedKey;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final Long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.feedKey.hashCode()) * 1000003;
        Long l = this.friendRowId;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j2 = this.storySkipCount;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str = this.displayInteractionType;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003;
        Long l2 = this.lastReadTimestamp;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Integer num = this.streakLength;
        hashCode = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        l2 = this.streakExpiration;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        str = this.username;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        hashCode = (hashCode ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        l2 = this.addedTimestamp;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        l2 = this.reverseAddedTimestamp;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        CalendarDate calendarDate = this.birthday;
        hashCode = (hashCode ^ (calendarDate == null ? 0 : calendarDate.hashCode())) * 1000003;
        Float f = this.prevScore;
        hashCode = (hashCode ^ (f == null ? 0 : f.hashCode())) * 1000003;
        f = this.prevInteractionAgeSecs;
        hashCode = (hashCode ^ (f == null ? 0 : f.hashCode())) * 1000003;
        str = this.serverSignals;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l3 = this.storyLatestTimestamp;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode ^ i;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final Long lastReadTimestamp() {
        return this.lastReadTimestamp;
    }

    public final Float prevInteractionAgeSecs() {
        return this.prevInteractionAgeSecs;
    }

    public final Float prevScore() {
        return this.prevScore;
    }

    public final Long reverseAddedTimestamp() {
        return this.reverseAddedTimestamp;
    }

    public final String serverSignals() {
        return this.serverSignals;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final long storySkipCount() {
        return this.storySkipCount;
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
        StringBuilder stringBuilder = new StringBuilder("ForScoring{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedKey=");
        stringBuilder.append(this.feedKey);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", storySkipCount=");
        stringBuilder.append(this.storySkipCount);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", lastReadTimestamp=");
        stringBuilder.append(this.lastReadTimestamp);
        stringBuilder.append(", streakLength=");
        stringBuilder.append(this.streakLength);
        stringBuilder.append(", streakExpiration=");
        stringBuilder.append(this.streakExpiration);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", addedTimestamp=");
        stringBuilder.append(this.addedTimestamp);
        stringBuilder.append(", reverseAddedTimestamp=");
        stringBuilder.append(this.reverseAddedTimestamp);
        stringBuilder.append(", birthday=");
        stringBuilder.append(this.birthday);
        stringBuilder.append(", prevScore=");
        stringBuilder.append(this.prevScore);
        stringBuilder.append(", prevInteractionAgeSecs=");
        stringBuilder.append(this.prevInteractionAgeSecs);
        stringBuilder.append(", serverSignals=");
        stringBuilder.append(this.serverSignals);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}
