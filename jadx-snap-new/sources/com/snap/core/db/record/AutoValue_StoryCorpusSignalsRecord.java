package com.snap.core.db.record;

final class AutoValue_StoryCorpusSignalsRecord extends StoryCorpusSignalsRecord {
    private final long _id;
    private final long corpus;
    private final long numSnapsViewed;
    private final double totalImpressionTimeSeconds;
    private final double totalWatchTimeSeconds;

    AutoValue_StoryCorpusSignalsRecord(long j, long j2, long j3, double d, double d2) {
        this._id = j;
        this.corpus = j2;
        this.numSnapsViewed = j3;
        this.totalWatchTimeSeconds = d;
        this.totalImpressionTimeSeconds = d2;
    }

    public final long _id() {
        return this._id;
    }

    public final long corpus() {
        return this.corpus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StoryCorpusSignalsRecord) {
            StoryCorpusSignalsRecord storyCorpusSignalsRecord = (StoryCorpusSignalsRecord) obj;
            return this._id == storyCorpusSignalsRecord._id() && this.corpus == storyCorpusSignalsRecord.corpus() && this.numSnapsViewed == storyCorpusSignalsRecord.numSnapsViewed() && Double.doubleToLongBits(this.totalWatchTimeSeconds) == Double.doubleToLongBits(storyCorpusSignalsRecord.totalWatchTimeSeconds()) && Double.doubleToLongBits(this.totalImpressionTimeSeconds) == Double.doubleToLongBits(storyCorpusSignalsRecord.totalImpressionTimeSeconds());
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.corpus;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.numSnapsViewed;
        return ((int) ((Double.doubleToLongBits(this.totalImpressionTimeSeconds) >>> 32) ^ Double.doubleToLongBits(this.totalImpressionTimeSeconds))) ^ ((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.totalWatchTimeSeconds) >>> 32) ^ Double.doubleToLongBits(this.totalWatchTimeSeconds)))) * 1000003);
    }

    public final long numSnapsViewed() {
        return this.numSnapsViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoryCorpusSignalsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", corpus=");
        stringBuilder.append(this.corpus);
        stringBuilder.append(", numSnapsViewed=");
        stringBuilder.append(this.numSnapsViewed);
        stringBuilder.append(", totalWatchTimeSeconds=");
        stringBuilder.append(this.totalWatchTimeSeconds);
        stringBuilder.append(", totalImpressionTimeSeconds=");
        stringBuilder.append(this.totalImpressionTimeSeconds);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final double totalImpressionTimeSeconds() {
        return this.totalImpressionTimeSeconds;
    }

    public final double totalWatchTimeSeconds() {
        return this.totalWatchTimeSeconds;
    }
}
