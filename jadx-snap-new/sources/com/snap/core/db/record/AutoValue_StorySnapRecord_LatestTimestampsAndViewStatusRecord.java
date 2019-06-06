package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord;

final class AutoValue_StorySnapRecord_LatestTimestampsAndViewStatusRecord extends LatestTimestampsAndViewStatusRecord {
    private final Long expirationTimestamp;
    private final long latestTimestamp;
    private final long storyRowId;
    private final Boolean viewed;

    AutoValue_StorySnapRecord_LatestTimestampsAndViewStatusRecord(long j, long j2, Long l, Boolean bool) {
        this.storyRowId = j;
        this.latestTimestamp = j2;
        this.expirationTimestamp = l;
        this.viewed = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LatestTimestampsAndViewStatusRecord) {
            LatestTimestampsAndViewStatusRecord latestTimestampsAndViewStatusRecord = (LatestTimestampsAndViewStatusRecord) obj;
            if (this.storyRowId == latestTimestampsAndViewStatusRecord.storyRowId() && this.latestTimestamp == latestTimestampsAndViewStatusRecord.latestTimestamp()) {
                Long l = this.expirationTimestamp;
                if (l != null ? !l.equals(latestTimestampsAndViewStatusRecord.expirationTimestamp()) : latestTimestampsAndViewStatusRecord.expirationTimestamp() != null) {
                    Boolean bool = this.viewed;
                    return bool != null ? !bool.equals(latestTimestampsAndViewStatusRecord.viewed()) : latestTimestampsAndViewStatusRecord.viewed() != null;
                }
            }
        }
    }

    public final Long expirationTimestamp() {
        return this.expirationTimestamp;
    }

    public final int hashCode() {
        long j = this.storyRowId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.latestTimestamp;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.expirationTimestamp;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.viewed;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i ^ i2;
    }

    public final long latestTimestamp() {
        return this.latestTimestamp;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LatestTimestampsAndViewStatusRecord{storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", latestTimestamp=");
        stringBuilder.append(this.latestTimestamp);
        stringBuilder.append(", expirationTimestamp=");
        stringBuilder.append(this.expirationTimestamp);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Boolean viewed() {
        return this.viewed;
    }
}
