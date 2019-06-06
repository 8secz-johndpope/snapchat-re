package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.SequenceNumbersRecord.ForDelta;

final class AutoValue_SequenceNumbersRecord_ForDelta extends ForDelta {
    private final SequenceNumbersRecord SequenceNumbers;
    private final long _id;
    private final FeedKind feedKind;
    private final String key;

    AutoValue_SequenceNumbersRecord_ForDelta(long j, String str, FeedKind feedKind, SequenceNumbersRecord sequenceNumbersRecord) {
        this._id = j;
        if (str != null) {
            this.key = str;
            if (feedKind != null) {
                this.feedKind = feedKind;
                if (sequenceNumbersRecord != null) {
                    this.SequenceNumbers = sequenceNumbersRecord;
                    return;
                }
                throw new NullPointerException("Null SequenceNumbers");
            }
            throw new NullPointerException("Null feedKind");
        }
        throw new NullPointerException("Null key");
    }

    public final SequenceNumbersRecord SequenceNumbers() {
        return this.SequenceNumbers;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ForDelta) {
            ForDelta forDelta = (ForDelta) obj;
            return this._id == forDelta._id() && this.key.equals(forDelta.key()) && this.feedKind.equals(forDelta.feedKind()) && this.SequenceNumbers.equals(forDelta.SequenceNumbers());
        }
    }

    public final FeedKind feedKind() {
        return this.feedKind;
    }

    public final int hashCode() {
        long j = this._id;
        return this.SequenceNumbers.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.feedKind.hashCode()) * 1000003);
    }

    public final String key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForDelta{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", feedKind=");
        stringBuilder.append(this.feedKind);
        stringBuilder.append(", SequenceNumbers=");
        stringBuilder.append(this.SequenceNumbers);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
