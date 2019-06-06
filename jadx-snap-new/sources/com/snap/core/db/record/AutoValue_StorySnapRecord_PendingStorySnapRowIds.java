package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.PendingStorySnapRowIds;

final class AutoValue_StorySnapRecord_PendingStorySnapRowIds extends PendingStorySnapRowIds {
    private final long id;
    private final long snapRowId;

    AutoValue_StorySnapRecord_PendingStorySnapRowIds(long j, long j2) {
        this.id = j;
        this.snapRowId = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PendingStorySnapRowIds) {
            PendingStorySnapRowIds pendingStorySnapRowIds = (PendingStorySnapRowIds) obj;
            return this.id == pendingStorySnapRowIds.id() && this.snapRowId == pendingStorySnapRowIds.snapRowId();
        }
    }

    public final int hashCode() {
        long j = this.id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.snapRowId;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final long id() {
        return this.id;
    }

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PendingStorySnapRowIds{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
