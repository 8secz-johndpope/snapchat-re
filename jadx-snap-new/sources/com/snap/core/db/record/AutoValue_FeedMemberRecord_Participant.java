package com.snap.core.db.record;

import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.record.FeedMemberRecord.Participant;

final class AutoValue_FeedMemberRecord_Participant extends Participant {
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final Integer color;
    private final String displayName;
    private final long friendRowId;
    private final Friendmojis friendmojis;
    private final String userId;
    private final String username;

    AutoValue_FeedMemberRecord_Participant(long j, Integer num, String str, String str2, String str3, String str4, String str5, Friendmojis friendmojis) {
        this.friendRowId = j;
        this.color = num;
        this.userId = str;
        this.displayName = str2;
        if (str3 != null) {
            this.username = str3;
            this.bitmojiAvatarId = str4;
            this.bitmojiSelfieId = str5;
            this.friendmojis = friendmojis;
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
        if (obj instanceof Participant) {
            Participant participant = (Participant) obj;
            if (this.friendRowId == participant.friendRowId()) {
                Integer num = this.color;
                if (num != null ? !num.equals(participant.color()) : participant.color() != null) {
                    String str = this.userId;
                    if (str != null ? !str.equals(participant.userId()) : participant.userId() != null) {
                        str = this.displayName;
                        if (str != null ? !str.equals(participant.displayName()) : participant.displayName() != null) {
                            if (this.username.equals(participant.username())) {
                                str = this.bitmojiAvatarId;
                                if (str != null ? !str.equals(participant.bitmojiAvatarId()) : participant.bitmojiAvatarId() != null) {
                                    str = this.bitmojiSelfieId;
                                    if (str != null ? !str.equals(participant.bitmojiSelfieId()) : participant.bitmojiSelfieId() != null) {
                                        Friendmojis friendmojis = this.friendmojis;
                                        return friendmojis != null ? !friendmojis.equals(participant.friendmojis()) : participant.friendmojis() != null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final Friendmojis friendmojis() {
        return this.friendmojis;
    }

    public final int hashCode() {
        long j = this.friendRowId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.color;
        int i2 = 0;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.userId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        str = this.bitmojiAvatarId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Friendmojis friendmojis = this.friendmojis;
        if (friendmojis != null) {
            i2 = friendmojis.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Participant{friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", color=");
        stringBuilder.append(this.color);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", friendmojis=");
        stringBuilder.append(this.friendmojis);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }

    public final String username() {
        return this.username;
    }
}
