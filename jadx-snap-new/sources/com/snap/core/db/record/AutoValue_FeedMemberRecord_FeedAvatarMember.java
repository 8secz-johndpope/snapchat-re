package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberRecord.FeedAvatarMember;

final class AutoValue_FeedMemberRecord_FeedAvatarMember extends FeedAvatarMember {
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final Integer color;
    private final String displayName;
    private final String username;

    AutoValue_FeedMemberRecord_FeedAvatarMember(Integer num, String str, String str2, String str3, String str4) {
        this.color = num;
        this.displayName = str;
        if (str2 != null) {
            this.username = str2;
            this.bitmojiAvatarId = str3;
            this.bitmojiSelfieId = str4;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String bitmojiAvatarId() {
        return this.bitmojiAvatarId;
    }

    public final String bitmojiSelfieId() {
        return this.bitmojiSelfieId;
    }

    public final Integer color() {
        return this.color;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeedAvatarMember) {
            FeedAvatarMember feedAvatarMember = (FeedAvatarMember) obj;
            Integer num = this.color;
            if (num != null ? !num.equals(feedAvatarMember.color()) : feedAvatarMember.color() != null) {
                String str = this.displayName;
                if (str != null ? !str.equals(feedAvatarMember.displayName()) : feedAvatarMember.displayName() != null) {
                    if (this.username.equals(feedAvatarMember.username())) {
                        str = this.bitmojiAvatarId;
                        if (str != null ? !str.equals(feedAvatarMember.bitmojiAvatarId()) : feedAvatarMember.bitmojiAvatarId() != null) {
                            str = this.bitmojiSelfieId;
                            return str != null ? !str.equals(feedAvatarMember.bitmojiSelfieId()) : feedAvatarMember.bitmojiSelfieId() != null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        Integer num = this.color;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.displayName;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        str = this.bitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.bitmojiSelfieId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedAvatarMember{color=");
        stringBuilder.append(this.color);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", username=");
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
