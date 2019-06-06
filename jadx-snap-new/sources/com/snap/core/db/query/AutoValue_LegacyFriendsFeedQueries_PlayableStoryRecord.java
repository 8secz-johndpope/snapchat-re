package com.snap.core.db.query;

import com.snap.core.db.query.LegacyFriendsFeedQueries.PlayableStoryRecord;

final class AutoValue_LegacyFriendsFeedQueries_PlayableStoryRecord extends PlayableStoryRecord {
    private final long feedId;
    private final String friendStoryDisplayName;
    private final Long friendStoryIsViewed;
    private final String friendStoryUsername;
    private final String storyId;
    private final Long storyRowId;
    private final String storyUsername;
    private final Boolean storyViewed;

    AutoValue_LegacyFriendsFeedQueries_PlayableStoryRecord(long j, Long l, String str, String str2, Boolean bool, String str3, String str4, Long l2) {
        this.feedId = j;
        this.storyRowId = l;
        this.storyId = str;
        this.storyUsername = str2;
        this.storyViewed = bool;
        if (str3 != null) {
            this.friendStoryUsername = str3;
            this.friendStoryDisplayName = str4;
            this.friendStoryIsViewed = l2;
            return;
        }
        throw new NullPointerException("Null friendStoryUsername");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayableStoryRecord) {
            PlayableStoryRecord playableStoryRecord = (PlayableStoryRecord) obj;
            if (this.feedId == playableStoryRecord.feedId()) {
                Long l = this.storyRowId;
                if (l != null ? !l.equals(playableStoryRecord.storyRowId()) : playableStoryRecord.storyRowId() != null) {
                    String str = this.storyId;
                    if (str != null ? !str.equals(playableStoryRecord.storyId()) : playableStoryRecord.storyId() != null) {
                        str = this.storyUsername;
                        if (str != null ? !str.equals(playableStoryRecord.storyUsername()) : playableStoryRecord.storyUsername() != null) {
                            Boolean bool = this.storyViewed;
                            if (bool != null ? !bool.equals(playableStoryRecord.storyViewed()) : playableStoryRecord.storyViewed() != null) {
                                if (this.friendStoryUsername.equals(playableStoryRecord.friendStoryUsername())) {
                                    str = this.friendStoryDisplayName;
                                    if (str != null ? !str.equals(playableStoryRecord.friendStoryDisplayName()) : playableStoryRecord.friendStoryDisplayName() != null) {
                                        l = this.friendStoryIsViewed;
                                        return l != null ? !l.equals(playableStoryRecord.friendStoryIsViewed()) : playableStoryRecord.friendStoryIsViewed() != null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final long feedId() {
        return this.feedId;
    }

    public final String friendStoryDisplayName() {
        return this.friendStoryDisplayName;
    }

    public final Long friendStoryIsViewed() {
        return this.friendStoryIsViewed;
    }

    public final String friendStoryUsername() {
        return this.friendStoryUsername;
    }

    public final int hashCode() {
        long j = this.feedId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this.storyRowId;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.storyId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.storyUsername;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        i = (((i ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.friendStoryUsername.hashCode()) * 1000003;
        str = this.friendStoryDisplayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l2 = this.friendStoryIsViewed;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final String storyUsername() {
        return this.storyUsername;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayableStoryRecord{feedId=");
        stringBuilder.append(this.feedId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyUsername=");
        stringBuilder.append(this.storyUsername);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", friendStoryUsername=");
        stringBuilder.append(this.friendStoryUsername);
        stringBuilder.append(", friendStoryDisplayName=");
        stringBuilder.append(this.friendStoryDisplayName);
        stringBuilder.append(", friendStoryIsViewed=");
        stringBuilder.append(this.friendStoryIsViewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
