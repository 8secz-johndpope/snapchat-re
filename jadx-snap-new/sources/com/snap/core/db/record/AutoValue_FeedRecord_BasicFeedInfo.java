package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.FeedRecord.BasicFeedInfo;

final class AutoValue_FeedRecord_BasicFeedInfo extends BasicFeedInfo {
    private final long _id;
    private final String feedDisplayName;
    private final String friendAvatarId;
    private final String friendDisplayName;
    private final Long friendLastReadTimestamp;
    private final Long friendRowId;
    private final String friendSelfiedId;
    private final String friendUserName;
    private final boolean isTemporaryGroup;
    private final String key;
    private final FeedKind kind;
    private final String lastWriterUsername;
    private final long messageRetentionInMinutes;
    private final long participantsSize;
    private final String specifiedName;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final Boolean storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;

    AutoValue_FeedRecord_BasicFeedInfo(long j, String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, FeedKind feedKind, long j2, String str8, Long l3, Long l4, Long l5, Boolean bool, Boolean bool2, long j3, boolean z) {
        String str9 = str;
        FeedKind feedKind2 = feedKind;
        this._id = j;
        if (str9 != null) {
            this.key = str9;
            this.friendRowId = l;
            this.feedDisplayName = str2;
            this.specifiedName = str3;
            this.friendDisplayName = str4;
            this.friendUserName = str5;
            this.friendAvatarId = str6;
            this.friendSelfiedId = str7;
            this.friendLastReadTimestamp = l2;
            if (feedKind2 != null) {
                this.kind = feedKind2;
                this.participantsSize = j2;
                this.lastWriterUsername = str8;
                this.storyRowId = l3;
                this.storyLatestExpirationTimestamp = l4;
                this.storyLatestTimestamp = l5;
                this.storyViewed = bool;
                this.storyMuted = bool2;
                this.messageRetentionInMinutes = j3;
                this.isTemporaryGroup = z;
                return;
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BasicFeedInfo) {
            BasicFeedInfo basicFeedInfo = (BasicFeedInfo) obj;
            if (this._id == basicFeedInfo._id() && this.key.equals(basicFeedInfo.key())) {
                Long l = this.friendRowId;
                if (l != null ? !l.equals(basicFeedInfo.friendRowId()) : basicFeedInfo.friendRowId() != null) {
                    String str = this.feedDisplayName;
                    if (str != null ? !str.equals(basicFeedInfo.feedDisplayName()) : basicFeedInfo.feedDisplayName() != null) {
                        str = this.specifiedName;
                        if (str != null ? !str.equals(basicFeedInfo.specifiedName()) : basicFeedInfo.specifiedName() != null) {
                            str = this.friendDisplayName;
                            if (str != null ? !str.equals(basicFeedInfo.friendDisplayName()) : basicFeedInfo.friendDisplayName() != null) {
                                str = this.friendUserName;
                                if (str != null ? !str.equals(basicFeedInfo.friendUserName()) : basicFeedInfo.friendUserName() != null) {
                                    str = this.friendAvatarId;
                                    if (str != null ? !str.equals(basicFeedInfo.friendAvatarId()) : basicFeedInfo.friendAvatarId() != null) {
                                        str = this.friendSelfiedId;
                                        if (str != null ? !str.equals(basicFeedInfo.friendSelfiedId()) : basicFeedInfo.friendSelfiedId() != null) {
                                            l = this.friendLastReadTimestamp;
                                            if (l != null ? !l.equals(basicFeedInfo.friendLastReadTimestamp()) : basicFeedInfo.friendLastReadTimestamp() != null) {
                                                if (this.kind.equals(basicFeedInfo.kind()) && this.participantsSize == basicFeedInfo.participantsSize()) {
                                                    str = this.lastWriterUsername;
                                                    if (str != null ? !str.equals(basicFeedInfo.lastWriterUsername()) : basicFeedInfo.lastWriterUsername() != null) {
                                                        l = this.storyRowId;
                                                        if (l != null ? !l.equals(basicFeedInfo.storyRowId()) : basicFeedInfo.storyRowId() != null) {
                                                            l = this.storyLatestExpirationTimestamp;
                                                            if (l != null ? !l.equals(basicFeedInfo.storyLatestExpirationTimestamp()) : basicFeedInfo.storyLatestExpirationTimestamp() != null) {
                                                                l = this.storyLatestTimestamp;
                                                                if (l != null ? !l.equals(basicFeedInfo.storyLatestTimestamp()) : basicFeedInfo.storyLatestTimestamp() != null) {
                                                                    Boolean bool = this.storyViewed;
                                                                    if (bool != null ? !bool.equals(basicFeedInfo.storyViewed()) : basicFeedInfo.storyViewed() != null) {
                                                                        bool = this.storyMuted;
                                                                        if (bool != null ? !bool.equals(basicFeedInfo.storyMuted()) : basicFeedInfo.storyMuted() != null) {
                                                                            return this.messageRetentionInMinutes == basicFeedInfo.messageRetentionInMinutes() && this.isTemporaryGroup == basicFeedInfo.isTemporaryGroup();
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

    public final String friendAvatarId() {
        return this.friendAvatarId;
    }

    public final String friendDisplayName() {
        return this.friendDisplayName;
    }

    public final Long friendLastReadTimestamp() {
        return this.friendLastReadTimestamp;
    }

    public final Long friendRowId() {
        return this.friendRowId;
    }

    public final String friendSelfiedId() {
        return this.friendSelfiedId;
    }

    public final String friendUserName() {
        return this.friendUserName;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        Long l = this.friendRowId;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.feedDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.specifiedName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendUserName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendSelfiedId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.friendLastReadTimestamp;
        hashCode = (((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003;
        long j2 = this.participantsSize;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        str = this.lastWriterUsername;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        bool = this.storyMuted;
        if (bool != null) {
            i = bool.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        long j3 = this.messageRetentionInMinutes;
        return (this.isTemporaryGroup ? 1231 : 1237) ^ ((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public final boolean isTemporaryGroup() {
        return this.isTemporaryGroup;
    }

    public final String key() {
        return this.key;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final String lastWriterUsername() {
        return this.lastWriterUsername;
    }

    public final long messageRetentionInMinutes() {
        return this.messageRetentionInMinutes;
    }

    public final long participantsSize() {
        return this.participantsSize;
    }

    public final String specifiedName() {
        return this.specifiedName;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final Boolean storyMuted() {
        return this.storyMuted;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BasicFeedInfo{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", feedDisplayName=");
        stringBuilder.append(this.feedDisplayName);
        stringBuilder.append(", specifiedName=");
        stringBuilder.append(this.specifiedName);
        stringBuilder.append(", friendDisplayName=");
        stringBuilder.append(this.friendDisplayName);
        stringBuilder.append(", friendUserName=");
        stringBuilder.append(this.friendUserName);
        stringBuilder.append(", friendAvatarId=");
        stringBuilder.append(this.friendAvatarId);
        stringBuilder.append(", friendSelfiedId=");
        stringBuilder.append(this.friendSelfiedId);
        stringBuilder.append(", friendLastReadTimestamp=");
        stringBuilder.append(this.friendLastReadTimestamp);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", participantsSize=");
        stringBuilder.append(this.participantsSize);
        stringBuilder.append(", lastWriterUsername=");
        stringBuilder.append(this.lastWriterUsername);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", messageRetentionInMinutes=");
        stringBuilder.append(this.messageRetentionInMinutes);
        stringBuilder.append(", isTemporaryGroup=");
        stringBuilder.append(this.isTemporaryGroup);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
