package com.snap.core.db.record;

import com.snap.core.db.column.FeatureType;

final class AutoValue_DiscoverFeedStoryRecord extends DiscoverFeedStoryRecord {
    private final long _id;
    private final FeatureType featureType;
    private final String storyId;
    private final long timestamp;

    AutoValue_DiscoverFeedStoryRecord(long j, String str, FeatureType featureType, long j2) {
        this._id = j;
        if (str != null) {
            this.storyId = str;
            if (featureType != null) {
                this.featureType = featureType;
                this.timestamp = j2;
                return;
            }
            throw new NullPointerException("Null featureType");
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DiscoverFeedStoryRecord) {
            DiscoverFeedStoryRecord discoverFeedStoryRecord = (DiscoverFeedStoryRecord) obj;
            return this._id == discoverFeedStoryRecord._id() && this.storyId.equals(discoverFeedStoryRecord.storyId()) && this.featureType.equals(discoverFeedStoryRecord.featureType()) && this.timestamp == discoverFeedStoryRecord.timestamp();
        }
    }

    public final FeatureType featureType() {
        return this.featureType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003) ^ this.featureType.hashCode()) * 1000003;
        long j2 = this.timestamp;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DiscoverFeedStoryRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", featureType=");
        stringBuilder.append(this.featureType);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
