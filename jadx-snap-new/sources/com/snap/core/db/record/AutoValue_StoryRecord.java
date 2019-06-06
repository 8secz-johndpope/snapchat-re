package com.snap.core.db.record;

import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.StoryKind;

final class AutoValue_StoryRecord extends StoryRecord {
    private final long _id;
    private final String displayName;
    private final GroupStoryType groupStoryType;
    private final Boolean isLocal;
    private final Boolean isPostable;
    private final StoryKind kind;
    private final Long latestExpirationTimestamp;
    private final Long latestTimeStamp;
    private final String profileDescription;
    private final Long rankingId;
    private final String sharedId;
    private final String storyId;
    private final String userName;
    private final Boolean viewed;

    AutoValue_StoryRecord(long j, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Long l2, Boolean bool2, StoryKind storyKind, GroupStoryType groupStoryType, Boolean bool3, Long l3) {
        this._id = j;
        if (str != null) {
            this.storyId = str;
            this.userName = str2;
            this.displayName = str3;
            this.isLocal = bool;
            this.profileDescription = str4;
            this.sharedId = str5;
            this.latestTimeStamp = l;
            this.latestExpirationTimestamp = l2;
            this.viewed = bool2;
            if (storyKind != null) {
                this.kind = storyKind;
                this.groupStoryType = groupStoryType;
                this.isPostable = bool3;
                this.rankingId = l3;
                return;
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StoryRecord) {
            StoryRecord storyRecord = (StoryRecord) obj;
            if (this._id == storyRecord._id() && this.storyId.equals(storyRecord.storyId())) {
                String str = this.userName;
                if (str != null ? !str.equals(storyRecord.userName()) : storyRecord.userName() != null) {
                    str = this.displayName;
                    if (str != null ? !str.equals(storyRecord.displayName()) : storyRecord.displayName() != null) {
                        Boolean bool = this.isLocal;
                        if (bool != null ? !bool.equals(storyRecord.isLocal()) : storyRecord.isLocal() != null) {
                            str = this.profileDescription;
                            if (str != null ? !str.equals(storyRecord.profileDescription()) : storyRecord.profileDescription() != null) {
                                str = this.sharedId;
                                if (str != null ? !str.equals(storyRecord.sharedId()) : storyRecord.sharedId() != null) {
                                    Long l = this.latestTimeStamp;
                                    if (l != null ? !l.equals(storyRecord.latestTimeStamp()) : storyRecord.latestTimeStamp() != null) {
                                        l = this.latestExpirationTimestamp;
                                        if (l != null ? !l.equals(storyRecord.latestExpirationTimestamp()) : storyRecord.latestExpirationTimestamp() != null) {
                                            bool = this.viewed;
                                            if (bool != null ? !bool.equals(storyRecord.viewed()) : storyRecord.viewed() != null) {
                                                if (this.kind.equals(storyRecord.kind())) {
                                                    GroupStoryType groupStoryType = this.groupStoryType;
                                                    if (groupStoryType != null ? !groupStoryType.equals(storyRecord.groupStoryType()) : storyRecord.groupStoryType() != null) {
                                                        bool = this.isPostable;
                                                        if (bool != null ? !bool.equals(storyRecord.isPostable()) : storyRecord.isPostable() != null) {
                                                            l = this.rankingId;
                                                            return l != null ? !l.equals(storyRecord.rankingId()) : storyRecord.rankingId() != null;
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
        }
    }

    public final GroupStoryType groupStoryType() {
        return this.groupStoryType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        String str = this.userName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.isLocal;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.profileDescription;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.sharedId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.latestTimeStamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.latestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        bool = this.viewed;
        hashCode = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003;
        GroupStoryType groupStoryType = this.groupStoryType;
        hashCode = (hashCode ^ (groupStoryType == null ? 0 : groupStoryType.hashCode())) * 1000003;
        bool = this.isPostable;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l2 = this.rankingId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isLocal() {
        return this.isLocal;
    }

    public final Boolean isPostable() {
        return this.isPostable;
    }

    public final StoryKind kind() {
        return this.kind;
    }

    public final Long latestExpirationTimestamp() {
        return this.latestExpirationTimestamp;
    }

    public final Long latestTimeStamp() {
        return this.latestTimeStamp;
    }

    public final String profileDescription() {
        return this.profileDescription;
    }

    public final Long rankingId() {
        return this.rankingId;
    }

    public final String sharedId() {
        return this.sharedId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoryRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", userName=");
        stringBuilder.append(this.userName);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", isLocal=");
        stringBuilder.append(this.isLocal);
        stringBuilder.append(", profileDescription=");
        stringBuilder.append(this.profileDescription);
        stringBuilder.append(", sharedId=");
        stringBuilder.append(this.sharedId);
        stringBuilder.append(", latestTimeStamp=");
        stringBuilder.append(this.latestTimeStamp);
        stringBuilder.append(", latestExpirationTimestamp=");
        stringBuilder.append(this.latestExpirationTimestamp);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", groupStoryType=");
        stringBuilder.append(this.groupStoryType);
        stringBuilder.append(", isPostable=");
        stringBuilder.append(this.isPostable);
        stringBuilder.append(", rankingId=");
        stringBuilder.append(this.rankingId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userName() {
        return this.userName;
    }

    public final Boolean viewed() {
        return this.viewed;
    }
}
