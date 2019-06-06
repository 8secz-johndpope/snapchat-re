package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapRecord.GroupSnapsOlderThanTimestamp;

final class AutoValue_MessagingSnapRecord_GroupSnapsOlderThanTimestamp extends GroupSnapsOlderThanTimestamp {
    private final long feedId;
    private final SnapServerStatus serverStatus;
    private final String snapId;
    private final long timestamp;

    AutoValue_MessagingSnapRecord_GroupSnapsOlderThanTimestamp(String str, SnapServerStatus snapServerStatus, long j, long j2) {
        if (str != null) {
            this.snapId = str;
            this.serverStatus = snapServerStatus;
            this.timestamp = j;
            this.feedId = j2;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupSnapsOlderThanTimestamp) {
            GroupSnapsOlderThanTimestamp groupSnapsOlderThanTimestamp = (GroupSnapsOlderThanTimestamp) obj;
            if (this.snapId.equals(groupSnapsOlderThanTimestamp.snapId())) {
                SnapServerStatus snapServerStatus = this.serverStatus;
                if (snapServerStatus != null ? !snapServerStatus.equals(groupSnapsOlderThanTimestamp.serverStatus()) : groupSnapsOlderThanTimestamp.serverStatus() != null) {
                    return this.timestamp == groupSnapsOlderThanTimestamp.timestamp() && this.feedId == groupSnapsOlderThanTimestamp.feedId();
                }
            }
        }
    }

    public final long feedId() {
        return this.feedId;
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.feedId;
        return hashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final SnapServerStatus serverStatus() {
        return this.serverStatus;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupSnapsOlderThanTimestamp{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", feedId=");
        stringBuilder.append(this.feedId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
