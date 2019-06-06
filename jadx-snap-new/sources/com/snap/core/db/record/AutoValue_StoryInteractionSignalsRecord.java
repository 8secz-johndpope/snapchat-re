package com.snap.core.db.record;

final class AutoValue_StoryInteractionSignalsRecord extends StoryInteractionSignalsRecord {
    private final long _id;
    private final long corpus;
    private final boolean isHidden;
    private final boolean isSubscribed;
    private final long lastFavoriteTimestampSecs;
    private final long lastHideTimestampSecs;
    private final long lastLongImpressionVersion;
    private final long lastLongViewVersion;
    private final long lastStoryLengthSeconds;
    private final long lastUnfavoriteTimestampSecs;
    private final long lastUpdatedTimestampSecs;
    private final long lastVersionLongImpressionCount;
    private final long lastViewNumSnapsInStory;
    private final long lastViewVersion;
    private final long lastWatchedIndex;
    private final double longImpressionsScore;
    private final long longImpressionsScoreTimestampSecs;
    private final long longViewTapStoryKey;
    private final double longViewsScore;
    private final long longViewsScoreTimestampSecs;
    private final double maxSnapCompletionPercent;
    private final double maxTotalTimeWatched;
    private final long numSnapsViewedFromLatestVersion;
    private final double numSnapsViewedScore;
    private final long numSnapsViewedScoreTimestampSecs;
    private final long numWatches;
    private final double qualifiedLongImpressionScore;
    private final long qualifiedLongImpressionScoreTimestampSecs;
    private final double shortImpressionScore;
    private final long shortImpressionScoreTimestampSecs;
    private final double shortViewsScore;
    private final long shortViewsScoreTimestampSecs;
    private final String storyId;
    private final long tapStoryKey;
    private final double totalImpressionTime;
    private final double totalImpressionTimeScore;
    private final long totalImpressionTimeScoreTimestampSecs;
    private final double totalWatchTimeScore;
    private final long totalWatchTimeScoreTimestampSecs;

