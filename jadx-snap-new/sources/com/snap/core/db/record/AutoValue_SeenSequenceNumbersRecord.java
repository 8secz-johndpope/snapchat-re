package com.snap.core.db.record;

import com.snap.core.db.column.FeedSeenSequenceNumbers;

final class AutoValue_SeenSequenceNumbersRecord extends SeenSequenceNumbersRecord {
    private final long _id;
    private final long feedRowId;
    private final FeedSeenSequenceNumbers sequenceNumbers;

    AutoValue_SeenSequenceNumbersRecord(long j, long j2, FeedSeenSequenceNumbers feedSeenSequenceNumbers) {
        this._id = j;
        this.feedRowId = j2;
        this.sequenceNumbers = feedSeenSequenceNumbers;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeenSequenceNumbersRecord) {
            SeenSequenceNumbersRecord seenSequenceNumbersRecord = (SeenSequenceNumbersRecord) obj;
            if (this._id == seenSequenceNumbersRecord._id() && this.feedRowId == seenSequenceNumbersRecord.feedRowId()) {
                FeedSeenSequenceNumbers feedSeenSequenceNumbers = this.sequenceNumbers;
                return feedSeenSequenceNumbers != null ? !feedSeenSequenceNumbers.equals(seenSequenceNumbersRecord.sequenceNumbers()) : seenSequenceNumbersRecord.sequenceNumbers() != null;
            }
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.feedRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        FeedSeenSequenceNumbers feedSeenSequenceNumbers = this.sequenceNumbers;
        return (feedSeenSequenceNumbers == null ? 0 : feedSeenSequenceNumbers.hashCode()) ^ i;
    }

    public final FeedSeenSequenceNumbers sequenceNumbers() {
        return this.sequenceNumbers;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SeenSequenceNumbersRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", sequenceNumbers=");
        stringBuilder.append(this.sequenceNumbers);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
