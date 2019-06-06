package com.snap.core.db.query;

import com.snap.core.db.query.LegacyDiscoverFeedQueries.FriendFromGroupStory;

final class AutoValue_LegacyDiscoverFeedQueries_FriendFromGroupStory extends FriendFromGroupStory {
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String username;

    AutoValue_LegacyDiscoverFeedQueries_FriendFromGroupStory(String str, String str2, String str3) {
        this.username = str;
        this.bitmojiAvatarId = str2;
        this.bitmojiSelfieId = str3;
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
        if (obj instanceof FriendFromGroupStory) {
            FriendFromGroupStory friendFromGroupStory = (FriendFromGroupStory) obj;
            String str = this.username;
            if (str != null ? !str.equals(friendFromGroupStory.username()) : friendFromGroupStory.username() != null) {
                str = this.bitmojiAvatarId;
                if (str != null ? !str.equals(friendFromGroupStory.bitmojiAvatarId()) : friendFromGroupStory.bitmojiAvatarId() != null) {
                    str = this.bitmojiSelfieId;
                    return str != null ? !str.equals(friendFromGroupStory.bitmojiSelfieId()) : friendFromGroupStory.bitmojiSelfieId() != null;
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.username;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.bitmojiAvatarId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.bitmojiSelfieId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendFromGroupStory{username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}
