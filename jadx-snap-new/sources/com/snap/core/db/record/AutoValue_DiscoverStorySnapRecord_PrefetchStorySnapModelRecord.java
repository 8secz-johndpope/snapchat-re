package com.snap.core.db.record;

import com.snap.core.db.record.DiscoverStorySnapRecord.PrefetchStorySnapModelRecord;

final class AutoValue_DiscoverStorySnapRecord_PrefetchStorySnapModelRecord extends PrefetchStorySnapModelRecord {
    private final long _id;
    private final long creationTimestampMs;
    private final Long lastView;
    private final String streamingMetadataUrl;

    AutoValue_DiscoverStorySnapRecord_PrefetchStorySnapModelRecord(long j, String str, Long l, long j2) {
        this._id = j;
        this.streamingMetadataUrl = str;
        this.lastView = l;
        this.creationTimestampMs = j2;
    }

    public final long _id() {
        return this._id;
    }

    public final long creationTimestampMs() {
        return this.creationTimestampMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrefetchStorySnapModelRecord) {
            PrefetchStorySnapModelRecord prefetchStorySnapModelRecord = (PrefetchStorySnapModelRecord) obj;
            if (this._id == prefetchStorySnapModelRecord._id()) {
                String str = this.streamingMetadataUrl;
                if (str != null ? !str.equals(prefetchStorySnapModelRecord.streamingMetadataUrl()) : prefetchStorySnapModelRecord.streamingMetadataUrl() != null) {
                    Long l = this.lastView;
                    if (l != null ? !l.equals(prefetchStorySnapModelRecord.lastView()) : prefetchStorySnapModelRecord.lastView() != null) {
                        if (this.creationTimestampMs == prefetchStorySnapModelRecord.creationTimestampMs()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.streamingMetadataUrl;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.lastView;
        if (l != null) {
            i2 = l.hashCode();
        }
        i = (i ^ i2) * 1000003;
        long j2 = this.creationTimestampMs;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final Long lastView() {
        return this.lastView;
    }

    public final String streamingMetadataUrl() {
        return this.streamingMetadataUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PrefetchStorySnapModelRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", streamingMetadataUrl=");
        stringBuilder.append(this.streamingMetadataUrl);
        stringBuilder.append(", lastView=");
        stringBuilder.append(this.lastView);
        stringBuilder.append(", creationTimestampMs=");
        stringBuilder.append(this.creationTimestampMs);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
