package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.BitmojiInfo;

final class AutoValue_FriendRecord_BitmojiInfo extends BitmojiInfo {
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;

    AutoValue_FriendRecord_BitmojiInfo(String str, String str2) {
        this.bitmojiAvatarId = str;
        this.bitmojiSelfieId = str2;
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
        if (obj instanceof BitmojiInfo) {
            BitmojiInfo bitmojiInfo = (BitmojiInfo) obj;
            String str = this.bitmojiAvatarId;
            if (str != null ? !str.equals(bitmojiInfo.bitmojiAvatarId()) : bitmojiInfo.bitmojiAvatarId() != null) {
                str = this.bitmojiSelfieId;
                return str != null ? !str.equals(bitmojiInfo.bitmojiSelfieId()) : bitmojiInfo.bitmojiSelfieId() != null;
            }
        }
    }

    public final int hashCode() {
        String str = this.bitmojiAvatarId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.bitmojiSelfieId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BitmojiInfo{bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
