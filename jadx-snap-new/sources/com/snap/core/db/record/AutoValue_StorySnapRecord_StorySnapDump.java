package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.StorySnapDump;

final class AutoValue_StorySnapRecord_StorySnapDump extends StorySnapDump {
    private final String storyId;
    private final Long storyLatestExpirationTimestamp;
    private final Long storySnapExpirationTimestamp;
    private final long storySnapRowId;
    private final String storySnapUsername;
    private final Boolean storySnapViewed;
    private final String storyUsername;
    private final Boolean storyViewed;

    AutoValue_StorySnapRecord_StorySnapDump(String str, long j, String str2, Boolean bool, Long l, String str3, Boolean bool2, Long l2) {
        this.storyUsername = str;
        this.storySnapRowId = j;
        this.storySnapUsername = str2;
        this.storySnapViewed = bool;
        this.storySnapExpirationTimestamp = l;
        this.storyId = str3;
        this.storyViewed = bool2;
        this.storyLatestExpirationTimestamp = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorySnapDump) {
            StorySnapDump storySnapDump = (StorySnapDump) obj;
            String str = this.storyUsername;
            if (str != null ? !str.equals(storySnapDump.storyUsername()) : storySnapDump.storyUsername() != null) {
                if (this.storySnapRowId == storySnapDump.storySnapRowId()) {
                    str = this.storySnapUsername;
                    if (str != null ? !str.equals(storySnapDump.storySnapUsername()) : storySnapDump.storySnapUsername() != null) {
                        Boolean bool = this.storySnapViewed;
                        if (bool != null ? !bool.equals(storySnapDump.storySnapViewed()) : storySnapDump.storySnapViewed() != null) {
                            Long l = this.storySnapExpirationTimestamp;
                            if (l != null ? !l.equals(storySnapDump.storySnapExpirationTimestamp()) : storySnapDump.storySnapExpirationTimestamp() != null) {
                                str = this.storyId;
                                if (str != null ? !str.equals(storySnapDump.storyId()) : storySnapDump.storyId() != null) {
                                    bool = this.storyViewed;
                                    if (bool != null ? !bool.equals(storySnapDump.storyViewed()) : storySnapDump.storyViewed() != null) {
                                        l = this.storyLatestExpirationTimestamp;
                                        return l != null ? !l.equals(storySnapDump.storyLatestExpirationTimestamp()) : storySnapDump.storyLatestExpirationTimestamp() != null;
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
        String str = this.storyUsername;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        long j = this.storySnapRowId;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.storySnapUsername;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.storySnapViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.storySnapExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str2 = this.storyId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l2 = this.storyLatestExpirationTimestamp;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storySnapExpirationTimestamp() {
        return this.storySnapExpirationTimestamp;
    }

    public final long storySnapRowId() {
        return this.storySnapRowId;
    }

    public final String storySnapUsername() {
        return this.storySnapUsername;
    }

    public final Boolean storySnapViewed() {
        return this.storySnapViewed;
    }

    public final String storyUsername() {
        return this.storyUsername;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySnapDump{storyUsername=");
        stringBuilder.append(this.storyUsername);
        stringBuilder.append(", storySnapRowId=");
        stringBuilder.append(this.storySnapRowId);
        stringBuilder.append(", storySnapUsername=");
        stringBuilder.append(this.storySnapUsername);
        stringBuilder.append(", storySnapViewed=");
        stringBuilder.append(this.storySnapViewed);
        stringBuilder.append(", storySnapExpirationTimestamp=");
        stringBuilder.append(this.storySnapExpirationTimestamp);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
