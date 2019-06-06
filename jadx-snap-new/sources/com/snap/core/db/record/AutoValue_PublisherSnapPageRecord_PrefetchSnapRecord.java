package com.snap.core.db.record;

import com.snap.core.db.record.PublisherSnapPageRecord.PrefetchSnapRecord;

final class AutoValue_PublisherSnapPageRecord_PrefetchSnapRecord extends PrefetchSnapRecord {
    private final Long lastView;
    private final long pageId;
    private final Long publishTimestampMs;

    AutoValue_PublisherSnapPageRecord_PrefetchSnapRecord(long j, Long l, Long l2) {
        this.pageId = j;
        this.publishTimestampMs = l;
        this.lastView = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrefetchSnapRecord) {
            PrefetchSnapRecord prefetchSnapRecord = (PrefetchSnapRecord) obj;
            if (this.pageId == prefetchSnapRecord.pageId()) {
                Long l = this.publishTimestampMs;
                if (l != null ? !l.equals(prefetchSnapRecord.publishTimestampMs()) : prefetchSnapRecord.publishTimestampMs() != null) {
                    l = this.lastView;
                    return l != null ? !l.equals(prefetchSnapRecord.lastView()) : prefetchSnapRecord.lastView() != null;
                }
            }
        }
    }

    public final int hashCode() {
        long j = this.pageId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this.publishTimestampMs;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.lastView;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final Long lastView() {
        return this.lastView;
    }

    public final long pageId() {
        return this.pageId;
    }

    public final Long publishTimestampMs() {
        return this.publishTimestampMs;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PrefetchSnapRecord{pageId=");
        stringBuilder.append(this.pageId);
        stringBuilder.append(", publishTimestampMs=");
        stringBuilder.append(this.publishTimestampMs);
        stringBuilder.append(", lastView=");
        stringBuilder.append(this.lastView);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
