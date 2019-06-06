package com.snap.core.db.record;

import com.snap.core.db.record.StoryInteractionSignalsRecord.CorpusInteractionFeaturesRecord;

final class AutoValue_StoryInteractionSignalsRecord_CorpusInteractionFeaturesRecord extends CorpusInteractionFeaturesRecord {
    private final long corpus;
    private final long numHides;
    private final long numSubscribes;
    private final double sumLongImpressionScore;
    private final double sumLongViewsScore;
    private final double sumShortImpressionScore;
    private final double sumShortViewsScore;

    AutoValue_StoryInteractionSignalsRecord_CorpusInteractionFeaturesRecord(long j, double d, double d2, double d3, double d4, long j2, long j3) {
        this.corpus = j;
        this.sumLongImpressionScore = d;
        this.sumShortImpressionScore = d2;
        this.sumLongViewsScore = d3;
        this.sumShortViewsScore = d4;
        this.numHides = j2;
        this.numSubscribes = j3;
    }

    public final long corpus() {
        return this.corpus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CorpusInteractionFeaturesRecord) {
            CorpusInteractionFeaturesRecord corpusInteractionFeaturesRecord = (CorpusInteractionFeaturesRecord) obj;
            return this.corpus == corpusInteractionFeaturesRecord.corpus() && Double.doubleToLongBits(this.sumLongImpressionScore) == Double.doubleToLongBits(corpusInteractionFeaturesRecord.sumLongImpressionScore()) && Double.doubleToLongBits(this.sumShortImpressionScore) == Double.doubleToLongBits(corpusInteractionFeaturesRecord.sumShortImpressionScore()) && Double.doubleToLongBits(this.sumLongViewsScore) == Double.doubleToLongBits(corpusInteractionFeaturesRecord.sumLongViewsScore()) && Double.doubleToLongBits(this.sumShortViewsScore) == Double.doubleToLongBits(corpusInteractionFeaturesRecord.sumShortViewsScore()) && this.numHides == corpusInteractionFeaturesRecord.numHides() && this.numSubscribes == corpusInteractionFeaturesRecord.numSubscribes();
        }
    }

    public final int hashCode() {
        long j = this.corpus;
        int doubleToLongBits = (((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.sumLongImpressionScore) >>> 32) ^ Double.doubleToLongBits(this.sumLongImpressionScore)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.sumShortImpressionScore) >>> 32) ^ Double.doubleToLongBits(this.sumShortImpressionScore)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.sumLongViewsScore) >>> 32) ^ Double.doubleToLongBits(this.sumLongViewsScore)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.sumShortViewsScore) >>> 32) ^ Double.doubleToLongBits(this.sumShortViewsScore)))) * 1000003;
        long j2 = this.numHides;
        doubleToLongBits = (doubleToLongBits ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.numSubscribes;
        return ((int) (j2 ^ (j2 >>> 32))) ^ doubleToLongBits;
    }

    public final long numHides() {
        return this.numHides;
    }

    public final long numSubscribes() {
        return this.numSubscribes;
    }

    public final double sumLongImpressionScore() {
        return this.sumLongImpressionScore;
    }

    public final double sumLongViewsScore() {
        return this.sumLongViewsScore;
    }

    public final double sumShortImpressionScore() {
        return this.sumShortImpressionScore;
    }

    public final double sumShortViewsScore() {
        return this.sumShortViewsScore;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CorpusInteractionFeaturesRecord{corpus=");
        stringBuilder.append(this.corpus);
        stringBuilder.append(", sumLongImpressionScore=");
        stringBuilder.append(this.sumLongImpressionScore);
        stringBuilder.append(", sumShortImpressionScore=");
        stringBuilder.append(this.sumShortImpressionScore);
        stringBuilder.append(", sumLongViewsScore=");
        stringBuilder.append(this.sumLongViewsScore);
        stringBuilder.append(", sumShortViewsScore=");
        stringBuilder.append(this.sumShortViewsScore);
        stringBuilder.append(", numHides=");
        stringBuilder.append(this.numHides);
        stringBuilder.append(", numSubscribes=");
        stringBuilder.append(this.numSubscribes);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
