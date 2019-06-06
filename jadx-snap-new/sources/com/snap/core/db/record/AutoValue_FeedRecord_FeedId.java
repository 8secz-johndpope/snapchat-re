package com.snap.core.db.record;

import com.snap.core.db.record.FeedRecord.FeedId;

final class AutoValue_FeedRecord_FeedId extends FeedId {
    private final long _id;
    private final String key;

    AutoValue_FeedRecord_FeedId(long j, String str) {
        this._id = j;
        if (str != null) {
            this.key = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeedId) {
            FeedId feedId = (FeedId) obj;
            return this._id == feedId._id() && this.key.equals(feedId.key());
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.key.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedId{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
