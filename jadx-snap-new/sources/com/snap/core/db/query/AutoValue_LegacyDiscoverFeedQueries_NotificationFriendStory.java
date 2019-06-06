package com.snap.core.db.query;

import com.snap.core.db.query.LegacyDiscoverFeedQueries.NotificationFriendStory;

final class AutoValue_LegacyDiscoverFeedQueries_NotificationFriendStory extends NotificationFriendStory {
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String friendDisplayName;
    private final String friendUserId;
    private final String storyId;
    private final Long storyLatestTimestamp;
    private final long storyRowId;

    AutoValue_LegacyDiscoverFeedQueries_NotificationFriendStory(long j, String str, String str2, String str3, String str4, String str5, Long l) {
        this.storyRowId = j;
        if (str != null) {
            this.storyId = str;
            this.friendDisplayName = str2;
            this.friendUserId = str3;
            this.bitmojiAvatarId = str4;
            this.bitmojiSelfieId = str5;
            this.storyLatestTimestamp = l;
            return;
        }
        throw new NullPointerException("Null storyId");
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
        if (obj instanceof NotificationFriendStory) {
            NotificationFriendStory notificationFriendStory = (NotificationFriendStory) obj;
            if (this.storyRowId == notificationFriendStory.storyRowId() && this.storyId.equals(notificationFriendStory.storyId())) {
                String str = this.friendDisplayName;
                if (str != null ? !str.equals(notificationFriendStory.friendDisplayName()) : notificationFriendStory.friendDisplayName() != null) {
                    str = this.friendUserId;
                    if (str != null ? !str.equals(notificationFriendStory.friendUserId()) : notificationFriendStory.friendUserId() != null) {
                        str = this.bitmojiAvatarId;
                        if (str != null ? !str.equals(notificationFriendStory.bitmojiAvatarId()) : notificationFriendStory.bitmojiAvatarId() != null) {
                            str = this.bitmojiSelfieId;
                            if (str != null ? !str.equals(notificationFriendStory.bitmojiSelfieId()) : notificationFriendStory.bitmojiSelfieId() != null) {
                                Long l = this.storyLatestTimestamp;
                                return l != null ? !l.equals(notificationFriendStory.storyLatestTimestamp()) : notificationFriendStory.storyLatestTimestamp() != null;
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

    public final String friendUserId() {
        return this.friendUserId;
    }

    public final int hashCode() {
        long j = this.storyRowId;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        String str = this.friendDisplayName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendUserId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.storyLatestTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotificationFriendStory{storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", friendDisplayName=");
        stringBuilder.append(this.friendDisplayName);
        stringBuilder.append(", friendUserId=");
        stringBuilder.append(this.friendUserId);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
