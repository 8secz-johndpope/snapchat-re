package com.snap.core.db.record;

import com.snap.core.db.record.PublisherSnapPageRecord.StoryInfoRecord;

final class AutoValue_PublisherSnapPageRecord_StoryInfoRecord extends StoryInfoRecord {
    private final long _id;
    private final String storyId;
    private final long storyRowId;

    AutoValue_PublisherSnapPageRecord_StoryInfoRecord(long j, String str, long j2) {
        this._id = j;
        if (str != null) {
            this.storyId = str;
            this.storyRowId = j2;
            return;
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StoryInfoRecord) {
            StoryInfoRecord storyInfoRecord = (StoryInfoRecord) obj;
            return this._id == storyInfoRecord._id() && this.storyId.equals(storyInfoRecord.storyId()) && this.storyRowId == storyInfoRecord.storyRowId();
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        long j2 = this.storyRowId;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoryInfoRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
