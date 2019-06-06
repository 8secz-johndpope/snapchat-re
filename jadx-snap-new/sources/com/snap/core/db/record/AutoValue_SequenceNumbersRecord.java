package com.snap.core.db.record;

final class AutoValue_SequenceNumbersRecord extends SequenceNumbersRecord {
    private final long _id;
    private final long feedRowId;
    private final Long processedEarliest;
    private final Long processedLatest;
    private final Long serverEarliest;
    private final Long serverLatest;
    private final Long updateNumber;
    private final String username;

    AutoValue_SequenceNumbersRecord(long j, long j2, String str, Long l, Long l2, Long l3, Long l4, Long l5) {
        this._id = j;
        this.feedRowId = j2;
        if (str != null) {
            this.username = str;
            this.serverLatest = l;
            this.serverEarliest = l2;
            this.processedLatest = l3;
            this.processedEarliest = l4;
            this.updateNumber = l5;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SequenceNumbersRecord) {
            SequenceNumbersRecord sequenceNumbersRecord = (SequenceNumbersRecord) obj;
            if (this._id == sequenceNumbersRecord._id() && this.feedRowId == sequenceNumbersRecord.feedRowId() && this.username.equals(sequenceNumbersRecord.username())) {
                Long l = this.serverLatest;
                if (l != null ? !l.equals(sequenceNumbersRecord.serverLatest()) : sequenceNumbersRecord.serverLatest() != null) {
                    l = this.serverEarliest;
                    if (l != null ? !l.equals(sequenceNumbersRecord.serverEarliest()) : sequenceNumbersRecord.serverEarliest() != null) {
                        l = this.processedLatest;
                        if (l != null ? !l.equals(sequenceNumbersRecord.processedLatest()) : sequenceNumbersRecord.processedLatest() != null) {
                            l = this.processedEarliest;
                            if (l != null ? !l.equals(sequenceNumbersRecord.processedEarliest()) : sequenceNumbersRecord.processedEarliest() != null) {
                                l = this.updateNumber;
                                return l != null ? !l.equals(sequenceNumbersRecord.updateNumber()) : sequenceNumbersRecord.updateNumber() != null;
                            }
                        }
                    }
                }
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
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.username.hashCode()) * 1000003;
        Long l = this.serverLatest;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.serverEarliest;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.processedLatest;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.processedEarliest;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.updateNumber;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final Long processedEarliest() {
        return this.processedEarliest;
    }

    public final Long processedLatest() {
        return this.processedLatest;
    }

    public final Long serverEarliest() {
        return this.serverEarliest;
    }

    public final Long serverLatest() {
        return this.serverLatest;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SequenceNumbersRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", serverLatest=");
        stringBuilder.append(this.serverLatest);
        stringBuilder.append(", serverEarliest=");
        stringBuilder.append(this.serverEarliest);
        stringBuilder.append(", processedLatest=");
        stringBuilder.append(this.processedLatest);
        stringBuilder.append(", processedEarliest=");
        stringBuilder.append(this.processedEarliest);
        stringBuilder.append(", updateNumber=");
        stringBuilder.append(this.updateNumber);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Long updateNumber() {
        return this.updateNumber;
    }

    public final String username() {
        return this.username;
    }
}
