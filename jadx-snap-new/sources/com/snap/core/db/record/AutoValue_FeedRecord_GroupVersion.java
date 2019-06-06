package com.snap.core.db.record;

import com.snap.core.db.record.FeedRecord.GroupVersion;

final class AutoValue_FeedRecord_GroupVersion extends GroupVersion {
    private final long groupVersion;
    private final String key;

    AutoValue_FeedRecord_GroupVersion(String str, long j) {
        if (str != null) {
            this.key = str;
            this.groupVersion = j;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupVersion) {
            GroupVersion groupVersion = (GroupVersion) obj;
            return this.key.equals(groupVersion.key()) && this.groupVersion == groupVersion.groupVersion();
        }
    }

    public final long groupVersion() {
        return this.groupVersion;
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        long j = this.groupVersion;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupVersion{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", groupVersion=");
        stringBuilder.append(this.groupVersion);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
