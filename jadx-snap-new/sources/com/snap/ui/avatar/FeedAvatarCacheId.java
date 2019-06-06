package com.snap.ui.avatar;

import defpackage.akcr;

final class FeedAvatarCacheId {
    private final long feedId;
    private final String lastWriterUsername;
    private final String typingUsername;

    public FeedAvatarCacheId(long j, String str, String str2) {
        this.feedId = j;
        this.typingUsername = str;
        this.lastWriterUsername = str2;
    }

    public static /* synthetic */ FeedAvatarCacheId copy$default(FeedAvatarCacheId feedAvatarCacheId, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = feedAvatarCacheId.feedId;
        }
        if ((i & 2) != 0) {
            str = feedAvatarCacheId.typingUsername;
        }
        if ((i & 4) != 0) {
            str2 = feedAvatarCacheId.lastWriterUsername;
        }
        return feedAvatarCacheId.copy(j, str, str2);
    }

    public final long component1() {
        return this.feedId;
    }

    public final String component2() {
        return this.typingUsername;
    }

    public final String component3() {
        return this.lastWriterUsername;
    }

    public final FeedAvatarCacheId copy(long j, String str, String str2) {
        return new FeedAvatarCacheId(j, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedAvatarCacheId) {
                FeedAvatarCacheId feedAvatarCacheId = (FeedAvatarCacheId) obj;
                if (!((this.feedId == feedAvatarCacheId.feedId ? 1 : null) != null && akcr.a(this.typingUsername, feedAvatarCacheId.typingUsername) && akcr.a(this.lastWriterUsername, feedAvatarCacheId.lastWriterUsername))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long getFeedId() {
        return this.feedId;
    }

    public final String getLastWriterUsername() {
        return this.lastWriterUsername;
    }

    public final String getTypingUsername() {
        return this.typingUsername;
    }

    public final int hashCode() {
        long j = this.feedId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.typingUsername;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.lastWriterUsername;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedAvatarCacheId(feedId=");
        stringBuilder.append(this.feedId);
        stringBuilder.append(", typingUsername=");
        stringBuilder.append(this.typingUsername);
        stringBuilder.append(", lastWriterUsername=");
        stringBuilder.append(this.lastWriterUsername);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
