package com.snap.core.db.record;

import com.snap.core.db.record.FeedRecord.AvatarInfo;

final class AutoValue_FeedRecord_AvatarInfo extends AvatarInfo {
    private final String bitmojiAvatarId;
    private final String username;

    AutoValue_FeedRecord_AvatarInfo(String str, String str2) {
        this.bitmojiAvatarId = str;
        if (str2 != null) {
            this.username = str2;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String bitmojiAvatarId() {
        return this.bitmojiAvatarId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AvatarInfo) {
            AvatarInfo avatarInfo = (AvatarInfo) obj;
            String str = this.bitmojiAvatarId;
            if (str != null ? !str.equals(avatarInfo.bitmojiAvatarId()) : avatarInfo.bitmojiAvatarId() != null) {
                if (this.username.equals(avatarInfo.username())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.bitmojiAvatarId;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.username.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AvatarInfo{bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}
