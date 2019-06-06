package com.snap.core.db.query;

import com.snap.core.db.query.LegacyProfileQueries.SharedGroupInfo;

final class AutoValue_LegacyProfileQueries_SharedGroupInfo extends SharedGroupInfo {
    private final long feedRowId;
    private final long friendRowId;

    AutoValue_LegacyProfileQueries_SharedGroupInfo(long j, long j2) {
        this.feedRowId = j;
        this.friendRowId = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SharedGroupInfo) {
            SharedGroupInfo sharedGroupInfo = (SharedGroupInfo) obj;
            return this.feedRowId == sharedGroupInfo.feedRowId() && this.friendRowId == sharedGroupInfo.friendRowId();
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this.feedRowId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.friendRowId;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SharedGroupInfo{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
