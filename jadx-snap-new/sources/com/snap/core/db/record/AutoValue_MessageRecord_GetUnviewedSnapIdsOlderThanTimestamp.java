package com.snap.core.db.record;

import com.snap.core.db.record.MessageRecord.GetUnviewedSnapIdsOlderThanTimestamp;

final class AutoValue_MessageRecord_GetUnviewedSnapIdsOlderThanTimestamp extends GetUnviewedSnapIdsOlderThanTimestamp {
    private final Long feedRowId;
    private final String key;

    AutoValue_MessageRecord_GetUnviewedSnapIdsOlderThanTimestamp(String str, Long l) {
        if (str != null) {
            this.key = str;
            this.feedRowId = l;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetUnviewedSnapIdsOlderThanTimestamp) {
            GetUnviewedSnapIdsOlderThanTimestamp getUnviewedSnapIdsOlderThanTimestamp = (GetUnviewedSnapIdsOlderThanTimestamp) obj;
            if (this.key.equals(getUnviewedSnapIdsOlderThanTimestamp.key())) {
                Long l = this.feedRowId;
                return l != null ? !l.equals(getUnviewedSnapIdsOlderThanTimestamp.feedRowId()) : getUnviewedSnapIdsOlderThanTimestamp.feedRowId() != null;
            }
        }
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        Long l = this.feedRowId;
        return hashCode ^ (l == null ? 0 : l.hashCode());
    }

    public final String key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetUnviewedSnapIdsOlderThanTimestamp{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
