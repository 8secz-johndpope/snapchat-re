package com.snap.core.db.record;

final class AutoValue_FriendsFeedSharedSignalsRecord extends FriendsFeedSharedSignalsRecord {
    private final long _id;
    private final Float paginationPrevMinScore;
    private final Long previousFullRankingRunTimestamp;
    private final Long previousRankingRunTimestamp;
    private final String userSignals;

    AutoValue_FriendsFeedSharedSignalsRecord(long j, String str, Long l, Long l2, Float f) {
        this._id = j;
        this.userSignals = str;
        this.previousRankingRunTimestamp = l;
        this.previousFullRankingRunTimestamp = l2;
        this.paginationPrevMinScore = f;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendsFeedSharedSignalsRecord) {
            FriendsFeedSharedSignalsRecord friendsFeedSharedSignalsRecord = (FriendsFeedSharedSignalsRecord) obj;
            if (this._id == friendsFeedSharedSignalsRecord._id()) {
                String str = this.userSignals;
                if (str != null ? !str.equals(friendsFeedSharedSignalsRecord.userSignals()) : friendsFeedSharedSignalsRecord.userSignals() != null) {
                    Long l = this.previousRankingRunTimestamp;
                    if (l != null ? !l.equals(friendsFeedSharedSignalsRecord.previousRankingRunTimestamp()) : friendsFeedSharedSignalsRecord.previousRankingRunTimestamp() != null) {
                        l = this.previousFullRankingRunTimestamp;
                        if (l != null ? !l.equals(friendsFeedSharedSignalsRecord.previousFullRankingRunTimestamp()) : friendsFeedSharedSignalsRecord.previousFullRankingRunTimestamp() != null) {
                            Float f = this.paginationPrevMinScore;
                            return f != null ? !f.equals(friendsFeedSharedSignalsRecord.paginationPrevMinScore()) : friendsFeedSharedSignalsRecord.paginationPrevMinScore() != null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.userSignals;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.previousRankingRunTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.previousFullRankingRunTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Float f = this.paginationPrevMinScore;
        if (f != null) {
            i2 = f.hashCode();
        }
        return i ^ i2;
    }

    public final Float paginationPrevMinScore() {
        return this.paginationPrevMinScore;
    }

    public final Long previousFullRankingRunTimestamp() {
        return this.previousFullRankingRunTimestamp;
    }

    public final Long previousRankingRunTimestamp() {
        return this.previousRankingRunTimestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsFeedSharedSignalsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", userSignals=");
        stringBuilder.append(this.userSignals);
        stringBuilder.append(", previousRankingRunTimestamp=");
        stringBuilder.append(this.previousRankingRunTimestamp);
        stringBuilder.append(", previousFullRankingRunTimestamp=");
        stringBuilder.append(this.previousFullRankingRunTimestamp);
        stringBuilder.append(", paginationPrevMinScore=");
        stringBuilder.append(this.paginationPrevMinScore);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userSignals() {
        return this.userSignals;
    }
}
