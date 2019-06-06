package com.snap.core.db.query;

import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory;

final class AutoValue_LegacyDiscoverFeedQueries_SnapDbFriendStory extends SnapDbFriendStory {
    private final long _id;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String feedParticipantString;
    private final String feedSpecifiedName;
    private final String firstUnviewedSnapId;
    private final String friendDisplayName;
    private final String friendUserId;
    private final String friendUsername;
    private final GroupStoryType groupStoryType;
    private final String storyDisplayName;
    private final String storyId;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final long storyMuted;
    private final Long storyRankingId;
    private final Boolean storyViewed;

    AutoValue_LegacyDiscoverFeedQueries_SnapDbFriendStory(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j2, GroupStoryType groupStoryType, Boolean bool, Long l, Long l2, Long l3) {
        String str11 = str;
        this._id = j;
        if (str11 != null) {
            this.storyId = str11;
            this.firstUnviewedSnapId = str2;
            this.friendUserId = str3;
            this.friendDisplayName = str4;
            this.friendUsername = str5;
            this.storyDisplayName = str6;
            this.feedSpecifiedName = str7;
            this.feedParticipantString = str8;
            this.bitmojiAvatarId = str9;
            this.bitmojiSelfieId = str10;
            this.storyMuted = j2;
            this.groupStoryType = groupStoryType;
            this.storyViewed = bool;
            this.storyLatestTimestamp = l;
            this.storyLatestExpirationTimestamp = l2;
            this.storyRankingId = l3;
            return;
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
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
        if (obj instanceof SnapDbFriendStory) {
            SnapDbFriendStory snapDbFriendStory = (SnapDbFriendStory) obj;
            if (this._id == snapDbFriendStory._id() && this.storyId.equals(snapDbFriendStory.storyId())) {
                String str = this.firstUnviewedSnapId;
                if (str != null ? !str.equals(snapDbFriendStory.firstUnviewedSnapId()) : snapDbFriendStory.firstUnviewedSnapId() != null) {
                    str = this.friendUserId;
                    if (str != null ? !str.equals(snapDbFriendStory.friendUserId()) : snapDbFriendStory.friendUserId() != null) {
                        str = this.friendDisplayName;
                        if (str != null ? !str.equals(snapDbFriendStory.friendDisplayName()) : snapDbFriendStory.friendDisplayName() != null) {
                            str = this.friendUsername;
                            if (str != null ? !str.equals(snapDbFriendStory.friendUsername()) : snapDbFriendStory.friendUsername() != null) {
                                str = this.storyDisplayName;
                                if (str != null ? !str.equals(snapDbFriendStory.storyDisplayName()) : snapDbFriendStory.storyDisplayName() != null) {
                                    str = this.feedSpecifiedName;
                                    if (str != null ? !str.equals(snapDbFriendStory.feedSpecifiedName()) : snapDbFriendStory.feedSpecifiedName() != null) {
                                        str = this.feedParticipantString;
                                        if (str != null ? !str.equals(snapDbFriendStory.feedParticipantString()) : snapDbFriendStory.feedParticipantString() != null) {
                                            str = this.bitmojiAvatarId;
                                            if (str != null ? !str.equals(snapDbFriendStory.bitmojiAvatarId()) : snapDbFriendStory.bitmojiAvatarId() != null) {
                                                str = this.bitmojiSelfieId;
                                                if (str != null ? !str.equals(snapDbFriendStory.bitmojiSelfieId()) : snapDbFriendStory.bitmojiSelfieId() != null) {
                                                    if (this.storyMuted == snapDbFriendStory.storyMuted()) {
                                                        GroupStoryType groupStoryType = this.groupStoryType;
                                                        if (groupStoryType != null ? !groupStoryType.equals(snapDbFriendStory.groupStoryType()) : snapDbFriendStory.groupStoryType() != null) {
                                                            Boolean bool = this.storyViewed;
                                                            if (bool != null ? !bool.equals(snapDbFriendStory.storyViewed()) : snapDbFriendStory.storyViewed() != null) {
                                                                Long l = this.storyLatestTimestamp;
                                                                if (l != null ? !l.equals(snapDbFriendStory.storyLatestTimestamp()) : snapDbFriendStory.storyLatestTimestamp() != null) {
                                                                    l = this.storyLatestExpirationTimestamp;
                                                                    if (l != null ? !l.equals(snapDbFriendStory.storyLatestExpirationTimestamp()) : snapDbFriendStory.storyLatestExpirationTimestamp() != null) {
                                                                        l = this.storyRankingId;
                                                                        return l != null ? !l.equals(snapDbFriendStory.storyRankingId()) : snapDbFriendStory.storyRankingId() != null;
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

    public final String feedParticipantString() {
        return this.feedParticipantString;
    }

    public final String feedSpecifiedName() {
        return this.feedSpecifiedName;
    }

    public final String firstUnviewedSnapId() {
        return this.firstUnviewedSnapId;
    }

    public final String friendDisplayName() {
        return this.friendDisplayName;
    }

    public final String friendUserId() {
        return this.friendUserId;
    }

    public final String friendUsername() {
        return this.friendUsername;
    }

    public final GroupStoryType groupStoryType() {
        return this.groupStoryType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        String str = this.firstUnviewedSnapId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendUserId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendUsername;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.storyDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.feedSpecifiedName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.feedParticipantString;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.storyMuted;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        GroupStoryType groupStoryType = this.groupStoryType;
        hashCode = (hashCode ^ (groupStoryType == null ? 0 : groupStoryType.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.storyRankingId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String storyDisplayName() {
        return this.storyDisplayName;
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

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapDbFriendStory{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", firstUnviewedSnapId=");
        stringBuilder.append(this.firstUnviewedSnapId);
        stringBuilder.append(", friendUserId=");
        stringBuilder.append(this.friendUserId);
        stringBuilder.append(", friendDisplayName=");
        stringBuilder.append(this.friendDisplayName);
        stringBuilder.append(", friendUsername=");
        stringBuilder.append(this.friendUsername);
        stringBuilder.append(", storyDisplayName=");
        stringBuilder.append(this.storyDisplayName);
        stringBuilder.append(", feedSpecifiedName=");
        stringBuilder.append(this.feedSpecifiedName);
        stringBuilder.append(", feedParticipantString=");
        stringBuilder.append(this.feedParticipantString);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", groupStoryType=");
        stringBuilder.append(this.groupStoryType);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyRankingId=");
        stringBuilder.append(this.storyRankingId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
