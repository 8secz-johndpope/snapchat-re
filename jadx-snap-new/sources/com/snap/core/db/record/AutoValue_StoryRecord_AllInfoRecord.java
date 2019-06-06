package com.snap.core.db.record;

import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.record.StoryRecord.AllInfoRecord;

final class AutoValue_StoryRecord_AllInfoRecord extends AllInfoRecord {
    private final Boolean StorySnap_viewed;
    private final long _id;
    private final String clientId;
    private final String displayName;
    private final long durationInMs;
    private final Friendmojis emoji;
    private final Long latestTimeStamp;
    private final String storyId;
    private final long storyTimeStamp;
    private final long story_id;
    private final String username;
    private final Boolean viewed;

    AutoValue_StoryRecord_AllInfoRecord(long j, String str, String str2, Long l, Boolean bool, long j2, String str3, String str4, Boolean bool2, long j3, long j4, Friendmojis friendmojis) {
        String str5 = str;
        String str6 = str4;
        this._id = j;
        if (str5 != null) {
            this.storyId = str5;
            this.displayName = str2;
            this.latestTimeStamp = l;
            this.viewed = bool;
            this.story_id = j2;
            this.username = str3;
            if (str6 != null) {
                this.clientId = str6;
                this.StorySnap_viewed = bool2;
                this.durationInMs = j3;
                this.storyTimeStamp = j4;
                this.emoji = friendmojis;
                return;
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null storyId");
    }

    public final Boolean StorySnap_viewed() {
        return this.StorySnap_viewed;
    }

    public final long _id() {
        return this._id;
    }

    public final String clientId() {
        return this.clientId;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final Friendmojis emoji() {
        return this.emoji;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AllInfoRecord) {
            AllInfoRecord allInfoRecord = (AllInfoRecord) obj;
            if (this._id == allInfoRecord._id() && this.storyId.equals(allInfoRecord.storyId())) {
                String str = this.displayName;
                if (str != null ? !str.equals(allInfoRecord.displayName()) : allInfoRecord.displayName() != null) {
                    Long l = this.latestTimeStamp;
                    if (l != null ? !l.equals(allInfoRecord.latestTimeStamp()) : allInfoRecord.latestTimeStamp() != null) {
                        Boolean bool = this.viewed;
                        if (bool != null ? !bool.equals(allInfoRecord.viewed()) : allInfoRecord.viewed() != null) {
                            if (this.story_id == allInfoRecord.story_id()) {
                                str = this.username;
                                if (str != null ? !str.equals(allInfoRecord.username()) : allInfoRecord.username() != null) {
                                    if (this.clientId.equals(allInfoRecord.clientId())) {
                                        bool = this.StorySnap_viewed;
                                        if (bool != null ? !bool.equals(allInfoRecord.StorySnap_viewed()) : allInfoRecord.StorySnap_viewed() != null) {
                                            if (this.durationInMs == allInfoRecord.durationInMs() && this.storyTimeStamp == allInfoRecord.storyTimeStamp()) {
                                                Friendmojis friendmojis = this.emoji;
                                                return friendmojis != null ? !friendmojis.equals(allInfoRecord.emoji()) : allInfoRecord.emoji() != null;
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

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        String str = this.displayName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.latestTimeStamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.viewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        long j2 = this.story_id;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        str = this.username;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.clientId.hashCode()) * 1000003;
        bool = this.StorySnap_viewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        j2 = this.durationInMs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.storyTimeStamp;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Friendmojis friendmojis = this.emoji;
        if (friendmojis != null) {
            i = friendmojis.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long latestTimeStamp() {
        return this.latestTimeStamp;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyTimeStamp() {
        return this.storyTimeStamp;
    }

    public final long story_id() {
        return this.story_id;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AllInfoRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", latestTimeStamp=");
        stringBuilder.append(this.latestTimeStamp);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", story_id=");
        stringBuilder.append(this.story_id);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", StorySnap_viewed=");
        stringBuilder.append(this.StorySnap_viewed);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
        stringBuilder.append(", storyTimeStamp=");
        stringBuilder.append(this.storyTimeStamp);
        stringBuilder.append(", emoji=");
        stringBuilder.append(this.emoji);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }

    public final Boolean viewed() {
        return this.viewed;
    }
}