    AutoValue_StoryInteractionSignalsRecord(long j, String str, long j2, long j3, long j4, long j5, double d, long j6, double d2, long j7, long j8, double d3, long j9, double d4, long j10, long j11, double d5, long j12, long j13, long j14, long j15, long j16, double d6, double d7, long j17, long j18, boolean z, boolean z2, long j19, long j20, long j21, double d8, double d9, long j22, double d10, long j23, double d11, long j24, long j25) {
        String str2 = str;
        this._id = j;
        if (str2 != null) {
            this.storyId = str2;
            this.corpus = j2;
            this.lastFavoriteTimestampSecs = j3;
            this.lastUnfavoriteTimestampSecs = j4;
            this.lastHideTimestampSecs = j5;
            this.shortViewsScore = d;
            this.shortViewsScoreTimestampSecs = j6;
            this.longViewsScore = d2;
            this.longViewsScoreTimestampSecs = j7;
            this.lastLongViewVersion = j8;
            this.shortImpressionScore = d3;
            this.shortImpressionScoreTimestampSecs = j9;
            this.longImpressionsScore = d4;
            this.longImpressionsScoreTimestampSecs = j10;
            this.lastLongImpressionVersion = j11;
            this.qualifiedLongImpressionScore = d5;
            this.qualifiedLongImpressionScoreTimestampSecs = j12;
            this.longViewTapStoryKey = j13;
            this.tapStoryKey = j14;
            this.lastViewVersion = j15;
            this.numWatches = j16;
            this.maxSnapCompletionPercent = d6;
            this.maxTotalTimeWatched = d7;
            this.lastViewNumSnapsInStory = j17;
            this.lastStoryLengthSeconds = j18;
            this.isSubscribed = z;
            this.isHidden = z2;
            this.lastVersionLongImpressionCount = j19;
            this.lastWatchedIndex = j20;
            this.numSnapsViewedFromLatestVersion = j21;
            this.totalImpressionTime = d8;
            this.numSnapsViewedScore = d9;
            this.numSnapsViewedScoreTimestampSecs = j22;
            this.totalWatchTimeScore = d10;
            this.totalWatchTimeScoreTimestampSecs = j23;
            this.totalImpressionTimeScore = d11;
            this.totalImpressionTimeScoreTimestampSecs = j24;
            this.lastUpdatedTimestampSecs = j25;
            return;
        }
        throw new NullPointerException("Null storyId");
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
        if (obj instanceof StoryInteractionSignalsRecord) {
            StoryInteractionSignalsRecord storyInteractionSignalsRecord = (StoryInteractionSignalsRecord) obj;
            return this._id == storyInteractionSignalsRecord._id() && this.storyId.equals(storyInteractionSignalsRecord.storyId()) && this.corpus == storyInteractionSignalsRecord.corpus() && this.lastFavoriteTimestampSecs == storyInteractionSignalsRecord.lastFavoriteTimestampSecs() && this.lastUnfavoriteTimestampSecs == storyInteractionSignalsRecord.lastUnfavoriteTimestampSecs() && this.lastHideTimestampSecs == storyInteractionSignalsRecord.lastHideTimestampSecs() && Double.doubleToLongBits(this.shortViewsScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.shortViewsScore()) && this.shortViewsScoreTimestampSecs == storyInteractionSignalsRecord.shortViewsScoreTimestampSecs() && Double.doubleToLongBits(this.longViewsScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.longViewsScore()) && this.longViewsScoreTimestampSecs == storyInteractionSignalsRecord.longViewsScoreTimestampSecs() && this.lastLongViewVersion == storyInteractionSignalsRecord.lastLongViewVersion() && Double.doubleToLongBits(this.shortImpressionScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.shortImpressionScore()) && this.shortImpressionScoreTimestampSecs == storyInteractionSignalsRecord.shortImpressionScoreTimestampSecs() && Double.doubleToLongBits(this.longImpressionsScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.longImpressionsScore()) && this.longImpressionsScoreTimestampSecs == storyInteractionSignalsRecord.longImpressionsScoreTimestampSecs() && this.lastLongImpressionVersion == storyInteractionSignalsRecord.lastLongImpressionVersion() && Double.doubleToLongBits(this.qualifiedLongImpressionScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.qualifiedLongImpressionScore()) && this.qualifiedLongImpressionScoreTimestampSecs == storyInteractionSignalsRecord.qualifiedLongImpressionScoreTimestampSecs() && this.longViewTapStoryKey == storyInteractionSignalsRecord.longViewTapStoryKey() && this.tapStoryKey == storyInteractionSignalsRecord.tapStoryKey() && this.lastViewVersion == storyInteractionSignalsRecord.lastViewVersion() && this.numWatches == storyInteractionSignalsRecord.numWatches() && Double.doubleToLongBits(this.maxSnapCompletionPercent) == Double.doubleToLongBits(storyInteractionSignalsRecord.maxSnapCompletionPercent()) && Double.doubleToLongBits(this.maxTotalTimeWatched) == Double.doubleToLongBits(storyInteractionSignalsRecord.maxTotalTimeWatched()) && this.lastViewNumSnapsInStory == storyInteractionSignalsRecord.lastViewNumSnapsInStory() && this.lastStoryLengthSeconds == storyInteractionSignalsRecord.lastStoryLengthSeconds() && this.isSubscribed == storyInteractionSignalsRecord.isSubscribed() && this.isHidden == storyInteractionSignalsRecord.isHidden() && this.lastVersionLongImpressionCount == storyInteractionSignalsRecord.lastVersionLongImpressionCount() && this.lastWatchedIndex == storyInteractionSignalsRecord.lastWatchedIndex() && this.numSnapsViewedFromLatestVersion == storyInteractionSignalsRecord.numSnapsViewedFromLatestVersion() && Double.doubleToLongBits(this.totalImpressionTime) == Double.doubleToLongBits(storyInteractionSignalsRecord.totalImpressionTime()) && Double.doubleToLongBits(this.numSnapsViewedScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.numSnapsViewedScore()) && this.numSnapsViewedScoreTimestampSecs == storyInteractionSignalsRecord.numSnapsViewedScoreTimestampSecs() && Double.doubleToLongBits(this.totalWatchTimeScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.totalWatchTimeScore()) && this.totalWatchTimeScoreTimestampSecs == storyInteractionSignalsRecord.totalWatchTimeScoreTimestampSecs() && Double.doubleToLongBits(this.totalImpressionTimeScore) == Double.doubleToLongBits(storyInteractionSignalsRecord.totalImpressionTimeScore()) && this.totalImpressionTimeScoreTimestampSecs == storyInteractionSignalsRecord.totalImpressionTimeScoreTimestampSecs() && this.lastUpdatedTimestampSecs == storyInteractionSignalsRecord.lastUpdatedTimestampSecs();
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        long j2 = this.corpus;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastFavoriteTimestampSecs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastUnfavoriteTimestampSecs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastHideTimestampSecs;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.shortViewsScore) >>> 32) ^ Double.doubleToLongBits(this.shortViewsScore)))) * 1000003;
        j2 = this.shortViewsScoreTimestampSecs;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.longViewsScore) >>> 32) ^ Double.doubleToLongBits(this.longViewsScore)))) * 1000003;
        j2 = this.longViewsScoreTimestampSecs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastLongViewVersion;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.shortImpressionScore) >>> 32) ^ Double.doubleToLongBits(this.shortImpressionScore)))) * 1000003;
        j2 = this.shortImpressionScoreTimestampSecs;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.longImpressionsScore) >>> 32) ^ Double.doubleToLongBits(this.longImpressionsScore)))) * 1000003;
        j2 = this.longImpressionsScoreTimestampSecs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastLongImpressionVersion;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.qualifiedLongImpressionScore) >>> 32) ^ Double.doubleToLongBits(this.qualifiedLongImpressionScore)))) * 1000003;
        j2 = this.qualifiedLongImpressionScoreTimestampSecs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.longViewTapStoryKey;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.tapStoryKey;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastViewVersion;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.numWatches;
        hashCode = (((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.maxSnapCompletionPercent) >>> 32) ^ Double.doubleToLongBits(this.maxSnapCompletionPercent)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.maxTotalTimeWatched) >>> 32) ^ Double.doubleToLongBits(this.maxTotalTimeWatched)))) * 1000003;
        j2 = this.lastViewNumSnapsInStory;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastStoryLengthSeconds;
        int i = 1231;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.isSubscribed ? 1231 : 1237)) * 1000003;
        if (!this.isHidden) {
            i = 1237;
        }
        hashCode = (hashCode ^ i) * 1000003;
        j2 = this.lastVersionLongImpressionCount;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastWatchedIndex;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.numSnapsViewedFromLatestVersion;
        hashCode = (((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.totalImpressionTime) >>> 32) ^ Double.doubleToLongBits(this.totalImpressionTime)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.numSnapsViewedScore) >>> 32) ^ Double.doubleToLongBits(this.numSnapsViewedScore)))) * 1000003;
        j2 = this.numSnapsViewedScoreTimestampSecs;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.totalWatchTimeScore) >>> 32) ^ Double.doubleToLongBits(this.totalWatchTimeScore)))) * 1000003;
        j2 = this.totalWatchTimeScoreTimestampSecs;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.totalImpressionTimeScore) >>> 32) ^ Double.doubleToLongBits(this.totalImpressionTimeScore)))) * 1000003;
        j2 = this.totalImpressionTimeScoreTimestampSecs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.lastUpdatedTimestampSecs;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    public final long lastFavoriteTimestampSecs() {
        return this.lastFavoriteTimestampSecs;
    }

    public final long lastHideTimestampSecs() {
        return this.lastHideTimestampSecs;
    }

    public final long lastLongImpressionVersion() {
        return this.lastLongImpressionVersion;
    }

    public final long lastLongViewVersion() {
        return this.lastLongViewVersion;
    }

    public final long lastStoryLengthSeconds() {
        return this.lastStoryLengthSeconds;
    }

    public final long lastUnfavoriteTimestampSecs() {
        return this.lastUnfavoriteTimestampSecs;
    }

    public final long lastUpdatedTimestampSecs() {
        return this.lastUpdatedTimestampSecs;
    }

    public final long lastVersionLongImpressionCount() {
        return this.lastVersionLongImpressionCount;
    }

    public final long lastViewNumSnapsInStory() {
        return this.lastViewNumSnapsInStory;
    }

    public final long lastViewVersion() {
        return this.lastViewVersion;
    }

    public final long lastWatchedIndex() {
        return this.lastWatchedIndex;
    }

    public final double longImpressionsScore() {
        return this.longImpressionsScore;
    }

    public final long longImpressionsScoreTimestampSecs() {
        return this.longImpressionsScoreTimestampSecs;
    }

    public final long longViewTapStoryKey() {
        return this.longViewTapStoryKey;
    }

    public final double longViewsScore() {
        return this.longViewsScore;
    }

    public final long longViewsScoreTimestampSecs() {
        return this.longViewsScoreTimestampSecs;
    }

    public final double maxSnapCompletionPercent() {
        return this.maxSnapCompletionPercent;
    }

    public final double maxTotalTimeWatched() {
        return this.maxTotalTimeWatched;
    }

    public final long numSnapsViewedFromLatestVersion() {
        return this.numSnapsViewedFromLatestVersion;
    }

    public final double numSnapsViewedScore() {
        return this.numSnapsViewedScore;
    }

    public final long numSnapsViewedScoreTimestampSecs() {
        return this.numSnapsViewedScoreTimestampSecs;
    }

    public final long numWatches() {
        return this.numWatches;
    }

    public final double qualifiedLongImpressionScore() {
        return this.qualifiedLongImpressionScore;
    }

    public final long qualifiedLongImpressionScoreTimestampSecs() {
        return this.qualifiedLongImpressionScoreTimestampSecs;
    }

    public final double shortImpressionScore() {
        return this.shortImpressionScore;
    }

    public final long shortImpressionScoreTimestampSecs() {
        return this.shortImpressionScoreTimestampSecs;
    }

    public final double shortViewsScore() {
        return this.shortViewsScore;
    }

    public final long shortViewsScoreTimestampSecs() {
        return this.shortViewsScoreTimestampSecs;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long tapStoryKey() {
        return this.tapStoryKey;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoryInteractionSignalsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", corpus=");
        stringBuilder.append(this.corpus);
        stringBuilder.append(", lastFavoriteTimestampSecs=");
        stringBuilder.append(this.lastFavoriteTimestampSecs);
        stringBuilder.append(", lastUnfavoriteTimestampSecs=");
        stringBuilder.append(this.lastUnfavoriteTimestampSecs);
        stringBuilder.append(", lastHideTimestampSecs=");
        stringBuilder.append(this.lastHideTimestampSecs);
        stringBuilder.append(", shortViewsScore=");
        stringBuilder.append(this.shortViewsScore);
        stringBuilder.append(", shortViewsScoreTimestampSecs=");
        stringBuilder.append(this.shortViewsScoreTimestampSecs);
        stringBuilder.append(", longViewsScore=");
        stringBuilder.append(this.longViewsScore);
        stringBuilder.append(", longViewsScoreTimestampSecs=");
        stringBuilder.append(this.longViewsScoreTimestampSecs);
        stringBuilder.append(", lastLongViewVersion=");
        stringBuilder.append(this.lastLongViewVersion);
        stringBuilder.append(", shortImpressionScore=");
        stringBuilder.append(this.shortImpressionScore);
        stringBuilder.append(", shortImpressionScoreTimestampSecs=");
        stringBuilder.append(this.shortImpressionScoreTimestampSecs);
        stringBuilder.append(", longImpressionsScore=");
        stringBuilder.append(this.longImpressionsScore);
        stringBuilder.append(", longImpressionsScoreTimestampSecs=");
        stringBuilder.append(this.longImpressionsScoreTimestampSecs);
        stringBuilder.append(", lastLongImpressionVersion=");
        stringBuilder.append(this.lastLongImpressionVersion);
        stringBuilder.append(", qualifiedLongImpressionScore=");
        stringBuilder.append(this.qualifiedLongImpressionScore);
        stringBuilder.append(", qualifiedLongImpressionScoreTimestampSecs=");
        stringBuilder.append(this.qualifiedLongImpressionScoreTimestampSecs);
        stringBuilder.append(", longViewTapStoryKey=");
        stringBuilder.append(this.longViewTapStoryKey);
        stringBuilder.append(", tapStoryKey=");
        stringBuilder.append(this.tapStoryKey);
        stringBuilder.append(", lastViewVersion=");
        stringBuilder.append(this.lastViewVersion);
        stringBuilder.append(", numWatches=");
        stringBuilder.append(this.numWatches);
        stringBuilder.append(", maxSnapCompletionPercent=");
        stringBuilder.append(this.maxSnapCompletionPercent);
        stringBuilder.append(", maxTotalTimeWatched=");
        stringBuilder.append(this.maxTotalTimeWatched);
        stringBuilder.append(", lastViewNumSnapsInStory=");
        stringBuilder.append(this.lastViewNumSnapsInStory);
        stringBuilder.append(", lastStoryLengthSeconds=");
        stringBuilder.append(this.lastStoryLengthSeconds);
        stringBuilder.append(", isSubscribed=");
        stringBuilder.append(this.isSubscribed);
        stringBuilder.append(", isHidden=");
        stringBuilder.append(this.isHidden);
        stringBuilder.append(", lastVersionLongImpressionCount=");
        stringBuilder.append(this.lastVersionLongImpressionCount);
        stringBuilder.append(", lastWatchedIndex=");
        stringBuilder.append(this.lastWatchedIndex);
        stringBuilder.append(", numSnapsViewedFromLatestVersion=");
        stringBuilder.append(this.numSnapsViewedFromLatestVersion);
        stringBuilder.append(", totalImpressionTime=");
        stringBuilder.append(this.totalImpressionTime);
        stringBuilder.append(", numSnapsViewedScore=");
        stringBuilder.append(this.numSnapsViewedScore);
        stringBuilder.append(", numSnapsViewedScoreTimestampSecs=");
        stringBuilder.append(this.numSnapsViewedScoreTimestampSecs);
        stringBuilder.append(", totalWatchTimeScore=");
        stringBuilder.append(this.totalWatchTimeScore);
        stringBuilder.append(", totalWatchTimeScoreTimestampSecs=");
        stringBuilder.append(this.totalWatchTimeScoreTimestampSecs);
        stringBuilder.append(", totalImpressionTimeScore=");
        stringBuilder.append(this.totalImpressionTimeScore);
        stringBuilder.append(", totalImpressionTimeScoreTimestampSecs=");
        stringBuilder.append(this.totalImpressionTimeScoreTimestampSecs);
        stringBuilder.append(", lastUpdatedTimestampSecs=");
        stringBuilder.append(this.lastUpdatedTimestampSecs);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final double totalImpressionTime() {
        return this.totalImpressionTime;
    }

    public final double totalImpressionTimeScore() {
        return this.totalImpressionTimeScore;
    }

    public final long totalImpressionTimeScoreTimestampSecs() {
        return this.totalImpressionTimeScoreTimestampSecs;
    }

    public final double totalWatchTimeScore() {
        return this.totalWatchTimeScore;
    }

    public final long totalWatchTimeScoreTimestampSecs() {
        return this.totalWatchTimeScoreTimestampSecs;
    }
}
