package com.snap.core.db.query;

import com.snap.core.db.query.LegacySearchQueries.GroupStory;

final class AutoValue_LegacySearchQueries_GroupStory extends GroupStory {
    private final String conversationId;
    private final String displayName;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final long storyRowId;
    private final Boolean storyViewed;

    AutoValue_LegacySearchQueries_GroupStory(long j, String str, String str2, Long l, Long l2, Boolean bool) {
        this.storyRowId = j;
        if (str != null) {
            this.conversationId = str;
            this.displayName = str2;
            this.storyLatestExpirationTimestamp = l;
            this.storyLatestTimestamp = l2;
            this.storyViewed = bool;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupStory) {
            GroupStory groupStory = (GroupStory) obj;
            if (this.storyRowId == groupStory.storyRowId() && this.conversationId.equals(groupStory.conversationId())) {
                String str = this.displayName;
                if (str != null ? !str.equals(groupStory.displayName()) : groupStory.displayName() != null) {
                    Long l = this.storyLatestExpirationTimestamp;
                    if (l != null ? !l.equals(groupStory.storyLatestExpirationTimestamp()) : groupStory.storyLatestExpirationTimestamp() != null) {
                        l = this.storyLatestTimestamp;
                        if (l != null ? !l.equals(groupStory.storyLatestTimestamp()) : groupStory.storyLatestTimestamp() != null) {
                            Boolean bool = this.storyViewed;
                            return bool != null ? !bool.equals(groupStory.storyViewed()) : groupStory.storyViewed() != null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this.storyRowId;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.conversationId.hashCode()) * 1000003;
        String str = this.displayName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupStory{storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
