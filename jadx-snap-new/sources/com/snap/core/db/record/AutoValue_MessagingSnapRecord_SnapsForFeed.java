package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapRecord.SnapsForFeed;

final class AutoValue_MessagingSnapRecord_SnapsForFeed extends SnapsForFeed {
    private final SnapServerStatus serverStatus;
    private final String snapId;
    private final long timestamp;
    private final String username;

    AutoValue_MessagingSnapRecord_SnapsForFeed(String str, SnapServerStatus snapServerStatus, String str2, long j) {
        if (str != null) {
            this.snapId = str;
            this.serverStatus = snapServerStatus;
            this.username = str2;
            this.timestamp = j;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapsForFeed) {
            SnapsForFeed snapsForFeed = (SnapsForFeed) obj;
            if (this.snapId.equals(snapsForFeed.snapId())) {
                SnapServerStatus snapServerStatus = this.serverStatus;
                if (snapServerStatus != null ? !snapServerStatus.equals(snapsForFeed.serverStatus()) : snapsForFeed.serverStatus() != null) {
                    String str = this.username;
                    if (str != null ? !str.equals(snapsForFeed.username()) : snapsForFeed.username() != null) {
                        if (this.timestamp == snapsForFeed.timestamp()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        int i = 0;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        String str = this.username;
        if (str != null) {
            i = str.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        long j = this.timestamp;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
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
        StringBuilder stringBuilder = new StringBuilder("SnapsForFeed{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}
