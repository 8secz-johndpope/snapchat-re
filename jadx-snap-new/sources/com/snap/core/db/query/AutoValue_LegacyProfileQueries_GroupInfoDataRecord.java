package com.snap.core.db.query;

import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.query.LegacyProfileQueries.GroupInfoDataRecord;

final class AutoValue_LegacyProfileQueries_GroupInfoDataRecord extends GroupInfoDataRecord {
    private final long _id;
    private final String displayInteractionUserDisplayName;
    private final String displayInteractionUserUsername;
    private final Long groupLastInteractionTimestamp;
    private final GroupStoryType groupStoryType;
    private final String key;
    private final Long lastInteractionTimestamp;
    private final long participantsSize;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final Boolean storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;

    AutoValue_LegacyProfileQueries_GroupInfoDataRecord(long j, String str, long j2, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, GroupStoryType groupStoryType, Boolean bool2, String str2, String str3) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.participantsSize = j2;
            this.lastInteractionTimestamp = l;
            this.groupLastInteractionTimestamp = l2;
            this.storyRowId = l3;
            this.storyLatestExpirationTimestamp = l4;
            this.storyLatestTimestamp = l5;
            this.storyViewed = bool;
            this.groupStoryType = groupStoryType;
            this.storyMuted = bool2;
            this.displayInteractionUserDisplayName = str2;
            this.displayInteractionUserUsername = str3;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayInteractionUserDisplayName() {
        return this.displayInteractionUserDisplayName;
    }

    public final String displayInteractionUserUsername() {
        return this.displayInteractionUserUsername;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupInfoDataRecord) {
            GroupInfoDataRecord groupInfoDataRecord = (GroupInfoDataRecord) obj;
            if (this._id == groupInfoDataRecord._id() && this.key.equals(groupInfoDataRecord.key()) && this.participantsSize == groupInfoDataRecord.participantsSize()) {
                Long l = this.lastInteractionTimestamp;
                if (l != null ? !l.equals(groupInfoDataRecord.lastInteractionTimestamp()) : groupInfoDataRecord.lastInteractionTimestamp() != null) {
                    l = this.groupLastInteractionTimestamp;
                    if (l != null ? !l.equals(groupInfoDataRecord.groupLastInteractionTimestamp()) : groupInfoDataRecord.groupLastInteractionTimestamp() != null) {
                        l = this.storyRowId;
                        if (l != null ? !l.equals(groupInfoDataRecord.storyRowId()) : groupInfoDataRecord.storyRowId() != null) {
                            l = this.storyLatestExpirationTimestamp;
                            if (l != null ? !l.equals(groupInfoDataRecord.storyLatestExpirationTimestamp()) : groupInfoDataRecord.storyLatestExpirationTimestamp() != null) {
                                l = this.storyLatestTimestamp;
                                if (l != null ? !l.equals(groupInfoDataRecord.storyLatestTimestamp()) : groupInfoDataRecord.storyLatestTimestamp() != null) {
                                    Boolean bool = this.storyViewed;
                                    if (bool != null ? !bool.equals(groupInfoDataRecord.storyViewed()) : groupInfoDataRecord.storyViewed() != null) {
                                        GroupStoryType groupStoryType = this.groupStoryType;
                                        if (groupStoryType != null ? !groupStoryType.equals(groupInfoDataRecord.groupStoryType()) : groupInfoDataRecord.groupStoryType() != null) {
                                            bool = this.storyMuted;
                                            if (bool != null ? !bool.equals(groupInfoDataRecord.storyMuted()) : groupInfoDataRecord.storyMuted() != null) {
                                                String str = this.displayInteractionUserDisplayName;
                                                if (str != null ? !str.equals(groupInfoDataRecord.displayInteractionUserDisplayName()) : groupInfoDataRecord.displayInteractionUserDisplayName() != null) {
                                                    str = this.displayInteractionUserUsername;
                                                    return str != null ? !str.equals(groupInfoDataRecord.displayInteractionUserUsername()) : groupInfoDataRecord.displayInteractionUserUsername() != null;
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
    }

    public final Long groupLastInteractionTimestamp() {
        return this.groupLastInteractionTimestamp;
    }

    public final GroupStoryType groupStoryType() {
        return this.groupStoryType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        long j2 = this.participantsSize;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.lastInteractionTimestamp;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.groupLastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        GroupStoryType groupStoryType = this.groupStoryType;
        hashCode = (hashCode ^ (groupStoryType == null ? 0 : groupStoryType.hashCode())) * 1000003;
        bool = this.storyMuted;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str = this.displayInteractionUserDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.displayInteractionUserUsername;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final long participantsSize() {
        return this.participantsSize;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final Boolean storyMuted() {
        return this.storyMuted;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupInfoDataRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", participantsSize=");
        stringBuilder.append(this.participantsSize);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", groupLastInteractionTimestamp=");
        stringBuilder.append(this.groupLastInteractionTimestamp);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", groupStoryType=");
        stringBuilder.append(this.groupStoryType);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append(", displayInteractionUserDisplayName=");
        stringBuilder.append(this.displayInteractionUserDisplayName);
        stringBuilder.append(", displayInteractionUserUsername=");
        stringBuilder.append(this.displayInteractionUserUsername);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
