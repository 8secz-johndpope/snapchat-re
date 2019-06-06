package com.snap.core.db.record;

import com.snap.core.db.record.MessagingSnapRecord.DirectSnapsOlderThanTimestamp;

final class AutoValue_MessagingSnapRecord_DirectSnapsOlderThanTimestamp extends DirectSnapsOlderThanTimestamp {
    private final long feedId;
    private final String snapId;

    AutoValue_MessagingSnapRecord_DirectSnapsOlderThanTimestamp(String str, long j) {
        if (str != null) {
            this.snapId = str;
            this.feedId = j;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DirectSnapsOlderThanTimestamp) {
            DirectSnapsOlderThanTimestamp directSnapsOlderThanTimestamp = (DirectSnapsOlderThanTimestamp) obj;
            return this.snapId.equals(directSnapsOlderThanTimestamp.snapId()) && this.feedId == directSnapsOlderThanTimestamp.feedId();
        }
    }

    public final long feedId() {
        return this.feedId;
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        long j = this.feedId;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String snapId() {
        return this.snapId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DirectSnapsOlderThanTimestamp{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", feedId=");
        stringBuilder.append(this.feedId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
