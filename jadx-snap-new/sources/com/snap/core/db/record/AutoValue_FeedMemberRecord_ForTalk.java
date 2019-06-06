package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberRecord.ForTalk;

final class AutoValue_FeedMemberRecord_ForTalk extends ForTalk {
    private final String bitmojiAvatarId;
    private final Integer color;
    private final String displayName;
    private final String userId;
    private final String username;
    private final Long videoChatUserId;

    AutoValue_FeedMemberRecord_ForTalk(Integer num, Long l, String str, String str2, String str3, String str4) {
        this.color = num;
        this.videoChatUserId = l;
        this.userId = str;
        if (str2 != null) {
            this.username = str2;
            this.displayName = str3;
            this.bitmojiAvatarId = str4;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String bitmojiAvatarId() {
        return this.bitmojiAvatarId;
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
        if (obj instanceof ForTalk) {
            ForTalk forTalk = (ForTalk) obj;
            Integer num = this.color;
            if (num != null ? !num.equals(forTalk.color()) : forTalk.color() != null) {
                Long l = this.videoChatUserId;
                if (l != null ? !l.equals(forTalk.videoChatUserId()) : forTalk.videoChatUserId() != null) {
                    String str = this.userId;
                    if (str != null ? !str.equals(forTalk.userId()) : forTalk.userId() != null) {
                        if (this.username.equals(forTalk.username())) {
                            str = this.displayName;
                            if (str != null ? !str.equals(forTalk.displayName()) : forTalk.displayName() != null) {
                                str = this.bitmojiAvatarId;
                                return str != null ? !str.equals(forTalk.bitmojiAvatarId()) : forTalk.bitmojiAvatarId() != null;
                            }
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
        Long l = this.videoChatUserId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.userId;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.bitmojiAvatarId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForTalk{color=");
        stringBuilder.append(this.color);
        stringBuilder.append(", videoChatUserId=");
        stringBuilder.append(this.videoChatUserId);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }

    public final String username() {
        return this.username;
    }

    public final Long videoChatUserId() {
        return this.videoChatUserId;
    }
}
