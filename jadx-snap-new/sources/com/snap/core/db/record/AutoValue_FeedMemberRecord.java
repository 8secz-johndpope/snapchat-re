package com.snap.core.db.record;

final class AutoValue_FeedMemberRecord extends FeedMemberRecord {
    private final long _id;
    private final Integer color;
    private final long feedRowId;
    private final long friendRowId;
    private final Long joinedTimestamp;
    private final Long lastInteractionTimestamp;
    private final boolean removed;
    private final Long videoChatUserId;

    AutoValue_FeedMemberRecord(long j, long j2, long j3, Integer num, Long l, Long l2, boolean z, Long l3) {
        this._id = j;
        this.feedRowId = j2;
        this.friendRowId = j3;
        this.color = num;
        this.lastInteractionTimestamp = l;
        this.joinedTimestamp = l2;
        this.removed = z;
        this.videoChatUserId = l3;
    }

    public final long _id() {
        return this._id;
    }

    public final Integer color() {
        return this.color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeedMemberRecord) {
            FeedMemberRecord feedMemberRecord = (FeedMemberRecord) obj;
            if (this._id == feedMemberRecord._id() && this.feedRowId == feedMemberRecord.feedRowId() && this.friendRowId == feedMemberRecord.friendRowId()) {
                Integer num = this.color;
                if (num != null ? !num.equals(feedMemberRecord.color()) : feedMemberRecord.color() != null) {
                    Long l = this.lastInteractionTimestamp;
                    if (l != null ? !l.equals(feedMemberRecord.lastInteractionTimestamp()) : feedMemberRecord.lastInteractionTimestamp() != null) {
                        l = this.joinedTimestamp;
                        if (l != null ? !l.equals(feedMemberRecord.joinedTimestamp()) : feedMemberRecord.joinedTimestamp() != null) {
                            if (this.removed == feedMemberRecord.removed()) {
                                l = this.videoChatUserId;
                                return l != null ? !l.equals(feedMemberRecord.videoChatUserId()) : feedMemberRecord.videoChatUserId() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.feedRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.friendRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Integer num = this.color;
        int i2 = 0;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Long l = this.lastInteractionTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.joinedTimestamp;
        i = (((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.removed ? 1231 : 1237)) * 1000003;
        Long l2 = this.videoChatUserId;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final Long joinedTimestamp() {
        return this.joinedTimestamp;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final boolean removed() {
        return this.removed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedMemberRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", color=");
        stringBuilder.append(this.color);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", joinedTimestamp=");
        stringBuilder.append(this.joinedTimestamp);
        stringBuilder.append(", removed=");
        stringBuilder.append(this.removed);
        stringBuilder.append(", videoChatUserId=");
        stringBuilder.append(this.videoChatUserId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Long videoChatUserId() {
        return this.videoChatUserId;
    }
}
