package com.snap.core.db.record;

import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryRecord.UserManagedStoryRecord;

final class AutoValue_StoryRecord_UserManagedStoryRecord extends UserManagedStoryRecord {
    private final long _id;
    private final StoryKind kind;

    AutoValue_StoryRecord_UserManagedStoryRecord(long j, StoryKind storyKind) {
        this._id = j;
        if (storyKind != null) {
            this.kind = storyKind;
            return;
        }
        throw new NullPointerException("Null kind");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserManagedStoryRecord) {
            UserManagedStoryRecord userManagedStoryRecord = (UserManagedStoryRecord) obj;
            return this._id == userManagedStoryRecord._id() && this.kind.equals(userManagedStoryRecord.kind());
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.kind.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final StoryKind kind() {
        return this.kind;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserManagedStoryRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
