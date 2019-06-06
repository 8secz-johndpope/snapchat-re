package com.looksery.sdk.domain;

public class LensAnalyticsData {
    private long mLastUpdateDate;
    private String mLensId;
    private int mSnapReceivedCount;
    private int mSnapSavedCount;
    private int mSnapSentCount;
    private int mStoryPostedCount;

    public LensAnalyticsData(String str) {
        this.mLensId = str;
    }

    public void addRecipientsCount(int i) {
        this.mSnapReceivedCount += i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LensAnalyticsData lensAnalyticsData = (LensAnalyticsData) obj;
            if (this.mLastUpdateDate != lensAnalyticsData.mLastUpdateDate || this.mSnapSentCount != lensAnalyticsData.mSnapSentCount || this.mSnapSavedCount != lensAnalyticsData.mSnapSavedCount || this.mSnapReceivedCount != lensAnalyticsData.mSnapReceivedCount || this.mStoryPostedCount != lensAnalyticsData.mStoryPostedCount) {
                return false;
            }
            String str = this.mLensId;
            if (str != null) {
                return str.equals(lensAnalyticsData.mLensId);
            }
            if (lensAnalyticsData.mLensId == null) {
                return true;
            }
        }
        return false;
    }

    public long getLastUpdateDate() {
        return this.mLastUpdateDate;
    }

    public String getLensId() {
        return this.mLensId;
    }

    public int getSnapReceivedCount() {
        return this.mSnapReceivedCount;
    }

    public int getSnapSavedCount() {
        return this.mSnapSavedCount;
    }

    public int getSnapSentCount() {
        return this.mSnapSentCount;
    }

    public int getStoryPostedCount() {
        return this.mStoryPostedCount;
    }

    public int hashCode() {
        String str = this.mLensId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.mLastUpdateDate;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.mSnapSentCount) * 31) + this.mSnapSavedCount) * 31) + this.mSnapReceivedCount) * 31) + this.mStoryPostedCount;
    }

    public void incSnapSavedCount() {
        this.mSnapSavedCount++;
    }

    public void incSnapSentCount() {
        this.mSnapSentCount++;
    }

    public void incStorySnapPosted() {
        this.mStoryPostedCount++;
    }

    public void setLastUpdateDate(long j) {
        this.mLastUpdateDate = j;
    }

    public void setLensId(String str) {
        this.mLensId = str;
    }

    public void setSnapReceivedCount(int i) {
        this.mSnapReceivedCount = i;
    }

    public void setSnapSavedCount(int i) {
        this.mSnapSavedCount = i;
    }

    public void setSnapSentCount(int i) {
        this.mSnapSentCount = i;
    }

    public void setStoryPostedCount(int i) {
        this.mStoryPostedCount = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensAnalyticsData{mGetLensId='");
        stringBuilder.append(this.mLensId);
        stringBuilder.append('\'');
        stringBuilder.append(", mLastUpdateDate=");
        stringBuilder.append(this.mLastUpdateDate);
        stringBuilder.append(", mSnapSentCount=");
        stringBuilder.append(this.mSnapSentCount);
        stringBuilder.append(", mSnapSavedCount=");
        stringBuilder.append(this.mSnapSavedCount);
        stringBuilder.append(", mSnapReceivedCount=");
        stringBuilder.append(this.mSnapReceivedCount);
        stringBuilder.append(", mStoryPostedCount=");
        stringBuilder.append(this.mStoryPostedCount);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
