package com.snap.core.db.record;

import com.snap.core.db.record.DiscoverFeedStoryRecord.StoryIdModelRecord;

final class AutoValue_DiscoverFeedStoryRecord_StoryIdModelRecord extends StoryIdModelRecord {
    private final long _id;
    private final String storyId;

    AutoValue_DiscoverFeedStoryRecord_StoryIdModelRecord(String str, long j) {
        if (str != null) {
            this.storyId = str;
            this._id = j;
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
        if (obj instanceof StoryIdModelRecord) {
            StoryIdModelRecord storyIdModelRecord = (StoryIdModelRecord) obj;
            return this.storyId.equals(storyIdModelRecord.storyId()) && this._id == storyIdModelRecord._id();
        }
    }

    public final int hashCode() {
        int hashCode = (this.storyId.hashCode() ^ 1000003) * 1000003;
        long j = this._id;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String storyId() {
        return this.storyId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoryIdModelRecord{storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", _id=");
        stringBuilder.append(this._id);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
